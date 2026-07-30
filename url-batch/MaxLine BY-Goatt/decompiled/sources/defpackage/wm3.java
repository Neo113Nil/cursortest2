package defpackage;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.FacebookRequestErrorClassification;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class wm3 {
    public static final /* synthetic */ int c = 0;
    public final cp3 a = new cp3();
    public boolean b;

    static {
        new wm3(0);
    }

    public wm3(int i) {
        a();
        a();
    }

    public static void b(lm3 lm3Var, yp3 yp3Var, int i, Object obj) {
        if (yp3Var == yp3.p) {
            Charset charset = sn3.a;
            lm3Var.c(i, 3);
            ((in3) ((zl3) obj)).d(lm3Var);
            lm3Var.c(i, 4);
            return;
        }
        lm3Var.c(i, yp3Var.n);
        aq3 aq3Var = aq3.m;
        switch (yp3Var.ordinal()) {
            case 0:
                lm3Var.o(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                lm3Var.m(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                lm3Var.n(((Long) obj).longValue());
                break;
            case 3:
                lm3Var.n(((Long) obj).longValue());
                break;
            case 4:
                lm3Var.k(((Integer) obj).intValue());
                break;
            case 5:
                lm3Var.o(((Long) obj).longValue());
                break;
            case 6:
                lm3Var.m(((Integer) obj).intValue());
                break;
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                lm3Var.j(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof im3)) {
                    lm3Var.q((String) obj);
                    break;
                } else {
                    lm3Var.i((im3) obj);
                    break;
                }
            case 9:
                ((in3) ((zl3) obj)).d(lm3Var);
                break;
            case 10:
                in3 in3Var = (in3) ((zl3) obj);
                lm3Var.l(in3Var.k());
                in3Var.d(lm3Var);
                break;
            case 11:
                if (!(obj instanceof im3)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    lm3Var.l(length);
                    lm3Var.p(length, bArr);
                    break;
                } else {
                    lm3Var.i((im3) obj);
                    break;
                }
            case ViewHierarchyConstants.PICKER_BITMASK /* 12 */:
                lm3Var.l(((Integer) obj).intValue());
                break;
            case ViewHierarchyConstants.SWITCH_BITMASK /* 13 */:
                if (!(obj instanceof mn3)) {
                    lm3Var.k(((Integer) obj).intValue());
                    break;
                } else {
                    lm3Var.k(((mn3) obj).zza());
                    break;
                }
            case ViewHierarchyConstants.RADIO_GROUP_BITMASK /* 14 */:
                lm3Var.m(((Integer) obj).intValue());
                break;
            case 15:
                lm3Var.o(((Long) obj).longValue());
                break;
            case ViewHierarchyConstants.RATINGBAR_BITMASK /* 16 */:
                int intValue = ((Integer) obj).intValue();
                lm3Var.l((intValue >> 31) ^ (intValue + intValue));
                break;
            case FacebookRequestErrorClassification.EC_USER_TOO_MANY_CALLS /* 17 */:
                long longValue = ((Long) obj).longValue();
                lm3Var.n((longValue >> 63) ^ (longValue + longValue));
                break;
        }
    }

    public final void a() {
        if (this.b) {
            return;
        }
        cp3 cp3Var = this.a;
        int i = cp3Var.n;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = cp3Var.a(i2).n;
            if (obj instanceof in3) {
                ((in3) obj).g();
            }
        }
        Iterator it = cp3Var.b().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof in3) {
                ((in3) value).g();
            }
        }
        if (!cp3Var.p) {
            if (cp3Var.n > 0) {
                cp3Var.a(0).m.getClass();
                b71.o();
                return;
            } else {
                Iterator it2 = cp3Var.b().iterator();
                if (it2.hasNext()) {
                    ((Map.Entry) it2.next()).getKey().getClass();
                    b71.o();
                    return;
                }
            }
        }
        if (!cp3Var.p) {
            cp3Var.o = cp3Var.o.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(cp3Var.o);
            cp3Var.r = cp3Var.r.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(cp3Var.r);
            cp3Var.p = true;
        }
        this.b = true;
    }

    public final Object clone() {
        wm3 wm3Var = new wm3();
        cp3 cp3Var = this.a;
        if (cp3Var.n > 0) {
            cp3Var.a(0).m.getClass();
            b71.o();
            return null;
        }
        Iterator it = cp3Var.b().iterator();
        if (!it.hasNext()) {
            return wm3Var;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (entry.getKey() != null) {
            b71.o();
            return null;
        }
        entry.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof wm3) {
            return this.a.equals(((wm3) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public wm3() {
    }
}
