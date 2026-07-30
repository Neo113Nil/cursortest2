package Z0;

import X0.v;
import X0.z;
import a1.AbstractC0421e;
import a1.InterfaceC0417a;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import com.google.android.gms.internal.ads.CL;
import f1.AbstractC4490a;
import java.util.ArrayList;
import java.util.List;
import u.AbstractC5088e;

/* loaded from: classes.dex */
public final class n implements m, InterfaceC0417a, k {

    /* renamed from: e, reason: collision with root package name */
    public final String f4146e;

    /* renamed from: f, reason: collision with root package name */
    public final v f4147f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4148g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f4149h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final a1.i f4150j;

    /* renamed from: k, reason: collision with root package name */
    public final AbstractC0421e f4151k;

    /* renamed from: l, reason: collision with root package name */
    public final a1.i f4152l;

    /* renamed from: m, reason: collision with root package name */
    public final a1.i f4153m;

    /* renamed from: n, reason: collision with root package name */
    public final a1.i f4154n;

    /* renamed from: o, reason: collision with root package name */
    public final a1.i f4155o;

    /* renamed from: p, reason: collision with root package name */
    public final a1.i f4156p;

    /* renamed from: r, reason: collision with root package name */
    public boolean f4158r;

    /* renamed from: a, reason: collision with root package name */
    public final Path f4142a = new Path();

    /* renamed from: b, reason: collision with root package name */
    public final Path f4143b = new Path();

    /* renamed from: c, reason: collision with root package name */
    public final PathMeasure f4144c = new PathMeasure();

    /* renamed from: d, reason: collision with root package name */
    public final float[] f4145d = new float[2];

    /* renamed from: q, reason: collision with root package name */
    public final I1.f f4157q = new I1.f(1);

    public n(v vVar, AbstractC4490a abstractC4490a, e1.h hVar) {
        this.f4147f = vVar;
        this.f4146e = hVar.f37268a;
        int i = hVar.f37269b;
        this.f4148g = i;
        this.f4149h = hVar.f37276j;
        this.i = hVar.f37277k;
        a1.i a9 = hVar.f37270c.a();
        this.f4150j = a9;
        AbstractC0421e a10 = hVar.f37271d.a();
        this.f4151k = a10;
        a1.i a11 = hVar.f37272e.a();
        this.f4152l = a11;
        a1.i a12 = hVar.f37274g.a();
        this.f4154n = a12;
        a1.i a13 = hVar.i.a();
        this.f4156p = a13;
        if (i == 1) {
            this.f4153m = hVar.f37273f.a();
            this.f4155o = hVar.f37275h.a();
        } else {
            this.f4153m = null;
            this.f4155o = null;
        }
        abstractC4490a.e(a9);
        abstractC4490a.e(a10);
        abstractC4490a.e(a11);
        abstractC4490a.e(a12);
        abstractC4490a.e(a13);
        if (i == 1) {
            abstractC4490a.e(this.f4153m);
            abstractC4490a.e(this.f4155o);
        }
        a9.a(this);
        a10.a(this);
        a11.a(this);
        a12.a(this);
        a13.a(this);
        if (i == 1) {
            this.f4153m.a(this);
            this.f4155o.a(this);
        }
    }

