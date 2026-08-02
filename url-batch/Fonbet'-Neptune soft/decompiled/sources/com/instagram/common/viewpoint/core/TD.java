package com.instagram.common.viewpoint.core;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import com.facebook.ads.MediaViewVideoRenderer;
import com.facebook.ads.internal.api.DefaultMediaViewVideoRendererApi;
import com.facebook.ads.internal.api.MediaViewVideoRendererApi;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.google.common.base.Ascii;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.io.encoding.Base64;
import okio.Utf8;

/* loaded from: assets/audience_network.dex */
public final class TD extends R8 implements DefaultMediaViewVideoRendererApi {
    public static byte[] A0F;
    public static String[] A0G = {"gicLODNc4Ss02ASp0SH6jYH1jReGCf7D", "ud1g41PfTpgHVgN2zMRJY9l5AGp7t", "qgXpVhlOa1wHLevNk8n", "YvRZAMwcrsdunGxdPmTtNWzK4vSRpQc4", "eiRiwAROr6ki2Hau4nBgoUP0cJGv3yGG", "AknM7mKZVSENDtzyALrGWQlwPvra0WAt", "RqySj6gASebQYnIOdgQzgXbIWVvFlmni", "rcToBCOkHOudlFUS35924ELLk4KD1"};
    public static final String A0H;
    public MediaViewVideoRenderer A00;
    public C1153dL A01;
    public InterfaceC0806Uk A02;
    public AnonymousClass64 A04;
    public C01052p A05;
    public C2Z A06;
    public AbstractC1225eW A07;
    public C1226eX A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final InterfaceC1165dX A0C = new UW(this);
    public final AtomicBoolean A0D = new AtomicBoolean(false);
    public final AtomicBoolean A0E = new AtomicBoolean(false);
    public EnumC0816Uu A03 = EnumC0816Uu.A03;

