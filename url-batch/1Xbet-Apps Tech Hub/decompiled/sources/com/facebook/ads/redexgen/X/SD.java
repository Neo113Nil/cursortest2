package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.view.FullScreenAdToolbar;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: assets/audience_network.dex */
public final class SD extends FrameLayout implements InterfaceC0653Lu {
    public static byte[] A0L;
    public static String[] A0M = {"n8b1XAz0kHAkpiWEmzC3t1pF5U", "eWK394xXCAUBfgpESuKIG56NqbrNFWJq", "5CdOn8t3diym6HDjOq5Y6uNvOx4lt5g3", "HN0pIlpAYl374dQUYji0gU", "nPJn2NzIeBIJ0ob92wkGV5", "7vv965TmOe", "OL6PAd", "N5PSCRASy1"};
    public static final RelativeLayout.LayoutParams A0N;
    public int A00;
    public int A01;
    public int A02;
    public NZ A03;
    public AbstractC0733Ow A04;
    public PU A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final C1043aQ A0A;
    public final C5H A0B;
    public final C6Q A0C;
    public final YA A0D;
    public final InterfaceC0565If A0E;
    public final C0573In A0F;
    public final LI A0G;
    public final InterfaceC0652Lt A0H;
    public final FullScreenAdToolbar A0I;
    public final MM A0J;
    public final ArrayList<C0736Oz> A0K;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private AbstractC0733Ow A07(boolean z, int i) {
        boolean z2;
        SF sf = new SF(this, i);
        AbstractC1045aS A0t = this.A0A.A0t(this.A00);
        if (this.A0A.A10()) {
            int i2 = this.A00;
            String[] strArr = A0M;
            if (strArr[3].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            A0M[2] = "bDB0WKM3tjeRkIfEXbhmbXqmjWoJ3lp1";
            if (i2 > 0) {
                z2 = true;
                boolean z3 = !this.A0A.A0z() && this.A00 > 0;
                if (A0V(A0t)) {
                    this.A0D.A0E().AFV(EnumC01330d.A06);
                    this.A0D.A0E().AFB(this.A00);
                    this.A0D.A0E().A4A();
                    return new SM(this.A0D, this.A0E, A0t, this.A0C, this.A0J, this.A00, this.A0H, this.A0F, this.A0A.A0G(), i, this.A0A.A0p(), z, this.A0A.A0r(), this.A0A.A11(), z2, z3, sf);
                }
                int A00 = A00(this.A00);
                if (A00 == 0) {
                    this.A09 = true;
                }
                this.A0D.A0E().AFV(EnumC01330d.A05);
                this.A0D.A0E().AFB(this.A00);
                this.A0D.A0E().A4A();
                return new SQ(this.A0D, this.A0J, this.A00, this.A0E, A0t, this.A0H, this.A0I, z2, z3, sf, A00);
            }
        }
        z2 = false;
        if (this.A0A.A0z()) {
        }
        if (A0V(A0t)) {
        }
    }

    public static String A08(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0L, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 39);
        }
        return new String(copyOfRange);
    }

    public static void A0C() {
        A0L = new byte[]{113, -64, -73, 113, -62, -27, -95};
        String[] strArr = A0M;
        if (strArr[3].length() != strArr[4].length()) {
            throw new RuntimeException();
        }
        A0M[2] = "BvaU1dA3vF4hXYIjQV5InfWnSlZ4OmYy";
    }

    static {
        A0C();
        A0N = new RelativeLayout.LayoutParams(-1, -1);
    }

    public SD(YA ya, MM mm, InterfaceC0565If interfaceC0565If, C1043aQ c1043aQ, C6Q c6q, InterfaceC0652Lt interfaceC0652Lt) {
        super(ya);
        this.A0K = new ArrayList<>();
        this.A09 = false;
        this.A07 = false;
        this.A08 = false;
        this.A06 = true;
        this.A02 = 1;
        this.A00 = 0;
        this.A01 = 0;
        this.A0B = new SG(this);
        this.A0D = ya;
        this.A0J = mm;
        this.A0E = interfaceC0565If;
        this.A0A = c1043aQ;
        this.A0C = c6q;
        this.A0H = interfaceC0652Lt;
        this.A0F = new C0573In(c1043aQ.A0t(0).A11(), interfaceC0565If);
        LI li = new LI(this);
        this.A0G = li;
        li.A05(LH.A03);
        this.A05 = new PU(ya, mm, c1043aQ.A0S(), interfaceC0652Lt);
        FullScreenAdToolbar A04 = A04();
        this.A0I = A04;
        addView(A04, new FrameLayout.LayoutParams(-1, A04.getToolbarHeight()));
    }

    private int A00(int i) {
        if (this.A0A.A11() && i < this.A0A.A0w().size() && i >= 0) {
            return this.A0A.A0w().get(i).intValue();
        }
        return this.A0A.A0G();
    }

    public static /* synthetic */ int A01(SD sd, int i) {
        int i2 = sd.A01 + i;
        sd.A01 = i2;
        return i2;
    }

    private FullScreenAdToolbar A04() {
        FullScreenAdToolbar fullScreenAdToolbar = new FullScreenAdToolbar(this.A0D, this.A0H, this.A0F, 2);
        fullScreenAdToolbar.setFullscreen(true);
        fullScreenAdToolbar.setToolbarListener(new SE(this));
        return fullScreenAdToolbar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A09() {
        boolean acted = A0R();
        if (acted) {
            this.A0D.A0E().A4D();
        }
    }

    private void A0A() {
        int i = this.A00;
        if (i > 0 && !TextUtils.isEmpty(this.A0A.A0t(i - 1).A11())) {
            InterfaceC0565If interfaceC0565If = this.A0E;
            String A11 = this.A0A.A0t(this.A00 - 1).A11();
            NL nl = new NL();
            AbstractC0733Ow abstractC0733Ow = this.A04;
            NL A03 = nl.A03(abstractC0733Ow != null ? abstractC0733Ow.getAdViewabilityChecker() : null);
            AbstractC0733Ow abstractC0733Ow2 = this.A04;
            interfaceC0565If.A9J(A11, A03.A02(abstractC0733Ow2 != null ? abstractC0733Ow2.getTouchDataRecorder() : null).A05());
        }
    }

    private void A0B() {
        this.A0D.A0E().A4B();
        this.A07 = true;
        this.A03 = new NZ(this.A0D, this.A0A, this.A0E, this.A0H, this.A0I.getToolbarHeight(), this.A02);
        C0736Oz c0736Oz = null;
        Iterator<C0736Oz> it = this.A0K.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            if (A0M[1].charAt(22) == '6') {
                String[] strArr = A0M;
                strArr[7] = "ZPnrdglx3i";
                strArr[5] = "Z92DtyKnO3";
                if (!hasNext) {
                    break;
                }
                C0736Oz s = it.next();
                if (s.A00 == C0736Oz.A06) {
                    c0736Oz = s;
                    break;
                }
            } else {
                throw new RuntimeException();
            }
        }
        if (c0736Oz != null) {
            A0H(this.A03, c0736Oz);
        } else if (!this.A0K.isEmpty()) {
            A0H(this.A03, this.A0K.get(0));
        }
        A0P(true);
        this.A0I.setOnlyPageDetails(null);
        AbstractC0733Ow abstractC0733Ow = this.A04;
        if (abstractC0733Ow != null) {
            LV.A0J(abstractC0733Ow);
            this.A04.A0K();
            this.A04 = null;
        }
        LV.A0J(this.A03);
        LV.A0G(1102, this.A03);
        addView(this.A03, 0, new FrameLayout.LayoutParams(-1, -1));
    }

    private final void A0D() {
        if (Build.VERSION.SDK_INT < 19) {
            return;
        }
        this.A0G.A05(LH.A04);
    }

    private synchronized void A0E() {
        this.A0H.A3z(this.A0J.A5o());
        this.A05.A05();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0F(float f) {
        float seenCurrentPosMS;
        float A00 = A00(this.A00 - 1);
        float seenCurrentPosMS2 = (this.A0A.A11() ? 0 : this.A01) + f;
        if (A00 > 0.0f) {
            seenCurrentPosMS = seenCurrentPosMS2 / A00;
        } else {
            seenCurrentPosMS = 1.0f;
        }
        if (this.A06 && this.A0A.A11()) {
            this.A06 = false;
            this.A0I.setProgressImmediate(0.0f);
        }
        float unskippableSeconds = 100.0f * seenCurrentPosMS;
        this.A0I.setProgress(unskippableSeconds);
        if (seenCurrentPosMS >= 1.0f && !this.A09) {
            this.A09 = true;
            this.A0I.setToolbarActionMode(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0G(int i) {
        this.A0D.A0E().A48(i);
        this.A09 = true;
        A0E();
        A0A();
        this.A0H.A3z(this.A0J.A6n());
    }

    private void A0H(ViewGroup viewGroup, C0736Oz c0736Oz) {
        if (c0736Oz.A00 == C0736Oz.A06 && c0736Oz.A03 != null) {
            C0700Np.A00(this.A0D, viewGroup, c0736Oz.A03);
        } else {
            LV.A0M(viewGroup, c0736Oz.A01);
        }
        this.A0I.setFullscreen(c0736Oz.A05);
        this.A0I.A06(c0736Oz.A02, c0736Oz.A04);
    }

    private void A0I(AbstractC1045aS abstractC1045aS) {
        if (A0V(abstractC1045aS)) {
            int i = this.A02;
            if (A0M[2].charAt(7) != '3') {
                throw new RuntimeException();
            }
            A0M[2] = "vyv5r133RkdgG8M1gH7WIgZDBjsgq9Je";
            if (i == 2) {
                this.A0I.setOnlyPageDetails(abstractC1045aS.A0z());
                return;
            }
        }
        this.A0I.setOnlyPageDetails(null);
    }

    private final void A0J(C5J c5j) {
        c5j.A0N(this.A0B);
        int i = c5j.A0J().getResources().getConfiguration().orientation;
        this.A02 = i;
        A0Q(this.A0A.A0y(), i);
        A0D();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0P(boolean z) {
        boolean z2 = (!A0T() || A0S() || A0U()) ? false : true;
        boolean A0S = A0S();
        if (A0M[1].charAt(22) != '6') {
            throw new RuntimeException();
        }
        String[] strArr = A0M;
        strArr[7] = "fhNsXNJVUA";
        strArr[5] = "wXa0tVX5fv";
        if (!A0S && !z2) {
            this.A09 = true;
            if (z) {
                this.A0I.setToolbarActionMessage(A08(0, 0, 66));
            }
            this.A0I.setToolbarActionMode(0);
            return;
        }
        this.A0I.setToolbarActionMode(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0Q(boolean z, int i) {
        AbstractC0733Ow abstractC0733Ow = this.A04;
        if (abstractC0733Ow != null) {
            abstractC0733Ow.A0K();
            AbstractC0733Ow abstractC0733Ow2 = this.A04;
            if (A0M[1].charAt(22) != '6') {
                throw new RuntimeException();
            }
            A0M[2] = "W3TlfOl3oEXDpQnuuCTH10eCcUmU4b3A";
            abstractC0733Ow2.removeAllViews();
            LV.A0J(this.A04);
        }
        if (!A0S()) {
            this.A09 = true;
            if (A0T()) {
                A0B();
                return;
            } else {
                A0G(1);
                return;
            }
        }
        if (this.A0A.A11()) {
            this.A09 = false;
            this.A0I.setProgressImmediate(0.0f);
        }
        boolean isLoaded = this.A0D.A00().A8m(this.A0A.A0t(this.A00).A11(), this.A0A.A0u());
        if (!isLoaded) {
            this.A0D.A0E().A49();
            A0G(2);
            return;
        }
        AbstractC0733Ow A07 = A07(z, i);
        this.A04 = A07;
        setupToolbarForAd(A07);
        addView(this.A04, 0, A0N);
        this.A00++;
        this.A04.A0M();
    }

    private boolean A0R() {
        AbstractC0733Ow abstractC0733Ow;
        if (!this.A09) {
            AbstractC0733Ow abstractC0733Ow2 = this.A04;
            if (abstractC0733Ow2 == null || !abstractC0733Ow2.A0Q() || this.A0A.A0p() != 1) {
                return false;
            }
            A0Q(false, this.A02);
            return true;
        }
        if (A0S() && (abstractC0733Ow = this.A04) != null && (abstractC0733Ow.A0Q() || this.A0A.A0p() == 2)) {
            if (!this.A0A.A11()) {
                this.A08 = true;
            }
            A0Q(false, this.A02);
            return true;
        }
        AbstractC0733Ow abstractC0733Ow3 = this.A04;
        if (abstractC0733Ow3 != null && abstractC0733Ow3.A0P()) {
            this.A0I.setToolbarActionMode(0);
            this.A0D.A0E().A4C();
            this.A04.A0L();
            return true;
        }
        if (A0T() && !A0U()) {
            A0B();
            return true;
        }
        if ((this.A04 instanceof SQ) && A0S()) {
            A0Q(false, this.A02);
            return true;
        }
        this.A0F.A04(EnumC0572Im.A07, null);
        A0G(4);
        return true;
    }

    private boolean A0S() {
        return this.A00 < this.A0A.A0q();
    }

    private boolean A0T() {
        return this.A0A.A0p() == 2;
    }

    private final boolean A0U() {
        return this.A07;
    }

    public static boolean A0V(AbstractC1045aS abstractC1045aS) {
        return TextUtils.isEmpty(abstractC1045aS.A0v().A0D().A08());
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0653Lu
    public final void A9C(Intent intent, Bundle bundle, C5J c5j) {
        this.A0H.A3Q(this, A0N);
        A0J(c5j);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0653Lu
    public final void ACJ(boolean z) {
        AbstractC0733Ow abstractC0733Ow = this.A04;
        if (abstractC0733Ow != null) {
            abstractC0733Ow.A0N(z);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0653Lu
    public final void ACj(boolean z) {
        AbstractC0733Ow abstractC0733Ow = this.A04;
        if (abstractC0733Ow != null) {
            abstractC0733Ow.A0O(z);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0653Lu
    public final void AEt(Bundle bundle) {
    }

    public AbstractC0733Ow getContentView() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0653Lu
    public String getCurrentClientToken() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0653Lu
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        return false;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A02 = configuration.orientation;
        AbstractC0733Ow abstractC0733Ow = this.A04;
        if (abstractC0733Ow != null) {
            abstractC0733Ow.onConfigurationChanged(configuration);
        }
        AbstractC0733Ow abstractC0733Ow2 = this.A04;
        if (abstractC0733Ow2 instanceof SQ) {
            A0H(abstractC0733Ow2, abstractC0733Ow2.getFullScreenAdStyle());
            A0I(this.A04.getAdDataBundle());
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0653Lu
    public final void onDestroy() {
        AbstractC0733Ow abstractC0733Ow = this.A04;
        if (abstractC0733Ow != null) {
            abstractC0733Ow.A0K();
            this.A04 = null;
        }
        this.A0D.A00().A4E(this.A0A.A0u());
        this.A0G.A03();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setListener(InterfaceC0652Lt interfaceC0652Lt) {
    }

    public void setServerSideRewardHandler(PU pu) {
        this.A05 = pu;
    }

    private void setupToolbarForAd(AbstractC0733Ow abstractC0733Ow) {
        if (this.A0I == null) {
            return;
        }
        this.A06 = true;
        AbstractC1045aS A0t = this.A0A.A0t(this.A00);
        this.A0I.A09(this.A0D, A0t.A0p());
        this.A0I.A08(A0t.A0z(), A0t.A11(), A00(this.A00));
        C0736Oz fullScreenAdStyle = abstractC0733Ow.getFullScreenAdStyle();
        A0H(abstractC0733Ow, fullScreenAdStyle);
        this.A0K.add(fullScreenAdStyle);
        this.A0I.setToolbarActionMessage(A08(4, 3, 90) + (this.A00 + 1) + A08(0, 4, 42) + this.A0A.A0q());
        if (this.A08) {
            this.A0I.setToolbarActionMode(1);
        }
        A0I(A0t);
    }
}
