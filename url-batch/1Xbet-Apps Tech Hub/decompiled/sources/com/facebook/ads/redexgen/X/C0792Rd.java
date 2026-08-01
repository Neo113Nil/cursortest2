package com.facebook.ads.redexgen.X;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import java.util.ArrayList;

/* renamed from: com.facebook.ads.redexgen.X.Rd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0792Rd extends FrameLayout implements PY {
    public TextView A00;
    public TextView A01;
    public TextView A02;
    public TextView A03;
    public final MediaView A04;
    public final NativeAd A05;
    public final PZ A06;
    public final ArrayList<View> A07;
    public static String[] A08 = {"LrUXeZd5oXG5wJ7", "S6ePTdxfK6c7yhvbHMQjZqIgQsLDz3QO", "YqVXoEdDoNpK3nL0El5", "Exhg7LXIw6HgSAmcccR052cOKtX3WF", "LN", "59F20xOEewuTmZzPatOKMeF6XI6ZvB1j", "IRBrDKvf2o0dBHWjf99N02m12yrR0Bg7", "KZ90h8EmVWfLUNKv0pT"};
    public static final int A0E = (int) (C0627Ku.A02 * 6.0f);
    public static final int A0D = (int) (C0627Ku.A02 * 8.0f);
    public static final int A0C = (int) (C0627Ku.A02 * 12.0f);
    public static final int A0A = (int) (C0627Ku.A02 * 350.0f);
    public static final int A09 = (int) (C0627Ku.A02 * 250.0f);
    public static final int A0B = (int) (C0627Ku.A02 * 175.0f);

    public C0792Rd(YA ya, NativeAd nativeAd, J6 j6, J7 j7, C0693Ni c0693Ni, MediaView mediaView, AdOptionsView adOptionsView) {
        super(ya);
        ArrayList<View> arrayList = new ArrayList<>();
        this.A07 = arrayList;
        this.A05 = nativeAd;
        this.A04 = mediaView;
        PZ pz = new PZ(ya, nativeAd, j6, c0693Ni, adOptionsView);
        this.A06 = pz;
        int i = A0C;
        pz.setPadding(i, i, i, A0E);
        addView(pz, new FrameLayout.LayoutParams(-1, -2));
        if (j7 == J7.A09 || j7 == J7.A0B) {
            A07(j6);
        }
        addView(mediaView, new FrameLayout.LayoutParams(-1, -2));
        if (j7 != J7.A0B || nativeAd.getAdCreativeType() != NativeAd.AdCreativeType.CAROUSEL) {
            A06(j6);
            A04(j6);
            A05(j6);
        }
        arrayList.add(c0693Ni);
        arrayList.add(mediaView);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int A00() {
        int i;
        int i2;
        TextView textView;
        int i3;
        TextView textView2 = this.A03;
        int titleHeight = 0;
        if (textView2 != null && textView2.getVisibility() == 0) {
            i = this.A03.getMeasuredHeight();
        } else {
            i = 0;
        }
        TextView textView3 = this.A02;
        if (A08[1].charAt(0) == 'k') {
            throw new RuntimeException();
        }
        String[] strArr = A08;
        strArr[6] = "SrhbzBCrZmwJCsE1GN19GBhRpshhKBl4";
        strArr[5] = "lZXGEU0s5y97LRskCQS4IC0Q6rEMlB8o";
        if (textView3 != null) {
            int linkDescHeight = textView3.getVisibility();
            if (linkDescHeight == 0) {
                i2 = this.A02.getMeasuredHeight();
                textView = this.A00;
                if (textView != null) {
                    int linkDescHeight2 = textView.getVisibility();
                    if (linkDescHeight2 == 0) {
                        i3 = this.A00.getMeasuredHeight();
                        TextView textView4 = this.A01;
                        if (A08[1].charAt(0) == 'k') {
                            throw new RuntimeException();
                        }
                        String[] strArr2 = A08;
                        strArr2[6] = "nRuc5lutSXPKh9f7kKzdW2kIhLu3nB9m";
                        strArr2[5] = "FuxAmHJZMOFMUG38wB3yXnFuBZuRMBRE";
                        if (textView4 != null) {
                            int linkDescHeight3 = textView4.getVisibility();
                            if (linkDescHeight3 == 0) {
                                int titleHeight2 = this.A01.getMeasuredHeight();
                                int linkDescHeight4 = A0C;
                                int titleHeight3 = titleHeight2 + linkDescHeight4;
                                int linkDescHeight5 = A0D;
                                titleHeight = titleHeight3 + linkDescHeight5;
                            }
                        }
                        int ctaHeight = getMeasuredHeight();
                        int linkDescHeight6 = this.A06.getMeasuredHeight();
                        return ((((ctaHeight - linkDescHeight6) - i) - i2) - i3) - titleHeight;
                    }
                }
                i3 = 0;
                TextView textView42 = this.A01;
                if (A08[1].charAt(0) == 'k') {
                }
            }
        }
        i2 = 0;
        textView = this.A00;
        if (textView != null) {
        }
        i3 = 0;
        TextView textView422 = this.A01;
        if (A08[1].charAt(0) == 'k') {
        }
    }

    private void A01() {
        TextView textView = this.A03;
        if (textView != null) {
            textView.setLines(1);
        }
        TextView textView2 = this.A02;
        if (textView2 != null) {
            textView2.setLines(1);
        }
        TextView textView3 = this.A00;
        if (textView3 != null) {
            textView3.setLines(1);
        }
    }

    private void A02(int i) {
        LV.A0N(this.A04, i > A0B ? 0 : 8);
        LV.A0N(this.A03, i > A0A ? 0 : 8);
        LV.A0N(this.A00, i <= A09 ? 8 : 0);
    }

    public static void A03(int i, int i2, TextView... textViewArr) {
        for (TextView textView : textViewArr) {
            if (textView != null && textView.getVisibility() == 0) {
                int A04 = LV.A04(textView, i2);
                textView.setLines(A04 + 1);
                textView.measure(i, View.MeasureSpec.makeMeasureSpec(textView.getMeasuredHeight() + (textView.getLineHeight() * A04), 1073741824));
                i2 -= textView.getLineHeight() * A04;
            }
        }
    }

    private void A04(J6 j6) {
        if (this.A05.getAdBodyText() != null && !this.A05.getAdBodyText().trim().isEmpty()) {
            TextView textView = new TextView(getContext());
            this.A00 = textView;
            j6.A06(textView);
            this.A00.setText(this.A05.getAdBodyText());
            TextView textView2 = this.A00;
            int i = A0C;
            textView2.setPadding(i, 0, i, 0);
            addView(this.A00, new FrameLayout.LayoutParams(-1, -2));
        }
    }

    private void A05(J6 j6) {
        if (this.A05.hasCallToAction()) {
            TextView textView = new TextView(getContext());
            this.A01 = textView;
            LV.A0K(textView);
            j6.A05(this.A01);
            this.A01.setText(this.A05.getAdCallToAction());
            TextView textView2 = this.A01;
            int i = A0D;
            textView2.setPadding(i, i, i, i);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(i, 0, i, 0);
            addView(this.A01, layoutParams);
            this.A07.add(this.A01);
        }
    }

    private void A06(J6 j6) {
        if (this.A05.getAdHeadline() != null && !this.A05.getAdHeadline().trim().isEmpty()) {
            TextView textView = new TextView(getContext());
            this.A02 = textView;
            j6.A07(textView);
            this.A02.setText(this.A05.getAdHeadline());
            TextView textView2 = this.A02;
            int i = A0C;
            textView2.setPadding(i, A0D, i, 0);
            addView(this.A02, new FrameLayout.LayoutParams(-1, -2));
        }
    }

    private void A07(J6 j6) {
        if (this.A05.getAdLinkDescription() != null && !this.A05.getAdLinkDescription().trim().isEmpty()) {
            TextView textView = new TextView(getContext());
            this.A03 = textView;
            j6.A06(textView);
            this.A03.setText(this.A05.getAdLinkDescription());
            TextView textView2 = this.A03;
            int i = A0C;
            textView2.setPadding(i, 0, i, A0D);
            addView(this.A03, new FrameLayout.LayoutParams(-1, -2));
        }
    }

    @Override // com.facebook.ads.redexgen.X.PY
    public View getView() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.X.PY
    public ArrayList<View> getViewsForInteraction() {
        return this.A07;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        PZ pz = this.A06;
        int top = pz.getMeasuredHeight();
        pz.layout(i, i2, i3, top + i2);
        int top2 = this.A06.getMeasuredHeight();
        int i5 = i2 + top2;
        TextView textView = this.A03;
        if (textView != null) {
            int top3 = textView.getVisibility();
            if (top3 == 0) {
                int measuredHeight = this.A03.getMeasuredHeight();
                int top4 = i5 + measuredHeight;
                this.A03.layout(i, i5, i3, top4);
                i5 += measuredHeight;
            }
        }
        MediaView mediaView = this.A04;
        int top5 = mediaView.getMeasuredHeight();
        mediaView.layout(i, i5, i3, top5 + i5);
        int top6 = this.A04.getMeasuredHeight();
        int i6 = i5 + top6;
        TextView textView2 = this.A02;
        if (textView2 != null) {
            int top7 = textView2.getMeasuredHeight();
            textView2.layout(i, i6, i3, top7 + i6);
            int top8 = this.A02.getMeasuredHeight();
            i6 += top8;
        }
        TextView textView3 = this.A00;
        if (textView3 != null) {
            int top9 = textView3.getVisibility();
            if (top9 == 0) {
                TextView textView4 = this.A00;
                if (A08[1].charAt(0) == 'k') {
                    throw new RuntimeException();
                }
                A08[3] = "gjv6mmFqHT0";
                int top10 = textView4.getMeasuredHeight();
                textView4.layout(i, i6, i3, top10 + i6);
            }
        }
        TextView textView5 = this.A01;
        if (textView5 != null) {
            int i7 = A0C;
            int top11 = textView5.getMeasuredHeight();
            textView5.layout(i + i7, (i4 - top11) - i7, i3 - i7, i4 - i7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        int emptySpace;
        A02(View.MeasureSpec.getSize(i2));
        A01();
        super.onMeasure(i, i2);
        int requiredHeight = A00();
        int emptySpace2 = this.A04.getMediaWidth();
        if (emptySpace2 != 0) {
            int emptySpace3 = this.A04.getMediaHeight();
            if (emptySpace3 != 0) {
                if (((C0971Ye) this.A04.getMediaViewApi()).A0N()) {
                    emptySpace = requiredHeight;
                } else {
                    int emptySpace4 = this.A04.getMediaHeight();
                    float f = emptySpace4;
                    int emptySpace5 = this.A04.getMediaWidth();
                    float aspectRatio = f / emptySpace5;
                    int emptySpace6 = this.A04.getMeasuredWidth();
                    emptySpace = Math.min((int) (emptySpace6 * aspectRatio), requiredHeight);
                }
                MediaView mediaView = this.A04;
                int mediaViewHeight = View.MeasureSpec.makeMeasureSpec(emptySpace, 1073741824);
                mediaView.measure(i, mediaViewHeight);
                if (emptySpace >= requiredHeight) {
                    A03(i, requiredHeight - emptySpace, this.A02, this.A00, this.A03);
                    return;
                }
                return;
            }
        }
        emptySpace = requiredHeight;
        MediaView mediaView2 = this.A04;
        int mediaViewHeight2 = View.MeasureSpec.makeMeasureSpec(emptySpace, 1073741824);
        mediaView2.measure(i, mediaViewHeight2);
        if (emptySpace >= requiredHeight) {
        }
    }

    @Override // com.facebook.ads.redexgen.X.PY
    public final void unregisterView() {
        this.A05.unregisterView();
    }
}
