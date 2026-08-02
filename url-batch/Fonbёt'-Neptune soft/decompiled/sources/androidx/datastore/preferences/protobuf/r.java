package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f1733c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Y f1734a = Y.f();

    /* renamed from: b, reason: collision with root package name */
    public boolean f1735b;

    static {
        new r(0);
    }

    public r() {
    }

    public static void b(C0150m c0150m, r0 r0Var, int i2, Object obj) {
        if (r0Var == r0.f1737h) {
            c0150m.H0(i2, 3);
            ((AbstractC0138a) obj).b(c0150m);
            c0150m.H0(i2, 4);
            return;
        }
        c0150m.H0(i2, r0Var.f1741f);
        switch (r0Var.ordinal()) {
            case 0:
                c0150m.C0(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                c0150m.A0(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                c0150m.L0(((Long) obj).longValue());
                break;
            case 3:
                c0150m.L0(((Long) obj).longValue());
                break;
            case K.k.LONG_FIELD_NUMBER /* 4 */:
                c0150m.E0(((Integer) obj).intValue());
                break;
            case K.k.STRING_FIELD_NUMBER /* 5 */:
                c0150m.C0(((Long) obj).longValue());
                break;
            case K.k.STRING_SET_FIELD_NUMBER /* 6 */:
                c0150m.A0(((Integer) obj).intValue());
                break;
            case K.k.DOUBLE_FIELD_NUMBER /* 7 */:
                c0150m.u0(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case K.k.BYTES_FIELD_NUMBER /* 8 */:
                if (!(obj instanceof C0144g)) {
                    c0150m.G0((String) obj);
                    break;
                } else {
                    c0150m.y0((C0144g) obj);
                    break;
                }
            case 9:
                ((AbstractC0138a) obj).b(c0150m);
                break;
            case 10:
                AbstractC0138a abstractC0138a = (AbstractC0138a) obj;
                c0150m.getClass();
                c0150m.J0(((AbstractC0159w) abstractC0138a).a(null));
                abstractC0138a.b(c0150m);
                break;
            case 11:
                if (!(obj instanceof C0144g)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    c0150m.J0(length);
                    c0150m.v0(bArr, 0, length);
                    break;
                } else {
                    c0150m.y0((C0144g) obj);
                    break;
                }
            case 12:
                c0150m.J0(((Integer) obj).intValue());
                break;
            case 13:
                c0150m.E0(((Integer) obj).intValue());
                break;
            case 14:
                c0150m.A0(((Integer) obj).intValue());
                break;
            case 15:
                c0150m.C0(((Long) obj).longValue());
                break;
            case 16:
                int intValue = ((Integer) obj).intValue();
                c0150m.J0((intValue >> 31) ^ (intValue << 1));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                c0150m.L0((longValue >> 63) ^ (longValue << 1));
                break;
        }
    }

    public final void a() {
        if (this.f1735b) {
            return;
        }
        Y y2 = this.f1734a;
        int size = y2.f1657e.size();
        for (int i2 = 0; i2 < size; i2++) {
            Map.Entry c2 = y2.c(i2);
            if (c2.getValue() instanceof AbstractC0159w) {
                AbstractC0159w abstractC0159w = (AbstractC0159w) c2.getValue();
                abstractC0159w.getClass();
                T t2 = T.f1643c;
                t2.getClass();
                t2.a(abstractC0159w.getClass()).h(abstractC0159w);
                abstractC0159w.j();
            }
        }
        if (!y2.f1659g) {
            if (y2.f1657e.size() > 0) {
                y2.c(0).getKey().getClass();
                throw new ClassCastException();
            }
            Iterator it = y2.d().iterator();
            if (it.hasNext()) {
                ((Map.Entry) it.next()).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!y2.f1659g) {
            y2.f1658f = y2.f1658f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(y2.f1658f);
            y2.f1661i = y2.f1661i.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(y2.f1661i);
            y2.f1659g = true;
        }
        this.f1735b = true;
    }

    public final Object clone() {
        r rVar = new r();
        Y y2 = this.f1734a;
        if (y2.f1657e.size() > 0) {
            Map.Entry c2 = y2.c(0);
            if (c2.getKey() != null) {
                throw new ClassCastException();
            }
            c2.getValue();
            throw null;
        }
        Iterator it = y2.d().iterator();
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
            return this.f1734a.equals(((r) obj).f1734a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1734a.hashCode();
    }

    public r(int i2) {
        a();
        a();
    }
}
