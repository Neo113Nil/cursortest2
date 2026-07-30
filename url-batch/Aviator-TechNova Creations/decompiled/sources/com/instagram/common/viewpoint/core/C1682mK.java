package com.instagram.common.viewpoint.core;

import android.net.Uri;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.mK, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1682mK implements InterfaceC0401Ej, CD {
    public static String[] A0E = {"SSDELygzudefytBtRYlDWoyFfpg", "4SEnazR2Nu4dPKZqq", "4H9jqKlT7lQdtxWBQl9xa6akogWkCWsp", "Wknx73gM1GoPE2GN1snRYal1oMjUwY3P", "7txELYcTJwThSLRxJ5dUM1K4qPQ", "gA7GGJKubAjwOro28", "9KdodW4K4GXGszeM7wnefptXiT4TjY3", ""};
    public long A00;
    public AnonymousClass56 A01;
    public H1 A02;
    public boolean A04;
    public final Uri A06;
    public final C3W A07;
    public final C02669b A08;
    public final InterfaceC0341Cb A09;
    public final GY A0A;
    public volatile boolean A0C;
    public final /* synthetic */ C9A A0D;
    public final C0463Gt A0B = new C0463Gt();
    public boolean A03 = true;
    public final long A05 = CE.A00();

    public C1682mK(C9A c9a, Uri uri, InterfaceC1771nl interfaceC1771nl, InterfaceC0341Cb interfaceC0341Cb, GY gy, C3W c3w) {
        this.A0D = c9a;
        this.A06 = uri;
        this.A08 = new C02669b(interfaceC1771nl);
        this.A09 = interfaceC0341Cb;
        this.A0A = gy;
        this.A07 = c3w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04(long j, long j2) {
        this.A0B.A00 = j;
        this.A00 = j2;
        this.A03 = true;
        this.A04 = false;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0401Ej
    public final void A4j() {
        this.A0C = true;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0401Ej
    public final void AAi() throws IOException {
        int i = 0;
        while (i == 0 && !this.A0C) {
            try {
                long j = this.A0B.A00;
                this.A01 = new AnonymousClass56(this.A06, j, -1L, this.A0D.A0b);
                long AFy = this.A08.AFy(this.A01);
                if (AFy != -1) {
                    AFy += j;
                    this.A0D.A0G();
                }
                this.A0D.A09 = null;
                InterfaceC1771nl interfaceC1771nl = this.A08;
                if (this.A0D.A09 != null && this.A0D.A09.A01 != -1) {
                    final C02669b c02669b = this.A08;
                    final int i2 = this.A0D.A09.A01;
                    interfaceC1771nl = new InterfaceC1771nl(c02669b, i2, this) { // from class: com.facebook.ads.redexgen.X.9B
                        public int A00;
                        public final int A01;
                        public final InterfaceC1771nl A02;
                        public final CD A03;
                        public final byte[] A04;

                        {
                            C3M.A07(i2 > 0);
                            this.A02 = c02669b;
                            this.A01 = i2;
                            this.A03 = this;
                            this.A04 = new byte[1];
                            this.A00 = i2;
                        }

                        private boolean A00() throws IOException {
                            int bytesRead = this.A02.read(this.A04, 0, 1);
                            if (bytesRead == -1) {
                                return false;
                            }
                            int bytesRead2 = this.A04[0];
                            int metadataLength = (bytesRead2 & 255) << 4;
                            if (metadataLength == 0) {
                                return true;
                            }
                            int i3 = 0;
                            int i4 = metadataLength;
                            byte[] bArr = new byte[metadataLength];
                            while (i4 > 0) {
                                int bytesRead3 = this.A02.read(bArr, i3, i4);
                                if (bytesRead3 == -1) {
                                    return false;
                                }
                                i3 += bytesRead3;
                                i4 -= bytesRead3;
                            }
                            while (metadataLength > 0) {
                                int bytesRead4 = metadataLength - 1;
                                if (bArr[bytesRead4] != 0) {
                                    break;
                                }
                                metadataLength--;
                            }
                            if (metadataLength > 0) {
                                this.A03.ADR(new C4J(bArr, metadataLength));
                            }
                            return true;
                        }

                        @Override // com.instagram.common.viewpoint.core.InterfaceC1771nl
                        public final void A3v(C5H c5h) {
                            C3M.A01(c5h);
                            this.A02.A3v(c5h);
                        }

                        @Override // com.instagram.common.viewpoint.core.InterfaceC1771nl
                        public final Map<String, List<String>> A8l() {
                            return this.A02.A8l();
                        }

                        @Override // com.instagram.common.viewpoint.core.InterfaceC1771nl
                        public final Uri A9H() {
                            return this.A02.A9H();
                        }

                        @Override // com.instagram.common.viewpoint.core.InterfaceC1771nl
                        public final long AFy(AnonymousClass56 anonymousClass56) {
                            throw new UnsupportedOperationException();
                        }

                        @Override // com.instagram.common.viewpoint.core.InterfaceC1771nl
                        public final void close() {
                            throw new UnsupportedOperationException();
                        }

                        @Override // com.instagram.common.viewpoint.core.AnonymousClass20
                        public final int read(byte[] bArr, int i3, int i4) throws IOException {
                            if (this.A00 == 0) {
                                if (!A00()) {
                                    return -1;
                                }
                                this.A00 = this.A01;
                            }
                            int read = this.A02.read(bArr, i3, Math.min(this.A00, i4));
                            if (read != -1) {
                                int bytesRead = this.A00;
                                this.A00 = bytesRead - read;
                            }
                            return read;
                        }
                    };
                    this.A02 = this.A0D.A0Z();
                    this.A02.A6W(C9A.A0g);
                }
                this.A09.AA3(interfaceC1771nl, this.A06, this.A08.A8l(), j, AFy, this.A0A);
                if (this.A0D.A09 != null) {
                    this.A09.A5q();
                }
                if (this.A03) {
                    this.A09.AIM(j, this.A00);
                    this.A03 = false;
                }
                while (i == 0 && !this.A0C) {
                    try {
                        this.A07.A00();
                        i = this.A09.AGc(this.A0B);
                        long position = this.A09.A7S();
                        if (position > this.A0D.A0M + j) {
                            j = position;
                            this.A07.A02();
                            this.A0D.A0O.post(this.A0D.A0a);
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (i == 1) {
                    i = 0;
                } else {
                    long A7S = this.A09.A7S();
                    String[] strArr = A0E;
                    if (strArr[2].charAt(24) != strArr[3].charAt(24)) {
                        throw new RuntimeException();
                    }
                    A0E[6] = "OKjnlHtv3KbBLefZQYMpPe9SdH47QI1";
                    if (A7S != -1) {
                        this.A0B.A00 = this.A09.A7S();
                    }
                }
                AnonymousClass51.A00(this.A08);
            } catch (Throwable th) {
                if (i != 1 && this.A09.A7S() != -1) {
                    this.A0B.A00 = this.A09.A7S();
                }
                AnonymousClass51.A00(this.A08);
                throw th;
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.CD
    public final void ADR(C4J c4j) {
        long max;
        if (this.A04) {
            max = Math.max(this.A0D.A03(true), this.A00);
        } else {
            max = this.A00;
        }
        int A07 = c4j.A07();
        H1 h1 = (H1) C3M.A01(this.A02);
        h1.AI7(c4j, A07);
        h1.AIA(max, 1, A07, 0, null);
        this.A04 = true;
    }
}
