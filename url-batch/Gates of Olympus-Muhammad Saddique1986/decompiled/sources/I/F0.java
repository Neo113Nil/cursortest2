package I;

import g2.InterfaceC0439a;
import j.C0542p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class F0 implements Iterable, InterfaceC0439a {

    /* renamed from: e, reason: collision with root package name */
    public int f2673e;

    /* renamed from: g, reason: collision with root package name */
    public int f2675g;

    /* renamed from: h, reason: collision with root package name */
    public int f2676h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2677i;

    /* renamed from: j, reason: collision with root package name */
    public int f2678j;

    /* renamed from: l, reason: collision with root package name */
    public HashMap f2680l;

    /* renamed from: m, reason: collision with root package name */
    public C0542p f2681m;

    /* renamed from: d, reason: collision with root package name */
    public int[] f2672d = new int[0];

    /* renamed from: f, reason: collision with root package name */
    public Object[] f2674f = new Object[0];

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f2679k = new ArrayList();

    public final int b(C0141c c0141c) {
        if (this.f2677i) {
            C0143d.w("Use active SlotWriter to determine anchor location instead");
            throw null;
        }
        if (c0141c.a()) {
            return c0141c.f2794a;
        }
        C0143d.S("Anchor refers to a group that was removed");
        throw null;
    }

    public final void c() {
        this.f2680l = new HashMap();
    }

    public final E0 d() {
        if (this.f2677i) {
            throw new IllegalStateException("Cannot read while a writer is pending");
        }
        this.f2676h++;
        return new E0(this);
    }

    public final H0 i() {
        if (this.f2677i) {
            C0143d.w("Cannot start a writer when another writer is pending");
            throw null;
        }
        if (this.f2676h > 0) {
            C0143d.w("Cannot start a writer when a reader is pending");
            throw null;
        }
        this.f2677i = true;
        this.f2678j++;
        return new H0(this);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new L(this, 0, this.f2673e);
    }
}
