package androidx.core.view;

import android.view.View;

/* loaded from: classes.dex */
public interface G {
    void onNestedPreScroll(View view, int i4, int i5, int[] iArr, int i6);

    void onNestedScroll(View view, int i4, int i5, int i6, int i7, int i8);

    void onNestedScrollAccepted(View view, View view2, int i4, int i5);

    boolean onStartNestedScroll(View view, View view2, int i4, int i5);

    void onStopNestedScroll(View view, int i4);
}
