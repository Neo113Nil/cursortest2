package Z0;

import X0.v;
import a1.InterfaceC0417a;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import f1.AbstractC4490a;
import j1.C4589b;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class d implements e, m, InterfaceC0417a, c1.f {

    /* renamed from: a, reason: collision with root package name */
    public final G1.a f4077a;

    /* renamed from: b, reason: collision with root package name */
    public final RectF f4078b;

    /* renamed from: c, reason: collision with root package name */
    public final j1.i f4079c;

    /* renamed from: d, reason: collision with root package name */
    public final Matrix f4080d;

    /* renamed from: e, reason: collision with root package name */
    public final Path f4081e;

    /* renamed from: f, reason: collision with root package name */
    public final RectF f4082f;

    /* renamed from: g, reason: collision with root package name */
    public final String f4083g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f4084h;
    public final ArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public final v f4085j;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f4086k;

    /* renamed from: l, reason: collision with root package name */
    public final a1.r f4087l;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d(v vVar, AbstractC4490a abstractC4490a, e1.m mVar, X0.i iVar) {
        this(vVar, abstractC4490a, r3, mVar.f37296c, r5, r11);
        d1.d dVar;
        String str = mVar.f37294a;
        List list = mVar.f37295b;
        ArrayList arrayList = new ArrayList(list.size());
        int i = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            c a9 = ((e1.b) list.get(i4)).a(vVar, iVar, abstractC4490a);
            if (a9 != null) {
                arrayList.add(a9);
            }
        }
        while (true) {
            if (i >= list.size()) {
                dVar = null;
                break;
            }
            e1.b bVar = (e1.b) list.get(i);
            if (bVar instanceof d1.d) {
                dVar = (d1.d) bVar;
                break;
            }
            i++;
        }
    }

    @Override // a1.InterfaceC0417a
    public final void a() {
        this.f4085j.invalidateSelf();
    }

    @Override // Z0.c
    public final void b(List list, List list2) {
        int size = list.size();
        ArrayList arrayList = this.i;
        ArrayList arrayList2 = new ArrayList(arrayList.size() + size);
        arrayList2.addAll(list);
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            c cVar = (c) arrayList.get(size2);
            cVar.b(arrayList2, arrayList.subList(0, size2));
            arrayList2.add(cVar);
        }
    }

    @Override // c1.f
    public final void c(ColorFilter colorFilter, S0.s sVar) {
        a1.r rVar = this.f4087l;
        if (rVar != null) {
            rVar.c(colorFilter, sVar);
        }
    }

    @Override // Z0.e
    public final void d(RectF rectF, Matrix matrix, boolean z8) {
        Matrix matrix2 = this.f4080d;
        matrix2.set(matrix);
        a1.r rVar = this.f4087l;
        if (rVar != null) {
            matrix2.preConcat(rVar.e());
        }
        RectF rectF2 = this.f4082f;
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        ArrayList arrayList = this.i;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            c cVar = (c) arrayList.get(size);
            if (cVar instanceof e) {
                ((e) cVar).d(rectF2, matrix2, z8);
                rectF.union(rectF2);
            }
        }
    }

    public final List e() {
        if (this.f4086k == null) {
            this.f4086k = new ArrayList();
            int i = 0;
            while (true) {
                ArrayList arrayList = this.i;
                if (i >= arrayList.size()) {
                    break;
                }
                c cVar = (c) arrayList.get(i);
                if (cVar instanceof m) {
                    this.f4086k.add((m) cVar);
                }
                i++;
            }
        }
        return this.f4086k;
    }

    @Override // c1.f
    public final void f(c1.e eVar, int i, ArrayList arrayList, c1.e eVar2) {
        String str = this.f4083g;
        if (!eVar.c(i, str) && !"__container".equals(str)) {
            return;
        }
        if (!"__container".equals(str)) {
            c1.e eVar3 = new c1.e(eVar2);
            eVar3.f5679a.add(str);
            if (eVar.a(i, str)) {
                c1.e eVar4 = new c1.e(eVar3);
                eVar4.f5680b = this;
                arrayList.add(eVar4);
            }
            eVar2 = eVar3;
        }
        if (!eVar.d(i, str)) {
            return;
        }
        int b9 = eVar.b(i, str) + i;
        int i4 = 0;
        while (true) {
            ArrayList arrayList2 = this.i;
            if (i4 >= arrayList2.size()) {
                return;
            }
            c cVar = (c) arrayList2.get(i4);
            if (cVar instanceof c1.f) {
                ((c1.f) cVar).f(eVar, b9, arrayList, eVar2);
            }
            i4++;
        }
    }

    @Override // Z0.m
    public final Path g() {
        Matrix matrix = this.f4080d;
        matrix.reset();
        a1.r rVar = this.f4087l;
        if (rVar != null) {
            matrix.set(rVar.e());
        }
        Path path = this.f4081e;
        path.reset();
        if (!this.f4084h) {
            ArrayList arrayList = this.i;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                c cVar = (c) arrayList.get(size);
                if (cVar instanceof m) {
                    path.addPath(((m) cVar).g(), matrix);
                }
            }
        }
        return path;
    }

    @Override // Z0.c
    public final String getName() {
        throw null;
    }

    @Override // Z0.e
    public final void h(Canvas canvas, Matrix matrix, int i, C4589b c4589b) {
        if (this.f4084h) {
            return;
        }
        Matrix matrix2 = this.f4080d;
        matrix2.set(matrix);
        a1.r rVar = this.f4087l;
        if (rVar != null) {
            matrix2.preConcat(rVar.e());
            i = (int) (((((rVar.f4354p == null ? 100 : ((Integer) r1.e()).intValue()) / 100.0f) * i) / 255.0f) * 255.0f);
        }
        v vVar = this.f4085j;
        boolean z8 = vVar.f3732L;
        int i4 = com.anythink.basead.exoplayer.k.p.f8630b;
        boolean z9 = (z8 && i() && i != 255) || (c4589b != null && vVar.f3733M && i());
        if (!z9) {
            i4 = i;
        }
        j1.i iVar = this.f4079c;
        if (z9) {
            RectF rectF = this.f4078b;
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            d(rectF, matrix, true);
            G1.a aVar = this.f4077a;
            aVar.f1194u = i;
            if (c4589b != null) {
                if (Color.alpha(c4589b.f38482d) > 0) {
                    aVar.f1195v = c4589b;
                } else {
                    aVar.f1195v = null;
                }
                c4589b = null;
            } else {
                aVar.f1195v = null;
            }
            canvas = iVar.e(canvas, rectF, aVar);
        } else if (c4589b != null) {
            C4589b c4589b2 = new C4589b(c4589b);
            c4589b2.b(i4);
            c4589b = c4589b2;
        }
        ArrayList arrayList = this.i;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Object obj = arrayList.get(size);
            if (obj instanceof e) {
                ((e) obj).h(canvas, matrix2, i4, c4589b);
            }
        }
        if (z9) {
            iVar.c();
        }
    }

    public final boolean i() {
        int i = 0;
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.i;
            if (i >= arrayList.size()) {
                return false;
            }
            if ((arrayList.get(i) instanceof e) && (i4 = i4 + 1) >= 2) {
                return true;
            }
            i++;
        }
    }

    public d(v vVar, AbstractC4490a abstractC4490a, String str, boolean z8, ArrayList arrayList, d1.d dVar) {
        this.f4077a = new G1.a((byte) 0, 16);
        this.f4078b = new RectF();
        this.f4079c = new j1.i();
        this.f4080d = new Matrix();
        this.f4081e = new Path();
        this.f4082f = new RectF();
        this.f4083g = str;
        this.f4085j = vVar;
        this.f4084h = z8;
        this.i = arrayList;
        if (dVar != null) {
            a1.r rVar = new a1.r(dVar);
            this.f4087l = rVar;
            rVar.a(abstractC4490a);
            rVar.b(this);
        }
        ArrayList arrayList2 = new ArrayList();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            c cVar = (c) arrayList.get(size);
            if (cVar instanceof j) {
                arrayList2.add((j) cVar);
            }
        }
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ((j) arrayList2.get(size2)).e(arrayList.listIterator(arrayList.size()));
        }
    }
}
