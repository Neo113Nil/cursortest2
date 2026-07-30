package com.facebook.messenger;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.FacebookSdk;
import com.facebook.bolts.AppLinks;
import com.facebook.internal.FacebookSignatureValidator;
import com.facebook.internal.ServerProtocol;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.messenger.MessengerThreadParams;
import defpackage.ah0;
import defpackage.up2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class MessengerUtils {
    public static final String EXTRA_APP_ID = "com.facebook.orca.extra.APPLICATION_ID";
    public static final String EXTRA_EXTERNAL_URI = "com.facebook.orca.extra.EXTERNAL_URI";
    public static final String EXTRA_IS_COMPOSE = "com.facebook.orca.extra.IS_COMPOSE";
    public static final String EXTRA_IS_REPLY = "com.facebook.orca.extra.IS_REPLY";
    public static final String EXTRA_METADATA = "com.facebook.orca.extra.METADATA";
    public static final String EXTRA_PARTICIPANTS = "com.facebook.orca.extra.PARTICIPANTS";
    public static final String EXTRA_PROTOCOL_VERSION = "com.facebook.orca.extra.PROTOCOL_VERSION";
    public static final String EXTRA_REPLY_TOKEN_KEY = "com.facebook.orca.extra.REPLY_TOKEN";
    public static final String EXTRA_THREAD_TOKEN_KEY = "com.facebook.orca.extra.THREAD_TOKEN";
    public static final MessengerUtils INSTANCE = new MessengerUtils();
    public static final String ORCA_THREAD_CATEGORY_20150314 = "com.facebook.orca.category.PLATFORM_THREAD_20150314";
    public static final String PACKAGE_NAME = "com.facebook.orca";
    public static final int PROTOCOL_VERSION_20150314 = 20150314;
    private static final String TAG = "MessengerUtils";

    private MessengerUtils() {
    }

    private final Set<Integer> getAllAvailableProtocolVersions(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        HashSet hashSet = new HashSet();
        Cursor query = contentResolver.query(Uri.parse("content://com.facebook.orca.provider.MessengerPlatformProvider/versions"), new String[]{ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION}, null, null, null);
        if (query == null) {
            return hashSet;
        }
        try {
            int columnIndex = query.getColumnIndex(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION);
            while (query.moveToNext()) {
                hashSet.add(Integer.valueOf(query.getInt(columnIndex)));
            }
            Unit unit = Unit.a;
            query.close();
            return hashSet;
        } finally {
        }
    }

    private final List<String> parseParticipants(String str) {
        if (str == null || str.length() == 0) {
            return ah0.m;
        }
        String[] strArr = (String[]) up2.F(0, 6, str, new String[]{","}).toArray(new String[0]);
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str2 : strArr) {
            int length = str2.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = Intrinsics.c(str2.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    }
                    length--;
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            arrayList.add(str2.subSequence(i, length + 1).toString());
        }
        return arrayList;
    }

    private final void shareToMessenger20150314(Activity activity, int i, ShareToMessengerParams shareToMessengerParams) {
        try {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setFlags(1);
            intent.setPackage(PACKAGE_NAME);
            intent.putExtra("android.intent.extra.STREAM", shareToMessengerParams.getUri());
            intent.setType(shareToMessengerParams.getMimeType());
            intent.putExtra(EXTRA_PROTOCOL_VERSION, PROTOCOL_VERSION_20150314);
            intent.putExtra(EXTRA_APP_ID, FacebookSdk.getApplicationId());
            intent.putExtra(EXTRA_METADATA, shareToMessengerParams.getMetaData());
            intent.putExtra(EXTRA_EXTERNAL_URI, shareToMessengerParams.getExternalUri());
            activity.startActivityForResult(intent, i);
        } catch (ActivityNotFoundException unused) {
            activity.startActivity(activity.getPackageManager().getLaunchIntentForPackage(PACKAGE_NAME));
        }
    }

    private final void startViewUri(Context context, String str) {
        context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
    }

    public final void finishShareToMessenger(Activity activity, ShareToMessengerParams shareToMessengerParams) {
        activity.getClass();
        shareToMessengerParams.getClass();
        Intent intent = activity.getIntent();
        Set<String> categories = intent.getCategories();
        if (categories == null) {
            activity.setResult(0, null);
            activity.finish();
            return;
        }
        if (!categories.contains(ORCA_THREAD_CATEGORY_20150314)) {
            activity.setResult(0, null);
            activity.finish();
            return;
        }
        Bundle appLinkExtras = AppLinks.getAppLinkExtras(intent);
        Intent intent2 = new Intent();
        if (appLinkExtras == null || !categories.contains(ORCA_THREAD_CATEGORY_20150314)) {
            throw new RuntimeException();
        }
        intent2.putExtra(EXTRA_PROTOCOL_VERSION, PROTOCOL_VERSION_20150314);
        intent2.putExtra(EXTRA_THREAD_TOKEN_KEY, appLinkExtras.getString(EXTRA_THREAD_TOKEN_KEY));
        intent2.setDataAndType(shareToMessengerParams.getUri(), shareToMessengerParams.getMimeType());
        intent2.setFlags(1);
        intent2.putExtra(EXTRA_APP_ID, FacebookSdk.getApplicationId());
        intent2.putExtra(EXTRA_METADATA, shareToMessengerParams.getMetaData());
        intent2.putExtra(EXTRA_EXTERNAL_URI, shareToMessengerParams.getExternalUri());
        activity.setResult(-1, intent2);
        activity.finish();
    }

    public final MessengerThreadParams getMessengerThreadParamsForIntent(Intent intent) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            intent.getClass();
            Set<String> categories = intent.getCategories();
            if (categories != null && categories.contains(ORCA_THREAD_CATEGORY_20150314)) {
                Bundle appLinkExtras = AppLinks.getAppLinkExtras(intent);
                String string = appLinkExtras != null ? appLinkExtras.getString(EXTRA_THREAD_TOKEN_KEY) : null;
                String string2 = appLinkExtras != null ? appLinkExtras.getString(EXTRA_METADATA) : null;
                String string3 = appLinkExtras != null ? appLinkExtras.getString(EXTRA_PARTICIPANTS) : null;
                Boolean valueOf = appLinkExtras != null ? Boolean.valueOf(appLinkExtras.getBoolean(EXTRA_IS_REPLY)) : null;
                Boolean valueOf2 = appLinkExtras != null ? Boolean.valueOf(appLinkExtras.getBoolean(EXTRA_IS_COMPOSE)) : null;
                Boolean bool = Boolean.TRUE;
                MessengerThreadParams.Origin origin = Intrinsics.b(valueOf, bool) ? MessengerThreadParams.Origin.REPLY_FLOW : Intrinsics.b(valueOf2, bool) ? MessengerThreadParams.Origin.COMPOSE_FLOW : MessengerThreadParams.Origin.UNKNOWN;
                if (string != null && string2 != null) {
                    return new MessengerThreadParams(origin, string, string2, parseParticipants(string3));
                }
            }
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public final boolean hasMessengerInstalled(Context context) {
        context.getClass();
        return FacebookSignatureValidator.validateSignature(context, PACKAGE_NAME);
    }

    public final void openMessengerInPlayStore(Context context) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            context.getClass();
            try {
                startViewUri(context, "market://details?id=com.facebook.orca");
            } catch (ActivityNotFoundException unused) {
                startViewUri(context, "http://play.google.com/store/apps/details?id=com.facebook.orca");
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void shareToMessenger(Activity activity, int i, ShareToMessengerParams shareToMessengerParams) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            activity.getClass();
            shareToMessengerParams.getClass();
            if (!hasMessengerInstalled(activity)) {
                openMessengerInPlayStore(activity);
            } else if (getAllAvailableProtocolVersions(activity).contains(Integer.valueOf(PROTOCOL_VERSION_20150314))) {
                shareToMessenger20150314(activity, i, shareToMessengerParams);
            } else {
                openMessengerInPlayStore(activity);
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }
}
