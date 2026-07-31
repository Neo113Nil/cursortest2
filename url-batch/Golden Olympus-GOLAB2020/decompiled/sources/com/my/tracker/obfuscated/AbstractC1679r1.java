package com.my.tracker.obfuscated;

import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;

/* renamed from: com.my.tracker.obfuscated.r1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1679r1 {

    /* renamed from: a, reason: collision with root package name */
    protected final r f21515a = new r(16384);

    /* renamed from: b, reason: collision with root package name */
    protected final r f21516b = new r(Base64Utils.IO_BUFFER_SIZE);

    public synchronized void a() {
        this.f21515a.d();
        this.f21516b.d();
    }

    protected static void a(AbstractC1683s1 abstractC1683s1, String str, C1655l0 c1655l0, C1690u0 c1690u0, r rVar) {
        rVar.a();
        rVar.a(1, str);
        if (c1655l0 != null && !TextUtils.isEmpty(c1655l0.f21408a)) {
            boolean z4 = c1655l0.f21409b;
            rVar.a(2, c1655l0.f21408a);
            rVar.a(3, z4 ? 1 : 0);
        }
        if (c1690u0 != null && !TextUtils.isEmpty(c1690u0.f21538a)) {
            boolean z5 = c1690u0.f21539b;
            rVar.a(4, c1690u0.f21538a);
            rVar.a(5, z5 ? 1 : 0);
        }
        if (rVar.b() > 0) {
            abstractC1683s1.a(31, rVar);
        }
    }

    protected static void a(AbstractC1683s1 abstractC1683s1, C1634g c1634g, C1607a0 c1607a0, r rVar, r rVar2) {
        rVar.a();
        if (c1634g != null) {
            rVar2.a();
            rVar2.a(1, c1634g.f21319a);
            long j4 = c1634g.f21320b;
            if (j4 != -1) {
                rVar2.a(2, j4);
            }
            if (rVar2.b() > 0) {
                rVar.a(31, rVar2);
            }
        }
        rVar.a(1, c1607a0.f21111g);
        rVar.a(2, c1607a0.f21110f);
        rVar.a(3, c1607a0.f21115k);
        rVar.a(4, c1607a0.f21109e);
        abstractC1683s1.a(21, rVar);
    }

    protected static void a(AbstractC1683s1 abstractC1683s1, String str, String str2, C1635g0 c1635g0, r rVar, r rVar2) {
        C1607a0 c1607a0 = c1635g0.f21323c;
        rVar.a();
        a(rVar, str, c1635g0.f21324d, c1635g0.f21325e, rVar2);
        int i4 = c1607a0.f21105a;
        if (i4 != -1) {
            rVar.a(1, i4);
        }
        if (!TextUtils.isEmpty(c1607a0.f21108d)) {
            rVar.a(2, c1607a0.f21108d);
        }
        if (!TextUtils.isEmpty(c1607a0.f21114j)) {
            rVar.a(3, c1607a0.f21114j);
        }
        if (!TextUtils.isEmpty(c1607a0.f21120p)) {
            rVar.a(4, c1607a0.f21120p);
        }
        if (!TextUtils.isEmpty(c1607a0.f21106b)) {
            rVar.a(5, c1607a0.f21106b);
        }
        if (!TextUtils.isEmpty(c1607a0.f21107c)) {
            rVar.a(6, c1607a0.f21107c);
        }
        if (!TextUtils.isEmpty(c1607a0.f21113i)) {
            rVar.a(7, c1607a0.f21113i);
        }
        if (!TextUtils.isEmpty(c1607a0.f21112h)) {
            rVar.a(8, c1607a0.f21112h);
        }
        int i5 = c1607a0.f21127w;
        if (i5 != -1) {
            rVar.a(9, i5);
        }
        int i6 = c1607a0.f21121q;
        if (i6 != -1) {
            rVar.a(10, i6);
        }
        int i7 = c1607a0.f21122r;
        if (i7 != -1) {
            rVar.a(11, i7);
        }
        int i8 = c1607a0.f21123s;
        if (i8 != -1) {
            rVar.a(12, i8);
        }
        if (!Float.isNaN(c1607a0.f21125u)) {
            rVar.a(13, c1607a0.f21125u);
        }
        if (!Float.isNaN(c1607a0.f21126v)) {
            rVar.a(14, c1607a0.f21126v);
        }
        if (!Float.isNaN(c1607a0.f21124t)) {
            rVar.a(15, c1607a0.f21124t);
        }
        rVar.a(16, str2);
        C1666o c1666o = c1635g0.f21330j;
        if (c1666o != null) {
            int i9 = c1666o.f21464a;
            if (i9 != -1) {
                rVar.a(17, i9);
            }
            int i10 = c1666o.f21465b;
            if (i10 >= 0) {
                rVar.a(18, i10);
            }
        }
        long j4 = c1607a0.f21128x;
        if (j4 != -1) {
            rVar.a(19, j4);
        }
        long j5 = c1607a0.f21129y;
        if (j5 != -1) {
            rVar.a(20, j5);
        }
        int i11 = c1607a0.f21130z;
        if (i11 != -1) {
            rVar.a(23, i11);
        }
        int i12 = c1607a0.f21104A;
        if (i12 != -1) {
            rVar.a(24, i12);
        }
        C1643i0 c1643i0 = c1635g0.f21331k;
        if (c1643i0 != null && !TextUtils.isEmpty(c1643i0.f21367a)) {
            rVar.a(25, c1635g0.f21331k.f21367a);
        }
        if (rVar.b() > 0) {
            abstractC1683s1.a(23, rVar);
        }
    }

    protected static void a(AbstractC1683s1 abstractC1683s1, C1608a1 c1608a1, r rVar) {
        if (c1608a1.equals(C1608a1.f21131g)) {
            return;
        }
        rVar.a();
        if (!Double.isNaN(c1608a1.f21133b)) {
            rVar.a(1, c1608a1.f21133b);
        }
        if (!Double.isNaN(c1608a1.f21134c)) {
            rVar.a(2, c1608a1.f21134c);
        }
        if (!Float.isNaN(c1608a1.f21135d)) {
            rVar.a(3, c1608a1.f21135d);
        }
        if (!Float.isNaN(c1608a1.f21136e)) {
            rVar.a(4, c1608a1.f21136e);
        }
        long j4 = c1608a1.f21137f;
        if (j4 > 0) {
            rVar.a(5, AbstractC1700w2.b(j4));
        }
        int i4 = c1608a1.f21132a;
        if (i4 != -1) {
            rVar.a(6, i4);
        }
        if (rVar.b() > 0) {
            abstractC1683s1.a(26, rVar);
        }
    }

    protected static void a(AbstractC1683s1 abstractC1683s1, C1644i1 c1644i1, C1706y0 c1706y0, C1607a0 c1607a0, r rVar) {
        rVar.a();
        int i4 = c1644i1.f21368a;
        if (i4 != -1) {
            rVar.a(1, i4);
        }
        Boolean bool = c1644i1.f21370c;
        if (bool != null) {
            rVar.a(7, bool == Boolean.TRUE ? 1 : 0);
        }
        rVar.a(2, c1644i1.f21369b);
        if (!TextUtils.isEmpty(c1607a0.f21116l)) {
            rVar.a(3, c1607a0.f21116l);
        }
        if (!TextUtils.isEmpty(c1607a0.f21117m)) {
            rVar.a(4, c1607a0.f21117m);
        }
        if (!TextUtils.isEmpty(c1607a0.f21118n)) {
            rVar.a(5, c1607a0.f21118n);
        }
        if (!TextUtils.isEmpty(c1607a0.f21119o)) {
            rVar.a(6, c1607a0.f21119o);
        }
        if (c1706y0 != null) {
            rVar.a(8, c1706y0.f21577a);
        }
        rVar.a(11, c1644i1.f21371d != 2 ? 0 : 1);
        if (rVar.b() > 0) {
            abstractC1683s1.a(25, rVar);
        }
    }

    protected static void a(AbstractC1683s1 abstractC1683s1, C1615b3 c1615b3, r rVar) {
        rVar.a();
        int i4 = c1615b3.f21152b;
        if (i4 == 0 || i4 == 1 || i4 == 2) {
            rVar.a(1, i4);
        }
        int i5 = c1615b3.f21151a;
        if (i5 > -1) {
            rVar.a(2, i5);
        }
        rVar.a(3, c1615b3.f21153c);
        rVar.a(4, c1615b3.f21154d);
        rVar.a(5, c1615b3.f21155e);
        rVar.a(6, c1615b3.f21156f);
        rVar.a(7, c1615b3.f21157g);
        rVar.a(8, c1615b3.f21158h);
        rVar.a(9, c1615b3.f21159i);
        if (rVar.b() > 0) {
            abstractC1683s1.a(22, rVar);
        }
    }
}
