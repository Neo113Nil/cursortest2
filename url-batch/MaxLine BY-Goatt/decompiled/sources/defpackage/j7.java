package defpackage;

import android.os.Build;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class j7 extends gu0 implements Function0 {
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j7(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.o = i4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ContentCaptureSession k;
        fs1 fs1Var;
        switch (this.o) {
            case 0:
                View view = (View) this.receiver;
                int i = Build.VERSION.SDK_INT;
                if (i >= 30) {
                    c2.m(view);
                }
                if (i < 29 || (k = x6.k(view)) == null) {
                    return null;
                }
                return new d20(k, view);
            case 1:
                lo0 lo0Var = (lo0) this.receiver;
                un1 un1Var = lo0Var.c;
                un1 un1Var2 = lo0Var.d;
                po0 po0Var = lo0Var.a;
                yo0 yo0Var = po0Var.h;
                if (yo0Var == null) {
                    Object[] objArr = un1Var2.b;
                    long[] jArr = un1Var2.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i2 = 0;
                        while (true) {
                            long j = jArr[i2];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i3 = 8 - ((~(i2 - length)) >>> 31);
                                for (int i4 = 0; i4 < i3; i4++) {
                                    if ((j & 255) < 128) {
                                        ((go0) objArr[(i2 << 3) + i4]).X(xo0.p);
                                    }
                                    j >>= 8;
                                }
                                if (i3 != 8) {
                                }
                            }
                            if (i2 != length) {
                                i2++;
                            }
                        }
                    }
                } else if (yo0Var.z) {
                    if (un1Var.c(yo0Var)) {
                        yo0Var.J0();
                    }
                    xo0 I0 = yo0Var.I0();
                    if (!yo0Var.m.z) {
                        h21.b("visitAncestors called on an unattached node");
                    }
                    ul1 ul1Var = yo0Var.m;
                    i91 J = s03.J(yo0Var);
                    int i5 = 0;
                    while (J != null) {
                        if ((J.P.f.p & 5120) != 0) {
                            while (ul1Var != null) {
                                int i6 = ul1Var.o;
                                if ((i6 & 5120) != 0) {
                                    if ((i6 & 1024) != 0) {
                                        i5++;
                                    }
                                    if ((ul1Var instanceof go0) && un1Var2.c(ul1Var)) {
                                        if (i5 <= 1) {
                                            ((go0) ul1Var).X(I0);
                                        } else {
                                            ((go0) ul1Var).X(xo0.n);
                                        }
                                        un1Var2.k(ul1Var);
                                    }
                                }
                                ul1Var = ul1Var.q;
                            }
                        }
                        J = J.u();
                        ul1Var = (J == null || (fs1Var = J.P) == null) ? null : fs1Var.e;
                    }
                    Object[] objArr2 = un1Var2.b;
                    long[] jArr2 = un1Var2.a;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i7 = 0;
                        while (true) {
                            long j2 = jArr2[i7];
                            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i8 = 8 - ((~(i7 - length2)) >>> 31);
                                for (int i9 = 0; i9 < i8; i9++) {
                                    if ((j2 & 255) < 128) {
                                        ((go0) objArr2[(i7 << 3) + i9]).X(xo0.p);
                                    }
                                    j2 >>= 8;
                                }
                                if (i8 != 8) {
                                }
                            }
                            if (i7 != length2) {
                                i7++;
                            }
                        }
                    }
                }
                if (po0Var.h == null || po0Var.c.I0() == xo0.p) {
                    po0Var.c();
                }
                un1Var.b();
                un1Var2.b();
                lo0Var.e = false;
                return Unit.a;
            default:
                lb2 lb2Var = (lb2) this.receiver;
                m30 m30Var = lb2Var.a;
                if (m30Var == null) {
                    Intrinsics.f("coroutineScope");
                    throw null;
                }
                j8.m(m30Var, null);
                lb2Var.d();
                ib2 ib2Var = lb2Var.e;
                if (ib2Var != null) {
                    ib2Var.f.close();
                    return Unit.a;
                }
                Intrinsics.f("connectionManager");
                throw null;
        }
    }
}
