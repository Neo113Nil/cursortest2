package com.facebook.internal;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.internal.FacebookDialogFragment;
import com.facebook.internal.FacebookWebFallbackDialog;
import com.facebook.internal.WebDialog;
import defpackage.kr0;
import defpackage.ta0;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class FacebookDialogFragment extends ta0 {
    public static final Companion Companion = new Companion(null);
    public static final String TAG = "FacebookDialogFragment";
    private Dialog innerDialog;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initDialog$lambda$0(FacebookDialogFragment facebookDialogFragment, Bundle bundle, FacebookException facebookException) {
        facebookDialogFragment.getClass();
        facebookDialogFragment.onCompleteWebDialog(bundle, facebookException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initDialog$lambda$1(FacebookDialogFragment facebookDialogFragment, Bundle bundle, FacebookException facebookException) {
        facebookDialogFragment.getClass();
        facebookDialogFragment.onCompleteWebFallbackDialog(bundle);
    }

    private final void onCompleteWebDialog(Bundle bundle, FacebookException facebookException) {
        kr0 activity = getActivity();
        if (activity == null) {
            return;
        }
        Intent intent = activity.getIntent();
        intent.getClass();
        activity.setResult(facebookException == null ? -1 : 0, NativeProtocol.createProtocolResultIntent(intent, bundle, facebookException));
        activity.finish();
    }

    private final void onCompleteWebFallbackDialog(Bundle bundle) {
        kr0 activity = getActivity();
        if (activity == null) {
            return;
        }
        Intent intent = new Intent();
        if (bundle == null) {
            bundle = new Bundle();
        }
        intent.putExtras(bundle);
        activity.setResult(-1, intent);
        activity.finish();
    }

    public final Dialog getInnerDialog() {
        return this.innerDialog;
    }

    public final void initDialog$facebook_common_release() {
        kr0 activity;
        WebDialog newInstance;
        if (this.innerDialog == null && (activity = getActivity()) != null) {
            Intent intent = activity.getIntent();
            intent.getClass();
            Bundle methodArgumentsFromIntent = NativeProtocol.getMethodArgumentsFromIntent(intent);
            final int i = 0;
            if (methodArgumentsFromIntent != null ? methodArgumentsFromIntent.getBoolean(NativeProtocol.WEB_DIALOG_IS_FALLBACK, false) : false) {
                String string = methodArgumentsFromIntent != null ? methodArgumentsFromIntent.getString("url") : null;
                if (Utility.isNullOrEmpty(string)) {
                    Utility.logd(TAG, "Cannot start a fallback WebDialog with an empty/missing 'url'");
                    activity.finish();
                    return;
                }
                final int i2 = 1;
                String format = String.format("fb%s://bridge/", Arrays.copyOf(new Object[]{FacebookSdk.getApplicationId()}, 1));
                FacebookWebFallbackDialog.Companion companion = FacebookWebFallbackDialog.Companion;
                string.getClass();
                newInstance = companion.newInstance(activity, string, format);
                newInstance.setOnCompleteListener(new WebDialog.OnCompleteListener(this) { // from class: bk0
                    public final /* synthetic */ FacebookDialogFragment b;

                    {
                        this.b = this;
                    }

                    @Override // com.facebook.internal.WebDialog.OnCompleteListener
                    public final void onComplete(Bundle bundle, FacebookException facebookException) {
                        int i3 = i2;
                        FacebookDialogFragment facebookDialogFragment = this.b;
                        switch (i3) {
                            case 0:
                                FacebookDialogFragment.initDialog$lambda$0(facebookDialogFragment, bundle, facebookException);
                                break;
                            default:
                                FacebookDialogFragment.initDialog$lambda$1(facebookDialogFragment, bundle, facebookException);
                                break;
                        }
                    }
                });
            } else {
                String string2 = methodArgumentsFromIntent != null ? methodArgumentsFromIntent.getString("action") : null;
                Bundle bundle = methodArgumentsFromIntent != null ? methodArgumentsFromIntent.getBundle(NativeProtocol.WEB_DIALOG_PARAMS) : null;
                if (Utility.isNullOrEmpty(string2)) {
                    Utility.logd(TAG, "Cannot start a WebDialog with an empty/missing 'actionName'");
                    activity.finish();
                    return;
                } else {
                    string2.getClass();
                    newInstance = new WebDialog.Builder(activity, string2, bundle).setOnCompleteListener(new WebDialog.OnCompleteListener(this) { // from class: bk0
                        public final /* synthetic */ FacebookDialogFragment b;

                        {
                            this.b = this;
                        }

                        @Override // com.facebook.internal.WebDialog.OnCompleteListener
                        public final void onComplete(Bundle bundle2, FacebookException facebookException) {
                            int i3 = i;
                            FacebookDialogFragment facebookDialogFragment = this.b;
                            switch (i3) {
                                case 0:
                                    FacebookDialogFragment.initDialog$lambda$0(facebookDialogFragment, bundle2, facebookException);
                                    break;
                                default:
                                    FacebookDialogFragment.initDialog$lambda$1(facebookDialogFragment, bundle2, facebookException);
                                    break;
                            }
                        }
                    }).build();
                }
            }
            this.innerDialog = newInstance;
        }
    }

    @Override // defpackage.fr0, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        if ((this.innerDialog instanceof WebDialog) && isResumed()) {
            Dialog dialog = this.innerDialog;
            dialog.getClass();
            ((WebDialog) dialog).resize();
        }
    }

    @Override // defpackage.ta0, defpackage.fr0
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initDialog$facebook_common_release();
    }

    @Override // defpackage.ta0
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.innerDialog;
        if (dialog != null) {
            dialog.getClass();
            return dialog;
        }
        onCompleteWebDialog(null, null);
        setShowsDialog(false);
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.getClass();
        return onCreateDialog;
    }

    @Override // defpackage.ta0, defpackage.fr0
    public void onDestroyView() {
        Dialog dialog = getDialog();
        if (dialog != null && getRetainInstance()) {
            dialog.setDismissMessage(null);
        }
        super.onDestroyView();
    }

    @Override // defpackage.fr0
    public void onResume() {
        super.onResume();
        Dialog dialog = this.innerDialog;
        if (dialog instanceof WebDialog) {
            dialog.getClass();
            ((WebDialog) dialog).resize();
        }
    }

    public final void setInnerDialog(Dialog dialog) {
        this.innerDialog = dialog;
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
