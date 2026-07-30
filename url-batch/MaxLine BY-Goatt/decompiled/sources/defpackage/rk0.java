package defpackage;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.FacebookRequestErrorClassification;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class rk0 {
    public static final /* synthetic */ int c = 0;
    public final bm2 a = bm2.f();
    public boolean b;

    static {
        new rk0(0);
    }

    public rk0(int i) {
        a();
        a();
    }

    public static void b(kv kvVar, y83 y83Var, int i, Object obj) {
        if (y83Var == y83.p) {
            kvVar.B(i, 3);
            ((q0) obj).b(kvVar);
            kvVar.B(i, 4);
        }
        kvVar.B(i, y83Var.n);
        switch (y83Var.ordinal()) {
            case 0:
                kvVar.u(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                kvVar.s(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                kvVar.F(((Long) obj).longValue());
                break;
            case 3:
                kvVar.F(((Long) obj).longValue());
                break;
            case 4:
                kvVar.w(((Integer) obj).intValue());
                break;
            case 5:
                kvVar.u(((Long) obj).longValue());
                break;
            case 6:
                kvVar.s(((Integer) obj).intValue());
                break;
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                kvVar.m(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof er)) {
                    kvVar.A((String) obj);
                    break;
                } else {
                    kvVar.q((er) obj);
                    break;
                }
            case 9:
                ((q0) obj).b(kvVar);
                break;
            case 10:
                q0 q0Var = (q0) obj;
                kvVar.D(((vu0) q0Var).a(null));
                q0Var.b(kvVar);
                break;
            case 11:
                if (!(obj instanceof er)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    kvVar.D(length);
                    kvVar.n(bArr, 0, length);
                    break;
                } else {
                    kvVar.q((er) obj);
                    break;
                }
            case ViewHierarchyConstants.PICKER_BITMASK /* 12 */:
                kvVar.D(((Integer) obj).intValue());
                break;
            case ViewHierarchyConstants.SWITCH_BITMASK /* 13 */:
                kvVar.w(((Integer) obj).intValue());
                break;
            case ViewHierarchyConstants.RADIO_GROUP_BITMASK /* 14 */:
                kvVar.s(((Integer) obj).intValue());
                break;
            case 15:
                kvVar.u(((Long) obj).longValue());
                break;
            case ViewHierarchyConstants.RATINGBAR_BITMASK /* 16 */:
                int intValue = ((Integer) obj).intValue();
                kvVar.D((intValue >> 31) ^ (intValue << 1));
                break;
            case FacebookRequestErrorClassification.EC_USER_TOO_MANY_CALLS /* 17 */:
                long longValue = ((Long) obj).longValue();
                kvVar.F((longValue >> 63) ^ (longValue << 1));
                break;
        }
    }

    public final void a() {
        if (this.b) {
            return;
        }
        bm2 bm2Var = this.a;
        int size = bm2Var.m.size();
        for (int i = 0; i < size; i++) {
            Map.Entry c2 = bm2Var.c(i);
            if (c2.getValue() instanceof vu0) {
                vu0 vu0Var = (vu0) c2.getValue();
                vu0Var.getClass();
                q52 q52Var = q52.c;
                q52Var.getClass();
                q52Var.a(vu0Var.getClass()).c(vu0Var);
                vu0Var.h();
            }
        }
        if (!bm2Var.o) {
            if (bm2Var.m.size() > 0) {
                bm2Var.c(0).getKey().getClass();
                b71.o();
                return;
            } else {
                Iterator it = bm2Var.d().iterator();
                if (it.hasNext()) {
                    ((Map.Entry) it.next()).getKey().getClass();
                    b71.o();
                    return;
                }
            }
        }
        if (!bm2Var.o) {
            bm2Var.n = bm2Var.n.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(bm2Var.n);
            bm2Var.q = bm2Var.q.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(bm2Var.q);
            bm2Var.o = true;
        }
        this.b = true;
    }

    public final Object clone() {
        rk0 rk0Var = new rk0();
        bm2 bm2Var = this.a;
        if (bm2Var.m.size() > 0) {
            Map.Entry c2 = bm2Var.c(0);
            if (c2.getKey() != null) {
                b71.o();
                return null;
            }
            c2.getValue();
            throw null;
        }
        Iterator it = bm2Var.d().iterator();
        if (!it.hasNext()) {
            return rk0Var;
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
        if (obj instanceof rk0) {
            return this.a.equals(((rk0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public rk0() {
    }
}
