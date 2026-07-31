package com.facebook.ads.redexgen.core;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: assets/audience_network/classes2.dex */
public final class AG implements InterfaceC3714pF {
    public static String[] A04 = {"DnWOFrWNtrruVDlZPcn7mSzqB1u3fyA1", "4khCAmOyD7V9Z9fo", "Y1he90jrlOSSnjRb2RN33xbae", "sN3uyyiAo7qwm0FA39xGDer", "C", "MIilbOvYRfmfRo2RH", "W4KUp4d37G5W3qTHHFYFOJnsXzg3Y9", "7BjcD7lz4UoePoP5n6bqbpOg1qjeNk3c"};
    public long A00;
    public Uri A01 = Uri.EMPTY;
    public Map<String, List<String>> A02 = Collections.emptyMap();
    public final InterfaceC3714pF A03;

    public AG(InterfaceC3714pF interfaceC3714pF) {
        this.A03 = (InterfaceC3714pF) AbstractC20023y.A01(interfaceC3714pF);
    }

    public final long A00() {
        return this.A00;
    }

    public final Uri A01() {
        return this.A01;
    }

    public final Map<String, List<String>> A02() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3714pF
    public final void A43(InterfaceC20495t interfaceC20495t) {
        AbstractC20023y.A01(interfaceC20495t);
        this.A03.A43(interfaceC20495t);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3714pF
    public final Map<String, List<String>> A8t() {
        return this.A03.A8t();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3714pF
    public final Uri A9P() {
        return this.A03.A9P();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3714pF
    public final long AGi(C20385i c20385i) throws IOException {
        this.A01 = c20385i.A06;
        this.A02 = Collections.emptyMap();
        long AGi = this.A03.AGi(c20385i);
        this.A01 = (Uri) AbstractC20023y.A01(A9P());
        this.A02 = A8t();
        return AGi;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3714pF
    public final void close() throws IOException {
        this.A03.close();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC19582c
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int read = this.A03.read(bArr, i, i2);
        if (read != -1) {
            long j = this.A00;
            long j2 = read;
            String[] strArr = A04;
            String str = strArr[2];
            String str2 = strArr[1];
            int length = str.length();
            int bytesRead = str2.length();
            if (length == bytesRead) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[2] = "l8Xa62wp4MYShhMptlDz52jvD";
            strArr2[1] = "PdriuKYg1yn0hjm9";
            this.A00 = j + j2;
        }
        return read;
    }
}
