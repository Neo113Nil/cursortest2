package com.instagram.common.viewpoint.core;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.cp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1128cp extends FrameLayout {
    public static final int A08 = (int) (AbstractC0862Wl.A02 * 16.0f);
    public C01985y A00;
    public EG A01;
    public C01303i A02;
    public D1 A03;
    public C01112p A04;
    public C2R A05;
    public final C1159dL A06;
    public final C0802Ua A07;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 12 out of bounds for length 12
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final void A04(US us, String str, Map<String, String> map) {
        A02();
        this.A02 = new C01303i(this.A06, us, this.A00, str, null, map);
        if (U7.A1v(this.A06)) {
            this.A01 = new EG(this.A06, us, this.A00, str, false, this.A02, map);
        } else {
            this.A01 = null;
        }
    }

    public C1128cp(C1159dL c1159dL, C0802Ua c0802Ua) {
        super(c1159dL);
        this.A07 = c0802Ua;
        this.A06 = c1159dL;
        setUpView(c1159dL);
    }

    public final void A01() {
        A0l(true, 10);
    }

    public final void A02() {
        if (this.A01 != null) {
            this.A01.A07();
            this.A01 = null;
        }
        if (this.A02 != null) {
            this.A02.A0p();
            this.A02 = null;
        }
    }

    public final void A03(AbstractC0782Tf abstractC0782Tf) {
        getEventBus().A05(abstractC0782Tf);
    }

    public final void A05(EnumC1175db enumC1175db) {
        A0h(enumC1175db, 13);
    }

    public final boolean A06() {
        return A0s();
    }

    public E1 getSimpleVideoView() {
        return this.A00;
    }

    public float getVolume() {
        return getVolume();
    }

    public void setPlaceholderUrl(String str) {
        this.A04.setImage(str);
    }

    private void setUpPlugins(C1159dL c1159dL) {
        A0b();
        this.A04 = new C01112p(c1159dL);
        A0i(this.A04);
        this.A03 = new D1(c1159dL, this.A07);
        A0i(new C3D(c1159dL));
        A0i(this.A03);
        this.A05 = new C2R(c1159dL, true, this.A07);
        A0i(this.A05);
        A0i(new D4(this.A05, EnumC1190dr.A02, true, true));
        if (!A0n()) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(11);
        layoutParams.setMargins(A08, A08, A08, A08);
        this.A03.setLayoutParams(layoutParams);
        addView(this.A03);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.ads.redexgen.X.5y] */
    private void setUpVideo(final C1159dL c1159dL) {
        this.A00 = new E1(c1159dL) { // from class: com.facebook.ads.redexgen.X.5y
            @Override // android.widget.RelativeLayout, android.view.View
            public final void onMeasure(int i, int i2) {
                int newWidthSpec = View.MeasureSpec.getMode(i);
                if (newWidthSpec == 1073741824) {
                    i2 = i;
                } else {
                    int newWidthSpec2 = View.MeasureSpec.getMode(i2);
                    if (newWidthSpec2 == 1073741824) {
                        i = i2;
                    }
                }
                super.onMeasure(i, i2);
            }
        };
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        XP.A0I(this.A00);
        addView(this.A00);
        setOnClickListener(new ViewOnClickListenerC1127co(this));
    }

    private void setUpView(C1159dL c1159dL) {
        setUpVideo(c1159dL);
        setUpPlugins(c1159dL);
    }

    public void setVideoURI(String str) {
        setVideoURI(str);
    }

    public void setVolume(float f) {
        setVolume(f);
        this.A03.A09();
    }
}
