package com.startapp.sdk.internal;

import android.graphics.Rect;
import com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class mj {

    /* renamed from: a, reason: collision with root package name */
    public final float f341a;
    public final Rect b;
    public final Rect[] c;
    public final NotDisplayedReason d;

    public mj() {
    }

    public mj(NotDisplayedReason notDisplayedReason, float f, Rect rect, Rect[] rectArr) {
        this.f341a = f;
        this.b = rect;
        this.c = rectArr;
        this.d = notDisplayedReason;
    }
}
