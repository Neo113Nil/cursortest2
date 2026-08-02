package com.startapp.sdk.adsbase;

import R1.n;
import android.content.Context;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.internal.a0;
import com.startapp.sdk.internal.a2;
import com.startapp.sdk.internal.ib;
import com.startapp.sdk.internal.z1;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class d implements a2 {

    /* renamed from: a, reason: collision with root package name */
    public final Ad f6408a;

    /* renamed from: b, reason: collision with root package name */
    public final ib f6409b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f6410c;

    /* renamed from: d, reason: collision with root package name */
    public final AdEventListener f6411d;

    /* renamed from: e, reason: collision with root package name */
    public final String f6412e;

    public d(Ad ad, ib networkApiExecutor, Context context, AdEventListener adEventListener, String admParam) {
        kotlin.jvm.internal.i.e(networkApiExecutor, "networkApiExecutor");
        kotlin.jvm.internal.i.e(context, "context");
        kotlin.jvm.internal.i.e(admParam, "admParam");
        this.f6408a = ad;
        this.f6409b = networkApiExecutor;
        this.f6410c = context;
        this.f6411d = adEventListener;
        this.f6412e = z1.a(admParam);
    }

    public abstract Object a(String str);

    @Override // com.startapp.sdk.internal.a2
    public final void a() {
        ((Executor) this.f6409b.a()).execute(new n(16, this));
    }

    public static final void a(d this$0) {
        kotlin.jvm.internal.i.e(this$0, "this$0");
        if (this$0.a(this$0.f6412e) == null) {
            a0.a(this$0.f6410c, this$0.f6411d, this$0.f6408a, false);
            return;
        }
        Ad ad = this$0.f6408a;
        if (ad != null) {
            ad.setState(Ad.AdState.READY);
        }
        a0.b(this$0.f6410c, this$0.f6411d, this$0.f6408a, false);
    }
}
