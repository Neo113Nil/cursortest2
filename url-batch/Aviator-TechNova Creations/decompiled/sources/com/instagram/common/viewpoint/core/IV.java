package com.instagram.common.viewpoint.core;

import com.facebook.ads.androidx.media3.common.DrmInitData;

/* loaded from: assets/audience_network.dex */
public final class IV {
    public static String[] A0A = {"EJzHBf6C0sknf46Vq1Osr72lZWU", "EzVPMe4nRAbvxSng0PXVwtyqLeoR1KIv", "OkBxNGbCc3SGP6NNAhHfxcRtiUQBpmsu", "1fihPQnAv3tt3xF1xxV2XjfJNe5jiXUE", "EaQIZLU4UTAcxpaH6Zb3hTUPzu", "nXVDjS3P8WK4na35on8K5ox1mEuGJ9Tn", "34qesDVsFPLU35m5e8V9GlfuLx1oAXXP", "IwUkif7926Fg"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public IP A04;
    public C0507Im A05;
    public final H1 A06;
    public final C0509Io A07 = new C0509Io();
    public final C4J A09 = new C4J(1);
    public final C4J A08 = new C4J();

    public IV(H1 h1) {
        this.A06 = h1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C0508In A00() {
        C0508In encryptionBox;
        int i = this.A07.A06.A02;
        if (this.A07.A07 != null) {
            encryptionBox = this.A07.A07;
        } else {
            encryptionBox = this.A05.A00(i);
        }
        if (encryptionBox == null || !encryptionBox.A03) {
            return null;
        }
        return encryptionBox;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02() {
        C0508In A00 = A00();
        if (A00 == null) {
            return;
        }
        C4J c4j = this.A07.A0H;
        if (A00.A00 != 0) {
            c4j.A0g(A00.A00);
        }
        if (this.A07.A06(this.A01)) {
            c4j.A0g(c4j.A0M() * 6);
        }
    }

    public final int A04() {
        C4J c4j;
        int vectorSize;
        C0508In A00 = A00();
        if (A00 == null) {
            return 0;
        }
        if (A00.A00 != 0) {
            c4j = this.A07.A0H;
            vectorSize = A00.A00;
        } else {
            byte[] initVectorData = A00.A04;
            this.A08.A0j(initVectorData, initVectorData.length);
            c4j = this.A08;
            vectorSize = initVectorData.length;
        }
        boolean A06 = this.A07.A06(this.A01);
        this.A09.A00[0] = (byte) ((A06 ? 128 : 0) | vectorSize);
        this.A09.A0f(0);
        H1 h1 = this.A06;
        C4J initializationVectorData = this.A09;
        h1.AI7(initializationVectorData, 1);
        this.A06.AI7(c4j, vectorSize);
        if (!A06) {
            int vectorSize2 = vectorSize + 1;
            if (A0A[2].charAt(9) == '1') {
                throw new RuntimeException();
            }
            A0A[3] = "cKav7mEAu9tQ2Y9RA5SJHOCCBpQ48rqR";
            return vectorSize2;
        }
        C4J c4j2 = this.A07.A0H;
        int A0M = c4j2.A0M();
        c4j2.A0g(-2);
        int i = (A0M * 6) + 2;
        this.A06.AI7(c4j2, i);
        return vectorSize + 1 + i;
    }

    public final void A05() {
        this.A07.A01();
        this.A01 = 0;
        this.A02 = 0;
        this.A00 = 0;
        this.A03 = 0;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0006 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A06(long j) {
        for (int i = this.A01; i < searchIndex && this.A07.A00(i) < j; i++) {
            if (this.A07.A0G[i]) {
                this.A03 = i;
            }
        }
    }

    public final void A07(DrmInitData drmInitData) {
        C0508In encryptionBox = this.A05.A00(this.A07.A06.A02);
        this.A06.A6W(this.A05.A07.A09(drmInitData.A01(encryptionBox != null ? encryptionBox.A02 : null)));
    }

    public final void A08(C0507Im c0507Im, IP ip) {
        this.A05 = (C0507Im) C3M.A01(c0507Im);
        this.A04 = (IP) C3M.A01(ip);
        this.A06.A6W(c0507Im.A07);
        A05();
    }

    public final boolean A09() {
        this.A01++;
        this.A00++;
        if (this.A00 != this.A07.A0C[this.A02]) {
            return true;
        }
        this.A02++;
        this.A00 = 0;
        return false;
    }
}
