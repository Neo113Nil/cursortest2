package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.webkit.JavascriptInterface;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.b0, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2866b0 {
    public static String[] A07 = {"MaUhfef1XHChQSOAsPU", "01oMUC4JT554rhL", "9TYVZPZrh7WqyaB", "ShOi1FYvFM9bF84GqYiu0GZZ4HOF35Af", "s", "YvdeaQsxQHJ3CZVDgFIjqRdATcpqYXuO", "b384kAccrLIUxrnk6NdGu", "f4PnsWwvvRSNWXAtteJ0H"};
    public final String A00 = C2866b0.class.getSimpleName();
    public final WeakReference<AtomicBoolean> A01;
    public final WeakReference<AtomicBoolean> A02;
    public final WeakReference<InterfaceC2444Lt> A03;
    public final WeakReference<InterfaceC2867b1> A04;
    public final WeakReference<C3163fp> A05;
    public final WeakReference<LV> A06;

    public C2866b0(LV lv, InterfaceC2867b1 interfaceC2867b1, C3163fp c3163fp, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, C3218gi c3218gi) {
        this.A06 = new WeakReference<>(lv);
        this.A04 = new WeakReference<>(interfaceC2867b1);
        this.A05 = new WeakReference<>(c3163fp);
        this.A01 = new WeakReference<>(atomicBoolean);
        this.A02 = new WeakReference<>(atomicBoolean2);
        this.A03 = new WeakReference<>(c3218gi.A0F());
    }

    private InterfaceC2444Lt A00() {
        InterfaceC2444Lt funnel = this.A03.get();
        if (funnel == null) {
            return new C3438kX();
        }
        return funnel;
    }

    @JavascriptInterface
    public void alert(String str) {
        Log.e(this.A00, str);
    }

    @JavascriptInterface
    public String getAnalogInfo() {
        return AbstractC2729Xd.A01(C2640Tn.A02());
    }

    @JavascriptInterface
    public void logFunnel(int i, String str) {
        A00().AKr(i, str);
    }

    @JavascriptInterface
    public void onMainAssetLoaded() {
        A00().AKs();
        if (this.A06.get() != null && this.A01.get() != null && this.A02.get() != null && this.A02.get().get()) {
            this.A01.get().set(true);
            A00().AKt();
            if (this.A06.get().isShown()) {
                A00().AKu();
                new Handler(Looper.getMainLooper()).post(new C2432Lh(this.A05));
            }
            InterfaceC2867b1 interfaceC2867b1 = this.A04.get();
            if (interfaceC2867b1 != null) {
                new Handler(Looper.getMainLooper()).post(new RunnableC2865az(this, interfaceC2867b1));
            }
        }
    }

    @JavascriptInterface
    public void onPageInitialized() {
        LV webView = this.A06.get();
        if (webView == null || webView.A0J()) {
            A00().AKv(true);
            return;
        }
        InterfaceC2867b1 interfaceC2867b1 = this.A04.get();
        if (interfaceC2867b1 == null) {
            A00().AKv(true);
            return;
        }
        InterfaceC2444Lt A00 = A00();
        String[] strArr = A07;
        if (strArr[3].charAt(2) == strArr[5].charAt(2)) {
            throw new RuntimeException();
        }
        A07[6] = "MExJxptNjWm815DyzsGP1";
        A00.AKv(false);
        interfaceC2867b1.AF8();
    }
}
