package com.instagram.common.viewpoint.core;

import android.view.View;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.hS, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1885hS implements InterfaceC1380Yh {
    public static String[] A01 = {"8tOzOPKLz5DDIwqC88XBXxH90bmVDotF", "YCktuRbEMhZaz9U821mncTHWO05lwCqY", "Eq7g3criU65KDBPK", "XEHycrxPk7FQv1FkL381pmPNBNbKujpl", "niYnM4G6gzmxtC7fq", "sRQOtQAi", "8G5qrnHnaOtx52JqPPi", "6arHmIfqlBfM2iqNpfy3RxuQJelIt1eI"};
    public final WeakReference<C1201Re> A00;

    public C1885hS(C1201Re c1201Re) {
        this.A00 = new WeakReference<>(c1201Re);
    }

    private void A00(C1201Re c1201Re) {
        C1687eF A07 = c1201Re.A07();
        if (A07 != null && c1201Re.A04() != null) {
            c1201Re.A04().bringChildToFront(A07);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1380Yh
    public void A44(View view, int i, RelativeLayout.LayoutParams layoutParams) {
        C1201Re c1201Re = this.A00.get();
        if (c1201Re != null && c1201Re.A04() != null) {
            c1201Re.A04().addView(view, i, layoutParams);
            A00(c1201Re);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1380Yh
    public void A45(View view, RelativeLayout.LayoutParams layoutParams) {
        C1201Re c1201Re = this.A00.get();
        if (c1201Re != null && c1201Re.A04() != null) {
            c1201Re.A04().addView(view, layoutParams);
            A00(c1201Re);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1380Yh
    public void A4j(String str) {
        if (this.A00.get() != null) {
            this.A00.get().A0C(str);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1380Yh
    public void A4k(String str, UL ul) {
        if (this.A00.get() != null) {
            this.A00.get().A0E(str, ul);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1380Yh
    public void AAo(String str, C1109Nm c1109Nm) {
        if (this.A00.get() != null) {
            WeakReference<C1201Re> weakReference = this.A00;
            if (A01[4].length() == 0) {
                throw new RuntimeException();
            }
            A01[2] = "IO1gKUYJJG6YtU6JnI8y";
            weakReference.get().A0D(str, c1109Nm);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1380Yh
    public void ADJ(int i) {
        C1201Re activityApi = this.A00.get();
        if (activityApi != null) {
            activityApi.finish(i);
        }
    }
}
