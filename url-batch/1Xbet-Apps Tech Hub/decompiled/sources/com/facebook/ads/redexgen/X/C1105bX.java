package com.facebook.ads.redexgen.X;

import android.graphics.Rect;
import android.os.Handler;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.bX, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1105bX {
    public static String[] A0C = {"YcCIPLCDTe1wGTKdO7xqYhpFwQzvmXtt", "FfIdHaSVTal814YVh5tJNVr21T0wsSAo", "HLDls6wic6LzndIKtUvgWnGJ4QMP07cO", "ccYpD8PuArRKO9YkPTuVfhIh5pDN1br2", "LFFD576NBTVByEN649EglQB81U0zBBuc", "sO5gz1O188I9hNkbLLxzl8j4JWiDgVKK", "Hord6YvHX1lmSPmhXyMRW660HCYjcXOm", "5HbQDpK1pfSpB47EOovGOWVGJlrw1BSl"};
    public InterfaceC1109bb A00;
    public boolean A01;
    public final Rect A02;
    public final Rect A03;
    public final Handler A04;
    public final InterfaceC0804Rp A05;
    public final InterfaceC1116bi A06;
    public final C1107bZ A07;
    public final InterfaceC0506Fw A08;
    public final Runnable A09;
    public final List<Rect> A0A;
    public final List<View> A0B;

    public C1105bX(InterfaceC1116bi interfaceC1116bi, InterfaceC0804Rp interfaceC0804Rp, InterfaceC0506Fw interfaceC0506Fw, C1107bZ c1107bZ, Handler handler) {
        this(interfaceC1116bi, interfaceC0804Rp, interfaceC0506Fw, c1107bZ, handler, 100);
    }

    public C1105bX(InterfaceC1116bi interfaceC1116bi, InterfaceC0804Rp interfaceC0804Rp, InterfaceC0506Fw interfaceC0506Fw, C1107bZ c1107bZ, Handler handler, int i) {
        this.A03 = new Rect();
        this.A02 = new Rect();
        this.A0B = new ArrayList();
        this.A0A = new ArrayList();
        this.A01 = false;
        this.A06 = interfaceC1116bi;
        this.A05 = interfaceC0804Rp;
        this.A08 = interfaceC0506Fw;
        this.A07 = c1107bZ;
        this.A04 = handler;
        this.A09 = new RunnableC1106bY(this, i);
    }

    private void A03(long j) {
        if (this.A0B.isEmpty()) {
            this.A06.A8E(this.A0A);
            this.A08.A3x(j, this.A0A);
            this.A08.A5U();
            return;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04(long j) {
        this.A06.A8E(this.A0A);
        this.A08.A3x(j, this.A0A);
        if (this.A0B.isEmpty()) {
            this.A07.A03(this.A0B);
            Iterator<View> it = this.A0B.iterator();
            loop0: while (true) {
                if (it.hasNext()) {
                    View next = it.next();
                    C1114bg A00 = this.A07.A00(next);
                    Iterator<Rect> it2 = this.A0A.iterator();
                    while (it2.hasNext()) {
                        if (C1098bQ.A00(next, this.A03, this.A02, it2.next()) && A00 != C1114bg.A08) {
                            InterfaceC0506Fw interfaceC0506Fw = this.A08;
                            Rect containerRect = this.A03;
                            Rect rect = this.A02;
                            if (A0C[0].charAt(21) != 'h') {
                                break loop0;
                            }
                            A0C[6] = "BhrT0c14O8Thrmtg3HRzOfRcpCyh5HNl";
                            interfaceC0506Fw.A3R(A00, containerRect, rect);
                        }
                    }
                } else {
                    this.A08.A5U();
                    InterfaceC1109bb interfaceC1109bb = this.A00;
                    if (interfaceC1109bb != null) {
                        interfaceC1109bb.ACr();
                    }
                    this.A0B.clear();
                    String[] strArr = A0C;
                    if (strArr[1].charAt(9) != strArr[3].charAt(9)) {
                        String[] strArr2 = A0C;
                        strArr2[1] = "lmQ3TWUKEycrXTOUs6diKoA3HcDn9Pdd";
                        strArr2[3] = "T2sieqBmgvCwHjMtYcExspPM2F3LyLlD";
                        return;
                    }
                }
            }
            throw new RuntimeException();
        }
        throw new IllegalStateException();
    }

    public final void A07() {
        InterfaceC1109bb interfaceC1109bb = this.A00;
        if (interfaceC1109bb != null) {
            interfaceC1109bb.ACr();
        }
        if (this.A01) {
            this.A04.removeCallbacks(this.A09);
            A03(this.A05.AAE());
        }
        this.A01 = false;
        if (A0C[0].charAt(21) != 'h') {
            throw new RuntimeException();
        }
        A0C[0] = "Da2exFZBguRvp8OTbNDxEhbqIKaEOHIs";
    }

    public final void A08() {
        if (!this.A01) {
            this.A01 = true;
            this.A04.post(this.A09);
        }
    }

    public final void A09(InterfaceC1111bd interfaceC1111bd) {
        this.A08.AFW(interfaceC1111bd);
    }

    public final void A0A(InterfaceC1109bb interfaceC1109bb) {
        this.A00 = interfaceC1109bb;
    }
}
