package r;

import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import o.N;
import p0.InterfaceC0946G;
import r0.B;
import z2.C1403G;

/* loaded from: classes.dex */
public final class n implements InterfaceC0946G {

    /* renamed from: a, reason: collision with root package name */
    public final o f9502a;

    /* renamed from: b, reason: collision with root package name */
    public int f9503b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9504c;

    /* renamed from: d, reason: collision with root package name */
    public float f9505d;

    /* renamed from: e, reason: collision with root package name */
    public final float f9506e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f9507f;

    /* renamed from: g, reason: collision with root package name */
    public final b3.c f9508g;

    /* renamed from: h, reason: collision with root package name */
    public final M0.b f9509h;

    /* renamed from: i, reason: collision with root package name */
    public final long f9510i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f9511j;

    /* renamed from: k, reason: collision with root package name */
    public final int f9512k;

    /* renamed from: l, reason: collision with root package name */
    public final int f9513l;

    /* renamed from: m, reason: collision with root package name */
    public final int f9514m;

    /* renamed from: n, reason: collision with root package name */
    public final N f9515n;

    /* renamed from: o, reason: collision with root package name */
    public final int f9516o;

    /* renamed from: p, reason: collision with root package name */
    public final int f9517p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0946G f9518q;

    public n(o oVar, int i2, boolean z4, float f4, InterfaceC0946G interfaceC0946G, float f5, boolean z5, b3.c cVar, M0.b bVar, long j4, List list, int i4, int i5, int i6, N n2, int i7, int i8) {
        this.f9502a = oVar;
        this.f9503b = i2;
        this.f9504c = z4;
        this.f9505d = f4;
        this.f9506e = f5;
        this.f9507f = z5;
        this.f9508g = cVar;
        this.f9509h = bVar;
        this.f9510i = j4;
        this.f9511j = list;
        this.f9512k = i4;
        this.f9513l = i5;
        this.f9514m = i6;
        this.f9515n = n2;
        this.f9516o = i7;
        this.f9517p = i8;
        this.f9518q = interfaceC0946G;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final boolean a(int i2, boolean z4) {
        o oVar;
        int i4;
        if (this.f9507f) {
            return false;
        }
        ?? r02 = this.f9511j;
        if (r02.isEmpty() || (oVar = this.f9502a) == null || (i4 = this.f9503b - i2) < 0 || i4 >= oVar.f9531m) {
            return false;
        }
        o oVar2 = (o) C1403G.q(r02);
        o oVar3 = (o) C1403G.x(r02);
        oVar2.getClass();
        oVar3.getClass();
        int i5 = this.f9513l;
        int i6 = this.f9512k;
        if (i2 < 0) {
            if (Math.min((oVar2.f9529k + oVar2.f9531m) - i6, (oVar3.f9529k + oVar3.f9531m) - i5) <= (-i2)) {
                return false;
            }
        } else if (Math.min(i6 - oVar2.f9529k, i5 - oVar3.f9529k) <= i2) {
            return false;
        }
        this.f9503b -= i2;
        int size = r02.size();
        for (int i7 = 0; i7 < size; i7++) {
            o oVar4 = (o) r02.get(i7);
            oVar4.getClass();
            oVar4.f9529k += i2;
            int[] iArr = oVar4.f9534p;
            int length = iArr.length;
            for (int i8 = 0; i8 < length; i8++) {
                if (i8 % 2 == 1) {
                    iArr[i8] = iArr[i8] + i2;
                }
            }
            if (z4) {
                int size2 = oVar4.f9520b.size();
                for (int i9 = 0; i9 < size2; i9++) {
                    B.c(oVar4.f9528j.f5094a.e(oVar4.f9526h));
                }
            }
        }
        this.f9505d = i2;
        if (!this.f9504c && i2 > 0) {
            this.f9504c = true;
        }
        return true;
    }

    @Override // p0.InterfaceC0946G
    public final int g() {
        return this.f9518q.g();
    }

    @Override // p0.InterfaceC0946G
    public final int j() {
        return this.f9518q.j();
    }

    @Override // p0.InterfaceC0946G
    public final Map k() {
        return this.f9518q.k();
    }

    @Override // p0.InterfaceC0946G
    public final void l() {
        this.f9518q.l();
    }

    @Override // p0.InterfaceC0946G
    public final Function1 m() {
        return this.f9518q.m();
    }
}
