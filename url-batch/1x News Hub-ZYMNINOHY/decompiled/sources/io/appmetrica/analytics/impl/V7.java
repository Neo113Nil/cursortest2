package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import java.util.List;

/* loaded from: classes.dex */
public abstract class V7 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6784a;

    /* renamed from: b, reason: collision with root package name */
    public final ProtobufStateStorage f6785b;

    /* renamed from: c, reason: collision with root package name */
    public final X7 f6786c;

    /* renamed from: d, reason: collision with root package name */
    public final Cdo f6787d;

    /* renamed from: e, reason: collision with root package name */
    public final Mm f6788e;
    public final Zi f;

    /* renamed from: g, reason: collision with root package name */
    public final Xi f6789g;

    /* renamed from: h, reason: collision with root package name */
    public final G6 f6790h;

    /* renamed from: i, reason: collision with root package name */
    public W7 f6791i;

    public V7(Context context, ProtobufStateStorage protobufStateStorage, X7 x7, Cdo cdo, Mm mm, Zi zi, Xi xi, G6 g6, W7 w7) {
        this.f6784a = context;
        this.f6785b = protobufStateStorage;
        this.f6786c = x7;
        this.f6787d = cdo;
        this.f6788e = mm;
        this.f = zi;
        this.f6789g = xi;
        this.f6790h = g6;
        this.f6791i = w7;
    }

    public final synchronized W7 a() {
        return this.f6791i;
    }

    public final synchronized boolean b(Z7 z7) {
        try {
            boolean z = false;
            if (z7.a() == Y7.f6891b) {
                return false;
            }
            if (z7.equals(this.f6791i.b())) {
                return false;
            }
            List list = (List) this.f6787d.invoke(this.f6791i.a(), z7);
            boolean z2 = list != null;
            if (list == null) {
                list = this.f6791i.a();
            }
            if (this.f6786c.a(z7, this.f6791i.b())) {
                z = true;
            } else {
                z7 = (Z7) this.f6791i.b();
            }
            if (z || z2) {
                W7 w7 = this.f6791i;
                W7 w72 = (W7) this.f6788e.invoke(z7, list);
                this.f6791i = w72;
                this.f6785b.save(w72);
                AbstractC0626kj.a("Update distribution data: %s -> %s", w7, this.f6791i);
            }
            return z;
        } finally {
        }
    }

    public final synchronized Z7 c() {
        try {
            if (!this.f6789g.a()) {
                Z7 z7 = (Z7) this.f.invoke();
                this.f6789g.b();
                if (z7 != null) {
                    b(z7);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return (Z7) this.f6791i.b();
    }

    public final Z7 a(Z7 z7) {
        Z7 c3;
        this.f6790h.a(this.f6784a);
        synchronized (this) {
            b(z7);
            c3 = c();
        }
        return c3;
    }

    public final Z7 b() {
        this.f6790h.a(this.f6784a);
        return c();
    }
}
