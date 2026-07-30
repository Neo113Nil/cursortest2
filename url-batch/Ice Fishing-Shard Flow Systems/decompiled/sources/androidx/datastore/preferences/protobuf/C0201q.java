package androidx.datastore.preferences.protobuf;

import com.appsflyer.attribution.RequestError;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0201q {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f3542c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final X f3543a = X.f();

    /* renamed from: b, reason: collision with root package name */
    public boolean f3544b;

    static {
        new C0201q(0);
    }

    public C0201q() {
    }

    public static void b(C0196l c0196l, q0 q0Var, int i2, Object obj) {
        if (q0Var == q0.f3546l) {
            c0196l.t0(i2, 3);
            ((AbstractC0185a) obj).b(c0196l);
            c0196l.t0(i2, 4);
        }
        c0196l.t0(i2, q0Var.f3550e);
        switch (q0Var.ordinal()) {
            case 0:
                c0196l.n0(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                c0196l.l0(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                c0196l.x0(((Long) obj).longValue());
                break;
            case 3:
                c0196l.x0(((Long) obj).longValue());
                break;
            case 4:
                c0196l.p0(((Integer) obj).intValue());
                break;
            case 5:
                c0196l.n0(((Long) obj).longValue());
                break;
            case 6:
                c0196l.l0(((Integer) obj).intValue());
                break;
            case S.j.DOUBLE_FIELD_NUMBER /* 7 */:
                c0196l.f0(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case S.j.BYTES_FIELD_NUMBER /* 8 */:
                if (!(obj instanceof C0191g)) {
                    c0196l.s0((String) obj);
                    break;
                } else {
                    c0196l.j0((C0191g) obj);
                    break;
                }
            case 9:
                ((AbstractC0185a) obj).b(c0196l);
                break;
            case 10:
                AbstractC0185a abstractC0185a = (AbstractC0185a) obj;
                c0196l.getClass();
                c0196l.v0(((AbstractC0205v) abstractC0185a).a(null));
                abstractC0185a.b(c0196l);
                break;
            case RequestError.STOP_TRACKING /* 11 */:
                if (!(obj instanceof C0191g)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    c0196l.v0(length);
                    c0196l.g0(bArr, 0, length);
                    break;
                } else {
                    c0196l.j0((C0191g) obj);
                    break;
                }
            case 12:
                c0196l.v0(((Integer) obj).intValue());
                break;
            case 13:
                c0196l.p0(((Integer) obj).intValue());
                break;
            case 14:
                c0196l.l0(((Integer) obj).intValue());
                break;
            case 15:
                c0196l.n0(((Long) obj).longValue());
                break;
            case 16:
                int intValue = ((Integer) obj).intValue();
                c0196l.v0((intValue >> 31) ^ (intValue << 1));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                c0196l.x0((longValue >> 63) ^ (longValue << 1));
                break;
        }
    }

    public final void a() {
        if (this.f3544b) {
            return;
        }
        X x7 = this.f3543a;
        int size = x7.f3468d.size();
        for (int i2 = 0; i2 < size; i2++) {
            Map.Entry c7 = x7.c(i2);
            if (c7.getValue() instanceof AbstractC0205v) {
                AbstractC0205v abstractC0205v = (AbstractC0205v) c7.getValue();
                abstractC0205v.getClass();
                S s7 = S.f3454c;
                s7.getClass();
                s7.a(abstractC0205v.getClass()).d(abstractC0205v);
                abstractC0205v.h();
            }
        }
        if (!x7.f3470i) {
            if (x7.f3468d.size() > 0) {
                x7.c(0).getKey().getClass();
                throw new ClassCastException();
            }
            Iterator it = x7.d().iterator();
            if (it.hasNext()) {
                ((Map.Entry) it.next()).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!x7.f3470i) {
            x7.f3469e = x7.f3469e.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(x7.f3469e);
            x7.f3472m = x7.f3472m.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(x7.f3472m);
            x7.f3470i = true;
        }
        this.f3544b = true;
    }

    public final Object clone() {
        C0201q c0201q = new C0201q();
        X x7 = this.f3543a;
        if (x7.f3468d.size() > 0) {
            Map.Entry c7 = x7.c(0);
            if (c7.getKey() != null) {
                throw new ClassCastException();
            }
            c7.getValue();
            throw null;
        }
        Iterator it = x7.d().iterator();
        if (!it.hasNext()) {
            return c0201q;
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
        if (obj instanceof C0201q) {
            return this.f3543a.equals(((C0201q) obj).f3543a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3543a.hashCode();
    }

    public C0201q(int i2) {
        a();
        a();
    }
}
