package io.appmetrica.analytics.impl;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: io.appmetrica.analytics.impl.l5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0321l5 implements InterfaceC0474r9 {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0599w9 f1353a;
    public final List b;
    public final List c;
    public final AtomicBoolean d;

    public C0321l5(InterfaceC0599w9 interfaceC0599w9, List<? extends G8> list, List<? extends G8> list2, R4 r4) {
        this.f1353a = interfaceC0599w9;
        this.b = list;
        this.c = list2;
        Objects.toString(r4);
        this.d = new AtomicBoolean(true);
    }

    public final boolean a() {
        List list = this.c;
        if (!list.isEmpty() && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!((G8) it.next()).b()) {
                    return false;
                }
            }
        }
        List list2 = this.b;
        if (list2.isEmpty() || list2.isEmpty()) {
            return false;
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            if (((G8) it2.next()).b()) {
                return true;
            }
        }
        return false;
    }

    public final void b() {
        this.d.set(false);
    }

    public final void c() {
        this.d.set(true);
    }

    public final void d() {
        if (this.d.get()) {
            List list = this.c;
            if (!list.isEmpty() && !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (!((G8) it.next()).b()) {
                        return;
                    }
                }
            }
            ((C0364mn) this.f1353a).c();
        }
    }

    public final void e() {
        if (this.d.get() && a()) {
            ((C0364mn) this.f1353a).c();
        }
    }

    public final void f() {
        if (this.d.get() && a()) {
            ((C0364mn) this.f1353a).b();
        }
    }
}
