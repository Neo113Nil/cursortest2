package com.instagram.common.viewpoint.core;

import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.util.List;

/* loaded from: assets/audience_network/classes2.dex */
public final class M1 extends AbstractC1187Qq<C0907Fq> {
    public int A00;
    public int A01;
    public int A02;
    public InterfaceC1380Yh A03;
    public C1784fp A04;
    public String A05;
    public List<C1677e5> A06;
    public final SparseBooleanArray A07 = new SparseBooleanArray();
    public final AbstractC2004jd A08;
    public final C1245Sx A09;
    public final C1839gi A0A;
    public final VA A0B;
    public final UK A0C;
    public final Y2 A0D;
    public final C6X A0E;
    public final DZ A0F;

    public M1(C1839gi c1839gi, List<C1677e5> list, AbstractC2004jd abstractC2004jd, VA va, UK uk, InterfaceC1380Yh interfaceC1380Yh, String str, C6X c6x, DZ dz) {
        this.A0A = c1839gi;
        this.A0B = va;
        this.A0C = uk;
        this.A09 = uk.A14();
        this.A04 = uk.A1G();
        this.A0D = uk.A1E();
        this.A03 = interfaceC1380Yh;
        this.A08 = abstractC2004jd;
        this.A06 = list;
        this.A05 = str;
        this.A0E = c6x;
        this.A0F = dz;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC1187Qq
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C0907Fq A0F(ViewGroup viewGroup, int i) {
        return new C0907Fq(AbstractC1519bW.A00(new C1555c6(this.A0A, this.A0B, this.A03, this.A08, null, this.A04, this.A0D).A0R(this.A0F).A0N(this.A0C).A0U(), this.A0C, this.A05, this.A0E), this.A07, this.A04, this.A06.size(), this.A0A, this.A08.A2A());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC1187Qq
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final void A0K(C0907Fq c0907Fq, int i) {
        C1677e5 c1677e5 = this.A06.get(i);
        c0907Fq.A0q(this.A04);
        c0907Fq.A0p(c1677e5, this.A0B, this.A09, this.A0D, this.A05, this.A00, this.A02, this.A01);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1187Qq
    public final int A0B() {
        return this.A06.size();
    }

    public final void A0O(int i, int i4, int i9) {
        boolean needsUpdate = i != this.A00;
        this.A00 = i;
        this.A02 = i4;
        this.A01 = i9;
        if (needsUpdate) {
            A0G();
        }
    }

    public final void A0P(C1784fp c1784fp) {
        this.A04 = c1784fp;
    }
}
