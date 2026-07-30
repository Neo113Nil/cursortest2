package defpackage;

import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.attribution.RequestError;
import com.feathherdashh.dashgame.MainActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class v3 extends c40 implements Function0 {
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v3(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.m = i3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        l7 l7Var;
        int i;
        Object value;
        Object value2;
        Object value3;
        Object value4;
        iw0 iw0Var;
        int i2;
        Object value5;
        int i3 = 6;
        switch (this.m) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                View view = (View) this.e;
                view.setImportantForContentCapture(1);
                ContentCaptureSession contentCaptureSession = view.getContentCaptureSession();
                if (contentCaptureSession == null) {
                    return null;
                }
                return new yw(contentCaptureSession, i3, view);
            case 1:
                z00 z00Var = (z00) this.e;
                wn0 wn0Var = z00Var.c;
                wn0 wn0Var2 = z00Var.d;
                e10 e10Var = z00Var.a;
                o10 f = e10Var.f();
                if (f == null) {
                    Object[] objArr = wn0Var2.b;
                    long[] jArr = wn0Var2.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i4 = 0;
                        while (true) {
                            long j = jArr[i4];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i5 = 8 - ((~(i4 - length)) >>> 31);
                                for (int i6 = 0; i6 < i5; i6++) {
                                    if ((j & 255) < 128) {
                                        xc xcVar = (xc) objArr[(i4 << 3) + i6];
                                        j10 j10Var = j10.d;
                                        xcVar.A0();
                                        throw null;
                                    }
                                    j >>= 8;
                                }
                                if (i5 != 8) {
                                }
                            }
                            if (i4 != length) {
                                i4++;
                            }
                        }
                    }
                } else if (f.r) {
                    if (wn0Var.c(f)) {
                        f.F0();
                    }
                    f.E0();
                    if (!f.d.r) {
                        o80.b("visitAncestors called on an unattached node");
                    }
                    zl0 zl0Var = f.d;
                    jd0 I = op.I(f);
                    int i7 = 0;
                    while (I != null) {
                        if ((((zl0) I.J.g).h & 5120) != 0) {
                            while (zl0Var != null) {
                                int i8 = zl0Var.g;
                                if ((i8 & 5120) != 0) {
                                    if ((i8 & 1024) != 0) {
                                        i7++;
                                    }
                                    if ((zl0Var instanceof xc) && wn0Var2.c(zl0Var)) {
                                        if (i7 <= 1) {
                                            ((xc) zl0Var).A0();
                                            throw null;
                                        }
                                        j10 j10Var2 = j10.d;
                                        ((xc) zl0Var).A0();
                                        throw null;
                                    }
                                }
                                zl0Var = zl0Var.i;
                            }
                        }
                        I = I.s();
                        zl0Var = (I == null || (l7Var = I.J) == null) ? null : (ig1) l7Var.f;
                    }
                    Object[] objArr2 = wn0Var2.b;
                    long[] jArr2 = wn0Var2.a;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i9 = 0;
                        while (true) {
                            long j2 = jArr2[i9];
                            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i10 = 8 - ((~(i9 - length2)) >>> 31);
                                for (int i11 = 0; i11 < i10; i11++) {
                                    if ((j2 & 255) < 128) {
                                        xc xcVar2 = (xc) objArr2[(i9 << 3) + i11];
                                        j10 j10Var3 = j10.d;
                                        xcVar2.A0();
                                        throw null;
                                    }
                                    j2 >>= 8;
                                }
                                if (i10 != 8) {
                                }
                            }
                            if (i9 != length2) {
                                i9++;
                            }
                        }
                    }
                }
                if (e10Var.f() == null || e10Var.c.E0() == j10.g) {
                    e10Var.c();
                }
                wn0Var.b();
                wn0Var2.b();
                z00Var.e = false;
                return Unit.a;
            case 2:
                return Boolean.valueOf(((s10) this.e).z.G0(7));
            case 3:
                ((z8) this.e).o();
                return Unit.a;
            case 4:
                z8 z8Var = (z8) this.e;
                be1 be1Var = z8Var.e;
                e40 e40Var = ((w8) be1Var.getValue()).i;
                if (e40Var != null) {
                    int i12 = e40Var.j;
                    if ((((w8) be1Var.getValue()).b instanceof mt0) && e40Var.b == f40.d) {
                        long j3 = yr1.J(e40Var.a).c;
                        i = e40Var.g > 0 ? 1 : 0;
                        if (i == 0 || i12 > 0) {
                            do {
                                value = be1Var.getValue();
                            } while (!be1Var.h(value, w8.a((w8) value, null, null, null, 0, 0, null, null, null, e40.a(e40Var, null, 0, 0, 0, null, j3, 0L, i != 0 ? z8.h(e40Var) : 0.0f, i != 0 ? i12 - 1 : 1, 0L, 0L, 0.0f, 15423), false, 1791)));
                            z8Var.j(gc1.d, 18L);
                        }
                    }
                }
                return Unit.a;
            case ry0.STRING_FIELD_NUMBER /* 5 */:
                z8 z8Var2 = (z8) this.e;
                z8Var2.d.a(28L);
                be1 be1Var2 = z8Var2.e;
                do {
                    value2 = be1Var2.getValue();
                } while (!be1Var2.h(value2, w8.a((w8) value2, null, pt0.a, null, 0, 0, null, null, null, null, false, 2045)));
                return Unit.a;
            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                z8 z8Var3 = (z8) this.e;
                z8Var3.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                jo joVar = z8Var3.g.d;
                Long l = joVar.b;
                if (l == null || currentTimeMillis - l.longValue() >= 86400000) {
                    int c = b11.c(joVar.a, 1, 7);
                    int intValue = ((Number) r31.a.get(c - 1)).intValue();
                    i = c == 7 ? 1 : 0;
                    int i13 = i != 0 ? 1 : c + 1;
                    Long valueOf = Long.valueOf(currentTimeMillis);
                    int i14 = joVar.c + 1;
                    int i15 = joVar.d + i;
                    jo joVar2 = new jo(i13, valueOf, i14, i15);
                    iw0 iw0Var2 = z8Var3.g;
                    z8Var3.r(iw0.a(iw0Var2, null, iw0Var2.b + intValue, 0, joVar2, null, z8.m(z8.v(z8.v(iw0Var2.f, "DAILY_CLAIMS", i14), "FULL_STREAKS", i15), intValue), null, 85));
                    z8Var3.j(gc1.j, 28L);
                }
                return Unit.a;
            case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                z8 z8Var4 = (z8) this.e;
                z8Var4.d.a(28L);
                be1 be1Var3 = z8Var4.e;
                do {
                    value3 = be1Var3.getValue();
                } while (!be1Var3.h(value3, w8.a((w8) value3, null, lt0.a, null, 0, 0, null, null, null, null, false, 2045)));
                return Unit.a;
            case ry0.BYTES_FIELD_NUMBER /* 8 */:
                ((MainActivity) this.e).finishAndRemoveTask();
                return Unit.a;
            case 9:
                ((kr0) this.e).c();
                return Unit.a;
            case RequestError.EVENT_TIMEOUT /* 10 */:
                ((kr0) this.e).c();
                return Unit.a;
            case RequestError.STOP_TRACKING /* 11 */:
                ((z8) this.e).g();
                return Unit.a;
            case 12:
                z8 z8Var5 = (z8) this.e;
                be1 be1Var4 = z8Var5.e;
                e40 e40Var2 = ((w8) be1Var4.getValue()).i;
                if (e40Var2 != null && e40Var2.b == f40.e) {
                    z8Var5.k(new ia(System.currentTimeMillis(), e40Var2.a, e40Var2.c, e40Var2.d, ja.d), e40Var2.d, true);
                    do {
                        value4 = be1Var4.getValue();
                    } while (!be1Var4.h(value4, w8.a((w8) value4, null, new ot0(true), null, 0, 0, null, null, null, null, false, 2045)));
                    z8Var5.j(gc1.i, 28L);
                }
                return Unit.a;
            case 13:
                z8 z8Var6 = (z8) this.e;
                be1 be1Var5 = z8Var6.e;
                e40 e40Var3 = ((w8) be1Var5.getValue()).i;
                if (e40Var3 != null && (i2 = (iw0Var = z8Var6.g).b) >= 600) {
                    z8Var6.r(iw0.a(iw0Var, null, i2 - 600, 0, null, null, null, null, 125));
                    do {
                        value5 = be1Var5.getValue();
                    } while (!be1Var5.h(value5, w8.a((w8) value5, null, mt0.a, null, 0, 0, null, null, null, e40.a(e40Var3, f40.d, 0, 0, e40Var3.e + 1, nv.d, 0L, 0L, 0.0f, 1, 700L, 0L, 0.0f, 14349), false, 1789)));
                    z8Var6.j(gc1.h, 22L);
                }
                return Unit.a;
            case 14:
                ((z8) this.e).p();
                return Unit.a;
            case 15:
                ((z8) this.e).f();
                return Unit.a;
            case 16:
                ((z8) this.e).q();
                return Unit.a;
            case 17:
                z8 z8Var7 = (z8) this.e;
                be1 be1Var6 = z8Var7.e;
                e40 e40Var4 = ((w8) be1Var6.getValue()).i;
                ds dsVar = e40Var4 != null ? e40Var4.a : ds.NORMAL;
                e40 e40Var5 = ((w8) be1Var6.getValue()).i;
                if (e40Var5 != null) {
                    z8Var7.k(new ia(System.currentTimeMillis(), e40Var5.a, e40Var5.c, 0, ja.e), 0, false);
                }
                z8Var7.t(dsVar);
                return Unit.a;
            case 18:
                ((z8) this.e).p();
                return Unit.a;
            case 19:
                ((z8) this.e).i();
                return Unit.a;
            case 20:
                z8 z8Var8 = (z8) this.e;
                z8Var8.r(iw0.a(z8Var8.g, v8.a(z8Var8.g.a, !r1.a, false, false, 6), 0, 0, null, null, null, null, 126));
                z8Var8.d.a(28L);
                return Unit.a;
            case 21:
                z8 z8Var9 = (z8) this.e;
                z8Var9.r(iw0.a(z8Var9.g, v8.a(z8Var9.g.a, false, !r1.b, false, 5), 0, 0, null, null, null, null, 126));
                z8Var9.d.a(28L);
                return Unit.a;
            case 22:
                z8 z8Var10 = (z8) this.e;
                z8Var10.r(iw0.a(z8Var10.g, v8.a(z8Var10.g.a, false, false, !r1.c, 3), 0, 0, null, null, null, null, 126));
                z8Var10.d.a(28L);
                return Unit.a;
            default:
                ((z8) this.e).f();
                return Unit.a;
        }
    }
}
