package I;

import android.view.View;

/* loaded from: classes.dex */
public interface r {
    void onNestedPreScroll(View view, int i2, int i5, int[] iArr, int i7);

    void onNestedScroll(View view, int i2, int i5, int i7, int i8, int i9);

    void onNestedScrollAccepted(View view, View view2, int i2, int i5);

    boolean onStartNestedScroll(View view, View view2, int i2, int i5);

    void onStopNestedScroll(View view, int i2);
}
