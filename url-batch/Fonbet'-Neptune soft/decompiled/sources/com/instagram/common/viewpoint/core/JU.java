package com.instagram.common.viewpoint.core;

import android.R;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.PointerIconCompat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: assets/audience_network.dex */
public final class JU extends AbstractC0987ae {
    public static byte[] A0s;
    public static String[] A0t = {"fr3Y9tf6ePgTPq", "pEcG", "X6n0DjY1D3c56kEYNT7NkudbHULcUpi8", "xLfqb7j3EStc", "2nglUwJ7J1gVDM", "1eQzmRPEbuFcZFemJlVYaDXjMdIAS51D", "mnsD3rfSZRPYnMaeA3V0PZWjFbonJuRI", "JvQjcWyuZKXxmxTpCuNSfYxSgxmPRmOD"};
    public static final int A0u;
    public static final int A0v;
    public static final int A0w;
    public static final int A0x;
    public static final int A0y;
    public static final int A0z;
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public Handler A09;
    public Handler A0A;
    public View A0B;
    public InputMethodManager A0C;
    public LinearLayout A0D;
    public LinearLayout A0E;
    public RelativeLayout A0F;
    public TextView A0G;
    public AbstractC1428hy A0H;
    public AbstractRunnableC0840Vt A0I;
    public ZO A0J;
    public ZP A0K;
    public LJ A0L;
    public KE A0M;
    public C0991ai A0N;
    public C1028bJ A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public final Handler A0f;
    public final View A0g;
    public final MH A0h;
    public final C0796Ua A0i;
    public final InterfaceC0953a4 A0j;
    public final InterfaceC0964aH A0k;
    public final C0965aI A0l;
    public final C0356Cw A0m;
    public final Runnable A0n;
    public final Runnable A0o;
    public final Set<String> A0p;
    public final boolean A0q;
    public final boolean A0r;

