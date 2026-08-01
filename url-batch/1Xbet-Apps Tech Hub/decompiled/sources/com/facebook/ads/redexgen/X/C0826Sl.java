package com.facebook.ads.redexgen.X;

import android.R;
import android.animation.Animator;
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
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.common.base.Ascii;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.facebook.ads.redexgen.X.Sl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0826Sl extends AbstractC0706Nv {
    public static byte[] A0l;
    public static String[] A0m = {"E7d9V", "HfiTPdnQE6JsOHdYoOA4lRNnbQ3", "7AVXCU5oRbsgBqmorHmAVCwb6r5tuTQ8", "hoWzaZbN7yXesQFa", "a3ZYa3", "EXUfJIeYYGyfdCGOPOS2l0on83CPH94Z", "MYJwByDzw5bCUSkxw6qgTJ7WJbI", "X3l5ZIwYV4"};
    public static final int A0n;
    public static final int A0o;
    public static final int A0p;
    public static final int A0q;
    public static final int A0r;
    public static final int A0s;
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
    public View A0A;
    public InputMethodManager A0B;
    public LinearLayout A0C;
    public LinearLayout A0D;
    public RelativeLayout A0E;
    public TextView A0F;
    public AbstractC1045aS A0G;
    public C0681Mw A0H;
    public C0682Mx A0I;
    public TJ A0J;
    public T3 A0K;
    public C0710Nz A0L;
    public OL A0M;
    public boolean A0N;
    public boolean A0O;
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
    public final Handler A0b;
    public final View A0c;
    public final AbstractC01360g A0d;
    public final C0573In A0e;
    public final InterfaceC0690Nf A0f;
    public final C0691Ng A0g;
    public final C0587Jb A0h;
    public final Runnable A0i;
    public final Runnable A0j;
    public final Set<String> A0k;

    public static String A0J(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0l, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 122);
        }
        return new String(copyOfRange);
    }

    public static void A0W() {
        A0l = new byte[]{125, 10, 5, 0, 10, 2, 54, Ascii.SUB, 6, Ascii.FS, Ascii.ESC, 10, Ascii.FF, Ascii.VT, 9, Ascii.CAN, 62, Ascii.CR, Ascii.ESC, 36, 9, 5, Ascii.VT, 4, Ascii.CAN, 108, 107, 117, 112, 113, 90, 104, 96, 113, 109, 106, 97, Ascii.CR, Ascii.VT, Ascii.GS, 10, Ascii.ESC, Ascii.DC4, 17, Ascii.ESC, 19, 39, Ascii.RS, 17, Ascii.DC4, Ascii.FF, Ascii.GS, 10, Ascii.GS, Ascii.FS, 102, 120, Byte.MAX_VALUE, 117, 126, 102, 2, Ascii.ESC, Ascii.FS, 42, Ascii.SYN, 1, Ascii.DC4, 42, Ascii.ETB, 0, 1, 1, Ascii.SUB, Ascii.ESC, Byte.MAX_VALUE, 102, 97, 87, Byte.MAX_VALUE, 109, 106, 87, 97, 102, 123, 124, 105, 100, 100, 87, 106, 125, 124, 124, 103, 102, 10};
    }

    static {
        A0W();
        A0q = (int) (C0627Ku.A02 * 26.0f);
        A0n = (int) (C0627Ku.A02 * 4.0f);
        A0s = (int) (C0627Ku.A02 * 8.0f);
        A0o = (int) (C0627Ku.A02 * 24.0f);
        A0p = C01842d.A01(-1, 77);
        A0r = (int) (C0627Ku.A02 * 12.0f);
    }

    public C0826Sl(C0710Nz c0710Nz) {
        super(c0710Nz, true);
        this.A0X = false;
        this.A02 = -1;
        this.A0Y = false;
        this.A03 = 0;
        this.A0N = false;
        this.A0U = false;
        this.A0W = false;
        this.A0V = false;
        this.A0Z = false;
        this.A0R = false;
        this.A0T = false;
        this.A0S = false;
        this.A0Q = false;
        this.A08 = 0;
        this.A01 = 0;
        this.A0j = new OD(this);
        this.A0a = false;
        this.A0P = false;
        this.A0k = new HashSet();
        this.A0b = new Handler(Looper.getMainLooper());
        this.A0i = new Runnable() { // from class: com.facebook.ads.redexgen.X.O8
            @Override // java.lang.Runnable
            public final void run() {
                C0826Sl.this.A15();
            }
        };
        this.A09 = new Handler(Looper.getMainLooper());
        this.A0B = (InputMethodManager) c0710Nz.A05().getSystemService(A0J(25, 12, 127));
        this.A0L = c0710Nz;
        this.A0G = c0710Nz.A04();
        this.A0e = new C0573In(c0710Nz.A04().A11(), c0710Nz.A06());
        C0587Jb A0A = this.A0L.A0A();
        this.A0h = A0A;
        if (A0A != null) {
            LV.A0K(A0A);
        }
        View A03 = this.A0L.A03();
        this.A0c = A03;
        this.A0d = C01370h.A01(c0710Nz.A05(), c0710Nz.A06(), c0710Nz.A04().A11(), C0611Kc.A00(c0710Nz.A04().A0v().A0F().A05()), new HashMap(), false, true, this.A0G.A0x());
        C0700Np.A00(c0710Nz.A05(), this, c0710Nz.A04().A0v().A0D().A07());
        setupLayoutConfiguration(false);
        A0S();
        A0O();
        postDelayed(new C0829So(this), 1000L);
        A0V();
        C0828Sn c0828Sn = new C0828Sn(this);
        this.A0f = c0828Sn;
        RX rx = this.A0L.A02() instanceof RX ? (RX) this.A0L.A02() : null;
        this.A0g = new C0691Ng(c0710Nz, this.A0G, rx, this.A0L.A09(), c0828Sn, this.A0F, this.A0M, A0A, A03);
        if (rx != null && IP.A19(getAdContextWrapper())) {
            NO.A00(rx.getVideoImplView(), IP.A1A(getAdContextWrapper()), new OE(this));
        } else if (rx == null && this.A0A != null && IP.A17(getAdContextWrapper())) {
            NO.A00(this.A0A, IP.A18(getAdContextWrapper()), new OF(this));
        }
        this.A0E = null;
        this.A0K = null;
    }

    public C0826Sl(C0710Nz c0710Nz, boolean z) {
        this(c0710Nz);
        this.A0X = z;
        AbstractC1045aS A04 = c0710Nz.A04();
        this.A0Y = this.A0X && A04.A0m();
        if (this.A0X) {
            int A0E = A04.A0E();
            this.A02 = A0E;
            if (A0E == 0) {
                A15();
            } else if (A0E > 0 && A0E <= 10000) {
                this.A0b.postDelayed(this.A0i, A0E);
            }
            this.A0a = KZ.A0J(c0710Nz.A05(), A04.A11());
            String A0T = A04.A0T();
            if (!TextUtils.isEmpty(A0T)) {
                for (String stringToCheck : A0T.split(A0J(0, 1, 39))) {
                    this.A0k.add(stringToCheck);
                }
            }
        }
    }

    public static /* synthetic */ int A03(C0826Sl c0826Sl) {
        int i = c0826Sl.A01;
        c0826Sl.A01 = i + 1;
        return i;
    }

    public static /* synthetic */ int A05(C0826Sl c0826Sl) {
        int i = c0826Sl.A08;
        c0826Sl.A08 = i + 1;
        return i;
    }

    private void A0K() {
        LV.A0J(this.A0D);
        LinearLayout linearLayout = new LinearLayout(this.A0L.A05());
        this.A0D = linearLayout;
        LV.A0R(linearLayout, getAdContextWrapper());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.A0N ? this.A04 / 4 : this.A04 / 5);
        layoutParams.addRule(12);
        this.A0D.setLayoutParams(layoutParams);
        addView(this.A0D, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A0L, reason: merged with bridge method [inline-methods] */
    public void A15() {
        A0c(((FH) this.A0d).A0G().toString());
        A0f(true);
    }

    private void A0M() {
        LP.A00(new Runnable() { // from class: com.facebook.ads.redexgen.X.O7
            @Override // java.lang.Runnable
            public final void run() {
                C0826Sl.this.A14();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0N() {
        if (this.A0G.A0j() && this.A0P) {
            this.A0P = false;
            A0d(A0J(37, 18, 2));
        }
    }

    private void A0O() {
        LV.A0J(this.A0C);
        LinearLayout linearLayout = new LinearLayout(this.A0L.A05());
        this.A0C = linearLayout;
        linearLayout.setOrientation(1);
        LV.A0K(this.A0C);
        A0T();
        this.A0C.setBackgroundColor(-1);
        addView(this.A0C);
    }

    private void A0P() {
        View view = this.A0c;
        if (view != null) {
            LV.A0J(view);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(AbstractC0706Nv.A08, AbstractC0706Nv.A08);
            layoutParams.addRule(10);
            layoutParams.addRule(11);
            layoutParams.setMargins(AbstractC0706Nv.A07, this.A07, AbstractC0706Nv.A07, AbstractC0706Nv.A07);
            addView(this.A0c, layoutParams);
        }
    }

    private void A0Q() {
        C0587Jb c0587Jb = this.A0h;
        if (c0587Jb != null) {
            LV.A0J(c0587Jb);
            C0587Jb c0587Jb2 = this.A0h;
            int i = A0r;
            c0587Jb2.setPadding(i, i, i, i);
            this.A0h.A06(-1, A0p);
            this.A0h.setTranslationY(0.0f);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, A0q);
            layoutParams.addRule(12);
            addView(this.A0h, layoutParams);
        }
    }

    private void A0R() {
        AbstractC0651Ls A08 = this.A0L.A08();
        if (A08 == null) {
            return;
        }
        A08.setPageDetailsVisible((this.A0O || A08.A07()) ? false : true);
    }

    private void A0S() {
        this.A0A = this.A0L.A02();
        if (this.A0G.A0j()) {
            this.A0A.setOnClickListener(new OG(this));
        }
        LV.A0J(this.A0A);
        LV.A0K(this.A0A);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(15);
        addView(this.A0A, 1, layoutParams);
        TextView textView = new TextView(this.A0L.A05());
        this.A0F = textView;
        LV.A0K(textView);
        this.A0F.setGravity(17);
        this.A0F.setTextColor(getColors().A05(true));
        this.A0F.setEllipsize(TextUtils.TruncateAt.END);
        this.A0F.setMaxLines(2);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(12);
        int i = A0s;
        layoutParams2.setMargins(i, i / 2, i, this.A0h == null ? i : A0q);
        addView(this.A0F, layoutParams2);
        LV.A0K(this.A0F);
        C0710Nz c0710Nz = this.A0L;
        OL ol = new OL(c0710Nz, c0710Nz.A04().A0v().A0F().A04(), getColors(), new C0827Sm(this));
        this.A0M = ol;
        ol.setAutoClickTime(this.A0L.A04(), this.A0L.A08());
        LV.A0G(1001, this.A0M);
        addView(this.A0M);
        A0U();
        A0K();
        if (IP.A0z(this.A0L.A05())) {
            this.A0D.setOnClickListener(new OH(this));
            if (this.A0L.A08() != null) {
                this.A0L.A08().setCTAClickListener(new OI(this));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0T() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.A05);
        if (A18()) {
            layoutParams.setMargins(0, this.A05 / 5, 0, 0);
            layoutParams.addRule(12);
            String[] strArr = A0m;
            if (strArr[7].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0m;
            strArr2[7] = "mOqhFUC5R4";
            strArr2[4] = "x2rQdK";
            this.A0C.setLayoutParams(layoutParams);
        } else {
            layoutParams.setMargins(0, this.A05 + 1, 0, 0);
        }
        this.A0C.setTranslationY(0.0f);
        this.A0C.setLayoutParams(layoutParams);
    }

    private void A0U() {
        C1M A00;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, this.A0N ? this.A04 / 4 : this.A04 / 5);
        layoutParams.addRule(14);
        layoutParams.addRule(2, this.A0F.getId());
        layoutParams.setMargins(0, 0, 0, 0);
        this.A0M.setLayoutParams(layoutParams);
        if (this.A0Y && this.A0K != null) {
            boolean z = this.A0N;
            if (A0m[5].charAt(10) == 'N') {
                throw new RuntimeException();
            }
            A0m[2] = "dOHlU7mObztTib9yLp7cTgFqT8sjFKca";
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(z ? -2 : -1, -2);
            layoutParams2.addRule(12);
            layoutParams2.addRule(14);
            int i = A0o;
            layoutParams2.setMargins(i, 0, i, i);
            if (getContext().getResources().getConfiguration().orientation == 1) {
                A00 = this.A0L.A04().A0u().A01();
            } else {
                A00 = this.A0L.A04().A0u().A00();
            }
            this.A0K.setUpButtonColors(A00);
            if (this.A0N) {
                this.A0K.setPadding(i, 0, i, 0);
            }
            this.A0K.setLayoutParams(layoutParams2);
        }
    }

    private void A0V() {
        A0Q();
        A0P();
        A0R();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0c(String str) {
        TJ tj;
        C1M A00;
        C1M A002;
        if (this.A0Y) {
            LV.A0J(this.A0E);
            LV.A0J(this.A0K);
        }
        LV.A0J(this.A0J);
        C0831Sq c0831Sq = new C0831Sq(this);
        if (this.A0L.A05().A0D() == null) {
            this.A0L.A05().A0E().A8U();
        }
        if (!IQ.A02(this.A0L.A05()) && this.A0L.A05().A0D() != null) {
            tj = new TJ(this.A0L.A05(), this.A0L.A05().A0D(), c0831Sq);
        } else {
            tj = new TJ(this.A0L.A05(), c0831Sq);
        }
        this.A0J = tj;
        if (this.A0X) {
            tj.setInterceptRedirectRequest(new N4() { // from class: com.facebook.ads.redexgen.X.St
                @Override // com.facebook.ads.redexgen.X.N4
                public final boolean A91(String str2) {
                    return C0826Sl.this.A19(str2);
                }
            });
        }
        if (this.A0G.A0l() && Build.VERSION.SDK_INT > 16) {
            this.A0J.addJavascriptInterface(new C0702Nr(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.O5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C0826Sl.this.A16(view);
                }
            }, this.A0J, new InterfaceC0701Nq() { // from class: com.facebook.ads.redexgen.X.Ss
                @Override // com.facebook.ads.redexgen.X.InterfaceC0701Nq
                public final void AAq() {
                    C0826Sl.this.A12();
                }
            }), C0702Nr.A01());
        }
        this.A0J.setOnTouchListener(new OA(this));
        setUpBrowserControls(this.A0J);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.weight = 0.9f;
        if (this.A0Y || this.A0G.A0l()) {
            YA A05 = this.A0L.A05();
            String A0K = this.A0L.A04().A0K();
            if (this.A0L.A00() == 1) {
                A00 = this.A0L.A04().A0u().A01();
            } else {
                A00 = this.A0L.A04().A0u().A00();
            }
            T3 t3 = new T3(A05, A0K, A00, this.A0L.A04().A0v().A0F().A06(), this.A0L.A06(), this.A0L.A09(), this.A0L.A0B(), this.A0L.A07(), this.A0L.A04().A0x());
            this.A0K = t3;
            t3.setCta(this.A0L.A04().A0v().A0F(), this.A0L.A04().A11(), new HashMap());
        }
        if (!this.A0Y || this.A0K == null) {
            this.A0C.addView(this.A0J, layoutParams);
        } else {
            this.A0E = new RelativeLayout(getContext());
            this.A0E.addView(this.A0J, new RelativeLayout.LayoutParams(-1, -1));
            LV.A0K(this.A0K);
            this.A0K.setRoundedCornersEnabled(A00());
            this.A0K.setViewShowsOverMedia(A0D());
            if (getContext().getResources().getConfiguration().orientation == 1) {
                A002 = this.A0L.A04().A0u().A01();
            } else {
                A002 = this.A0L.A04().A0u().A00();
            }
            this.A0K.setUpButtonColors(A002);
            if (this.A0N) {
                T3 t32 = this.A0K;
                int i = A0o;
                t32.setPadding(i, 0, i, 0);
            }
            this.A0K.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.O6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C0826Sl.this.A17(view);
                }
            });
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(this.A0N ? -2 : -1, -2);
            layoutParams2.addRule(12);
            layoutParams2.addRule(14);
            int i2 = A0o;
            layoutParams2.setMargins(i2, 0, i2, i2);
            this.A0E.addView(this.A0K, layoutParams2);
            this.A0C.addView(this.A0E, layoutParams);
        }
        this.A0J.loadUrl(str);
    }

    private void A0d(String str) {
        Map<String, String> A05 = new NL().A03(null).A02(null).A05();
        A05.put(A0J(1, 12, 19), str);
        this.A0e.A04(EnumC0572Im.A0J, A05);
        getAdEventManager().A9V(this.A0G.A11(), A05);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0e(String str) {
        if (this.A0G.A0s() > 0) {
            if (this.A0G.A18() && this.A0Q) {
                return;
            }
            this.A0Q = true;
            A0d(str);
            return;
        }
        if (this.A0G.A0i()) {
            A0N();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0f(boolean z) {
        this.A0O = z;
        if (this.A0X && z) {
            this.A0b.removeCallbacks(this.A0i);
        }
        ObjectAnimator objectAnimator = null;
        if (!z) {
            this.A09.removeCallbacksAndMessages(null);
        } else {
            this.A01 = 0;
            this.A08 = 0;
            this.A0R = false;
            this.A0S = false;
            this.A0T = false;
            this.A0Q = false;
        }
        postDelayed(new C0830Sp(this, z), 250L);
        String A0J = A0J(97, 1, 9);
        if (z) {
            OL ol = this.A0M;
            objectAnimator = ObjectAnimator.ofFloat(ol, A0J, ol.getY(), this.A05 / 5);
        }
        LinearLayout linearLayout = this.A0C;
        float[] fArr = new float[2];
        fArr[0] = linearLayout.getY();
        int i = this.A05;
        if (z) {
            i /= 5;
        }
        fArr[1] = i;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(linearLayout, A0J, fArr);
        ofFloat.setDuration(500L);
        View view = this.A0A;
        ObjectAnimator browserTransAnim = ObjectAnimator.ofFloat(view, A0J, view.getY(), 0.0f);
        browserTransAnim.setDuration(500L);
        int[] iArr = new int[2];
        iArr[0] = this.A0A.getHeight();
        int i2 = this.A05;
        if (z) {
            i2 /= 5;
        }
        iArr[1] = i2;
        ValueAnimator duration = ValueAnimator.ofInt(iArr).setDuration(500L);
        duration.addUpdateListener(new OB(this));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.playTogether(ofFloat, browserTransAnim, duration);
        if (objectAnimator != null) {
            objectAnimator.setDuration(500L);
            Animator[] animatorArr = {objectAnimator};
            String[] strArr = A0m;
            if (strArr[3].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0m;
            strArr2[6] = "3HcTndNMKO02itZ1YB9OuMlfPHE";
            strArr2[1] = "rUq8gYLqYGWwvrPw2H7I5hxcdAd";
            animatorSet.playTogether(animatorArr);
        }
        animatorSet.addListener(new OC(this, z));
        animatorSet.start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0095, code lost:
    
        if (r6.getConfiguration().orientation == 2) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009b, code lost:
    
        if ((r7.A0A instanceof com.facebook.ads.redexgen.X.RX) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009d, code lost:
    
        r2 = new android.widget.RelativeLayout.LayoutParams(-2, -1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b2, code lost:
    
        if (r6.getConfiguration().orientation == 2) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A0g(boolean z) {
        RelativeLayout.LayoutParams layoutParams;
        setupLayoutConfiguration(z);
        LV.A0J(this.A0A);
        if (this.A0A == null) {
            View A02 = this.A0L.A02();
            this.A0A = A02;
            LV.A0K(A02);
        }
        boolean z2 = this.A0O;
        String[] strArr = A0m;
        if (strArr[3].length() == strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0m;
        strArr2[7] = "FZuJEB1DgE";
        strArr2[4] = "ioAK5D";
        if (z2) {
            layoutParams = new RelativeLayout.LayoutParams(-1, this.A05 / 5);
            layoutParams.addRule(14);
            layoutParams.addRule(10);
        } else {
            layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            if (IP.A17(getAdContextWrapper())) {
                Resources resources = getResources();
                if (A0m[2].charAt(2) != 'l') {
                    String[] strArr3 = A0m;
                    strArr3[6] = "pPe40HbQyCL07tY4s4c8j3Lf22g";
                    strArr3[1] = "FpZU0oL4KOaHbXLVjTxOhAl2PJv";
                }
            }
            layoutParams.addRule(13);
            A0O();
        }
        this.A0A.setTranslationY(0.0f);
        addView(this.A0A, 1, layoutParams);
        A0K();
        A0U();
    }

    private boolean A0h() {
        if (this.A0G.A0v().A0D().A0A()) {
            boolean z = this.A0V;
            String[] strArr = A0m;
            if (strArr[3].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0m;
            strArr2[7] = "WvW0Ef6T7c";
            strArr2[4] = "9KXIlI";
            if (z && !this.A0Z && !this.A0W) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0706Nv
    public final void A0u() {
        if (this.A0X) {
            this.A0b.removeCallbacks(this.A0i);
        }
        super.A0u();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0706Nv
    public final void A0v() {
        AbstractC0651Ls A08 = this.A0L.A08();
        if (A08 != null) {
            A08.setPageDetailsVisible((A18() || A08.A07()) ? false : true);
        }
        this.A0V = false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0706Nv
    public final void A0w() {
        if (this.A0L.A08() != null) {
            AbstractC0651Ls A08 = this.A0L.A08();
            String[] strArr = A0m;
            if (strArr[6].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0m;
            strArr2[3] = "MMiJw7TNUivh7iTB";
            strArr2[0] = "GEB80";
            A08.setPageDetailsVisible(false);
        }
        this.A0V = true;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0706Nv
    public final void A0x() {
        this.A0W = false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0706Nv
    public final void A0y() {
        this.A0W = this.A0G.A0v().A0D().A03() > 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0036  */
    @Override // com.facebook.ads.redexgen.X.AbstractC0706Nv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A0z(C1D c1d, String str, double d, Bundle bundle) {
        String str2;
        String description;
        int i;
        super.A0z(c1d, str, d, bundle);
        String A05 = c1d.A0E().A05();
        if (A05 != null) {
            String description2 = A05.trim();
            if (description2.length() != 0) {
                this.A0F.setText(A05);
                if (IP.A0z(this.A0L.A05())) {
                    LinearLayout linearLayout = this.A0D;
                    String[] strArr = A0m;
                    String str3 = strArr[3];
                    String description3 = strArr[0];
                    if (str3.length() != description3.length()) {
                        A0m[2] = "Tti1ERh3982vMPWOgwyCGNbTUdK6PILe";
                        linearLayout.setClickable(true);
                    } else {
                        A0m[2] = "fnWnWSkw0ES4UX172ZpEF9XfJQ6oKenC";
                        linearLayout.setClickable(true);
                    }
                }
                if (d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                    this.A03 = (int) (this.A06 / d);
                }
                boolean z = this.A0N;
                String[] strArr2 = A0m;
                str2 = strArr2[6];
                description = strArr2[1];
                if (str2.length() == description.length()) {
                    throw new RuntimeException();
                }
                A0m[2] = "7Lq3s7aOnX5NGbRVe2GBF9HLZ2EE6fpE";
                if (z) {
                    i = this.A04;
                } else {
                    i = this.A03;
                }
                this.A03 = i;
                return;
            }
        }
        LV.A0N(this.A0D, 8);
        if (IP.A0z(this.A0L.A05())) {
            this.A0D.setClickable(false);
        }
        if (d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
        }
        boolean z2 = this.A0N;
        String[] strArr22 = A0m;
        str2 = strArr22[6];
        description = strArr22[1];
        if (str2.length() == description.length()) {
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0706Nv
    public final boolean A10() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0706Nv
    public final boolean A11(boolean z) {
        if (A18()) {
            A0f(false);
            return true;
        }
        if (!A0h()) {
            return false;
        }
        this.A0g.A07(this);
        return true;
    }

    public final /* synthetic */ void A12() {
        this.A0L.A05().A0E().A9t();
    }

    public final /* synthetic */ void A13() {
        if (this.A0K != null) {
            if (this.A0a) {
                if (A0m[2].charAt(2) == 'l') {
                    throw new RuntimeException();
                }
                A0m[5] = "pGBCzqXwIkLG48GrIEt64qcHW3Hm9O6f";
                A0f(false);
            }
            this.A0L.A05().A0E().A9s();
            this.A0K.A09(A0J(61, 14, 15));
        }
    }

    public final /* synthetic */ void A14() {
        if (this.A0K != null) {
            boolean z = this.A0a;
            String[] strArr = A0m;
            if (strArr[3].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0m;
            strArr2[3] = "tCgjPTcwsN2cZ99v";
            strArr2[0] = "Ilqrg";
            if (z) {
                A0f(false);
            }
            this.A0L.A05().A0E().A9w();
            this.A0K.A09(A0J(75, 22, 114));
        }
    }

    public final /* synthetic */ void A16(View view) {
        A0M();
    }

    public final /* synthetic */ void A17(View view) {
        LP.A00(new Runnable() { // from class: com.facebook.ads.redexgen.X.O4
            @Override // java.lang.Runnable
            public final void run() {
                C0826Sl.this.A13();
            }
        });
    }

    public final boolean A18() {
        return this.A0O;
    }

    public final /* synthetic */ boolean A19(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (this.A0k.isEmpty()) {
            return true;
        }
        Iterator<String> it = this.A0k.iterator();
        while (it.hasNext()) {
            boolean contains = str.contains(it.next());
            if (A0m[2].charAt(2) == 'l') {
                throw new RuntimeException();
            }
            A0m[5] = "Sf20Awxc2HRh1lAKHxXJmSVrTf5ojylw";
            if (!contains) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0706Nv
    public int getCloseButtonStyle() {
        if (A18()) {
            return 3;
        }
        if (this.A0W) {
            return 2;
        }
        if (this.A0G.A0v().A0D().A0A()) {
            return 1;
        }
        if (!this.A0V) {
            return super.getCloseButtonStyle();
        }
        if (A0m[5].charAt(10) == 'N') {
            throw new RuntimeException();
        }
        String[] strArr = A0m;
        strArr[6] = "NhzVRhgvHrOwM64xV2PIAOEbNcq";
        strArr[1] = "xEzMNY3CkayGfsMDFyAKLsf22gx";
        return 4;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0706Nv, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A0g(A18());
        A0V();
        setupLayoutConfiguration(A18());
        A0T();
    }

    private void setUpBrowserControls(TJ tj) {
        LV.A0J(this.A0H);
        C0681Mw c0681Mw = new C0681Mw(this.A0L.A05(), tj);
        this.A0H = c0681Mw;
        tj.setBrowserNavigationListener(c0681Mw.getBrowserNavigationListener());
        LV.A0K(this.A0H);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.weight = 0.1f;
        this.A0H.setListener(new C0832Sr(this));
        this.A0H.setOnTouchListener(new O9(this));
        this.A0C.addView(this.A0H, layoutParams);
        LV.A0J(this.A0I);
        this.A0I = new C0682Mx(this.A0L.A05(), null, R.attr.progressBarStyleHorizontal);
        this.A0C.addView(this.A0I, new LinearLayout.LayoutParams(-1, A0n));
    }

    private void setupLayoutConfiguration(boolean z) {
        this.A0N = getResources().getConfiguration().orientation == 2;
        this.A07 = this.A0L.A08() == null ? 0 : this.A0L.A08().getToolbarHeight();
        this.A0O = z;
        this.A04 = Resources.getSystem().getDisplayMetrics().heightPixels;
        this.A06 = Resources.getSystem().getDisplayMetrics().widthPixels;
        Point point = new Point();
        WindowManager windowManager = (WindowManager) getAdContextWrapper().getSystemService(A0J(55, 6, 107));
        if (windowManager != null) {
            if (Build.VERSION.SDK_INT >= 30) {
                WindowMetrics windowMetrics = windowManager.getCurrentWindowMetrics();
                point.y = windowMetrics.getBounds().bottom - windowMetrics.getBounds().top;
            } else {
                Display defaultDisplay = windowManager.getDefaultDisplay();
                if (Build.VERSION.SDK_INT >= 17) {
                    defaultDisplay.getRealSize(point);
                } else {
                    try {
                        Integer num = (Integer) Display.class.getMethod(A0J(13, 12, 22), new Class[0]).invoke(defaultDisplay, new Object[0]);
                        point.y = num != null ? num.intValue() : 0;
                    } catch (Exception unused) {
                    }
                }
            }
        }
        this.A05 = point.y > 0 ? point.y : this.A04;
        this.A03 = this.A04;
    }
}
