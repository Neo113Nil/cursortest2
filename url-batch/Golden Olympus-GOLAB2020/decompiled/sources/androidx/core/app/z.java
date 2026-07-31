package androidx.core.app;

import android.content.res.Configuration;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f11713a;

    /* renamed from: b, reason: collision with root package name */
    private Configuration f11714b;

    public z(boolean z4) {
        this.f11713a = z4;
    }

    public final boolean a() {
        return this.f11713a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public z(boolean z4, Configuration newConfig) {
        this(z4);
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        this.f11714b = newConfig;
    }
}
