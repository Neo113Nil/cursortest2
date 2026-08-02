package com.instagram.common.viewpoint.core;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdSettings;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeBannerAd;
import com.facebook.ads.internal.api.AdNativeComponentView;
import com.facebook.ads.internal.api.NativeAdBaseApi;
import com.facebook.ads.internal.api.NativeAdImageApi;
import com.facebook.ads.internal.context.Repairable;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.google.common.base.Ascii;
import java.lang.ref.WeakReference;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.WeakHashMap;
import kotlin.io.encoding.Base64;
import okio.Utf8;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.Qc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0696Qc implements Ad, NativeAdBaseApi, Repairable, InterfaceC0819Ux {
    public static SF A0k;
    public static byte[] A0l;
    public static String[] A0m = {"0QrYY16WpsBKaBkyPEA33iBIoR05UhVT", "YnnsFrkLVth43aFbA8XanJ7Af1ELV", "Oxqa2FUUnPLQ7GUfsty3Y0efzjvyqNtk", "SIKP4BEcnF1kam64buW5uj4ZKlEjFxDR", "vEVPI6RQ4lovzpZyrpWOxFDddvUHwWNp", "NGWOmnzpb", "djSS0JJWnZq1rlBsvyeXY9GnDKzed", "NhvbMWoFDj5W6o0bWnGe4dztWB8buZER"};
    public static final String A0n;
    public static final WeakHashMap<View, WeakReference<C0696Qc>> A0o;
    public long A00;
    public Drawable A01;
    public View.OnTouchListener A02;
    public View A03;
    public View A04;
    public View A05;
    public View A06;
    public NativeAdLayout A07;
    public EnumC0595Mc A08;
    public C1438iC A09;
    public C02166w A0A;
    public C1393hK A0B;
    public SL A0C;
    public TF A0D;
    public EnumC0807Ul A0E;
    public ViewOnClickListenerC0726Rg A0F;
    public QQ A0G;
    public C0813Ur A0H;
    public EnumC0814Us A0I;
    public V6 A0J;
    public YX A0K;
    public C0935Zm A0L;
    public C1064bt A0M;
    public C1129cw A0N;
    public AbstractC1225eW A0O;
    public AbstractC1225eW A0P;
    public C1226eX A0Q;
    public C1226eX A0R;
    public String A0S;
    public String A0T;
    public WeakReference<C1313fx> A0U;
    public WeakReference<AbstractC1225eW> A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public C1449iN A0a;
    public final SF A0b;
    public final C1153dL A0c;
    public final InterfaceC0810Uo A0d;
    public final C0821Uz A0e;
    public final XH A0f;
    public final String A0g;
    public final String A0h;
    public final List<View> A0i;
    public volatile boolean A0j;

    public static String A0W(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0l, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 112);
        }
        return new String(copyOfRange);
    }

    public static void A0e() {
        A0l = new byte[]{-32, Ascii.SUB, 38, Ascii.US, Ascii.RS, -17, -17, Ascii.GS, 32, -19, -12, 34, -15, -25, Ascii.SUB, -27, Ascii.EM, Ascii.EM, -28, Ascii.NAK, -22, -74, -70, -30, -78, -30, -78, -25, -29, 38, 73, 5, 83, 84, 89, 5, 81, 84, 70, 73, 74, 73, -25, 10, -6, Ascii.VT, 19, Ascii.SYN, Ascii.DC2, 7, Ascii.SUB, Ascii.VT, -58, -51, -53, Ascii.EM, -51, -58, Ascii.SI, Ascii.EM, -58, Ascii.DC4, Ascii.NAK, Ascii.SUB, -58, 7, -58, Ascii.DC4, 7, Ascii.SUB, Ascii.SI, Ascii.FS, Ascii.VT, -58, 7, 10, -33, -37, -38, Ascii.SO, -3, 2, -2, 7, -4, -2, -25, -2, Ascii.CR, 16, 8, Ascii.VT, 4, -27, 0, 8, Ascii.VT, 4, 3, -65, 19, Ascii.SO, -65, Ascii.VT, Ascii.SO, 0, 3, -65, -20, 4, 3, 8, 0, -51, -16, Ascii.VT, 19, Ascii.SYN, Ascii.SI, Ascii.SO, -54, Ascii.RS, Ascii.EM, -54, Ascii.EM, Ascii.FF, Ascii.RS, Ascii.VT, 19, Ascii.CAN, -54, Ascii.RS, Ascii.SI, Ascii.ETB, Ascii.SUB, Ascii.SYN, Ascii.VT, Ascii.RS, Ascii.SI, -54, -13, -18, -54, 16, Ascii.FS, Ascii.EM, Ascii.ETB, -54, Ascii.FF, 19, Ascii.SO, -54, Ascii.SUB, Ascii.VT, 35, Ascii.SYN, Ascii.EM, Ascii.VT, Ascii.SO, -54, -47, -49, Ascii.GS, -47, -23, Ascii.SO, Ascii.DC4, 5, Ascii.DC2, Ascii.SO, 1, Ascii.FF, -64, 5, Ascii.DC2, Ascii.DC2, Ascii.SI, Ascii.DC2, -50, -86, Ascii.RS, 67, 75, 54, 65, 62, 57, -11, 72, 58, 73, -11, 68, 59, -11, 56, 65, 62, 56, 64, 54, 55, 65, 58, -11, 75, 62, 58, 76, 72, 0, Ascii.CAN, Ascii.ETB, Ascii.FS, Ascii.DC4, 9, Ascii.FS, Ascii.CAN, 42, -45, Ascii.EM, 34, 37, -45, Ascii.FS, Ascii.SYN, 34, 33, -45, Ascii.FS, 38, -45, Ascii.FS, 38, -45, 32, Ascii.FS, 38, 38, Ascii.FS, 33, Ascii.SUB, -31, Ascii.GS, 53, 52, 57, 49, 38, 57, 53, 71, -16, 57, 67, -16, Base64.padSymbol, 57, 67, 67, 57, 62, 55, -2, 51, 91, 89, 90, 6, 86, 88, 85, 92, 79, 74, 75, 6, 71, 6, 60, 79, 75, 93, 35, 54, 73, 62, 75, 58, -11, Ascii.SYN, 57, -11, 76, 54, 72, -11, 54, 65, 71, 58, 54, 57, 78, -11, 71, 58, 60, 62, 72, 73, 58, 71, 58, 57, -11, 76, 62, 73, Base64.padSymbol, -11, 54, -11, 43, 62, 58, 76, 3, -11, Ascii.SYN, 74, 73, 68, -11, 74, 67, 71, 58, 60, 62, 72, 73, 58, 71, 62, 67, 60, -11, 54, 67, 57, -11, 69, 71, 68, 56, 58, 58, 57, 62, 67, 60, 3, -55, -36, -17, -28, -15, -32, -101, -36, -33, -101, -33, -32, -18, -17, -19, -22, -12, -32, -33, -39, -20, -1, -12, 1, -16, -85, -20, -17, -85, -9, -6, -20, -17, -85, -3, -16, -4, 0, -16, -2, -1, -16, -17, -22, -3, -7, Ascii.VT, -76, -11, 0, 6, -7, -11, -8, Ascii.CR, -76, 6, -7, -5, -3, 7, 8, -7, 6, -7, -8, -76, Ascii.VT, -3, 8, -4, -76, -11, -76, -30, -11, 8, -3, 10, -7, -43, -8, -62, -76, -43, 9, 8, 3, -76, 9, 2, 6, -7, -5, -3, 7, 8, -7, 6, -3, 2, -5, -76, -11, 2, -8, -76, 4, 6, 3, -9, -7, -7, -8, -3, 2, -5, -62, -1, Ascii.DC2, Ascii.SO, 32, -55, Ascii.ETB, Ascii.CAN, Ascii.GS, -55, Ascii.ESC, Ascii.SO, 16, Ascii.DC2, Ascii.FS, Ascii.GS, Ascii.SO, Ascii.ESC, Ascii.SO, Ascii.CR, -55, 32, Ascii.DC2, Ascii.GS, 17, -55, Ascii.GS, 17, Ascii.DC2, Ascii.FS, -55, -9, 10, Ascii.GS, Ascii.DC2, Ascii.US, Ascii.SO, -22, Ascii.CR, 46, 49, -19, 58, 50, 49, 54, 46, -19, 65, 70, Base64.padSymbol, 50, -19, 54, 64, -19, 59, 60, 65, -19, 64, 66, Base64.padSymbol, Base64.padSymbol, 60, Utf8.REPLACEMENT_BYTE, 65, 50, 49, -5, 54, 69, 62, 51, 52, 66, 67, 65, 62, 72, 81, 84, 70, 73, 38, 73, 69, 72, 58, Base64.padSymbol, Ascii.SUB, Base64.padSymbol, 1, 2, -7, 60, 58, 69, 69, 62, Base64.padSymbol, -7, 70, 72, 75, 62, -7, 77, 65, 58, 71, -7, 72, 71, 60, 62, -27, -40, -21, -32, -19, -36};
        String[] strArr = A0m;
        if (strArr[6].length() != strArr[1].length()) {
            throw new RuntimeException();
        }
        A0m[3] = "WbNUBB1XQVUYjPuN5kyqwH0pcEyoS9gz";
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x02c6, code lost:
    
        if (r6.A0S() == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x02c8, code lost:
    
        r12.A0O = new com.instagram.common.viewpoint.core.C0762Sr(r12);
        r12.A0Q = new com.instagram.common.viewpoint.core.C1226eX(r13, 1, new java.lang.ref.WeakReference(r12.A0O), r12.A0c);
        r12.A0Q.A0Y(false);
        r12.A0Q.A0X(r6.A09());
        r12.A0Q.A0U();
        r12.A0c.A0F().ABz();
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x02fb, code lost:
    
        r1 = new java.util.ArrayList(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0302, code lost:
    
        if (r12.A05 == null) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0304, code lost:
    
        r7 = r12.A05;
        r4 = com.instagram.common.viewpoint.core.C0696Qc.A0m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0317, code lost:
    
        if (r4[2].charAt(3) == r4[7].charAt(3)) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0319, code lost:
    
        r4 = com.instagram.common.viewpoint.core.C0696Qc.A0m;
        r4[0] = "7BxfhPTBtrovnc2SNqJYjum2f5qDPcpL";
        r4[4] = "Q5pxYg7VFdMmLRDnYTITcnTwa1eIsVWj";
        r1.add(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0328, code lost:
    
        r2 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0330, code lost:
    
        if (r2.hasNext() == false) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0332, code lost:
    
        A1L((android.view.View) r2.next());
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x033c, code lost:
    
        r0 = A10();
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0340, code lost:
    
        if (r16 == false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0342, code lost:
    
        if (r0 == null) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0348, code lost:
    
        if (r0.A1X() == false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x034a, code lost:
    
        A1L(r13);
        r1.add(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0350, code lost:
    
        r7 = A00();
        r12.A0P = new com.instagram.common.viewpoint.core.S9(r12, r14, r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x035d, code lost:
    
        if ((r14 instanceof com.facebook.ads.internal.api.AdNativeComponentView) == false) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x035f, code lost:
    
        r12.A03 = ((com.facebook.ads.internal.api.AdNativeComponentView) r14).getAdContentsView();
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x036d, code lost:
    
        if (com.instagram.common.viewpoint.core.U7.A1u(r12.A0c) == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x036f, code lost:
    
        r4 = A1C();
        r6 = A12().A0B();
        r5 = r12.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x037d, code lost:
    
        if (r4 != null) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x037f, code lost:
    
        r4 = A0W(0, 0, 121);
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0387, code lost:
    
        r6.AK3(r5, r4, r12.A03 instanceof com.instagram.common.viewpoint.core.C1166dY, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x038f, code lost:
    
        r12.A0R = new com.instagram.common.viewpoint.core.C1226eX(r12.A03, r7, A03(), true, new java.lang.ref.WeakReference(r12.A0P), r12.A0c);
        r12.A0R.A0Y(!A0r());
        r12.A0R.A0W(A01());
        r12.A0R.A0X(A02());
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x03c7, code lost:
    
        if ((r12.A03 instanceof com.instagram.common.viewpoint.core.C0925Zc) == false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x03c9, code lost:
    
        r5 = (com.instagram.common.viewpoint.core.C0925Zc) r12.A03;
        r4 = com.instagram.common.viewpoint.core.C0696Qc.A0m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x03df, code lost:
    
        if (r4[0].charAt(21) == r4[4].charAt(21)) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x03e1, code lost:
    
        com.instagram.common.viewpoint.core.C0696Qc.A0m[3] = "9jWMkBrIWAaQq3BshIoiK9kOFApm7Mnb";
        r5.A06(r12.A0R);
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x03ed, code lost:
    
        r12.A09 = new com.instagram.common.viewpoint.core.C1438iC(r12.A0c, new com.instagram.common.viewpoint.core.C0704Qk(r12, null), r12.A0R, r12.A0a);
        r12.A09.A0H(r1);
        com.instagram.common.viewpoint.core.C0696Qc.A0o.put(r13, new java.lang.ref.WeakReference<>(r12));
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0415, code lost:
    
        if (com.instagram.common.viewpoint.core.U7.A1B(r12.A0c) == false) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0417, code lost:
    
        r12.A0L = new com.instagram.common.viewpoint.core.C0935Zm();
        r12.A0L.A0C(r12.A0g);
        r12.A0L.A0B(r12.A0c.getPackageName());
        r12.A0L.A0A(r12.A0R);
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0439, code lost:
    
        if (r12.A0a == null) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0445, code lost:
    
        if (r12.A0a.A0E().A03() <= 0) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0447, code lost:
    
        r0 = r12.A0a.A0E();
        r12.A0L.A08(r0.A03(), r0.A04());
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x045a, code lost:
    
        r4 = r12.A0D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0468, code lost:
    
        if (com.instagram.common.viewpoint.core.C0696Qc.A0m[3].charAt(5) == 'B') goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x046a, code lost:
    
        if (r4 == null) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x046c, code lost:
    
        r12.A0L.A09(r12.A0D.A0C());
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0477, code lost:
    
        r12.A04.getOverlay().add(r12.A0L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0482, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0494, code lost:
    
        if (r12.A0A == null) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x049c, code lost:
    
        if (r12.A0A.A0J() == null) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x049e, code lost:
    
        r12.A0L.A09(r12.A0A.A0J().A0C());
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0483, code lost:
    
        r2 = com.instagram.common.viewpoint.core.C0696Qc.A0m;
        r2[6] = "iJInlaPqSCsodlo1snRpIwz9DPt1A";
        r2[1] = "DYzZZFtfMBLderHMiZZFXfgJZWHC0";
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x048f, code lost:
    
        if (r4 == null) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x04ae, code lost:
    
        r12.A03 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x025b, code lost:
    
        if (r8 != null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0222, code lost:
    
        if (r8 != null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0224, code lost:
    
        android.util.Log.w(com.instagram.common.viewpoint.core.C0696Qc.A0n, A0W(283, 80, 101));
        unregisterView();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0236, code lost:
    
        r8 = com.instagram.common.viewpoint.core.C0696Qc.A0o.containsKey(r13);
        r2 = com.instagram.common.viewpoint.core.C0696Qc.A0m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x024c, code lost:
    
        if (r2[6].length() == r2[1].length()) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0253, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x025e, code lost:
    
        r2 = com.instagram.common.viewpoint.core.C0696Qc.A0m;
        r2[0] = "r1dCEV0W05obqeylsxysUOCLLtyqbDkO";
        r2[4] = "jsU6g8E1kSPqSuKqGJQzSRDrUMjHNr5E";
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x026a, code lost:
    
        if (r8 == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0278, code lost:
    
        if (com.instagram.common.viewpoint.core.C0696Qc.A0o.get(r13).get() == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x027a, code lost:
    
        android.util.Log.w(com.instagram.common.viewpoint.core.C0696Qc.A0n, A0W(406, 75, 36));
        com.instagram.common.viewpoint.core.C0696Qc.A0o.get(r13).get().unregisterView();
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x029a, code lost:
    
        r12.A0F = new com.instagram.common.viewpoint.core.ViewOnClickListenerC0726Rg(r12, r12.A0c, null);
        r12.A04 = r13;
        r12.A06 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x02aa, code lost:
    
        if ((r13 instanceof android.view.ViewGroup) == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x02ac, code lost:
    
        r12.A0K = new com.instagram.common.viewpoint.core.YX(r12.A0c, new com.instagram.common.viewpoint.core.C0769Sy(r12));
        ((android.view.ViewGroup) r13).addView(r12.A0K);
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 24 out of bounds for length 17
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A0g(View view, View view2, List<View> list, boolean z) {
        if (!A0r()) {
            this.A0c.A0F().AGq();
        }
        if (view == null) {
            String A0W = A0W(264, 19, 118);
            if (!A0r()) {
                this.A0c.A0F().AGp(A0W);
            }
            throw new IllegalArgumentException(A0W);
        }
        if (list == null || list.size() == 0) {
            String A0W2 = A0W(Opcodes.GETFIELD, 30, 101);
            if (!A0r()) {
                this.A0c.A0F().AGp(A0W2);
            }
            throw new IllegalArgumentException(A0W2);
        }
        C1449iN A0C = A0C();
        if (A0C == null) {
            String A0W3 = A0W(29, 13, 117);
            if (!A0r()) {
                this.A0c.A0F().AGp(A0W3);
            }
            Log.e(A0n, A0W3);
            V1 v1 = new V1(AdErrorType.NATIVE_AD_IS_NOT_LOADED, A0W3);
            A12().A0F().A3F(XG.A01(this.A00), v1.A03().getErrorCode(), v1.A04());
            if (!U7.A2f(this.A0c) || this.A0G == null) {
                return;
            }
            this.A0G.ADB(v1);
            return;
        }
        String str = this.A0T;
        if ((view instanceof FrameLayout) && str != null) {
            A0h((FrameLayout) view, str);
        }
        if (this.A07 != null) {
            ((C1296fg) this.A07.getNativeAdLayoutApi()).A02();
        }
        C1313fx c1313fx = this.A0U.get();
        if (c1313fx != null && A0C.A08() == 1) {
            c1313fx.A03(XX.AN_INFO_ICON);
        }
        if (view2 != null) {
            boolean z2 = (view2 instanceof AdNativeComponentView) && ((AdNativeComponentView) view2).getAdContentsView() != null;
            boolean z3 = z && (view2 instanceof ImageView);
            if (!z2 && !z3) {
                if (this.A0G != null) {
                    V1 v12 = new V1(AdErrorType.UNSUPPORTED_AD_ASSET_NATIVEAD, A0W(519, 31, 93));
                    A12().A0F().A3F(XG.A01(this.A00), v12.A03().getErrorCode(), v12.A04());
                    this.A0G.ADB(v12);
                    return;
                }
                return;
            }
            View view3 = this.A04;
            if (A0m[3].charAt(5) != 'B') {
                String[] strArr = A0m;
                strArr[6] = "BCYbWK19bS9ET6nCyqUucyCTxntwC";
                strArr[1] = "hUEQWKvNS0BeeCCeuSbrKV1BB6cqb";
            } else {
                A0m[3] = "VFOGhBJepBYKNQ0g15YaI4y2lFqguygQ";
            }
        } else {
            if (this.A0J != V6.A06) {
                AdErrorType adErrorType = AdErrorType.NO_MEDIAVIEW_IN_NATIVEBANNERAD;
                String A0W4 = A0W(210, 33, 67);
                V1 v13 = new V1(adErrorType, A0W4);
                A12().A0F().A3F(XG.A01(this.A00), v13.A03().getErrorCode(), v13.A04());
                if (this.A0G != null) {
                    this.A0G.ADB(v13);
                }
                if (AdInternalSettings.isDebugBuild()) {
                    String str2 = A0n;
                    if (A0m[3].charAt(5) == 'B') {
                        A0m[3] = "KISMvB3VNIc1t4pH9OUWIwxPU7abTBQu";
                        Log.e(str2, A0W4);
                        return;
                    } else {
                        String[] strArr2 = A0m;
                        strArr2[2] = "I0o2CociGt9PfWtihtc1uzdPzn26Oc3b";
                        strArr2[7] = "DL9r7FwT46CQ5uSYOng5HfHjynm8xWWf";
                        Log.e(str2, A0W4);
                        return;
                    }
                }
                return;
            }
            AdErrorType adErrorType2 = AdErrorType.NO_MEDIAVIEW_IN_NATIVEAD;
            String A0W5 = A0W(243, 21, 96);
            V1 v14 = new V1(adErrorType2, A0W5);
            A12().A0F().A3F(XG.A01(this.A00), v14.A03().getErrorCode(), v14.A04());
            if (this.A0G != null) {
                this.A0G.ADB(v14);
            }
            if (!AdInternalSettings.isDebugBuild()) {
                return;
            }
            String str3 = A0n;
            if (A0m[5].length() != 3) {
                String[] strArr3 = A0m;
                strArr3[0] = "ymh7ZtbYw7oyMwS2HukMuI2t1Xj3fY7y";
                strArr3[4] = "GGURsKjIWyfUU1Vu9BOr0pf9u6pcVKo4";
                Log.e(str3, A0W5);
                return;
            }
        }
        throw new RuntimeException();
    }

    static {
        A0e();
        A0n = C0696Qc.class.getSimpleName();
        A0o = new WeakHashMap<>();
    }

    public C0696Qc(Context context, String str, InterfaceC0810Uo interfaceC0810Uo, boolean z) {
        this.A0h = UUID.randomUUID().toString();
        this.A0J = V6.A06;
        this.A0E = EnumC0807Ul.A04;
        this.A08 = EnumC0595Mc.A03;
        this.A0U = new WeakReference<>(null);
        this.A0i = new ArrayList();
        this.A0f = new XH();
        this.A0Z = false;
        this.A0Y = false;
        this.A00 = -1L;
        if (context instanceof C1153dL) {
            this.A0c = (C1153dL) context;
        } else if (!z) {
            this.A0c = RB.A04(context);
        } else {
            this.A0c = RB.A03(context);
        }
        this.A0c.A0O(this);
        this.A0g = str;
        this.A0d = interfaceC0810Uo;
        if (A0k != null) {
            this.A0b = A0k;
        } else {
            this.A0b = new SF(this.A0c);
        }
        this.A05 = new View(context);
        this.A0e = new C0821Uz(this.A0c, this);
    }

    public C0696Qc(C0696Qc c0696Qc) {
        this((Context) c0696Qc.A0c, (String) null, c0696Qc.A0d, true);
        this.A0D = c0696Qc.A0D;
        this.A0a = c0696Qc.A0a;
        this.A0B = c0696Qc.A0B;
        this.A0j = true;
        this.A05 = new View(this.A0c);
    }

    public C0696Qc(C1153dL c1153dL, C1449iN c1449iN, TF tf, InterfaceC0810Uo interfaceC0810Uo) {
        this((Context) c1153dL, (String) null, interfaceC0810Uo, true);
        this.A0a = c1449iN;
        this.A0D = tf;
        this.A0j = true;
        this.A05 = new View(c1153dL);
    }

    public C0696Qc(C1153dL c1153dL, C1449iN c1449iN, TF tf, InterfaceC0810Uo interfaceC0810Uo, C1393hK c1393hK) {
        this(c1153dL, c1449iN, tf, interfaceC0810Uo);
        this.A0B = c1393hK;
    }

    private int A00() {
        if (this.A0D != null) {
            return this.A0D.A04();
        }
        if (this.A0A == null || this.A0A.A0J() == null) {
            return 1;
        }
        TF A0J = this.A0A.A0J();
        String[] strArr = A0m;
        String str = strArr[6];
        String str2 = strArr[1];
        int length = str.length();
        int viewabilityThreshold = str2.length();
        if (length != viewabilityThreshold) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0m;
        strArr2[2] = "P5kYLn6xwAUrjDfDuw88TuaVt88D3vtD";
        strArr2[7] = "ZJzVQNISDO4cH7XUZ38T2d7bCdM1k8uN";
        return A0J.A04();
    }

    private int A01() {
        if (this.A0D != null) {
            return this.A0D.A07();
        }
        if (this.A0a != null) {
            return this.A0a.A0C();
        }
        if (this.A0A != null && this.A0A.A0J() != null) {
            return this.A0A.A0J().A07();
        }
        return 0;
    }

    private int A02() {
        if (this.A0D != null) {
            return this.A0D.A08();
        }
        if (this.A0a != null) {
            return this.A0a.A0D();
        }
        if (this.A0A != null && this.A0A.A0J() != null) {
            return this.A0A.A0J().A08();
        }
        return 1000;
    }

    private int A03() {
        if (this.A0D != null) {
            return this.A0D.A09();
        }
        C02166w c02166w = this.A0A;
        if (A0m[3].charAt(5) != 'B') {
            throw new RuntimeException();
        }
        A0m[5] = "Xt";
        if (c02166w == null || this.A0A.A0J() == null) {
            return 0;
        }
        return this.A0A.A0J().A09();
    }

    public static Drawable A05(C1153dL c1153dL, Bitmap bitmap, boolean z, String str) {
        BitmapDrawable A00;
        BitmapDrawable bitmapDrawable = new BitmapDrawable(c1153dL.getResources(), bitmap);
        if (z && (A00 = AbstractC1128cv.A00(c1153dL, str)) != null) {
            Drawable iconViewDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, A00});
            return iconViewDrawable;
        }
        return bitmapDrawable;
    }

    public static NativeAdBase A0A(Context context, String str, String str2) throws V2 {
        V6 A00 = VB.A00(str2);
        if (A00 != null) {
            V6 template = V6.A05;
            if (A00 == template) {
                return new NativeBannerAd(context, str);
            }
            V6 template2 = V6.A06;
            if (A00 == template2) {
                return new NativeAd(context, str);
            }
            throw new V2(AdErrorType.BID_PAYLOAD_ERROR, String.format(Locale.US, A0W(42, 34, 54), A00));
        }
        throw new V2(AdErrorType.BID_PAYLOAD_ERROR, String.format(Locale.US, A0W(114, 50, 58), str2));
    }

    private final C1449iN A0C() {
        C1449iN c1449iN = this.A0a;
        if (c1449iN != null && c1449iN.A0R()) {
            return c1449iN;
        }
        return null;
    }

    private C1437iB A0F() {
        return A0G(false);
    }

    private C1437iB A0G(boolean z) {
        if (this.A0a != null) {
            C1449iN c1449iN = this.A0a;
            if (A0m[3].charAt(5) == 'B') {
                String[] strArr = A0m;
                strArr[0] = "rkQiEYXoMEhriwkmxTS9YqbekXjRctvV";
                strArr[4] = "aQIgqL6bCxVEsMgFZvYj1f08oAvgjHgO";
                if (c1449iN.A0R()) {
                    if (z) {
                        C1449iN c1449iN2 = this.A0a;
                        if (A0m[3].charAt(5) == 'B') {
                            A0m[3] = "EWl26Bqfon8mX0lHHC6z05409Pwx5AXq";
                            c1449iN2.A0I();
                        }
                    }
                    return this.A0a.A0E();
                }
            }
            throw new RuntimeException();
        }
        return new C1437iB();
    }

    public static S3 A0K() {
        return new S3();
    }

    public static C0696Qc A0L(NativeAdBaseApi nativeAdBaseApi) {
        if (nativeAdBaseApi instanceof Proxy) {
            return (C0696Qc) ((C0715Qv) Proxy.getInvocationHandler(nativeAdBaseApi)).A04();
        }
        return (C0696Qc) nativeAdBaseApi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    /* renamed from: A0M, reason: merged with bridge method [inline-methods] */
    public final C0811Up getAdChoicesIcon() {
        return A0F().A0D();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    /* renamed from: A0O, reason: merged with bridge method [inline-methods] */
    public final C0812Uq getAdStarRating() {
        return A0F().A0G();
    }

    private AdPlacementType A0R() {
        if (this.A0J == V6.A06) {
            return AdPlacementType.NATIVE;
        }
        return AdPlacementType.NATIVE_BANNER;
    }

    private void A0a() {
        for (View view : this.A0i) {
            view.setOnClickListener(null);
            if (A0m[3].charAt(5) != 'B') {
                throw new RuntimeException();
            }
            A0m[3] = "reBfvBMaH6BqwlxZ2WqAQZq3knZpIvyz";
            view.setOnTouchListener(null);
            view.setOnLongClickListener(null);
        }
        this.A0i.clear();
    }

    private void A0b() {
        if (!TextUtils.isEmpty(getAdChoicesLinkUrl())) {
            WN.A0O(new WN(), this.A0c, WQ.A00(getAdChoicesLinkUrl()), A1C());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0c() {
        this.A0f.A05();
        this.A0e.A05();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0d() {
        if (this.A0Q != null) {
            this.A0Q.A0V();
            this.A0c.A0F().AC0();
            this.A0Q = null;
        }
    }

    public static void A0f(Drawable drawable, ImageView imageView) {
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
        }
        if (A0m[3].charAt(5) != 'B') {
            throw new RuntimeException();
        }
        String[] strArr = A0m;
        strArr[6] = "LXDT52DRzEPuIKBbeK5QN38hLQjcy";
        strArr[1] = "Z1aNossC2MxjaxQyIIrn4vHalGw3J";
        imageView.setBackground(null);
    }

    private void A0h(FrameLayout frameLayout, String str) {
        if (this.A0N != null) {
            frameLayout.removeView(this.A0N);
        }
        this.A0N = AbstractC1128cv.A01(RB.A03(this.A0c), str);
        if (this.A0N != null) {
            frameLayout.addView(this.A0N, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(this.A0N);
        }
    }

    private void A0i(C1449iN c1449iN, boolean z) {
        if (c1449iN == null) {
            return;
        }
        boolean equals = this.A0E.equals(EnumC0807Ul.A04);
        String A0W = A0W(596, 6, 7);
        if (equals) {
            C1437iB A0E = c1449iN.A0E();
            String clientToken = c1449iN.A7G();
            if (!TextUtils.isEmpty(clientToken)) {
                this.A0b.A0e(new C0796Ua(clientToken, this.A0c.A0A()));
            }
            C0811Up A0F = A0E.A0F();
            String[] strArr = A0m;
            if (strArr[2].charAt(3) == strArr[7].charAt(3)) {
                throw new RuntimeException();
            }
            A0m[3] = "olK6BBrMvSH2F6L4J2jXYHYWLLMocGr7";
            if (A0F != null) {
                SD sd = new SD(A0E.A0F().getUrl(), A0E.A0F().getHeight(), A0E.A0F().getWidth(), c1449iN.A0G(), A0W(596, 6, 7));
                sd.A01 = this.A0C;
                this.A0b.A0W();
                this.A0b.A0c(sd);
            }
            if (!this.A0J.equals(V6.A05)) {
                if (A0E.A0E() != null) {
                    this.A0b.A0c(new SD(A0E.A0E().getUrl(), A0E.A0E().getHeight(), A0E.A0E().getWidth(), c1449iN.A0G(), A0W(596, 6, 7)));
                }
                if (c1449iN.A0H() != null) {
                    for (C0696Qc c0696Qc : c1449iN.A0H()) {
                        if (c0696Qc.getAdCoverImage() != null) {
                            this.A0b.A0c(new SD(c0696Qc.getAdCoverImage().getUrl(), c0696Qc.getAdCoverImage().getHeight(), c0696Qc.getAdCoverImage().getWidth(), c1449iN.A0G(), A0W(596, 6, 7)));
                        }
                    }
                }
                String A0b = A0E.A0b();
                if (!TextUtils.isEmpty(A0b)) {
                    this.A0b.A0b(new SB(A0b, c1449iN.A0G(), A0W(596, 6, 7), A0E.A0A()));
                }
            }
            AbstractC1428hy A0C = A0E.A0C();
            if (A0C != null && A0C.A1Y()) {
                SB sb = new SB(A0C.A0s(), A0C.A17(), A0W);
                sb.A04 = true;
                sb.A03 = A0W(0, 5, 66);
                this.A0b.A0Y(sb);
            }
        }
        this.A0b.A0X(new T7(this, c1449iN, z), new S8(c1449iN.A0G(), A0W));
    }

    private void A0j(InterfaceC0597Me interfaceC0597Me) {
        if (this.A0a == null) {
            return;
        }
        this.A0a.A0K(interfaceC0597Me);
    }

    public static void A0k(NativeAdImageApi nativeAdImageApi, ImageView imageView, C1153dL c1153dL) {
        if (nativeAdImageApi != null && imageView != null) {
            new KZ(imageView, c1153dL).A05(nativeAdImageApi.getHeight(), nativeAdImageApi.getWidth()).A07(nativeAdImageApi.getUrl());
        }
    }

    private final void A0n(QQ qq) {
        this.A0G = qq;
    }

    private final void A0o(String str) {
        this.A0S = str;
    }

    private void A0p(List<View> list, View view) {
        if (this.A0d != null && this.A0d.AJD(view)) {
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                A0p(list, viewGroup.getChildAt(i));
            }
            return;
        }
        list.add(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0q() {
        return A19() == EnumC0816Uu.A05 || A19() == EnumC0816Uu.A03;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0r() {
        return A0F().A0e();
    }

    public final long A0y() {
        return this.A00;
    }

    public final C1449iN A0z() {
        return this.A0a;
    }

    public final AbstractC1428hy A10() {
        return A0F().A0C();
    }

    public final SF A11() {
        return this.A0b;
    }

    public final C1153dL A12() {
        return this.A0c;
    }

    public final ViewOnClickListenerC0726Rg A13() {
        return this.A0F;
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    /* renamed from: A14, reason: merged with bridge method [inline-methods] */
    public final C0811Up getAdCoverImage() {
        return A0F().A0E();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    /* renamed from: A15, reason: merged with bridge method [inline-methods] */
    public final C0811Up getAdIcon() {
        return A0F().A0F();
    }

    public final QQ A16() {
        return this.A0G;
    }

    public final C0813Ur A17() {
        return this.A0H;
    }

    public final EnumC0814Us A18() {
        return this.A0I;
    }

    public final EnumC0816Uu A19() {
        return A0F().A0H();
    }

    public final XH A1A() {
        return this.A0f;
    }

    public final C1226eX A1B() {
        return this.A0R;
    }

    public final String A1C() {
        if (this.A0a == null || !isAdLoaded()) {
            return null;
        }
        return this.A0a.A7G();
    }

    public final String A1D() {
        return this.A0T;
    }

    public final String A1E() {
        return A0G(true).A0N();
    }

    public final String A1F() {
        return A0G(true).A0O();
    }

    public final String A1G() {
        return A0F().A0a();
    }

    public final String A1H() {
        if (this.A0a == null || TextUtils.isEmpty(this.A0a.A0E().A0b())) {
            return null;
        }
        return this.A0b.A0T(this.A0a.A0E().A0b());
    }

    public final List<C0696Qc> A1I() {
        if (this.A0a == null || !isAdLoaded()) {
            return null;
        }
        return this.A0a.A0H();
    }

    public final void A1J() {
        if (!O3.A00(this.A0c.A02()).A0O(this.A0c, false)) {
            A0b();
            if (A0m[5].length() == 3) {
                throw new RuntimeException();
            }
            A0m[3] = "yREZ0BSYt8CSunaR9f1myx0zIAs3a5bO";
            return;
        }
        AbstractC0900Yd A01 = AbstractC0901Ye.A01(this.A0c, this.A0c.A0A(), A1C(), this.A07);
        if (A01 == null) {
            A0b();
        } else {
            ((C1296fg) this.A07.getNativeAdLayoutApi()).A03(A01);
            A01.A0M();
        }
    }

    public final void A1K(Drawable drawable) {
        this.A01 = drawable;
        A1f(drawable != null, true);
    }

    public final void A1L(View view) {
        this.A0i.add(view);
        view.setOnClickListener(this.A0F);
        view.setOnTouchListener(this.A0F);
        if (U7.A1B(view.getContext())) {
            view.setOnLongClickListener(this.A0F);
        }
    }

    public final void A1M(View view, ImageView imageView) {
        ArrayList arrayList = new ArrayList();
        A0p(arrayList, view);
        A0g(view, imageView, arrayList, true);
    }

    public final void A1N(View view, ImageView imageView, List<View> clickableViews) {
        A0g(view, imageView, clickableViews, true);
    }

    public final void A1O(View view, AdNativeComponentView adNativeComponentView) {
        ArrayList arrayList = new ArrayList();
        A0p(arrayList, view);
        A0g(view, adNativeComponentView, arrayList, false);
    }

    public final void A1P(View view, AdNativeComponentView adNativeComponentView, List<View> clickableViews) {
        A0g(view, adNativeComponentView, clickableViews, false);
    }

    public final void A1Q(View view, AdNativeComponentView adNativeComponentView, List<View> clickableViews, boolean z) {
        A0g(view, adNativeComponentView, clickableViews, z);
    }

    public final void A1R(View view, AdNativeComponentView adNativeComponentView, boolean z) {
        List<View> clickableViews = new ArrayList<>();
        A0p(clickableViews, view);
        A0g(view, adNativeComponentView, clickableViews, z);
    }

    public final void A1S(MediaView mediaView) {
        if (mediaView != null) {
            this.A0Y = true;
        }
    }

    public final void A1T(MediaView mediaView) {
        if (mediaView != null) {
            this.A0Z = true;
        }
    }

    public final void A1U(NativeAdBase nativeAdBase, NativeAdListener nativeAdListener) {
        if (nativeAdListener == null) {
            return;
        }
        A0n(new C6I(nativeAdListener, nativeAdBase));
    }

    public final void A1V(NativeAdLayout nativeAdLayout) {
        this.A07 = nativeAdLayout;
    }

    public final void A1W(C1449iN c1449iN) {
        A0i(c1449iN, true);
        if (this.A0G != null && c1449iN.A0H() != null) {
            T9 t9 = new T9(this);
            for (C0696Qc c0696Qc : c1449iN.A0H()) {
                if (A0m[3].charAt(5) != 'B') {
                    throw new RuntimeException();
                }
                String[] strArr = A0m;
                strArr[0] = "7JUEXy8BV6wMe69mvRG8Hisl1h58kfsH";
                strArr[4] = "Ag7M0cktqfZPxcWhbEyn8XCMGlxm5ALn";
                c0696Qc.A0j(t9);
            }
        }
    }

    public final void A1X(C1313fx c1313fx) {
        this.A0U = new WeakReference<>(c1313fx);
    }

    public final void A1Y(EnumC0807Ul enumC0807Ul, String str, SL sl) {
        if (str == null) {
            this.A0c.A0F().A3I();
        } else {
            this.A0c.A0F().A3H();
        }
        this.A00 = System.currentTimeMillis();
        boolean z = this.A0j;
        String[] strArr = A0m;
        if (strArr[0].charAt(21) != strArr[4].charAt(21)) {
            String[] strArr2 = A0m;
            strArr2[0] = "knecuAJjZigTf7VsFCGhTGCW7dxKplKn";
            strArr2[4] = "uRrNlLGUJL1gxvEKewtOLFu1Ztix0dl1";
            if (z) {
                AdSettings.IntegrationErrorMode A00 = NW.A00(this.A0c);
                String A0W = A0W(566, 30, 105);
                AdSettings.IntegrationErrorMode integrationErrorMode = AdSettings.IntegrationErrorMode.INTEGRATION_ERROR_CRASH_DEBUG_MODE;
                if (!integrationErrorMode.equals(A00)) {
                    V1 v1 = new V1(AdErrorType.LOAD_AD_CALLED_MORE_THAN_ONCE, A0W(566, 30, 105));
                    A12().A0F().A3F(XG.A01(this.A00), v1.A03().getErrorCode(), v1.A04());
                    if (this.A0G != null) {
                        this.A0G.ADB(v1);
                    } else {
                        Log.e(A0W(76, 17, 41), A0W);
                    }
                    C0767Sw c0767Sw = new C0767Sw(A0W);
                    A12().A08().AAy(A0W(550, 3, 101), AbstractC0766Sv.A0c, c0767Sw);
                } else {
                    throw new C0619Nb(A0W);
                }
            }
            this.A0j = true;
            this.A0E = enumC0807Ul;
            if (enumC0807Ul.equals(EnumC0807Ul.A05)) {
                EnumC0595Mc enumC0595Mc = EnumC0595Mc.A05;
                if (A0m[3].charAt(5) == 'B') {
                    A0m[3] = "N11XMBa1eBkGGouoRChlRsXEwEtHvHDZ";
                    this.A08 = enumC0595Mc;
                }
            }
            this.A0C = sl;
            NT nt = new NT(this.A0g, this.A0J, A0R(), null, 1, new C1385hB());
            nt.A05(enumC0807Ul);
            nt.A06(this.A0S);
            nt.A07(this.A0T);
            this.A0A = new C02166w(this.A0c, nt);
            this.A0A.A0S(new TA(this));
            this.A0A.A0W(str);
            return;
        }
        throw new RuntimeException();
    }

    public final void A1Z(C0813Ur c0813Ur) {
        this.A0H = c0813Ur;
    }

    public final void A1a(EnumC0814Us enumC0814Us) {
        this.A0I = enumC0814Us;
    }

    public final void A1b(V6 v6) {
        if (!A0r()) {
            if (V6.A05.equals(v6)) {
                this.A0c.A0F().A3L(AdPlacementType.NATIVE_BANNER.toString(), this.A0g);
            } else {
                this.A0c.A0F().A3L(AdPlacementType.NATIVE.toString(), this.A0g);
            }
        }
        this.A0J = v6;
    }

    public final void A1c(AbstractC1225eW abstractC1225eW) {
        this.A0V = new WeakReference<>(abstractC1225eW);
    }

    public final void A1d(boolean z) {
        this.A0W = z;
    }

    public final void A1e(boolean z) {
        this.A0X = z;
    }

    public final void A1f(boolean z, boolean z2) {
        String A0W;
        if (z) {
            if (this.A0E.equals(EnumC0807Ul.A05)) {
                boolean A0r = A0r();
                if (A0m[3].charAt(5) != 'B') {
                    throw new RuntimeException();
                }
                String[] strArr = A0m;
                strArr[6] = "maLBxQjysuwmJ75m3YPaJDHU5JlBu";
                strArr[1] = "hXXEi4DazsshJWFEyRiAh7tUxgC1d";
                if (!A0r && this.A0G != null) {
                    this.A0G.AEB();
                }
            }
            if (this.A0R != null) {
                this.A0R.A0U();
                this.A0e.A09();
                return;
            }
            return;
        }
        if (this.A0R != null) {
            C1449iN adapter = A0z();
            if (adapter != null) {
                A0W = adapter.A0G();
            } else if (A0m[5].length() != 3) {
                String[] strArr2 = A0m;
                strArr2[2] = "2ETmOz1YodPf8MKRGGB9YcIoy7FDTpAq";
                strArr2[7] = "k5VZ8yDbY0Zqj8FxkeEerY08JJe7M6tR";
                A0W = A0W(0, 0, 121);
            } else {
                String[] strArr3 = A0m;
                strArr3[0] = "JjUCnZOckAfeDcKZajvIf0dyi7sruRRg";
                strArr3[4] = "GlO3j5qd4HFQ8L5mPWBpkp3onxgG8Q98";
                A0W = A0W(0, 0, 121);
            }
            this.A0e.A0C(this.A0c, A0W);
            this.A0R.A0V();
        }
        if (this.A0G != null && z2) {
            V1 A01 = V1.A01(AdErrorType.BROKEN_MEDIA_ERROR, A0W(93, 21, 47));
            A12().A0F().A3F(XG.A01(this.A00), A01.A03().getErrorCode(), A01.A04());
            this.A0G.ADB(A01);
        }
    }

    public final boolean A1g() {
        return this.A07 == null;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0819Ux
    public final int A7V() {
        View view = this.A06;
        if (view instanceof AdNativeComponentView) {
            View videoView = ((AdNativeComponentView) view).getAdContentsView();
            if (videoView instanceof C1166dY) {
                return ((C1166dY) videoView).getCurrentPosition();
            }
            return -1;
        }
        return -1;
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final NativeAdBase.NativeAdLoadConfigBuilder buildLoadAdConfig(NativeAdBase nativeAdBase) {
        return new C0817Uv(this, nativeAdBase);
    }

    @Override // com.facebook.ads.Ad
    public final void destroy() {
        VF.A05(A0W(553, 7, 95), A0W(363, 19, 11), A0W(13, 8, 68));
        if (U7.A1u(this.A0c)) {
            A12().A0B().AJj(this.A03);
        }
        if (!A0r()) {
            this.A0c.A0F().A3M();
        }
        if (this.A0A != null) {
            this.A0A.A0Y(true);
            this.A0A.A0K();
            this.A0A = null;
        }
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final void downloadMedia() {
        if (this.A0E.equals(EnumC0807Ul.A05)) {
            this.A08 = EnumC0595Mc.A04;
        }
        this.A0E = EnumC0807Ul.A04;
        A0i(this.A0a, false);
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getAdBodyText() {
        return A0G(true).A0I();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getAdCallToAction() {
        return A0G(true).A0W();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getAdChoicesImageUrl() {
        if (getAdChoicesIcon() == null) {
            return null;
        }
        return getAdChoicesIcon().getUrl();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getAdChoicesLinkUrl() {
        return A0F().A0J();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getAdChoicesText() {
        return A0F().A0K();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getAdHeadline() {
        return A0G(true).A0L();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getAdLinkDescription() {
        return A0G(true).A0M();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getAdSocialContext() {
        return A0G(true).A0Q();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getAdTranslation() {
        return A0G(true).A0T();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getAdUntrimmedBodyText() {
        return A0G(true).A0U();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getAdvertiserName() {
        return A0G(true).A0V();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final float getAspectRatio() {
        C0811Up nativeAdImage;
        if (this.A0a == null || (nativeAdImage = this.A0a.A0E().A0E()) == null) {
            return 0.0f;
        }
        int width = nativeAdImage.getWidth();
        int height = nativeAdImage.getHeight();
        if (height <= 0) {
            return 0.0f;
        }
        float f = width;
        float f2 = height;
        String[] strArr = A0m;
        if (strArr[0].charAt(21) == strArr[4].charAt(21)) {
            throw new RuntimeException();
        }
        A0m[3] = "OUTl4BjdLTzCi4kmpI6eA9pKBM08eKMp";
        return f / f2;
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getId() {
        if (!isAdLoaded()) {
            return null;
        }
        return this.A0h;
    }

    @Override // com.facebook.ads.Ad
    public final String getPlacementId() {
        return this.A0g;
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final Drawable getPreloadedIconViewDrawable() {
        C0811Up A0F;
        Bitmap A0N;
        C1449iN adapter = this.A0a;
        if (adapter != null && (A0F = A0F().A0F()) != null && (A0N = this.A0b.A0N(A0F.getUrl())) != null) {
            return A05(A12(), A0N, A1g(), A1D());
        }
        return null;
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getPromotedTranslation() {
        return A0G(true).A0P();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getSponsoredTranslation() {
        return A0G(true).A0R();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final boolean hasCallToAction() {
        return this.A0a != null && this.A0a.A0Q();
    }

    @Override // com.facebook.ads.Ad
    public final boolean isAdInvalidated() {
        boolean z = true;
        if (this.A0A != null) {
            C02166w c02166w = this.A0A;
            String[] strArr = A0m;
            if (strArr[6].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0m;
            strArr2[2] = "gqyuy6F7WThaJUOfAsIyr4sziGGBhw0f";
            strArr2[7] = "L6lbko7Rv34huPFym8TvMBezY1vQkdWf";
            z = c02166w.A0Z();
        } else if (this.A0B != null) {
            z = this.A0B.A0A();
        }
        this.A0c.A0F().A5X(z);
        return z;
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final boolean isAdLoaded() {
        return this.A0a != null && this.A0a.A0R();
    }

    @Override // com.facebook.ads.Ad
    public final void loadAd() {
        VF.A05(A0W(560, 6, 117), A0W(382, 24, 27), A0W(5, 8, 76));
        A1Y(EnumC0807Ul.A00(NativeAdBase.MediaCacheFlag.ALL), null, new SL(false, -1, -1));
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final void loadAd(NativeAdBase.NativeLoadAdConfig nativeLoadAdConfig) {
        VF.A05(A0W(560, 6, 117), A0W(382, 24, 27), A0W(21, 8, 17));
        ((C0817Uv) nativeLoadAdConfig).A00();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final void onCtaBroadcast() {
        if (this.A05 != null) {
            this.A05.performClick();
        }
    }

    @Override // com.facebook.ads.internal.context.Repairable
    public final void repair(Throwable th) {
        if (this.A04 != null) {
            this.A04.post(new TB(this));
        }
        String str = A0W(Opcodes.IF_ICMPLE, 16, 48) + X7.A03(this.A0c, th);
        A12().A0F().A3F(XG.A01(this.A00), AdError.INTERNAL_ERROR_CODE, str);
        if (this.A0G != null) {
            this.A0G.ADB(new V1(AdError.INTERNAL_ERROR_CODE, str));
        }
    }

    @Override // com.facebook.ads.Ad
    public final void setExtraHints(ExtraHints extraHints) {
        if (extraHints == null) {
            return;
        }
        A0o(extraHints.getHints());
        this.A0T = extraHints.getMediationData();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.A02 = onTouchListener;
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final void unregisterView() {
        C1129cw c1129cw = this.A0N;
        if (c1129cw != null) {
            ViewParent parent = c1129cw.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(c1129cw);
            }
            this.A0N = null;
        }
        if (this.A04 == null || this.A06 == null) {
            return;
        }
        if (!A0r()) {
            LH A0F = this.A0c.A0F();
            String[] strArr = A0m;
            if (strArr[0].charAt(21) != strArr[4].charAt(21)) {
                A0m[3] = "w9n8TBisrss8zAM8EiwpgeUnlq2PaQ6F";
                A0F.unregisterView();
            }
            throw new RuntimeException();
        }
        if (U7.A1u(this.A0c)) {
            A12().A0B().AJj(this.A03);
        }
        if (A0o.containsKey(this.A04) && A0o.get(this.A04).get() == this) {
            View view = this.A04;
            String[] strArr2 = A0m;
            if (strArr2[2].charAt(3) != strArr2[7].charAt(3)) {
                String[] strArr3 = A0m;
                strArr3[6] = "1kkuB6xtwDeF3EtU3aavEsH64nQcK";
                strArr3[1] = "rb6NM7K87kMKFcLdVL5rugEXgDuZd";
                if ((view instanceof ViewGroup) && this.A0K != null) {
                    ((ViewGroup) this.A04).removeView(this.A0K);
                    this.A0K = null;
                }
                if (this.A0a != null) {
                    this.A0a.A0J();
                }
                if (this.A0L != null && U7.A1B(this.A0c)) {
                    this.A0L.A07();
                    View view2 = this.A04;
                    String[] strArr4 = A0m;
                    if (strArr4[2].charAt(3) == strArr4[7].charAt(3)) {
                        throw new RuntimeException();
                    }
                    String[] strArr5 = A0m;
                    strArr5[0] = "4gE9LeNlQroHqEeWf1EzJsbNX9PRfDme";
                    strArr5[4] = "TBDkrxJbHtSaZ13hkNs0RNY8SzE0jpKy";
                    view2.getOverlay().remove(this.A0L);
                }
                A0o.remove(this.A04);
                A0a();
                this.A04 = null;
                this.A06 = null;
                if (this.A0R != null) {
                    this.A0R.A0V();
                    this.A0R = null;
                }
                A0d();
                this.A09 = null;
                return;
            }
            throw new RuntimeException();
        }
        throw new IllegalStateException(A0W(481, 38, 57));
    }
}
