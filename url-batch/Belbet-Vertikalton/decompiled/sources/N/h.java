package N;

import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final AccessibilityNodeInfo.CollectionItemInfo f877a;

    public h(AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo) {
        this.f877a = collectionItemInfo;
    }

    public static h a(boolean z2, int i, int i2, int i3, int i4) {
        return new h(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, false, z2));
    }
}
