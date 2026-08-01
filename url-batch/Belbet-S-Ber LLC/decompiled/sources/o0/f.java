package o0;

import android.os.Handler;
import android.os.Looper;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    public static f f2880b;

    /* renamed from: a, reason: collision with root package name */
    public final Object f2881a;

    public f() {
        this.f2881a = new Object();
        new Handler(Looper.getMainLooper(), new q2.e(this));
    }

    public static f a(boolean z4, int i, int i4, int i5, int i6) {
        return new f(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i4, i5, i6, false, z4));
    }

    public f(AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo) {
        this.f2881a = collectionItemInfo;
    }
}
