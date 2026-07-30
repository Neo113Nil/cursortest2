package com.instagram.common.viewpoint.core;

import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.redexgen.X.5p, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C01895p extends KL {
    public static String[] A00 = {"xFpGP6HPJdxG02oIdF9HxIihRC1N68eF", "SON7b0vH7pU6goQPwxtgPgRIrt0b", "K8DFrhhg1SsjCm4z8vXCiiOaNBIf4pDg", "gTEb8e", "wHRSkCegs17WrS1ZFDoTECKCsF5cwC3Q", "MW7m9Sx4Y", "aUUm4uG1aRzEZg1qhLXNvnDll0TBP1yk", "rrQmUhcDQBY8PjMlrfgiyZrhPVfY"};
    public static final int A02 = (int) (AbstractC0862Wl.A02 * 152.0f);
    public static final int A01 = (int) (AbstractC0862Wl.A02 * 60.0f);

    public C01895p(C1159dL c1159dL, KE ke, int i, boolean z, C0622My c0622My, String str, US us, InterfaceC0890Xn interfaceC0890Xn, C1232eX c1232eX, XH xh, AbstractC1434hy abstractC1434hy, C0362Cw c0362Cw, C0802Ua c0802Ua, boolean z2) {
        super(c1159dL, ke, i, z, c0622My, false, str, us, interfaceC0890Xn, c1232eX, xh, abstractC1434hy, c0362Cw, c0802Ua, z2);
        int i2 = getResources().getConfiguration().orientation;
        A02(i2);
        A03(i2);
        A09(i2);
        A00();
        A06(i2);
        A05(i2);
        A0C(i2);
        A07(i2);
        A0B(i2);
        XP.A0I(this.A0P);
        if (i2 == 1) {
            A08(i2);
        }
        A0A(i2);
        A01(i2);
        A04(i2);
        this.A0O.addView(this.A0M);
        addView(this.A0O);
    }

    private void A00() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(15);
        layoutParams.addRule(11);
        this.A0L.setLayoutParams(layoutParams);
        this.A0L.setGravity(1);
        this.A0L.setOrientation(1);
    }

    private void A01(int i) {
        if (i == 1) {
            if (((KL) this).A04 != null && ((KL) this).A04.getVisibility() == 0) {
                this.A0O.addView(((KL) this).A04);
            }
            this.A0O.addView(this.A0U);
            this.A0O.addView(this.A0J);
            this.A0O.addView(((AbstractC0950Zv) this).A08);
            this.A0O.addView(this.A0I);
            if (this.A0Y) {
                A0n();
            }
        } else {
            this.A0L.addView(this.A0I);
            this.A0L.addView(((AbstractC0950Zv) this).A08);
            this.A0N.addView(this.A0L);
            this.A0N.addView(((AbstractC0950Zv) this).A09);
            this.A0N.addView(this.A0Q);
            this.A0M.addView(this.A0J);
            this.A0M.addView(this.A0N);
            this.A0M.addView(this.A0U);
            if (((KL) this).A04 != null && ((KL) this).A04.getVisibility() == 0) {
                this.A0M.addView(((KL) this).A04);
            }
        }
        this.A0O.addView(this.A0K);
    }

    private void A02(int i) {
        if (i == 2) {
            ((KL) this).A05 = new CU(this.A0M, 400, 100, 0);
            this.A0W.set(false);
        }
    }

    private void A03(int i) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.A0M.getLayoutParams();
        layoutParams.setMargins(0, 0, 0, KL.A0l);
        if (i == 1) {
            this.A0M.setVisibility(8);
        } else {
            int i2 = getResources().getDisplayMetrics().widthPixels;
            if (A00[5].length() != 9) {
                throw new RuntimeException();
            }
            String[] strArr = A00;
            strArr[6] = "fxD9Evjxj1QSbkd6sjXNqMWP1zvaSe0y";
            strArr[2] = "LbyTcx7MzeGvJAIRAeX8dxGClI61VeIC";
            layoutParams.width = (int) (i2 * 0.4f);
            layoutParams.height = -2;
            layoutParams.addRule(12);
            layoutParams.addRule(11);
            this.A0M.setPadding(KL.A0l, KL.A0l, KL.A0l, KL.A0l);
            A0r(this.A0M, -1728053248, new float[]{32.0f, 32.0f, 0.0f, 0.0f, 0.0f, 0.0f, 32.0f, 32.0f});
            this.A0M.setVisibility(0);
        }
        this.A0M.setLayoutParams(layoutParams);
    }

    private void A04(int i) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.A0K.getLayoutParams();
        if (i == 1) {
            layoutParams.removeRule(20);
            layoutParams.addRule(21);
            layoutParams.setMargins(0, 0, KL.A0r, 0);
            this.A0K.setPadding(KL.A0u, KL.A0u, 0, 0);
        } else {
            layoutParams.removeRule(21);
            layoutParams.addRule(20);
            if (A00[3].length() == 25) {
                throw new RuntimeException();
            }
            A00[3] = "loHD1sEgjyAFCmeIlD5ALXOeqArjH8d";
            layoutParams.setMargins(KL.A0r, 0, 0, 0);
        }
        layoutParams.addRule(12);
        this.A0K.setPadding(0, KL.A0u, KL.A0u, 0);
        this.A0K.setLayoutParams(layoutParams);
    }

    private void A05(int i) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, KL.A0b);
        if (i == 1) {
            layoutParams.removeRule(15);
            ((KL) this).A02 = 30;
            layoutParams.addRule(14);
            layoutParams.setMargins(KL.A0r, 0, KL.A0r, KL.A0l);
            layoutParams.addRule(2, this.A0U.getId());
            ((AbstractC0950Zv) this).A08.setMinWidth(-1);
        } else {
            layoutParams.removeRule(2);
            ((KL) this).A02 = 16;
            layoutParams.width = -2;
            layoutParams.height = KL.A0i;
            if (this.A0I.getVisibility() != 0) {
                layoutParams.addRule(15);
            }
            layoutParams.setMargins(0, 0, 0, 0);
            ((AbstractC0950Zv) this).A08.setMinWidth((int) (getResources().getDisplayMetrics().widthPixels * 0.12f));
        }
        layoutParams.addRule(14);
        ((AbstractC0950Zv) this).A08.setLayoutParams(layoutParams);
        ((AbstractC0950Zv) this).A08.setPadding(KL.A0s, 0, KL.A0s, 0);
        A0k();
    }

    private void A06(int i) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(KL.A0c, KL.A0c);
        if (i == 1) {
            layoutParams.addRule(2, ((AbstractC0950Zv) this).A08.getId());
            layoutParams.setMargins(0, 0, 0, KL.A0u);
            layoutParams.addRule(14);
        } else {
            layoutParams.setMargins(0, 0, 0, KL.A0s);
            layoutParams.removeRule(14);
            layoutParams.removeRule(2);
        }
        this.A0I.setLayoutParams(layoutParams);
    }

    private void A07(int i) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.removeRule(12);
        layoutParams.removeRule(3);
        if (i != 1) {
            layoutParams.addRule(3, this.A0U.getId());
            layoutParams.addRule(11);
            layoutParams.setMargins(0, KL.A0k, 0, 0);
        } else {
            layoutParams.addRule(12);
            layoutParams.addRule(7, ((AbstractC0950Zv) this).A08.getId());
            layoutParams.setMargins(0, 0, 0, KL.A0l);
        }
        this.A0J.setLayoutParams(layoutParams);
    }

    private void A08(int i) {
        if (i == 1) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.A0P.getLayoutParams();
            layoutParams.addRule(14);
            layoutParams.addRule(3, this.A0Q.getId());
            layoutParams.setMargins(KL.A0t, 0, KL.A0t, KL.A0u);
            this.A0P.setTypeface(Typeface.DEFAULT);
            this.A0P.setTextSize(18.0f);
            this.A0P.setLayoutParams(layoutParams);
            this.A0P.setMaxLines(2);
        }
    }

    private void A09(int i) {
        int topMargin;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) ((AbstractC0950Zv) this).A09.getLayoutParams();
        if (i == 1) {
            layoutParams.width = A02;
            layoutParams.height = A02;
            layoutParams.setMargins(0, (-A02) / 4, 0, 0);
            layoutParams.addRule(14);
            topMargin = 30;
        } else {
            layoutParams.removeRule(3);
            layoutParams.removeRule(14);
            layoutParams.width = A01;
            layoutParams.height = A01;
            layoutParams.setMargins(0, 0, KL.A0u, 0);
            topMargin = 12;
        }
        if (!this.A0X) {
            ((AbstractC0950Zv) this).A09.setRadius(topMargin);
        }
        ((AbstractC0950Zv) this).A09.setLayoutParams(layoutParams);
    }

    private void A0A(int i) {
        if (((KL) this).A04 == null || ((KL) this).A04.getVisibility() != 0) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) ((KL) this).A04.getLayoutParams();
        layoutParams.removeRule(5);
        layoutParams.removeRule(3);
        layoutParams.removeRule(2);
        if (i != 1) {
            layoutParams.addRule(3, this.A0U.getId());
            int i2 = KL.A0s;
            if (A00[3].length() == 25) {
                throw new RuntimeException();
            }
            A00[5] = "VmlO4tbuG";
            layoutParams.setMargins(0, i2, 0, 0);
        } else {
            if (this.A0J.getVisibility() == 0) {
                layoutParams.addRule(2, this.A0J.getId());
            } else {
                layoutParams.addRule(2, this.A0K.getId());
            }
            layoutParams.addRule(5, this.A0U.getId());
            layoutParams.setMargins(0, KL.A0u, 0, 0);
        }
        ((KL) this).A04.setLayoutParams(layoutParams);
    }

    private void A0B(int i) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.A0U.getLayoutParams();
        layoutParams.removeRule(2);
        layoutParams.removeRule(3);
        if (i == 1) {
            if (this.A0J.getVisibility() == 0) {
                layoutParams.addRule(2, this.A0J.getId());
            } else {
                layoutParams.addRule(2, this.A0K.getId());
            }
            layoutParams.setMargins(KL.A0r, 0, KL.A0r, KL.A0o);
        } else {
            layoutParams.setMargins(0, KL.A0u, 0, 0);
            layoutParams.addRule(3, this.A0N.getId());
        }
        this.A0U.setLayoutParams(layoutParams);
    }

    private void A0C(int i) {
        int i2;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.A0Q.getLayoutParams();
        if (i == 1) {
            layoutParams.removeRule(1);
            layoutParams.removeRule(15);
            layoutParams.removeRule(0);
            i2 = 4;
            layoutParams.addRule(14);
            layoutParams.addRule(3, ((AbstractC0950Zv) this).A09.getId());
            int i3 = KL.A0r;
            int i4 = KL.A0l;
            int textAlignment = KL.A0r;
            layoutParams.setMargins(i3, i4, textAlignment, KL.A0u);
            this.A0Q.setTypeface(Typeface.DEFAULT_BOLD);
            this.A0Q.setTextSize(30.0f);
            this.A0Q.setMaxLines(2);
        } else {
            layoutParams.removeRule(3);
            layoutParams.removeRule(14);
            i2 = 5;
            layoutParams.addRule(15);
            layoutParams.addRule(1, ((AbstractC0950Zv) this).A09.getId());
            layoutParams.addRule(0, this.A0L.getId());
            layoutParams.setMargins(0, 0, KL.A0u, 0);
            this.A0Q.setTypeface(Typeface.DEFAULT);
            this.A0Q.setTextSize(20.0f);
            this.A0Q.setMaxLines(1);
        }
        this.A0Q.setTextAlignment(i2);
        this.A0Q.setLayoutParams(layoutParams);
        this.A0Q.setEllipsize(TextUtils.TruncateAt.END);
    }

    @Override // com.instagram.common.viewpoint.core.KL, com.instagram.common.viewpoint.core.AbstractC0950Zv
    public final void A0h(int i) {
        super.A0h(i);
        XP.A0Z(this.A0N, this.A0L, ((AbstractC0950Zv) this).A09, this.A0Q, ((AbstractC0950Zv) this).A08, this.A0U, ((KL) this).A04, this.A0P, this.A0I, this.A0K, this.A0J);
        A03(i);
        A04(i);
        A07(i);
        A0A(i);
        A0B(i);
        A00();
        A06(i);
        A05(i);
        A09(i);
        A0C(i);
        A08(i);
        A01(i);
    }

    @Override // com.instagram.common.viewpoint.core.KL
    public final void A0q(int i) {
        if (((KL) this).A05 != null && i == 2) {
            ((KL) this).A05.A42(true, false);
        }
    }

    @Override // com.instagram.common.viewpoint.core.KL
    public final void A0s(ViewGroup viewGroup, RelativeLayout relativeLayout, int i) {
        if (i == 1) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) ((AbstractC0950Zv) this).A09.getLayoutParams();
            layoutParams.addRule(3, relativeLayout.getId());
            ((AbstractC0950Zv) this).A09.setLayoutParams(layoutParams);
            viewGroup.addView(((AbstractC0950Zv) this).A09);
            viewGroup.addView(this.A0Q);
            viewGroup.addView(this.A0P);
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0950Zv
    public void setInfo(C0620Mw c0620Mw, C0623Mz c0623Mz, String str, String str2, InterfaceC0872Wv interfaceC0872Wv, InterfaceC0959a4 interfaceC0959a4) {
        super.setInfo(c0620Mw, c0623Mz, str, str2, interfaceC0872Wv, interfaceC0959a4);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0950Zv
    public void setTitleMaxLines(int i) {
        this.A0Q.setMaxLines(i);
        this.A0Q.setEllipsize(TextUtils.TruncateAt.END);
    }
}
