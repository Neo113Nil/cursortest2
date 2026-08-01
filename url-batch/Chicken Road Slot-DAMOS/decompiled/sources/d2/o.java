package d2;

import android.os.Build;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class o extends wd.n implements Function0 {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f3496v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i3, Object obj, Class cls, String str, String str2, int i10, int i11) {
        super(i3, obj, cls, str, str2, i10);
        this.f3496v = i11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ContentCaptureSession a9;
        c2.b1 b1Var;
        int i3 = 5;
        ld.a aVar = null;
        switch (this.f3496v) {
            case 0:
                View view = (View) this.f10145e;
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 30) {
                    f2.b.g(view);
                }
                if (i10 < 29 || (a9 = e3.l.a(view)) == null) {
                    return null;
                }
                return new c6.c(i3, a9, view);
            case 1:
                i1.e eVar = (i1.e) this.f10145e;
                s.i0 i0Var = eVar.f4594c;
                s.i0 i0Var2 = eVar.f4595d;
                i1.k kVar = eVar.f4592a;
                i1.t f3 = kVar.f();
                if (f3 == null) {
                    Object[] objArr = i0Var2.f8320b;
                    long[] jArr = i0Var2.f8319a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i11 = 0;
                        while (true) {
                            long j = jArr[i11];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i12 = 8 - ((~(i11 - length)) >>> 31);
                                for (int i13 = 0; i13 < i12; i13++) {
                                    if ((j & 255) < 128) {
                                        c2.b bVar = (c2.b) objArr[(i11 << 3) + i13];
                                        i1.r rVar = i1.r.f4626d;
                                        bVar.J();
                                        throw null;
                                    }
                                    j >>= 8;
                                }
                                if (i12 != 8) {
                                }
                            }
                            if (i11 != length) {
                                i11++;
                            }
                        }
                    }
                } else if (f3.B) {
                    if (i0Var.c(f3)) {
                        f3.N();
                    }
                    f3.M();
                    if (!f3.f3305d.B) {
                        z1.a.b("visitAncestors called on an unattached node");
                    }
                    d1.k kVar2 = f3.f3305d;
                    c2.g0 u2 = c2.k.u(f3);
                    int i14 = 0;
                    while (u2 != null) {
                        if ((((d1.k) u2.S.g).f3308r & 5120) != 0) {
                            while (kVar2 != null) {
                                int i15 = kVar2.f3307i;
                                if ((i15 & 5120) != 0) {
                                    if ((i15 & 1024) != 0) {
                                        i14++;
                                    }
                                    if ((kVar2 instanceof c2.b) && i0Var2.c(kVar2)) {
                                        if (i14 <= 1) {
                                            ((c2.b) kVar2).J();
                                            throw null;
                                        }
                                        i1.r rVar2 = i1.r.f4626d;
                                        ((c2.b) kVar2).J();
                                        throw null;
                                    }
                                }
                                kVar2 = kVar2.f3309s;
                            }
                        }
                        u2 = u2.s();
                        kVar2 = (u2 == null || (b1Var = u2.S) == null) ? null : (c2.z1) b1Var.f1495f;
                    }
                    Object[] objArr2 = i0Var2.f8320b;
                    long[] jArr2 = i0Var2.f8319a;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i16 = 0;
                        while (true) {
                            long j3 = jArr2[i16];
                            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i17 = 8 - ((~(i16 - length2)) >>> 31);
                                for (int i18 = 0; i18 < i17; i18++) {
                                    if ((j3 & 255) < 128) {
                                        c2.b bVar2 = (c2.b) objArr2[(i16 << 3) + i18];
                                        i1.r rVar3 = i1.r.f4626d;
                                        bVar2.J();
                                        throw null;
                                    }
                                    j3 >>= 8;
                                }
                                if (i17 != 8) {
                                }
                            }
                            if (i16 != length2) {
                                i16++;
                            }
                        }
                    }
                }
                if (kVar.f() == null || kVar.f4603c.M() == i1.r.f4628i) {
                    kVar.c();
                }
                i0Var.b();
                i0Var2.b();
                eVar.f4596e = false;
                return Unit.f5554a;
            case 2:
                n9.c cVar = (n9.c) this.f10145e;
                j9.a aVar2 = (j9.a) cVar.f7196c.getValue();
                if (!aVar2.f5109b && !aVar2.f5110c && !aVar2.f5111d && !aVar2.f5112e) {
                    ge.r1 r1Var = cVar.f7199f;
                    if (r1Var != null) {
                        r1Var.a(null);
                    }
                    cVar.f7199f = ge.a0.s(androidx.lifecycle.o0.g(cVar), null, new n9.a(cVar, null), 3);
                }
                return Unit.f5554a;
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                ((n9.c) this.f10145e).g();
                return Unit.f5554a;
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                ((n9.c) this.f10145e).h();
                return Unit.f5554a;
            case a4.j.STRING_FIELD_NUMBER /* 5 */:
                q9.a aVar3 = (q9.a) this.f10145e;
                aVar3.getClass();
                ge.a0.s(androidx.lifecycle.o0.g(aVar3), null, new b5.d0(aVar3, aVar, i3), 3);
                return Unit.f5554a;
            case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return Boolean.valueOf(((x.p) this.f10145e).I.O(7));
            default:
                z4.u uVar = (z4.u) this.f10145e;
                le.d dVar = uVar.f10834a;
                if (dVar == null) {
                    Intrinsics.f("coroutineScope");
                    throw null;
                }
                ge.a0.f(dVar, null);
                uVar.j();
                z4.q qVar = uVar.f10838e;
                if (qVar == null) {
                    Intrinsics.f("connectionManager");
                    throw null;
                }
                qVar.f10812f.close();
                j5.d dVar2 = qVar.g;
                if (dVar2 != null) {
                    dVar2.close();
                }
                return Unit.f5554a;
        }
    }
}
