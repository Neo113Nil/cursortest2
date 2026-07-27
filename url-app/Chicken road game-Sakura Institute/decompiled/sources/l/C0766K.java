package l;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;
import z2.C1436t;

/* renamed from: l.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0766K extends M2.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7590d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ U f7591e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0766K(U u4, int i2) {
        super(1);
        this.f7590d = i2;
        this.f7591e = u4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f7590d) {
            case 0:
                long longValue = ((Number) obj).longValue();
                U u4 = this.f7591e;
                long j4 = longValue - u4.f7644l;
                u4.f7644l = longValue;
                long b4 = O2.c.b(j4 / u4.f7648p);
                i.w wVar = u4.f7645m;
                int i2 = wVar.f6975b;
                int i4 = 0;
                if (i2 != 0) {
                    Object[] objArr = wVar.f6974a;
                    for (int i5 = 0; i5 < i2; i5++) {
                        C0765J c0765j = (C0765J) objArr[i5];
                        U.r(u4, c0765j, b4);
                        c0765j.f7584c = true;
                    }
                    m0 m0Var = u4.f7637e;
                    if (m0Var != null) {
                        m0Var.p();
                    }
                    int i6 = wVar.f6975b;
                    Object[] objArr2 = wVar.f6974a;
                    IntRange h4 = kotlin.ranges.b.h(0, i6);
                    int i7 = h4.f7505d;
                    int i8 = h4.f7506e;
                    if (i7 <= i8) {
                        while (true) {
                            objArr2[i7 - i4] = objArr2[i7];
                            if (((C0765J) objArr2[i7]).f7584c) {
                                i4++;
                            }
                            if (i7 != i8) {
                                i7++;
                            }
                        }
                    }
                    C1436t.k(objArr2, i6 - i4, i6);
                    wVar.f6975b -= i4;
                }
                C0765J c0765j2 = u4.f7646n;
                if (c0765j2 != null) {
                    c0765j2.f7588g = u4.f7638f;
                    U.r(u4, c0765j2, b4);
                    u4.z(c0765j2.f7585d);
                    if (c0765j2.f7585d == 1.0f) {
                        u4.f7646n = null;
                    }
                    u4.y();
                }
                break;
            default:
                this.f7591e.f7644l = ((Number) obj).longValue();
                break;
        }
        return Unit.f7487a;
    }
}
