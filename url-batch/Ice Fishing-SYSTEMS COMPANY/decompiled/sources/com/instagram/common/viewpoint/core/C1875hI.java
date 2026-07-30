package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.ads.NativeAd;

/* renamed from: com.facebook.ads.redexgen.X.hI, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1875hI implements InterfaceC1612d1 {
    public static String[] A03 = {"nDiRY7f5TVWQOdU6I2mqi9PFa0bJ0VdN", "dUUtDl8unUO3GnPy3lwgtNvfo3F9XuVE", "auWwlwtRUPVHuGctx8NQwZ9fHxwXm1Rl", "TBzFY5XPxTfovmrmdBuO6vWMd6W8Cva2", "LKANgRtOSZEoLNHfrBEFH87LShAEPYie", "UCBlHB7WfBTqWuynAgT0g", "VPae1XPQy5IfYkfssFJoJg5Ye50RabOh", "Wz70ndlImsTWQI2daID25L24SXF8SnWJ"};
    public final /* synthetic */ NativeAd A00;
    public final /* synthetic */ C1869hC A01;
    public final /* synthetic */ UK A02;

    public C1875hI(C1869hC c1869hC, UK uk, NativeAd nativeAd) {
        this.A01 = c1869hC;
        this.A02 = uk;
        this.A00 = nativeAd;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1612d1
    public final void AAn() {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1612d1
    public final void ADm(AnonymousClass62 anonymousClass62) {
        new Handler(Looper.getMainLooper()).postDelayed(new C1876hJ(this, anonymousClass62), 1L);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1612d1
    public final void AE2() {
        AnonymousClass62 anonymousClass62;
        AnonymousClass62 anonymousClass622;
        anonymousClass62 = this.A01.A0H;
        if (anonymousClass62 != null) {
            anonymousClass622 = this.A01.A0H;
            String[] strArr = A03;
            if (strArr[4].charAt(31) == strArr[0].charAt(31)) {
                throw new RuntimeException();
            }
            A03[1] = "TOeEN4NbTJF6yCcoA7wHZFJASn52oXHD";
            anonymousClass622.A08();
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1612d1
    public final void AGC(View view, MotionEvent motionEvent) {
        C1839gi c1839gi;
        boolean A0U;
        Y2 A1E = this.A02.A1E();
        c1839gi = this.A01.A0C;
        A1E.A06(c1839gi, motionEvent, view, view);
        if (motionEvent.getAction() == 1) {
            A0U = this.A01.A0U(this.A00);
            if (!A0U && this.A02.A17() != null) {
                this.A02.A17().onClick(view);
            }
        }
    }
}
