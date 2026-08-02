package com.startapp.sdk.adsbase;

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
    public final Ad f3318a;

    /* renamed from: b, reason: collision with root package name */
    public final ib f3319b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f3320c;

    /* renamed from: d, reason: collision with root package name */
    public final AdEventListener f3321d;

    /* renamed from: e, reason: collision with root package name */
    public final String f3322e;

    public d(Ad ad, ib networkApiExecutor, Context context, AdEventListener adEventListener, String admParam) {
        kotlin.jvm.internal.j.e(networkApiExecutor, "networkApiExecutor");
        kotlin.jvm.internal.j.e(context, "context");
        kotlin.jvm.internal.j.e(admParam, "admParam");
        this.f3318a = ad;
        this.f3319b = networkApiExecutor;
        this.f3320c = context;
        this.f3321d = adEventListener;
        this.f3322e = z1.a(admParam);
    }

    public abstract Object a(String str);

    @Override // com.startapp.sdk.internal.a2
    public final void a() {
        ((Executor) this.f3319b.a()).execute(new B0.n(9, this));
    }

    public static final void a(d this$0) {
        kotlin.jvm.internal.j.e(this$0, "this$0");
        if (this$0.a(this$0.f3322e) == null) {
            a0.a(this$0.f3320c, this$0.f3321d, this$0.f3318a, false);
            return;
        }
        Ad ad = this$0.f3318a;
        if (ad != null) {
            ad.setState(Ad.AdState.READY);
        }
        a0.b(this$0.f3320c, this$0.f3321d, this$0.f3318a, false);
    }
}
