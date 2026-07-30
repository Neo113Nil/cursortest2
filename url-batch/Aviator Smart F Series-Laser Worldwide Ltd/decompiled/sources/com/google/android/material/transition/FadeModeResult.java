package com.google.android.material.transition;

/* loaded from: classes4.dex */
class FadeModeResult {
    final int endAlpha;
    final boolean endOnTop;
    final int startAlpha;

    private FadeModeResult(int i8, int i9, boolean z7) {
        this.startAlpha = i8;
        this.endAlpha = i9;
        this.endOnTop = z7;
    }

    static FadeModeResult endOnTop(int i8, int i9) {
        return new FadeModeResult(i8, i9, true);
    }

    static FadeModeResult startOnTop(int i8, int i9) {
        return new FadeModeResult(i8, i9, false);
    }
}
