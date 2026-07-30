package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.attribution.RequestError;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class xx {
    public static final /* synthetic */ int c = 0;
    public final fb1 a = fb1.f();
    public boolean b;

    static {
        new xx(0);
    }

    public xx(int i) {
        a();
        a();
    }

    public static void b(wh whVar, bq1 bq1Var, int i, Object obj) {
        if (bq1Var == bq1.h) {
            whVar.B(i, 3);
            ((d0) obj).b(whVar);
            whVar.B(i, 4);
        }
        whVar.B(i, bq1Var.e);
        switch (bq1Var.ordinal()) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                whVar.u(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                whVar.s(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                whVar.F(((Long) obj).longValue());
                break;
            case 3:
                whVar.F(((Long) obj).longValue());
                break;
            case 4:
                whVar.w(((Integer) obj).intValue());
                break;
            case ry0.STRING_FIELD_NUMBER /* 5 */:
                whVar.u(((Long) obj).longValue());
                break;
            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                whVar.s(((Integer) obj).intValue());
                break;
            case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                whVar.m(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case ry0.BYTES_FIELD_NUMBER /* 8 */:
                if (!(obj instanceof ff)) {
                    whVar.A((String) obj);
                    break;
                } else {
                    whVar.q((ff) obj);
                    break;
                }
            case 9:
                ((d0) obj).b(whVar);
                break;
            case RequestError.EVENT_TIMEOUT /* 10 */:
                d0 d0Var = (d0) obj;
                whVar.D(((m40) d0Var).a(null));
                d0Var.b(whVar);
                break;
            case RequestError.STOP_TRACKING /* 11 */:
                if (!(obj instanceof ff)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    whVar.D(length);
                    whVar.n(bArr, 0, length);
                    break;
                } else {
                    whVar.q((ff) obj);
                    break;
                }
            case 12:
                whVar.D(((Integer) obj).intValue());
                break;
            case 13:
                whVar.w(((Integer) obj).intValue());
                break;
            case 14:
                whVar.s(((Integer) obj).intValue());
                break;
            case 15:
                whVar.u(((Long) obj).longValue());
                break;
            case 16:
                int intValue = ((Integer) obj).intValue();
                whVar.D((intValue >> 31) ^ (intValue << 1));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                whVar.F((longValue >> 63) ^ (longValue << 1));
                break;
        }
    }

    public final void a() {
        if (this.b) {
            return;
        }
        fb1 fb1Var = this.a;
        int size = fb1Var.d.size();
        for (int i = 0; i < size; i++) {
            Map.Entry c2 = fb1Var.c(i);
            if (c2.getValue() instanceof m40) {
                m40 m40Var = (m40) c2.getValue();
                m40Var.getClass();
                i01 i01Var = i01.c;
                i01Var.getClass();
                i01Var.a(m40Var.getClass()).c(m40Var);
                m40Var.h();
            }
        }
        if (!fb1Var.g) {
            if (fb1Var.d.size() > 0) {
                fb1Var.c(0).getKey().getClass();
                af.c();
                return;
            } else {
                Iterator it = fb1Var.d().iterator();
                if (it.hasNext()) {
                    ((Map.Entry) it.next()).getKey().getClass();
                    af.c();
                    return;
                }
            }
        }
        if (!fb1Var.g) {
            fb1Var.e = fb1Var.e.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(fb1Var.e);
            fb1Var.i = fb1Var.i.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(fb1Var.i);
            fb1Var.g = true;
        }
        this.b = true;
    }

    public final Object clone() {
        xx xxVar = new xx();
        fb1 fb1Var = this.a;
        if (fb1Var.d.size() > 0) {
            Map.Entry c2 = fb1Var.c(0);
            if (c2.getKey() != null) {
                af.c();
                return null;
            }
            c2.getValue();
            throw null;
        }
        Iterator it = fb1Var.d().iterator();
        if (!it.hasNext()) {
            return xxVar;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (entry.getKey() != null) {
            af.c();
            return null;
        }
        entry.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xx) {
            return this.a.equals(((xx) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public xx() {
    }
}
