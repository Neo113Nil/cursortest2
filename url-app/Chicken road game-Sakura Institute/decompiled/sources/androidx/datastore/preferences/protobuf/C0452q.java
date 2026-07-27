package androidx.datastore.preferences.protobuf;

import com.appsflyer.attribution.RequestError;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import q.AbstractC1024c;

/* renamed from: androidx.datastore.preferences.protobuf.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0452q {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f5387c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final C0437b0 f5388a = new C0437b0(16);

    /* renamed from: b, reason: collision with root package name */
    public boolean f5389b;

    static {
        new C0452q(0);
    }

    public C0452q() {
    }

    public static void b(C0447l c0447l, A0 a02, int i2, Object obj) {
        if (a02 == A0.f5251j) {
            c0447l.X(i2, 3);
            ((AbstractC0434a) obj).b(c0447l);
            c0447l.X(i2, 4);
            return;
        }
        c0447l.X(i2, a02.f5255e);
        switch (a02.ordinal()) {
            case 0:
                c0447l.S(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                c0447l.Q(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                c0447l.b0(((Long) obj).longValue());
                break;
            case 3:
                c0447l.b0(((Long) obj).longValue());
                break;
            case 4:
                c0447l.U(((Integer) obj).intValue());
                break;
            case 5:
                c0447l.S(((Long) obj).longValue());
                break;
            case 6:
                c0447l.Q(((Integer) obj).intValue());
                break;
            case i1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                c0447l.K(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case i1.i.BYTES_FIELD_NUMBER /* 8 */:
                if (!(obj instanceof C0442g)) {
                    c0447l.W((String) obj);
                    break;
                } else {
                    c0447l.O((C0442g) obj);
                    break;
                }
            case AbstractC1024c.f9242c /* 9 */:
                ((AbstractC0434a) obj).b(c0447l);
                break;
            case 10:
                AbstractC0434a abstractC0434a = (AbstractC0434a) obj;
                c0447l.getClass();
                c0447l.Z(((AbstractC0456v) abstractC0434a).a(null));
                abstractC0434a.b(c0447l);
                break;
            case RequestError.STOP_TRACKING /* 11 */:
                if (!(obj instanceof C0442g)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    c0447l.Z(length);
                    c0447l.L(bArr, 0, length);
                    break;
                } else {
                    c0447l.O((C0442g) obj);
                    break;
                }
            case 12:
                c0447l.Z(((Integer) obj).intValue());
                break;
            case 13:
                c0447l.U(((Integer) obj).intValue());
                break;
            case 14:
                c0447l.Q(((Integer) obj).intValue());
                break;
            case AbstractC1024c.f9246g /* 15 */:
                c0447l.S(((Long) obj).longValue());
                break;
            case 16:
                int intValue = ((Integer) obj).intValue();
                c0447l.Z((intValue >> 31) ^ (intValue << 1));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                c0447l.b0((longValue >> 63) ^ (longValue << 1));
                break;
        }
    }

    public final void a() {
        C0437b0 c0437b0;
        if (this.f5389b) {
            return;
        }
        int i2 = 0;
        while (true) {
            c0437b0 = this.f5388a;
            if (i2 >= c0437b0.f5320e.size()) {
                break;
            }
            Map.Entry d4 = c0437b0.d(i2);
            if (d4.getValue() instanceof AbstractC0456v) {
                AbstractC0456v abstractC0456v = (AbstractC0456v) d4.getValue();
                abstractC0456v.getClass();
                W w4 = W.f5303c;
                w4.getClass();
                w4.a(abstractC0456v.getClass()).h(abstractC0456v);
                abstractC0456v.j();
            }
            i2++;
        }
        if (!c0437b0.f5322j) {
            if (c0437b0.f5320e.size() > 0) {
                c0437b0.d(0).getKey().getClass();
                throw new ClassCastException();
            }
            Iterator it = c0437b0.e().iterator();
            if (it.hasNext()) {
                ((Map.Entry) it.next()).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!c0437b0.f5322j) {
            c0437b0.f5321i = c0437b0.f5321i.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(c0437b0.f5321i);
            c0437b0.f5324l = c0437b0.f5324l.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(c0437b0.f5324l);
            c0437b0.f5322j = true;
        }
        this.f5389b = true;
    }

    public final Object clone() {
        C0452q c0452q = new C0452q();
        C0437b0 c0437b0 = this.f5388a;
        if (c0437b0.f5320e.size() > 0) {
            Map.Entry d4 = c0437b0.d(0);
            if (d4.getKey() != null) {
                throw new ClassCastException();
            }
            d4.getValue();
            throw null;
        }
        Iterator it = c0437b0.e().iterator();
        if (!it.hasNext()) {
            return c0452q;
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
        if (obj instanceof C0452q) {
            return this.f5388a.equals(((C0452q) obj).f5388a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5388a.hashCode();
    }

    public C0452q(int i2) {
        a();
        a();
    }
}
