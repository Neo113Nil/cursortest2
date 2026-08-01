package L;

import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final AccessibilityNodeInfo.CollectionItemInfo f463a;

    public i(AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo) {
        this.f463a = collectionItemInfo;
    }

    public static i a(boolean z2, int i, int i2, int i3, int i4) {
        return new i(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, false, z2));
    }
}
