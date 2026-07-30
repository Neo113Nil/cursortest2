package com.instagram.common.viewpoint.core;

import android.content.pm.PackageManager;
import android.util.Base64;
import com.anythink.core.common.s.a.c;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import java.util.Map;

/* loaded from: assets/audience_network/classes2.dex */
public class TZ extends AbstractRunnableC1326Wc {
    public static byte[] A02;
    public static String[] A03 = {"rr4pEtDer0K6hYSMypGI4SVA4", "qv2m0fG", "2OIR1Yv9Y7RzsB5MK8fjyIRTaeFBsJy", "02JyCSWW55zn1AQ6h7F4FoBumR9MK", "PV14KCf6Ep37wllo1HHxqudNmgtveNCD", "8xcTKK5W7UNHePnVaLckl2F", "lGpL0wggi73mqN0I3cVtORcNpouSV80j", "84RqxglWV7M6OmuSAB1gnMVf4"};
    public final /* synthetic */ WA A00;
    public final /* synthetic */ WD A01;

    public static String A00(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i4);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 98);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{121, 115, 97, 124, Byte.MAX_VALUE, 112, 112, 123, 108, 97, 117, 123, 103, 18, 51, 124, 50, 57, 40, 43, 51, 46, 55, 124, c.f16476c, 51, 50, 50, 57, c.f16476c, 40, 53, 51, 50};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1326Wc
    public final void A07() {
        C1839gi c1839gi;
        C1839gi c1839gi2;
        C1839gi c1839gi3;
        C1839gi c1839gi4;
        C1839gi c1839gi5;
        long j9;
        C1839gi c1839gi6;
        String str;
        Map<? extends String, ? extends String> map;
        InterfaceC1791fw A032;
        C1839gi c1839gi7;
        C1839gi c1839gi8;
        C1839gi c1839gi9;
        C1839gi c1839gi10;
        long j10;
        this.A01.A00 = System.currentTimeMillis();
        c1839gi = this.A01.A05;
        if (AbstractC1372Xz.A00(c1839gi) == EnumC1371Xy.A07) {
            this.A01.A0A();
            AdErrorType adErrorType = AdErrorType.NETWORK_ERROR;
            String A00 = A00(13, 21, 62);
            c1839gi10 = this.A01.A05;
            InterfaceC1065Lt A0F = c1839gi10.A0F();
            j10 = this.A01.A01;
            A0F.A3W(Y1.A01(j10), adErrorType.getErrorCode(), A00, adErrorType.isPublicError());
            this.A01.A0E(new C1311Vm(adErrorType, A00));
            return;
        }
        c1839gi2 = this.A01.A05;
        C1261Tn.A08(c1839gi2);
        c1839gi3 = this.A01.A05;
        SZ.A07(c1839gi3);
        UG A002 = UG.A00();
        c1839gi4 = this.A01.A05;
        boolean z8 = true;
        Map<String, String> A0A = this.A00.A0A(A002.A01(c1839gi4, true).A7y(this.A00.A05()));
        this.A01.A03 = A0A;
        try {
            c1839gi7 = this.A01.A05;
            PackageManager packageManager = c1839gi7.getPackageManager();
            if (packageManager != null) {
                String A003 = A00(1, 12, 92);
                StringBuilder sb = new StringBuilder();
                c1839gi8 = this.A01.A05;
                StringBuilder append = sb.append(c1839gi8.getPackageName()).append(A00(0, 1, 59));
                c1839gi9 = this.A01.A05;
                A0A.put(A003, new String(Base64.encode(append.append(packageManager.getInstallerPackageName(c1839gi9.getPackageName())).toString().getBytes(), 2)));
            }
        } catch (Exception unused) {
        }
        try {
            if (this.A00.A07() != EnumC1314Vq.A04 && this.A00.A07() != EnumC1314Vq.A06 && this.A00.A07() != EnumC1314Vq.A05 && this.A00.A07() != null) {
                z8 = false;
            }
            c1839gi6 = this.A01.A05;
            InterfaceC1790fv A022 = C1808gD.A02(z8, c1839gi6);
            str = this.A01.A07;
            C1804g9 c1804g9 = new C1804g9();
            map = this.A01.A03;
            byte[] A08 = c1804g9.A05(map).A08();
            A032 = this.A01.A03(Y1.A00(), this.A00);
            A022.AGy(str, A08, A032);
        } catch (Exception e6) {
            AdErrorType adErrorType2 = AdErrorType.AD_REQUEST_FAILED;
            String message = e6.getMessage();
            c1839gi5 = this.A01.A05;
            InterfaceC1065Lt A0F2 = c1839gi5.A0F();
            j9 = this.A01.A01;
            A0F2.A3W(Y1.A01(j9), adErrorType2.getErrorCode(), message, adErrorType2.isPublicError());
            WD wd = this.A01;
            C1311Vm A01 = C1311Vm.A01(adErrorType2, message);
            if (A03[3].length() != 29) {
                throw new RuntimeException();
            }
            A03[3] = "TysUXKeFt8WChM0CalDFmuBH7ELd8";
            wd.A0E(A01);
        }
    }

    static {
        A01();
    }

    public TZ(WD wd, WA wa) {
        this.A01 = wd;
        this.A00 = wa;
    }
}
