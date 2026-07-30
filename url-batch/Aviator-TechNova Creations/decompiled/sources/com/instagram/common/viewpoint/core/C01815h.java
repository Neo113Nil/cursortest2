package com.instagram.common.viewpoint.core;

import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.5h, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C01815h extends AbstractC0512Ir {
    public YM A00;
    public InterfaceC1048bX A01;
    public C1128cp A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public RelativeLayout A06;
    public FH A07;
    public final C1159dL A08;
    public final DX A09;
    public final DR A0A;
    public final DP A0B;
    public final DN A0C;
    public final DE A0D;
    public final String A0E;
    public final Paint A0F;
    public final Path A0G;
    public final RectF A0H;
    public final C0997ai A0I;
    public static String[] A0J = {"MpRqvkZj1q70y", "JmeA7cKwz52Cf66UfzrPr0LMRH4SYAx7", "6sdDVsKAMYqDcEUPGSGZSzHS1QCr5tGd", "kTGZxaoWJV94XtNMqSwvdL", "Mc6tnSsqpweEwwZBrEzxWewdD5U0ZBnH", "pH8A6EuZ6tOwC2LEaYgoPeYfMAE", "hIXMP87egv28CzL5Z81pRvvAccgq29VA", "kjeLkimcHFb7T02SebLVQF"};
    public static final int A0L = (int) (AbstractC0862Wl.A02 * 0.0f);
    public static final int A0M = (int) (AbstractC0862Wl.A02 * 9.0f);
    public static final int A0K = (int) (AbstractC0862Wl.A02 * 9.0f);

    public C01815h(C0997ai c0997ai, boolean z, String str, FH fh) {
        super(c0997ai, z);
        this.A0G = new Path();
        this.A0H = new RectF();
        this.A0D = new DE() { // from class: com.facebook.ads.redexgen.X.5o
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.instagram.common.viewpoint.core.AbstractC0782Tf
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(DF df) {
                if (C01815h.this.getVideoView() != null) {
                    C01815h.this.A07.A0P().setVolume(C01815h.this.getVideoView().getVolume());
                }
            }
        };
        this.A09 = new DX() { // from class: com.facebook.ads.redexgen.X.5m
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.instagram.common.viewpoint.core.AbstractC0782Tf
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C01253d c01253d) {
                C01815h.this.A01();
                Object tag = C01815h.this.getTag(-1593835536);
                if (tag != null) {
                    C01815h.this.A07.A0N().AFc(((Integer) tag).intValue());
                }
            }
        };
        this.A0B = new DP() { // from class: com.facebook.ads.redexgen.X.5l
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.instagram.common.viewpoint.core.AbstractC0782Tf
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(DQ dq) {
                C01815h.this.A00();
                C01815h.this.A07.A0O().AFo(C01815h.this);
            }
        };
        this.A0A = new DR() { // from class: com.facebook.ads.redexgen.X.5k
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.instagram.common.viewpoint.core.AbstractC0782Tf
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C3Y c3y) {
                C01815h.this.A01();
                C01815h.this.A07.A0O().AFm(C01815h.this);
            }
        };
        this.A0C = new DN() { // from class: com.facebook.ads.redexgen.X.5i
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.instagram.common.viewpoint.core.AbstractC0782Tf
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(DO r3) {
                C01815h.this.A05 = true;
                C01815h.this.A02();
            }
        };
        this.A0I = c0997ai;
        this.A07 = fh;
        this.A0E = str;
        this.A08 = c0997ai.A06();
        setGravity(17);
        setPadding(A0L, 0, A0L, A0L);
        XP.A0K(this, 0);
        setUpView(this.A08);
        this.A0F = new Paint();
        this.A0F.setColor(ViewCompat.MEASURED_STATE_MASK);
        this.A0F.setStyle(Paint.Style.FILL);
        this.A0F.setAlpha(16);
        this.A0F.setAntiAlias(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A00() {
        if (this.A0I.A0F() != null && this.A02 != null) {
            C0362Cw A0F = this.A0I.A0F();
            E1 simpleVideoView = this.A02.getSimpleVideoView();
            if (A0J[2].charAt(30) != 'G') {
                throw new RuntimeException();
            }
            String[] strArr = A0J;
            strArr[6] = "7Tm7E6hvxl2lrINlaGqN4b4kJs9I709m";
            strArr[1] = "njm7q4dCrj2NJr9FsCrNNlLowJdEGDJD";
            A0F.AAm(simpleVideoView);
            if (U7.A2E(getContext())) {
                this.A0I.A0F().A09(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A01() {
        if (this.A0I.A0F() != null) {
            this.A0I.A0F().A06();
            if (this.A02 != null) {
                this.A0I.A0F().AJk(this.A02.getSimpleVideoView());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if (r3 == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void A02() {
        if (this.A01 == null) {
            return;
        }
        if (A1T()) {
            boolean z = this.A05;
            if (A0J[4].charAt(16) == 'S') {
                throw new RuntimeException();
            }
            A0J[4] = "H2PvwmHOgvOi5klEuL8elNjNTBtJADxS";
        }
        if (A1T() || !this.A04) {
            return;
        }
        this.A01.ACO();
    }

    private void A03(View view) {
        RelativeLayout.LayoutParams layoutParams;
        if (view == null || (layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams()) == null) {
            return;
        }
        layoutParams.addRule(13, -1);
        view.setLayoutParams(layoutParams);
    }

    public static void A04(View view) {
        view.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        XP.A0I(view);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0993ae
    public final boolean A0C() {
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0993ae
    public final boolean A1M() {
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0512Ir
    public final void A1P() {
        if (A1T() && this.A02 != null) {
            C1128cp c1128cp = this.A02;
            if (A0J[4].charAt(16) == 'S') {
                throw new RuntimeException();
            }
            String[] strArr = A0J;
            strArr[0] = "PPsdw83Xwgr8n";
            strArr[5] = "5ciU0wOzbld7CiHKSmuHpDfStOE";
            c1128cp.A01();
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0512Ir
    public final void A1Q() {
        if (A1T()) {
            A1R();
            if (this.A02 != null) {
                this.A02.A05(EnumC1175db.A02);
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0512Ir
    public final void A1R() {
        float volume = this.A07.A0P().getVolume();
        if (!A1T() || this.A02 == null) {
            return;
        }
        float newVolume = this.A02.getVolume();
        if (volume != newVolume) {
            this.A02.setVolume(volume);
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0512Ir
    public final boolean A1S() {
        return A1T() && this.A02 != null && this.A02.A06();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0512Ir
    public final boolean A1T() {
        return this.A03;
    }

    public final void A1U(Map<String, String> extraParams) {
        if (this.A02 != null) {
            this.A02.A02();
            if (A1T()) {
                this.A02.A04(getAdEventManager(), this.A0E, extraParams);
            }
        }
    }

    public final C1128cp getVideoView() {
        return this.A02;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0993ae, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        this.A0G.reset();
        this.A0H.set(0.0f, 0.0f, getWidth(), getHeight());
        int i = 0;
        int radius = getResources().getConfiguration().orientation;
        boolean z = radius == 1;
        if (z) {
            i = A0K;
        }
        this.A0G.addRoundRect(this.A0H, i, i, Path.Direction.CW);
        canvas.drawPath(this.A0G, this.A0F);
        RectF rectF = this.A0H;
        int radius2 = A0L;
        float f = radius2;
        int width = getWidth();
        int radius3 = A0L;
        float f2 = width - radius3;
        int height = getHeight();
        int radius4 = A0L;
        rectF.set(f, 0.0f, f2, height - radius4);
        if (z) {
            i = A0M;
        }
        this.A0G.addRoundRect(this.A0H, i, i, Path.Direction.CW);
        canvas.clipPath(this.A0G);
        super.onDraw(canvas);
    }

    public void setCTAInfo(C0623Mz c0623Mz, Map<String, String> extraData) {
        getCtaButton().setCta(c0623Mz, this.A0E, extraData);
    }

    public void setImageUrl(String str) {
        if (this.A00 != null) {
            this.A00.setVisibility(0);
            new KZ(this.A00, this.A08).A04().A06(new K0(this)).A07(str);
        }
        if (this.A02 != null) {
            this.A02.setVisibility(8);
        }
    }

    public void setIsVideo(boolean z) {
        this.A03 = z;
    }

    public void setOnAssetsLoadedListener(InterfaceC1048bX interfaceC1048bX) {
        this.A01 = interfaceC1048bX;
    }

    public void setUpImageView(C1159dL c1159dL) {
        this.A00 = new YM(c1159dL);
        if (U7.A1I(c1159dL)) {
            AbstractC0947Zs.A00(this.A00, U7.A1J(c1159dL), new ViewOnClickListenerC0965aC(this));
        }
        A04(this.A00);
    }

    public void setUpMediaContainer(C1159dL c1159dL) {
        this.A06 = new RelativeLayout(c1159dL);
        A04(this.A06);
        if (this.A00 != null) {
            this.A06.addView(this.A00);
            A03(this.A00);
        }
        if (this.A02 != null) {
            this.A06.addView(this.A02);
            A03(this.A02);
        }
        addView(this.A06);
    }

    public void setUpVideoView(C1159dL c1159dL) {
        this.A02 = new C1128cp(c1159dL, new C0802Ua(this.A0E, getAdEventManager()));
        if (U7.A1K(c1159dL)) {
            AbstractC0947Zs.A00(this.A02, U7.A1L(c1159dL), new ViewOnClickListenerC0966aD(this));
        }
        C1128cp c1128cp = this.A02;
        if (A0J[2].charAt(30) != 'G') {
            throw new RuntimeException();
        }
        A0J[4] = "tNSgYVifT5FMSy2OwNBjuNxtKDkDnPPF";
        A04(c1128cp);
    }

    private void setUpView(C1159dL c1159dL) {
        setUpImageView(c1159dL);
        setUpVideoView(c1159dL);
        setUpMediaContainer(c1159dL);
    }

    public void setVideoPlaceholderUrl(String str) {
        if (this.A02 != null) {
            this.A02.setPlaceholderUrl(str);
        }
    }

    public void setVideoUrl(String str) {
        if (this.A00 != null) {
            this.A00.setVisibility(8);
        }
        C1128cp c1128cp = this.A02;
        String[] strArr = A0J;
        if (strArr[6].charAt(10) != strArr[1].charAt(10)) {
            throw new RuntimeException();
        }
        A0J[2] = "Key351avhXFGNIES0xzUdjVz8AR1nkGO";
        if (c1128cp != null) {
            this.A02.setVisibility(0);
            this.A02.setVideoURI(str);
            this.A02.A03(this.A0D);
            this.A02.A03(this.A09);
            this.A02.A03(this.A0B);
            this.A02.A03(this.A0A);
            this.A02.A03(this.A0C);
        }
    }
}
