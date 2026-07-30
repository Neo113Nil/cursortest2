package r;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p1.e0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final h f7608a;

    /* renamed from: b, reason: collision with root package name */
    public final s.s f7609b;

    /* renamed from: c, reason: collision with root package name */
    public final long f7610c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s.s f7611d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7612e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f7613f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ s0.e f7614g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f7615h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f7616i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f7617j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ s f7618k;

    public i(long j8, h hVar, s.s sVar, int i7, int i8, s0.e eVar, int i9, int i10, long j9, s sVar2) {
        this.f7611d = sVar;
        this.f7612e = i7;
        this.f7613f = i8;
        this.f7614g = eVar;
        this.f7615h = i9;
        this.f7616i = i10;
        this.f7617j = j9;
        this.f7618k = sVar2;
        this.f7608a = hVar;
        this.f7609b = sVar;
        this.f7610c = r4.a.c(m2.a.h(j8), Integer.MAX_VALUE, 5);
    }

    public final m a(long j8, int i7) {
        long j9;
        List list;
        h hVar = this.f7608a;
        Object d8 = hVar.d(i7);
        Object b9 = hVar.b(i7);
        s.s sVar = this.f7609b;
        h hVar2 = sVar.f8057h;
        HashMap hashMap = sVar.f8058i;
        List list2 = (List) hashMap.get(Integer.valueOf(i7));
        if (list2 != null) {
            j9 = j8;
            list = list2;
        } else {
            Object d9 = hVar2.d(i7);
            List D = sVar.f8056g.D(d9, sVar.f8055f.a(d9, i7, hVar2.b(i7)));
            int size = D.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i8 = 0; i8 < size; i8++) {
                arrayList.add(((e0) D.get(i8)).b(j8));
            }
            j9 = j8;
            hashMap.put(Integer.valueOf(i7), arrayList);
            list = arrayList;
        }
        return new m(i7, list, this.f7614g, this.f7611d.f8056g.getLayoutDirection(), this.f7615h, this.f7616i, i7 != this.f7612e + (-1) ? this.f7613f : 0, this.f7617j, d8, b9, this.f7618k.f7686m, j9);
    }
}
