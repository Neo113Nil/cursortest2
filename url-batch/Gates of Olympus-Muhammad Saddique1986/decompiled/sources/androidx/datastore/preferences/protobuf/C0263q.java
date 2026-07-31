package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import r.AbstractC0856c;

/* renamed from: androidx.datastore.preferences.protobuf.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0263q {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f5113c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final C0248b0 f5114a = new C0248b0(16);

    /* renamed from: b, reason: collision with root package name */
    public boolean f5115b;

    static {
        new C0263q(0);
    }

    public C0263q() {
    }

    public static void b(C0258l c0258l, A0 a02, int i3, Object obj) {
        if (a02 == A0.f4977g) {
            c0258l.X(i3, 3);
            ((AbstractC0245a) obj).b(c0258l);
            c0258l.X(i3, 4);
            return;
        }
        c0258l.X(i3, a02.f4981e);
        switch (a02.ordinal()) {
            case 0:
                c0258l.S(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                c0258l.Q(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                c0258l.b0(((Long) obj).longValue());
                break;
            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                c0258l.b0(((Long) obj).longValue());
                break;
            case k1.i.LONG_FIELD_NUMBER /* 4 */:
                c0258l.U(((Integer) obj).intValue());
                break;
            case 5:
                c0258l.S(((Long) obj).longValue());
                break;
            case 6:
                c0258l.Q(((Integer) obj).intValue());
                break;
            case k1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                c0258l.K(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case k1.i.BYTES_FIELD_NUMBER /* 8 */:
                if (!(obj instanceof C0253g)) {
                    c0258l.W((String) obj);
                    break;
                } else {
                    c0258l.O((C0253g) obj);
                    break;
                }
            case AbstractC0856c.f8037c /* 9 */:
                ((AbstractC0245a) obj).b(c0258l);
                break;
            case AbstractC0856c.f8039e /* 10 */:
                AbstractC0245a abstractC0245a = (AbstractC0245a) obj;
                c0258l.getClass();
                c0258l.Z(((AbstractC0267v) abstractC0245a).a(null));
                abstractC0245a.b(c0258l);
                break;
            case 11:
                if (!(obj instanceof C0253g)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    c0258l.Z(length);
                    c0258l.L(bArr, 0, length);
                    break;
                } else {
                    c0258l.O((C0253g) obj);
                    break;
                }
            case 12:
                c0258l.Z(((Integer) obj).intValue());
                break;
            case 13:
                c0258l.U(((Integer) obj).intValue());
                break;
            case 14:
                c0258l.Q(((Integer) obj).intValue());
                break;
            case AbstractC0856c.f8041g /* 15 */:
                c0258l.S(((Long) obj).longValue());
                break;
            case 16:
                int intValue = ((Integer) obj).intValue();
                c0258l.Z((intValue >> 31) ^ (intValue << 1));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                c0258l.b0((longValue >> 63) ^ (longValue << 1));
                break;
        }
    }

    public final void a() {
        C0248b0 c0248b0;
        if (this.f5115b) {
            return;
        }
        int i3 = 0;
        while (true) {
            c0248b0 = this.f5114a;
            if (i3 >= c0248b0.f5046e.size()) {
                break;
            }
            Map.Entry c2 = c0248b0.c(i3);
            if (c2.getValue() instanceof AbstractC0267v) {
                AbstractC0267v abstractC0267v = (AbstractC0267v) c2.getValue();
                abstractC0267v.getClass();
                W w2 = W.f5029c;
                w2.getClass();
                w2.a(abstractC0267v.getClass()).h(abstractC0267v);
                abstractC0267v.j();
            }
            i3++;
        }
        if (!c0248b0.f5048g) {
            if (c0248b0.f5046e.size() > 0) {
                c0248b0.c(0).getKey().getClass();
                throw new ClassCastException();
            }
            Iterator it = c0248b0.d().iterator();
            if (it.hasNext()) {
                ((Map.Entry) it.next()).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!c0248b0.f5048g) {
            c0248b0.f5047f = c0248b0.f5047f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(c0248b0.f5047f);
            c0248b0.f5050i = c0248b0.f5050i.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(c0248b0.f5050i);
            c0248b0.f5048g = true;
        }
        this.f5115b = true;
    }

    public final Object clone() {
        C0263q c0263q = new C0263q();
        C0248b0 c0248b0 = this.f5114a;
        if (c0248b0.f5046e.size() > 0) {
            Map.Entry c2 = c0248b0.c(0);
            if (c2.getKey() != null) {
                throw new ClassCastException();
            }
            c2.getValue();
            throw null;
        }
        Iterator it = c0248b0.d().iterator();
        if (!it.hasNext()) {
            return c0263q;
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
        if (obj instanceof C0263q) {
            return this.f5114a.equals(((C0263q) obj).f5114a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5114a.hashCode();
    }

    public C0263q(int i3) {
        a();
        a();
    }
}
