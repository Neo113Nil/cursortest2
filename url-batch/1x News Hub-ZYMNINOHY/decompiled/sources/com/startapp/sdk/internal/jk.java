package com.startapp.sdk.internal;

import android.graphics.Rect;
import com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason;

/* loaded from: classes.dex */
public final class jk {

    /* renamed from: a, reason: collision with root package name */
    public final float f4035a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f4036b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect[] f4037c;

    /* renamed from: d, reason: collision with root package name */
    public final NotDisplayedReason f4038d;

    public jk() {
    }

    public jk(NotDisplayedReason notDisplayedReason, float f, Rect rect, Rect[] rectArr) {
        this.f4035a = f;
        this.f4036b = rect;
        this.f4037c = rectArr;
        this.f4038d = notDisplayedReason;
    }
}
