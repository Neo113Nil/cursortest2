package com.google.android.gms.internal.consent_sdk;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.consent_sdk.l2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4356l2 {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f35876c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final K2 f35877a = new K2();

    /* renamed from: b, reason: collision with root package name */
    public boolean f35878b;

    static {
        new C4356l2(0);
    }

    public C4356l2() {
    }

    public static void b(C4344i2 c4344i2, W2 w22, int i, Object obj) {
        if (w22 == W2.f35793x) {
            c4344i2.y(i, 3);
            ((AbstractC4320c2) obj).a(c4344i2);
            c4344i2.y(i, 4);
            return;
        }
        c4344i2.y(i, w22.f35796u);
        X2 x22 = X2.f35800n;
        switch (w22.ordinal()) {
            case 0:
                c4344i2.u(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                c4344i2.s(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                c4344i2.C(((Long) obj).longValue());
                break;
            case 3:
                c4344i2.C(((Long) obj).longValue());
                break;
            case 4:
                c4344i2.w(((Integer) obj).intValue());
                break;
            case 5:
                c4344i2.u(((Long) obj).longValue());
                break;
            case 6:
                c4344i2.s(((Integer) obj).intValue());
                break;
            case 7:
                byte booleanValue = ((Boolean) obj).booleanValue();
                if (c4344i2.f35854e == c4344i2.f35853d) {
                    c4344i2.k();
                }
                int i4 = c4344i2.f35854e;
                c4344i2.f35852c[i4] = booleanValue;
                c4344i2.f35854e = i4 + 1;
                break;
            case 8:
                if (!(obj instanceof C4340h2)) {
                    c4344i2.x((String) obj);
                    break;
                } else {
                    c4344i2.q((C4340h2) obj);
                    break;
                }
            case 9:
                ((AbstractC4320c2) obj).a(c4344i2);
                break;
            case 10:
                AbstractC4320c2 abstractC4320c2 = (AbstractC4320c2) obj;
                c4344i2.A(abstractC4320c2.c());
                abstractC4320c2.a(c4344i2);
                break;
            case 11:
                if (!(obj instanceof C4340h2)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    c4344i2.A(length);
                    c4344i2.D(length, bArr);
                    break;
                } else {
                    c4344i2.q((C4340h2) obj);
                    break;
                }
            case 12:
                c4344i2.A(((Integer) obj).intValue());
                break;
            case 13:
                c4344i2.w(((Integer) obj).intValue());
                break;
            case 14:
                c4344i2.s(((Integer) obj).intValue());
                break;
            case 15:
                c4344i2.u(((Long) obj).longValue());
                break;
            case 16:
                int intValue = ((Integer) obj).intValue();
                c4344i2.A((intValue >> 31) ^ (intValue + intValue));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                c4344i2.C((longValue >> 63) ^ (longValue + longValue));
                break;
        }
    }

    public final void a() {
        if (this.f35878b) {
            return;
        }
        K2 k22 = this.f35877a;
        int i = k22.f35721u;
        for (int i4 = 0; i4 < i; i4++) {
            Object obj = k22.c(i4).f35729u;
            if (obj instanceof AbstractC4368o2) {
                ((AbstractC4368o2) obj).j();
            }
        }
        Iterator it = k22.a().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof AbstractC4368o2) {
                ((AbstractC4368o2) value).j();
            }
        }
        if (!k22.f35723w) {
            if (k22.f35721u > 0) {
                k22.c(0).f35728n.getClass();
                throw new ClassCastException();
            }
            Iterator it2 = k22.a().iterator();
            if (it2.hasNext()) {
                ((Map.Entry) it2.next()).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!k22.f35723w) {
            k22.f35722v = k22.f35722v.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(k22.f35722v);
            k22.f35725y = k22.f35725y.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(k22.f35725y);
            k22.f35723w = true;
        }
        this.f35878b = true;
    }

    public final Object clone() {
        C4356l2 c4356l2 = new C4356l2();
        K2 k22 = this.f35877a;
        if (k22.f35721u > 0) {
            L2 c4 = k22.c(0);
            if (c4.f35728n != null) {
                throw new ClassCastException();
            }
            Object obj = c4.f35729u;
            throw null;
        }
        Iterator it = k22.a().iterator();
        if (!it.hasNext()) {
            return c4356l2;
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
        if (obj instanceof C4356l2) {
            return this.f35877a.equals(((C4356l2) obj).f35877a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f35877a.hashCode();
    }

    public C4356l2(int i) {
        a();
        a();
    }
}
