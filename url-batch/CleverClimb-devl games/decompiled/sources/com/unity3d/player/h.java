package com.unity3d.player;

import android.os.Build;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    static final boolean f9360a;

    /* renamed from: b, reason: collision with root package name */
    static final boolean f9361b;

    /* renamed from: c, reason: collision with root package name */
    static final boolean f9362c;

    /* renamed from: d, reason: collision with root package name */
    static final c f9363d;

    static {
        f9360a = Build.VERSION.SDK_INT >= 19;
        f9361b = Build.VERSION.SDK_INT >= 21;
        boolean z = Build.VERSION.SDK_INT >= 23;
        f9362c = z;
        f9363d = z ? new f() : null;
    }
}
