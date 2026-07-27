package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import java.util.List;

/* loaded from: classes.dex */
public abstract class V7 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7616a;

    /* renamed from: b, reason: collision with root package name */
    public final ProtobufStateStorage f7617b;

    /* renamed from: c, reason: collision with root package name */
    public final X7 f7618c;

    /* renamed from: d, reason: collision with root package name */
    public final Cdo f7619d;

    /* renamed from: e, reason: collision with root package name */
    public final Mm f7620e;

    /* renamed from: f, reason: collision with root package name */
    public final Zi f7621f;

    /* renamed from: g, reason: collision with root package name */
    public final Xi f7622g;

    /* renamed from: h, reason: collision with root package name */
    public final G6 f7623h;

    /* renamed from: i, reason: collision with root package name */
    public W7 f7624i;

    public V7(Context context, ProtobufStateStorage protobufStateStorage, X7 x7, Cdo cdo, Mm mm, Zi zi, Xi xi, G6 g6, W7 w7) {
        this.f7616a = context;
        this.f7617b = protobufStateStorage;
        this.f7618c = x7;
        this.f7619d = cdo;
        this.f7620e = mm;
        this.f7621f = zi;
        this.f7622g = xi;
        this.f7623h = g6;
        this.f7624i = w7;
    }

    public final synchronized W7 a() {
        return this.f7624i;
    }

    public final synchronized boolean b(Z7 z7) {
        try {
            boolean z = false;
            if (z7.a() == Y7.f7729b) {
                return false;
            }
            if (z7.equals(this.f7624i.b())) {
                return false;
            }
            List list = (List) this.f7619d.invoke(this.f7624i.a(), z7);
            boolean z5 = list != null;
            if (list == null) {
                list = this.f7624i.a();
            }
            if (this.f7618c.a(z7, this.f7624i.b())) {
                z = true;
            } else {
                z7 = (Z7) this.f7624i.b();
            }
            if (z || z5) {
                W7 w7 = this.f7624i;
                W7 w72 = (W7) this.f7620e.invoke(z7, list);
                this.f7624i = w72;
                this.f7617b.save(w72);
                AbstractC0777kj.a("Update distribution data: %s -> %s", w7, this.f7624i);
            }
            return z;
        } finally {
        }
    }

    public final synchronized Z7 c() {
        try {
            if (!this.f7622g.a()) {
                Z7 z7 = (Z7) this.f7621f.invoke();
                this.f7622g.b();
                if (z7 != null) {
                    b(z7);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return (Z7) this.f7624i.b();
    }

    public final Z7 a(Z7 z7) {
        Z7 c2;
        this.f7623h.a(this.f7616a);
        synchronized (this) {
            b(z7);
            c2 = c();
        }
        return c2;
    }

    public final Z7 b() {
        this.f7623h.a(this.f7616a);
        return c();
    }
}
