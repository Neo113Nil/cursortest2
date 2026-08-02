package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f4683c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Y f4684a = Y.f();

    /* renamed from: b, reason: collision with root package name */
    public boolean f4685b;

    static {
        new r(0);
    }

    public r() {
    }

    public static void b(C0180m c0180m, r0 r0Var, int i4, Object obj) {
        if (r0Var == r0.f4687d) {
            c0180m.t0(i4, 3);
            ((AbstractC0168a) obj).b(c0180m);
            c0180m.t0(i4, 4);
        }
        c0180m.t0(i4, r0Var.f4691b);
        switch (r0Var.ordinal()) {
            case 0:
                c0180m.n0(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                c0180m.l0(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                c0180m.x0(((Long) obj).longValue());
                break;
            case 3:
                c0180m.x0(((Long) obj).longValue());
                break;
            case 4:
                c0180m.p0(((Integer) obj).intValue());
                break;
            case 5:
                c0180m.n0(((Long) obj).longValue());
                break;
            case 6:
                c0180m.l0(((Integer) obj).intValue());
                break;
            case 7:
                c0180m.f0(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof C0174g)) {
                    c0180m.s0((String) obj);
                    break;
                } else {
                    c0180m.j0((C0174g) obj);
                    break;
                }
            case 9:
                ((AbstractC0168a) obj).b(c0180m);
                break;
            case 10:
                AbstractC0168a abstractC0168a = (AbstractC0168a) obj;
                c0180m.getClass();
                c0180m.v0(((AbstractC0189w) abstractC0168a).a(null));
                abstractC0168a.b(c0180m);
                break;
            case 11:
                if (!(obj instanceof C0174g)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    c0180m.v0(length);
                    c0180m.g0(bArr, 0, length);
                    break;
                } else {
                    c0180m.j0((C0174g) obj);
                    break;
                }
            case 12:
                c0180m.v0(((Integer) obj).intValue());
                break;
            case 13:
                c0180m.p0(((Integer) obj).intValue());
                break;
            case 14:
                c0180m.l0(((Integer) obj).intValue());
                break;
            case 15:
                c0180m.n0(((Long) obj).longValue());
                break;
            case 16:
                int intValue = ((Integer) obj).intValue();
                c0180m.v0((intValue >> 31) ^ (intValue << 1));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                c0180m.x0((longValue >> 63) ^ (longValue << 1));
                break;
        }
    }

    public final void a() {
        if (this.f4685b) {
            return;
        }
        Y y4 = this.f4684a;
        int size = y4.f4605a.size();
        for (int i4 = 0; i4 < size; i4++) {
            Map.Entry c4 = y4.c(i4);
            if (c4.getValue() instanceof AbstractC0189w) {
                AbstractC0189w abstractC0189w = (AbstractC0189w) c4.getValue();
                abstractC0189w.getClass();
                T t4 = T.f4591c;
                t4.getClass();
                t4.a(abstractC0189w.getClass()).c(abstractC0189w);
                abstractC0189w.h();
            }
        }
        if (!y4.f4607c) {
            if (y4.f4605a.size() > 0) {
                y4.c(0).getKey().getClass();
                throw new ClassCastException();
            }
            Iterator it = y4.d().iterator();
            if (it.hasNext()) {
                ((Map.Entry) it.next()).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!y4.f4607c) {
            y4.f4606b = y4.f4606b.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(y4.f4606b);
            y4.f4609e = y4.f4609e.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(y4.f4609e);
            y4.f4607c = true;
        }
        this.f4685b = true;
    }

    public final Object clone() {
        r rVar = new r();
        Y y4 = this.f4684a;
        if (y4.f4605a.size() > 0) {
            Map.Entry c4 = y4.c(0);
            if (c4.getKey() != null) {
                throw new ClassCastException();
            }
            c4.getValue();
            throw null;
        }
        Iterator it = y4.d().iterator();
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
            return this.f4684a.equals(((r) obj).f4684a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4684a.hashCode();
    }

    public r(int i4) {
        a();
        a();
    }
}
