package B0;

import android.graphics.Matrix;
import android.graphics.Shader;
import b0.AbstractC0259J;
import b0.C0262M;
import b0.C0265P;
import b0.C0284q;
import b0.InterfaceC0285r;
import d0.AbstractC0322c;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final A2.w f268a;

    /* renamed from: b, reason: collision with root package name */
    public final int f269b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f270c;

    /* renamed from: d, reason: collision with root package name */
    public final float f271d;

    /* renamed from: e, reason: collision with root package name */
    public final float f272e;

    /* renamed from: f, reason: collision with root package name */
    public final int f273f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f274g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f275h;

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.List] */
    public j(A2.w wVar, long j3, int i3, boolean z3) {
        boolean z4;
        int g3;
        this.f268a = wVar;
        this.f269b = i3;
        if (M0.a.j(j3) != 0 || M0.a.i(j3) != 0) {
            throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) wVar.f197f;
        int size = arrayList2.size();
        int i4 = 0;
        int i5 = 0;
        float f3 = 0.0f;
        while (i4 < size) {
            m mVar = (m) arrayList2.get(i4);
            I0.d dVar = mVar.f285a;
            int h3 = M0.a.h(j3);
            if (M0.a.c(j3)) {
                g3 = M0.a.g(j3) - ((int) Math.ceil(f3));
                if (g3 < 0) {
                    g3 = 0;
                }
            } else {
                g3 = M0.a.g(j3);
            }
            C0004a c0004a = new C0004a(dVar, this.f269b - i5, z3, I2.l.b(h3, g3, 5));
            float b2 = c0004a.b() + f3;
            C0.C c3 = c0004a.f243d;
            int i6 = i5 + c3.f430f;
            ArrayList arrayList3 = arrayList2;
            arrayList.add(new l(c0004a, mVar.f286b, mVar.f287c, i5, i6, f3, b2));
            if (c3.f428d || (i6 == this.f269b && i4 != M1.m.b0((ArrayList) this.f268a.f197f))) {
                z4 = true;
                f3 = b2;
                i5 = i6;
                break;
            } else {
                i4++;
                f3 = b2;
                i5 = i6;
                arrayList2 = arrayList3;
            }
        }
        z4 = false;
        this.f272e = f3;
        this.f273f = i5;
        this.f270c = z4;
        this.f275h = arrayList;
        this.f271d = M0.a.h(j3);
        ArrayList arrayList4 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i7 = 0; i7 < size2; i7++) {
            l lVar = (l) arrayList.get(i7);
            ?? r7 = lVar.f278a.f245f;
            ArrayList arrayList5 = new ArrayList(r7.size());
            int size3 = r7.size();
            for (int i8 = 0; i8 < size3; i8++) {
                a0.d dVar2 = (a0.d) r7.get(i8);
                arrayList5.add(dVar2 != null ? dVar2.e(I2.l.f(0.0f, lVar.f283f)) : null);
            }
            M1.r.i0(arrayList5, arrayList4);
        }
        if (arrayList4.size() < ((List) this.f268a.f194c).size()) {
            int size4 = ((List) this.f268a.f194c).size() - arrayList4.size();
            ArrayList arrayList6 = new ArrayList(size4);
            for (int i9 = 0; i9 < size4; i9++) {
                arrayList6.add(null);
            }
            arrayList4 = M1.l.w0(arrayList4, arrayList6);
        }
        this.f274g = arrayList4;
    }

    public static void a(j jVar, InterfaceC0285r interfaceC0285r, AbstractC0259J abstractC0259J, float f3, C0262M c0262m, L0.g gVar, AbstractC0322c abstractC0322c) {
        interfaceC0285r.f();
        ArrayList arrayList = jVar.f275h;
        if (arrayList.size() <= 1) {
            I0.j.a(jVar, interfaceC0285r, abstractC0259J, f3, c0262m, gVar, abstractC0322c, 3);
        } else if (abstractC0259J instanceof C0265P) {
            I0.j.a(jVar, interfaceC0285r, abstractC0259J, f3, c0262m, gVar, abstractC0322c, 3);
        } else if (abstractC0259J instanceof C0284q) {
            int size = arrayList.size();
            float f4 = 0.0f;
            float f5 = 0.0f;
            for (int i3 = 0; i3 < size; i3++) {
                l lVar = (l) arrayList.get(i3);
                f5 += lVar.f278a.b();
                f4 = Math.max(f4, lVar.f278a.c());
            }
            I2.d.h(f4, f5);
            Matrix matrix = new Matrix();
            Shader shader = ((C0284q) abstractC0259J).f4289g;
            shader.getLocalMatrix(matrix);
            int size2 = arrayList.size();
            for (int i4 = 0; i4 < size2; i4++) {
                l lVar2 = (l) arrayList.get(i4);
                lVar2.f278a.f(interfaceC0285r, new C0284q(shader), f3, c0262m, gVar, abstractC0322c, 3);
                C0004a c0004a = lVar2.f278a;
                interfaceC0285r.r(0.0f, c0004a.b());
                matrix.setTranslate(0.0f, -c0004a.b());
                shader.setLocalMatrix(matrix);
            }
        }
        interfaceC0285r.a();
    }

    public final void b(int i3) {
        int i4 = this.f273f;
        if (i3 < 0 || i3 >= i4) {
            throw new IllegalArgumentException(("lineIndex(" + i3 + ") is out of bounds [0, " + i4 + ')').toString());
        }
    }
}
