package com.instagram.common.viewpoint.core;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.internal.api.AdNativeComponentView;
import java.lang.ref.WeakReference;

/* loaded from: assets/audience_network.dex */
public class S9 extends AbstractC1225eW {
    public static String[] A04 = {"hBf0w5eWi1Spl1ubHLZPwgySyKwDkFls", "R1QfRDzVW3llag6pkWHTLJyFxLfuZYUb", "hIMvI", "VChjXPEjBKz9WEtkkyfZeEDOAtDm6pyS", "ZAoFS", "FLKekHrPvHjWwOMiUj748H2wUl", "P5m22x1ZKo3VUkYY2cMyPktUJxi7JgjH", "Nk3fSWmW4cxCKGmv1zm92qMESviF4Rnt"};
    public final /* synthetic */ View A00;
    public final /* synthetic */ C1449iN A01;
    public final /* synthetic */ C0696Qc A02;
    public final /* synthetic */ boolean A03;

    public S9(C0696Qc c0696Qc, View view, boolean z, C1449iN c1449iN) {
        this.A02 = c0696Qc;
        this.A00 = view;
        this.A03 = z;
        this.A01 = c1449iN;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1225eW
    public final void A00() {
        C0821Uz c0821Uz;
        c0821Uz = this.A02.A0e;
        c0821Uz.A06();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1225eW
    public final void A02() {
        C0821Uz c0821Uz;
        c0821Uz = this.A02.A0e;
        c0821Uz.A0A();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1225eW
    public final void A03() {
        C0821Uz c0821Uz;
        C0821Uz c0821Uz2;
        C1153dL c1153dL;
        C1226eX c1226eX;
        WeakReference weakReference;
        XH xh;
        C0821Uz c0821Uz3;
        C1438iC c1438iC;
        View view;
        View view2;
        C1438iC c1438iC2;
        View view3;
        C1438iC c1438iC3;
        View view4;
        C1438iC c1438iC4;
        EnumC0814Us enumC0814Us;
        C1438iC c1438iC5;
        boolean z;
        C1438iC c1438iC6;
        boolean z2;
        C1438iC c1438iC7;
        boolean z3;
        C1438iC c1438iC8;
        boolean A0q;
        C1438iC c1438iC9;
        EnumC0595Mc enumC0595Mc;
        C1438iC c1438iC10;
        boolean z4;
        C1438iC c1438iC11;
        NativeAdLayout nativeAdLayout;
        C1438iC c1438iC12;
        String str;
        C1438iC c1438iC13;
        C1438iC c1438iC14;
        NativeAdLayout nativeAdLayout2;
        C1438iC c1438iC15;
        WeakReference<C1313fx> weakReference2;
        C1438iC c1438iC16;
        WeakReference weakReference3;
        WeakReference weakReference4;
        C1226eX c1226eX2;
        Drawable drawable;
        C1226eX c1226eX3;
        C0821Uz c0821Uz4;
        C1226eX c1226eX4;
        C0821Uz c0821Uz5;
        c0821Uz = this.A02.A0e;
        c0821Uz.A0B();
        if (U7.A2B(this.A02.A12()) && (this.A00 instanceof AdNativeComponentView)) {
            View adContentsView = ((AdNativeComponentView) this.A00).getAdContentsView();
            if ((adContentsView instanceof C1166dY) && !((C1166dY) adContentsView).A05()) {
                c1226eX4 = this.A02.A0R;
                c1226eX4.A0T();
                c0821Uz5 = this.A02.A0e;
                c0821Uz5.A08();
                return;
            }
        }
        if (this.A03) {
            ImageView imageView = (ImageView) this.A00;
            drawable = this.A02.A01;
            if (drawable == null) {
                c1226eX3 = this.A02.A0R;
                c1226eX3.A0T();
                c0821Uz4 = this.A02.A0e;
                c0821Uz4.A07();
                return;
            }
            C0696Qc.A0f(drawable, imageView);
        }
        c0821Uz2 = this.A02.A0e;
        c1153dL = this.A02.A0c;
        c0821Uz2.A0C(c1153dL, this.A01.A0G());
        c1226eX = this.A02.A0R;
        if (c1226eX != null) {
            c1226eX2 = this.A02.A0R;
            c1226eX2.A0V();
        }
        weakReference = this.A02.A0V;
        if (weakReference != null) {
            weakReference3 = this.A02.A0V;
            if (weakReference3.get() != null) {
                weakReference4 = this.A02.A0V;
                ((AbstractC1225eW) weakReference4.get()).A03();
            }
        }
        xh = this.A02.A0f;
        if (xh.A07()) {
            c0821Uz3 = this.A02.A0e;
            c0821Uz3.A04();
            return;
        }
        this.A02.A0c();
        c1438iC = this.A02.A09;
        if (c1438iC != null) {
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
                    c1438iC2 = this.A02.A09;
                    view3 = this.A02.A04;
                    c1438iC2.A0A(view3);
                    c1438iC3 = this.A02.A09;
                    view4 = this.A02.A06;
                    c1438iC3.A09(view4);
                    c1438iC4 = this.A02.A09;
                    enumC0814Us = this.A02.A0I;
                    c1438iC4.A0E(enumC0814Us);
                    c1438iC5 = this.A02.A09;
                    z = this.A02.A0W;
                    c1438iC5.A0I(z);
                    c1438iC6 = this.A02.A09;
                    z2 = this.A02.A0Z;
                    c1438iC6.A0M(z2);
                    c1438iC7 = this.A02.A09;
                    z3 = this.A02.A0Y;
                    c1438iC7.A0L(z3);
                    c1438iC8 = this.A02.A09;
                    A0q = this.A02.A0q();
                    c1438iC8.A0J(A0q);
                    c1438iC9 = this.A02.A09;
                    enumC0595Mc = this.A02.A08;
                    c1438iC9.A0C(enumC0595Mc);
                    c1438iC10 = this.A02.A09;
                    z4 = this.A02.A0X;
                    c1438iC10.A0K(z4);
                    c1438iC11 = this.A02.A09;
                    nativeAdLayout = this.A02.A07;
                    c1438iC11.A0D(AbstractC0901Ye.A00(nativeAdLayout));
                    c1438iC12 = this.A02.A09;
                    str = this.A02.A0S;
                    c1438iC12.A0F(str);
                    c1438iC13 = this.A02.A09;
                    c1438iC13.A0N(this.A03);
                    c1438iC14 = this.A02.A09;
                    nativeAdLayout2 = this.A02.A07;
                    c1438iC14.A0B(nativeAdLayout2);
                    c1438iC15 = this.A02.A09;
                    weakReference2 = this.A02.A0U;
                    c1438iC15.A0G(weakReference2);
                    c1438iC16 = this.A02.A09;
                    c1438iC16.A03();
                }
            }
        }
    }
}
