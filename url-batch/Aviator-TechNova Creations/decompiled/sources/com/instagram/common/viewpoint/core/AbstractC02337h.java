package com.instagram.common.viewpoint.core;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* renamed from: com.facebook.ads.redexgen.X.7h, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC02337h implements InterfaceC1575kN {
    public static String[] A06 = {"A1ZwXb6JdBVxSPYV1ZzpyUVQy2gRfJA9", "vkvPFBYHwcZnb4NzphHjmgFJFbjiYwSo", "W7sj7Up3ABI8RZFTAAZOEHe7srfTkl57", "fls3PiASqtk6GqNgTZFqwBZFoYeyHn2V", "1yDmXHBn42mad7W8CPx8A7RWKYn1BqT7", "CjPJSc8sfbO2R56Y3Yx9Z137FYjSqvlb", "2KSypf5DjPiLYF3nQ7brfSsHONTUzR5A", "k5ePLg8NJJ"};
    public long A00;
    public long A01;
    public C00650t A02;
    public final ArrayDeque<C00650t> A03 = new ArrayDeque<>();
    public final ArrayDeque<AbstractC02347i> A04;
    public final PriorityQueue<C00650t> A05;

    public abstract C1570kI A0Z();

    public abstract void A0b(C02357j c02357j);

    public abstract boolean A0d();

    public AbstractC02337h() {
        for (int i = 0; i < 10; i++) {
            this.A03.add(new C00650t());
        }
        this.A04 = new ArrayDeque<>();
        for (int i2 = 0; i2 < 2; i2++) {
            ArrayDeque<AbstractC02347i> arrayDeque = this.A04;
            final C5S c5s = new C5S() { // from class: com.facebook.ads.redexgen.X.kL
                @Override // com.instagram.common.viewpoint.core.C5S
                public final void AGz(AbstractC1757nX abstractC1757nX) {
                    AbstractC02337h.this.A0c((C00640s) abstractC1757nX);
                }
            };
            arrayDeque.add(new AbstractC02347i(c5s) { // from class: com.facebook.ads.redexgen.X.0s
                public C5S<C00640s> A00;

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.5S != com.facebook.ads.androidx.media3.decoder.DecoderOutputBuffer$Owner<com.facebook.ads.androidx.media3.extractor.text.cea.CeaDecoder$CeaOutputBuffer> */
                {
                    this.A00 = c5s;
                }

                @Override // com.instagram.common.viewpoint.core.AbstractC02347i, com.instagram.common.viewpoint.core.AbstractC1757nX
                public final void A0B() {
                    this.A00.AGz(this);
                }
            });
        }
        this.A05 = new PriorityQueue<>();
    }

    private void A0U(C00650t c00650t) {
        c00650t.A0A();
        this.A03.add(c00650t);
    }

    public final long A0V() {
        return this.A00;
    }

    @Override // com.instagram.common.viewpoint.core.C5O
    /* renamed from: A0W, reason: merged with bridge method [inline-methods] */
    public C02357j A5j() throws C1574kM {
        C3M.A08(this.A02 == null);
        if (this.A03.isEmpty()) {
            return null;
        }
        this.A02 = this.A03.pollFirst();
        return this.A02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f7, code lost:
    
        return null;
     */
    @Override // com.instagram.common.viewpoint.core.C5O
    /* renamed from: A0X */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC02347i A5l() throws C1574kM {
        if (!this.A04.isEmpty()) {
            while (true) {
                boolean isEmpty = this.A05.isEmpty();
                if (A06[5].charAt(7) == 's') {
                    A06[6] = "DOprmnWJZ9SCRw8WSrP7EOY5DTOSvJmV";
                    if (!isEmpty) {
                        C00650t peek = this.A05.peek();
                        if (A06[7].length() == 10) {
                            A06[2] = "urX0HrInINzEpwrp6LaPdmgGjQDQJQna";
                            if (((C00650t) AbstractC01484a.A0f(peek)).A01 > this.A00) {
                                break;
                            }
                            C00650t c00650t = (C00650t) AbstractC01484a.A0f(this.A05.poll());
                            if (c00650t.A05()) {
                                AbstractC02347i abstractC02347i = (AbstractC02347i) AbstractC01484a.A0f(this.A04.pollFirst());
                                abstractC02347i.A00(4);
                                A0U(c00650t);
                                String[] strArr = A06;
                                if (strArr[4].charAt(25) != strArr[3].charAt(25)) {
                                    return abstractC02347i;
                                }
                                String[] strArr2 = A06;
                                strArr2[4] = "oxl05cpa7UEpdlHPP7s3uyaLsYMYJfaH";
                                strArr2[3] = "7KvbtL7fQFgbKwZtHueu0Zl9fYEN12Vy";
                                return abstractC02347i;
                            }
                            A0b(c00650t);
                            if (A0d()) {
                                C1570kI A0Z = A0Z();
                                AbstractC02347i abstractC02347i2 = (AbstractC02347i) AbstractC01484a.A0f(this.A04.pollFirst());
                                long j = c00650t.A01;
                                String[] strArr3 = A06;
                                if (strArr3[4].charAt(25) != strArr3[3].charAt(25)) {
                                    throw new RuntimeException();
                                }
                                A06[5] = "oIgvRTusAdocLQHm4RFtRlwv19XF7U3W";
                                abstractC02347i2.A0C(j, A0Z, Long.MAX_VALUE);
                                A0U(c00650t);
                                return abstractC02347i2;
                            }
                            A0U(c00650t);
                        } else {
                            throw new RuntimeException();
                        }
                    } else {
                        break;
                    }
                } else {
                    throw new RuntimeException();
                }
            }
        } else {
            return null;
        }
    }

    public final AbstractC02347i A0Y() {
        return this.A04.pollFirst();
    }

    @Override // com.instagram.common.viewpoint.core.C5O
    /* renamed from: A0a, reason: merged with bridge method [inline-methods] */
    public void AGZ(C02357j c02357j) throws C1574kM {
        C3M.A07(c02357j == this.A02);
        C00650t c00650t = (C00650t) c02357j;
        if (c00650t.A04()) {
            A0U(c00650t);
        } else {
            long j = this.A01;
            this.A01 = 1 + j;
            c00650t.A00 = j;
            this.A05.add(c00650t);
        }
        if (A06[7].length() != 10) {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[0] = "rj1eyhsOe6SuoM1rYy40tvsoNCkJE80J";
        strArr[1] = "ibYLffFAaVDMN4cD1vowu1tbJEM8Lkom";
        this.A02 = null;
    }

    public final void A0c(AbstractC02347i abstractC02347i) {
        abstractC02347i.A0A();
        this.A04.add(abstractC02347i);
    }

    @Override // com.instagram.common.viewpoint.core.C5O
    public void AGr() {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1575kN
    public void AIx(long j) {
        this.A00 = j;
    }

    @Override // com.instagram.common.viewpoint.core.C5O
    public void flush() {
        this.A01 = 0L;
        this.A00 = 0L;
        while (!this.A05.isEmpty()) {
            A0U((C00650t) AbstractC01484a.A0f(this.A05.poll()));
        }
        if (this.A02 != null) {
            A0U(this.A02);
            this.A02 = null;
        }
    }
}
