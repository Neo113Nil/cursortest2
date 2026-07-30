package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.attribution.RequestError;
import com.appsflyer.internal.l;
import com.google.android.gms.tasks.Task;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.f;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class j41 implements ak, f, vb1, en, uh1, g9, j9, ef, ym, tw, mp0, jx0, lz0 {
    public static j41 e;
    public static final a5 g = new a5(1);
    public static final a5 h = new a5(2);
    public static final j41 i = new j41(2);
    public static final j41 j = new j41(3);
    public static final j41 k = new j41(4);
    public static final s11 l = new s11(Float.NaN, Float.NaN, Float.NaN, Float.NaN);
    public static final /* synthetic */ j41 m = new j41(6);
    public static final j41 n = new j41(7);
    public static final j41 o = new j41(9);
    public static final pp1 p = new pp1();
    public static final /* synthetic */ j41 q = new j41(11);
    public final /* synthetic */ int d;

    public /* synthetic */ j41(int i2) {
        this.d = i2;
    }

    public static final void e(j50 j50Var) {
        be1 be1Var;
        sw0 sw0Var;
        sw0 sw0Var2;
        be1 be1Var2 = o11.z;
        do {
            be1Var = o11.z;
            sw0Var = (sw0) be1Var.getValue();
            lw0 lw0Var = sw0Var.h;
            sh0 sh0Var = (sh0) lw0Var.get(j50Var);
            if (sh0Var == null) {
                sw0Var2 = sw0Var;
            } else {
                Object obj = sh0Var.a;
                Object obj2 = sh0Var.b;
                oj1 oj1Var = lw0Var.h;
                oj1 v = oj1Var.v(j50Var != null ? j50Var.hashCode() : 0, 0, j50Var);
                if (oj1Var != v) {
                    lw0Var = v == null ? lw0.j : new lw0(v, lw0Var.i - 1);
                }
                j41 j41Var = j;
                if (obj != j41Var) {
                    Object obj3 = lw0Var.get(obj);
                    obj3.getClass();
                    lw0Var = lw0Var.f(obj, new sh0(((sh0) obj3).a, obj2));
                }
                if (obj2 != j41Var) {
                    Object obj4 = lw0Var.get(obj2);
                    obj4.getClass();
                    lw0Var = lw0Var.f(obj2, new sh0(obj, ((sh0) obj4).b));
                }
                Object obj5 = obj != j41Var ? sw0Var.e : obj2;
                if (obj2 != j41Var) {
                    obj = sw0Var.g;
                }
                sw0Var2 = new sw0(obj5, obj, lw0Var);
            }
            if (sw0Var == sw0Var2) {
                return;
            }
        } while (!be1Var.h(sw0Var, sw0Var2));
    }

    public static qn0 p(FileInputStream fileInputStream) {
        byte[] bArr;
        try {
            my0 o2 = my0.o(fileInputStream);
            qn0 qn0Var = new qn0(false);
            iy0[] iy0VarArr = (iy0[]) Arrays.copyOf(new iy0[0], 0);
            qn0Var.b();
            if (iy0VarArr.length > 0) {
                iy0 iy0Var = iy0VarArr[0];
                throw null;
            }
            Map m2 = o2.m();
            m2.getClass();
            for (Map.Entry entry : m2.entrySet()) {
                String str = (String) entry.getKey();
                ry0 ry0Var = (ry0) entry.getValue();
                str.getClass();
                ry0Var.getClass();
                int C = ry0Var.C();
                switch (C == 0 ? -1 : jy0.a[qy0.v(C)]) {
                    case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                        throw new xn("Value case is null.", null);
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    default:
                        l.a();
                        return null;
                    case 1:
                        qn0Var.e(new hy0(str), Boolean.valueOf(ry0Var.t()));
                        break;
                    case 2:
                        qn0Var.e(new hy0(str), Float.valueOf(ry0Var.x()));
                        break;
                    case 3:
                        qn0Var.e(new hy0(str), Double.valueOf(ry0Var.w()));
                        break;
                    case 4:
                        qn0Var.e(new hy0(str), Integer.valueOf(ry0Var.y()));
                        break;
                    case ry0.STRING_FIELD_NUMBER /* 5 */:
                        qn0Var.e(new hy0(str), Long.valueOf(ry0Var.z()));
                        break;
                    case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                        hy0 hy0Var = new hy0(str);
                        String A = ry0Var.A();
                        A.getClass();
                        qn0Var.e(hy0Var, A);
                        break;
                    case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                        hy0 hy0Var2 = new hy0(str);
                        ha0 n2 = ry0Var.B().n();
                        n2.getClass();
                        qn0Var.e(hy0Var2, CollectionsKt.A(n2));
                        break;
                    case ry0.BYTES_FIELD_NUMBER /* 8 */:
                        hy0 hy0Var3 = new hy0(str);
                        ff u = ry0Var.u();
                        int size = u.size();
                        if (size == 0) {
                            bArr = ia0.b;
                        } else {
                            byte[] bArr2 = new byte[size];
                            u.e(bArr2, size);
                            bArr = bArr2;
                        }
                        bArr.getClass();
                        qn0Var.e(hy0Var3, bArr);
                        break;
                    case 9:
                        throw new xn("Value not set.", null);
                }
            }
            return new qn0(new LinkedHashMap(qn0Var.a()), true);
        } catch (sa0 e2) {
            throw new xn("Unable to parse preferences proto.", e2);
        }
    }

    public static Unit q(Object obj, xk1 xk1Var) {
        m40 a;
        Map a2 = ((qn0) obj).a();
        ky0 n2 = my0.n();
        for (Map.Entry entry : a2.entrySet()) {
            hy0 hy0Var = (hy0) entry.getKey();
            Object value = entry.getValue();
            String str = hy0Var.a;
            if (value instanceof Boolean) {
                py0 D = ry0.D();
                boolean booleanValue = ((Boolean) value).booleanValue();
                D.c();
                ry0.q((ry0) D.e, booleanValue);
                a = D.a();
            } else if (value instanceof Float) {
                py0 D2 = ry0.D();
                float floatValue = ((Number) value).floatValue();
                D2.c();
                ry0.r((ry0) D2.e, floatValue);
                a = D2.a();
            } else if (value instanceof Double) {
                py0 D3 = ry0.D();
                double doubleValue = ((Number) value).doubleValue();
                D3.c();
                ry0.o((ry0) D3.e, doubleValue);
                a = D3.a();
            } else if (value instanceof Integer) {
                py0 D4 = ry0.D();
                int intValue = ((Number) value).intValue();
                D4.c();
                ry0.s((ry0) D4.e, intValue);
                a = D4.a();
            } else if (value instanceof Long) {
                py0 D5 = ry0.D();
                long longValue = ((Number) value).longValue();
                D5.c();
                ry0.l((ry0) D5.e, longValue);
                a = D5.a();
            } else if (value instanceof String) {
                py0 D6 = ry0.D();
                D6.c();
                ry0.m((ry0) D6.e, (String) value);
                a = D6.a();
            } else if (value instanceof Set) {
                py0 D7 = ry0.D();
                ny0 o2 = oy0.o();
                o2.c();
                oy0.l((oy0) o2.e, (Set) value);
                D7.c();
                ry0.n((ry0) D7.e, (oy0) o2.a());
                a = D7.a();
            } else {
                if (!(value instanceof byte[])) {
                    dd0.j("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
                    return null;
                }
                py0 D8 = ry0.D();
                byte[] bArr = (byte[]) value;
                ff d = ff.d(bArr, 0, bArr.length);
                D8.c();
                ry0.p((ry0) D8.e, d);
                a = D8.a();
            }
            n2.getClass();
            str.getClass();
            n2.c();
            my0.l((my0) n2.e).put(str, (ry0) a);
        }
        my0 my0Var = (my0) n2.a();
        int a3 = my0Var.a(null);
        Logger logger = wh.f;
        if (a3 > 4096) {
            a3 = 4096;
        }
        wh whVar = new wh(xk1Var, a3);
        my0Var.b(whVar);
        if (whVar.d > 0) {
            whVar.k();
        }
        return Unit.a;
    }

    @Override // defpackage.g9, defpackage.j9
    public float a() {
        return 0.0f;
    }

    @Override // defpackage.vb1
    public boolean b(Object obj, Object obj2) {
        return Intrinsics.a(obj, obj2);
    }

    @Override // defpackage.ef
    public byte[] c(byte[] bArr, int i2, int i3) {
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i2, bArr2, 0, i3);
        return bArr2;
    }

    @Override // defpackage.ym
    public long d(long j2, long j3) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32)) / Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L)) / Float.intBitsToFloat((int) (j2 & 4294967295L));
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
        int i2 = p61.a;
        return floatToRawIntBits;
    }

    @Override // defpackage.ak
    public Object f(mc mcVar) {
        Object f = mcVar.f(new v01(ch0.class, Executor.class));
        f.getClass();
        return new ow((Executor) f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [eo0] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [eo0] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r7v0, types: [zl0] */
    /* JADX WARN: Type inference failed for: r7v1, types: [zl0] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [zl0] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // defpackage.mp0
    public boolean g(zl0 zl0Var) {
        ?? r0 = 0;
        while (true) {
            int i2 = 0;
            if (zl0Var == 0) {
                return false;
            }
            if (zl0Var instanceof tx0) {
                ((tx0) zl0Var).h0();
            } else if ((zl0Var.g & 16) != 0 && (zl0Var instanceof zq)) {
                zl0 zl0Var2 = zl0Var.t;
                r0 = r0;
                zl0Var = zl0Var;
                while (zl0Var2 != null) {
                    if ((zl0Var2.g & 16) != 0) {
                        i2++;
                        r0 = r0;
                        if (i2 == 1) {
                            zl0Var = zl0Var2;
                        } else {
                            if (r0 == 0) {
                                r0 = new eo0(new zl0[16]);
                            }
                            if (zl0Var != 0) {
                                r0.b(zl0Var);
                                zl0Var = 0;
                            }
                            r0.b(zl0Var2);
                        }
                    }
                    zl0Var2 = zl0Var2.j;
                    r0 = r0;
                    zl0Var = zl0Var;
                }
                if (i2 == 1) {
                }
            }
            zl0Var = op.o(r0);
        }
    }

    @Override // defpackage.o01
    public Object get() {
        return new w21(1, Executors.newSingleThreadExecutor());
    }

    @Override // defpackage.mp0
    public int h() {
        return 16;
    }

    @Override // defpackage.mp0
    public void i(jd0 jd0Var, long j2, i60 i60Var, int i2, boolean z) {
        jd0Var.y(j2, i60Var, i2, z);
    }

    @Override // defpackage.lz0
    public void j() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // defpackage.lz0
    public void k(int i2, Object obj) {
        String str;
        switch (i2) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case ry0.STRING_FIELD_NUMBER /* 5 */:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                str = "RESULT_IO_EXCEPTION";
                break;
            case ry0.BYTES_FIELD_NUMBER /* 8 */:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case RequestError.EVENT_TIMEOUT /* 10 */:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case RequestError.STOP_TRACKING /* 11 */:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i2 == 6 || i2 == 7 || i2 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
    }

    @Override // defpackage.j9
    public void l(xk0 xk0Var, int i2, int[] iArr, int[] iArr2) {
        yr1.Y(i2, iArr, iArr2, false);
    }

    @Override // defpackage.g9
    public void m(xk0 xk0Var, int i2, int[] iArr, vc0 vc0Var, int[] iArr2) {
        if (vc0Var == vc0.d) {
            yr1.Y(i2, iArr, iArr2, false);
        } else {
            yr1.Y(i2, iArr, iArr2, true);
        }
    }

    @Override // defpackage.en
    public Object n(Task task) {
        Intent intent = (Intent) ((Bundle) task.getResult()).getParcelable("notification_data");
        if (intent != null) {
            return new qh(intent);
        }
        return null;
    }

    @Override // defpackage.mp0
    public boolean o(jd0 jd0Var) {
        return true;
    }

    public String toString() {
        switch (this.d) {
            case 9:
                return "StructuralEqualityPolicy";
            case 15:
                return "Arrangement#SpaceEvenly";
            case 17:
                return "Empty";
            default:
                return super.toString();
        }
    }
}
