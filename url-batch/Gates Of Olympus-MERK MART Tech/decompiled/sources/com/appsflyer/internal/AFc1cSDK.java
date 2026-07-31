package com.appsflyer.internal;

import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class AFc1cSDK {
    public static Uri AFKeystoreWrapper(Intent intent) {
        if (intent == null) {
            return null;
        }
        AFi1oSDK aFi1oSDK = new AFi1oSDK(intent);
        Intrinsics.checkNotNullParameter("android.intent.extra.REFERRER", "");
        Uri uri = (Uri) ((Parcelable) aFi1oSDK.AFInAppEventType(new Function0<T>() { // from class: com.appsflyer.internal.AFi1oSDK.3
            private /* synthetic */ String $AFInAppEventType;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(String str) {
                super(0);
                r2 = str;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: valueOf */
            public final Parcelable invoke() {
                return AFi1oSDK.this.AFKeystoreWrapper.getParcelableExtra(r2);
            }
        }, "Error while trying to read android.intent.extra.REFERRER extra from intent", null, true));
        if (uri != null) {
            return uri;
        }
        String AFInAppEventType = aFi1oSDK.AFInAppEventType("android.intent.extra.REFERRER_NAME");
        if (AFInAppEventType != null) {
            return Uri.parse(AFInAppEventType);
        }
        return null;
    }
}
