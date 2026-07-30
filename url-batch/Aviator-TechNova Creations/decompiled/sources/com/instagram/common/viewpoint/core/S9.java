package com.instagram.common.viewpoint.core;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.internal.api.AdNativeComponentView;
import java.lang.ref.WeakReference;

/* loaded from: assets/audience_network.dex */
public class S9 extends AbstractC1231eW {
    public static String[] A04 = {"hBf0w5eWi1Spl1ubHLZPwgySyKwDkFls", "R1QfRDzVW3llag6pkWHTLJyFxLfuZYUb", "hIMvI", "VChjXPEjBKz9WEtkkyfZeEDOAtDm6pyS", "ZAoFS", "FLKekHrPvHjWwOMiUj748H2wUl", "P5m22x1ZKo3VUkYY2cMyPktUJxi7JgjH", "Nk3fSWmW4cxCKGmv1zm92qMESviF4Rnt"};
    public final /* synthetic */ View A00;
    public final /* synthetic */ C1455iN A01;
    public final /* synthetic */ C0702Qc A02;
    public final /* synthetic */ boolean A03;

    public S9(C0702Qc c0702Qc, View view, boolean z, C1455iN c1455iN) {
        this.A02 = c0702Qc;
        this.A00 = view;
        this.A03 = z;
        this.A01 = c1455iN;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1231eW
    public final void A00() {
        C0827Uz c0827Uz;
        c0827Uz = this.A02.A0e;
        c0827Uz.A06();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1231eW
    public final void A02() {
        C0827Uz c0827Uz;
        c0827Uz = this.A02.A0e;
        c0827Uz.A0A();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1231eW
    public final void A03() {
        C0827Uz c0827Uz;
        C0827Uz c0827Uz2;
        C1159dL c1159dL;
        C1232eX c1232eX;
        WeakReference weakReference;
        XH xh;
        C0827Uz c0827Uz3;
        C1444iC c1444iC;
        View view;
        View view2;
        C1444iC c1444iC2;
        View view3;
        C1444iC c1444iC3;
        View view4;
        C1444iC c1444iC4;
        EnumC0820Us enumC0820Us;
        C1444iC c1444iC5;
        boolean z;
        C1444iC c1444iC6;
        boolean z2;
        C1444iC c1444iC7;
        boolean z3;
        C1444iC c1444iC8;
        boolean A0q;
        C1444iC c1444iC9;
        EnumC0601Mc enumC0601Mc;
        C1444iC c1444iC10;
        boolean z4;
        C1444iC c1444iC11;
        NativeAdLayout nativeAdLayout;
        C1444iC c1444iC12;
        String str;
        C1444iC c1444iC13;
        C1444iC c1444iC14;
        NativeAdLayout nativeAdLayout2;
        C1444iC c1444iC15;
        WeakReference<C1319fx> weakReference2;
        C1444iC c1444iC16;
        WeakReference weakReference3;
        WeakReference weakReference4;
        C1232eX c1232eX2;
        Drawable drawable;
        C1232eX c1232eX3;
        C0827Uz c0827Uz4;
        C1232eX c1232eX4;
        C0827Uz c0827Uz5;
        c0827Uz = this.A02.A0e;
        c0827Uz.A0B();
        if (U7.A2B(this.A02.A12()) && (this.A00 instanceof AdNativeComponentView)) {
            View adContentsView = ((AdNativeComponentView) this.A00).getAdContentsView();
            if ((adContentsView instanceof C1172dY) && !((C1172dY) adContentsView).A05()) {
                c1232eX4 = this.A02.A0R;
                c1232eX4.A0T();
                c0827Uz5 = this.A02.A0e;
                c0827Uz5.A08();
                return;
            }
        }
        if (this.A03) {
            ImageView imageView = (ImageView) this.A00;
            drawable = this.A02.A01;
            if (drawable == null) {
                c1232eX3 = this.A02.A0R;
                c1232eX3.A0T();
                c0827Uz4 = this.A02.A0e;
                c0827Uz4.A07();
                return;
            }
            C0702Qc.A0f(drawable, imageView);
        }
        c0827Uz2 = this.A02.A0e;
        c1159dL = this.A02.A0c;
        c0827Uz2.A0C(c1159dL, this.A01.A0G());
        c1232eX = this.A02.A0R;
        if (c1232eX != null) {
            c1232eX2 = this.A02.A0R;
            c1232eX2.A0V();
        }
        weakReference = this.A02.A0V;
        if (weakReference != null) {
            weakReference3 = this.A02.A0V;
            if (weakReference3.get() != null) {
                weakReference4 = this.A02.A0V;
                ((AbstractC1231eW) weakReference4.get()).A03();
            }
        }
        xh = this.A02.A0f;
        if (xh.A07()) {
            c0827Uz3 = this.A02.A0e;
            c0827Uz3.A04();
            return;
        }
        this.A02.A0c();
        c1444iC = this.A02.A09;
        if (c1444iC != null) {
            view = this.A02.A04;
            if (view != null) {
                view2 = this.A02.A06;
                if (A04[6].charAt(19) == 'P') {
                    throw new RuntimeException();
                }
                String[] strArr = A04;
                strArr[0] = "XqswFkrS2Yg5WXkyCZy0rAQHDfEy407U";
                strArr[3] = "6zRr91flYJNmh2JhyLNuVxqP1ZintOSM";
                if (view2 != null) {
                    c1444iC2 = this.A02.A09;
                    view3 = this.A02.A04;
                    c1444iC2.A0A(view3);
                    c1444iC3 = this.A02.A09;
                    view4 = this.A02.A06;
                    c1444iC3.A09(view4);
                    c1444iC4 = this.A02.A09;
                    enumC0820Us = this.A02.A0I;
                    c1444iC4.A0E(enumC0820Us);
                    c1444iC5 = this.A02.A09;
                    z = this.A02.A0W;
                    c1444iC5.A0I(z);
                    c1444iC6 = this.A02.A09;
                    z2 = this.A02.A0Z;
                    c1444iC6.A0M(z2);
                    c1444iC7 = this.A02.A09;
                    z3 = this.A02.A0Y;
                    c1444iC7.A0L(z3);
                    c1444iC8 = this.A02.A09;
                    A0q = this.A02.A0q();
                    c1444iC8.A0J(A0q);
                    c1444iC9 = this.A02.A09;
                    enumC0601Mc = this.A02.A08;
                    c1444iC9.A0C(enumC0601Mc);
                    c1444iC10 = this.A02.A09;
                    z4 = this.A02.A0X;
                    c1444iC10.A0K(z4);
                    c1444iC11 = this.A02.A09;
                    nativeAdLayout = this.A02.A07;
                    c1444iC11.A0D(AbstractC0907Ye.A00(nativeAdLayout));
                    c1444iC12 = this.A02.A09;
                    str = this.A02.A0S;
                    c1444iC12.A0F(str);
                    c1444iC13 = this.A02.A09;
                    c1444iC13.A0N(this.A03);
                    c1444iC14 = this.A02.A09;
                    nativeAdLayout2 = this.A02.A07;
                    c1444iC14.A0B(nativeAdLayout2);
                    c1444iC15 = this.A02.A09;
                    weakReference2 = this.A02.A0U;
                    c1444iC15.A0G(weakReference2);
                    c1444iC16 = this.A02.A09;
                    c1444iC16.A03();
                }
            }
        }
    }
}
