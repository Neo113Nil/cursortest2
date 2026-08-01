package q0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.collections.i0;
import kotlin.jvm.internal.Intrinsics;
import n0.n1;
import s.w;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class h implements c1.d, Iterable, xd.a {

    /* renamed from: e, reason: collision with root package name */
    public int f7747e;

    /* renamed from: r, reason: collision with root package name */
    public int f7749r;

    /* renamed from: s, reason: collision with root package name */
    public int f7750s;

    /* renamed from: u, reason: collision with root package name */
    public boolean f7752u;

    /* renamed from: v, reason: collision with root package name */
    public int f7753v;

    /* renamed from: x, reason: collision with root package name */
    public HashMap f7755x;

    /* renamed from: y, reason: collision with root package name */
    public w f7756y;

    /* renamed from: d, reason: collision with root package name */
    public int[] f7746d = new int[0];

    /* renamed from: i, reason: collision with root package name */
    public Object[] f7748i = new Object[0];

    /* renamed from: t, reason: collision with root package name */
    public final Object f7751t = new Object();

    /* renamed from: w, reason: collision with root package name */
    public ArrayList f7754w = new ArrayList();

    public final int b(b bVar) {
        if (this.f7752u) {
            n0.m.a("Use active SlotWriter to determine anchor location instead");
        }
        if (!bVar.a()) {
            n1.a("Anchor refers to a group that was removed");
        }
        return bVar.f7722a;
    }

    public final void c() {
        this.f7755x = new HashMap();
    }

    public final g e() {
        if (this.f7752u) {
            i0.l("Cannot read while a writer is pending");
            return null;
        }
        this.f7750s++;
        return new g(this);
    }

    public final k f() {
        if (this.f7752u) {
            n0.m.a("Cannot start a writer when another writer is pending");
        }
        if (this.f7750s > 0) {
            n0.m.a("Cannot start a writer when a reader is pending");
        }
        this.f7752u = true;
        this.f7753v++;
        return new k(this);
    }

    public final boolean g(b bVar) {
        int e2;
        return bVar.a() && (e2 = j.e(this.f7754w, bVar.f7722a, this.f7747e)) >= 0 && Intrinsics.a(this.f7754w.get(e2), bVar);
    }

    public final c h(int i3) {
        int i10;
        ArrayList arrayList;
        int e2;
        HashMap hashMap = this.f7755x;
        if (hashMap != null) {
            if (this.f7752u) {
                n0.m.a("use active SlotWriter to crate an anchor for location instead");
            }
            b bVar = (i3 < 0 || i3 >= (i10 = this.f7747e) || (e2 = j.e((arrayList = this.f7754w), i3, i10)) < 0) ? null : (b) arrayList.get(e2);
            if (bVar != null) {
                return (c) hashMap.get(bVar);
            }
        }
        return null;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new d(this, 0, this.f7747e);
    }
}
