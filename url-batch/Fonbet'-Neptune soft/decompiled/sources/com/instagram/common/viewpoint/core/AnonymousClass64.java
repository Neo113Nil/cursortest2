package com.instagram.common.viewpoint.core;

import android.content.Intent;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Log;
import com.facebook.ads.NativeAd;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.UUID;
import kotlin.io.encoding.Base64;
import okio.Utf8;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.64, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass64 extends E1 {
    public static byte[] A0F;
    public static String[] A0G = {"Cb7nBOTqt", "Uv90YERdy9SZ9btNePue9j4WSufKww0d", "5tFdsnJl1aHC8QazlewrqKxrXvRcdsO5", "4XUHzfDXngka", "6zmG8GCKaenNI", "iTvfTfiU680tAW5ZUJpNe0fUcB62AaOp", "iIjhxtVkNHrsB", "9VdyyBhNHsky"};
    public static final String A0H;
    public Uri A00;
    public NativeAd A01;
    public US A02;
    public Y1 A03;
    public EG A04;
    public C01243i A05;
    public String A06;
    public String A07;
    public String A08;
    public final C0602Mj A09;
    public final C1153dL A0A;
    public final DX A0B;
    public final DR A0C;
    public final DP A0D;
    public final String A0E;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0F, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b = copyOfRange[i4];
            if (A0G[0].length() == 17) {
                throw new RuntimeException();
            }
            A0G[2] = "GV7dEmS9dQikFIsLGq03TvmmBp0PGqms";
            copyOfRange[i4] = (byte) ((b ^ i3) ^ 4);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A0F = new byte[]{32, 2, Ascii.CR, 68, Ascii.ETB, 67, 16, Ascii.ETB, 2, 17, Ascii.ETB, 67, 34, Ascii.SYN, 7, 10, 6, Ascii.CR, 0, 6, 45, 6, Ascii.ETB, Ascii.DC4, Ascii.FF, 17, 8, 34, 0, Ascii.ETB, 10, Ascii.NAK, 10, Ascii.ETB, Ascii.SUB, 77, 67, 46, 2, 8, 6, 67, 16, Ascii.SYN, 17, 6, 67, Ascii.ETB, Ascii.VT, 2, Ascii.ETB, 67, 10, Ascii.ETB, 68, 16, 67, 10, Ascii.CR, 67, Ascii.SUB, Ascii.FF, Ascii.SYN, 17, 67, 34, Ascii.CR, 7, 17, Ascii.FF, 10, 7, 46, 2, Ascii.CR, 10, 5, 6, 16, Ascii.ETB, 77, Ascii.ESC, Ascii.SO, Ascii.SI, 67, 5, 10, Ascii.SI, 6, 77, Ascii.GS, 42, 42, 55, 42, 98, 120, 35, 39, 36, 16, 1, Ascii.FF, 0, Ascii.VT, 6, 0, 43, 0, 17, Ascii.DC2, 10, Ascii.ETB, Ascii.SO, Ascii.NAK, 45, 43, 44, 120, 43, Base64.padSymbol, 44, Ascii.ESC, 52, 49, Base64.padSymbol, 54, 44, Ascii.FF, 55, 51, Base64.padSymbol, 54, 120, 62, 49, 42, 43, 44, 3, 59, Base64.padSymbol, 58, 110, Base64.padSymbol, 43, 58, Ascii.CAN, 39, 42, 43, 33, Ascii.ESC, Ascii.FS, 7, 110, 33, 60, 110, Base64.padSymbol, 43, 58, Ascii.CAN, 39, 42, 43, 33, 3, Ascii.RS, 10, 110, 40, 39, 60, Base64.padSymbol, 58, Ascii.RS, 17, 32, Ascii.RS, Ascii.FS, Ascii.VT, Ascii.SYN, 9, Ascii.SYN, Ascii.VT, 6, 51, 60, 57, 53, 62, 36, 4, Utf8.REPLACEMENT_BYTE, 59, 53, 62, 62, 47, 60, Base64.padSymbol, 39, 32, 41, Ascii.ETB, Ascii.NAK, 2, 3, 2, 1, Ascii.SO, 9, 2, 3, 40, Ascii.NAK, Ascii.SO, 2, 9, 19, 6, 19, Ascii.SO, 8, 9, 44, 2, Ascii.RS, 86, 77, 74, 82, 86, 70, 106, 71, 42, 44, 58, 17, 62, 43, 54, 41, 58, Ascii.FS, 43, 62, Ascii.GS, 42, 43, 43, 48, 49, 117, 106, 103, 102, 108, 79, 108, 100, 100, 102, 113, 85, 74, 71, 70, 76, 110, 115, 103, 66, 93, 80, 81, 91, 103, 81, 81, 95, 96, 93, 89, 81, 99, 124, 113, 112, 122, 64, 71, 89, 17, Ascii.SO, 3, 2, 8, 56, 19, Ascii.SO, 10, 2, 56, Ascii.ETB, 8, Ascii.VT, Ascii.VT, Ascii.SO, 9, 0, 56, Ascii.SO, 9, 19, 2, Ascii.NAK, 17, 6, Ascii.VT, 19, Ascii.FF, 0, Ascii.DC2, 49, Ascii.FS, Ascii.NAK, 0};
    }

    static {
        A03();
        A0H = AnonymousClass64.class.getSimpleName();
    }

    public AnonymousClass64(C1153dL c1153dL) {
        super(c1153dL);
        this.A0E = UUID.randomUUID().toString();
        this.A0D = new DP() { // from class: com.facebook.ads.redexgen.X.6E
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.instagram.common.viewpoint.core.AbstractC0776Tf
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(DQ dq) {
                Y1 y1;
                Y1 y12;
                y1 = AnonymousClass64.this.A03;
                if (y1 != null) {
                    y12 = AnonymousClass64.this.A03;
                    y12.AEX();
                }
            }
        };
        this.A0C = new DR() { // from class: com.facebook.ads.redexgen.X.6D
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.instagram.common.viewpoint.core.AbstractC0776Tf
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C3Y c3y) {
                Y1 y1;
                Y1 y12;
                y1 = AnonymousClass64.this.A03;
                if (y1 != null) {
                    y12 = AnonymousClass64.this.A03;
                    y12.onPause();
                }
            }
        };
        this.A0B = new DX() { // from class: com.facebook.ads.redexgen.X.6C
            public static String[] A01 = {"NidaN7FoPBbaKg721Bw4T4ZedkUEC8Kp", "T6", "FoXhB5efLBt1Ix1VLvHMf2xPaJTvayS4", "Ki7KmbouuPEeN63k7Tf8VIoYM6z8lFxL", "sQ99pP", "JVozQuP1BqTf", "NfzwiYkR35AXK2rv0hn4uIoCH9D93AVk", "I59WEHRkBvEx"};

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.instagram.common.viewpoint.core.AbstractC0776Tf
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C01193d c01193d) {
                Y1 y1;
                Y1 y12;
                y1 = AnonymousClass64.this.A03;
                if (y1 != null) {
                    y12 = AnonymousClass64.this.A03;
                    y12.ACn();
                    if (A01[3].charAt(11) == 'F') {
                        throw new RuntimeException();
                    }
                    A01[3] = "dba5oiQ8v4CkqUII5uWz8sPENBYPSf9M";
                }
            }
        };
        this.A09 = new C0602Mj(this, c1153dL);
        this.A0A = c1153dL;
        A02();
    }

    public AnonymousClass64(C1153dL c1153dL, AttributeSet attributeSet) {
        super(c1153dL, attributeSet);
        this.A0E = UUID.randomUUID().toString();
        this.A0D = new DP() { // from class: com.facebook.ads.redexgen.X.6E
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.instagram.common.viewpoint.core.AbstractC0776Tf
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(DQ dq) {
                Y1 y1;
                Y1 y12;
                y1 = AnonymousClass64.this.A03;
                if (y1 != null) {
                    y12 = AnonymousClass64.this.A03;
                    y12.AEX();
                }
            }
        };
        this.A0C = new DR() { // from class: com.facebook.ads.redexgen.X.6D
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.instagram.common.viewpoint.core.AbstractC0776Tf
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C3Y c3y) {
                Y1 y1;
                Y1 y12;
                y1 = AnonymousClass64.this.A03;
                if (y1 != null) {
                    y12 = AnonymousClass64.this.A03;
                    y12.onPause();
                }
            }
        };
        this.A0B = new DX() { // from class: com.facebook.ads.redexgen.X.6C
            public static String[] A01 = {"NidaN7FoPBbaKg721Bw4T4ZedkUEC8Kp", "T6", "FoXhB5efLBt1Ix1VLvHMf2xPaJTvayS4", "Ki7KmbouuPEeN63k7Tf8VIoYM6z8lFxL", "sQ99pP", "JVozQuP1BqTf", "NfzwiYkR35AXK2rv0hn4uIoCH9D93AVk", "I59WEHRkBvEx"};

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.instagram.common.viewpoint.core.AbstractC0776Tf
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C01193d c01193d) {
                Y1 y1;
                Y1 y12;
                y1 = AnonymousClass64.this.A03;
                if (y1 != null) {
                    y12 = AnonymousClass64.this.A03;
                    y12.ACn();
                    if (A01[3].charAt(11) == 'F') {
                        throw new RuntimeException();
                    }
                    A01[3] = "dba5oiQ8v4CkqUII5uWz8sPENBYPSf9M";
                }
            }
        };
        this.A09 = new C0602Mj(this, c1153dL);
        this.A0A = c1153dL;
        A02();
    }

    public AnonymousClass64(C1153dL c1153dL, AttributeSet attributeSet, int i) {
        super(c1153dL, attributeSet, i);
        this.A0E = UUID.randomUUID().toString();
        this.A0D = new DP() { // from class: com.facebook.ads.redexgen.X.6E
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.instagram.common.viewpoint.core.AbstractC0776Tf
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(DQ dq) {
                Y1 y1;
                Y1 y12;
                y1 = AnonymousClass64.this.A03;
                if (y1 != null) {
                    y12 = AnonymousClass64.this.A03;
                    y12.AEX();
                }
            }
        };
        this.A0C = new DR() { // from class: com.facebook.ads.redexgen.X.6D
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.instagram.common.viewpoint.core.AbstractC0776Tf
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C3Y c3y) {
                Y1 y1;
                Y1 y12;
                y1 = AnonymousClass64.this.A03;
                if (y1 != null) {
                    y12 = AnonymousClass64.this.A03;
                    y12.onPause();
                }
            }
        };
        this.A0B = new DX() { // from class: com.facebook.ads.redexgen.X.6C
            public static String[] A01 = {"NidaN7FoPBbaKg721Bw4T4ZedkUEC8Kp", "T6", "FoXhB5efLBt1Ix1VLvHMf2xPaJTvayS4", "Ki7KmbouuPEeN63k7Tf8VIoYM6z8lFxL", "sQ99pP", "JVozQuP1BqTf", "NfzwiYkR35AXK2rv0hn4uIoCH9D93AVk", "I59WEHRkBvEx"};

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.instagram.common.viewpoint.core.AbstractC0776Tf
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C01193d c01193d) {
                Y1 y1;
                Y1 y12;
                y1 = AnonymousClass64.this.A03;
                if (y1 != null) {
                    y12 = AnonymousClass64.this.A03;
                    y12.ACn();
                    if (A01[3].charAt(11) == 'F') {
                        throw new RuntimeException();
                    }
                    A01[3] = "dba5oiQ8v4CkqUII5uWz8sPENBYPSf9M";
                }
            }
        };
        this.A09 = new C0602Mj(this, c1153dL);
        this.A0A = c1153dL;
        A02();
    }

    private void A02() {
        getEventBus().A03(this.A0D, this.A0C, this.A0B);
    }

    private void A04(Intent intent) {
        if (this.A05 == null) {
            A05(A01(114, 25, 92));
            return;
        }
        if (this.A00 == null && this.A08 == null) {
            A05(A01(Opcodes.F2I, 37, 74));
            String[] strArr = A0G;
            if (strArr[4].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            A0G[0] = "rwc2";
            return;
        }
        intent.putExtra(A01(237, 18, 91), this.A07);
        intent.putExtra(A01(322, 8, 97), EnumC0823Vb.A09);
        intent.putExtra(A01(287, 8, 17), this.A00.toString());
        intent.putExtra(A01(Opcodes.NEW, 11, 84), this.A06 == null ? A01(0, 0, 6) : this.A06);
        intent.putExtra(A01(266, 8, 39), this.A08);
        intent.putExtra(A01(205, 24, 99), AbstractC0856Wl.A00(this.A0A));
        intent.putExtra(A01(274, 13, 48), getCurrentPositionInMillis());
        String[] strArr2 = A0G;
        if (strArr2[7].length() != strArr2[3].length()) {
            throw new RuntimeException();
        }
        A0G[0] = "bFTSk0Gp6QusC65PcsD";
        intent.putExtra(A01(229, 8, 39), this.A0E);
        intent.putExtra(A01(255, 11, 7), this.A05.A0c());
        intent.putExtra(A01(295, 27, 99), getVideoProgressReportIntervalMs());
        intent.addFlags(268435456);
    }

    private void A05(String str) {
        this.A0A.A08().AAy(A01(Opcodes.IFNULL, 7, 74), AbstractC0766Sv.A28, new C0767Sw(AdErrorType.PARSER_FAILURE.getDefaultErrorMessage(), A01(90, 7, 92) + str));
        if (AdInternalSettings.isDebugBuild()) {
            Log.w(A0H, str);
        }
    }

    public final void A0u() {
        if (this.A01 != null) {
            this.A01.onCtaBroadcast();
        }
    }

    public final void A0v() {
        AdActivityIntent A05 = WB.A05(this.A0A);
        A04(A05);
        try {
            A0l(false, 6);
            setVisibility(8);
            WB.A0B(this.A0A, A05);
        } catch (Exception e) {
            this.A0A.A08().AAy(A01(Opcodes.ARETURN, 11, 123), AbstractC0766Sv.A0D, new C0767Sw(e));
            Log.e(A01(97, 17, 97), A01(0, 90, 103), e);
        }
    }

    public Y1 getListener() {
        return this.A03;
    }

    public String getUniqueId() {
        return this.A0E;
    }

    @Override // com.instagram.common.viewpoint.core.E1, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A09.A02();
    }

    @Override // com.instagram.common.viewpoint.core.E1, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.A09.A03();
        super.onDetachedFromWindow();
    }

    public void setAdEventManager(US us) {
        this.A02 = us;
    }

    public void setClientToken(String str) {
        C01243i c01243i;
        if (this.A04 != null) {
            EG eg = this.A04;
            String[] strArr = A0G;
            if (strArr[5].charAt(7) == strArr[1].charAt(7)) {
                throw new RuntimeException();
            }
            A0G[2] = "geldSN57Uojbab2WOS9MzcIW4E8sQ4xA";
            eg.A07();
        }
        if (this.A05 != null) {
            this.A05.A0p();
        }
        this.A06 = str;
        EG eg2 = null;
        if (str != null) {
            c01243i = new C01243i(this.A0A, this.A02, this, str);
        } else {
            c01243i = null;
        }
        this.A05 = c01243i;
        if (this.A05 != null && U7.A1v(this.A0A)) {
            if (str != null) {
                eg2 = new EG(this.A0A, this.A02, this, str, false, this.A05, null);
            }
            this.A04 = eg2;
            return;
        }
        this.A04 = null;
    }

    public void setEnableBackgroundVideo(boolean z) {
        super.A0E.setBackgroundPlaybackEnabled(z);
    }

    public void setListener(Y1 y1) {
        this.A03 = y1;
    }

    public void setNativeAd(NativeAd nativeAd) {
        this.A01 = nativeAd;
    }

    public void setVideoCTA(String str) {
        this.A07 = str;
    }

    @Override // com.instagram.common.viewpoint.core.E1
    public void setVideoMPD(String str) {
        if (str != null && this.A05 == null) {
            A05(A01(114, 25, 92));
            return;
        }
        this.A08 = str;
        String[] strArr = A0G;
        if (strArr[7].length() != strArr[3].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0G;
        strArr2[4] = "ao7Mn74HmNnh4";
        strArr2[6] = "E6rOC8IWnX5Ja";
        super.setVideoMPD(str);
    }

    @Override // com.instagram.common.viewpoint.core.E1
    public void setVideoURI(Uri uri) {
        if (uri != null && this.A05 == null) {
            A05(A01(114, 25, 92));
            return;
        }
        this.A00 = uri;
        super.setVideoURI(uri);
        String[] strArr = A0G;
        if (strArr[5].charAt(7) == strArr[1].charAt(7)) {
            throw new RuntimeException();
        }
        A0G[0] = "z2OQUaNXEwktMvnJ8h1OzGBt0";
    }
}
