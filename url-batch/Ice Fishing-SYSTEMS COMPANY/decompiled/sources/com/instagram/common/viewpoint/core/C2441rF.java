package com.instagram.common.viewpoint.core;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.rF, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2441rF {
    public static byte[] A0H;
    public static String[] A0I = {"hvB6Y5lFyDpOUo5WE2d6RBuRXgbY5ZUm", "NE", "ywY8EvofFV55395JkJDayoeTErGWKbkG", "zJ8LsRBLLSys8CPHp", "gH0zTalybZGhm0qBmcsXdCP28l4r1an9", "kduBCn7ltQGfodptcqURcnO6EcdnH0I2", "cBbzau3JoVbeDspRwe3LG6GIj8yddyUH", "tX"};
    public InterfaceC2443rI A00;
    public boolean A01;
    public final Rect A02;
    public final Rect A03;
    public final Handler A04;
    public final InterfaceC1895hc A05;
    public final ScanDelayController A06;
    public final ViewpointAutoOcclusion A07;
    public final InterfaceC2451rQ A08;
    public final ViewpointQeConfig A09;
    public final ViewpointRegistry A0A;
    public final InterfaceC0777Al A0B;
    public final Runnable A0C;
    public final List<Rect> A0D;
    public final List<DspViewableNode> A0E;
    public final List<C2448rN<?, ?>> A0F;
    public final List<Rect> A0G;

    public static String A05(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A0H, i, i + i4);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 20);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        String[] strArr = A0I;
        if (strArr[2].charAt(24) != strArr[5].charAt(24)) {
            throw new RuntimeException();
        }
        A0I[3] = "afzSeuF2JzxaSSSWQ";
        A0H = new byte[]{-65, -55, -91, -71, -71, -62, -53, -70, -69, -70, -53, -66, -52, -66, -51, -55, -60, -72, -75, -56, -71};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 8
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private void A0A(DspViewableNode dspViewableNode, C2448rN<?, ?> c2448rN) {
        Iterator<Rect> it = this.A0D.iterator();
        while (it.hasNext()) {
            if (dspViewableNode.A9Y(this.A03, this.A02, it.next()) && c2448rN != C2448rN.A0B) {
                if (A0I[0].charAt(13) == 'n') {
                    throw new RuntimeException();
                }
                String[] strArr = A0I;
                strArr[6] = "ovGzBU7jFj6BmSvOwlnDuwIQ8kdYWcjX";
                strArr[4] = "9Q0zz3j3tYyfuWL6OVNzyvBOA9tkBax5";
                if (0 != 0) {
                    throw new NullPointerException(A05(0, 10, 66));
                }
                this.A0B.A46(c2448rN, this.A03, this.A02, this.A09.A01);
            }
        }
    }

    static {
        A06();
    }

    public C2441rF(ViewpointQeConfig viewpointQeConfig, InterfaceC2451rQ interfaceC2451rQ, InterfaceC1895hc interfaceC1895hc, InterfaceC0777Al interfaceC0777Al, ViewpointRegistry viewpointRegistry, ViewpointAutoOcclusion viewpointAutoOcclusion, Handler handler, ScanDelayController scanDelayController) {
        this(viewpointQeConfig, interfaceC2451rQ, interfaceC1895hc, interfaceC0777Al, viewpointRegistry, viewpointAutoOcclusion, handler, scanDelayController, 100);
    }

    public C2441rF(ViewpointQeConfig viewpointQeConfig, InterfaceC2451rQ interfaceC2451rQ, InterfaceC1895hc interfaceC1895hc, InterfaceC0777Al interfaceC0777Al, ViewpointRegistry viewpointRegistry, ViewpointAutoOcclusion viewpointAutoOcclusion, Handler handler, ScanDelayController scanDelayController, int i) {
        this.A03 = new Rect();
        this.A02 = new Rect();
        this.A0G = new ArrayList();
        this.A0E = new ArrayList();
        this.A0F = new ArrayList();
        this.A0D = new ArrayList();
        this.A01 = false;
        this.A09 = viewpointQeConfig;
        this.A08 = interfaceC2451rQ;
        this.A05 = interfaceC1895hc;
        this.A0B = interfaceC0777Al;
        this.A0A = viewpointRegistry;
        this.A07 = viewpointAutoOcclusion;
        this.A04 = handler;
        this.A06 = scanDelayController;
        this.A0C = new RunnableC2442rG(this, i, new Exception());
    }

    public static Activity A00(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    public static /* synthetic */ ScanDelayController A03(C2441rF c2441rF) {
        return null;
    }

    private void A07(long j9) {
        if (this.A0E.isEmpty()) {
            this.A08.A9Z(this.A0D);
            this.A0B.A4h(j9, this.A0D);
            this.A0B.A6P(null);
            return;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a9, code lost:
    
        if (0 != 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b9, code lost:
    
        throw new java.lang.NullPointerException(A05(15, 6, 64));
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c4, code lost:
    
        r4.A0E.clear();
        r4.A0F.clear();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ce, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c1, code lost:
    
        if (0 != 0) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void A08(long j9) {
        this.A08.A9Z(this.A0D);
        this.A0B.A4h(j9, this.A0D);
        if (this.A0E.isEmpty()) {
            if (this.A0F.isEmpty()) {
                this.A0A.A0A(this.A0E, this.A0F);
                for (final DspViewableNode dspViewableNode : this.A0E) {
                    if (this.A09.A00) {
                        this.A0A.A09(dspViewableNode, new AZ() { // from class: com.facebook.ads.redexgen.X.1v
                            @Override // com.instagram.common.viewpoint.core.AZ
                            public final Object AAK(Object obj) {
                                return C2441rF.this.A0E(dspViewableNode, (C2448rN) obj);
                            }
                        });
                    } else {
                        A0A(dspViewableNode, this.A0A.A04(dspViewableNode));
                    }
                }
                InterfaceC0777Al interfaceC0777Al = this.A0B;
                String[] strArr = A0I;
                if (strArr[6].charAt(3) != strArr[4].charAt(3)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0I;
                strArr2[2] = "nrcH38GFR0AnNATGilmIDxGLEfq4UsQc";
                strArr2[5] = "6vipxWZV3AO1VWKwqmDQLGTjEEAJtLqC";
                interfaceC0777Al.A6P(this.A0F);
                if (this.A00 != null) {
                    this.A00.AFq();
                }
                String[] strArr3 = A0I;
                if (strArr3[6].charAt(3) != strArr3[4].charAt(3)) {
                    String[] strArr4 = A0I;
                    strArr4[2] = "ZFnmTy5Nmh2EcYlYiSa9Vz9TEA3yApsY";
                    strArr4[5] = "CtxgPYEhgpysDBKYvCBtA2zCEZrEvZYl";
                } else {
                    A0I[3] = "MnMopZnqiJPVeBF4I";
                }
            } else {
                throw new IllegalStateException();
            }
        } else {
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0B() {
        Context context = this.A08.A7U();
        if (context == null) {
            return true;
        }
        Activity A00 = A00(context);
        if (A00 != null) {
            boolean isDestroyed = A00.isDestroyed();
            if (A0I[3].length() != 17) {
                throw new RuntimeException();
            }
            String[] strArr = A0I;
            strArr[2] = "bz230dZZFwB5VtBTUF6Wd1FYETvWTo5q";
            strArr[5] = "SaD2YYriklneEcKSamPXZGVrEiYqxj4X";
            if (isDestroyed) {
                return true;
            }
        }
        return false;
    }

    public final /* synthetic */ C2426qq A0E(DspViewableNode dspViewableNode, C2448rN c2448rN) {
        A0A(dspViewableNode, c2448rN);
        return null;
    }

    public final void A0F() {
        if (this.A00 != null) {
            this.A00.AFq();
        }
        if (this.A01) {
            this.A04.removeCallbacks(this.A0C);
            A07(this.A05.ACf());
        }
        this.A01 = false;
    }

    public final void A0G() {
        if (!this.A01) {
            this.A01 = true;
            this.A04.post(this.A0C);
            if (0 != 0) {
                throw new NullPointerException(A05(10, 5, 69));
            }
        }
    }

    public final void A0H(InterfaceC2445rK interfaceC2445rK) {
        this.A0B.AJu(interfaceC2445rK);
    }

    public final void A0I(InterfaceC2443rI interfaceC2443rI) {
        this.A00 = interfaceC2443rI;
    }
}
