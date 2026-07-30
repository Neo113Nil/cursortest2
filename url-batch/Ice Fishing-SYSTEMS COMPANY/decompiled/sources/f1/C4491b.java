package f1;

import B2.N;
import S0.s;
import X0.v;
import X0.z;
import a1.AbstractC0421e;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.anythink.basead.exoplayer.k.p;
import d1.C4456b;
import j1.AbstractC4591d;
import j1.C4589b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import u.AbstractC5088e;

/* renamed from: f1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4491b extends AbstractC4490a {

    /* renamed from: D, reason: collision with root package name */
    public AbstractC0421e f37580D;

    /* renamed from: E, reason: collision with root package name */
    public final ArrayList f37581E;

    /* renamed from: F, reason: collision with root package name */
    public final RectF f37582F;

    /* renamed from: G, reason: collision with root package name */
    public final RectF f37583G;

    /* renamed from: H, reason: collision with root package name */
    public final RectF f37584H;

    /* renamed from: I, reason: collision with root package name */
    public final j1.i f37585I;
    public final G1.a J;

    /* renamed from: K, reason: collision with root package name */
    public float f37586K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f37587L;

    /* renamed from: M, reason: collision with root package name */
    public final a1.h f37588M;

    public C4491b(v vVar, C4493d c4493d, List list, X0.i iVar) {
        super(vVar, c4493d);
        AbstractC4490a abstractC4490a;
        AbstractC4490a c4491b;
        String str;
        this.f37581E = new ArrayList();
        this.f37582F = new RectF();
        this.f37583G = new RectF();
        this.f37584H = new RectF();
        this.f37585I = new j1.i();
        this.J = new G1.a((byte) 0, 16);
        this.f37587L = true;
        C4456b c4456b = c4493d.f37615s;
        if (c4456b != null) {
            a1.i a9 = c4456b.a();
            this.f37580D = a9;
            e(a9);
            this.f37580D.a(this);
        } else {
            this.f37580D = null;
        }
        s.e eVar = new s.e(iVar.f3677j.size());
        int size = list.size() - 1;
        AbstractC4490a abstractC4490a2 = null;
        while (true) {
            if (size < 0) {
                for (int i = 0; i < eVar.l(); i++) {
                    if (eVar.f40384n) {
                        eVar.i();
                    }
                    AbstractC4490a abstractC4490a3 = (AbstractC4490a) eVar.j(eVar.f40385u[i], null);
                    if (abstractC4490a3 != null && (abstractC4490a = (AbstractC4490a) eVar.j(abstractC4490a3.f37569p.f37603f, null)) != null) {
                        abstractC4490a3.f37573t = abstractC4490a;
                    }
                }
                N n9 = this.f37569p.f37620x;
                if (n9 != null) {
                    this.f37588M = new a1.h(this, this, n9);
                    return;
                }
                return;
            }
            C4493d c4493d2 = (C4493d) list.get(size);
            int d2 = AbstractC5088e.d(c4493d2.f37602e);
            if (d2 == 0) {
                c4491b = new C4491b(vVar, c4493d2, (List) iVar.f3671c.get(c4493d2.f37604g), iVar);
            } else if (d2 == 1) {
                c4491b = new C4496g(vVar, c4493d2);
            } else if (d2 == 2) {
                c4491b = new C4492c(vVar, c4493d2);
            } else if (d2 == 3) {
                c4491b = new C4494e(vVar, c4493d2);
            } else if (d2 == 4) {
                c4491b = new C4495f(vVar, c4493d2, this, iVar);
            } else if (d2 != 5) {
                switch (c4493d2.f37602e) {
                    case 1:
                        str = "PRE_COMP";
                        break;
                    case 2:
                        str = "SOLID";
                        break;
                    case 3:
                        str = "IMAGE";
                        break;
                    case 4:
                        str = "NULL";
                        break;
                    case 5:
                        str = "SHAPE";
                        break;
                    case 6:
                        str = "TEXT";
                        break;
                    case 7:
                        str = "UNKNOWN";
                        break;
                    default:
                        str = "null";
                        break;
                }
                AbstractC4591d.b("Unknown layer type ".concat(str));
                c4491b = null;
            } else {
                c4491b = new i(vVar, c4493d2);
            }
            if (c4491b != null) {
                eVar.k(c4491b.f37569p.f37601d, c4491b);
                if (abstractC4490a2 != null) {
                    abstractC4490a2.f37572s = c4491b;
                    abstractC4490a2 = null;
                } else {
                    this.f37581E.add(0, c4491b);
                    int d3 = AbstractC5088e.d(c4493d2.f37617u);
                    if (d3 == 1 || d3 == 2) {
                        abstractC4490a2 = c4491b;
                    }
                }
            }
            size--;
        }
    }

    @Override // f1.AbstractC4490a, c1.f
    public final void c(ColorFilter colorFilter, s sVar) {
        super.c(colorFilter, sVar);
        if (colorFilter == z.f3774C) {
            a1.s sVar2 = new a1.s(sVar, null);
            this.f37580D = sVar2;
            sVar2.a(this);
            e(this.f37580D);
            return;
        }
        a1.h hVar = this.f37588M;
        if (colorFilter == 5 && hVar != null) {
            hVar.f4313c.j(sVar);
            return;
        }
        if (colorFilter == z.f3776E && hVar != null) {
            hVar.c(sVar);
            return;
        }
        if (colorFilter == z.f3777F && hVar != null) {
            hVar.f4315e.j(sVar);
            return;
        }
        if (colorFilter == z.f3778G && hVar != null) {
            hVar.f4316f.j(sVar);
        } else {
            if (colorFilter != z.f3779H || hVar == null) {
                return;
            }
            hVar.f4317g.j(sVar);
        }
    }

    @Override // f1.AbstractC4490a, Z0.e
    public final void d(RectF rectF, Matrix matrix, boolean z8) {
        super.d(rectF, matrix, z8);
        ArrayList arrayList = this.f37581E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            RectF rectF2 = this.f37582F;
            rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((AbstractC4490a) arrayList.get(size)).d(rectF2, this.f37567n, true);
            rectF.union(rectF2);
        }
    }

    @Override // f1.AbstractC4490a
    public final void k(Canvas canvas, Matrix matrix, int i, C4589b c4589b) {
        Canvas canvas2;
        a1.h hVar = this.f37588M;
        boolean z8 = false;
        boolean z9 = (c4589b == null && hVar == null) ? false : true;
        v vVar = this.f37568o;
        boolean z10 = vVar.f3732L;
        ArrayList arrayList = this.f37581E;
        int i4 = p.f8630b;
        if ((z10 && arrayList.size() > 1 && i != 255) || (z9 && vVar.f3733M)) {
            z8 = true;
        }
        if (!z8) {
            i4 = i;
        }
        if (hVar != null) {
            c4589b = hVar.b(matrix, i4);
        }
        boolean z11 = this.f37587L;
        RectF rectF = this.f37583G;
        C4493d c4493d = this.f37569p;
        if (z11 || !"__container".equals(c4493d.f37600c)) {
            rectF.set(0.0f, 0.0f, c4493d.f37611o, c4493d.f37612p);
            matrix.mapRect(rectF);
        } else {
            rectF.setEmpty();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AbstractC4490a abstractC4490a = (AbstractC4490a) it.next();
                RectF rectF2 = this.f37584H;
                abstractC4490a.d(rectF2, matrix, true);
                rectF.union(rectF2);
            }
        }
        j1.i iVar = this.f37585I;
        if (z8) {
            G1.a aVar = this.J;
            aVar.f1195v = null;
            aVar.f1194u = i;
            if (c4589b != null) {
                if (Color.alpha(c4589b.f38482d) > 0) {
                    aVar.f1195v = c4589b;
                } else {
                    aVar.f1195v = null;
                }
                c4589b = null;
            }
            canvas2 = iVar.e(canvas, rectF, aVar);
        } else {
            canvas2 = canvas;
        }
        canvas.save();
        if (canvas.clipRect(rectF)) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((AbstractC4490a) arrayList.get(size)).h(canvas2, matrix, i4, c4589b);
            }
        }
        if (z8) {
            iVar.c();
        }
        canvas.restore();
    }

    @Override // f1.AbstractC4490a
    public final void p(c1.e eVar, int i, ArrayList arrayList, c1.e eVar2) {
        int i4 = 0;
        while (true) {
            ArrayList arrayList2 = this.f37581E;
            if (i4 >= arrayList2.size()) {
                return;
            }
            ((AbstractC4490a) arrayList2.get(i4)).f(eVar, i, arrayList, eVar2);
            i4++;
        }
    }

    @Override // f1.AbstractC4490a
    public final void q(boolean z8) {
        super.q(z8);
        Iterator it = this.f37581E.iterator();
        while (it.hasNext()) {
            ((AbstractC4490a) it.next()).q(z8);
        }
    }

    @Override // f1.AbstractC4490a
    public final void r(float f6) {
        this.f37586K = f6;
        super.r(f6);
        AbstractC0421e abstractC0421e = this.f37580D;
        C4493d c4493d = this.f37569p;
        if (abstractC0421e != null) {
            X0.i iVar = this.f37568o.f3746n;
            f6 = ((((Float) abstractC0421e.e()).floatValue() * c4493d.f37599b.f3681n) - c4493d.f37599b.f3679l) / ((iVar.f3680m - iVar.f3679l) + 0.01f);
        }
        if (this.f37580D == null) {
            X0.i iVar2 = c4493d.f37599b;
            f6 -= c4493d.f37610n / (iVar2.f3680m - iVar2.f3679l);
        }
        if (c4493d.f37609m != 0.0f && !"__container".equals(c4493d.f37600c)) {
            f6 /= c4493d.f37609m;
        }
        ArrayList arrayList = this.f37581E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((AbstractC4490a) arrayList.get(size)).r(f6);
        }
    }
}
