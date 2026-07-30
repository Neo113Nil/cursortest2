package Z0;

import X0.v;
import X0.z;
import a1.AbstractC0421e;
import a1.InterfaceC0417a;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.PointF;
import f1.AbstractC4490a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class f implements m, InterfaceC0417a, k {

    /* renamed from: b, reason: collision with root package name */
    public final String f4089b;

    /* renamed from: c, reason: collision with root package name */
    public final v f4090c;

    /* renamed from: d, reason: collision with root package name */
    public final a1.j f4091d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0421e f4092e;

    /* renamed from: f, reason: collision with root package name */
    public final e1.a f4093f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4095h;

    /* renamed from: a, reason: collision with root package name */
    public final Path f4088a = new Path();

    /* renamed from: g, reason: collision with root package name */
    public final I1.f f4094g = new I1.f(1);

    public f(v vVar, AbstractC4490a abstractC4490a, e1.a aVar) {
        this.f4089b = aVar.f37235a;
        this.f4090c = vVar;
        AbstractC0421e a9 = aVar.f37237c.a();
        this.f4091d = (a1.j) a9;
        AbstractC0421e a10 = aVar.f37236b.a();
        this.f4092e = a10;
        this.f4093f = aVar;
        abstractC4490a.e(a9);
        abstractC4490a.e(a10);
        a9.a(this);
        a10.a(this);
    }

    @Override // a1.InterfaceC0417a
    public final void a() {
        this.f4095h = false;
        this.f4090c.invalidateSelf();
    }

    @Override // Z0.c
    public final void b(List list, List list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i >= arrayList.size()) {
                return;
            }
            c cVar = (c) arrayList.get(i);
            if (cVar instanceof t) {
                t tVar = (t) cVar;
                if (tVar.f4195c == 1) {
                    this.f4094g.f1255a.add(tVar);
                    tVar.c(this);
                }
            }
            i++;
        }
    }

    @Override // c1.f
    public final void c(ColorFilter colorFilter, S0.s sVar) {
        if (colorFilter == z.f3790f) {
            this.f4091d.j(sVar);
        } else if (colorFilter == z.i) {
            this.f4092e.j(sVar);
        }
    }

    @Override // c1.f
    public final void f(c1.e eVar, int i, ArrayList arrayList, c1.e eVar2) {
        j1.h.g(eVar, i, arrayList, eVar2, this);
    }

    @Override // Z0.m
    public final Path g() {
        boolean z8 = this.f4095h;
        Path path = this.f4088a;
        if (z8) {
            return path;
        }
        path.reset();
        e1.a aVar = this.f4093f;
        if (aVar.f37239e) {
            this.f4095h = true;
            return path;
        }
        PointF pointF = (PointF) this.f4091d.e();
        float f6 = pointF.x / 2.0f;
        float f9 = pointF.y / 2.0f;
        float f10 = f6 * 0.55228f;
        float f11 = f9 * 0.55228f;
        path.reset();
        if (aVar.f37238d) {
            float f12 = -f9;
            path.moveTo(0.0f, f12);
            float f13 = 0.0f - f10;
            float f14 = -f6;
            float f15 = 0.0f - f11;
            path.cubicTo(f13, f12, f14, f15, f14, 0.0f);
            float f16 = f11 + 0.0f;
            path.cubicTo(f14, f16, f13, f9, 0.0f, f9);
            float f17 = f10 + 0.0f;
            path.cubicTo(f17, f9, f6, f16, f6, 0.0f);
            path.cubicTo(f6, f15, f17, f12, 0.0f, f12);
        } else {
            float f18 = -f9;
            path.moveTo(0.0f, f18);
            float f19 = f10 + 0.0f;
            float f20 = 0.0f - f11;
            path.cubicTo(f19, f18, f6, f20, f6, 0.0f);
            float f21 = f11 + 0.0f;
            path.cubicTo(f6, f21, f19, f9, 0.0f, f9);
            float f22 = 0.0f - f10;
            float f23 = -f6;
            path.cubicTo(f22, f9, f23, f21, f23, 0.0f);
            path.cubicTo(f23, f20, f22, f18, 0.0f, f18);
        }
        PointF pointF2 = (PointF) this.f4092e.e();
        path.offset(pointF2.x, pointF2.y);
        path.close();
        this.f4094g.a(path);
        this.f4095h = true;
        return path;
    }

    @Override // Z0.c
    public final String getName() {
        return this.f4089b;
    }
}
