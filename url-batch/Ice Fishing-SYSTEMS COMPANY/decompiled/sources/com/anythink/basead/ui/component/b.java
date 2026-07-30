package com.anythink.basead.ui.component;

import android.view.View;
import com.anythink.basead.ui.CountDownView;
import com.anythink.core.basead.ui.web.WebProgressBarView;
import com.anythink.core.common.h.y;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    CountDownView f10858a;

    /* renamed from: b, reason: collision with root package name */
    WebProgressBarView f10859b;

    /* renamed from: c, reason: collision with root package name */
    int f10860c = 4;

    /* renamed from: d, reason: collision with root package name */
    private y f10861d;

    /* renamed from: e, reason: collision with root package name */
    private long f10862e;

    public b(y yVar, CountDownView countDownView, WebProgressBarView webProgressBarView) {
        this.f10861d = yVar;
        this.f10858a = countDownView;
        this.f10859b = webProgressBarView;
    }

    private boolean c() {
        return this.f10861d.bk() == 2 || this.f10861d.bk() == 4;
    }

    public final void a(long j9) {
        this.f10862e = j9;
        CountDownView countDownView = this.f10858a;
        if (countDownView != null) {
            countDownView.setDuration(j9);
        }
    }

    public final void b(long j9) {
        CountDownView countDownView = this.f10858a;
        if (countDownView != null) {
            countDownView.refresh(j9);
        }
        WebProgressBarView webProgressBarView = this.f10859b;
        if (webProgressBarView != null) {
            long j10 = this.f10862e;
            if (j10 > 0) {
                webProgressBarView.setProgress((int) ((j9 * 100.0d) / j10));
            } else {
                webProgressBarView.setProgress(100);
            }
        }
    }

    public final void a() {
        CountDownView countDownView = this.f10858a;
        if (countDownView != null) {
            countDownView.refreshToEnd();
        }
        WebProgressBarView webProgressBarView = this.f10859b;
        if (webProgressBarView != null) {
            webProgressBarView.setProgress(100);
        }
    }

    private boolean b() {
        return this.f10861d.bk() == 1 || this.f10861d.bk() == 4;
    }

    public final void a(int i) {
        this.f10860c = i;
        if (this.f10861d.bk() != 1 && this.f10861d.bk() != 4) {
            a(this.f10858a, 8);
        } else {
            a(this.f10858a, i);
        }
        if (this.f10861d.bk() != 2 && this.f10861d.bk() != 4) {
            a(this.f10859b, 8);
        } else {
            a(this.f10859b, i);
        }
    }

    private static void a(View view, int i) {
        if (view == null || view.getVisibility() == i) {
            return;
        }
        view.setVisibility(i);
    }
}
