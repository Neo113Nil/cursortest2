package G;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class F0 implements Iterable, N2.a {

    /* renamed from: e, reason: collision with root package name */
    public int f2671e;

    /* renamed from: j, reason: collision with root package name */
    public int f2673j;

    /* renamed from: k, reason: collision with root package name */
    public int f2674k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2675l;

    /* renamed from: m, reason: collision with root package name */
    public int f2676m;

    /* renamed from: o, reason: collision with root package name */
    public HashMap f2678o;

    /* renamed from: p, reason: collision with root package name */
    public i.q f2679p;

    /* renamed from: d, reason: collision with root package name */
    public int[] f2670d = new int[0];

    /* renamed from: i, reason: collision with root package name */
    public Object[] f2672i = new Object[0];

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f2677n = new ArrayList();

    public final int e(C0190c c0190c) {
        if (this.f2675l) {
            C0192d.w("Use active SlotWriter to determine anchor location instead");
            throw null;
        }
        if (c0190c.a()) {
            return c0190c.f2791a;
        }
        C0192d.S("Anchor refers to a group that was removed");
        throw null;
    }

    public final void h() {
        this.f2678o = new HashMap();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new L(this, 0, this.f2671e);
    }

    public final E0 s() {
        if (this.f2675l) {
            throw new IllegalStateException("Cannot read while a writer is pending");
        }
        this.f2674k++;
        return new E0(this);
    }

    public final H0 w() {
        if (this.f2675l) {
            C0192d.w("Cannot start a writer when another writer is pending");
            throw null;
        }
        if (this.f2674k > 0) {
            C0192d.w("Cannot start a writer when a reader is pending");
            throw null;
        }
        this.f2675l = true;
        this.f2676m++;
        return new H0(this);
    }
}
