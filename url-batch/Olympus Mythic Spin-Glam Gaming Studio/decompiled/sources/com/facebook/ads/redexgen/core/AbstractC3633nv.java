package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;
import com.facebook.ads.androidx.media3.common.Timeline;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: com.facebook.ads.redexgen.X.nv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC3633nv implements InterfaceC2216Cx {
    public static String[] A07 = {"KBisateWM8YQ4arKDgRYpdTDxezzMkCv", "VJ2uSooodcJBZOLyoDYKaqw5tYDrMz4W", "bemaZsDF2tY6J54Bg3tOUH55klLpC", "LnVxhCvG0lD6F7ZPu", "7ofy39p1yDzqV7NnIWFVVnn8VzEJdml2", "3pklWVRHTZe0TjeZrFE3TnxhkITdP", "TfKHOeXRiNIOMg3PDS", "WMeybOD3P6lu5fyh7Idh"};
    public Looper A00;
    public Timeline A01;
    public C8O A02;
    public final ArrayList<InterfaceC2215Cw> A05 = new ArrayList<>(1);
    public final HashSet<InterfaceC2215Cw> A06 = new HashSet<>(1);
    public final D8 A04 = new D8();
    public final A1 A03 = new A1();

    public abstract void A09();

    public abstract void A0A(InterfaceC20495t interfaceC20495t);

    public final C8O A00() {
        return (C8O) AbstractC20023y.A02(this.A02);
    }

    public final A1 A01(C3626no c3626no) {
        return this.A03.A00(0, c3626no);
    }

    public final D8 A02(C3626no c3626no) {
        return this.A04.A02(0, c3626no, 0L);
    }

    public void A03() {
    }

    public void A04() {
    }

    public final void A05(Timeline timeline) {
        this.A01 = timeline;
        Iterator<InterfaceC2215Cw> it = this.A05.iterator();
        while (it.hasNext()) {
            it.next().AG1(this, timeline);
        }
    }

    public final void A06(InterfaceC2215Cw interfaceC2215Cw) {
        boolean z = !this.A06.isEmpty();
        this.A06.remove(interfaceC2215Cw);
        if (z) {
            boolean wasEnabled = this.A06.isEmpty();
            if (wasEnabled) {
                A03();
            }
        }
    }

    public final void A07(InterfaceC2215Cw interfaceC2215Cw) {
        AbstractC20023y.A01(this.A00);
        boolean isEmpty = this.A06.isEmpty();
        this.A06.add(interfaceC2215Cw);
        if (isEmpty) {
            A04();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A08(InterfaceC2215Cw interfaceC2215Cw, InterfaceC20495t interfaceC20495t, C8O c8o) {
        boolean z;
        Looper looper;
        Looper myLooper = Looper.myLooper();
        Looper looper2 = this.A00;
        if (looper2 != null) {
            Looper looper3 = this.A00;
            if (looper3 != myLooper) {
                z = false;
                AbstractC20023y.A07(z);
                this.A02 = c8o;
                Timeline timeline = this.A01;
                this.A05.add(interfaceC2215Cw);
                looper = this.A00;
                if (looper != null) {
                    this.A00 = myLooper;
                    this.A06.add(interfaceC2215Cw);
                    A0A(interfaceC20495t);
                    return;
                } else {
                    if (timeline == null) {
                        return;
                    }
                    A07(interfaceC2215Cw);
                    interfaceC2215Cw.AG1(this, timeline);
                    return;
                }
            }
        }
        z = true;
        AbstractC20023y.A07(z);
        this.A02 = c8o;
        Timeline timeline2 = this.A01;
        this.A05.add(interfaceC2215Cw);
        looper = this.A00;
        if (looper != null) {
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2216Cx
    public final void A3z(Handler handler, D9 d9) {
        AbstractC20023y.A01(handler);
        AbstractC20023y.A01(d9);
        this.A04.A04(handler, d9);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2216Cx
    public final void AH7(InterfaceC2215Cw interfaceC2215Cw, InterfaceC20495t interfaceC20495t) {
        A08(interfaceC2215Cw, interfaceC20495t, C8O.A03);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2216Cx
    public final void AHl(InterfaceC2215Cw interfaceC2215Cw) {
        this.A05.remove(interfaceC2215Cw);
        if (this.A05.isEmpty()) {
            this.A00 = null;
            this.A01 = null;
            this.A02 = null;
            this.A06.clear();
            String[] strArr = A07;
            if (strArr[2].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[3] = "pnZ7WVnnf2PAl7J7h";
            strArr2[6] = "ddcJoNElLz9Uvwup8w";
            A09();
            return;
        }
        A06(interfaceC2215Cw);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2216Cx
    public final void AIS(D9 d9) {
        this.A04.A0D(d9);
    }
}
