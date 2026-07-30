package androidx.datastore.preferences.protobuf;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f889c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final a1 f890a = new a1(16);

    /* renamed from: b, reason: collision with root package name */
    public boolean f891b;

    static {
        new q(0);
    }

    public q() {
    }

    public static void b(l lVar, z1 z1Var, int i7, Object obj) {
        if (z1Var == z1.f934i) {
            lVar.L(i7, 3);
            ((a) obj).b(lVar);
            lVar.L(i7, 4);
        }
        lVar.L(i7, z1Var.f938g);
        switch (z1Var.ordinal()) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                lVar.F(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                lVar.D(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                lVar.P(((Long) obj).longValue());
                break;
            case 3:
                lVar.P(((Long) obj).longValue());
                break;
            case 4:
                lVar.H(((Integer) obj).intValue());
                break;
            case 5:
                lVar.F(((Long) obj).longValue());
                break;
            case 6:
                lVar.D(((Integer) obj).intValue());
                break;
            case j3.i.DOUBLE_FIELD_NUMBER /* 7 */:
                lVar.x(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof g)) {
                    lVar.K((String) obj);
                    break;
                } else {
                    lVar.B((g) obj);
                    break;
                }
            case q.c.f7259c /* 9 */:
                ((a) obj).b(lVar);
                break;
            case q.c.f7261e /* 10 */:
                a aVar = (a) obj;
                lVar.getClass();
                lVar.N(((v) aVar).a(null));
                aVar.b(lVar);
                break;
            case 11:
                if (!(obj instanceof g)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    lVar.N(length);
                    lVar.y(bArr, 0, length);
                    break;
                } else {
                    lVar.B((g) obj);
                    break;
                }
            case 12:
                lVar.N(((Integer) obj).intValue());
                break;
            case 13:
                lVar.H(((Integer) obj).intValue());
                break;
            case 14:
                lVar.D(((Integer) obj).intValue());
                break;
            case q.c.f7263g /* 15 */:
                lVar.F(((Long) obj).longValue());
                break;
            case 16:
                int intValue = ((Integer) obj).intValue();
                lVar.N((intValue >> 31) ^ (intValue << 1));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                lVar.P((longValue >> 63) ^ (longValue << 1));
                break;
        }
    }

    public final void a() {
        a1 a1Var;
        if (this.f891b) {
            return;
        }
        int i7 = 0;
        while (true) {
            a1Var = this.f890a;
            if (i7 >= a1Var.f779g.size()) {
                break;
            }
            Map.Entry c4 = a1Var.c(i7);
            if (c4.getValue() instanceof v) {
                v vVar = (v) c4.getValue();
                vVar.getClass();
                v0 v0Var = v0.f916c;
                v0Var.getClass();
                v0Var.a(vVar.getClass()).e(vVar);
                vVar.h();
            }
            i7++;
        }
        if (!a1Var.f781i) {
            if (a1Var.f779g.size() > 0) {
                a1Var.c(0).getKey().getClass();
                throw new ClassCastException();
            }
            Iterator it = a1Var.d().iterator();
            if (it.hasNext()) {
                ((Map.Entry) it.next()).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!a1Var.f781i) {
            a1Var.f780h = a1Var.f780h.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(a1Var.f780h);
            a1Var.f783k = a1Var.f783k.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(a1Var.f783k);
            a1Var.f781i = true;
        }
        this.f891b = true;
    }

    public final Object clone() {
        q qVar = new q();
        a1 a1Var = this.f890a;
        if (a1Var.f779g.size() > 0) {
            Map.Entry c4 = a1Var.c(0);
            if (c4.getKey() != null) {
                throw new ClassCastException();
            }
            c4.getValue();
            throw null;
        }
        Iterator it = a1Var.d().iterator();
        if (!it.hasNext()) {
            return qVar;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (entry.getKey() != null) {
            throw new ClassCastException();
        }
        entry.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            return this.f890a.equals(((q) obj).f890a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f890a.hashCode();
    }

    public q(int i7) {
        a();
        a();
    }
}
