package androidx.datastore.preferences.protobuf;

import f.AbstractC0382a;
import h1.C0438i;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0207q {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f3912c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final C0192b0 f3913a = new C0192b0(16);

    /* renamed from: b, reason: collision with root package name */
    public boolean f3914b;

    static {
        new C0207q(0);
    }

    public C0207q() {
    }

    public static void b(C0202l c0202l, A0 a02, int i3, Object obj) {
        if (a02 == A0.f3777g) {
            c0202l.X(i3, 3);
            ((AbstractC0189a) obj).b(c0202l);
            c0202l.X(i3, 4);
            return;
        }
        c0202l.X(i3, a02.f3781e);
        switch (a02.ordinal()) {
            case 0:
                c0202l.S(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                c0202l.Q(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                c0202l.b0(((Long) obj).longValue());
                break;
            case C0438i.INTEGER_FIELD_NUMBER /* 3 */:
                c0202l.b0(((Long) obj).longValue());
                break;
            case C0438i.LONG_FIELD_NUMBER /* 4 */:
                c0202l.U(((Integer) obj).intValue());
                break;
            case 5:
                c0202l.S(((Long) obj).longValue());
                break;
            case 6:
                c0202l.Q(((Integer) obj).intValue());
                break;
            case C0438i.DOUBLE_FIELD_NUMBER /* 7 */:
                c0202l.K(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof C0197g)) {
                    c0202l.W((String) obj);
                    break;
                } else {
                    c0202l.O((C0197g) obj);
                    break;
                }
            case AbstractC0382a.f4777a /* 9 */:
                ((AbstractC0189a) obj).b(c0202l);
                break;
            case AbstractC0382a.f4779c /* 10 */:
                AbstractC0189a abstractC0189a = (AbstractC0189a) obj;
                c0202l.getClass();
                c0202l.Z(((AbstractC0211v) abstractC0189a).a(null));
                abstractC0189a.b(c0202l);
                break;
            case 11:
                if (!(obj instanceof C0197g)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    c0202l.Z(length);
                    c0202l.L(bArr, 0, length);
                    break;
                } else {
                    c0202l.O((C0197g) obj);
                    break;
                }
            case 12:
                c0202l.Z(((Integer) obj).intValue());
                break;
            case 13:
                c0202l.U(((Integer) obj).intValue());
                break;
            case 14:
                c0202l.Q(((Integer) obj).intValue());
                break;
            case AbstractC0382a.f4781e /* 15 */:
                c0202l.S(((Long) obj).longValue());
                break;
            case 16:
                int intValue = ((Integer) obj).intValue();
                c0202l.Z((intValue >> 31) ^ (intValue << 1));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                c0202l.b0((longValue >> 63) ^ (longValue << 1));
                break;
        }
    }

    public final void a() {
        C0192b0 c0192b0;
        if (this.f3914b) {
            return;
        }
        int i3 = 0;
        while (true) {
            c0192b0 = this.f3913a;
            if (i3 >= c0192b0.f3845e.size()) {
                break;
            }
            Map.Entry c3 = c0192b0.c(i3);
            if (c3.getValue() instanceof AbstractC0211v) {
                AbstractC0211v abstractC0211v = (AbstractC0211v) c3.getValue();
                abstractC0211v.getClass();
                W w3 = W.f3828c;
                w3.getClass();
                w3.a(abstractC0211v.getClass()).h(abstractC0211v);
                abstractC0211v.j();
            }
            i3++;
        }
        if (!c0192b0.f3847g) {
            if (c0192b0.f3845e.size() > 0) {
                c0192b0.c(0).getKey().getClass();
                throw new ClassCastException();
            }
            Iterator it = c0192b0.d().iterator();
            if (it.hasNext()) {
                ((Map.Entry) it.next()).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!c0192b0.f3847g) {
            c0192b0.f3846f = c0192b0.f3846f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(c0192b0.f3846f);
            c0192b0.f3849i = c0192b0.f3849i.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(c0192b0.f3849i);
            c0192b0.f3847g = true;
        }
        this.f3914b = true;
    }

    public final Object clone() {
        C0207q c0207q = new C0207q();
        C0192b0 c0192b0 = this.f3913a;
        if (c0192b0.f3845e.size() > 0) {
            Map.Entry c3 = c0192b0.c(0);
            if (c3.getKey() != null) {
                throw new ClassCastException();
            }
            c3.getValue();
            throw null;
        }
        Iterator it = c0192b0.d().iterator();
        if (!it.hasNext()) {
            return c0207q;
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
        if (obj instanceof C0207q) {
            return this.f3913a.equals(((C0207q) obj).f3913a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3913a.hashCode();
    }

    public C0207q(int i3) {
        a();
        a();
    }
}
