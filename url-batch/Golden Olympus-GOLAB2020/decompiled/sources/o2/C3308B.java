package o2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: o2.B, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3308B {

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f41961b = AtomicIntegerFieldUpdater.newUpdater(C3308B.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f41962a;

    public C3308B(Throwable th, boolean z4) {
        this.f41962a = th;
        this._handled$volatile = z4 ? 1 : 0;
    }

    public final boolean a() {
        return f41961b.get(this) != 0;
    }

    public final boolean c() {
        return f41961b.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return N.a(this) + '[' + this.f41962a + ']';
    }

    public /* synthetic */ C3308B(Throwable th, boolean z4, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(th, (i4 & 2) != 0 ? false : z4);
    }
}
