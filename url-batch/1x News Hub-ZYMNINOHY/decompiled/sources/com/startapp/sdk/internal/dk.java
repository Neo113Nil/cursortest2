package com.startapp.sdk.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import java.net.URL;

/* loaded from: classes.dex */
public final class dk {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3709a;

    /* renamed from: b, reason: collision with root package name */
    public final URL f3710b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3711c;

    /* renamed from: d, reason: collision with root package name */
    public final fj f3712d;

    /* renamed from: e, reason: collision with root package name */
    public final gj f3713e;

    public dk(Context context, URL url, String str, fj fjVar, gj gjVar) {
        this.f3709a = context;
        this.f3710b = url;
        this.f3711c = str;
        this.f3712d = fjVar;
        this.f3713e = gjVar;
    }

    public final void a() {
        String str;
        try {
            str = AdsCommonMetaData.k().F().q() ? ne.f4206a.a(this.f3709a, this.f3710b, this.f3711c, this.f3713e) : ek.a(this.f3709a, this.f3710b, this.f3711c);
        } catch (Exception e3) {
            d9.a(e3);
            str = null;
        }
        new Handler(Looper.getMainLooper()).post(new bk(this, str));
    }
}
