package a1;

import X0.z;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PointF;
import d1.C4455a;
import d1.C4456b;
import f1.AbstractC4490a;
import java.util.Collections;
import k1.C4628a;
import k1.C4629b;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: b, reason: collision with root package name */
    public final Matrix f4341b;

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f4342c;

    /* renamed from: d, reason: collision with root package name */
    public final Matrix f4343d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f4344e;

    /* renamed from: l, reason: collision with root package name */
    public AbstractC0421e f4350l;

    /* renamed from: m, reason: collision with root package name */
    public AbstractC0421e f4351m;

    /* renamed from: n, reason: collision with root package name */
    public AbstractC0421e f4352n;

    /* renamed from: o, reason: collision with root package name */
    public AbstractC0421e f4353o;

    /* renamed from: p, reason: collision with root package name */
    public AbstractC0421e f4354p;

    /* renamed from: q, reason: collision with root package name */
    public i f4355q;

    /* renamed from: r, reason: collision with root package name */
    public i f4356r;

    /* renamed from: s, reason: collision with root package name */
    public i f4357s;

    /* renamed from: t, reason: collision with root package name */
    public i f4358t;

    /* renamed from: u, reason: collision with root package name */
    public i f4359u;

    /* renamed from: v, reason: collision with root package name */
    public AbstractC0421e f4360v;

    /* renamed from: w, reason: collision with root package name */
    public AbstractC0421e f4361w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f4362x;

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f4340a = new Matrix();

    /* renamed from: f, reason: collision with root package name */
    public float f4345f = Float.NaN;

    /* renamed from: g, reason: collision with root package name */
    public float f4346g = Float.NaN;

    /* renamed from: h, reason: collision with root package name */
    public float f4347h = Float.NaN;
    public float i = 1.0f;

    /* renamed from: j, reason: collision with root package name */
    public float f4348j = 1.0f;

    /* renamed from: k, reason: collision with root package name */
    public boolean f4349k = true;

    public r(d1.d dVar) {
        I1.b bVar = dVar.f37187a;
        this.f4350l = bVar == null ? null : bVar.a();
        d1.e eVar = dVar.f37188b;
        this.f4351m = eVar == null ? null : eVar.a();
        C4455a c4455a = dVar.f37189c;
        this.f4352n = c4455a == null ? null : c4455a.a();
        C4456b c4456b = dVar.f37190d;
        this.f4353o = c4456b == null ? null : c4456b.a();
        C4456b c4456b2 = dVar.f37192f;
        this.f4355q = c4456b2 == null ? null : c4456b2.a();
        this.f4362x = dVar.f37198m;
        C4456b c4456b3 = dVar.f37194h;
        this.f4357s = c4456b3 == null ? null : c4456b3.a();
        C4456b c4456b4 = dVar.i;
        this.f4358t = c4456b4 == null ? null : c4456b4.a();
        C4456b c4456b5 = dVar.f37195j;
        this.f4359u = c4456b5 == null ? null : c4456b5.a();
        if (this.f4355q != null) {
            this.f4341b = new Matrix();
            this.f4342c = new Matrix();
            this.f4343d = new Matrix();
            this.f4344e = new float[9];
        } else {
            this.f4341b = null;
            this.f4342c = null;
            this.f4343d = null;
            this.f4344e = null;
        }
        C4456b c4456b6 = dVar.f37193g;
        this.f4356r = c4456b6 == null ? null : c4456b6.a();
        C4455a c4455a2 = dVar.f37191e;
        if (c4455a2 != null) {
            this.f4354p = c4455a2.a();
        }
        C4456b c4456b7 = dVar.f37196k;
        if (c4456b7 != null) {
            this.f4360v = c4456b7.a();
        } else {
            this.f4360v = null;
        }
        C4456b c4456b8 = dVar.f37197l;
        if (c4456b8 != null) {
            this.f4361w = c4456b8.a();
        } else {
            this.f4361w = null;
        }
    }

    public final void a(AbstractC4490a abstractC4490a) {
        abstractC4490a.e(this.f4354p);
        abstractC4490a.e(this.f4360v);
        abstractC4490a.e(this.f4361w);
        abstractC4490a.e(this.f4350l);
        abstractC4490a.e(this.f4351m);
        abstractC4490a.e(this.f4352n);
        abstractC4490a.e(this.f4353o);
        abstractC4490a.e(this.f4355q);
        abstractC4490a.e(this.f4356r);
        abstractC4490a.e(this.f4357s);
        abstractC4490a.e(this.f4358t);
        abstractC4490a.e(this.f4359u);
    }

    public final void b(InterfaceC0417a interfaceC0417a) {
        AbstractC0421e abstractC0421e = this.f4354p;
        if (abstractC0421e != null) {
            abstractC0421e.a(interfaceC0417a);
        }
        AbstractC0421e abstractC0421e2 = this.f4360v;
        if (abstractC0421e2 != null) {
            abstractC0421e2.a(interfaceC0417a);
        }
        AbstractC0421e abstractC0421e3 = this.f4361w;
        if (abstractC0421e3 != null) {
            abstractC0421e3.a(interfaceC0417a);
        }
        AbstractC0421e abstractC0421e4 = this.f4350l;
        if (abstractC0421e4 != null) {
            abstractC0421e4.a(interfaceC0417a);
        }
        AbstractC0421e abstractC0421e5 = this.f4351m;
        if (abstractC0421e5 != null) {
            abstractC0421e5.a(interfaceC0417a);
        }
        AbstractC0421e abstractC0421e6 = this.f4352n;
        if (abstractC0421e6 != null) {
            abstractC0421e6.a(interfaceC0417a);
        }
        AbstractC0421e abstractC0421e7 = this.f4353o;
        if (abstractC0421e7 != null) {
            abstractC0421e7.a(interfaceC0417a);
        }
        i iVar = this.f4355q;
        if (iVar != null) {
            iVar.a(interfaceC0417a);
        }
        i iVar2 = this.f4356r;
        if (iVar2 != null) {
            iVar2.a(interfaceC0417a);
        }
        i iVar3 = this.f4357s;
        if (iVar3 != null) {
            iVar3.a(interfaceC0417a);
            this.f4357s.a(new q(0, this));
        }
        i iVar4 = this.f4358t;
        if (iVar4 != null) {
            iVar4.a(interfaceC0417a);
            this.f4358t.a(new q(1, this));
        }
        i iVar5 = this.f4359u;
        if (iVar5 != null) {
            iVar5.a(interfaceC0417a);
            this.f4359u.a(new q(2, this));
        }
    }

    public final boolean c(ColorFilter colorFilter, S0.s sVar) {
        if (colorFilter == z.f3785a) {
            AbstractC0421e abstractC0421e = this.f4350l;
            if (abstractC0421e == null) {
                this.f4350l = new s(sVar, new PointF());
                return true;
            }
            abstractC0421e.j(sVar);
            return true;
        }
        if (colorFilter == z.f3786b) {
            AbstractC0421e abstractC0421e2 = this.f4351m;
            if (abstractC0421e2 == null) {
                this.f4351m = new s(sVar, new PointF());
                return true;
            }
            abstractC0421e2.j(sVar);
            return true;
        }
        if (colorFilter == z.f3787c) {
            AbstractC0421e abstractC0421e3 = this.f4351m;
            if (abstractC0421e3 instanceof o) {
                o oVar = (o) abstractC0421e3;
                S0.s sVar2 = oVar.f4333m;
                oVar.f4333m = sVar;
                return true;
            }
        }
        if (colorFilter == z.f3788d) {
            AbstractC0421e abstractC0421e4 = this.f4351m;
            if (abstractC0421e4 instanceof o) {
                o oVar2 = (o) abstractC0421e4;
                S0.s sVar3 = oVar2.f4334n;
                oVar2.f4334n = sVar;
                return true;
            }
        }
        if (colorFilter == z.f3793j) {
            AbstractC0421e abstractC0421e5 = this.f4352n;
            if (abstractC0421e5 == null) {
                this.f4352n = new s(sVar, new C4629b());
                return true;
            }
            abstractC0421e5.j(sVar);
            return true;
        }
        if (colorFilter == z.f3794k) {
            AbstractC0421e abstractC0421e6 = this.f4353o;
            if (abstractC0421e6 == null) {
                this.f4353o = new s(sVar, Float.valueOf(0.0f));
                return true;
            }
            abstractC0421e6.j(sVar);
            return true;
        }
        if (colorFilter == 3) {
            AbstractC0421e abstractC0421e7 = this.f4354p;
            if (abstractC0421e7 == null) {
                this.f4354p = new s(sVar, 100);
                return true;
            }
            abstractC0421e7.j(sVar);
            return true;
        }
        if (colorFilter == z.f3772A) {
            AbstractC0421e abstractC0421e8 = this.f4360v;
            if (abstractC0421e8 == null) {
                this.f4360v = new s(sVar, Float.valueOf(100.0f));
                return true;
            }
            abstractC0421e8.j(sVar);
            return true;
        }
        if (colorFilter == z.f3773B) {
            AbstractC0421e abstractC0421e9 = this.f4361w;
            if (abstractC0421e9 == null) {
                this.f4361w = new s(sVar, Float.valueOf(100.0f));
                return true;
            }
            abstractC0421e9.j(sVar);
            return true;
        }
        if (colorFilter == z.f3798o) {
            if (this.f4355q == null) {
                this.f4355q = new i(Collections.singletonList(new C4628a(Float.valueOf(0.0f))));
            }
            this.f4355q.j(sVar);
            return true;
        }
        if (colorFilter == z.f3799p) {
            if (this.f4356r == null) {
                this.f4356r = new i(Collections.singletonList(new C4628a(Float.valueOf(0.0f))));
            }
            this.f4356r.j(sVar);
            return true;
        }
        if (colorFilter == z.f3795l) {
            if (this.f4357s == null) {
                this.f4357s = new i(Collections.singletonList(new C4628a(Float.valueOf(0.0f))));
            }
            this.f4357s.j(sVar);
            return true;
        }
        if (colorFilter == z.f3796m) {
            if (this.f4358t == null) {
                this.f4358t = new i(Collections.singletonList(new C4628a(Float.valueOf(0.0f))));
            }
            this.f4358t.j(sVar);
            return true;
        }
        if (colorFilter != z.f3797n) {
            return false;
        }
        if (this.f4359u == null) {
            this.f4359u = new i(Collections.singletonList(new C4628a(Float.valueOf(0.0f))));
        }
        this.f4359u.j(sVar);
        return true;
    }

    public final void d() {
        for (int i = 0; i < 9; i++) {
            this.f4344e[i] = 0.0f;
        }
    }

    public final Matrix e() {
        i iVar;
        i iVar2;
        PointF pointF;
        C4629b c4629b;
        PointF pointF2;
        Matrix matrix = this.f4340a;
        matrix.reset();
        i iVar3 = this.f4357s;
        if ((iVar3 == null || iVar3.l() == 0.0f) && (((iVar = this.f4358t) == null || iVar.l() == 0.0f) && ((iVar2 = this.f4359u) == null || iVar2.l() == 0.0f))) {
            AbstractC0421e abstractC0421e = this.f4351m;
            if (abstractC0421e != null && (pointF2 = (PointF) abstractC0421e.e()) != null) {
                float f6 = pointF2.x;
                if (f6 != 0.0f || pointF2.y != 0.0f) {
                    matrix.preTranslate(f6, pointF2.y);
                }
            }
            if (!this.f4362x) {
                AbstractC0421e abstractC0421e2 = this.f4353o;
                if (abstractC0421e2 != null) {
                    float floatValue = abstractC0421e2 instanceof s ? ((Float) abstractC0421e2.e()).floatValue() : ((i) abstractC0421e2).l();
                    if (floatValue != 0.0f) {
                        matrix.preRotate(floatValue);
                    }
                }
            } else if (abstractC0421e != null) {
                float f9 = abstractC0421e.f4305d;
                PointF pointF3 = (PointF) abstractC0421e.e();
                float f10 = pointF3.x;
                float f11 = pointF3.y;
                abstractC0421e.i(1.0E-4f + f9);
                PointF pointF4 = (PointF) abstractC0421e.e();
                abstractC0421e.i(f9);
                matrix.preRotate((float) Math.toDegrees(Math.atan2(pointF4.y - f11, pointF4.x - f10)));
            }
            if (this.f4355q != null) {
                float cos = this.f4356r == null ? 0.0f : (float) Math.cos(Math.toRadians((-r5.l()) + 90.0f));
                float sin = this.f4356r == null ? 1.0f : (float) Math.sin(Math.toRadians((-r7.l()) + 90.0f));
                float tan = (float) Math.tan(Math.toRadians(r1.l()));
                d();
                float[] fArr = this.f4344e;
                fArr[0] = cos;
                fArr[1] = sin;
                float f12 = -sin;
                fArr[3] = f12;
                fArr[4] = cos;
                fArr[8] = 1.0f;
                Matrix matrix2 = this.f4341b;
                matrix2.setValues(fArr);
                d();
                fArr[0] = 1.0f;
                fArr[3] = tan;
                fArr[4] = 1.0f;
                fArr[8] = 1.0f;
                Matrix matrix3 = this.f4342c;
                matrix3.setValues(fArr);
                d();
                fArr[0] = cos;
                fArr[1] = f12;
                fArr[3] = sin;
                fArr[4] = cos;
                fArr[8] = 1.0f;
                Matrix matrix4 = this.f4343d;
                matrix4.setValues(fArr);
                matrix3.preConcat(matrix2);
                matrix4.preConcat(matrix3);
                matrix.preConcat(matrix4);
            }
            AbstractC0421e abstractC0421e3 = this.f4352n;
            if (abstractC0421e3 != null && (c4629b = (C4629b) abstractC0421e3.e()) != null) {
                float f13 = c4629b.f38686a;
                if (f13 != 1.0f || c4629b.f38687b != 1.0f) {
                    matrix.preScale(f13, c4629b.f38687b);
                }
            }
            AbstractC0421e abstractC0421e4 = this.f4350l;
            if (abstractC0421e4 != null && (pointF = (PointF) abstractC0421e4.e()) != null) {
                float f14 = pointF.x;
                if (f14 != 0.0f || pointF.y != 0.0f) {
                    matrix.preTranslate(-f14, -pointF.y);
                }
            }
        } else {
            i iVar4 = this.f4357s;
            float l9 = iVar4 != null ? iVar4.l() : 0.0f;
            i iVar5 = this.f4358t;
            float l10 = iVar5 != null ? iVar5.l() : 0.0f;
            i iVar6 = this.f4359u;
            float l11 = iVar6 != null ? iVar6.l() : 0.0f;
            if (this.f4349k || l9 != this.f4345f || l10 != this.f4346g || l11 != this.f4347h) {
                this.f4345f = l9;
                this.f4346g = l10;
                this.f4347h = l11;
                if (l9 != 0.0f) {
                    this.i = (float) Math.cos(Math.toRadians(l9));
                } else {
                    this.i = 1.0f;
                }
                if (l10 != 0.0f) {
                    this.f4348j = (float) Math.cos(Math.toRadians(l10));
                } else {
                    this.f4348j = 1.0f;
                }
                this.f4349k = false;
            }
            AbstractC0421e abstractC0421e5 = this.f4350l;
            PointF pointF5 = abstractC0421e5 == null ? null : (PointF) abstractC0421e5.e();
            AbstractC0421e abstractC0421e6 = this.f4351m;
            PointF pointF6 = abstractC0421e6 == null ? null : (PointF) abstractC0421e6.e();
            AbstractC0421e abstractC0421e7 = this.f4352n;
            C4629b c4629b2 = abstractC0421e7 != null ? (C4629b) abstractC0421e7.e() : null;
            float f15 = c4629b2 != null ? c4629b2.f38686a : 1.0f;
            float f16 = c4629b2 != null ? c4629b2.f38687b : 1.0f;
            float f17 = this.i;
            float f18 = this.f4348j;
            matrix.reset();
            if (pointF6 != null) {
                float f19 = pointF6.x;
                if (f19 != 0.0f || pointF6.y != 0.0f) {
                    matrix.preTranslate(f19, pointF6.y);
                }
            }
            if (l11 != 0.0f) {
                matrix.preRotate(l11);
            }
            if (l10 != 0.0f) {
                matrix.preScale(f18, 1.0f);
            }
            if (l9 != 0.0f) {
                matrix.preScale(1.0f, f17);
            }
            if (f15 != 1.0f || f16 != 1.0f) {
                matrix.preScale(f15, f16);
            }
            if (pointF5 != null) {
                float f20 = pointF5.x;
                if (f20 != 0.0f || pointF5.y != 0.0f) {
                    matrix.preTranslate(-f20, -pointF5.y);
                    return matrix;
                }
            }
        }
        return matrix;
    }

    public final Matrix f(float f6) {
        AbstractC0421e abstractC0421e = this.f4351m;
        PointF pointF = abstractC0421e == null ? null : (PointF) abstractC0421e.e();
        AbstractC0421e abstractC0421e2 = this.f4352n;
        C4629b c4629b = abstractC0421e2 == null ? null : (C4629b) abstractC0421e2.e();
        AbstractC0421e abstractC0421e3 = this.f4350l;
        PointF pointF2 = abstractC0421e3 != null ? (PointF) abstractC0421e3.e() : null;
        Matrix matrix = this.f4340a;
        matrix.reset();
        if (pointF != null) {
            matrix.preTranslate(pointF.x * f6, pointF.y * f6);
        }
        i iVar = this.f4357s;
        float l9 = iVar != null ? iVar.l() * f6 : 0.0f;
        i iVar2 = this.f4358t;
        float l10 = iVar2 != null ? iVar2.l() * f6 : 0.0f;
        i iVar3 = this.f4359u;
        float l11 = iVar3 != null ? iVar3.l() * f6 : 0.0f;
        if (l9 == 0.0f && l10 == 0.0f && l11 == 0.0f) {
            AbstractC0421e abstractC0421e4 = this.f4353o;
            if (abstractC0421e4 != null) {
                matrix.preRotate(((Float) abstractC0421e4.e()).floatValue() * f6, pointF2 == null ? 0.0f : pointF2.x, pointF2 != null ? pointF2.y : 0.0f);
            }
        } else {
            float cos = l9 != 0.0f ? (float) Math.cos(Math.toRadians(l9)) : 1.0f;
            float cos2 = l10 != 0.0f ? (float) Math.cos(Math.toRadians(l10)) : 1.0f;
            if (l11 != 0.0f) {
                matrix.preRotate(l11, pointF2 == null ? 0.0f : pointF2.x, pointF2 != null ? pointF2.y : 0.0f);
            }
            if (l10 != 0.0f) {
                matrix.preScale(cos2, 1.0f);
            }
            if (l9 != 0.0f) {
                matrix.preScale(1.0f, cos);
            }
        }
        if (c4629b != null) {
            double d2 = f6;
            matrix.preScale((float) Math.pow(c4629b.f38686a, d2), (float) Math.pow(c4629b.f38687b, d2));
        }
        return matrix;
    }
}
