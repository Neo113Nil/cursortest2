package com.withpersona.sdk2.inquiry.shared.ui;

import android.os.Build;
import android.view.View;
import androidx.compose.foundation.layout.RowScopeInstance$$ExternalSyntheticLambda0;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.internal.ViewUtils;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public abstract class InsetsUtilsKt {
    public static final boolean supportsCustomNavigationBar;

    static {
        supportsCustomNavigationBar = Build.VERSION.SDK_INT >= 30;
    }

    public static void applyInsetsAsPadding$default(final View view, int i) {
        final boolean z = (i & 1) != 0;
        final boolean z2 = (i & 2) != 0;
        final boolean z3 = (i & 4) != 0;
        final boolean z4 = (i & 8) != 0;
        view.getClass();
        onInsetsChanged(view, new Function1() { // from class: com.withpersona.sdk2.inquiry.shared.ui.InsetsUtilsKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                WindowInsetsCompat windowInsetsCompat = (WindowInsetsCompat) obj;
                windowInsetsCompat.getClass();
                WindowInsetsCompat.Impl impl = windowInsetsCompat.mImpl;
                Insets insetsIgnoringVisibility = impl.getInsetsIgnoringVisibility(519);
                insetsIgnoringVisibility.getClass();
                Insets insets = impl.getInsets(8);
                insets.getClass();
                int i2 = insets.bottom;
                int i3 = insetsIgnoringVisibility.top;
                int max = Integer.max(insetsIgnoringVisibility.bottom, i2);
                int i4 = insetsIgnoringVisibility.left;
                int i5 = insetsIgnoringVisibility.right;
                View view2 = view;
                if (!z3) {
                    i4 = view2.getPaddingLeft();
                }
                if (!z) {
                    i3 = view2.getPaddingTop();
                }
                if (!z4) {
                    i5 = view2.getPaddingRight();
                }
                if (!z2) {
                    max = view2.getPaddingBottom();
                }
                view2.setPadding(i4, i3, i5, max);
                return Unit.INSTANCE;
            }
        });
    }

    public static final void onInsetsChanged(View view, Function1 function1) {
        view.getClass();
        RowScopeInstance$$ExternalSyntheticLambda0 rowScopeInstance$$ExternalSyntheticLambda0 = new RowScopeInstance$$ExternalSyntheticLambda0(function1);
        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
        ViewCompat.Api21Impl.setOnApplyWindowInsetsListener(view, rowScopeInstance$$ExternalSyntheticLambda0);
        if (view.isAttachedToWindow()) {
            view.requestApplyInsets();
        } else {
            view.addOnAttachStateChangeListener(new ViewUtils.AnonymousClass3(1));
        }
    }
}
