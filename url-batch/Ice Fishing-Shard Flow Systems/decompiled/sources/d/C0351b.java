package d;

import android.window.BackEvent;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: d.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0351b {

    /* renamed from: a, reason: collision with root package name */
    public final float f4567a;

    /* renamed from: b, reason: collision with root package name */
    public final float f4568b;

    /* renamed from: c, reason: collision with root package name */
    public final float f4569c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4570d;

    public C0351b(BackEvent backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        C0350a c0350a = C0350a.f4566a;
        float d7 = c0350a.d(backEvent);
        float e7 = c0350a.e(backEvent);
        float b7 = c0350a.b(backEvent);
        int c7 = c0350a.c(backEvent);
        this.f4567a = d7;
        this.f4568b = e7;
        this.f4569c = b7;
        this.f4570d = c7;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.f4567a + ", touchY=" + this.f4568b + ", progress=" + this.f4569c + ", swipeEdge=" + this.f4570d + '}';
    }
}
