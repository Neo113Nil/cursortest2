package com.instagram.common.viewpoint.core;

import android.net.Uri;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.common.base.Ascii;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import okio.Utf8;

/* renamed from: com.facebook.ads.redexgen.X.mR, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1689mR implements InterfaceC0341Cb {
    public static byte[] A03;
    public static String[] A04 = {"3Cx8VuBaAtU", "mtIvitx", "ijtxGWvqwx8wBPOmSGXshyr4piVUOT73", "1A2eWfmauMvQ3z4CiBElgktZxGJ5t0Vj", "NuAYfoZUoES6MxZb2vdyJB2K3PVOnnYD", "gczB0K5G5", "TBGYu08V4AAoblIa0rbrS9oc16PYokVw", "JGtQJ9cae1Y"};
    public GX A00;
    public InterfaceC1625lN A01;
    public final InterfaceC0445Gb A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 78);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{80, 89, Ascii.SUB, Ascii.SYN, Ascii.FF, Ascii.NAK, Ascii.GS, 89, Ascii.VT, Ascii.FS, Ascii.CAN, Ascii.GS, 89, Ascii.CR, 17, Ascii.FS, 89, 10, Ascii.CR, Ascii.VT, Ascii.FS, Ascii.CAN, Ascii.DC4, 87, 2, 35, 34, 41, 108, 35, 42, 108, 56, 36, 41, 108, 45, 58, 45, 37, 32, 45, 46, 32, 41, 108, 41, 52, 56, 62, 45, 47, 56, 35, 62, Utf8.REPLACEMENT_BYTE, 108, 100};
    }

    static {
        A01();
    }

    public C1689mR(InterfaceC0445Gb interfaceC0445Gb) {
        this.A02 = interfaceC0445Gb;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0341Cb
    @MetaExoPlayerCustomization("No op, we don't include mp3 extractor due to apk size")
    public final void A5q() {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0341Cb
    public final long A7S() {
        if (this.A01 != null) {
            return this.A01.A8f();
        }
        return -1L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0059, code lost:
    
        if (r9.A8f() != r19) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0072, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0066, code lost:
    
        if (r9.A8f() != r19) goto L29;
     */
    @Override // com.instagram.common.viewpoint.core.InterfaceC0341Cb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AA3(@MetaExoPlayerCustomization(" To be replaced with DataReader after upstream is updated") InterfaceC1771nl interfaceC1771nl, Uri uri, Map<String, List<String>> map, long j, long j2, GY gy) throws IOException {
        AnonymousClass90 anonymousClass90 = new AnonymousClass90(interfaceC1771nl, j, j2);
        this.A01 = anonymousClass90;
        if (this.A00 != null) {
            return;
        }
        GX[] extractors = this.A02.A5G(uri, map);
        if (extractors.length == 1) {
            this.A00 = extractors[0];
        } else {
            int length = extractors.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                GX gx = extractors[i];
                try {
                } catch (EOFException unused) {
                    if (this.A00 == null) {
                    }
                } catch (Throwable th) {
                    C3M.A08(this.A00 != null || anonymousClass90.A8f() == j);
                    anonymousClass90.AI1();
                    throw th;
                }
                if (gx.AJL(anonymousClass90)) {
                    this.A00 = gx;
                    C3M.A08(this.A00 != null || anonymousClass90.A8f() == j);
                    anonymousClass90.AI1();
                } else {
                    if (this.A00 == null) {
                    }
                    boolean z = true;
                    C3M.A08(z);
                    anonymousClass90.AI1();
                    i++;
                }
            }
            if (this.A00 == null) {
                throw new C1672m9(A00(24, 34, 2) + AbstractC01484a.A0s(extractors) + A00(0, 24, 55), (Uri) C3M.A01(uri));
            }
        }
        GX gx2 = this.A00;
        String[] strArr = A04;
        if (strArr[7].length() != strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[4] = "617axDRVtVCpohDeNzS2wwDVGnqnMQm6";
        strArr2[3] = "irS2jSLrtgJgNTyuX8VyAPoURNJ9oGo8";
        gx2.AA4(gy);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0341Cb
    public final int AGc(C0463Gt c0463Gt) throws IOException {
        return ((GX) C3M.A01(this.A00)).AGb((InterfaceC1625lN) C3M.A01(this.A01), c0463Gt);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0341Cb
    public final void AGr() {
        if (this.A00 != null) {
            this.A00.AGr();
            this.A00 = null;
        }
        this.A01 = null;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0341Cb
    public final void AIM(long j, long j2) {
        ((GX) C3M.A01(this.A00)).AIM(j, j2);
    }
}
