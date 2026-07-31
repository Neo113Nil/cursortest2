package androidx.activity;

import android.window.BackEvent;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.activity.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1249b {

    /* renamed from: e, reason: collision with root package name */
    public static final a f9839e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final float f9840a;

    /* renamed from: b, reason: collision with root package name */
    private final float f9841b;

    /* renamed from: c, reason: collision with root package name */
    private final float f9842c;

    /* renamed from: d, reason: collision with root package name */
    private final int f9843d;

    /* renamed from: androidx.activity.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C1249b(float f4, float f5, float f6, int i4) {
        this.f9840a = f4;
        this.f9841b = f5;
        this.f9842c = f6;
        this.f9843d = i4;
    }

    public String toString() {
        return "BackEventCompat{touchX=" + this.f9840a + ", touchY=" + this.f9841b + ", progress=" + this.f9842c + ", swipeEdge=" + this.f9843d + '}';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1249b(BackEvent backEvent) {
        this(r0.d(backEvent), r0.e(backEvent), r0.b(backEvent), r0.c(backEvent));
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        C1248a c1248a = C1248a.f9838a;
    }
}
