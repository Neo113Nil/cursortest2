package com.facebook.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import com.facebook.CallbackManager;
import com.facebook.CustomTabMainActivity;
import com.facebook.FacebookActivity;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.NativeProtocol;
import defpackage.b4;
import defpackage.bb0;
import defpackage.c82;
import defpackage.ey;
import defpackage.h4;
import defpackage.i4;
import defpackage.in1;
import defpackage.w3;
import kotlin.Unit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class DialogPresenter {
    public static final DialogPresenter INSTANCE = new DialogPresenter();

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public interface ParameterProvider {
        Bundle getLegacyParameters();

        Bundle getParameters();
    }

    private DialogPresenter() {
    }

    public static final boolean canPresentNativeDialogWithFeature(DialogFeature dialogFeature) {
        dialogFeature.getClass();
        return getProtocolVersionForNativeDialog(dialogFeature).getProtocolVersion() != -1;
    }

    public static final boolean canPresentWebFallbackDialogWithFeature(DialogFeature dialogFeature) {
        dialogFeature.getClass();
        return INSTANCE.getDialogWebFallbackUri(dialogFeature) != null;
    }

    private final Uri getDialogWebFallbackUri(DialogFeature dialogFeature) {
        String name = dialogFeature.name();
        String action = dialogFeature.getAction();
        FetchedAppSettings.DialogFeatureConfig dialogFeatureConfig = FetchedAppSettings.Companion.getDialogFeatureConfig(FacebookSdk.getApplicationId(), action, name);
        if (dialogFeatureConfig != null) {
            return dialogFeatureConfig.getFallbackUrl();
        }
        return null;
    }

    public static final NativeProtocol.ProtocolVersionQueryResult getProtocolVersionForNativeDialog(DialogFeature dialogFeature) {
        dialogFeature.getClass();
        String applicationId = FacebookSdk.getApplicationId();
        String action = dialogFeature.getAction();
        return NativeProtocol.getLatestAvailableProtocolVersionForAction(action, INSTANCE.getVersionSpecForFeature(applicationId, action, dialogFeature));
    }

    private final int[] getVersionSpecForFeature(String str, String str2, DialogFeature dialogFeature) {
        int[] versionSpec;
        FetchedAppSettings.DialogFeatureConfig dialogFeatureConfig = FetchedAppSettings.Companion.getDialogFeatureConfig(str, str2, dialogFeature.name());
        return (dialogFeatureConfig == null || (versionSpec = dialogFeatureConfig.getVersionSpec()) == null) ? new int[]{dialogFeature.getMinVersion()} : versionSpec;
    }

    public static final void logDialogActivity(Context context, String str, String str2) {
        context.getClass();
        str.getClass();
        str2.getClass();
        InternalAppEventsLogger internalAppEventsLogger = new InternalAppEventsLogger(context);
        Bundle bundle = new Bundle();
        bundle.putString(AnalyticsEvents.PARAMETER_DIALOG_OUTCOME, str2);
        internalAppEventsLogger.logEventImplicitly(str, bundle);
    }

    public static final void present(AppCall appCall, i4 i4Var, CallbackManager callbackManager) {
        appCall.getClass();
        i4Var.getClass();
        Intent requestIntent = appCall.getRequestIntent();
        if (requestIntent == null) {
            return;
        }
        startActivityForResultWithAndroidX(i4Var, callbackManager, requestIntent, appCall.getRequestCode());
        appCall.setPending();
    }

    public static final void setupAppCallForCannotShowError(AppCall appCall) {
        appCall.getClass();
        setupAppCallForValidationError(appCall, new FacebookException("Unable to show the provided content via the web or the installed version of the Facebook app. Some dialogs are only supported starting API 14."));
    }

    public static final void setupAppCallForCustomTabDialog(AppCall appCall, String str, Bundle bundle) {
        appCall.getClass();
        Validate.hasCustomTabRedirectActivity(FacebookSdk.getApplicationContext(), CustomTabUtils.getDefaultRedirectURI());
        Validate.hasInternetPermissions(FacebookSdk.getApplicationContext());
        Intent intent = new Intent(FacebookSdk.getApplicationContext(), (Class<?>) CustomTabMainActivity.class);
        intent.putExtra(CustomTabMainActivity.EXTRA_ACTION, str);
        intent.putExtra(CustomTabMainActivity.EXTRA_PARAMS, bundle);
        intent.putExtra(CustomTabMainActivity.EXTRA_CHROME_PACKAGE, CustomTabUtils.getChromePackage());
        NativeProtocol.setupProtocolRequestIntent(intent, appCall.getCallId().toString(), str, NativeProtocol.getLatestKnownVersion(), null);
        appCall.setRequestIntent(intent);
    }

    public static final void setupAppCallForErrorResult(AppCall appCall, FacebookException facebookException) {
        appCall.getClass();
        if (facebookException == null) {
            return;
        }
        Validate.hasFacebookActivity(FacebookSdk.getApplicationContext());
        Intent intent = new Intent();
        intent.setClass(FacebookSdk.getApplicationContext(), FacebookActivity.class);
        intent.setAction(FacebookActivity.PASS_THROUGH_CANCEL_ACTION);
        NativeProtocol.setupProtocolRequestIntent(intent, appCall.getCallId().toString(), null, NativeProtocol.getLatestKnownVersion(), NativeProtocol.createBundleForException(facebookException));
        appCall.setRequestIntent(intent);
    }

    public static final void setupAppCallForNativeDialog(AppCall appCall, ParameterProvider parameterProvider, DialogFeature dialogFeature) {
        appCall.getClass();
        parameterProvider.getClass();
        dialogFeature.getClass();
        Context applicationContext = FacebookSdk.getApplicationContext();
        String action = dialogFeature.getAction();
        NativeProtocol.ProtocolVersionQueryResult protocolVersionForNativeDialog = getProtocolVersionForNativeDialog(dialogFeature);
        int protocolVersion = protocolVersionForNativeDialog.getProtocolVersion();
        if (protocolVersion == -1) {
            ey.i("Cannot present this dialog. This likely means that the Facebook app is not installed.");
            return;
        }
        Bundle parameters = NativeProtocol.isVersionCompatibleWithBucketedIntent(protocolVersion) ? parameterProvider.getParameters() : parameterProvider.getLegacyParameters();
        if (parameters == null) {
            parameters = new Bundle();
        }
        Intent createPlatformActivityIntent = NativeProtocol.createPlatformActivityIntent(applicationContext, appCall.getCallId().toString(), action, protocolVersionForNativeDialog, parameters);
        if (createPlatformActivityIntent != null) {
            appCall.setRequestIntent(createPlatformActivityIntent);
        } else {
            ey.i("Unable to create Intent; this likely means theFacebook app is not installed.");
        }
    }

    public static final void setupAppCallForValidationError(AppCall appCall, FacebookException facebookException) {
        appCall.getClass();
        setupAppCallForErrorResult(appCall, facebookException);
    }

    public static final void setupAppCallForWebDialog(AppCall appCall, String str, Bundle bundle) {
        appCall.getClass();
        Validate.hasFacebookActivity(FacebookSdk.getApplicationContext());
        Validate.hasInternetPermissions(FacebookSdk.getApplicationContext());
        Bundle bundle2 = new Bundle();
        bundle2.putString("action", str);
        bundle2.putBundle(NativeProtocol.WEB_DIALOG_PARAMS, bundle);
        Intent intent = new Intent();
        NativeProtocol.setupProtocolRequestIntent(intent, appCall.getCallId().toString(), str, NativeProtocol.getLatestKnownVersion(), bundle2);
        intent.setClass(FacebookSdk.getApplicationContext(), FacebookActivity.class);
        intent.setAction(FacebookDialogFragment.TAG);
        appCall.setRequestIntent(intent);
    }

    public static final void setupAppCallForWebFallbackDialog(AppCall appCall, Bundle bundle, DialogFeature dialogFeature) {
        appCall.getClass();
        dialogFeature.getClass();
        Validate.hasFacebookActivity(FacebookSdk.getApplicationContext());
        Validate.hasInternetPermissions(FacebookSdk.getApplicationContext());
        String name = dialogFeature.name();
        Uri dialogWebFallbackUri = INSTANCE.getDialogWebFallbackUri(dialogFeature);
        if (dialogWebFallbackUri == null) {
            throw new FacebookException("Unable to fetch the Url for the DialogFeature : '" + name + '\'');
        }
        int latestKnownVersion = NativeProtocol.getLatestKnownVersion();
        String uuid = appCall.getCallId().toString();
        uuid.getClass();
        Bundle queryParamsForPlatformActivityIntentWebFallback = ServerProtocol.getQueryParamsForPlatformActivityIntentWebFallback(uuid, latestKnownVersion, bundle);
        if (queryParamsForPlatformActivityIntentWebFallback == null) {
            ey.i("Unable to fetch the app's key-hash");
            return;
        }
        Uri buildUri = dialogWebFallbackUri.isRelative() ? Utility.buildUri(ServerProtocol.getDialogAuthority(), dialogWebFallbackUri.toString(), queryParamsForPlatformActivityIntentWebFallback) : Utility.buildUri(dialogWebFallbackUri.getAuthority(), dialogWebFallbackUri.getPath(), queryParamsForPlatformActivityIntentWebFallback);
        Bundle bundle2 = new Bundle();
        bundle2.putString("url", buildUri.toString());
        bundle2.putBoolean(NativeProtocol.WEB_DIALOG_IS_FALLBACK, true);
        Intent intent = new Intent();
        NativeProtocol.setupProtocolRequestIntent(intent, appCall.getCallId().toString(), dialogFeature.getAction(), NativeProtocol.getLatestKnownVersion(), bundle2);
        intent.setClass(FacebookSdk.getApplicationContext(), FacebookActivity.class);
        intent.setAction(FacebookDialogFragment.TAG);
        appCall.setRequestIntent(intent);
    }

    public static final void startActivityForResultWithAndroidX(i4 i4Var, CallbackManager callbackManager, Intent intent, int i) {
        i4Var.getClass();
        intent.getClass();
        c82 c82Var = new c82();
        h4 c = i4Var.c(in1.k(i, "facebook-dialog-request-"), new w3() { // from class: com.facebook.internal.DialogPresenter$startActivityForResultWithAndroidX$1
            @Override // defpackage.w3
            public Intent createIntent(Context context, Intent intent2) {
                context.getClass();
                intent2.getClass();
                return intent2;
            }

            @Override // defpackage.w3
            public Pair<Integer, Intent> parseResult(int i2, Intent intent2) {
                Pair<Integer, Intent> create = Pair.create(Integer.valueOf(i2), intent2);
                create.getClass();
                return create;
            }
        }, new bb0(callbackManager, i, c82Var));
        c82Var.m = c;
        c.b(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startActivityForResultWithAndroidX$lambda$2(CallbackManager callbackManager, int i, c82 c82Var, Pair pair) {
        c82Var.getClass();
        if (callbackManager == null) {
            callbackManager = new CallbackManagerImpl();
        }
        Object obj = pair.first;
        obj.getClass();
        callbackManager.onActivityResult(i, ((Number) obj).intValue(), (Intent) pair.second);
        b4 b4Var = (b4) c82Var.m;
        if (b4Var != null) {
            synchronized (b4Var) {
                b4Var.c();
                c82Var.m = null;
                Unit unit = Unit.a;
            }
        }
    }

    public static final void present(AppCall appCall, FragmentWrapper fragmentWrapper) {
        appCall.getClass();
        fragmentWrapper.getClass();
        fragmentWrapper.startActivityForResult(appCall.getRequestIntent(), appCall.getRequestCode());
        appCall.setPending();
    }

    public static final void present(AppCall appCall, Activity activity) {
        appCall.getClass();
        activity.getClass();
        activity.startActivityForResult(appCall.getRequestIntent(), appCall.getRequestCode());
        appCall.setPending();
    }
}
