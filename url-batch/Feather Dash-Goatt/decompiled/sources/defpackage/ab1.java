package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ab1 implements ol, Iterable, yb0 {
    public int e;
    public int h;
    public int i;
    public boolean k;
    public int l;
    public HashMap n;
    public en0 o;
    public int[] d = new int[0];
    public Object[] g = new Object[0];
    public final Object j = new Object();
    public ArrayList m = new ArrayList();

    public final int a(d3 d3Var) {
        if (this.k) {
            kl.a("Use active SlotWriter to determine anchor location instead");
        }
        if (!d3Var.a()) {
            cy0.a("Anchor refers to a group that was removed");
        }
        return d3Var.a;
    }

    public final void b() {
        this.n = new HashMap();
    }

    public final za1 d() {
        if (this.k) {
            dd0.j("Cannot read while a writer is pending");
            return null;
        }
        this.i++;
        return new za1(this);
    }

    public final db1 e() {
        if (this.k) {
            kl.a("Cannot start a writer when another writer is pending");
        }
        if (this.i > 0) {
            kl.a("Cannot start a writer when a reader is pending");
        }
        this.k = true;
        this.l++;
        return new db1(this);
    }

    public final boolean f(d3 d3Var) {
        int d;
        return d3Var.a() && (d = cb1.d(this.m, d3Var.a, this.e)) >= 0 && Intrinsics.a(this.m.get(d), d3Var);
    }

    public final t50 g(int i) {
        int i2;
        ArrayList arrayList;
        int d;
        HashMap hashMap = this.n;
        if (hashMap != null) {
            if (this.k) {
                kl.a("use active SlotWriter to crate an anchor for location instead");
            }
            d3 d3Var = (i < 0 || i >= (i2 = this.e) || (d = cb1.d((arrayList = this.m), i, i2)) < 0) ? null : (d3) arrayList.get(d);
            if (d3Var != null) {
                return (t50) hashMap.get(d3Var);
            }
        }
        return null;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new s50(this, 0, this.e);
    }
}
