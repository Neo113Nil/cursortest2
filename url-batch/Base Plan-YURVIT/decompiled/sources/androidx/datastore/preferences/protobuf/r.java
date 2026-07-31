package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f1573c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Y f1574a = Y.f();

    /* renamed from: b, reason: collision with root package name */
    public boolean f1575b;

    static {
        new r(0);
    }

    public r() {
    }

    public static void b(C0101m c0101m, s0 s0Var, int i2, Object obj) {
        if (s0Var == s0.f1582h) {
            c0101m.o0(i2, 3);
            ((AbstractC0089a) obj).b(c0101m);
            c0101m.o0(i2, 4);
        }
        c0101m.o0(i2, s0Var.f1586f);
        switch (s0Var.ordinal()) {
            case 0:
                c0101m.i0(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                c0101m.g0(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case H.k.FLOAT_FIELD_NUMBER /* 2 */:
                c0101m.s0(((Long) obj).longValue());
                break;
            case H.k.INTEGER_FIELD_NUMBER /* 3 */:
                c0101m.s0(((Long) obj).longValue());
                break;
            case H.k.LONG_FIELD_NUMBER /* 4 */:
                c0101m.k0(((Integer) obj).intValue());
                break;
            case H.k.STRING_FIELD_NUMBER /* 5 */:
                c0101m.i0(((Long) obj).longValue());
                break;
            case H.k.STRING_SET_FIELD_NUMBER /* 6 */:
                c0101m.g0(((Integer) obj).intValue());
                break;
            case H.k.DOUBLE_FIELD_NUMBER /* 7 */:
                c0101m.a0(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case H.k.BYTES_FIELD_NUMBER /* 8 */:
                if (!(obj instanceof C0095g)) {
                    c0101m.n0((String) obj);
                    break;
                } else {
                    c0101m.e0((C0095g) obj);
                    break;
                }
            case 9:
                ((AbstractC0089a) obj).b(c0101m);
                break;
            case 10:
                AbstractC0089a abstractC0089a = (AbstractC0089a) obj;
                c0101m.getClass();
                c0101m.q0(((AbstractC0110w) abstractC0089a).a(null));
                abstractC0089a.b(c0101m);
                break;
            case 11:
                if (!(obj instanceof C0095g)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    c0101m.q0(length);
                    c0101m.b0(bArr, 0, length);
                    break;
                } else {
                    c0101m.e0((C0095g) obj);
                    break;
                }
            case 12:
                c0101m.q0(((Integer) obj).intValue());
                break;
            case 13:
                c0101m.k0(((Integer) obj).intValue());
                break;
            case 14:
                c0101m.g0(((Integer) obj).intValue());
                break;
            case 15:
                c0101m.i0(((Long) obj).longValue());
                break;
            case 16:
                int intValue = ((Integer) obj).intValue();
                c0101m.q0((intValue >> 31) ^ (intValue << 1));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                c0101m.s0((longValue >> 63) ^ (longValue << 1));
                break;
        }
    }

    public final void a() {
        if (this.f1575b) {
            return;
        }
        Y y2 = this.f1574a;
        int size = y2.f1497e.size();
        for (int i2 = 0; i2 < size; i2++) {
            Map.Entry c2 = y2.c(i2);
            if (c2.getValue() instanceof AbstractC0110w) {
                AbstractC0110w abstractC0110w = (AbstractC0110w) c2.getValue();
                abstractC0110w.getClass();
                T t = T.f1483c;
                t.getClass();
                t.a(abstractC0110w.getClass()).d(abstractC0110w);
                abstractC0110w.h();
            }
        }
        if (!y2.f1499g) {
            if (y2.f1497e.size() > 0) {
                y2.c(0).getKey().getClass();
                throw new ClassCastException();
            }
            Iterator it = y2.d().iterator();
            if (it.hasNext()) {
                ((Map.Entry) it.next()).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!y2.f1499g) {
            y2.f1498f = y2.f1498f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(y2.f1498f);
            y2.f1501i = y2.f1501i.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(y2.f1501i);
            y2.f1499g = true;
        }
        this.f1575b = true;
    }

    public final Object clone() {
        r rVar = new r();
        Y y2 = this.f1574a;
        if (y2.f1497e.size() > 0) {
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
            return this.f1574a.equals(((r) obj).f1574a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1574a.hashCode();
    }

    public r(int i2) {
        a();
        a();
    }
}
