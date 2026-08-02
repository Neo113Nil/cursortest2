package com.google.android.gms.internal.play_billing;

import E1.AbstractC0033i;
import java.util.List;

/* renamed from: com.google.android.gms.internal.play_billing.f1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0222f1 implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0225g1 f2859a;

    /* renamed from: b, reason: collision with root package name */
    public AbstractC0225g1 f2860b;

    public AbstractC0222f1(AbstractC0225g1 abstractC0225g1) {
        this.f2859a = abstractC0225g1;
        if (abstractC0225g1.c()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f2860b = (AbstractC0225g1) abstractC0225g1.d(4);
    }

    public static void a(int i3, List list) {
        String i4 = AbstractC0033i.i(list.size() - i3, "Element at index ", " is null.");
        int size = list.size();
        while (true) {
            size--;
            if (size < i3) {
                throw new NullPointerException(i4);
            }
            list.remove(size);
        }
    }

    public final AbstractC0225g1 b() {
        AbstractC0225g1 c3 = c();
        if (AbstractC0225g1.m(c3, true)) {
            return c3;
        }
        throw new G1();
    }

    public final AbstractC0225g1 c() {
        if (!this.f2860b.c()) {
            return this.f2860b;
        }
        AbstractC0225g1 abstractC0225g1 = this.f2860b;
        abstractC0225g1.getClass();
        A1.f2703c.a(abstractC0225g1.getClass()).a(abstractC0225g1);
        abstractC0225g1.j();
        return this.f2860b;
    }

    public final Object clone() {
        AbstractC0222f1 abstractC0222f1 = (AbstractC0222f1) this.f2859a.d(5);
        abstractC0222f1.f2860b = c();
        return abstractC0222f1;
    }

    public final void d() {
        if (this.f2860b.c()) {
            return;
        }
        AbstractC0225g1 abstractC0225g1 = (AbstractC0225g1) this.f2859a.d(4);
        A1.f2703c.a(abstractC0225g1.getClass()).d(abstractC0225g1, this.f2860b);
        this.f2860b = abstractC0225g1;
    }
}
