package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* renamed from: com.google.android.gms.internal.ads.kB, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3458kB implements Serializable, InterfaceC3404jB {

    /* renamed from: n, reason: collision with root package name */
    public final transient C3620nB f32272n = new C3620nB();

    /* renamed from: u, reason: collision with root package name */
    public final InterfaceC3404jB f32273u;

    /* renamed from: v, reason: collision with root package name */
    public volatile transient boolean f32274v;

    /* renamed from: w, reason: collision with root package name */
    public transient Object f32275w;

    public C3458kB(InterfaceC3404jB interfaceC3404jB) {
        this.f32273u = interfaceC3404jB;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3404jB
    public final Object a() {
        if (!this.f32274v) {
            synchronized (this.f32272n) {
                try {
                    if (!this.f32274v) {
                        Object a9 = this.f32273u.a();
                        this.f32275w = a9;
                        this.f32274v = true;
                        return a9;
                    }
                } finally {
                }
            }
        }
        return this.f32275w;
    }

    public final String toString() {
        Object obj;
        if (this.f32274v) {
            String valueOf = String.valueOf(this.f32275w);
            obj = D.y.o(new StringBuilder(valueOf.length() + 25), "<supplier that returned ", valueOf, ">");
        } else {
            obj = this.f32273u;
        }
        String obj2 = obj.toString();
        return D.y.o(new StringBuilder(obj2.length() + 19), "Suppliers.memoize(", obj2, ")");
    }
}
