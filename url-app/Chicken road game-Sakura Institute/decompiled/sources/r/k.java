package r;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p0.InterfaceC0944E;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final h f9476a;

    /* renamed from: b, reason: collision with root package name */
    public final s.t f9477b;

    /* renamed from: c, reason: collision with root package name */
    public final long f9478c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s.t f9479d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f9480e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f9481f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ S.e f9482g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ S.f f9483h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f9484i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f9485j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f9486k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f9487l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v f9488m;

    public k(long j4, h hVar, s.t tVar, int i2, int i4, S.e eVar, S.f fVar, boolean z4, int i5, int i6, long j5, v vVar) {
        this.f9479d = tVar;
        this.f9480e = i2;
        this.f9481f = i4;
        this.f9482g = eVar;
        this.f9483h = fVar;
        this.f9484i = z4;
        this.f9485j = i5;
        this.f9486k = i6;
        this.f9487l = j5;
        this.f9488m = vVar;
        this.f9476a = hVar;
        this.f9477b = tVar;
        this.f9478c = u3.d.b(M0.a.i(j4), Integer.MAX_VALUE, 5);
    }

    public final o a(long j4, int i2) {
        List list;
        h hVar = this.f9476a;
        Object d4 = hVar.d(i2);
        Object b4 = hVar.b(i2);
        s.t tVar = this.f9477b;
        HashMap hashMap = tVar.f9966j;
        List list2 = (List) hashMap.get(Integer.valueOf(i2));
        if (list2 != null) {
            list = list2;
        } else {
            h hVar2 = tVar.f9965i;
            Object d5 = hVar2.d(i2);
            List v4 = tVar.f9964e.v(d5, tVar.f9963d.a(d5, i2, hVar2.b(i2)));
            int size = v4.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i4 = 0; i4 < size; i4++) {
                arrayList.add(((InterfaceC0944E) v4.get(i4)).a(j4));
            }
            hashMap.put(Integer.valueOf(i2), arrayList);
            list = arrayList;
        }
        return new o(i2, list, this.f9482g, this.f9483h, this.f9479d.f9964e.getLayoutDirection(), this.f9484i, this.f9485j, this.f9486k, i2 == this.f9480e + (-1) ? 0 : this.f9481f, this.f9487l, d4, b4, this.f9488m.f9563m, j4);
    }
}
