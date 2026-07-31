package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f756c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final z0 f757a = z0.f();

    /* renamed from: b, reason: collision with root package name */
    public boolean f758b;

    static {
        new r(0);
    }

    public r() {
    }

    public static void b(m mVar, s1 s1Var, int i, Object obj) {
        if (s1Var == s1.f767g) {
            mVar.e0(i, 3);
            ((a) obj).b(mVar);
            mVar.e0(i, 4);
        }
        mVar.e0(i, s1Var.f770e);
        switch (s1Var.ordinal()) {
            case 0:
                mVar.Y(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                mVar.W(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                mVar.i0(((Long) obj).longValue());
                break;
            case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                mVar.i0(((Long) obj).longValue());
                break;
            case a4.i.LONG_FIELD_NUMBER /* 4 */:
                mVar.a0(((Integer) obj).intValue());
                break;
            case 5:
                mVar.Y(((Long) obj).longValue());
                break;
            case 6:
                mVar.W(((Integer) obj).intValue());
                break;
            case a4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                mVar.Q(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case a4.i.BYTES_FIELD_NUMBER /* 8 */:
                if (!(obj instanceof g)) {
                    mVar.d0((String) obj);
                    break;
                } else {
                    mVar.U((g) obj);
                    break;
                }
            case x.v0.f8304b /* 9 */:
                ((a) obj).b(mVar);
                break;
            case x.v0.f8306d /* 10 */:
                a aVar = (a) obj;
                mVar.getClass();
                mVar.g0(((w) aVar).a(null));
                aVar.b(mVar);
                break;
            case 11:
                if (!(obj instanceof g)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    mVar.g0(length);
                    mVar.R(bArr, 0, length);
                    break;
                } else {
                    mVar.U((g) obj);
                    break;
                }
            case 12:
                mVar.g0(((Integer) obj).intValue());
                break;
            case 13:
                mVar.a0(((Integer) obj).intValue());
                break;
            case 14:
                mVar.W(((Integer) obj).intValue());
                break;
            case x.v0.f8308f /* 15 */:
                mVar.Y(((Long) obj).longValue());
                break;
            case 16:
                int intValue = ((Integer) obj).intValue();
                mVar.g0((intValue >> 31) ^ (intValue << 1));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                mVar.i0((longValue >> 63) ^ (longValue << 1));
                break;
        }
    }

    public final void a() {
        if (this.f758b) {
            return;
        }
        z0 z0Var = this.f757a;
        int size = z0Var.f799d.size();
        for (int i = 0; i < size; i++) {
            Map.Entry c8 = z0Var.c(i);
            if (c8.getValue() instanceof w) {
                w wVar = (w) c8.getValue();
                wVar.getClass();
                u0 u0Var = u0.f784c;
                u0Var.getClass();
                u0Var.a(wVar.getClass()).d(wVar);
                wVar.h();
            }
        }
        if (!z0Var.f801f) {
            if (z0Var.f799d.size() > 0) {
                z0Var.c(0).getKey().getClass();
                throw new ClassCastException();
            }
            Iterator it = z0Var.d().iterator();
            if (it.hasNext()) {
                ((Map.Entry) it.next()).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!z0Var.f801f) {
            z0Var.f800e = z0Var.f800e.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(z0Var.f800e);
            z0Var.f803h = z0Var.f803h.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(z0Var.f803h);
            z0Var.f801f = true;
        }
        this.f758b = true;
    }

    public final Object clone() {
        r rVar = new r();
        z0 z0Var = this.f757a;
        if (z0Var.f799d.size() > 0) {
            Map.Entry c8 = z0Var.c(0);
            if (c8.getKey() != null) {
                throw new ClassCastException();
            }
            c8.getValue();
            throw null;
        }
        Iterator it = z0Var.d().iterator();
        if (!it.hasNext()) {
            return rVar;
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
        if (obj instanceof r) {
            return this.f757a.equals(((r) obj).f757a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f757a.hashCode();
    }

    public r(int i) {
        a();
        a();
    }
}
