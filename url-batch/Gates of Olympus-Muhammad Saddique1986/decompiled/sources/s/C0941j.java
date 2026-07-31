package s;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import r0.InterfaceC0884F;

/* renamed from: s.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0941j {

    /* renamed from: a, reason: collision with root package name */
    public final C0939h f8252a;

    /* renamed from: b, reason: collision with root package name */
    public final t.u f8253b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8254c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t.u f8255d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f8256e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f8257f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ U.c f8258g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ U.h f8259h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f8260i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f8261j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f8262k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f8263l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0951t f8264m;

    public C0941j(long j3, C0939h c0939h, t.u uVar, int i3, int i4, U.c cVar, U.h hVar, boolean z3, int i5, int i6, long j4, C0951t c0951t) {
        this.f8255d = uVar;
        this.f8256e = i3;
        this.f8257f = i4;
        this.f8258g = cVar;
        this.f8259h = hVar;
        this.f8260i = z3;
        this.f8261j = i5;
        this.f8262k = i6;
        this.f8263l = j4;
        this.f8264m = c0951t;
        this.f8252a = c0939h;
        this.f8253b = uVar;
        this.f8254c = O2.d.b(O0.a.h(j3), Integer.MAX_VALUE, 5);
    }

    public final C0944m a(long j3, int i3) {
        List list;
        C0939h c0939h = this.f8252a;
        Object d3 = c0939h.d(i3);
        Object b3 = c0939h.b(i3);
        t.u uVar = this.f8253b;
        HashMap hashMap = uVar.f8514g;
        List list2 = (List) hashMap.get(Integer.valueOf(i3));
        if (list2 != null) {
            list = list2;
        } else {
            C0939h c0939h2 = uVar.f8513f;
            Object d4 = c0939h2.d(i3);
            List l02 = uVar.f8512e.l0(d4, uVar.f8511d.a(d4, i3, c0939h2.b(i3)));
            int size = l02.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i4 = 0; i4 < size; i4++) {
                arrayList.add(((InterfaceC0884F) l02.get(i4)).b(j3));
            }
            hashMap.put(Integer.valueOf(i3), arrayList);
            list = arrayList;
        }
        return new C0944m(i3, list, this.f8258g, this.f8259h, this.f8255d.f8512e.getLayoutDirection(), this.f8260i, this.f8261j, this.f8262k, i3 == this.f8256e + (-1) ? 0 : this.f8257f, this.f8263l, d3, b3, this.f8264m.f8329m, j3);
    }
}
