package I;

import a2.InterfaceC0184a;
import j.C0498p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class G0 implements Iterable, InterfaceC0184a {

    /* renamed from: e, reason: collision with root package name */
    public int f2119e;

    /* renamed from: g, reason: collision with root package name */
    public int f2121g;

    /* renamed from: h, reason: collision with root package name */
    public int f2122h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2123i;

    /* renamed from: j, reason: collision with root package name */
    public int f2124j;

    /* renamed from: l, reason: collision with root package name */
    public HashMap f2126l;

    /* renamed from: m, reason: collision with root package name */
    public C0498p f2127m;

    /* renamed from: d, reason: collision with root package name */
    public int[] f2118d = new int[0];

    /* renamed from: f, reason: collision with root package name */
    public Object[] f2120f = new Object[0];

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f2125k = new ArrayList();

    public final int b(C0087c c0087c) {
        if (this.f2123i) {
            C0089d.w("Use active SlotWriter to determine anchor location instead");
            throw null;
        }
        if (c0087c.a()) {
            return c0087c.f2237a;
        }
        C0089d.R("Anchor refers to a group that was removed");
        throw null;
    }

    public final void c() {
        this.f2126l = new HashMap();
    }

    public final F0 d() {
        if (this.f2123i) {
            throw new IllegalStateException("Cannot read while a writer is pending");
        }
        this.f2122h++;
        return new F0(this);
    }

    public final I0 i() {
        if (this.f2123i) {
            C0089d.w("Cannot start a writer when another writer is pending");
            throw null;
        }
        if (this.f2122h > 0) {
            C0089d.w("Cannot start a writer when a reader is pending");
            throw null;
        }
        this.f2123i = true;
        this.f2124j++;
        return new I0(this);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new M(this, 0, this.f2119e);
    }
}
