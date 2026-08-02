package p0;

import T.C0097o;
import T.O;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l0.InterfaceC1243a;

/* loaded from: classes.dex */
public final class c implements InterfaceC1243a {

    /* renamed from: a, reason: collision with root package name */
    public final int f14688a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14689b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14690c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f14691d;

    /* renamed from: e, reason: collision with root package name */
    public final C1343a f14692e;

    /* renamed from: f, reason: collision with root package name */
    public final b[] f14693f;

    /* renamed from: g, reason: collision with root package name */
    public final long f14694g;

    /* renamed from: h, reason: collision with root package name */
    public final long f14695h;

    public c(int i4, int i5, long j4, long j5, int i6, boolean z, C1343a c1343a, b[] bVarArr) {
        this.f14688a = i4;
        this.f14689b = i5;
        this.f14694g = j4;
        this.f14695h = j5;
        this.f14690c = i6;
        this.f14691d = z;
        this.f14692e = c1343a;
        this.f14693f = bVarArr;
    }

    @Override // l0.InterfaceC1243a
    public final Object a(List list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        b bVar = null;
        int i4 = 0;
        while (i4 < arrayList.size()) {
            O o = (O) arrayList.get(i4);
            b bVar2 = this.f14693f[o.f2679b];
            if (bVar2 != bVar && bVar != null) {
                arrayList2.add(bVar.a((C0097o[]) arrayList3.toArray(new C0097o[0])));
                arrayList3.clear();
            }
            arrayList3.add(bVar2.f14683j[o.f2680c]);
            i4++;
            bVar = bVar2;
        }
        if (bVar != null) {
            arrayList2.add(bVar.a((C0097o[]) arrayList3.toArray(new C0097o[0])));
        }
        return new c(this.f14688a, this.f14689b, this.f14694g, this.f14695h, this.f14690c, this.f14691d, this.f14692e, (b[]) arrayList2.toArray(new b[0]));
    }
}
