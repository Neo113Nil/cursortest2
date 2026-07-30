package com.instagram.common.viewpoint.core;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.ads.NativeAdLayout;

/* renamed from: com.facebook.ads.redexgen.X.aW, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1457aW extends ImageView {
    public static String[] A0B = {"bxOOFOssooUR0RjZyatL4oOd1ggfHKhR", "plfhpGKDQv9IGhMy4A8hpuBVWtzTu73m", "mlkot9yGvNPR", "TmCHOkbW5b1zt9NPZxI16MTUer5XzrjL", "vWAJRy5Sp9zXb743yVWn2E8zfo", "KypmqauLEfpZtoNpXrgclfphsSGW0tHg", "5jpOR", "IeZIdLyfRFMrKrbxyFHDhs6fILRacDEb"};
    public Handler A00;
    public View.OnLayoutChangeListener A01;
    public ViewTreeObserver.OnScrollChangedListener A02;
    public ImageView A03;
    public boolean A04;
    public final View A05;
    public final NativeAdLayout A06;
    public final AbstractC2004jd A07;
    public final C1839gi A08;
    public final YM A09;
    public final InterfaceC1445aK A0A;

    public C1457aW(C1839gi c1839gi, EnumC1447aM enumC1447aM, AbstractC2004jd abstractC2004jd, View view, YM ym, NativeAdLayout nativeAdLayout, InterfaceC1445aK interfaceC1445aK) {
        super(c1839gi);
        this.A05 = view;
        this.A09 = ym;
        this.A08 = c1839gi;
        this.A06 = nativeAdLayout;
        this.A0A = interfaceC1445aK;
        this.A07 = abstractC2004jd;
        AbstractC1446aL.A02(c1839gi, enumC1447aM);
        A02();
    }

    private int A00(Rect rect) {
        return this.A08.getResources().getDisplayMetrics().widthPixels - rect.left;
    }

    private void A02() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        this.A03 = new ImageView(this.A08);
        this.A03.setImageBitmap(YN.A01(this.A09));
        this.A03.setLayoutParams(layoutParams);
        this.A06.addView(this.A03);
        YB.A0O(this.A03, 4);
        this.A03.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.aR
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1457aW.this.A0C(view);
            }
        });
        this.A00 = new Handler(Looper.getMainLooper());
        this.A01 = new View.OnLayoutChangeListener() { // from class: com.facebook.ads.redexgen.X.aS
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i4, int i9, int i10, int i11, int i12, int i13, int i14) {
                C1457aW.this.A0D(view, i, i4, i9, i10, i11, i12, i13, i14);
            }
        };
        this.A02 = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.facebook.ads.redexgen.X.aT
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                C1457aW.this.A05();
            }
        };
        this.A03.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1456aV(this));
    }

    private void A03() {
        if (this.A01 != null) {
            this.A06.removeOnLayoutChangeListener(this.A01);
            this.A01 = null;
        }
        if (this.A02 != null) {
            ViewTreeObserver viewTreeObserver = this.A06.getViewTreeObserver();
            ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = this.A02;
            if (A0B[1].charAt(24) != 'W') {
                throw new RuntimeException();
            }
            A0B[3] = "RZhHI7oSNBBsQ6jn8HmNiHu90Tl2574S";
            viewTreeObserver.removeOnScrollChangedListener(onScrollChangedListener);
            this.A02 = null;
        }
    }

    private void A04() {
        this.A00.postDelayed(new Runnable() { // from class: com.facebook.ads.redexgen.X.aU
            @Override // java.lang.Runnable
            public final void run() {
                C1457aW.this.A09();
            }
        }, this.A07.A27());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.A03.getLayoutParams();
        Rect rect = new Rect();
        this.A05.getGlobalVisibleRect(rect);
        Rect nativeAdLayoutLocation = new Rect();
        this.A06.getGlobalVisibleRect(nativeAdLayoutLocation);
        layoutParams.leftMargin = rect.left - nativeAdLayoutLocation.left;
        layoutParams.topMargin = rect.top - nativeAdLayoutLocation.top;
        if (rect.left > A00(nativeAdLayoutLocation) / 2) {
            layoutParams.leftMargin = (layoutParams.leftMargin - this.A03.getWidth()) + this.A05.getWidth();
        }
        layoutParams.topMargin += (this.A05.getHeight() - this.A03.getHeight()) / 2;
        this.A03.setLayoutParams(layoutParams);
        YB.A0O(this.A03, 0);
        if (A0B[3].charAt(3) != 'H') {
            throw new RuntimeException();
        }
        A0B[0] = "t5NtMJanNbto08EujsjrDgIQKMRNzNUY";
        this.A03.bringToFront();
        if (!this.A04) {
            this.A04 = true;
            if (A0B[6].length() == 21) {
                throw new RuntimeException();
            }
            A0B[5] = "2KnGvfPknQwZySrVrzkTNTPZBlnzDeA4";
            A04();
        }
    }

    private void A06(int i, int i4) {
        YB.A0O(this.A03, i);
        YB.A0O(this.A05, i4);
    }

    public final void A09() {
        A03();
        A06(8, 0);
        this.A00.removeCallbacksAndMessages(null);
        this.A04 = false;
    }

    public final void A0A() {
        A06(4, 4);
        this.A03.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.aQ
            @Override // java.lang.Runnable
            public final void run() {
                C1457aW.this.A05();
            }
        });
        if (this.A01 != null) {
            this.A06.addOnLayoutChangeListener(this.A01);
        }
        if (this.A02 != null) {
            this.A06.getViewTreeObserver().addOnScrollChangedListener(this.A02);
        }
    }

    public final void A0B() {
        A06(4, 4);
        A05();
    }

    public final /* synthetic */ void A0C(View view) {
        A03();
        this.A0A.ADW(view);
    }

    public final /* synthetic */ void A0D(View view, int i, int i4, int i9, int i10, int i11, int i12, int i13, int i14) {
        A05();
    }
}
