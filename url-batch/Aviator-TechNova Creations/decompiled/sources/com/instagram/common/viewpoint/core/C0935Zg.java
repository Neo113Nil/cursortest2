package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.webkit.JavascriptInterface;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Zg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0935Zg {
    public static String[] A07 = {"MaUhfef1XHChQSOAsPU", "01oMUC4JT554rhL", "9TYVZPZrh7WqyaB", "ShOi1FYvFM9bF84GqYiu0GZZ4HOF35Af", "s", "YvdeaQsxQHJ3CZVDgFIjqRdATcpqYXuO", "b384kAccrLIUxrnk6NdGu", "f4PnsWwvvRSNWXAtteJ0H"};
    public final String A00 = C0935Zg.class.getSimpleName();
    public final WeakReference<AtomicBoolean> A01;
    public final WeakReference<AtomicBoolean> A02;
    public final WeakReference<LH> A03;
    public final WeakReference<InterfaceC0936Zh> A04;
    public final WeakReference<C1232eX> A05;
    public final WeakReference<C0555Ki> A06;

    public C0935Zg(C0555Ki c0555Ki, InterfaceC0936Zh interfaceC0936Zh, C1232eX c1232eX, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, C1159dL c1159dL) {
        this.A06 = new WeakReference<>(c0555Ki);
        this.A04 = new WeakReference<>(interfaceC0936Zh);
        this.A05 = new WeakReference<>(c1232eX);
        this.A01 = new WeakReference<>(atomicBoolean);
        this.A02 = new WeakReference<>(atomicBoolean2);
        this.A03 = new WeakReference<>(c1159dL.A0F());
    }

    private LH A00() {
        LH funnel = this.A03.get();
        if (funnel == null) {
            return new C1495j3();
        }
        return funnel;
    }

    @JavascriptInterface
    public void alert(String str) {
        Log.e(this.A00, str);
    }

    @JavascriptInterface
    public String getAnalogInfo() {
        return AbstractC0868Wr.A01(T5.A02());
    }

    @JavascriptInterface
    public void logFunnel(int i, String str) {
        A00().AK6(i, str);
    }

    @JavascriptInterface
    public void onMainAssetLoaded() {
        A00().AK7();
        if (this.A06.get() != null && this.A01.get() != null && this.A02.get() != null && this.A02.get().get()) {
            this.A01.get().set(true);
            A00().AK8();
            if (this.A06.get().isShown()) {
                A00().AK9();
                new Handler(Looper.getMainLooper()).post(new C0561Ko(this.A05));
            }
            InterfaceC0936Zh interfaceC0936Zh = this.A04.get();
            if (interfaceC0936Zh != null) {
                new Handler(Looper.getMainLooper()).post(new RunnableC0934Zf(this, interfaceC0936Zh));
            }
        }
    }

    @JavascriptInterface
    public void onPageInitialized() {
        C0555Ki webView = this.A06.get();
        if (webView == null || webView.A0J()) {
            A00().AKA(true);
            return;
        }
        InterfaceC0936Zh interfaceC0936Zh = this.A04.get();
        if (interfaceC0936Zh == null) {
            A00().AKA(true);
            return;
        }
        LH A00 = A00();
        String[] strArr = A07;
        if (strArr[3].charAt(2) == strArr[5].charAt(2)) {
            throw new RuntimeException();
        }
        A07[6] = "MExJxptNjWm815DyzsGP1";
        A00.AKA(false);
        interfaceC0936Zh.AET();
    }
}
