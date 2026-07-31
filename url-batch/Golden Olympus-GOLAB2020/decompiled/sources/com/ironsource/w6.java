package com.ironsource;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.w6;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class w6 extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final sv f20156a;

    @Metadata
    public static final class a implements sv {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(View this_apply) {
            Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
            this_apply.setEnabled(false);
            this_apply.setClickable(false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(C1585w2 adTools, long j4) {
            Intrinsics.checkNotNullParameter(adTools, "$adTools");
            adTools.e().h().a(j4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(C1585w2 adTools, long j4) {
            Intrinsics.checkNotNullParameter(adTools, "$adTools");
            adTools.e().h().a(true, j4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(final C1585w2 adTools, final long j4) {
            Intrinsics.checkNotNullParameter(adTools, "$adTools");
            adTools.d(new Runnable() { // from class: com.ironsource.J4
                @Override // java.lang.Runnable
                public final void run() {
                    w6.a.d(C1585w2.this, j4);
                }
            });
        }

        @Override // com.ironsource.sv
        public void a(@NotNull View view, @NotNull FrameLayout.LayoutParams layoutParams, @NotNull final C1585w2 adTools) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(layoutParams, "layoutParams");
            Intrinsics.checkNotNullParameter(adTools, "adTools");
            final View childAt = w6.this.getChildAt(0);
            final long e4 = nm.f18364r.d().d().e();
            if (e4 <= 0) {
                w6.this.removeView(childAt);
                w6.this.addView(view, layoutParams);
                adTools.d(new Runnable() { // from class: com.ironsource.E4
                    @Override // java.lang.Runnable
                    public final void run() {
                        w6.a.a(C1585w2.this, e4);
                    }
                });
                return;
            }
            adTools.d(new Runnable() { // from class: com.ironsource.F4
                @Override // java.lang.Runnable
                public final void run() {
                    w6.a.b(C1585w2.this, e4);
                }
            });
            view.setAlpha(0.0f);
            w6.this.addView(view, layoutParams);
            if (childAt != null) {
                final w6 w6Var = w6.this;
                childAt.animate().alpha(0.0f).setDuration(e4).withStartAction(new Runnable() { // from class: com.ironsource.G4
                    @Override // java.lang.Runnable
                    public final void run() {
                        w6.a.a(childAt);
                    }
                }).withEndAction(new Runnable() { // from class: com.ironsource.H4
                    @Override // java.lang.Runnable
                    public final void run() {
                        w6.a.a(w6.this, childAt, childAt);
                    }
                }).start();
            }
            view.animate().alpha(1.0f).setDuration(e4).withEndAction(new Runnable() { // from class: com.ironsource.I4
                @Override // java.lang.Runnable
                public final void run() {
                    w6.a.c(C1585w2.this, e4);
                }
            }).start();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(C1585w2 adTools, long j4) {
            Intrinsics.checkNotNullParameter(adTools, "$adTools");
            adTools.e().h().a(false, j4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(w6 this$0, View view, View this_apply) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
            this$0.removeView(view);
            this_apply.setEnabled(true);
            this_apply.setClickable(true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w6(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f20156a = new a();
    }

    @NotNull
    public final sv getViewBinder() {
        return this.f20156a;
    }
}
