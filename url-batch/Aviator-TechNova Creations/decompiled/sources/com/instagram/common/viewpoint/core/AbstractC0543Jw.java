package com.instagram.common.viewpoint.core;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardViewHelper;
import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.io.encoding.Base64;
import okio.Utf8;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.Jw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0543Jw extends AbstractC0993ae implements Wf {
    public static byte[] A0B;
    public static String[] A0C = {"OqBcBxPX2ZziMc2IT6MCTLtQAfN", "zbHyi1ztTRv4YAmmT0P0cBLwkAbgbibY", "SGCBgG4YDDdHsd7wreTLkUhlfmq", "6SoBxKZAX5xZewPuDXqUB5F5Zi6ZkxRk", "Ec2XCBDA1LqSXAKcLbhR3N0Z6X2H9u1y", "7uWZE4LuLIesc8VJARyN", "MrB", "uRKWJ0Ox"};
    public static final int A0D;
    public static final int A0E;
    public static final int A0F;
    public static final int A0G;
    public static final int A0H;
    public static final int A0I;
    public static final int A0J;
    public static final int A0K;
    public static final int A0L;
    public static final int A0M;
    public static final int A0N;
    public static final int A0O;
    public static final int A0P;
    public static final int A0Q;
    public C0545Jy A00;
    public D9 A01;
    public C0354Co A02;
    public CU A03;
    public final Handler A04;
    public final AbstractC1434hy A05;
    public final C0613Mp A06;
    public final InterfaceC0890Xn A07;
    public final AbstractC0950Zv A08;
    public final C0858Wh A09;
    public final AtomicBoolean A0A;

    public static String A0L(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0B, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 98);
        }
        return new String(copyOfRange);
    }

    public static void A0M() {
        A0B = new byte[]{-117, -96, -104, -104, -104, -104, -104, -104, -104, 60, 72, 70, 7, Utf8.REPLACEMENT_BYTE, 58, 60, 62, 59, 72, 72, 68, 7, 58, Base64.padSymbol, 76, 7, 66, 71, 77, 62, 75, 76, 77, 66, 77, 66, 58, 69, 7, 60, 69, 66, 60, 68, 62, Base64.padSymbol, 64, 76, 74, Ascii.VT, 67, 62, 64, 66, Utf8.REPLACEMENT_BYTE, 76, 76, 72, Ascii.VT, 62, 65, 80, Ascii.VT, 70, 75, 81, 66, 79, 80, 81, 70, 81, 70, 62, 73, Ascii.VT, 67, 70, 75, 70, 80, 69, 60, 62, 64, 81, 70, 83, 70, 81, 86, Ascii.ETB, 10, Ascii.FS, 6, Ascii.ETB, 9, 10, 9, 4, Ascii.ESC, Ascii.SO, 9, 10, Ascii.DC4};
    }

    public abstract AbstractC0950Zv A1P(C0997ai c0997ai, C0613Mp c0613Mp, String str);

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final void A1T() {
        LinearLayout linearLayout = new LinearLayout(super.A06.A06());
        linearLayout.setOrientation(1);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        linearLayout.setLayoutParams(layoutParams);
        TextView textView = new TextView(super.A06.A06());
        textView.setText(super.A06.A05().A18());
        textView.setTextColor(-1);
        XP.A0W(textView, true, 24);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(AbstractC0993ae.A0F, 0, AbstractC0993ae.A0F, AbstractC0993ae.A0A);
        textView.setGravity(1);
        textView.setLayoutParams(layoutParams2);
        C0973aK c0973aK = new C0973aK(super.A06.A06());
        c0973aK.setRadius(15);
        XP.A0K(c0973aK, 0);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(A0G, A0G);
        layoutParams3.gravity = 17;
        c0973aK.setLayoutParams(layoutParams3);
        new KZ(c0973aK, super.A06.A06()).A05(A0G, A0G).A07(super.A06.A05().A23().A01());
        TextView textView2 = new TextView(super.A06.A06());
        textView2.setText(String.format(Locale.US, super.A06.A05().A19(), super.A06.A05().A20().A0I().A0F()));
        textView2.setTextColor(-1);
        XP.A0W(textView2, false, 17);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.setMargins(AbstractC0993ae.A0D, AbstractC0993ae.A0A, AbstractC0993ae.A0D, 0);
        textView2.setGravity(1);
        textView2.setLayoutParams(layoutParams4);
        linearLayout.addView(textView);
        linearLayout.addView(c0973aK);
        linearLayout.addView(textView2);
        addView(linearLayout);
        addView(A0I());
        if (this.A05.A2H() && this.A05.A2I()) {
            addView(A00(super.A06.A06(), super.A06.A05(), super.A06.A08(), Z5.A05, super.A06.A0D(), this.A04));
        }
    }

    static {
        A0M();
        A0J = (int) (AbstractC0862Wl.A02 * 48.0f);
        A0I = (int) (AbstractC0862Wl.A02 * 80.0f);
        A0G = (int) (AbstractC0862Wl.A02 * 120.0f);
        A0H = (int) (AbstractC0862Wl.A02 * 128.0f);
        A0O = (int) (AbstractC0862Wl.A02 * 16.0f);
        A0D = (int) (AbstractC0862Wl.A02 * 4.0f);
        A0N = (int) (AbstractC0862Wl.A02 * 44.0f);
        A0L = (int) (AbstractC0862Wl.A02 * 8.0f);
        A0M = (int) (AbstractC0862Wl.A02 * 12.0f);
        A0Q = (int) (AbstractC0862Wl.A02 * 12.0f);
        A0P = (int) (AbstractC0862Wl.A02 * 26.0f);
        A0K = (int) (AbstractC0862Wl.A02 * 10.0f);
        A0E = OP.A02(-1, 77);
        A0F = OP.A02(A0E, 90);
    }

    public AbstractC0543Jw(C0997ai c0997ai, boolean z) {
        super(c0997ai, z);
        this.A04 = new Handler(Looper.getMainLooper());
        this.A0A = new AtomicBoolean(false);
        this.A05 = c0997ai.A05();
        this.A09 = C0858Wh.A00(c0997ai.A06(), this.A05, this);
        this.A06 = this.A05.A20();
        this.A08 = A0J(c0997ai);
        if (this.A05.A1m()) {
            this.A08.setVisibility(8);
        }
        if (this.A05.A1m() && !getAdDataBundle().A20().A0K().A03()) {
            this.A00 = A0K(c0997ai);
        }
        AbstractC0889Xm A0C2 = c0997ai.A0C();
        this.A07 = c0997ai.A0D();
        if (A0C2 != null) {
            A0C2.setLayoutParams(new RelativeLayout.LayoutParams(-1, A0C2.getToolbarHeight()));
            A0C2.setPageDetailsVisible(false);
        }
    }

    private ImageView A0I() {
        ImageView imageView = new ImageView(super.A06.A06());
        imageView.setImageBitmap(Bitmap.createScaledBitmap(XY.A01(XX.NAV_CROSS), AbstractC0993ae.A0C, AbstractC0993ae.A0C, true));
        imageView.setColorFilter(-1);
        GradientDrawable circleBackground = new GradientDrawable();
        circleBackground.setShape(1);
        circleBackground.setColor(Color.parseColor(A0L(0, 9, 6)));
        imageView.setBackground(circleBackground);
        imageView.setPadding(A0K, A0K, A0K, A0K);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.aZ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AbstractC0543Jw.this.A1V(view);
            }
        });
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, AbstractC0993ae.A0G, AbstractC0993ae.A0A, 0);
        layoutParams.addRule(11);
        imageView.setLayoutParams(layoutParams);
        return imageView;
    }

    private AbstractC0950Zv A0J(C0997ai c0997ai) {
        String clickEvent;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        if (this.A05.A1m()) {
            layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        }
        layoutParams.addRule(12);
        if (c0997ai.A05().A0v().equals(A0L(91, 14, 67))) {
            clickEvent = EnumC1181dh.A04.A03();
        } else {
            clickEvent = A0L(9, 37, Opcodes.DNEG);
        }
        AbstractC0950Zv A1P = A1P(c0997ai, this.A06, clickEvent);
        A1P.getCTAButton().getCtaActionHelper().A08(this.A05);
        A1P.getCTAButton().setCreativeAsCtaLoggingHelper(this.A09);
        this.A03 = new CU(A1P, 400, 100, 0);
        XP.A0I(A1P);
        A1P.A0h(c0997ai.A00());
        if (U7.A17(c0997ai.A06())) {
            A1P.A0g();
            if (c0997ai.A0C() != null) {
                c0997ai.A0C().setCTAClickListener(getCtaButton());
            }
        }
        addView(A1P, layoutParams);
        A1P.getCTAButton().A0F(this.A05, c0997ai.A0C());
        return A1P;
    }

    private C0545Jy A0K(C0997ai c0997ai) {
        String A0L2;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        if (c0997ai.A05().A0v().equals(A0L(91, 14, 67))) {
            EnumC1181dh enumC1181dh = EnumC1181dh.A04;
            String[] strArr = A0C;
            if (strArr[0].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            A0C[6] = "";
            A0L2 = enumC1181dh.A03();
        } else {
            A0L2 = A0L(9, 37, Opcodes.DNEG);
        }
        C0545Jy A1Q = A1Q(c0997ai, this.A06, A0L2);
        if (A1Q == null) {
            return null;
        }
        A1Q.getCTAButton().getCtaActionHelper().A08(this.A05);
        A1Q.getCTAButton().setCreativeAsCtaLoggingHelper(this.A09);
        XP.A0I(A1Q);
        A1Q.A0h(c0997ai.A00());
        if (U7.A17(c0997ai.A06())) {
            A1Q.A0g();
            if (c0997ai.A0C() != null) {
                c0997ai.A0C().setCTAClickListener(getCtaButton());
            }
            if (c0997ai.A0B() != null) {
                c0997ai.A0B().setCTAClickListener(getCtaButton());
            }
        }
        A1Q.setLayoutParams(layoutParams);
        A1Q.getCTAButton().A0F(this.A05, c0997ai.A0C());
        return A1Q;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0993ae
    public void A1B() {
        super.A1B();
        this.A04.removeCallbacksAndMessages(null);
        if (this.A05 != null && this.A05.A20().A0L() != null) {
            WX.A06(super.A06.A06().A02(), this.A05.A20().A0L());
        }
        this.A09.A03();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0993ae
    public void A1G(C0613Mp c0613Mp, String str, double d, Bundle bundle) {
        super.A1G(c0613Mp, str, d, bundle);
        this.A08.setInfo(c0613Mp.A0I(), c0613Mp.A0J(), str, this.A05.A23().A01(), super.A06.A09(), null);
        if (this.A00 != null) {
            this.A00.setInfo(c0613Mp.A0I(), c0613Mp.A0J(), str, this.A05.A23().A01(), super.A06.A09(), null);
        }
    }

    public final int A1O(AbstractC0889Xm abstractC0889Xm) {
        return abstractC0889Xm == null ? AbstractC0889Xm.A00 : abstractC0889Xm.getToolbarHeight();
    }

    public C0545Jy A1Q(C0997ai c0997ai, C0613Mp c0613Mp, String str) {
        return null;
    }

    public void A1R() {
        View expandableLayout = getAdDetailsView().getExpandableLayout();
        if (expandableLayout != null) {
            this.A01 = new D9(true, false);
            if (this.A02 != null) {
                this.A01.A0L(this.A02);
            }
            C0622My A01 = this.A05.A1z().A01();
            this.A01.A0L(new CY(getAdDetailsView().getCTAButton(), MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION, -1, A01.A0A(true)));
            Drawable startDrawable = XP.A08(A0E, A0F, A0D);
            this.A01.A0L(new C0355Cp(getAdDetailsView().getCTAButton(), MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION, startDrawable, XP.A05(A01.A09(true), A0D)));
            this.A01.A0L(new CZ(expandableLayout, Opcodes.FCMPG, false));
            this.A01.A0K(2300);
        }
    }

    public final void A1S() {
        LinearLayout linearLayout = new LinearLayout(super.A06.A06());
        linearLayout.setOrientation(1);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        linearLayout.setLayoutParams(layoutParams);
        TextView textView = new TextView(super.A06.A06());
        textView.setText(super.A06.A05().A0z());
        textView.setTextColor(-1);
        XP.A0W(textView, false, 15);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(A0O, A0O, A0O, A0O);
        textView.setGravity(1);
        textView.setLayoutParams(layoutParams2);
        C0967aE c0967aE = new C0967aE(super.A06.A06(), 0, -13524404, XX.REWARD_GRANTED_ICON);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(A0J, A0J);
        layoutParams3.gravity = 17;
        c0967aE.setLayoutParams(layoutParams3);
        linearLayout.addView(c0967aE);
        linearLayout.addView(textView);
        addView(linearLayout);
    }

    public final void A1U(int i, ViewGroup viewGroup, RelativeLayout relativeLayout) {
        if (getAdDetailsView() instanceof KL) {
            if ((getAdDetailsView() instanceof C01915r) || (getAdDetailsView() instanceof C01905q)) {
                XP.A0H(getAdDetailsView());
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                if (getResources().getConfiguration().orientation == 2) {
                    layoutParams.addRule(1, relativeLayout.getId());
                    getAdDetailsView().setLayoutParams(layoutParams);
                    viewGroup.addView(getAdDetailsView());
                } else {
                    addView(getAdDetailsView(), layoutParams);
                }
            }
            getAdDetailsView().A0h(i);
            ((KL) getAdDetailsView()).A0s(viewGroup, relativeLayout, i);
        }
    }

    public final /* synthetic */ void A1V(View view) {
        this.A07.A4b(A0L(46, 45, Opcodes.LSHR));
    }

    public AbstractC1434hy getAdDataBundle() {
        return this.A05;
    }

    public CU getAdDetailsAnimation() {
        return this.A03;
    }

    public AbstractC0950Zv getAdDetailsView() {
        return this.A08;
    }

    public C0613Mp getAdInfo() {
        return this.A06;
    }

    public D9 getAnimationPlugin() {
        return this.A01;
    }

    public AbstractC0950Zv getOldEndCardAdDetailsView() {
        if (this.A00 != null && this.A05.A1m() && !this.A05.A20().A0K().A03()) {
            this.A00.A0i();
        }
        return this.A00;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0993ae, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.A0A.get() && (this.A05.A20().A0K().A02().isEmpty() || this.A05.A20().A0K().A03() || this.A05.A1b())) {
            return;
        }
        getAdDetailsView().A0h(configuration.orientation);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View expandableLayout;
        super.onLayout(z, i, i2, i3, i4);
        if (!this.A05.A20().A0K().A03() && !this.A05.A1b() && !this.A05.A1m() && (expandableLayout = getAdDetailsView().getExpandableLayout()) != null && z && this.A02 == null) {
            this.A02 = new C0354Co(expandableLayout, MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION, expandableLayout.getHeight(), 0);
            this.A01.A0L(this.A02);
            this.A01.A0J();
        }
    }
}
