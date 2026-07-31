package androidx.core.view;

import android.view.ViewGroup;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* loaded from: classes14.dex */
public final class ViewGroupCompat {
    public static boolean isTransitionGroup(ViewGroup viewGroup) {
        return Api21Impl.isTransitionGroup(viewGroup);
    }

    @RequiresApi
    static class Api21Impl {
        @DoNotInline
        static void setTransitionGroup(ViewGroup viewGroup, boolean z) {
            viewGroup.setTransitionGroup(z);
        }

        @DoNotInline
        static boolean isTransitionGroup(ViewGroup viewGroup) {
            return viewGroup.isTransitionGroup();
        }

        @DoNotInline
        static int getNestedScrollAxes(ViewGroup viewGroup) {
            return viewGroup.getNestedScrollAxes();
        }
    }
}
