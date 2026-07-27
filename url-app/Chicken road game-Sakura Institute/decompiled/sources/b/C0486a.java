package b;

import android.window.BackEvent;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: b.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0486a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0486a f5528a = new C0486a();

    public final BackEvent a(float f4, float f5, float f6, int i2) {
        return new BackEvent(f4, f5, f6, i2);
    }

    public final float b(BackEvent backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    public final int c(BackEvent backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    public final float d(BackEvent backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    public final float e(BackEvent backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        return backEvent.getTouchY();
    }
}
