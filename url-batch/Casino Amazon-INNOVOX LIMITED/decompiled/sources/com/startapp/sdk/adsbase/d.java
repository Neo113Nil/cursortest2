package com.startapp.sdk.adsbase;

import android.content.Context;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.internal.a0;
import com.startapp.sdk.internal.e0;
import com.startapp.sdk.internal.m1;
import com.startapp.sdk.internal.pa;
import com.startapp.sdk.internal.v1;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public abstract class d implements v1 {

    /* renamed from: a, reason: collision with root package name */
    public final Ad f140a;
    public final pa b;
    public final Context c;
    public final AdEventListener d;
    public final AtomicBoolean e;
    public final String f;

    public d(Ad ad, pa paVar, Context context, AdEventListener adEventListener, String str) {
        paVar.getClass();
        context.getClass();
        str.getClass();
        this.f140a = ad;
        this.b = paVar;
        this.c = context;
        this.d = adEventListener;
        this.e = new AtomicBoolean();
        try {
            str = m1.a(str);
        } catch (Throwable unused) {
        }
        this.f = str;
    }

    public abstract Object a(String str);

    @Override // com.startapp.sdk.internal.v1
    public final void a() {
        ((Executor) this.b.a()).execute(new Runnable() { // from class: com.startapp.sdk.adsbase.d$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                d.a(d.this);
            }
        });
    }

    public final void b(boolean z) {
        if (this.e.compareAndSet(false, true)) {
            if (!z) {
                a0.a(this.c, this.d, this.f140a, false);
            } else {
                this.f140a.setState(Ad.AdState.READY);
                a0.b(this.c, this.d, this.f140a, false);
            }
        }
    }

    public static final void a(final d dVar) {
        final Object a2 = dVar.a(dVar.f);
        e0.a(new Runnable() { // from class: com.startapp.sdk.adsbase.d$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                d.a(d.this, a2);
            }
        });
    }

    public static final void a(d dVar, Object obj) {
        dVar.a(obj != null);
    }

    public void a(boolean z) {
        b(z);
    }
}
