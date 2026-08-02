package defpackage;

import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class cm {
    public final bd a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final List g;
    public int h;
    public int i;
    private final List k;
    private final List j = new ArrayList();
    public boolean f = true;

    public cm(int i, int i2, bd bdVar) {
        this.h = i;
        this.i = i2;
        this.a = bdVar;
        ArrayList arrayList = new ArrayList();
        this.k = arrayList;
        this.g = arrayList;
    }

    public void a() {
        this.e = false;
        if (this.c) {
            return;
        }
        if (by.U(2)) {
            toString();
        }
        this.c = true;
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public void b() {
        this.e = true;
    }

    public final void c(Runnable runnable) {
        this.j.add(runnable);
    }

    public final void d(ck ckVar) {
        this.k.add(ckVar);
    }

    public final void e(ViewGroup viewGroup) {
        this.e = false;
        if (this.b) {
            return;
        }
        this.b = true;
        if (this.k.isEmpty()) {
            a();
            return;
        }
        for (ck ckVar : ixc.p(this.g)) {
            if (!ckVar.c) {
                ckVar.a(viewGroup);
            }
            ckVar.c = true;
        }
    }

    public final void f(ck ckVar) {
        List list = this.k;
        if (list.remove(ckVar) && list.isEmpty()) {
            a();
        }
    }

    public final void g() {
        this.f = false;
    }

    public final void h(int i, int i2) {
        int i3 = i2 - 1;
        if (i3 == 1) {
            if (this.h == 1) {
                if (by.U(2)) {
                    bd bdVar = this.a;
                    int i4 = this.i;
                    Objects.toString(bdVar);
                    Objects.toString(a.O(i4));
                }
                this.h = 2;
                this.i = 2;
                this.f = true;
                return;
            }
            return;
        }
        if (i3 != 2) {
            int i5 = this.h;
            if (i5 != 1) {
                if (by.U(2)) {
                    Objects.toString(this.a);
                    Objects.toString(a.K(i5));
                    Objects.toString(a.K(i));
                }
                this.h = i;
                return;
            }
            return;
        }
        if (by.U(2)) {
            bd bdVar2 = this.a;
            int i6 = this.h;
            int i7 = this.i;
            Objects.toString(bdVar2);
            Objects.toString(a.K(i6));
            Objects.toString(a.O(i7));
        }
        this.h = 1;
        this.i = 3;
        this.f = true;
    }

    public final String toString() {
        return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {finalState = " + ((Object) a.K(this.h)) + " lifecycleImpact = " + ((Object) a.O(this.i)) + " fragment = " + this.a + "}";
    }
}
