package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f2338c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Y f2339a = Y.f();

    /* renamed from: b, reason: collision with root package name */
    public boolean f2340b;

    static {
        new r(0);
    }

    public r() {
    }

    public static void b(C0146m c0146m, r0 r0Var, int i3, Object obj) {
        if (r0Var == r0.f2342d) {
            c0146m.q0(i3, 3);
            ((AbstractC0134a) obj).b(c0146m);
            c0146m.q0(i3, 4);
        }
        c0146m.q0(i3, r0Var.f2345b);
        switch (r0Var.ordinal()) {
            case 0:
                c0146m.k0(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                c0146m.i0(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                c0146m.u0(((Long) obj).longValue());
                break;
            case 3:
                c0146m.u0(((Long) obj).longValue());
                break;
            case 4:
                c0146m.m0(((Integer) obj).intValue());
                break;
            case 5:
                c0146m.k0(((Long) obj).longValue());
                break;
            case 6:
                c0146m.i0(((Integer) obj).intValue());
                break;
            case 7:
                c0146m.c0(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof C0140g)) {
                    c0146m.p0((String) obj);
                    break;
                } else {
                    c0146m.g0((C0140g) obj);
                    break;
                }
            case 9:
                ((AbstractC0134a) obj).b(c0146m);
                break;
            case 10:
                AbstractC0134a abstractC0134a = (AbstractC0134a) obj;
                c0146m.getClass();
                c0146m.s0(((AbstractC0155w) abstractC0134a).a(null));
                abstractC0134a.b(c0146m);
                break;
            case 11:
                if (!(obj instanceof C0140g)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    c0146m.s0(length);
                    c0146m.d0(bArr, 0, length);
                    break;
                } else {
                    c0146m.g0((C0140g) obj);
                    break;
                }
            case 12:
                c0146m.s0(((Integer) obj).intValue());
                break;
            case 13:
                c0146m.m0(((Integer) obj).intValue());
                break;
            case 14:
                c0146m.i0(((Integer) obj).intValue());
                break;
            case 15:
                c0146m.k0(((Long) obj).longValue());
                break;
            case 16:
                int intValue = ((Integer) obj).intValue();
                c0146m.s0((intValue >> 31) ^ (intValue << 1));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                c0146m.u0((longValue >> 63) ^ (longValue << 1));
                break;
        }
    }

    public final void a() {
        if (this.f2340b) {
            return;
        }
        Y y3 = this.f2339a;
        int size = y3.f2266a.size();
        for (int i3 = 0; i3 < size; i3++) {
            Map.Entry c3 = y3.c(i3);
            if (c3.getValue() instanceof AbstractC0155w) {
                AbstractC0155w abstractC0155w = (AbstractC0155w) c3.getValue();
                abstractC0155w.getClass();
                T t3 = T.f2253c;
                t3.getClass();
                t3.a(abstractC0155w.getClass()).d(abstractC0155w);
                abstractC0155w.h();
            }
        }
        if (!y3.f2268c) {
            if (y3.f2266a.size() > 0) {
                y3.c(0).getKey().getClass();
                throw new ClassCastException();
            }
            Iterator it = y3.d().iterator();
            if (it.hasNext()) {
                ((Map.Entry) it.next()).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!y3.f2268c) {
            y3.f2267b = y3.f2267b.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(y3.f2267b);
            y3.f2270e = y3.f2270e.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(y3.f2270e);
            y3.f2268c = true;
        }
        this.f2340b = true;
    }

    public final Object clone() {
        r rVar = new r();
        Y y3 = this.f2339a;
        if (y3.f2266a.size() > 0) {
            Map.Entry c3 = y3.c(0);
            if (c3.getKey() != null) {
                throw new ClassCastException();
            }
            c3.getValue();
            throw null;
        }
        Iterator it = y3.d().iterator();
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
            return this.f2339a.equals(((r) obj).f2339a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2339a.hashCode();
    }

    public r(int i3) {
        a();
        a();
    }
}
