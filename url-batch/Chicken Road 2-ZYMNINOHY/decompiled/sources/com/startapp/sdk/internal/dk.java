package com.startapp.sdk.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import java.net.URL;

/* loaded from: classes.dex */
public final class dk {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6823a;

    /* renamed from: b, reason: collision with root package name */
    public final URL f6824b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6825c;

    /* renamed from: d, reason: collision with root package name */
    public final fj f6826d;

    /* renamed from: e, reason: collision with root package name */
    public final gj f6827e;

    public dk(Context context, URL url, String str, fj fjVar, gj gjVar) {
        this.f6823a = context;
        this.f6824b = url;
        this.f6825c = str;
        this.f6826d = fjVar;
        this.f6827e = gjVar;
    }

    public final void a() {
        String str;
        try {
            str = AdsCommonMetaData.k().F().q() ? ne.f7339a.a(this.f6823a, this.f6824b, this.f6825c, this.f6827e) : ek.a(this.f6823a, this.f6824b, this.f6825c);
        } catch (Exception e4) {
            d9.a(e4);
            str = null;
        }
        new Handler(Looper.getMainLooper()).post(new bk(this, str));
    }
}