    public static String A06(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0F, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 77);
        }
        return new String(copyOfRange);
    }

    public static void A0E() {
        A0F = new byte[]{Ascii.VT, 44, 52, 35, 46, 43, 38, 98, 48, 39, 44, 38, 39, 48, 39, 48, 98, 33, 42, 43, 46, 38, 98, 33, 45, 44, 36, 43, 37, 108, 7, 47, 46, 35, 43, Ascii.FS, 35, 47, Base64.padSymbol, Ascii.FS, 35, 46, 47, 37, 106, 35, 57, 106, 36, Utf8.REPLACEMENT_BYTE, 38, 38, 113, 106, Utf8.REPLACEMENT_BYTE, 36, 43, 40, 38, 47, 106, 62, 37, 106, 44, 35, 36, 46, 106, 35, 62, 100, 122, 65, 78, 77, 67, 74, Ascii.SI, 91, 64, Ascii.SI, 73, 70, 65, 75, Ascii.SI, 98, 74, 75, 70, 78, 121, 70, 74, 88, 121, 70, 75, 74, 64, Ascii.SI, 76, 71, 70, 67, 75, 1};
    }

    static {
        A0E();
        A0H = TD.class.getSimpleName();
    }

    private UD A00(MediaViewVideoRendererApi mediaViewVideoRendererApi) {
        return new UD(this, mediaViewVideoRendererApi);
    }

    private U2 A01(MediaViewVideoRendererApi mediaViewVideoRendererApi) {
        return new U2(this, mediaViewVideoRendererApi);
    }

    private C0786Tq A02() {
        return new C0786Tq(this);
    }

    private C1226eX A05() {
        return new C1226eX(this.A00, 50, true, new WeakReference(this.A07), this.A01);
    }

    private void A09() {
        if (this.A04 != null) {
            AnonymousClass64 anonymousClass64 = this.A04;
            if (A0G[6].charAt(16) != 'd') {
                throw new RuntimeException();
            }
            A0G[5] = "Ntv0Vby76dSesAjQjgB6ptCIElpzOEzL";
            ((C1166dY) anonymousClass64.getVideoView()).setViewImplInflationListener(this.A0C);
        }
    }

    private void A0A() {
        if (this.A04 != null) {
            this.A04.getVideoView().setOnTouchListener(new ViewOnTouchListenerC0805Uj(this));
        }
    }

    private void A0B() {
        if (this.A04 != null) {
            ((C1166dY) this.A04.getVideoView()).setViewImplInflationListener(null);
        }
    }

    private void A0C() {
        if (this.A00.getVisibility() == 0 && this.A09 && this.A00.hasWindowFocus()) {
            this.A08.A0U();
            return;
        }
        if (this.A04 != null) {
            EnumC1223eU state = this.A04.getState();
            String[] strArr = A0G;
            if (strArr[7].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            A0G[4] = "z79LrkWpr7afRwAllWq14kp6jWBswbkV";
            if (state == EnumC1223eU.A05) {
                this.A0B = true;
            }
        }
        this.A08.A0V();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D() {
        this.A03 = EnumC0816Uu.A03;
        A0B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0I(C0696Qc c0696Qc, InterfaceC0806Uk interfaceC0806Uk) {
        String str;
        this.A0A = false;
        this.A0B = false;
        this.A02 = interfaceC0806Uk;
        A09();
        C01052p c01052p = this.A05;
        if (c0696Qc != null && c0696Qc.getAdCoverImage() != null) {
            C0811Up adCoverImage = c0696Qc.getAdCoverImage();
            String[] strArr = A0G;
            if (strArr[0].charAt(7) != strArr[3].charAt(7)) {
                throw new RuntimeException();
            }
            A0G[5] = "TnDtOWvYiNMfLmp09Wf7ctnD5adJ0dsa";
            str = adCoverImage.getUrl();
        } else {
            str = null;
        }
        c01052p.setImage(str, new C0791Tv(this));
        this.A03 = c0696Qc.A19();
        this.A06.setPlayAccessibilityLabel(c0696Qc.A1F());
        this.A06.setPauseAccessibilityLabel(c0696Qc.A1E());
        this.A08.A0U();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0J(EnumC1169db enumC1169db) {
        if (this.A04 != null) {
            this.A04.A0h(enumC1169db, 24);
        } else {
            if (!AdInternalSettings.isDebugBuild()) {
                return;
            }
            Log.e(A0H, A06(30, 42, 7));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0K() {
        if (this.A04 == null || this.A04.getState() == EnumC1223eU.A06) {
            return false;
        }
        return this.A03 == EnumC0816Uu.A05 || this.A03 == EnumC0816Uu.A03;
    }

    @Override // com.facebook.ads.internal.api.DefaultMediaViewVideoRendererApi
    public final void initialize(Context context, MediaViewVideoRenderer mediaViewVideoRenderer, MediaViewVideoRendererApi mediaViewVideoRendererApi, int i) {
        InterfaceC0808Um A01;
        ((R8) mediaViewVideoRendererApi.getAdComponentViewApi()).A00(this);
        switch (i) {
            case 0:
                A01 = A01(mediaViewVideoRendererApi);
                break;
            case 1:
                A01 = A00(mediaViewVideoRendererApi);
                break;
            default:
                throw new IllegalArgumentException(A06(0, 30, 15));
        }
        ((RH) mediaViewVideoRendererApi).A06(A01);
        this.A01 = RB.A03(context);
        this.A00 = mediaViewVideoRenderer;
        this.A05 = new C01052p(this.A01);
        this.A07 = A02();
        this.A08 = A05();
        float density = AbstractC0856Wl.A02;
        int bigPadding = (int) (2.0f * density);
        int smallPadding = (int) (25.0f * density);
        this.A06 = new C2Z(this.A01);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(9);
        layoutParams.addRule(12);
        this.A06.setPadding(bigPadding, smallPadding, smallPadding, bigPadding);
        this.A06.setLayoutParams(layoutParams);
        int i2 = 0;
        while (true) {
            int i3 = this.A00.getChildCount();
            if (A0G[2].length() == 26) {
                throw new RuntimeException();
            }
            A0G[6] = "7BCad5LO6te39ERddnjUHTKJR8zzbght";
            if (i2 < i3) {
                View childAt = this.A00.getChildAt(0);
                if (childAt instanceof AnonymousClass64) {
                    this.A04 = (AnonymousClass64) childAt;
                } else {
                    i2++;
                }
            }
        }
        if (this.A04 == null) {
            if (AdInternalSettings.isDebugBuild()) {
                Log.e(A0H, A06(72, 36, 98));
            }
        } else {
            this.A04.A0i(this.A05);
            AnonymousClass64 anonymousClass64 = this.A04;
            C2Z c2z = this.A06;
            String[] strArr = A0G;
            if (strArr[0].charAt(7) != strArr[3].charAt(7)) {
                anonymousClass64.A0i(c2z);
            } else {
                A0G[5] = "Z21owOXIiAfqNY46KReygSjUmuqXSFx4";
                anonymousClass64.A0i(c2z);
            }
        }
        this.A08.A0W(0);
        this.A08.A0X(250);
        A01.AIk();
    }

    @Override // com.instagram.common.viewpoint.core.R8, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A09 = true;
        A0C();
    }

    @Override // com.instagram.common.viewpoint.core.R8, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A09 = false;
        A0C();
    }

    @Override // com.facebook.ads.internal.api.DefaultMediaViewVideoRendererApi
    public final void onPrepared() {
        boolean A0s = U7.A0s(this.A01);
        this.A00.setOnTouchListener(new ViewOnTouchListenerC0804Ui(this, A0s));
        if (!A0s) {
            A0A();
        }
    }

    @Override // com.instagram.common.viewpoint.core.R8, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        A0C();
    }

    @Override // com.instagram.common.viewpoint.core.R8, com.facebook.ads.internal.api.AdComponentView
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        A0C();
    }
}