    public static String A0J(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0s, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A0t;
            if (strArr[3].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0t;
            strArr2[3] = "BAn7g4Tg6kNh";
            strArr2[1] = "sSvO";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 34);
            i4++;
        }
    }

    public static void A0Z() {
        A0s = new byte[]{8, 92, 83, 86, 92, 84, 96, 76, 80, 74, 77, 92, 90, 119, 112, 110, 107, 106, 65, 115, 123, 106, 118, 113, 122, 96, 102, 112, 103, 118, 121, 124, 118, 126, 74, 115, 124, 121, 97, 112, 103, 112, 113, 79, 81, 86, 92, 87, 79, 64, 89, 94, 104, 84, 67, 86, 104, 85, 66, 67, 67, 88, 89, 78, 87, 80, 102, 78, 92, 91, 102, 80, 87, 74, 77, 88, 85, 85, 102, 91, 76, 77, 77, 86, 87, 121};
    }

    static {
        A0Z();
        A0x = (int) (AbstractC0856Wl.A02 * 26.0f);
        A0u = (int) (AbstractC0856Wl.A02 * 4.0f);
        A0z = (int) (AbstractC0856Wl.A02 * 8.0f);
        A0v = (int) (AbstractC0856Wl.A02 * 24.0f);
        A0w = OP.A02(-1, 77);
        A0y = (int) (AbstractC0856Wl.A02 * 12.0f);
    }

    public JU(C0991ai c0991ai) {
        super(c0991ai, true);
        this.A0c = false;
        this.A02 = -1;
        this.A0d = false;
        this.A03 = 0;
        this.A0P = false;
        this.A0X = false;
        this.A0Z = false;
        this.A0a = false;
        this.A0b = false;
        this.A0Y = false;
        this.A0e = false;
        this.A0T = false;
        this.A0V = false;
        this.A0U = false;
        this.A0S = false;
        this.A08 = 0;
        this.A01 = 0;
        this.A0W = false;
        this.A0A = new Handler(Looper.getMainLooper());
        this.A0o = new RunnableC1013b4(this);
        this.A0R = false;
        this.A0p = new HashSet();
        this.A0f = new Handler(Looper.getMainLooper());
        this.A0n = new Runnable() { // from class: com.facebook.ads.redexgen.X.az
            @Override // java.lang.Runnable
            public final void run() {
                JU.this.A1R();
            }
        };
        this.A09 = new Handler(Looper.getMainLooper());
        this.A0C = (InputMethodManager) c0991ai.A06().getSystemService(A0J(13, 12, 60));
        this.A0N = c0991ai;
        this.A0H = this.A0N.A05();
        this.A0i = new C0796Ua(c0991ai.A05().A25(), c0991ai.A07());
        this.A0m = this.A0N.A0F();
        if (this.A0m != null) {
            XP.A0I(this.A0m);
        }
        this.A0g = this.A0N.A03();
        this.A0h = MI.A01(c0991ai.A06(), c0991ai.A07(), c0991ai.A05().A25(), WQ.A00(c0991ai.A05().A20().A0J().A05()), new HashMap(), false, true, this.A0H.A21());
        this.A0j = new C0516Jb(this);
        AbstractC0974aR.A00(c0991ai.A06(), this, c0991ai.A05().A20().A0H().A08());
        setupLayoutConfiguration(false);
        A0U();
        A0Q();
        this.A0I = new JZ(this);
        postDelayed(this.A0I, 1000L);
        A0Y();
        this.A0k = new JY(this);
        E1 e1 = this.A0N.A02() instanceof E1 ? (E1) this.A0N.A02() : null;
        this.A0l = new C0965aI(c0991ai, this.A0H, e1, this.A0N.A0D(), this.A0k, this.A0G, this.A0O, this.A0m, this.A0g);
        if (e1 != null && U7.A1K(getAdContextWrapper())) {
            AbstractC0941Zs.A00(e1.getVideoImplView(), U7.A1L(getAdContextWrapper()), new ViewOnClickListenerC1014b5(this));
        } else if (e1 == null && this.A0B != null && U7.A1I(getAdContextWrapper())) {
            AbstractC0941Zs.A00(this.A0B, U7.A1J(getAdContextWrapper()), new ViewOnClickListenerC1015b6(this));
        }
        this.A0F = null;
        this.A0M = null;
        this.A0q = c0991ai.A05().A1e();
        this.A0r = c0991ai.A05().A1p();
        getAdContextWrapper().A0F().ABe(this.A0q, this.A0r, c0991ai.A05().A2C());
    }

    public JU(C0991ai c0991ai, boolean z) {
        this(c0991ai);
        this.A0c = z;
        AbstractC1428hy A05 = c0991ai.A05();
        this.A0d = this.A0c && A05.A1q();
        if (this.A0c) {
            this.A02 = A05.A0k();
            if (this.A02 == 0) {
                A1R();
            } else if (this.A02 > 0 && this.A02 <= 10000) {
                this.A0f.postDelayed(this.A0n, this.A02);
            }
            String A1B = A05.A1B();
            if (!TextUtils.isEmpty(A1B)) {
                for (String stringToCheck : A1B.split(A0J(0, 1, 10))) {
                    this.A0p.add(stringToCheck);
                }
            }
        }
    }

    public static /* synthetic */ int A03(JU ju) {
        int i = ju.A01;
        ju.A01 = i + 1;
        return i;
    }

    public static /* synthetic */ int A05(JU ju) {
        int i = ju.A08;
        ju.A08 = i + 1;
        return i;
    }

    private void A0K() {
        XP.A0H(this.A0E);
        this.A0E = new LinearLayout(this.A0N.A06());
        XP.A0P(this.A0E, getAdContextWrapper());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.A0P ? this.A04 / 4 : this.A04 / 5);
        layoutParams.addRule(12);
        this.A0E.setLayoutParams(layoutParams);
        addView(this.A0E, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A0L, reason: merged with bridge method [inline-methods] */
    public void A1R() {
        A0f(((C7P) this.A0h).A0M().toString());
        A0i(true);
    }

    private void A0M() {
        XJ.A00(new Runnable() { // from class: com.facebook.ads.redexgen.X.ay
            @Override // java.lang.Runnable
            public final void run() {
                JU.this.A1Q();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0N() {
        if (this.A0H.A1W() && this.A0R) {
            this.A0R = false;
            A0g(A0J(25, 18, 55));
        }
    }

    private void A0O() {
        if (this.A0H.A1W() && this.A0R) {
            this.A0R = false;
            Map<String, String> A05 = new C0938Zp().A03(null).A02(null).A05();
            A05.put(A0J(1, 12, 29), A0J(25, 18, 55));
            getAdEventManager().AAs(this.A0H.A25(), A05);
        }
    }

    private void A0P() {
        AbstractC0883Xm A0C;
        if (this.A0N.A05().A1n() && (A0C = this.A0N.A0C()) != null) {
            A0C.setProgressSpinnerInvisible(false);
        }
    }

    private void A0Q() {
        XP.A0H(this.A0D);
        this.A0D = new LinearLayout(this.A0N.A06());
        this.A0D.setOrientation(1);
        XP.A0I(this.A0D);
        A0W();
        this.A0D.setBackgroundColor(-1);
        addView(this.A0D);
    }

    private void A0R() {
        if (this.A0g != null) {
            XP.A0H(this.A0g);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(AbstractC0987ae.A08, AbstractC0987ae.A08);
            layoutParams.addRule(10);
            layoutParams.addRule(11);
            layoutParams.setMargins(AbstractC0987ae.A07, this.A07, AbstractC0987ae.A07, AbstractC0987ae.A07);
            addView(this.A0g, layoutParams);
        }
    }

    private void A0S() {
        if (this.A0m != null) {
            XP.A0H(this.A0m);
            this.A0m.setPadding(A0y, A0y, A0y, A0y);
            this.A0m.A08(-1, A0w, false);
            this.A0m.setTranslationY(0.0f);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, A0x);
            layoutParams.addRule(12);
            addView(this.A0m, layoutParams);
        }
    }

    private void A0T() {
        AbstractC0883Xm A0C = this.A0N.A0C();
        if (A0C == null) {
            return;
        }
        A0C.setPageDetailsVisible((this.A0Q || A0C.A0B()) ? false : true);
    }

    private void A0U() {
        this.A0B = this.A0N.A02();
        if (this.A0H.A1W()) {
            this.A0B.setOnClickListener(new ViewOnClickListenerC1016b7(this));
        }
        XP.A0H(this.A0B);
        XP.A0I(this.A0B);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(15);
        addView(this.A0B, 1, layoutParams);
        this.A0G = new TextView(this.A0N.A06());
        XP.A0I(this.A0G);
        this.A0G.setGravity(17);
        this.A0G.setTextColor(getColors().A06(true));
        this.A0G.setEllipsize(TextUtils.TruncateAt.END);
        this.A0G.setMaxLines(2);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(12);
        layoutParams2.setMargins(A0z, A0z / 2, A0z, this.A0m == null ? A0z : A0x);
        addView(this.A0G, layoutParams2);
        XP.A0I(this.A0G);
        this.A0O = new C1028bJ(this.A0N.A06(), getCtaButton(), this.A0N.A05(), this.A0N.A07(), this.A0N.A0D(), this.A0N.A0G(), this.A0N.A0A(), getColors(), this.A0j);
        this.A0O.setAutoClickTime(this.A0N.A05(), this.A0N.A0C());
        XP.A0E(PointerIconCompat.TYPE_ALIAS, this.A0O);
        addView(this.A0O);
        A0X();
        A0K();
        if (U7.A17(this.A0N.A06())) {
            this.A0E.setOnClickListener(new ViewOnClickListenerC1017b8(this));
            if (this.A0N.A0C() != null) {
                this.A0N.A0C().setCTAClickListener(new ViewOnClickListenerC1018b9(this));
            }
        }
    }

    private void A0V() {
        this.A0Y = true;
        this.A0O.setVisibility(8);
        XP.A0R(this);
        removeCallbacks(this.A0I);
        XP.A0Z(this.A0O);
        XP.A0Z(this.A0m, this.A0g, this.A0l, this.A0G, this.A0J, this.A0N.A0C(), this.A0D, this.A0K);
        if (Build.VERSION.SDK_INT >= 35) {
            Object parent = getParent();
            if (parent instanceof View) {
                View parentView = (View) parent;
                parentView.setFitsSystemWindows(false);
                parentView.setPadding(0, 0, 0, 0);
            }
        }
        if (this.A0B instanceof E1) {
            E1 e1 = (E1) this.A0B;
            Iterator<InterfaceC1170dc> it = e1.getPlugins().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                InterfaceC1170dc next = it.next();
                if (next instanceof C2R) {
                    e1.A0j(next);
                    break;
                }
            }
        }
        addView(new C1003au(this.A0N.A06(), this.A0H, this.A0i, this.A0A, this.A0N.A0D()).A09(getRegularCtaForEndCard()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0W() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.A05);
        if (A1U()) {
            layoutParams.setMargins(0, this.A05 / 5, 0, 0);
            layoutParams.addRule(12);
            String[] strArr = A0t;
            if (strArr[6].charAt(18) != strArr[5].charAt(18)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0t;
            strArr2[3] = "lVu96jIJ4wtN";
            strArr2[1] = "vEsO";
            this.A0D.setLayoutParams(layoutParams);
        } else {
            layoutParams.setMargins(0, this.A05 + 1, 0, 0);
        }
        LinearLayout linearLayout = this.A0D;
        String[] strArr3 = A0t;
        if (strArr3[4].length() != strArr3[0].length()) {
            linearLayout.setTranslationY(0.0f);
            this.A0D.setLayoutParams(layoutParams);
            return;
        }
        String[] strArr4 = A0t;
        strArr4[6] = "ao8FhOByUXKbyI2dbjVU10hQSvAA73UK";
        strArr4[5] = "1fPkz4yBU6BXLdgQ7SVXdDzzX5ZOz4LN";
        linearLayout.setTranslationY(0.0f);
        this.A0D.setLayoutParams(layoutParams);
    }

    private void A0X() {
        C0616My adColors;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, this.A0P ? this.A04 / 4 : this.A04 / 5);
        layoutParams.addRule(14);
        layoutParams.addRule(2, this.A0G.getId());
        layoutParams.setMargins(0, 0, 0, 0);
        this.A0O.setLayoutParams(layoutParams);
        if (this.A0d && this.A0M != null) {
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(this.A0P ? -2 : -1, -2);
            layoutParams2.addRule(12);
            layoutParams2.addRule(14);
            layoutParams2.setMargins(A0v, 0, A0v, A0v);
            if (getContext().getResources().getConfiguration().orientation == 1) {
                adColors = this.A0N.A05().A1z().A01();
            } else {
                adColors = this.A0N.A05().A1z().A00();
            }
            this.A0M.setUpButtonColors(adColors);
            if (this.A0P) {
                this.A0M.setPadding(A0v, 0, A0v, 0);
            }
            KE ke = this.A0M;
            String[] strArr = A0t;
            if (strArr[6].charAt(18) != strArr[5].charAt(18)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0t;
            strArr2[6] = "AuovlskRS4ra5LnKaHVdb744ygVoFjY2";
            strArr2[5] = "ls1L1tiwYnJTmONbQbVaT3PDhb5OoAVQ";
            ke.setLayoutParams(layoutParams2);
        }
        this.A0O.A03();
    }

    private void A0Y() {
        if (!this.A0Y) {
            A0S();
            A0R();
        }
        A0T();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0f(String str) {
        LJ lj;
        C0616My A00;
        C0616My A002;
        if (this.A0d) {
            XP.A0H(this.A0F);
            XP.A0H(this.A0M);
        }
        XP.A0H(this.A0L);
        C0519Je c0519Je = new C0519Je(this);
        if (this.A0N.A06().A0E() == null) {
            this.A0N.A06().A0F().A9n();
        }
        if (!U8.A02(this.A0N.A06()) && this.A0N.A06().A0E() != null) {
            lj = new LJ(this.A0N.A06(), this.A0N.A06().A0E(), c0519Je);
        } else {
            lj = new LJ(this.A0N.A06(), c0519Je);
        }
        this.A0L = lj;
        if (this.A0c) {
            this.A0L.setInterceptRedirectRequest(new ZX() { // from class: com.facebook.ads.redexgen.X.Jo
                @Override // com.instagram.common.viewpoint.core.ZX
                public final boolean AAW(String str2) {
                    return JU.this.A1V(str2);
                }
            });
        }
        if (this.A0H.A1d()) {
            this.A0L.addJavascriptInterface(new C0976aT(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.av
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    JU.this.A1S(view);
                }
            }, this.A0L, new InterfaceC0975aS() { // from class: com.facebook.ads.redexgen.X.Jn
                @Override // com.instagram.common.viewpoint.core.InterfaceC0975aS
                public final void ACk() {
                    JU.this.A1O();
                }
            }), C0976aT.A01());
        }
        this.A0L.setOnTouchListener(new ViewOnTouchListenerC1010b1(this));
        setUpBrowserControls(this.A0L);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.weight = 0.9f;
        if (this.A0d || this.A0H.A1d()) {
            C1153dL A06 = this.A0N.A06();
            String A0r = this.A0N.A05().A0r();
            if (this.A0N.A00() == 1) {
                A00 = this.A0N.A05().A1z().A01();
            } else {
                A00 = this.A0N.A05().A1z().A00();
            }
            this.A0M = new KE(A06, A0r, A00, this.A0N.A05().A20().A0J().A06(), this.A0N.A07(), this.A0N.A0D(), this.A0N.A0G(), this.A0N.A0A(), this.A0N.A05().A21());
            this.A0M.setCta(this.A0N.A05().A20().A0J(), this.A0N.A05().A25(), new HashMap());
        }
        if (!this.A0d || this.A0M == null) {
            this.A0D.addView(this.A0L, layoutParams);
        } else {
            this.A0F = new RelativeLayout(getContext());
            this.A0F.addView(this.A0L, new RelativeLayout.LayoutParams(-1, -1));
            XP.A0I(this.A0M);
            this.A0M.setRoundedCornersEnabled(A01());
            this.A0M.setViewShowsOverMedia(A0C());
            if (getContext().getResources().getConfiguration().orientation == 1) {
                A002 = this.A0N.A05().A1z().A01();
            } else {
                A002 = this.A0N.A05().A1z().A00();
            }
            this.A0M.setUpButtonColors(A002);
            if (this.A0P) {
                this.A0M.setPadding(A0v, 0, A0v, 0);
            }
            this.A0M.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.aw
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    JU.this.A1T(view);
                }
            });
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(this.A0P ? -2 : -1, -2);
            layoutParams2.addRule(12);
            layoutParams2.addRule(14);
            layoutParams2.setMargins(A0v, 0, A0v, A0v);
            this.A0F.addView(this.A0M, layoutParams2);
            this.A0D.addView(this.A0F, layoutParams);
        }
        this.A0L.loadUrl(str);
    }

    private void A0g(String str) {
        Map<String, String> A05 = new C0938Zp().A03(null).A02(null).A05();
        A05.put(A0J(1, 12, 29), str);
        this.A0i.A04(UZ.A0J, A05);
        this.A0N.A0D().A4b(this.A0H.A0r());
        getAdEventManager().AB8(this.A0H.A25(), A05);
        if (U7.A2N(this.A0N.A06())) {
            HashMap hashMap = new HashMap();
            hashMap.put(AbstractC1472im.A04, Boolean.TRUE.toString());
            hashMap.put(AbstractC1472im.A05, Boolean.TRUE.toString());
            hashMap.put(AbstractC1472im.A06, Boolean.TRUE.toString());
            getAdEventManager().ABH(this.A0H.A25(), hashMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0h(String str) {
        if (this.A0H.A1w() > 0) {
            if (this.A0H.A2E() && this.A0S) {
                return;
            }
            this.A0S = true;
            A0g(str);
            return;
        }
        if (this.A0H.A1V()) {
            A0N();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0i(boolean z) {
        if (!z && A0m()) {
            return;
        }
        this.A0Q = z;
        if (this.A0c && z) {
            this.A0f.removeCallbacks(this.A0n);
        }
        ObjectAnimator browserTransAnim = null;
        if (!z) {
            this.A09.removeCallbacksAndMessages(null);
        } else {
            this.A01 = 0;
            this.A08 = 0;
            this.A0T = false;
            this.A0U = false;
            this.A0V = false;
            this.A0S = false;
            A0k(!A0m(), 0);
            A0P();
        }
        if (!this.A0W) {
            postDelayed(new C0517Jc(this, z), 250L);
        }
        String A0J = A0J(85, 1, 34);
        if (z) {
            browserTransAnim = ObjectAnimator.ofFloat(this.A0O, A0J, this.A0O.getY(), this.A05 / 5);
        }
        LinearLayout linearLayout = this.A0D;
        float y = this.A0D.getY();
        int i = this.A05;
        if (z) {
            i /= 5;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(linearLayout, A0J, y, i);
        ofFloat.setDuration(500L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.A0B, A0J, this.A0B.getY(), 0.0f);
        ofFloat2.setDuration(500L);
        int height = this.A0B.getHeight();
        int i2 = this.A05;
        if (z) {
            i2 /= 5;
        }
        ValueAnimator duration = ValueAnimator.ofInt(height, i2).setDuration(500L);
        duration.addUpdateListener(new C1011b2(this));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.playTogether(ofFloat, ofFloat2, duration);
        if (browserTransAnim != null) {
            browserTransAnim.setDuration(500L);
            String[] strArr = A0t;
            if (strArr[3].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0t;
            strArr2[2] = "mPKPZPxIo82o2decuruwdSCyMcOv6Ead";
            strArr2[7] = "qDzceeJQflYxul6669uVFcgsbJgsLatz";
            animatorSet.playTogether(browserTransAnim);
        }
        animatorSet.addListener(new C1012b3(this, z));
        if (this.A0r && (this.A0B instanceof E1)) {
            ((E1) this.A0B).A0f(animatorSet, z);
        }
        animatorSet.start();
    }

    private void A0j(boolean z) {
        RelativeLayout.LayoutParams layoutParams;
        setupLayoutConfiguration(z);
        XP.A0H(this.A0B);
        if (this.A0B == null) {
            this.A0B = this.A0N.A02();
            XP.A0I(this.A0B);
        }
        boolean z2 = this.A0Q;
        String[] strArr = A0t;
        if (strArr[6].charAt(18) != strArr[5].charAt(18)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0t;
        strArr2[2] = "vsQMzuL85pElT0uyLkCOYkbLp6FYZ6Kp";
        strArr2[7] = "Jg0wEDfumSgIDDBadFZcUW5HjHx0Xq4t";
        if (z2) {
            layoutParams = new RelativeLayout.LayoutParams(-1, this.A05 / 5);
            layoutParams.addRule(14);
            layoutParams.addRule(10);
        } else {
            layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            if (U7.A1I(getAdContextWrapper()) && getResources().getConfiguration().orientation == 2 && !(this.A0B instanceof E1)) {
                layoutParams = new RelativeLayout.LayoutParams(-2, -1);
            }
            layoutParams.addRule(13);
            A0Q();
        }
        this.A0B.setTranslationY(0.0f);
        addView(this.A0B, 1, layoutParams);
        A0K();
        A0X();
    }

    private void A0k(boolean z, int i) {
        if (this.A0J != null && this.A0q) {
            this.A0J.setCloseButtonVisibility(z ? 0 : 4);
            C1153dL adContextWrapper = getAdContextWrapper();
            String[] strArr = A0t;
            if (strArr[4].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0t;
            strArr2[4] = "GBT9VwLYKrAlXj";
            strArr2[0] = "vffPPOX2qjrj4g";
            adContextWrapper.A0F().ABc(!z, i);
        }
    }

    private boolean A0l() {
        return this.A0H.A20().A0H().A0B() && this.A0b && !this.A0e && !this.A0Z;
    }

    private boolean A0m() {
        return this.A0q && this.A0a;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0987ae
    public final ME A1A(String str) {
        return this.A0O.A02(str);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0987ae
    public final void A1B() {
        if (this.A0c) {
            this.A0f.removeCallbacks(this.A0n);
        }
        this.A0A.removeCallbacksAndMessages(null);
        A0O();
        super.A1B();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0987ae
    public final void A1C() {
        AbstractC0883Xm A0C = this.A0N.A0C();
        if (A0C != null) {
            A0C.setPageDetailsVisible((A1U() || A0C.A0B()) ? false : true);
        }
        this.A0b = false;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0987ae
    public final void A1D() {
        if (this.A0N.A0C() != null) {
            this.A0N.A0C().setPageDetailsVisible(false);
        }
        this.A0b = true;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0987ae
    public final void A1E() {
        this.A0Z = false;
        this.A0a = false;
        A0k(true, 3);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0987ae
    public final void A1F() {
        this.A0Z = this.A0H.A20().A0H().A04() > 0;
        this.A0a = true;
        A0k(false, 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0052  */
    @Override // com.instagram.common.viewpoint.core.AbstractC0987ae
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A1G(C0607Mp c0607Mp, String str, double d, Bundle bundle) {
        super.A1G(c0607Mp, str, d, bundle);
        this.A0O.setCta(this.A0H.A20().A0J(), this.A0H.A25(), new HashMap<>(), this.A0j);
        String A0E = c0607Mp.A0I().A0E();
        if (A0E != null) {
            String description = A0E.trim();
            if (description.length() != 0) {
                this.A0G.setText(A0E);
                if (U7.A17(this.A0N.A06())) {
                    LinearLayout linearLayout = this.A0E;
                    String[] strArr = A0t;
                    if (strArr[2].charAt(25) == strArr[7].charAt(25)) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A0t;
                    strArr2[3] = "eomTAZA5kOTO";
                    strArr2[1] = "I37n";
                    linearLayout.setClickable(true);
                }
                if (d > 0.0d) {
                    this.A03 = (int) (this.A06 / d);
                }
                this.A03 = !this.A0P ? this.A04 : this.A03;
            }
        }
        XP.A0L(this.A0E, 8);
        if (U7.A17(this.A0N.A06())) {
            this.A0E.setClickable(false);
        }
        if (d > 0.0d) {
        }
        this.A03 = !this.A0P ? this.A04 : this.A03;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0987ae
    public final void A1H(C01193d c01193d) {
        super.A1H(c01193d);
        if (this.A0H.A20().A0K().A04() && !A1U()) {
            A0V();
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0987ae
    public final boolean A1L() {
        return !A1U();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0987ae
    public final boolean A1M() {
        return true;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0987ae
    public final boolean A1N(boolean z) {
        if (A1U()) {
            getAdContextWrapper().A0F().ABb();
            A0i(false);
            return true;
        }
        if (A0l()) {
            getAdContextWrapper().A0F().ABf();
            this.A0l.A07(this);
            return true;
        }
        if (this.A0H.A20().A0K().A04()) {
            getAdContextWrapper().A0F().ABg();
            if (this.A0B instanceof E1) {
                E1 simpleVideoView = (E1) this.A0B;
                simpleVideoView.A0k(true);
            }
            A0V();
            return true;
        }
        getAdContextWrapper().A0F().ABd();
        return false;
    }

    public final /* synthetic */ void A1O() {
        this.A0N.A06().A0F().ABi();
    }

    public final /* synthetic */ void A1P() {
        if (this.A0M != null) {
            this.A0N.A06().A0F().ABh();
            this.A0M.A0E(A0J(49, 14, 21));
        }
    }

    public final /* synthetic */ void A1Q() {
        if (this.A0M != null) {
            this.A0N.A06().A0F().ABl();
            this.A0M.A0E(A0J(63, 22, 27));
        }
    }

    public final /* synthetic */ void A1S(View view) {
        A0M();
    }

    public final /* synthetic */ void A1T(View view) {
        XJ.A00(new Runnable() { // from class: com.facebook.ads.redexgen.X.ax
            @Override // java.lang.Runnable
            public final void run() {
                JU.this.A1P();
            }
        });
    }

    public final boolean A1U() {
        return this.A0Q;
    }

    public final /* synthetic */ boolean A1V(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (this.A0p.isEmpty()) {
            return true;
        }
        Iterator<String> it = this.A0p.iterator();
        while (it.hasNext()) {
            if (!str.contains(it.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0987ae
    public int getCloseButtonStyle() {
        if (A1U()) {
            return A0m() ? 2 : 3;
        }
        if (this.A0H.A20().A0H().A02() >= 0 && A1L() && (this.A0Z || this.A0b)) {
            return 8;
        }
        if (this.A0Z) {
            return 2;
        }
        if (this.A0H.A20().A0H().A0B()) {
            return 1;
        }
        if (this.A0b) {
            return 4;
        }
        if (this.A0H.A20().A0K().A04()) {
            return 1;
        }
        return super.getCloseButtonStyle();
    }

    private KE getRegularCtaForEndCard() {
        KE ke = new KE(getAdContextWrapper(), this.A0N.A05().A0r(), this.A0H.A1z().A01(), getAdEventManager(), this.A0N.A0D(), (C1226eX) null, this.A0N.A0A(), this.A0H.A21());
        ke.setViewShowsOverMedia(true);
        XP.A0I(ke);
        ke.setText(this.A0H.A20().A0J().A04());
        XP.A0E(1001, ke);
        ke.setCta(this.A0H.A20().A0J(), this.A0H.A25(), new HashMap(), null);
        return ke;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0987ae, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A0j(A1U());
        A0Y();
        setupLayoutConfiguration(A1U());
        A0W();
        if (this.A0Y && Build.VERSION.SDK_INT >= 35) {
            Object parent = getParent();
            if (parent instanceof View) {
                View parentView = (View) parent;
                parentView.setFitsSystemWindows(false);
                parentView.setPadding(0, 0, 0, 0);
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0987ae
    public void setChainedWatchAndBrowseSkippableStatus(boolean z) {
        this.A0a = !z;
        A0k(z, 4);
    }

    public void setChildChainedAd(boolean z) {
        this.A0W = z;
    }

    private void setUpBrowserControls(LJ lj) {
        XP.A0H(this.A0J);
        this.A0J = new ZO(this.A0N.A06(), lj, true, this.A0r);
        if (this.A0q) {
            String[] strArr = A0t;
            if (strArr[4].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0t;
            strArr2[4] = "M6ycP1RHJpeE8b";
            strArr2[0] = "ycEZieyXOIyeai";
            A0k(false, 1);
        }
        lj.setBrowserNavigationListener(this.A0J.getBrowserNavigationListener());
        XP.A0I(this.A0J);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.weight = 0.1f;
        this.A0J.setListener(new C0520Jf(this));
        this.A0J.setOnTouchListener(new ViewOnTouchListenerC1009b0(this));
        this.A0D.addView(this.A0J, layoutParams);
        XP.A0H(this.A0K);
        this.A0K = new ZP(this.A0N.A06(), null, R.attr.progressBarStyleHorizontal);
        this.A0D.addView(this.A0K, new LinearLayout.LayoutParams(-1, A0u));
    }

    private void setupLayoutConfiguration(boolean z) {
        this.A0P = getResources().getConfiguration().orientation == 2;
        this.A07 = this.A0N.A0C() != null ? this.A0N.A0C().getToolbarHeight() : 0;
        this.A0Q = z;
        this.A04 = Resources.getSystem().getDisplayMetrics().heightPixels;
        this.A06 = Resources.getSystem().getDisplayMetrics().widthPixels;
        Point point = new Point();
        WindowManager windowManager = (WindowManager) getAdContextWrapper().getSystemService(A0J(43, 6, 26));
        if (windowManager != null) {
            if (Build.VERSION.SDK_INT >= 30) {
                WindowMetrics windowMetrics = windowManager.getCurrentWindowMetrics();
                point.y = windowMetrics.getBounds().bottom - windowMetrics.getBounds().top;
            } else {
                windowManager.getDefaultDisplay().getRealSize(point);
            }
        }
        this.A05 = point.y > 0 ? point.y : this.A04;
        this.A03 = this.A04;
    }
}
