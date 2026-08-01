package com.luckyarcade.spinthrow;

import android.view.KeyEvent;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2074a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f2075b;

    public /* synthetic */ e(KeyEvent.Callback callback, int i) {
        this.f2074a = i;
        this.f2075b = callback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2074a) {
            case 0:
                KnifeThrowView.finishVictory$lambda$10((KnifeThrowView) this.f2075b);
                break;
            case 1:
                KnifeThrowView.finishDefeat$lambda$11((KnifeThrowView) this.f2075b);
                break;
            default:
                MainActivity.access$loadFallbackGame((MainActivity) this.f2075b);
                break;
        }
    }
}
