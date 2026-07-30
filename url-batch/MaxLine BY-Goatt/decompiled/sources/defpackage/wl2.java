package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class wl2 implements Iterable, k71 {
    public int n;
    public int p;
    public int q;
    public boolean s;
    public int t;
    public HashMap v;
    public zm1 w;
    public int[] m = new int[0];
    public Object[] o = new Object[0];
    public final Object r = new Object();
    public ArrayList u = new ArrayList();

    public final int a(m6 m6Var) {
        if (this.s) {
            b00.c("Use active SlotWriter to determine anchor location instead");
        }
        if (!m6Var.a()) {
            v32.a("Anchor refers to a group that was removed");
        }
        return m6Var.a;
    }

    public final void b() {
        this.v = new HashMap();
    }

    public final vl2 c() {
        if (this.s) {
            lh.g("Cannot read while a writer is pending");
            return null;
        }
        this.q++;
        return new vl2(this);
    }

    public final zl2 d() {
        if (this.s) {
            b00.c("Cannot start a writer when another writer is pending");
        }
        if (this.q > 0) {
            b00.c("Cannot start a writer when a reader is pending");
        }
        this.s = true;
        this.t++;
        return new zl2(this);
    }

    public final boolean e(m6 m6Var) {
        int d;
        return m6Var.a() && (d = yl2.d(this.u, m6Var.a, this.n)) >= 0 && Intrinsics.b(this.u.get(d), m6Var);
    }

    public final rw0 f(int i) {
        int i2;
        ArrayList arrayList;
        int d;
        HashMap hashMap = this.v;
        if (hashMap != null) {
            if (this.s) {
                b00.c("use active SlotWriter to crate an anchor for location instead");
            }
            m6 m6Var = (i < 0 || i >= (i2 = this.n) || (d = yl2.d((arrayList = this.u), i, i2)) < 0) ? null : (m6) arrayList.get(d);
            if (m6Var != null) {
                return (rw0) hashMap.get(m6Var);
            }
        }
        return null;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new qw0(this, 0, this.n);
    }
}
