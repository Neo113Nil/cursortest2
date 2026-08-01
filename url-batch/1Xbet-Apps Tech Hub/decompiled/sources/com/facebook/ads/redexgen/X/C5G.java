package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import com.google.common.base.Ascii;
import java.util.Arrays;
import kotlin.io.encoding.Base64;

/* renamed from: com.facebook.ads.redexgen.X.5G, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C5G {
    public static byte[] A04;
    public final Intent A00;
    public final C5J A01;
    public final YA A02;
    public final InterfaceC0565If A03;

    static {
        A0T();
    }

    public static String A0S(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 79);
        }
        return new String(copyOfRange);
    }

    public static void A0T() {
        A04 = new byte[]{51, 54, Ascii.CR, 54, 51, 38, 51, Ascii.CR, 48, 39, 60, 54, 62, 55, Ascii.US, Ascii.DC4, Ascii.GS, Ascii.NAK, Ascii.DC2, Ascii.EM, Ascii.CAN, Base64.padSymbol, Ascii.CAN, 56, Ascii.GS, 8, Ascii.GS, 62, 9, Ascii.DC2, Ascii.CAN, 16, Ascii.EM, 85, 90, 79, 82, 77, 94, 122, 95, Byte.MAX_VALUE, 90, 79, 90, 121, 78, 85, 95, 87, 94, 65, 86, 68, 82, 65, 87, 86, 87, 101, 90, 87, 86, 92, 114, 87, 119, 82, 71, 82, 113, 70, 93, 87, 95, 86, 16, Ascii.SI, 2, 3, 9, 57, Ascii.DC2, Ascii.SI, Ascii.VT, 3, 57, Ascii.SYN, 9, 10, 10, Ascii.SI, 8, 1, 57, Ascii.SI, 8, Ascii.DC2, 3, Ascii.DC4, 16, 7, 10};
    }

    public C5G(C5J c5j, Intent intent, InterfaceC0565If interfaceC0565If, YA ya) {
        this.A01 = c5j;
        this.A00 = intent;
        this.A03 = interfaceC0565If;
        this.A02 = ya;
    }

    public /* synthetic */ C5G(C5J c5j, Intent intent, InterfaceC0565If interfaceC0565If, YA ya, C5F c5f) {
        this(c5j, intent, interfaceC0565If, ya);
    }

    private F0 A00() {
        return (F0) this.A00.getSerializableExtra(A0S(0, 14, 29));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InterfaceC0653Lu A02() {
        C5F c5f = null;
        if (IP.A2H(this.A02)) {
            return new C7I(this.A02, this.A03, new C6Q(this.A02), new C0986Yt(this.A01, c5f), A00());
        }
        return new C7H(this.A02, this.A03, new C6Q(this.A02), new C0986Yt(this.A01, c5f), A00());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C0851Tl A0G() {
        C5J c5j = this.A01;
        return new C0851Tl(c5j, this.A02, this.A03, new C0986Yt(c5j, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public TU A0H() {
        return new TU(this.A02, this.A03, new C0986Yt(this.A01, null), A00(), null, new TR());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public TU A0I() {
        C0482Ey c0482Ey = (C0482Ey) this.A00.getSerializableExtra(A0S(51, 25, 124));
        return new TU(this.A02, this.A03, new EB(this.A01, null), c0482Ey, c0482Ey.A0S(), new TQ());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public TS A0J(RelativeLayout relativeLayout) {
        TS ts = new TS(this.A02, new C0985Ys(this), this.A03, new C0986Yt(this.A01, null));
        ts.A05(relativeLayout);
        ts.A04(this.A00.getIntExtra(A0S(76, 27, 41), 200));
        LV.A0M(relativeLayout, ViewCompat.MEASURED_STATE_MASK);
        return ts;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AnonymousClass96 A0K() {
        return new AnonymousClass96(this.A02, this.A03, new C0986Yt(this.A01, null), A00(), new TR(), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AnonymousClass96 A0L() {
        return new AnonymousClass96(this.A02, this.A03, new C0986Yt(this.A01, null), (C0482Ey) this.A00.getSerializableExtra(A0S(51, 25, 124)), new TQ(), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C0815Sa A0M() {
        C0718Oh A02;
        AbstractC1045aS abstractC1045aS = (AbstractC1045aS) this.A00.getSerializableExtra(A0S(33, 18, 116));
        C5F c5f = null;
        if (abstractC1045aS == null || (A02 = C0719Oi.A02(abstractC1045aS.A0R())) == null) {
            return null;
        }
        return new C0815Sa(this.A02, new C0986Yt(this.A01, c5f), A02, abstractC1045aS.A11());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SD A0N(EnumC0600Jq enumC0600Jq) {
        MM tq;
        InterfaceC0652Lt eb;
        C1043aQ c1043aQ = (C1043aQ) this.A00.getSerializableExtra(A0S(14, 19, 51));
        C5F c5f = null;
        if (enumC0600Jq == EnumC0600Jq.A03) {
            tq = new TR();
            eb = new C0986Yt(this.A01, c5f);
        } else {
            tq = new TQ();
            eb = new EB(this.A01, c5f);
        }
        return new SD(this.A02, tq, this.A03, c1043aQ, new C6Q(this.A02), eb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C8B A0O() {
        return new C8B(this.A02, new TR(), this.A03, A00(), new C6Q(this.A02), new C0986Yt(this.A01, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C7K A0P() {
        return new C7K(this.A02, new TR(), this.A03, A00(), new C6Q(this.A02), new C0986Yt(this.A01, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C7K A0Q() {
        return new C7K(this.A02, new TQ(), this.A03, (C0482Ey) this.A00.getSerializableExtra(A0S(51, 25, 124)), new C6Q(this.A02), new EB(this.A01, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C7H A0R() {
        return new C7H(this.A02, this.A03, new C6Q(this.A02), new C0986Yt(this.A01, null), (C0482Ey) this.A00.getSerializableExtra(A0S(51, 25, 124)));
    }
}
