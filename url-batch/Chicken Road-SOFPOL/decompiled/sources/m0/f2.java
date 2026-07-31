package m0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class f2 implements Iterable, r6.a {

    /* renamed from: e, reason: collision with root package name */
    public int f4929e;

    /* renamed from: g, reason: collision with root package name */
    public int f4931g;

    /* renamed from: h, reason: collision with root package name */
    public int f4932h;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4933j;

    /* renamed from: k, reason: collision with root package name */
    public int f4934k;

    /* renamed from: m, reason: collision with root package name */
    public HashMap f4936m;

    /* renamed from: n, reason: collision with root package name */
    public o.x f4937n;

    /* renamed from: d, reason: collision with root package name */
    public int[] f4928d = new int[0];

    /* renamed from: f, reason: collision with root package name */
    public Object[] f4930f = new Object[0];
    public final Object i = new Object();

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f4935l = new ArrayList();

    public final int a(a aVar) {
        if (this.f4933j) {
            t.c("Use active SlotWriter to determine anchor location instead");
        }
        if (!aVar.a()) {
            p1.a("Anchor refers to a group that was removed");
        }
        return aVar.f4874a;
    }

    public final void b() {
        this.f4936m = new HashMap();
    }

    public final e2 c() {
        if (this.f4933j) {
            throw new IllegalStateException("Cannot read while a writer is pending");
        }
        this.f4932h++;
        return new e2(this);
    }

    public final i2 e() {
        if (this.f4933j) {
            t.c("Cannot start a writer when another writer is pending");
        }
        if (this.f4932h > 0) {
            t.c("Cannot start a writer when a reader is pending");
        }
        this.f4933j = true;
        this.f4934k++;
        return new i2(this);
    }

    public final boolean f(a aVar) {
        int e8;
        return aVar.a() && (e8 = h2.e(this.f4935l, aVar.f4874a, this.f4929e)) >= 0 && q6.i.a(this.f4935l.get(e8), aVar);
    }

    public final m0 g(int i) {
        int i8;
        ArrayList arrayList;
        int e8;
        HashMap hashMap = this.f4936m;
        if (hashMap != null) {
            if (this.f4933j) {
                t.c("use active SlotWriter to crate an anchor for location instead");
            }
            a aVar = (i < 0 || i >= (i8 = this.f4929e) || (e8 = h2.e((arrayList = this.f4935l), i, i8)) < 0) ? null : (a) arrayList.get(e8);
            if (aVar != null) {
                return (m0) hashMap.get(aVar);
            }
        }
        return null;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new l0(this, 0, this.f4929e);
    }
}
