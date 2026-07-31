package androidx.activity;

import android.window.BackEvent;
import androidx.annotation.RestrictTo;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BackEventCompat.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u0000 \u00182\u00020\u0001:\u0002\u0018\u0019B+\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Landroidx/activity/BackEventCompat;", "", "", "touchX", "touchY", "progress", "", "swipeEdge", "<init>", "(FFFI)V", "Landroid/window/BackEvent;", "backEvent", "(Landroid/window/BackEvent;)V", "", "toString", "()Ljava/lang/String;", "F", "getTouchX", "()F", "getTouchY", "getProgress", "I", "getSwipeEdge", "()I", "Companion", "SwipeEdge", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class BackEventCompat {
    private final float progress;
    private final int swipeEdge;
    private final float touchX;
    private final float touchY;

    /* compiled from: BackEventCompat.kt */
    @Target({ElementType.TYPE_USE})
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/activity/BackEventCompat$SwipeEdge;", "", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface SwipeEdge {
    }

    public BackEventCompat(float f, float f2, float f3, int i) {
        this.touchX = f;
        this.touchY = f2;
        this.progress = f3;
        this.swipeEdge = i;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BackEventCompat(BackEvent backEvent) {
        this(r0.touchX(backEvent), r0.touchY(backEvent), r0.progress(backEvent), r0.swipeEdge(backEvent));
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        Api34Impl api34Impl = Api34Impl.INSTANCE;
    }

    public String toString() {
        return "BackEventCompat{touchX=" + this.touchX + ", touchY=" + this.touchY + ", progress=" + this.progress + ", swipeEdge=" + this.swipeEdge + '}';
    }
}
