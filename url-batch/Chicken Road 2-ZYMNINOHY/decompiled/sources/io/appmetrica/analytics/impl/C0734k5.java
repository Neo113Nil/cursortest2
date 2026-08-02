package io.appmetrica.analytics.impl;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: io.appmetrica.analytics.impl.k5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0734k5 implements InterfaceC0894q9 {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1023v9 f12193a;

    /* renamed from: b, reason: collision with root package name */
    public final List f12194b;

    /* renamed from: c, reason: collision with root package name */
    public final List f12195c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f12196d;

    public C0734k5(InterfaceC1023v9 interfaceC1023v9, List<? extends F8> list, List<? extends F8> list2, Q4 q4) {
        this.f12193a = interfaceC1023v9;
        this.f12194b = list;
        this.f12195c = list2;
        Objects.toString(q4);
        this.f12196d = new AtomicBoolean(true);
    }

    public final boolean a() {
        List list = this.f12195c;
        if (!list.isEmpty() && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!((F8) it.next()).b()) {
                    return false;
                }
            }
        }
        List list2 = this.f12194b;
        if (list2.isEmpty() || list2.isEmpty()) {
            return false;
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            if (((F8) it2.next()).b()) {
                return true;
            }
        }
        return false;
    }

    public final void b() {
        this.f12196d.set(false);
    }

    public final void c() {
        this.f12196d.set(true);
    }

    public final void d() {
        if (this.f12196d.get()) {
            List list = this.f12195c;
            if (!list.isEmpty() && !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (!((F8) it.next()).b()) {
                        return;
                    }
                }
            }
            ((C0778ln) this.f12193a).c();
        }
    }

    public final void e() {
        if (this.f12196d.get() && a()) {
            ((C0778ln) this.f12193a).c();
        }
    }

    public final void f() {
        if (this.f12196d.get() && a()) {
            ((C0778ln) this.f12193a).b();
        }
    }
}
