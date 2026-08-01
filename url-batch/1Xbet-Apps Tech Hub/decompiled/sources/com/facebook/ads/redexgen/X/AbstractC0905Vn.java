package com.facebook.ads.redexgen.X;

import android.os.Handler;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.facebook.ads.redexgen.X.Vn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0905Vn implements EY {
    public static String[] A05 = {ExifInterface.GPS_MEASUREMENT_2D, "A1R5XmGNdue", "Xf2fF", "2MZr802CwBgh98iwI2LX9r8AFH0stAP", "PWtCslqWMOhLlWMecFeGOSMcL", "Nab9jbcw8W2RSLeSFi8qaY40Uhnm56i", "UlYKNWRAV2IAyBS", "QHLbHyQnMMy3J3Z"};
    public XT A00;
    public AbstractC03729z A01;
    public Object A02;
    public final ArrayList<EX> A04 = new ArrayList<>(1);
    public final C0467Ej A03 = new C0467Ej();

    public abstract void A02();

    public abstract void A03(XT xt, boolean z);

    public final C0467Ej A00(EW ew) {
        return this.A03.A02(0, ew, 0L);
    }

    public final void A01(AbstractC03729z abstractC03729z, Object obj) {
        this.A01 = abstractC03729z;
        this.A02 = obj;
        Iterator<EX> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().ACz(this, abstractC03729z, obj);
        }
    }

    @Override // com.facebook.ads.redexgen.X.EY
    public final void A3K(Handler handler, InterfaceC0470Em interfaceC0470Em) {
        this.A03.A07(handler, interfaceC0470Em);
    }

    @Override // com.facebook.ads.redexgen.X.EY
    public final void ADx(XT xt, boolean z, EX ex) {
        XT xt2 = this.A00;
        HI.A03(xt2 == null || xt2 == xt);
        this.A04.add(ex);
        if (this.A00 == null) {
            this.A00 = xt;
            A03(xt, z);
        } else {
            AbstractC03729z abstractC03729z = this.A01;
            if (abstractC03729z == null) {
                return;
            }
            ex.ACz(this, abstractC03729z, this.A02);
        }
    }

    @Override // com.facebook.ads.redexgen.X.EY
    public final void AEV(EX ex) {
        this.A04.remove(ex);
        if (this.A04.isEmpty()) {
            this.A00 = null;
            this.A01 = null;
            if (A05[2].length() == 23) {
                throw new RuntimeException();
            }
            A05[2] = "TEgrTEJPhaeJK53iaQZF";
            this.A02 = null;
            A02();
        }
    }

    @Override // com.facebook.ads.redexgen.X.EY
    public final void AEX(InterfaceC0470Em interfaceC0470Em) {
        this.A03.A0D(interfaceC0470Em);
    }
}
