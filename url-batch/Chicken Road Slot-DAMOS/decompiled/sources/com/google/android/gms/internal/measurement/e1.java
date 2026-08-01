package com.google.android.gms.internal.measurement;

import com.appsflyer.attribution.RequestError;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e1 {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f2245c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final q2 f2246a = new q2();

    /* renamed from: b, reason: collision with root package name */
    public boolean f2247b;

    static {
        new e1(0);
    }

    public e1(int i3) {
        a();
        a();
    }

    public static void b(b1 b1Var, c3 c3Var, int i3, Object obj) {
        if (c3Var == c3.f2184r) {
            b1Var.d(i3, 3);
            ((k1) ((o0) obj)).f(b1Var);
            b1Var.d(i3, 4);
            return;
        }
        b1Var.d(i3, c3Var.f2188e);
        d3 d3Var = d3.f2213d;
        switch (c3Var.ordinal()) {
            case 0:
                b1Var.u(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                b1Var.s(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                b1Var.t(((Long) obj).longValue());
                break;
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                b1Var.t(((Long) obj).longValue());
                break;
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                b1Var.q(((Integer) obj).intValue());
                break;
            case a4.j.STRING_FIELD_NUMBER /* 5 */:
                b1Var.u(((Long) obj).longValue());
                break;
            case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                b1Var.s(((Integer) obj).intValue());
                break;
            case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                b1Var.p(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                if (!(obj instanceof v0)) {
                    b1Var.v((String) obj);
                    break;
                } else {
                    b1Var.m((v0) obj);
                    break;
                }
            case 9:
                ((k1) ((o0) obj)).f(b1Var);
                break;
            case 10:
                b1Var.o((o0) obj);
                break;
            case RequestError.STOP_TRACKING /* 11 */:
                if (!(obj instanceof v0)) {
                    byte[] bArr = (byte[]) obj;
                    b1Var.n(bArr.length, bArr);
                    break;
                } else {
                    b1Var.m((v0) obj);
                    break;
                }
            case 12:
                b1Var.r(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof m1)) {
                    b1Var.q(((Integer) obj).intValue());
                    break;
                } else {
                    b1Var.q(((m1) obj).a());
                    break;
                }
            case 14:
                b1Var.s(((Integer) obj).intValue());
                break;
            case 15:
                b1Var.u(((Long) obj).longValue());
                break;
            case 16:
                int intValue = ((Integer) obj).intValue();
                b1Var.r((intValue >> 31) ^ (intValue + intValue));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                b1Var.t((longValue >> 63) ^ (longValue + longValue));
                break;
        }
    }

    public final void a() {
        if (this.f2247b) {
            return;
        }
        q2 q2Var = this.f2246a;
        int i3 = q2Var.f2694e;
        for (int i10 = 0; i10 < i3; i10++) {
            Object obj = q2Var.a(i10).f2726e;
            if (obj instanceof k1) {
                k1 k1Var = (k1) obj;
                l2.f2493c.a(k1Var.getClass()).h(k1Var);
                k1Var.h();
            }
        }
        Iterator it = q2Var.b().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof k1) {
                k1 k1Var2 = (k1) value;
                l2.f2493c.a(k1Var2.getClass()).h(k1Var2);
                k1Var2.h();
            }
        }
        if (!q2Var.f2696r) {
            if (q2Var.f2694e > 0) {
                q2Var.a(0).f2725d.getClass();
                kotlin.collections.i0.j();
                return;
            } else {
                Iterator it2 = q2Var.b().iterator();
                if (it2.hasNext()) {
                    ((Map.Entry) it2.next()).getKey().getClass();
                    kotlin.collections.i0.j();
                    return;
                }
            }
        }
        if (!q2Var.f2696r) {
            q2Var.f2695i = q2Var.f2695i.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(q2Var.f2695i);
            q2Var.f2698t = q2Var.f2698t.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(q2Var.f2698t);
            q2Var.f2696r = true;
        }
        this.f2247b = true;
    }

    public final Object clone() {
        e1 e1Var = new e1();
        q2 q2Var = this.f2246a;
        if (q2Var.f2694e > 0) {
            q2Var.a(0).f2725d.getClass();
            kotlin.collections.i0.j();
            return null;
        }
        Iterator it = q2Var.b().iterator();
        if (!it.hasNext()) {
            return e1Var;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (entry.getKey() != null) {
            kotlin.collections.i0.j();
            return null;
        }
        entry.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e1) {
            return this.f2246a.equals(((e1) obj).f2246a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2246a.hashCode();
    }

    public e1() {
    }
}
