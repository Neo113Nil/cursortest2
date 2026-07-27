package y;

import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;

/* loaded from: classes.dex */
public abstract /* synthetic */ class p {
    public static /* bridge */ /* synthetic */ HandwritingGesture j(Object obj) {
        return (HandwritingGesture) obj;
    }

    public static /* bridge */ /* synthetic */ JoinOrSplitGesture k(Object obj) {
        return (JoinOrSplitGesture) obj;
    }

    public static /* bridge */ /* synthetic */ RemoveSpaceGesture l(Object obj) {
        return (RemoveSpaceGesture) obj;
    }

    public static /* bridge */ /* synthetic */ SelectGesture m(Object obj) {
        return (SelectGesture) obj;
    }

    public static /* bridge */ /* synthetic */ boolean p(Object obj) {
        return obj instanceof RemoveSpaceGesture;
    }

    public static /* bridge */ /* synthetic */ boolean s(Object obj) {
        return obj instanceof JoinOrSplitGesture;
    }

    public static /* bridge */ /* synthetic */ boolean t(Object obj) {
        return obj instanceof SelectGesture;
    }
}
