package io.appmetrica.analytics.impl;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: io.appmetrica.analytics.impl.r5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0793r5 implements InterfaceC0953x9 {

    /* renamed from: a, reason: collision with root package name */
    public final C9 f8205a;

    /* renamed from: b, reason: collision with root package name */
    public final List f8206b;

    /* renamed from: c, reason: collision with root package name */
    public final List f8207c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f8208d;

    public C0793r5(C9 c9, List<? extends K8> list, List<? extends K8> list2, X4 x4) {
        this.f8205a = c9;
        this.f8206b = list;
        this.f8207c = list2;
        Objects.toString(x4);
        this.f8208d = new AtomicBoolean(true);
    }

    public final boolean a() {
        List list = this.f8207c;
        if (!list.isEmpty() && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!((K8) it.next()).b()) {
                    return false;
                }
            }
        }
        List list2 = this.f8206b;
        if (list2.isEmpty() || list2.isEmpty()) {
            return false;
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            if (((K8) it2.next()).b()) {
                return true;
            }
        }
        return false;
    }

    public final void b() {
        this.f8208d.set(false);
    }

    public final void c() {
        this.f8208d.set(true);
    }

    public final void d() {
        if (this.f8208d.get()) {
            List list = this.f8207c;
            if (!list.isEmpty() && !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (!((K8) it.next()).b()) {
                        return;
                    }
                }
            }
            ((C0734on) this.f8205a).c();
        }
    }

    public final void e() {
        if (this.f8208d.get() && a()) {
            ((C0734on) this.f8205a).c();
        }
    }

    public final void f() {
        if (this.f8208d.get() && a()) {
            ((C0734on) this.f8205a).b();
        }
    }
}
