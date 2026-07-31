package com.facebook.ads.redexgen.core;

import android.widget.FrameLayout;
import com.facebook.ads.AdClosedListener;

/* renamed from: com.facebook.ads.redexgen.X.Zd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2781Zd extends FrameLayout {
    public static String[] A0E = {"5RNIIKEidNz4CxH4JgV5654XoKm2WCRJ", "1p9zA", "TyFhTVOKfwCiarLUW0", "qGg1KSsP6zNQFhXHIMmjZGXDOHal5qmq", "ysvkaelauuCqE6L7ICudiIGq1Ejo0wOd", "BlsqFJOSCgQfST", "dpiEaUs9Aor9er1WGZ", "tfv9H94"};
    public int A00;
    public AdClosedListener A01;
    public EnumC2510Oi A02;
    public C2511Oj A03;
    public C2512Ok A04;
    public InterfaceC2780Zc A05;
    public final C2508Og A06;
    public final C3218gi A07;
    public final VA A08;
    public final InterfaceC2759Yh A09;
    public final InterfaceC2760Yi A0A;
    public final String A0B;
    public final C2488Nm A0C;
    public final InterfaceC2783Zf A0D;

    public abstract void A0O();

    public abstract void A0P();

    public abstract void A0R(C2512Ok c2512Ok, EnumC2510Oi enumC2510Oi);

    public abstract boolean A0S();

    public AbstractC2781Zd(C3218gi c3218gi, VA va, String str) {
        this(c3218gi, va, str, null, null, null);
    }

    public AbstractC2781Zd(C3218gi c3218gi, VA va, String str, C2488Nm c2488Nm, InterfaceC2760Yi interfaceC2760Yi, InterfaceC2759Yh interfaceC2759Yh) {
        super(c3218gi);
        this.A00 = 0;
        this.A02 = EnumC2510Oi.A05;
        this.A04 = null;
        this.A0D = new MF(this);
        this.A07 = c3218gi;
        this.A08 = va;
        this.A0A = interfaceC2760Yi;
        this.A09 = interfaceC2759Yh;
        this.A0B = str;
        this.A0C = c2488Nm;
        this.A06 = AbstractC2509Oh.A00(this.A07.A02());
    }

    public static /* synthetic */ int A02(AbstractC2781Zd abstractC2781Zd) {
        int i = abstractC2781Zd.A00;
        abstractC2781Zd.A00 = i + 1;
        return i;
    }

    public static /* synthetic */ int A03(AbstractC2781Zd abstractC2781Zd) {
        int i = abstractC2781Zd.A00;
        abstractC2781Zd.A00 = i - 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0E() {
        if (this.A03.A0A()) {
            this.A08.AB3(this.A0B, this.A03.A02());
            this.A03.A03();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0F() {
        this.A04 = null;
        this.A03.A05();
        A0O();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0G(C2512Ok c2512Ok) {
        this.A03.A08(this.A02);
        A0Q(c2512Ok, this.A02);
        N8.A01(this.A07).A0L();
        if (A0S()) {
            A0E();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0H(C2512Ok c2512Ok) {
        this.A04 = c2512Ok;
        this.A03.A09(this.A02, this.A00);
        A0R(c2512Ok, this.A02);
    }

    public final void A0M() {
        A0E();
    }

    public final void A0N() {
        this.A03 = new C2511Oj(new VI(this.A0B, this.A08));
        if (this.A0A != null) {
            InterfaceC2760Yi interfaceC2760Yi = this.A0A;
            if (A0E[0].charAt(22) == 'O') {
                throw new RuntimeException();
            }
            A0E[7] = "FLAi4P2";
            interfaceC2760Yi.AFA(true);
        }
        if (this.A05 != null) {
            this.A05.ACs();
        }
        A0F();
    }

    public void A0Q(C2512Ok c2512Ok, EnumC2510Oi enumC2510Oi) {
        if (this.A01 != null) {
            this.A07.A0F().ABV();
            this.A01.onAdClosed();
        }
    }

    public void setAdReportingCallbackListener(InterfaceC2780Zc interfaceC2780Zc) {
        this.A05 = interfaceC2780Zc;
    }

    public void setOnAdClosedListener(AdClosedListener adClosedListener) {
        this.A01 = adClosedListener;
    }
}
