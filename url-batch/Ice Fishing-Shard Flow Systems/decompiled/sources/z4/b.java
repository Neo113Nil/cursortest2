package z4;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b extends RuntimeException {

    /* renamed from: d, reason: collision with root package name */
    public final String f8717d;

    /* renamed from: e, reason: collision with root package name */
    public final String f8718e;

    public b() {
        Intrinsics.checkNotNullParameter("NO_ACTIVITY", "code");
        this.f8717d = "NO_ACTIVITY";
        this.f8718e = "Launching a URL requires a foreground activity.";
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f8718e;
    }
}
