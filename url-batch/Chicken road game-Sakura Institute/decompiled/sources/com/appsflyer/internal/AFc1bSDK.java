package com.appsflyer.internal;

import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class AFc1bSDK {
    public static Uri AFInAppEventType(Intent intent) {
        if (intent == null) {
            return null;
        }
        AFj1ySDK aFj1ySDK = new AFj1ySDK(intent);
        Intrinsics.checkNotNullParameter("android.intent.extra.REFERRER", "");
        Uri uri = (Uri) ((Parcelable) aFj1ySDK.AFInAppEventParameterName(new Function0<T>() { // from class: com.appsflyer.internal.AFj1ySDK.1
            private /* synthetic */ String $valueOf;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(String str) {
                super(0);
                r2 = str;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: valueOf */
            public final Parcelable invoke() {
                return AFj1ySDK.this.AFInAppEventParameterName.getParcelableExtra(r2);
            }
        }, "Error while trying to read android.intent.extra.REFERRER extra from intent", null, true));
        if (uri != null) {
            return uri;
        }
        String AFInAppEventParameterName = aFj1ySDK.AFInAppEventParameterName("android.intent.extra.REFERRER_NAME");
        if (AFInAppEventParameterName != null) {
            return Uri.parse(AFInAppEventParameterName);
        }
        return null;
    }
}
