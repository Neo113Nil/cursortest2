package com.instagram.common.viewpoint.core;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.common.base.Ascii;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.0Q, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C0Q extends AnonymousClass14 implements C6W {
    public static byte[] A0K;
    public static String[] A0L = {"77C8vP87Fd7b4BP9SQRJBzWPVk4TewQg", "oQ2qsKrmaNuyaLFB2ph9zkmGtpzAonXt", "MDqZPLCoXCzEQwxPxYtAKuxbh2tAcx1k", "aWPkhw6gWy0BTxYknUchyjQmABWF", "ais5GYfL5LR1KEYd6HRi1BBd2kmjCeGs", "pdewp8MC9mt7vaqV0Zkeu3U5mw150Zm9", "qv2CVs2gAdpJ8ZKBYAbfHfBiBdoePlCI", "lcPZgHPLbCISPmjsMn5qIGSBsvlpomMq"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;

    @MetaExoPlayerCustomization
    public AudioManager A06;
    public MediaFormat A07;
    public C1830or A08;
    public AnonymousClass75 A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public final Context A0F;
    public final C8C A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final C8N A0J;

    public static String A07(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0K, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b = copyOfRange[i4];
            if (A0L[3].length() != 28) {
                throw new RuntimeException();
            }
            String[] strArr = A0L;
            strArr[4] = "GcWDzLLiTAl0tD46XyRRBcNodd92JrSP";
            strArr[0] = "GhxldHXMoVDog6OAV5RKTarDpyl0kviC";
            copyOfRange[i4] = (byte) ((b - i3) - 65);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        A0K = new byte[]{-103, -79, -80, -75, -83, -113, -69, -80, -79, -81, -115, -63, -80, -75, -69, -98, -79, -70, -80, -79, -66, -79, -66, -77, -79, -68, -110, -73, -87, -89, -110, -59, -59, -57, -110, -56, -55, -57, -36, -38, -27, -69, -12, -4, -4, -12, -7, -14, -69, -1, -18, 4, -69, -15, -14, -16, -4, -15, -14, -1, -17, -17, -15, -69, -14, 0, -15, -69, -13, -12, -12, -13, -15, 2, -69, 2, 7, -2, -13, -51, -51, -49, -103, -32, -51, -34, -45, -47, -32, -103, -34, -47, -46, -103, -40, -47, -30, -47, -40, 7, Ascii.ESC, 10, Ascii.SI, Ascii.NAK, Ascii.DC2, 38, Ascii.NAK, Ascii.SUB, 32, -32, 35, Ascii.DC2, 40, -90, -85, -92, -79, -79, -88, -81, 112, -90, -78, -72, -79, -73, -31, -34, -21, -24, -27, -19, -34, -59, -62, -49, -52, -50, -55, -47, -62, -39, -51, -28, -103, -43, -38, -36, -31, -32, -103, -33, -43, -26, -47, -68, -72, -68, -76, -67, -64, -124, -79, 126, -124, Byte.MIN_VALUE, 126, -124, -126, -68, -66, -75, -69, -66, -75, -64, -59, -27, -45, -33, -30, -34, -41, -97, -28, -45, -26, -41, -54, -72, -60, -54, -52, -59, -66, -2, -23, -10, -13, -22, -16, -8, -23};
    }

    static {
        A09();
    }

    public C0Q(Context context, C1425hv c1425hv, MediaCodecRendererMetaParameters mediaCodecRendererMetaParameters, InterfaceC0302Ar interfaceC0302Ar, C9U c9u, boolean z, boolean z2, boolean z3, Handler handler, C8D c8d, C02357p c02357p, AnonymousClass38... anonymousClass38Arr) {
        this(context, c1425hv, mediaCodecRendererMetaParameters, interfaceC0302Ar, c9u, z, z2, z3, handler, c8d, new C1714mw(c02357p, anonymousClass38Arr));
    }

    public C0Q(Context context, C1425hv c1425hv, MediaCodecRendererMetaParameters mediaCodecRendererMetaParameters, InterfaceC0302Ar interfaceC0302Ar, C9U c9u, boolean z, boolean z2, boolean z3, Handler handler, C8D c8d, C8N c8n) {
        super(1, c1425hv, mediaCodecRendererMetaParameters, interfaceC0302Ar, c9u, z, false, 0, 0);
        this.A01 = 0;
        this.A02 = 0;
        this.A05 = 0L;
        this.A0F = context.getApplicationContext();
        this.A0J = c8n;
        this.A0H = z2;
        this.A0I = z3;
        this.A0G = new C8C(handler, c8d);
        c8n.AIl(new C1712mu(this));
        c8n.AIg(c1425hv.A0B);
    }

    @MetaExoPlayerCustomization("Added in D36293647 for DRC")
    private int A00() {
        int i = this.A11.A07;
        if (this.A11.A0D) {
            int i2 = this.A11.A02;
            int xHEAACEffectType = this.A11.A03;
            int A00 = ContextAwareXHEAACDRCTypeUtil.A00(i2, xHEAACEffectType);
            if (this.A11.A0E) {
                if (this.A06 == null) {
                    this.A06 = (AudioManager) this.A0F.getSystemService(A07(99, 5, 101));
                }
                int A01 = ContextAwareXHEAACDRCTypeUtil.A01(this.A06);
                int DRCTypeFromHeadset = A0L[3].length();
                if (DRCTypeFromHeadset != 28) {
                    throw new RuntimeException();
                }
                String[] strArr = A0L;
                strArr[1] = "LZogbi5BZWCXkICBwmOMX8OtkvvUDPu5";
                strArr[6] = "HFkZzMhVfRobNZeBREZjfgSbFT9rBjx5";
                if (A01 != 3) {
                    return A01;
                }
                return A00;
            }
            return A00;
        }
        return i;
    }

    public static int A01(C1830or c1830or) {
        if (A07(104, 9, 112).equals(c1830or.A0W)) {
            return c1830or.A0C;
        }
        return 2;
    }

    private int A02(AR ar, C1830or c1830or) {
        if (A07(38, 22, 76).equals(ar.A03) && AbstractC01424a.A02 < 24) {
            int i = AbstractC01424a.A02;
            String[] strArr = A0L;
            if (strArr[2].charAt(3) != strArr[7].charAt(3)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0L;
            strArr2[2] = "s8yZpZp8nIrL7EQY3mPJ1kqCekDwsY6i";
            strArr2[7] = "yd2Z0BEEocl53iuZqAxtcOKT0DXRknsH";
            if (i != 23 || !AbstractC01424a.A18(this.A0F)) {
                String[] strArr3 = A0L;
                if (strArr3[4].charAt(18) != strArr3[0].charAt(18)) {
                    throw new RuntimeException();
                }
                A0L[3] = "9QHOUbokymVnxuZO6z7rLJCC2XoG";
                return -1;
            }
        }
        int i2 = c1830or.A0B;
        String[] strArr4 = A0L;
        if (strArr4[2].charAt(3) != strArr4[7].charAt(3)) {
            return i2;
        }
        String[] strArr5 = A0L;
        strArr5[2] = "bWiZaXhFQHkoAXZnJ4ncaGOlncM6vz1V";
        strArr5[7] = "kg6ZwO8ePPrkJPsuoAADu0ZS0U6OWo96";
        return i2;
    }

    private final int A03(AR ar, C1830or c1830or, C1830or[] c1830orArr) {
        int maxInputSize = A02(ar, c1830or);
        return maxInputSize;
    }

    private final MediaFormat A04(C1830or c1830or, String str, int i) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString(A07(155, 4, 14), str);
        mediaFormat.setInteger(A07(113, 13, 2), c1830or.A06);
        mediaFormat.setInteger(A07(Opcodes.RETURN, 11, 49), c1830or.A0G);
        AnonymousClass46.A06(mediaFormat, c1830or.A0X);
        AnonymousClass46.A04(mediaFormat, A07(Opcodes.F2D, 14, 43), i);
        if (AbstractC01424a.A02 >= 23) {
            String A07 = A07(Opcodes.RET, 8, 11);
            String[] strArr = A0L;
            if (strArr[4].charAt(18) != strArr[0].charAt(18)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0L;
            strArr2[1] = "w8gjBPJzE632nZpBrlzwe1tLIvq8CsOY";
            strArr2[6] = "ag3DPBWcd6fSOrmBwunkDpt77Nl4HY4l";
            mediaFormat.setInteger(A07, 0);
        }
        if (c1830or.A0R != null && c1830or.A0R.equals(A07(Opcodes.IF_ICMPEQ, 10, 15)) && this.A11.A0F) {
            mediaFormat.setInteger(A07(60, 19, 77), A00());
            mediaFormat.setInteger(A07(79, 20, 43), this.A11.A08);
        }
        return mediaFormat;
    }

    public static /* synthetic */ AnonymousClass75 A05(C0Q c0q) {
        return null;
    }

    private void A08() {
        long A7X = this.A0J.A7X(AAG());
        if (A7X != Long.MIN_VALUE) {
            if (!this.A0B) {
                long j = this.A04;
                String[] strArr = A0L;
                if (strArr[2].charAt(3) != strArr[7].charAt(3)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0L;
                strArr2[4] = "nIJcPeFAtvuDBzBlXMRw0HpU2OMpTIMr";
                strArr2[0] = "dapTBdH8hqStbvnLCARUyCc0T0ChI3T8";
                A7X = Math.max(j, A7X);
            }
            this.A04 = A7X;
            this.A0B = false;
        }
    }

    private boolean A0A(C1830or c1830or) {
        String str = c1830or.A0W;
        String mimeType = A07(104, 9, 112);
        if (!mimeType.equals(str)) {
            return this.A0J.AJc(c1830or);
        }
        String[] strArr = A0L;
        if (strArr[2].charAt(3) != strArr[7].charAt(3)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0L;
        strArr2[4] = "mDVewdn3RvQYeqn2qaR7zJPFTyK9zqzw";
        strArr2[0] = "a0e3mP5dmYOn07QMhHRhkP7lbfukdIg9";
        return false;
    }

    public static boolean A0B(String str) {
        if (AbstractC01424a.A02 < 24 && A07(23, 15, 35).equals(str)) {
            if (A07(Opcodes.NEWARRAY, 7, 22).equals(AbstractC01424a.A05) && (AbstractC01424a.A03.startsWith(A07(Opcodes.MONITOREXIT, 8, 67)) || AbstractC01424a.A03.startsWith(A07(126, 7, 56)) || AbstractC01424a.A03.startsWith(A07(Opcodes.I2L, 8, 28)))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass14, com.instagram.common.viewpoint.core.C9Z
    public final void A1X() {
        super.A1X();
        this.A0J.AGG();
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass14, com.instagram.common.viewpoint.core.C9Z
    public final void A1Y() {
        A08();
        this.A0J.pause();
        super.A1Y();
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass14, com.instagram.common.viewpoint.core.C9Z
    public final void A1Z() {
        try {
            this.A0J.flush();
            try {
                super.A1Z();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.A1Z();
                throw th;
            } finally {
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass14, com.instagram.common.viewpoint.core.C9Z
    public final void A1a(long j, boolean z) throws C9Y {
        super.A1a(j, z);
        if (this.A0D) {
            this.A0J.A6L();
        } else {
            this.A0J.flush();
        }
        this.A04 = j;
        this.A0A = true;
        this.A0B = true;
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass14, com.instagram.common.viewpoint.core.C9Z
    public final void A1b(boolean z, boolean z2) throws C9Y {
        super.A1b(z, z2);
        this.A0G.A08(this.A0j);
        if (A1V().A00) {
            this.A0J.A6E();
        } else {
            this.A0J.A5r();
        }
        this.A0J.AIw(A1W());
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass14
    public final int A1g(AO ao, AR ar, C1830or c1830or, C1830or c1830or2) {
        if (this.A11.A0N && A02(ar, c1830or2) <= this.A00 && ar.A0U(c1830or, c1830or2, true) && c1830or.A08 == 0 && c1830or.A09 == 0 && c1830or2.A08 == 0 && c1830or2.A09 == 0) {
            return 1;
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        if (r2.AJe(r1, r12.A0C) != false) goto L21;
     */
    @Override // com.instagram.common.viewpoint.core.AnonymousClass14
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int A1h(InterfaceC0302Ar interfaceC0302Ar, C9U c9u, C1830or c1830or) throws C0306Av {
        int i;
        String str = c1830or.A0W;
        int adaptiveSupport = 0;
        if (!AbstractC00972h.A0C(str)) {
            return 0;
        }
        int i2 = AbstractC01424a.A02 >= 21 ? 32 : 0;
        boolean A1G = AnonymousClass14.A1G(c1830or);
        int i3 = 4;
        if (A1G && A0A(c1830or) && C0309Ay.A0I() != null) {
            return i2 | 8 | 4;
        }
        String mimeType = A07(104, 9, 112);
        if (mimeType.equals(str)) {
            C8N c8n = this.A0J;
            int tunnelingSupport = c1830or.A06;
        }
        if (this.A0J.AJe(c1830or.A06, 2)) {
            List<AR> A1l = A1l(interfaceC0302Ar, c1830or, false);
            if (A1l.isEmpty()) {
                return AnonymousClass76.A00(1);
            }
            if (!A1G) {
                return AnonymousClass76.A00(2);
            }
            AR ar = A1l.get(0);
            int tunnelingSupport2 = A0L[5].charAt(0);
            if (tunnelingSupport2 != 112) {
                throw new RuntimeException();
            }
            String[] strArr = A0L;
            strArr[4] = "n12bmxDOOVBzqYYOQBRjqp0moJyAYtSu";
            strArr[0] = "BaglFChNOdaklTSyUQRitIBwXJJTR14H";
            AR ar2 = ar;
            if (AbstractC01424a.A02 < 21 || ((c1830or.A0G == -1 || ar2.A0Q(c1830or.A0G)) && (c1830or.A06 == -1 || ar2.A0P(c1830or.A06)))) {
                adaptiveSupport = 1;
            }
            if (adaptiveSupport != 0 && ar2.A0T(c1830or)) {
                i = 16;
            } else {
                i = 8;
            }
            if (adaptiveSupport == 0) {
                i3 = 3;
            }
            return i | i2 | i3;
        }
        return 1;
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass14
    public final List<AR> A1l(InterfaceC0302Ar interfaceC0302Ar, C1830or c1830or, boolean z) throws C0306Av {
        AR A0I;
        String mimeType = c1830or.A0W;
        if (mimeType == null) {
            return Collections.emptyList();
        }
        if (A0A(c1830or) && (A0I = C0309Ay.A0I()) != null) {
            List<AR> singletonList = Collections.singletonList(A0I);
            String[] strArr = A0L;
            if (strArr[1].charAt(15) != strArr[6].charAt(15)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0L;
            strArr2[4] = "VH1rG9jH3WXhHTxnLXRxhYBKNNIMNlpD";
            strArr2[0] = "4dJInhYjvnfEcXSyIbRNEiIfORerumv3";
            return singletonList;
        }
        return Collections.unmodifiableList(interfaceC0302Ar.A7g(c1830or.A0W, z, false));
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass14
    public final void A1o() throws C9Y {
        try {
            this.A0J.AGI();
        } catch (C8M e) {
            throw A1T(e, e.A01, e.A02, 5002);
        }
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass14
    public final void A1s(C1830or c1830or) throws C9Y {
        super.A1s(c1830or);
        this.A08 = c1830or;
        this.A0G.A05(this.A08, null);
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass14
    public final void A1u(C1752nY c1752nY) {
        if (this.A0A && !c1752nY.A04()) {
            if (Math.abs(c1752nY.A01 - this.A04) > 500000) {
                this.A04 = c1752nY.A01;
            }
            this.A0A = false;
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:21:0x0098 */
    @Override // com.instagram.common.viewpoint.core.AnonymousClass14
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A1v(AO ao, MediaFormat mediaFormat) throws C9Y {
        int sampleRate;
        MediaFormat mediaFormat2;
        int[] channelMap;
        if (this.A07 != null) {
            sampleRate = AbstractC00972h.A00(this.A07.getString(A07(155, 4, 14)));
            mediaFormat2 = this.A07;
        } else {
            sampleRate = A01(this.A08);
            mediaFormat2 = mediaFormat;
        }
        String A07 = A07(113, 13, 2);
        int integer = mediaFormat2.getInteger(A07);
        String A072 = A07(Opcodes.RETURN, 11, 49);
        if (A0L[5].charAt(0) != 'p') {
            throw new RuntimeException();
        }
        String[] strArr = A0L;
        strArr[1] = "oVYorWwiJ9QuTT6BmhgOhsdn4ih9katO";
        strArr[6] = "s4BjQ2RFQmOrQGZBZgzfkwBc6WQlVCBr";
        int encoding = mediaFormat2.getInteger(A072);
        this.A03 = encoding * integer;
        try {
            if (this.A0C) {
                String[] strArr2 = A0L;
                String str = strArr2[1];
                String str2 = strArr2[6];
                int charAt = str.charAt(15);
                int encoding2 = str2.charAt(15);
                if (charAt != encoding2) {
                    throw new RuntimeException();
                }
                A0L[5] = "pG08ZDLF1Nwa7YWNReZn10nEeTPXXDD5";
                if (integer == 6) {
                    int encoding3 = this.A08.A06;
                    if (encoding3 < 6) {
                        int encoding4 = this.A08.A06;
                        channelMap = new int[encoding4];
                        for (int i = 0; i < encoding; i++) {
                            channelMap[i] = i;
                        }
                        C2D A0i = new C2D().A11(A07(104, 9, 112)).A0i(sampleRate);
                        int encoding5 = mediaFormat.getInteger(A07);
                        C2D A0b = A0i.A0b(encoding5);
                        int encoding6 = mediaFormat.getInteger(A072);
                        C1830or audioSinkInputFormat = A0b.A0m(encoding6).A14();
                        this.A0J.A51(audioSinkInputFormat, 0, channelMap);
                        return;
                    }
                }
            }
            this.A0J.A51(audioSinkInputFormat, 0, channelMap);
            return;
        } catch (C8G e) {
            throw A1S(e, e.A00, 5001);
        }
        channelMap = null;
        C2D A0i2 = new C2D().A11(A07(104, 9, 112)).A0i(sampleRate);
        int encoding52 = mediaFormat.getInteger(A07);
        C2D A0b2 = A0i2.A0b(encoding52);
        int encoding62 = mediaFormat.getInteger(A072);
        C1830or audioSinkInputFormat2 = A0b2.A0m(encoding62).A14();
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass14
    public final void A1w(AR ar, AO ao, C1830or c1830or, MediaCrypto mediaCrypto) {
        this.A00 = A03(ar, c1830or, A1e());
        this.A0C = A0B(ar.A03);
        String str = ar.A02;
        String A07 = A07(104, 9, 112);
        this.A0E = A07.equals(str) && !A07.equals(c1830or.A0W);
        MediaFormat A04 = A04(c1830or, ar.A01, this.A00);
        ao.A50(A04, null, mediaCrypto, 0, null);
        if (this.A0E) {
            this.A07 = A04;
            this.A07.setString(A07(155, 4, 14), c1830or.A0W);
        } else {
            this.A07 = null;
        }
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass14
    @MetaExoPlayerCustomization("D45988204: [FBLite][Video] Add Codec Hooks for Logging")
    public final void A1x(String str) {
        this.A0G.A0F(str);
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass14
    public final void A1y(String str, long j, long j2) {
        this.A0G.A0G(str, j, j2);
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass14
    @MetaExoPlayerCustomization("Added in D6142814")
    public final boolean A22() {
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass14
    public final boolean A23(long j, long j2, AO ao, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z, boolean z2) throws C9Y {
        if (this.A0E) {
            int i3 = i2 & 2;
            if (A0L[3].length() != 28) {
                throw new RuntimeException();
            }
            String[] strArr = A0L;
            strArr[2] = "qFTZlqBsfbROWjHKIBaS9ttrRfnfHc6a";
            strArr[7] = "sZoZRvagNjZKK9rko7XS8oWwcuS8hqha";
            if (i3 != 0) {
                ao.AGy(i, false);
                return true;
            }
        }
        if (z) {
            ao.AGy(i, false);
            if (A0L[5].charAt(0) != 'p') {
                String[] strArr2 = A0L;
                strArr2[4] = "i4U0xdeb2kJYTtTzacReJ5RV5axgIdhD";
                strArr2[0] = "rrPeATHc6C5SnSGUS9RZuIpTT0sGFjMh";
                this.A0j.A0B++;
                this.A0J.A9Z();
                return true;
            }
            String[] strArr3 = A0L;
            strArr3[1] = "GzmR5b8Z6T6If0UBPoEMKvf6QjFSlvzk";
            strArr3[6] = "qLQdQ1juS6S8x5RB3mUlKTK412OZk0qd";
            this.A0j.A0B++;
            this.A0J.A9Z();
            return true;
        }
        if (this.A0I && A01(this.A08) == 2 && i2 == 0 && this.A03 > 0 && byteBuffer.limit() - byteBuffer.position() >= 12) {
            int position = byteBuffer.position();
            int limit = byteBuffer.limit();
            byteBuffer.position(10);
            short s = byteBuffer.getShort();
            byteBuffer.position(position);
            byteBuffer.limit(limit);
            int i4 = this.A01;
            int limit2 = byteBuffer.limit();
            int originalPosition = byteBuffer.position();
            this.A01 = i4 + (limit2 - originalPosition);
            int i5 = this.A02;
            String[] strArr4 = A0L;
            String str = strArr4[4];
            String str2 = strArr4[0];
            int charAt = str.charAt(18);
            int originalPosition2 = str2.charAt(18);
            if (charAt != originalPosition2) {
                throw new RuntimeException();
            }
            String[] strArr5 = A0L;
            strArr5[1] = "MwudhWWmLfAHxFUBWVuNAQ0R1ppnonhu";
            strArr5[6] = "h4oByFchRKdWl7IBcc7CSq20vr2fgRzF";
            this.A02 = i5 + 1;
            long j4 = this.A05;
            int originalPosition3 = Math.abs((int) s);
            this.A05 = j4 + originalPosition3;
            int i6 = this.A01;
            int originalPosition4 = this.A03;
            if (i6 >= originalPosition4 * 2) {
                this.A0G.A00((int) (this.A05 / this.A02));
                this.A01 = 0;
                this.A02 = 0;
                this.A05 = 0L;
            }
        }
        if (this.A0H) {
            int limit3 = byteBuffer.limit();
            int originalPosition5 = byteBuffer.position();
            if (limit3 > originalPosition5) {
                int position2 = byteBuffer.position();
                int limit4 = byteBuffer.limit();
                int originalPosition6 = limit4 - position2;
                ByteBuffer allocate = ByteBuffer.allocate(originalPosition6);
                allocate.put(byteBuffer);
                allocate.flip();
                byteBuffer.position(position2);
                byteBuffer.limit(limit4);
                this.A0G.A0K(allocate.array(), j3 / 1000);
            }
        }
        try {
            if (!this.A0J.A9W(byteBuffer, j3, 1)) {
                return false;
            }
            ao.AGy(i, false);
            this.A0j.A09++;
            return true;
        } catch (C8H e) {
            throw A1T(e, this.A08, e.A02, 5001);
        } catch (C8M e2) {
            throw A1T(e2, this.A0i, e2.A02, 5002);
        }
    }

    public final void A26() {
        this.A0B = true;
    }

    @Override // com.instagram.common.viewpoint.core.C9Z, com.instagram.common.viewpoint.core.InterfaceC1740nM
    public final C6W A8L() {
        return this;
    }

    @Override // com.instagram.common.viewpoint.core.C6W
    public final C1814ob A8e() {
        return this.A0J.A8e();
    }

    @Override // com.instagram.common.viewpoint.core.C6W
    public final long A8h() {
        if (A92() == 2) {
            A08();
        }
        long j = this.A04;
        String[] strArr = A0L;
        if (strArr[1].charAt(15) != strArr[6].charAt(15)) {
            throw new RuntimeException();
        }
        A0L[5] = "p6YKYNxicnjzLIFANgsfPKErY7h8fvSp";
        return j;
    }

    @Override // com.instagram.common.viewpoint.core.C9Z, com.instagram.common.viewpoint.core.AnonymousClass70
    public final void A9a(int i, Object obj) throws C9Y {
        switch (i) {
            case 2:
                this.A0J.setVolume(((Float) obj).floatValue());
                return;
            case 3:
                this.A0J.AIW((C1836oy) obj);
                return;
            case 4:
            case 5:
            case 7:
            case 8:
            default:
                super.A9a(i, obj);
                return;
            case 6:
                this.A0J.AIY((C1P) obj);
                return;
            case 9:
                this.A0J.AJ4(((Boolean) obj).booleanValue());
                return;
            case 10:
                this.A0J.AIX(((Integer) obj).intValue());
                return;
            case 11:
                this.A09 = null;
                return;
            case 12:
                if (AbstractC01424a.A02 < 23) {
                    return;
                }
                C8N c8n = this.A0J;
                if (A0L[3].length() != 28) {
                    throw new RuntimeException();
                }
                A0L[3] = "XCf3J2AEJJ1Zd2j3qAi6tezJ2mG7";
                C02558q.A00(c8n, obj);
                return;
        }
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass14, com.instagram.common.viewpoint.core.InterfaceC1740nM
    public final boolean AAG() {
        return super.AAG() && this.A0J.AAG();
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass14, com.instagram.common.viewpoint.core.InterfaceC1740nM
    public final boolean AAV() {
        if (!this.A0J.A9g()) {
            boolean AAV = super.AAV();
            if (A0L[5].charAt(0) != 'p') {
                throw new RuntimeException();
            }
            A0L[3] = "YZui0KIXZR8KzjI1EkPC1GaIUT4y";
            if (!AAV) {
                return false;
            }
        }
        return true;
    }

    @Override // com.instagram.common.viewpoint.core.C6W
    public final void AIt(C1814ob c1814ob) {
        this.A0J.AIt(c1814ob);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1740nM, com.instagram.common.viewpoint.core.C7D
    public final String getName() {
        return A07(0, 23, 11);
    }
}
