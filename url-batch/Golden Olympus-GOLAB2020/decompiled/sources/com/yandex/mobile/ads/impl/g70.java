package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import com.yandex.mobile.ads.impl.nh2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class g70 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final nh2 f26044a;

    public /* synthetic */ g70() {
        this(new nh2());
    }

    @NotNull
    public final <T extends View & nh2.a> f70 a(@NotNull T view) {
        int i4;
        Intrinsics.checkNotNullParameter(view, "view");
        this.f26044a.getClass();
        RectF rectF = null;
        if (nh2.a(view)) {
            i4 = lh2.a(view);
            Rect rect = new Rect();
            if (view.getLocalVisibleRect(rect)) {
                rect.offset(view.getLeft(), view.getTop());
            } else {
                rect = null;
            }
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            if (rect != null) {
                float a4 = lh2.a(context, rect.left);
                float a5 = lh2.a(context, rect.top);
                float a6 = lh2.a(context, rect.right);
                float a7 = lh2.a(context, rect.bottom);
                float f4 = a7 - a5;
                if (a6 - a4 > 0.0f && f4 > 0.0f) {
                    rectF = new RectF(a4, a5, a6, a7);
                }
            }
        } else {
            i4 = 0;
        }
        return new f70(i4, rectF);
    }

    public g70(@NotNull nh2 viewableChecker) {
        Intrinsics.checkNotNullParameter(viewableChecker, "viewableChecker");
        this.f26044a = viewableChecker;
    }
}
