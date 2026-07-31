package io.appmetrica.analytics.impl;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class F5 implements L9 {

    /* renamed from: a, reason: collision with root package name */
    public final Q9 f37506a;

    /* renamed from: b, reason: collision with root package name */
    public final List f37507b;

    /* renamed from: c, reason: collision with root package name */
    public final List f37508c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f37509d;

    public F5(@NotNull Q9 q9, @NotNull List<? extends Y8> list, @NotNull List<? extends Y8> list2, @NotNull C2772l5 c2772l5) {
        this.f37506a = q9;
        this.f37507b = list;
        this.f37508c = list2;
        Objects.toString(c2772l5);
        this.f37509d = new AtomicBoolean(true);
    }

    public final boolean a() {
        List list = this.f37508c;
        if (!list.isEmpty() && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!((Y8) it.next()).b()) {
                    return false;
                }
            }
        }
        List list2 = this.f37507b;
        if (list2.isEmpty() || list2.isEmpty()) {
            return false;
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            if (((Y8) it2.next()).b()) {
                return true;
            }
        }
        return false;
    }

    public final void b() {
        this.f37509d.set(false);
    }

    public final void c() {
        this.f37509d.set(true);
    }

    public final void d() {
        if (this.f37509d.get()) {
            List list = this.f37508c;
            if (!list.isEmpty() && !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (!((Y8) it.next()).b()) {
                        return;
                    }
                }
            }
            ((C2738jn) this.f37506a).c();
        }
    }

    public final void e() {
        if (this.f37509d.get() && a()) {
            ((C2738jn) this.f37506a).c();
        }
    }

    public final void f() {
        if (this.f37509d.get() && a()) {
            ((C2738jn) this.f37506a).b();
        }
    }
}
