package com.chartboost.sdk.impl;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.mobilefuse.sdk.MobileFuseDefaults;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class j1 extends i1 {
    public final ContentResolver b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(Context context, ContentResolver contentResolver) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
        this.b = contentResolver;
    }

    public h1 b() {
        boolean z;
        String string;
        xi xiVar = xi.c;
        String str = null;
        try {
            z = Settings.Secure.getInt(this.b, CommonUrlParts.LIMIT_AD_TRACKING) != 0;
            string = Settings.Secure.getString(this.b, "advertising_id");
        } catch (Settings.SettingNotFoundException unused) {
        }
        if (!z && !Intrinsics.areEqual(string, MobileFuseDefaults.ADVERTISING_ID_ZEROS) && !a()) {
            xiVar = xi.d;
            str = string;
            return new h1(xiVar, str);
        }
        xiVar = xi.e;
        return new h1(xiVar, str);
    }
}