    @Override // a1.InterfaceC0417a
    public final void a() {
        this.f4158r = false;
        this.f4147f.invalidateSelf();
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
                    this.f4157q.f1255a.add(tVar);
                    tVar.c(this);
                }
            }
            i++;
        }
    }

    @Override // c1.f
    public final void c(ColorFilter colorFilter, S0.s sVar) {
        a1.i iVar;
        a1.i iVar2;
        if (colorFilter == z.f3804u) {
            this.f4150j.j(sVar);
            return;
        }
        if (colorFilter == z.f3805v) {
            this.f4152l.j(sVar);
            return;
        }
        if (colorFilter == z.i) {
            this.f4151k.j(sVar);
            return;
        }
        if (colorFilter == z.f3806w && (iVar2 = this.f4153m) != null) {
            iVar2.j(sVar);
            return;
        }
        if (colorFilter == z.f3807x) {
            this.f4154n.j(sVar);
            return;
        }
        if (colorFilter == z.f3808y && (iVar = this.f4155o) != null) {
            iVar.j(sVar);
        } else if (colorFilter == z.f3809z) {
            this.f4156p.j(sVar);
        }
    }

    @Override // c1.f
    public final void f(c1.e eVar, int i, ArrayList arrayList, c1.e eVar2) {
        j1.h.g(eVar, i, arrayList, eVar2, this);
    }

    @Override // Z0.m
    public final Path g() {
        boolean z8;
        double d2;
        float f6;
        float f9;
        double d3;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        int i;
        int i4;
        double d9;
        boolean z9 = this.f4158r;
        Path path = this.f4142a;
        if (z9) {
            return path;
        }
        path.reset();
        if (this.f4149h) {
            this.f4158r = true;
            return path;
        }
        int d10 = AbstractC5088e.d(this.f4148g);
        AbstractC0421e abstractC0421e = this.f4151k;
        float f16 = 0.0f;
        a1.i iVar = this.f4154n;
        a1.i iVar2 = this.f4156p;
        a1.i iVar3 = this.f4152l;
        a1.i iVar4 = this.f4150j;
        if (d10 == 0) {
            z8 = true;
            float floatValue = ((Float) iVar4.e()).floatValue();
            double radians = Math.toRadians((iVar3 != null ? ((Float) iVar3.e()).floatValue() : 0.0d) - 90.0d);
            double d11 = floatValue;
            float f17 = (float) (6.283185307179586d / d11);
            if (this.i) {
                f17 *= -1.0f;
            }
            float f18 = f17;
            float f19 = f18 / 2.0f;
            float f20 = floatValue - ((int) floatValue);
            if (f20 != 0.0f) {
                d2 = d11;
                radians += (1.0f - f20) * f19;
            } else {
                d2 = d11;
            }
            float floatValue2 = ((Float) iVar.e()).floatValue();
            float floatValue3 = ((Float) this.f4153m.e()).floatValue();
            a1.i iVar5 = this.f4155o;
            float floatValue4 = iVar5 != null ? ((Float) iVar5.e()).floatValue() / 100.0f : 0.0f;
            float floatValue5 = iVar2 != null ? ((Float) iVar2.e()).floatValue() / 100.0f : 0.0f;
            if (f20 != 0.0f) {
                float a9 = CL.a(floatValue2, floatValue3, f20, floatValue3);
                double d12 = a9;
                f10 = (float) (Math.cos(radians) * d12);
                f11 = (float) (Math.sin(radians) * d12);
                path.moveTo(f10, f11);
                f6 = 2.0f;
                d3 = radians + ((f18 * f20) / 2.0f);
                f12 = a9;
                f9 = f19;
            } else {
                f6 = 2.0f;
                double d13 = floatValue2;
                float cos = (float) (Math.cos(radians) * d13);
                float sin = (float) (Math.sin(radians) * d13);
                path.moveTo(cos, sin);
                f9 = f19;
                d3 = radians + f9;
                f10 = cos;
                f11 = sin;
                f12 = 0.0f;
            }
            double ceil = Math.ceil(d2) * 2.0d;
            double d14 = d3;
            int i9 = 0;
            boolean z10 = false;
            while (true) {
                double d15 = i9;
                if (d15 >= ceil) {
                    break;
                }
                float f21 = z10 ? floatValue2 : floatValue3;
                if (f12 == f16 || d15 != ceil - 2.0d) {
                    f13 = f16;
                    f14 = f9;
                } else {
                    f13 = f16;
                    f14 = (f18 * f20) / f6;
                }
                if (f12 != f16 && d15 == ceil - 1.0d) {
                    f21 = f12;
                }
                double d16 = f21;
                float cos2 = (float) (Math.cos(d14) * d16);
                float f22 = f18;
                float sin2 = (float) (Math.sin(d14) * d16);
                if (floatValue4 == f13 && floatValue5 == f13) {
                    path.lineTo(cos2, sin2);
                    f15 = f20;
                    i = i9;
                } else {
                    f15 = f20;
                    Path path2 = path;
                    float f23 = f11;
                    double atan2 = (float) (Math.atan2(f11, f10) - 1.5707963267948966d);
                    float cos3 = (float) Math.cos(atan2);
                    float sin3 = (float) Math.sin(atan2);
                    i = i9;
                    float f24 = f10;
                    double atan22 = (float) (Math.atan2(sin2, cos2) - 1.5707963267948966d);
                    float cos4 = (float) Math.cos(atan22);
                    float sin4 = (float) Math.sin(atan22);
                    float f25 = z10 ? floatValue4 : floatValue5;
                    float f26 = z10 ? floatValue5 : floatValue4;
                    float f27 = (z10 ? floatValue3 : floatValue2) * f25 * 0.47829f;
                    float f28 = cos3 * f27;
                    float f29 = f27 * sin3;
                    float f30 = (z10 ? floatValue2 : floatValue3) * f26 * 0.47829f;
                    float f31 = cos4 * f30;
                    float f32 = f30 * sin4;
                    if (f20 != 0.0f) {
                        if (i == 0) {
                            f28 *= f15;
                            f29 *= f15;
                        } else if (d15 == ceil - 1.0d) {
                            f31 *= f15;
                            f32 *= f15;
                        }
                    }
                    path = path2;
                    path.cubicTo(f24 - f28, f23 - f29, f31 + cos2, sin2 + f32, cos2, sin2);
                }
                d14 += f14;
                z10 = !z10;
                i9 = i + 1;
                f10 = cos2;
                f11 = sin2;
                f20 = f15;
                f18 = f22;
                f16 = f13;
            }
            PointF pointF = (PointF) abstractC0421e.e();
            path.offset(pointF.x, pointF.y);
            path.close();
        } else if (d10 != 1) {
            z8 = true;
        } else {
            int floor = (int) Math.floor(((Float) iVar4.e()).floatValue());
            double radians2 = Math.toRadians((iVar3 != null ? ((Float) iVar3.e()).floatValue() : 0.0d) - 90.0d);
            double d17 = floor;
            float floatValue6 = ((Float) iVar2.e()).floatValue() / 100.0f;
            float floatValue7 = ((Float) iVar.e()).floatValue();
            double d18 = floatValue7;
            z8 = true;
            float cos5 = (float) (Math.cos(radians2) * d18);
            float sin5 = (float) (Math.sin(radians2) * d18);
            path.moveTo(cos5, sin5);
            double d19 = (float) (6.283185307179586d / d17);
            double ceil2 = Math.ceil(d17);
            double d20 = radians2 + d19;
            int i10 = 0;
            while (true) {
                double d21 = i10;
                if (d21 >= ceil2) {
                    break;
                }
                double d22 = ceil2;
                float cos6 = (float) (Math.cos(d20) * d18);
                float sin6 = (float) (Math.sin(d20) * d18);
                if (floatValue6 != 0.0f) {
                    i4 = i10;
                    Path path3 = path;
                    d9 = d19;
                    double atan23 = (float) (Math.atan2(sin5, cos5) - 1.5707963267948966d);
                    float cos7 = (float) Math.cos(atan23);
                    float sin7 = (float) Math.sin(atan23);
                    float f33 = cos5;
                    double atan24 = (float) (Math.atan2(sin6, cos6) - 1.5707963267948966d);
                    float f34 = floatValue7 * floatValue6 * 0.25f;
                    float f35 = cos7 * f34;
                    float f36 = f34 * sin7;
                    float cos8 = ((float) Math.cos(atan24)) * f34;
                    float sin8 = f34 * ((float) Math.sin(atan24));
                    if (d21 == d22 - 1.0d) {
                        Path path4 = this.f4143b;
                        path4.reset();
                        path4.moveTo(f33, sin5);
                        float f37 = f33 - f35;
                        float f38 = sin5 - f36;
                        float f39 = cos6 + cos8;
                        float f40 = sin6 + sin8;
                        path4.cubicTo(f37, f38, f39, f40, cos6, sin6);
                        PathMeasure pathMeasure = this.f4144c;
                        pathMeasure.setPath(path4, false);
                        float length = pathMeasure.getLength() * 0.9999f;
                        float[] fArr = this.f4145d;
                        pathMeasure.getPosTan(length, fArr, null);
                        path = path3;
                        path.cubicTo(f37, f38, f39, f40, fArr[0], fArr[1]);
                        cos5 = cos6;
                        sin5 = sin6;
                    } else {
                        float f41 = sin6 + sin8;
                        path = path3;
                        path.cubicTo(f33 - f35, sin5 - f36, cos6 + cos8, f41, cos6, sin6);
                        cos5 = cos6;
                        sin5 = sin6;
                    }
                } else {
                    i4 = i10;
                    d9 = d19;
                    cos5 = cos6;
                    sin5 = sin6;
                    if (d21 == d22 - 1.0d) {
                        i10 = i4 + 1;
                        d19 = d9;
                        ceil2 = d22;
                    } else {
                        path.lineTo(cos5, sin5);
                    }
                }
                d20 += d9;
                i10 = i4 + 1;
                d19 = d9;
                ceil2 = d22;
            }
            PointF pointF2 = (PointF) abstractC0421e.e();
            path.offset(pointF2.x, pointF2.y);
            path.close();
        }
        path.close();
        this.f4157q.a(path);
        this.f4158r = z8;
        return path;
    }

    @Override // Z0.c
    public final String getName() {
        return this.f4146e;
    }
}
