package p4;

import java.util.Iterator;
import java.util.List;
import m0.h1;
import m0.t2;
import o.c0;
import r.l1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class u extends i6.i implements p6.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ l1 f5790h;
    public final /* synthetic */ o4.t i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ o4.d f5791j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ c0 f5792k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ t2 f5793l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i f5794m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(l1 l1Var, o4.t tVar, o4.d dVar, c0 c0Var, t2 t2Var, i iVar, g6.c cVar) {
        super(2, cVar);
        this.f5790h = l1Var;
        this.i = tVar;
        this.f5791j = dVar;
        this.f5792k = c0Var;
        this.f5793l = t2Var;
        this.f5794m = iVar;
    }

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        u uVar = (u) l((g6.c) obj2, (a7.u) obj);
        c6.m mVar = c6.m.f1757a;
        uVar.p(mVar);
        return mVar;
    }

    @Override // i6.a
    public final g6.c l(g6.c cVar, Object obj) {
        return new u(this.f5790h, this.i, this.f5791j, this.f5792k, this.f5793l, this.f5794m, cVar);
    }

    @Override // i6.a
    public final Object p(Object obj) {
        char c8;
        s6.a.K(obj);
        l1 l1Var = this.f5790h;
        Object b8 = l1Var.f6346a.b();
        h1 h1Var = l1Var.f6349d;
        if (q6.i.a(b8, h1Var.getValue()) && (((o4.d) this.i.f5685b.f6589f.h()) == null || q6.i.a(h1Var.getValue(), this.f5791j))) {
            Iterator it = ((List) this.f5793l.getValue()).iterator();
            while (it.hasNext()) {
                this.f5794m.b().c((o4.d) it.next());
            }
            c0 c0Var = this.f5792k;
            long[] jArr = c0Var.f5427a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j7 = jArr[i];
                    char c9 = 7;
                    if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i8 = 8 - ((~(i - length)) >>> 31);
                        int i9 = 0;
                        while (i9 < i8) {
                            if ((j7 & 255) < 128) {
                                int i10 = (i << 3) + i9;
                                Object obj2 = c0Var.f5428b[i10];
                                c8 = c9;
                                float f6 = c0Var.f5429c[i10];
                                if (!q6.i.a((String) obj2, ((o4.d) h1Var.getValue()).i)) {
                                    c0Var.f5431e--;
                                    long[] jArr2 = c0Var.f5427a;
                                    int i11 = c0Var.f5430d;
                                    int i12 = i10 >> 3;
                                    int i13 = (i10 & 7) << 3;
                                    long j8 = (jArr2[i12] & (~(255 << i13))) | (254 << i13);
                                    jArr2[i12] = j8;
                                    jArr2[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j8;
                                    c0Var.f5428b[i10] = null;
                                }
                            } else {
                                c8 = c9;
                            }
                            j7 >>= 8;
                            i9++;
                            c9 = c8;
                        }
                        if (i8 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return c6.m.f1757a;
    }
}
