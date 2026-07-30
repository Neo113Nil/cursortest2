package Z0;

import X0.v;
import X0.z;
import a1.InterfaceC0417a;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import d1.C4456b;
import f1.AbstractC4490a;
import j1.C4589b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class p implements e, m, j, InterfaceC0417a, k {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f4169a = new Matrix();

    /* renamed from: b, reason: collision with root package name */
    public final Path f4170b = new Path();

    /* renamed from: c, reason: collision with root package name */
    public final v f4171c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC4490a f4172d;

    /* renamed from: e, reason: collision with root package name */
    public final String f4173e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f4174f;

    /* renamed from: g, reason: collision with root package name */
    public final a1.i f4175g;

    /* renamed from: h, reason: collision with root package name */
    public final a1.i f4176h;
    public final a1.r i;

    /* renamed from: j, reason: collision with root package name */
    public d f4177j;

    public p(v vVar, AbstractC4490a abstractC4490a, e1.i iVar) {
        this.f4171c = vVar;
        this.f4172d = abstractC4490a;
        this.f4173e = iVar.f37279b;
        this.f4174f = iVar.f37281d;
        a1.i a9 = iVar.f37280c.a();
        this.f4175g = a9;
        abstractC4490a.e(a9);
        a9.a(this);
        a1.i a10 = ((C4456b) iVar.f37282e).a();
        this.f4176h = a10;
        abstractC4490a.e(a10);
        a10.a(this);
        d1.d dVar = (d1.d) iVar.f37283f;
        dVar.getClass();
        a1.r rVar = new a1.r(dVar);
        this.i = rVar;
        rVar.a(abstractC4490a);
        rVar.b(this);
    }

    @Override // a1.InterfaceC0417a
    public final void a() {
        this.f4171c.invalidateSelf();
    }

    @Override // Z0.c
    public final void b(List list, List list2) {
        this.f4177j.b(list, list2);
    }

    @Override // c1.f
    public final void c(ColorFilter colorFilter, S0.s sVar) {
        if (this.i.c(colorFilter, sVar)) {
            return;
        }
        if (colorFilter == z.f3802s) {
            this.f4175g.j(sVar);
        } else if (colorFilter == z.f3803t) {
            this.f4176h.j(sVar);
        }
    }

    @Override // Z0.e
    public final void d(RectF rectF, Matrix matrix, boolean z8) {
        this.f4177j.d(rectF, matrix, z8);
    }

    @Override // Z0.j
    public final void e(ListIterator listIterator) {
        if (this.f4177j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add((c) listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.f4177j = new d(this.f4171c, this.f4172d, "Repeater", this.f4174f, arrayList, null);
    }

    @Override // c1.f
    public final void f(c1.e eVar, int i, ArrayList arrayList, c1.e eVar2) {
        j1.h.g(eVar, i, arrayList, eVar2, this);
        for (int i4 = 0; i4 < this.f4177j.i.size(); i4++) {
            c cVar = (c) this.f4177j.i.get(i4);
            if (cVar instanceof k) {
                j1.h.g(eVar, i, arrayList, eVar2, (k) cVar);
            }
        }
    }

    @Override // Z0.m
    public final Path g() {
        Path g9 = this.f4177j.g();
        Path path = this.f4170b;
        path.reset();
        float floatValue = ((Float) this.f4175g.e()).floatValue();
        float floatValue2 = ((Float) this.f4176h.e()).floatValue();
        for (int i = ((int) floatValue) - 1; i >= 0; i--) {
            Matrix matrix = this.f4169a;
            matrix.set(this.i.f(i + floatValue2));
            path.addPath(g9, matrix);
        }
        return path;
    }

    @Override // Z0.c
    public final String getName() {
        return this.f4173e;
    }

    @Override // Z0.e
    public final void h(Canvas canvas, Matrix matrix, int i, C4589b c4589b) {
        float floatValue = ((Float) this.f4175g.e()).floatValue();
        float floatValue2 = ((Float) this.f4176h.e()).floatValue();
        a1.r rVar = this.i;
        float floatValue3 = ((Float) rVar.f4360v.e()).floatValue() / 100.0f;
        float floatValue4 = ((Float) rVar.f4361w.e()).floatValue() / 100.0f;
        for (int i4 = ((int) floatValue) - 1; i4 >= 0; i4--) {
            Matrix matrix2 = this.f4169a;
            matrix2.set(matrix);
            float f6 = i4;
            matrix2.preConcat(rVar.f(f6 + floatValue2));
            this.f4177j.h(canvas, matrix2, (int) (j1.h.f(floatValue3, floatValue4, f6 / floatValue) * i), c4589b);
        }
    }
}
