package com.ironsource;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class xv {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final so f20360a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private View f20361b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f20362c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ViewTreeObserver.OnGlobalLayoutListener f20363d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final ViewTreeObserver.OnWindowFocusChangeListener f20364e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final Rect f20365f;

    public xv(@NotNull so onVisibilityChangeListener) {
        Intrinsics.checkNotNullParameter(onVisibilityChangeListener, "onVisibilityChangeListener");
        this.f20360a = onVisibilityChangeListener;
        this.f20363d = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.ironsource.A5
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                xv.a(xv.this);
            }
        };
        this.f20364e = new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: com.ironsource.B5
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public final void onWindowFocusChanged(boolean z4) {
                xv.a(xv.this, z4);
            }
        };
        this.f20365f = new Rect();
    }

    private final void a() {
        boolean c4 = c();
        if (this.f20362c != c4) {
            this.f20362c = c4;
            this.f20360a.a(c4);
        }
    }

    public final void a(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f20361b = view;
        view.getViewTreeObserver().addOnGlobalLayoutListener(this.f20363d);
        view.getViewTreeObserver().addOnWindowFocusChangeListener(this.f20364e);
    }

    public final void b() {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        View view = this.f20361b;
        if (view != null && (viewTreeObserver2 = view.getViewTreeObserver()) != null) {
            viewTreeObserver2.removeOnGlobalLayoutListener(this.f20363d);
        }
        View view2 = this.f20361b;
        if (view2 != null && (viewTreeObserver = view2.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnWindowFocusChangeListener(this.f20364e);
        }
        this.f20361b = null;
    }

    public final boolean c() {
        View view;
        View view2;
        View view3 = this.f20361b;
        return view3 != null && view3.isShown() && (view = this.f20361b) != null && view.hasWindowFocus() && (view2 = this.f20361b) != null && view2.getGlobalVisibleRect(this.f20365f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(xv this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(xv this$0, boolean z4) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.a();
    }
}
