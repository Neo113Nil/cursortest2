package com.tapjoy.internal;

import android.content.Context;
import com.tapjoy.TJPlacementListener;

/* loaded from: classes2.dex */
abstract class gd {

    /* renamed from: a, reason: collision with root package name */
    private static final gd f8178a;

    /* renamed from: b, reason: collision with root package name */
    private static gd f8179b;

    public abstract Object a(Context context, String str, TJPlacementListener tJPlacementListener);

    gd() {
    }

    static {
        ge geVar = new ge();
        f8178a = geVar;
        f8179b = geVar;
    }

    static gd a() {
        return f8179b;
    }
}
