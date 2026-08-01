package com.facebook.ads.redexgen.X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.internal.api.AdNativeComponentView;
import java.lang.ref.WeakReference;

/* loaded from: assets/audience_network.dex */
public class UN extends AbstractC0763Qa {
    public static String[] A04 = {"oSoBkaWeyKsp", "KBeBF", "kSDces9j50gwfjS4QfNYnWgLw2iPkymV", "EJmszBWYtRUz1Vdq", "qn5qycmxyPd80aqzWiKeSrAoNfum3VnE", "21Cce2q6wYIDkABj", "e4Lw2G3U", "jRNkDTlKn5mABl6KQSYrYYCrXHx6B19g"};
    public final /* synthetic */ View A00;
    public final /* synthetic */ C1060ah A01;
    public final /* synthetic */ UJ A02;
    public final /* synthetic */ boolean A03;

    public UN(UJ uj, View view, boolean z, C1060ah c1060ah) {
        this.A02 = uj;
        this.A00 = view;
        this.A03 = z;
        this.A01 = c1060ah;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0763Qa
    public final void A00() {
        JE je;
        je = this.A02.A0e;
        je.A06();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0763Qa
    public final void A02() {
        JE je;
        je = this.A02.A0e;
        je.A0A();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0763Qa
    public final void A03() {
        JE je;
        JE je2;
        YA ya;
        C0764Qb c0764Qb;
        WeakReference weakReference;
        LN ln;
        JE je3;
        C1050aX c1050aX;
        View view;
        View view2;
        C1050aX c1050aX2;
        View view3;
        C1050aX c1050aX3;
        View view4;
        C1050aX c1050aX4;
        J7 j7;
        C1050aX c1050aX5;
        boolean z;
        C1050aX c1050aX6;
        boolean z2;
        C1050aX c1050aX7;
        boolean z3;
        C1050aX c1050aX8;
        boolean A0p;
        C1050aX c1050aX9;
        AnonymousClass10 anonymousClass10;
        C1050aX c1050aX10;
        boolean z4;
        C1050aX c1050aX11;
        NativeAdLayout nativeAdLayout;
        C1050aX c1050aX12;
        String str;
        C1050aX c1050aX13;
        C1050aX c1050aX14;
        WeakReference weakReference2;
        WeakReference weakReference3;
        C0764Qb c0764Qb2;
        Drawable drawable;
        C0764Qb c0764Qb3;
        JE je4;
        C0764Qb c0764Qb4;
        JE je5;
        je = this.A02.A0e;
        je.A0B();
        if (IP.A1k(this.A02.A11())) {
            View view5 = this.A00;
            if (view5 instanceof AdNativeComponentView) {
                View adContentsView = ((AdNativeComponentView) view5).getAdContentsView();
                if ((adContentsView instanceof C0743Pg) && !((C0743Pg) adContentsView).A02()) {
                    c0764Qb4 = this.A02.A0R;
                    c0764Qb4.A0T();
                    je5 = this.A02.A0e;
                    je5.A08();
                    return;
                }
            }
        }
        if (this.A03) {
            ImageView imageView = (ImageView) this.A00;
            if (A04[6].length() != 8) {
                throw new RuntimeException();
            }
            A04[4] = "kV1RqodiW8kqR1rQOQ4NCiAB35VpASKe";
            drawable = this.A02.A01;
            if (drawable == null) {
                c0764Qb3 = this.A02.A0R;
                c0764Qb3.A0T();
                je4 = this.A02.A0e;
                je4.A07();
                return;
            }
            UJ.A0e(drawable, imageView);
        }
        je2 = this.A02.A0e;
        ya = this.A02.A0c;
        je2.A0C(ya, this.A01.A0G());
        c0764Qb = this.A02.A0R;
        if (c0764Qb != null) {
            c0764Qb2 = this.A02.A0R;
            c0764Qb2.A0V();
        }
        weakReference = this.A02.A0V;
        if (weakReference != null) {
            weakReference2 = this.A02.A0V;
            if (weakReference2.get() != null) {
                weakReference3 = this.A02.A0V;
                ((AbstractC0763Qa) weakReference3.get()).A03();
            }
        }
        ln = this.A02.A0f;
        if (ln.A07()) {
            je3 = this.A02.A0e;
            je3.A04();
            return;
        }
        this.A02.A0b();
        c1050aX = this.A02.A09;
        if (c1050aX != null) {
            view = this.A02.A04;
            if (view != null) {
                view2 = this.A02.A06;
                if (view2 != null) {
                    c1050aX2 = this.A02.A09;
                    view3 = this.A02.A04;
                    c1050aX2.A08(view3);
                    c1050aX3 = this.A02.A09;
                    view4 = this.A02.A06;
                    c1050aX3.A07(view4);
                    c1050aX4 = this.A02.A09;
                    j7 = this.A02.A0I;
                    c1050aX4.A0B(j7);
                    c1050aX5 = this.A02.A09;
                    z = this.A02.A0W;
                    c1050aX5.A0E(z);
                    c1050aX6 = this.A02.A09;
                    z2 = this.A02.A0Z;
                    c1050aX6.A0I(z2);
                    c1050aX7 = this.A02.A09;
                    z3 = this.A02.A0Y;
                    c1050aX7.A0H(z3);
                    c1050aX8 = this.A02.A09;
                    A0p = this.A02.A0p();
                    c1050aX8.A0F(A0p);
                    c1050aX9 = this.A02.A09;
                    anonymousClass10 = this.A02.A08;
                    c1050aX9.A09(anonymousClass10);
                    c1050aX10 = this.A02.A09;
                    z4 = this.A02.A0X;
                    c1050aX10.A0G(z4);
                    c1050aX11 = this.A02.A09;
                    nativeAdLayout = this.A02.A07;
                    c1050aX11.A0A(MS.A00(nativeAdLayout));
                    c1050aX12 = this.A02.A09;
                    str = this.A02.A0S;
                    c1050aX12.A0C(str);
                    c1050aX13 = this.A02.A09;
                    c1050aX13.A0J(this.A03);
                    c1050aX14 = this.A02.A09;
                    c1050aX14.A02();
                }
            }
        }
    }
}
