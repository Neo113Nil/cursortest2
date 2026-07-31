package z;

import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.SelectGesture;

/* renamed from: z.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1251o {
    public static /* bridge */ /* synthetic */ HandwritingGesture i(Object obj) {
        return (HandwritingGesture) obj;
    }

    public static /* bridge */ /* synthetic */ JoinOrSplitGesture j(Object obj) {
        return (JoinOrSplitGesture) obj;
    }

    public static /* bridge */ /* synthetic */ SelectGesture k(Object obj) {
        return (SelectGesture) obj;
    }

    public static /* bridge */ /* synthetic */ boolean n(Object obj) {
        return obj instanceof JoinOrSplitGesture;
    }

    public static /* bridge */ /* synthetic */ boolean q(Object obj) {
        return obj instanceof SelectGesture;
    }
}
