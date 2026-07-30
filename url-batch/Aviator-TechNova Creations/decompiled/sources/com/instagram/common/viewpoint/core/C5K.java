package com.instagram.common.viewpoint.core;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.core.view.PointerIconCompat;
import com.google.common.base.Ascii;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import okio.Utf8;
import org.json.JSONException;
import org.json.JSONObject;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.5K, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C5K extends FrameLayout implements InterfaceC0891Xo, I3 {
    public static byte[] A0I;
    public static String[] A0J = {"UTx0mthy689a2sWy4JVu0tmbo5tf7DAX", "DpQrJfF4GGVCKG366ycalUQvQmaAeTpv", "eTaJ9UlZkoiVo78onrsfkh8qyWU6l07Y", "ASk", "tRl9yBUHWghtVC3MTlEkON1DGIMHt5L9", "IjjI8eijgHBxehc5IxL2bCSmbEZHlZYm", "ajbOHBl4KDnxYMWXO0J67", "uiq3lL8JcMvDgND3txStxUQziaPHduab"};
    public R0 A00;
    public R6 A01;
    public InterfaceC1077c0 A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final AbstractC1434hy A06;
    public final C1159dL A07;
    public final US A08;
    public final C0802Ua A09;
    public final XC A0A;
    public final XH A0B;
    public final InterfaceC0890Xn A0C;
    public final YY A0D;
    public final C1062bl A0E;
    public final C1070bt A0F;
    public final AbstractC1231eW A0G;
    public final C1232eX A0H;

    public static String A0B(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0I, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 44);
        }
        return new String(copyOfRange);
    }

    public static void A0D() {
        A0I = new byte[]{Ascii.CAN, 47, 47, 50, 47, 125, 62, 47, 56, 60, 41, 52, 51, 58, 125, 62, 50, 51, 59, 52, 58, 125, Ascii.ETB, Ascii.SO, Ascii.DC2, 19, 78, 69, 76, 68, 67, 72, 73, 114, 76, 73, 36, 47, 38, 46, 41, 34, 35, Ascii.CAN, 38, 35, Ascii.CAN, 46, 41, 35, 34, Utf8.REPLACEMENT_BYTE, 46, 37, 44, 36, 35, 40, 41, Ascii.DC2, 44, 41, Ascii.DC2, 57, 34, 57, 44, 33, 91, 80, 89, 81, 86, 93, 92, 103, 76, 81, 85, 93, 103, 75, 72, 93, 86, 76, 35, 44, 41, 35, 43, Ascii.US, 51, 47, 53, 50, 35, 37, 74, 76, 90, 77, 92, 83, 86, 92, 84};
    }

    static {
        A0D();
    }

    public C5K(C1159dL c1159dL, US us, InterfaceC0890Xn interfaceC0890Xn, AbstractC1434hy abstractC1434hy, YY yy, int i) {
        super(c1159dL);
        this.A01 = new C0503Ii(this);
        this.A0G = new C0502Ih(this);
        this.A03 = true;
        this.A07 = c1159dL;
        this.A08 = us;
        this.A0C = interfaceC0890Xn;
        this.A06 = abstractC1434hy;
        this.A0D = yy;
        C1070bt A02 = AbstractC1071bu.A02(abstractC1434hy.A17());
        if (A02 == null) {
            this.A0F = new C1070bt(this.A07, abstractC1434hy, us, i);
            this.A04 = false;
        } else {
            this.A0F = A02;
            this.A04 = true;
        }
        this.A09 = this.A0F.A0K();
        this.A0B = this.A0F.A0L();
        this.A0F.A0c(new C0498Id(this));
        XP.A0E(PointerIconCompat.TYPE_HELP, this.A0F.A0O());
        if (this.A06.A1P()) {
            this.A0E = new C1062bl(this.A07, this.A08, this.A06, new SF(this.A07), this.A09, this.A0C, this.A0D, new C0496Ib(this));
            this.A0E.A0N();
            this.A0F.A0O().setOnTouchListener(new ViewOnTouchListenerC1058bh(this));
            addView(this.A0E, new FrameLayout.LayoutParams(-1, -1));
        } else {
            this.A0E = null;
        }
        ViewGroup mediaView = getMediaView();
        this.A0H = new C1232eX(mediaView, 1, new WeakReference(this.A0G), this.A07);
        this.A0H.A0W(this.A06.A0i());
        this.A0H.A0X(this.A06.A0j());
        this.A0F.A0e(this.A0H);
        this.A0A = new XC(this);
        this.A0A.A05(XB.A02);
        setBackgroundColor(0);
        if (U7.A1u(c1159dL)) {
            c1159dL.A0B().AK4(mediaView, abstractC1434hy.A25(), false, false, true);
        }
        try {
            JSONObject jSONObject = new JSONObject();
            boolean A2C = abstractC1434hy.A2C();
            String A0B = A0B(68, 18, 20);
            String A0B2 = A0B(36, 16, 107);
            String A0B3 = A0B(52, 16, 97);
            String A0B4 = A0B(26, 10, 1);
            if (A2C) {
                jSONObject.put(A0B4, true);
                jSONObject.put(A0B3, 2);
                jSONObject.put(A0B2, 0);
                jSONObject.put(A0B, this.A06.A0o());
            } else if (WR.A05(abstractC1434hy.A0u())) {
                jSONObject.put(A0B4, true);
                jSONObject.put(A0B3, 2);
                jSONObject.put(A0B2, 1);
                jSONObject.put(A0B, this.A06.A0o());
            }
            this.A0F.A0j(jSONObject);
        } catch (JSONException unused) {
            this.A0F.A0M().A04(AbstractC0772Sv.A15, A0B(0, 26, Opcodes.LREM));
        }
    }

    private void A0C() {
        C1110cX A0F = new C1108cV(this.A07, this.A06.A20().A0I(), this.A06.A23()).A0A(this.A06.A1z().A01()).A0F();
        addView(A0F, new FrameLayout.LayoutParams(-1, -1));
        A0F.A04(new IW(this));
    }

    private final void A0E() {
        this.A0F.A0d(this);
        if (!this.A04) {
            this.A07.A0F().A5y();
            this.A0F.A0X();
        } else {
            this.A07.A0F().A5z();
            if (this.A0F.A0k()) {
                AJS();
                if (U7.A1u(this.A07)) {
                    this.A07.A0B().ACx();
                }
            }
        }
        ViewGroup viewGroup = (ViewGroup) this.A0F.A0O().getParent();
        if (viewGroup != null) {
            C1070bt c1070bt = this.A0F;
            String[] strArr = A0J;
            if (strArr[0].charAt(1) != strArr[2].charAt(1)) {
                throw new RuntimeException();
            }
            A0J[6] = "m5i7x933C7hHEFpC39NkE";
            ViewGroup parent = c1070bt.A0O();
            viewGroup.removeView(parent);
        }
        addView(this.A0F.A0O(), new FrameLayout.LayoutParams(-1, -1));
        this.A0C.A3x(this, new RelativeLayout.LayoutParams(-1, -1));
        if (this.A06.A1Q()) {
            this.A0A.A05(XB.A03);
        }
    }

    private void A0F(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        a5 a5Var = new a5(this.A07, this.A0D.A7E(), this.A0H, this.A0B, this.A08, this.A06.A21(), this.A0C);
        HashMap hashMap = new HashMap();
        hashMap.put(A0B(86, 12, 108), A0B(98, 9, 19));
        a5Var.A05(this.A06.A25(), str, hashMap);
    }

    @Override // com.instagram.common.viewpoint.core.I3
    public final void A9X() {
        A0F(this.A06.A20().A0J().A05());
    }

    @Override // com.instagram.common.viewpoint.core.I3
    public final void A9Y(String str) {
        A0F(str);
    }

    @Override // com.instagram.common.viewpoint.core.I3
    public final void A9c() {
        this.A0C.A4b(this.A0D.A6d());
        C1156dI serverSideRewardHandler = new C1156dI(this.A07, this.A0D, this.A06.A1A(), this.A0C);
        serverSideRewardHandler.A05();
    }

    @Override // com.instagram.common.viewpoint.core.I3
    public final void AAd() {
        new Handler(Looper.getMainLooper()).post(new C0495Ia(this));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0891Xo
    public final void AAl(Intent intent, Bundle bundle, R0 r0) {
        C1070bt.A0B().incrementAndGet();
        r0.A0A(this.A01);
        this.A00 = r0;
        A0E();
        if (this.A06.A20().A0W()) {
            A0C();
        } else {
            this.A0F.A0W();
        }
    }

    @Override // com.instagram.common.viewpoint.core.I3
    public final void ADM() {
    }

    @Override // com.instagram.common.viewpoint.core.I3
    public final void ADQ() {
        if (this.A0E != null) {
            this.A0E.A0P();
        }
    }

    @Override // com.instagram.common.viewpoint.core.I3
    public final void AEF(boolean z) {
        if (this.A0E != null) {
            this.A0E.A0R(z);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0891Xo
    public final void AEV(boolean z) {
        if (this.A0E != null) {
            this.A0E.A0S(z);
        }
        if (z) {
            this.A0F.A0Q();
        } else {
            this.A0F.A0T();
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0891Xo
    public final void AF0(boolean z) {
        if (this.A0E != null) {
            this.A0E.A0T(z);
        }
        if (this.A03) {
            this.A03 = false;
        } else if (z) {
            this.A0F.A0P();
        } else {
            this.A0F.A0Y();
        }
    }

    @Override // com.instagram.common.viewpoint.core.I3
    public final void AFG() {
        if (this.A0E != null) {
            this.A0E.A0Q();
        }
    }

    @Override // com.instagram.common.viewpoint.core.I3
    public final void AFn(boolean z) {
        if (this.A0E != null) {
            this.A0E.A0U(z);
        }
    }

    @Override // com.instagram.common.viewpoint.core.I3
    public final void AFp(boolean z) {
        if (this.A0E != null) {
            this.A0E.A0V(z);
        }
    }

    @Override // com.instagram.common.viewpoint.core.I3
    public final void AG4(String str) {
        String urlString = this.A06.A26(str);
        if (urlString == null) {
            return;
        }
        WN.A0O(new WN(), this.A07, WQ.A00(urlString), this.A06.A25());
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0891Xo
    public final void AIB(Bundle bundle) {
    }

    @Override // com.instagram.common.viewpoint.core.I3
    public final void AJS() {
        if (!this.A05) {
            this.A0H.A0U();
            this.A05 = true;
        }
    }

    @Override // com.instagram.common.viewpoint.core.I3
    public final void close() {
        if (this.A00 == null) {
            return;
        }
        this.A00.finish(4);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0891Xo
    public String getCurrentClientToken() {
        return this.A06.A25();
    }

    private ViewGroup getMediaView() {
        if (this.A0E != null) {
            return this.A0E;
        }
        return this.A0F.A0O();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0891Xo
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0891Xo
    public final void onDestroy() {
        if (U7.A1u(this.A07)) {
            this.A07.A0B().AJj(getMediaView());
        }
        C1062bl c1062bl = this.A0E;
        String[] strArr = A0J;
        if (strArr[4].charAt(27) != strArr[5].charAt(27)) {
            throw new RuntimeException();
        }
        A0J[6] = "GZe1biqFkGajjfTMFdC84";
        if (c1062bl != null) {
            this.A0E.A0O();
        }
        this.A0A.A03();
        this.A08.AAt(this.A06.A25(), new C0944Zp().A02(this.A0B).A03(this.A0H).A05());
        this.A01 = null;
        this.A02 = null;
        this.A00 = null;
        AbstractC1071bu.A04(this.A06.A17());
        C1070bt.A0B().decrementAndGet();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        requestDisallowInterceptTouchEvent(true);
        return super.onTouchEvent(motionEvent);
    }

    public void setListener(InterfaceC0890Xn interfaceC0890Xn) {
    }

    public void setRtfActionsJavascriptListener(InterfaceC1077c0 interfaceC1077c0) {
        this.A02 = interfaceC1077c0;
    }
}
