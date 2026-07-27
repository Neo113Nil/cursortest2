package com.google.android.gms.internal.play_billing;

import java.util.List;

/* renamed from: com.google.android.gms.internal.play_billing.f1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0331f1 implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0334g1 f5182a;

    /* renamed from: b, reason: collision with root package name */
    public AbstractC0334g1 f5183b;

    public AbstractC0331f1(AbstractC0334g1 abstractC0334g1) {
        this.f5182a = abstractC0334g1;
        if (abstractC0334g1.c()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f5183b = (AbstractC0334g1) abstractC0334g1.d(4);
    }

    public static void a(int i2, List list) {
        String g6 = B0.o.g(list.size() - i2, "Element at index ", " is null.");
        int size = list.size();
        while (true) {
            size--;
            if (size < i2) {
                throw new NullPointerException(g6);
            }
            list.remove(size);
        }
    }

    public final AbstractC0334g1 b() {
        AbstractC0334g1 c2 = c();
        if (AbstractC0334g1.m(c2, true)) {
            return c2;
        }
        throw new G1();
    }

    public final AbstractC0334g1 c() {
        if (!this.f5183b.c()) {
            return this.f5183b;
        }
        AbstractC0334g1 abstractC0334g1 = this.f5183b;
        abstractC0334g1.getClass();
        A1.f5019c.a(abstractC0334g1.getClass()).a(abstractC0334g1);
        abstractC0334g1.j();
        return this.f5183b;
    }

    public final Object clone() {
        AbstractC0331f1 abstractC0331f1 = (AbstractC0331f1) this.f5182a.d(5);
        abstractC0331f1.f5183b = c();
        return abstractC0331f1;
    }

    public final void d() {
        if (this.f5183b.c()) {
            return;
        }
        AbstractC0334g1 abstractC0334g1 = (AbstractC0334g1) this.f5182a.d(4);
        A1.f5019c.a(abstractC0334g1.getClass()).d(abstractC0334g1, this.f5183b);
        this.f5183b = abstractC0334g1;
    }
}
