package d;

import android.window.BackEvent;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: d.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0350a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0350a f4566a = new C0350a();

    public final BackEvent a(float f7, float f8, float f9, int i2) {
        return new BackEvent(f7, f8, f9, i2);
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
