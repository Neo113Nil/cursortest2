package k;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import y2.C1338m;

/* renamed from: k.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0727C extends M2.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7238d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0729E f7239e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f7240i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0727C(C0729E c0729e, long j4, int i2) {
        super(1);
        this.f7238d = i2;
        this.f7239e = c0729e;
        this.f7240i = j4;
    }

    /* JADX WARN: Type inference failed for: r15v14, types: [M2.p, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r15v24, types: [M2.p, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r15v6, types: [M2.p, kotlin.jvm.functions.Function1] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int ordinal;
        switch (this.f7238d) {
            case 0:
                C0729E c0729e = this.f7239e;
                c0729e.getClass();
                int ordinal2 = ((w) obj).ordinal();
                long j4 = this.f7240i;
                if (ordinal2 == 0) {
                    t tVar = c0729e.f7248w.f7253a.f7269b;
                    if (tVar != null) {
                        j4 = ((M0.j) tVar.f7323b.invoke(new M0.j(j4))).f3554a;
                    }
                } else if (ordinal2 != 1) {
                    if (ordinal2 != 2) {
                        throw new C1338m();
                    }
                    t tVar2 = c0729e.f7249x.f7256a.f7269b;
                    if (tVar2 != null) {
                        j4 = ((M0.j) tVar2.f7323b.invoke(new M0.j(j4))).f3554a;
                    }
                }
                return new M0.j(j4);
            default:
                w wVar = (w) obj;
                C0729E c0729e2 = this.f7239e;
                long j5 = 0;
                if (c0729e2.B != null && c0729e2.B0() != null && !Intrinsics.a(c0729e2.B, c0729e2.B0()) && (ordinal = wVar.ordinal()) != 0 && ordinal != 1) {
                    if (ordinal != 2) {
                        throw new C1338m();
                    }
                    t tVar3 = c0729e2.f7249x.f7256a.f7269b;
                    if (tVar3 != null) {
                        long j6 = this.f7240i;
                        long j7 = ((M0.j) tVar3.f7323b.invoke(new M0.j(j6))).f3554a;
                        S.c B02 = c0729e2.B0();
                        Intrinsics.c(B02);
                        M0.k kVar = M0.k.f3555d;
                        long a4 = ((S.g) B02).a(j6, j7, kVar);
                        S.c cVar = c0729e2.B;
                        Intrinsics.c(cVar);
                        j5 = M0.h.b(a4, cVar.a(j6, j7, kVar));
                    }
                }
                return new M0.h(j5);
        }
    }
}
