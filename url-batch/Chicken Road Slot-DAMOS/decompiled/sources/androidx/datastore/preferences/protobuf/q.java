package androidx.datastore.preferences.protobuf;

import com.appsflyer.attribution.RequestError;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f606c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final y0 f607a = y0.f();

    /* renamed from: b, reason: collision with root package name */
    public boolean f608b;

    static {
        new q(0);
    }

    public q(int i3) {
        a();
        a();
    }

    public static void b(l lVar, r1 r1Var, int i3, Object obj) {
        if (r1Var == r1.f617r) {
            lVar.B(i3, 3);
            ((a) obj).b(lVar);
            lVar.B(i3, 4);
        }
        lVar.B(i3, r1Var.f621e);
        switch (r1Var.ordinal()) {
            case 0:
                lVar.u(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                lVar.s(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                lVar.F(((Long) obj).longValue());
                break;
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                lVar.F(((Long) obj).longValue());
                break;
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                lVar.w(((Integer) obj).intValue());
                break;
            case a4.j.STRING_FIELD_NUMBER /* 5 */:
                lVar.u(((Long) obj).longValue());
                break;
            case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                lVar.s(((Integer) obj).intValue());
                break;
            case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                lVar.m(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                if (!(obj instanceof f)) {
                    lVar.A((String) obj);
                    break;
                } else {
                    lVar.q((f) obj);
                    break;
                }
            case 9:
                ((a) obj).b(lVar);
                break;
            case 10:
                a aVar = (a) obj;
                lVar.getClass();
                lVar.D(((v) aVar).a(null));
                aVar.b(lVar);
                break;
            case RequestError.STOP_TRACKING /* 11 */:
                if (!(obj instanceof f)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    lVar.D(length);
                    lVar.n(bArr, 0, length);
                    break;
                } else {
                    lVar.q((f) obj);
                    break;
                }
            case 12:
                lVar.D(((Integer) obj).intValue());
                break;
            case 13:
                lVar.w(((Integer) obj).intValue());
                break;
            case 14:
                lVar.s(((Integer) obj).intValue());
                break;
            case 15:
                lVar.u(((Long) obj).longValue());
                break;
            case 16:
                int intValue = ((Integer) obj).intValue();
                lVar.D((intValue >> 31) ^ (intValue << 1));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                lVar.F((longValue >> 63) ^ (longValue << 1));
                break;
        }
    }

    public final void a() {
        if (this.f608b) {
            return;
        }
        y0 y0Var = this.f607a;
        int size = y0Var.f653d.size();
        for (int i3 = 0; i3 < size; i3++) {
            Map.Entry c10 = y0Var.c(i3);
            if (c10.getValue() instanceof v) {
                v vVar = (v) c10.getValue();
                vVar.getClass();
                t0 t0Var = t0.f636c;
                t0Var.getClass();
                t0Var.a(vVar.getClass()).d(vVar);
                vVar.h();
            }
        }
        if (!y0Var.f655i) {
            if (y0Var.f653d.size() > 0) {
                y0Var.c(0).getKey().getClass();
                kotlin.collections.i0.j();
                return;
            } else {
                Iterator it = y0Var.d().iterator();
                if (it.hasNext()) {
                    ((Map.Entry) it.next()).getKey().getClass();
                    kotlin.collections.i0.j();
                    return;
                }
            }
        }
        if (!y0Var.f655i) {
            y0Var.f654e = y0Var.f654e.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(y0Var.f654e);
            y0Var.f657s = y0Var.f657s.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(y0Var.f657s);
            y0Var.f655i = true;
        }
        this.f608b = true;
    }

    public final Object clone() {
        q qVar = new q();
        y0 y0Var = this.f607a;
        if (y0Var.f653d.size() > 0) {
            Map.Entry c10 = y0Var.c(0);
            if (c10.getKey() != null) {
                kotlin.collections.i0.j();
                return null;
            }
            c10.getValue();
            throw null;
        }
        Iterator it = y0Var.d().iterator();
        if (!it.hasNext()) {
            return qVar;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (entry.getKey() != null) {
            kotlin.collections.i0.j();
            return null;
        }
        entry.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            return this.f607a.equals(((q) obj).f607a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f607a.hashCode();
    }

    public q() {
    }
}
