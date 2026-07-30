package Z0;

import X0.v;
import X0.z;
import a1.AbstractC0421e;
import a1.InterfaceC0417a;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import d1.C4455a;
import d1.C4456b;
import f1.AbstractC4490a;
import j1.C4589b;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class g implements e, InterfaceC0417a, k {

    /* renamed from: a, reason: collision with root package name */
    public final Path f4096a;

    /* renamed from: b, reason: collision with root package name */
    public final Y0.a f4097b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC4490a f4098c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4099d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f4100e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f4101f;

    /* renamed from: g, reason: collision with root package name */
    public final a1.f f4102g;

    /* renamed from: h, reason: collision with root package name */
    public final a1.f f4103h;
    public a1.s i;

    /* renamed from: j, reason: collision with root package name */
    public final v f4104j;

    /* renamed from: k, reason: collision with root package name */
    public AbstractC0421e f4105k;

    /* renamed from: l, reason: collision with root package name */
    public float f4106l;

    public g(v vVar, AbstractC4490a abstractC4490a, e1.l lVar) {
        Path path = new Path();
        this.f4096a = path;
        this.f4097b = new Y0.a(1, 0);
        this.f4101f = new ArrayList();
        this.f4098c = abstractC4490a;
        this.f4099d = lVar.f37290c;
        this.f4100e = lVar.f37293f;
        this.f4104j = vVar;
        if (abstractC4490a.l() != null) {
            a1.i a9 = ((C4456b) abstractC4490a.l().f37858u).a();
            this.f4105k = a9;
            a9.a(this);
            abstractC4490a.e(this.f4105k);
        }
        C4455a c4455a = lVar.f37291d;
        if (c4455a == null) {
            this.f4102g = null;
            this.f4103h = null;
            return;
        }
        C4455a c4455a2 = lVar.f37292e;
        path.setFillType(lVar.f37289b);
        AbstractC0421e a10 = c4455a.a();
        this.f4102g = (a1.f) a10;
        a10.a(this);
        abstractC4490a.e(a10);
        AbstractC0421e a11 = c4455a2.a();
        this.f4103h = (a1.f) a11;
        a11.a(this);
        abstractC4490a.e(a11);
    }

    @Override // a1.InterfaceC0417a
    public final void a() {
        this.f4104j.invalidateSelf();
    }

    @Override // Z0.c
    public final void b(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            c cVar = (c) list2.get(i);
            if (cVar instanceof m) {
                this.f4101f.add((m) cVar);
            }
        }
    }

    @Override // c1.f
    public final void c(ColorFilter colorFilter, S0.s sVar) {
        PointF pointF = z.f3785a;
        if (colorFilter == 1) {
            this.f4102g.j(sVar);
            return;
        }
        if (colorFilter == 4) {
            this.f4103h.j(sVar);
            return;
        }
        ColorFilter colorFilter2 = z.f3780I;
        AbstractC4490a abstractC4490a = this.f4098c;
        if (colorFilter == colorFilter2) {
            a1.s sVar2 = this.i;
            if (sVar2 != null) {
                abstractC4490a.o(sVar2);
            }
            a1.s sVar3 = new a1.s(sVar, null);
            this.i = sVar3;
            sVar3.a(this);
            abstractC4490a.e(this.i);
            return;
        }
        if (colorFilter == z.f3789e) {
            AbstractC0421e abstractC0421e = this.f4105k;
            if (abstractC0421e != null) {
                abstractC0421e.j(sVar);
                return;
            }
            a1.s sVar4 = new a1.s(sVar, null);
            this.f4105k = sVar4;
            sVar4.a(this);
            abstractC4490a.e(this.f4105k);
        }
    }

    @Override // Z0.e
    public final void d(RectF rectF, Matrix matrix, boolean z8) {
        Path path = this.f4096a;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f4101f;
            if (i >= arrayList.size()) {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            } else {
                path.addPath(((m) arrayList.get(i)).g(), matrix);
                i++;
            }
        }
    }

    @Override // c1.f
    public final void f(c1.e eVar, int i, ArrayList arrayList, c1.e eVar2) {
        j1.h.g(eVar, i, arrayList, eVar2, this);
    }

    @Override // Z0.c
    public final String getName() {
        return this.f4099d;
    }

    @Override // Z0.e
    public final void h(Canvas canvas, Matrix matrix, int i, C4589b c4589b) {
        BlurMaskFilter blurMaskFilter;
        if (this.f4100e) {
            return;
        }
        a1.f fVar = this.f4102g;
        float intValue = ((Integer) this.f4103h.e()).intValue() / 100.0f;
        int c4 = (j1.h.c((int) (i * intValue)) << 24) | (fVar.l(fVar.f4304c.h(), fVar.c()) & 16777215);
        Y0.a aVar = this.f4097b;
        aVar.setColor(c4);
        a1.s sVar = this.i;
        if (sVar != null) {
            aVar.setColorFilter((ColorFilter) sVar.e());
        }
        AbstractC0421e abstractC0421e = this.f4105k;
        if (abstractC0421e != null) {
            float floatValue = ((Float) abstractC0421e.e()).floatValue();
            if (floatValue == 0.0f) {
                aVar.setMaskFilter(null);
            } else if (floatValue != this.f4106l) {
                AbstractC4490a abstractC4490a = this.f4098c;
                if (abstractC4490a.f37552A == floatValue) {
                    blurMaskFilter = abstractC4490a.f37553B;
                } else {
                    BlurMaskFilter blurMaskFilter2 = new BlurMaskFilter(floatValue / 2.0f, BlurMaskFilter.Blur.NORMAL);
                    abstractC4490a.f37553B = blurMaskFilter2;
                    abstractC4490a.f37552A = floatValue;
                    blurMaskFilter = blurMaskFilter2;
                }
                aVar.setMaskFilter(blurMaskFilter);
            }
            this.f4106l = floatValue;
        }
        if (c4589b != null) {
            c4589b.a((int) (intValue * 255.0f), aVar);
        } else {
            aVar.clearShadowLayer();
        }
        Path path = this.f4096a;
        path.reset();
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.f4101f;
            if (i4 >= arrayList.size()) {
                canvas.drawPath(path, aVar);
                return;
            } else {
                path.addPath(((m) arrayList.get(i4)).g(), matrix);
                i4++;
            }
        }
    }
}
