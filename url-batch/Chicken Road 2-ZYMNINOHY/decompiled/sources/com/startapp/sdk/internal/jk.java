package com.startapp.sdk.internal;

import android.graphics.Rect;
import com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason;

/* loaded from: classes.dex */
public final class jk {

    /* renamed from: a, reason: collision with root package name */
    public final float f7163a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f7164b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect[] f7165c;

    /* renamed from: d, reason: collision with root package name */
    public final NotDisplayedReason f7166d;

    public jk() {
    }

    public jk(NotDisplayedReason notDisplayedReason, float f4, Rect rect, Rect[] rectArr) {
        this.f7163a = f4;
        this.f7164b = rect;
        this.f7165c = rectArr;
        this.f7166d = notDisplayedReason;
    }
}
