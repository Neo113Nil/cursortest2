package com.yandex.div.internal.widget;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public abstract class TransientViewKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean isInTransientHierarchy(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (!(view instanceof TransientView)) {
            return false;
        }
        if (((TransientView) view).isTransient()) {
            return true;
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewParent parent = view.getParent();
            Intrinsics.checkNotNullExpressionValue(parent, "parent");
            if (isInTransientHierarchy(parent)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean isInTransientHierarchy(@NotNull ViewParent viewParent) {
        Intrinsics.checkNotNullParameter(viewParent, "<this>");
        return (viewParent instanceof TransientView) && isInTransientHierarchy((View) viewParent);
    }
}
