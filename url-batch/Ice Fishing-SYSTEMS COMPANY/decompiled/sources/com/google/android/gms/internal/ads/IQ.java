package com.google.android.gms.internal.ads;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes2.dex */
public final class IQ extends AbstractC3689oQ {

    /* renamed from: r, reason: collision with root package name */
    public static final C3235g2 f25558r;

    /* renamed from: k, reason: collision with root package name */
    public final AbstractC3473kQ[] f25559k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f25560l;

    /* renamed from: m, reason: collision with root package name */
    public final AbstractC3832r8[] f25561m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f25562n;

    /* renamed from: o, reason: collision with root package name */
    public int f25563o = -1;

    /* renamed from: p, reason: collision with root package name */
    public long[][] f25564p;

    /* renamed from: q, reason: collision with root package name */
    public B1.y f25565q;

    static {
        SB sb = UB.f27942u;
        C3675oC c3675oC = C3675oC.f33115x;
        List list = Collections.EMPTY_LIST;
        C3987u1 c3987u1 = C3987u1.f34507a;
        f25558r = new C3235g2("MergingMediaSource", new C(), null, new C4256z0(), C3181f3.f30581B);
    }

    public IQ(C3796qP c3796qP, AbstractC3473kQ... abstractC3473kQArr) {
        this.f25559k = abstractC3473kQArr;
        this.f25562n = new ArrayList(Arrays.asList(abstractC3473kQArr));
        this.f25560l = new ArrayList(abstractC3473kQArr.length);
        int i = 0;
        while (true) {
            int length = abstractC3473kQArr.length;
            if (i >= length) {
                this.f25561m = new AbstractC3832r8[length];
                this.f25564p = new long[0][];
                new HashMap();
                PA.n(new JB(0).isEmpty());
                return;
            }
            this.f25560l.add(new ArrayList());
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3473kQ
    public final void a(C3235g2 c3235g2) {
        this.f25559k[0].a(c3235g2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3473kQ
    public final void b(AQ aq) {
        GQ gq = (GQ) aq;
        int i = 0;
        while (true) {
            AbstractC3473kQ[] abstractC3473kQArr = this.f25559k;
            if (i >= abstractC3473kQArr.length) {
                return;
            }
            List list = (List) this.f25560l.get(i);
            boolean z8 = gq.f25171u[i];
            AQ[] aqArr = gq.f25170n;
            AQ aq2 = z8 ? ((C2932aR) aqArr[i]).f29207n : aqArr[i];
            int i4 = 0;
            while (true) {
                if (i4 >= list.size()) {
                    break;
                }
                if (((HQ) list.get(i4)).f25373b.equals(aq2)) {
                    list.remove(i4);
                    break;
                }
                i4++;
            }
            abstractC3473kQArr[i].b(gq.f25171u[i] ? ((C2932aR) aqArr[i]).f29207n : aqArr[i]);
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3473kQ
    public final AQ c(BQ bq, InterfaceC3985u interfaceC3985u, long j9) {
        AbstractC3473kQ[] abstractC3473kQArr = this.f25559k;
        int length = abstractC3473kQArr.length;
        AQ[] aqArr = new AQ[length];
        AbstractC3832r8[] abstractC3832r8Arr = this.f25561m;
        int e6 = abstractC3832r8Arr[0].e(bq.f24043a);
        for (int i = 0; i < length; i++) {
            BQ a9 = bq.a(abstractC3832r8Arr[i].f(e6));
            aqArr[i] = abstractC3473kQArr[i].c(a9, interfaceC3985u, j9 - this.f25564p[e6][i]);
            ((List) this.f25560l.get(i)).add(new HQ(a9, aqArr[i]));
        }
        return new GQ(this.f25564p[e6], aqArr);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3473kQ
    public final C3235g2 f() {
        AbstractC3473kQ[] abstractC3473kQArr = this.f25559k;
        return abstractC3473kQArr.length > 0 ? abstractC3473kQArr[0].f() : f25558r;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3473kQ
    public final void h(A a9) {
        this.f33143j = AbstractC3548lu.p();
        int i = 0;
        while (true) {
            AbstractC3473kQ[] abstractC3473kQArr = this.f25559k;
            if (i >= abstractC3473kQArr.length) {
                return;
            }
            t(Integer.valueOf(i), abstractC3473kQArr[i]);
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3689oQ, com.google.android.gms.internal.ads.AbstractC3473kQ
    public final void j() {
        super.j();
        Arrays.fill(this.f25561m, (Object) null);
        this.f25563o = -1;
        this.f25565q = null;
        ArrayList arrayList = this.f25562n;
        arrayList.clear();
        Collections.addAll(arrayList, this.f25559k);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3689oQ, com.google.android.gms.internal.ads.AbstractC3473kQ
    public final void r() {
        B1.y yVar = this.f25565q;
        if (yVar != null) {
            throw yVar;
        }
        super.r();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3689oQ
    public final void s(Integer num, AbstractC3473kQ abstractC3473kQ, AbstractC3832r8 abstractC3832r8) {
        int i;
        if (this.f25565q != null) {
            return;
        }
        if (this.f25563o == -1) {
            i = abstractC3832r8.c();
            this.f25563o = i;
        } else {
            int c4 = abstractC3832r8.c();
            int i4 = this.f25563o;
            if (c4 != i4) {
                this.f25565q = new B1.y();
                return;
            }
            i = i4;
        }
        int length = this.f25564p.length;
        AbstractC3832r8[] abstractC3832r8Arr = this.f25561m;
        if (length == 0) {
            this.f25564p = (long[][]) Array.newInstance((Class<?>) Long.TYPE, i, abstractC3832r8Arr.length);
        }
        ArrayList arrayList = this.f25562n;
        arrayList.remove(abstractC3473kQ);
        abstractC3832r8Arr[num.intValue()] = abstractC3832r8;
        if (arrayList.isEmpty()) {
            k(abstractC3832r8Arr[0]);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3689oQ
    public final /* synthetic */ BQ v(Integer num, BQ bq) {
        int intValue = num.intValue();
        ArrayList arrayList = this.f25560l;
        List list = (List) arrayList.get(intValue);
        for (int i = 0; i < list.size(); i++) {
            if (((HQ) list.get(i)).f25372a.equals(bq)) {
                return ((HQ) ((List) arrayList.get(0)).get(i)).f25372a;
            }
        }
        return null;
    }
}
