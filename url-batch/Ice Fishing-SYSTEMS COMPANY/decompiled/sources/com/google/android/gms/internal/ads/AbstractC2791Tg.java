package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.Tg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2791Tg {

    /* renamed from: n, reason: collision with root package name */
    public final Context f27797n;

    /* renamed from: u, reason: collision with root package name */
    public final String f27798u;

    /* renamed from: v, reason: collision with root package name */
    public final WeakReference f27799v;

    public AbstractC2791Tg(InterfaceC3858rh interfaceC3858rh) {
        Context context = interfaceC3858rh.getContext();
        this.f27797n = context;
        this.f27798u = p2.j.f39798C.f39803c.E(context, interfaceC3858rh.w().f41217n);
        this.f27799v = new WeakReference(interfaceC3858rh);
    }

    public void a() {
    }

    public abstract boolean b(String str);

    public boolean c(String str, String[] strArr) {
        return b(str);
    }

    public boolean d(String str, String[] strArr, C2638Kg c2638Kg) {
        return b(str);
    }

    public void f(int i) {
    }

    public void h(int i) {
    }

    public void j(int i) {
    }

    public abstract void l();

    public final void m(String str, String str2, String str3, String str4) {
        u2.d.f41224b.post(new RunnableC2774Sg(this, str, str2, str3, str4));
    }

    public final /* synthetic */ void n(HashMap hashMap) {
        InterfaceC3858rh interfaceC3858rh = (InterfaceC3858rh) this.f27799v.get();
        if (interfaceC3858rh != null) {
            interfaceC3858rh.a("onPrecacheEvent", hashMap);
        }
    }

    public void i(int i) {
    }
}
