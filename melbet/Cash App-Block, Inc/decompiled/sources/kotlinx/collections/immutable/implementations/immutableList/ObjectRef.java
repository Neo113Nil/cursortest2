package kotlinx.collections.immutable.implementations.immutableList;

import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes9.dex */
public final class ObjectRef {
    public Object value;

    public /* synthetic */ ObjectRef(Object obj) {
        this.value = obj;
    }

    public static ObjectRef obtain(float f, float f2, float f3) {
        return new ObjectRef(AccessibilityNodeInfo.RangeInfo.obtain(1, f, f2, f3));
    }
}
