package com.chartboost.sdk.impl;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.chartboost.sdk.R;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class g5 extends ConstraintLayout {
    public String a;
    public String b;
    public String c;
    public final g6 d;
    public final Function0 e;
    public final Function0 f;
    public final zh g;
    public final t4 h;
    public final ih i;
    public final int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5(Context context, AttributeSet attributeSet, int i, String timerContentDescription, String closeContentDescription, String skipContentDescription, g6 densityProvider, Function0 onCloseClicked, Function0 onSkipClicked) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(timerContentDescription, "timerContentDescription");
        Intrinsics.checkNotNullParameter(closeContentDescription, "closeContentDescription");
        Intrinsics.checkNotNullParameter(skipContentDescription, "skipContentDescription");
        Intrinsics.checkNotNullParameter(densityProvider, "densityProvider");
        Intrinsics.checkNotNullParameter(onCloseClicked, "onCloseClicked");
        Intrinsics.checkNotNullParameter(onSkipClicked, "onSkipClicked");
        this.a = timerContentDescription;
        this.b = closeContentDescription;
        this.c = skipContentDescription;
        this.d = densityProvider;
        this.e = onCloseClicked;
        this.f = onSkipClicked;
        this.j = 28;
        setId(View.generateViewId());
        setLayoutParams(new ConstraintLayout.LayoutParams(-2, -2));
        int a2 = new a6(context).a(28);
        zh zhVar = new zh(context, null, 0, null, null, 30, null);
        zhVar.setId(View.generateViewId());
        zhVar.setLayoutParams(new ConstraintLayout.LayoutParams(a2, a2));
        zhVar.setVisibility(8);
        this.g = zhVar;
        addView(zhVar);
        ih ihVar = new ih(context, null, 0, 0, null, null, onSkipClicked, 62, null);
        ihVar.setId(View.generateViewId());
        ihVar.setLayoutParams(new ConstraintLayout.LayoutParams(a2, a2));
        ihVar.setVisibility(8);
        this.i = ihVar;
        addView(ihVar);
        t4 t4Var = new t4(context, null, 0, null, onCloseClicked, 14, null);
        t4Var.setId(View.generateViewId());
        t4Var.setLayoutParams(new ConstraintLayout.LayoutParams(a2, a2));
        t4Var.setVisibility(8);
        this.h = t4Var;
        addView(t4Var);
        a();
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.c, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public static final class a extends Lambda implements Function0 {
        public static final a b = new a();

        public a() {
            super(0);
        }

        public final void a() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    public static final class b extends Lambda implements Function0 {
        public static final b b = new b();

        public b() {
            super(0);
        }

        public final void a() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public final zh getTimerChipView() {
        return this.g;
    }

    @NotNull
    public final t4 getCloseButton() {
        return this.h;
    }

    @NotNull
    public final ih getSkipButton() {
        return this.i;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ g5(Context context, AttributeSet attributeSet, int i, String str, String str2, String str3, g6 g6Var, Function0 function0, Function0 function02, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, r2, r3, r4, r6, r7, (i2 & 64) != 0 ? new a6(context) : g6Var, (i2 & 128) != 0 ? a.b : function0, (i2 & 256) != 0 ? b.b : function02);
        String str4;
        String str5;
        String str6;
        AttributeSet attributeSet2 = (i2 & 2) != 0 ? null : attributeSet;
        int i3 = (i2 & 4) != 0 ? 0 : i;
        if ((i2 & 8) != 0) {
            str4 = context.getString(R.string.timer_notification_icon_description);
            Intrinsics.checkNotNullExpressionValue(str4, "getString(...)");
        } else {
            str4 = str;
        }
        if ((i2 & 16) != 0) {
            str5 = context.getString(R.string.close_button_description);
            Intrinsics.checkNotNullExpressionValue(str5, "getString(...)");
        } else {
            str5 = str2;
        }
        if ((i2 & 32) != 0) {
            str6 = context.getString(R.string.skip_button_description);
            Intrinsics.checkNotNullExpressionValue(str6, "getString(...)");
        } else {
            str6 = str3;
        }
    }

    public final void c(boolean z) {
        this.g.setVisibility(z ? 0 : 8);
    }

    public final void a(boolean z) {
        this.h.setVisibility(z ? 0 : 8);
    }

    public final void b(boolean z) {
        this.i.setVisibility(z ? 0 : 8);
    }

    public final void b() {
        String str;
        if (this.g.getVisibility() == 0) {
            str = this.a;
        } else if (this.h.getVisibility() == 0) {
            str = this.b;
        } else {
            str = this.i.getVisibility() == 0 ? this.c : null;
        }
        setContentDescription(str);
        setFocusable(getContentDescription() != null);
        setClickable(getContentDescription() != null);
    }

    public static /* synthetic */ void a(g5 g5Var, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        g5Var.c(z);
    }

    public final void a() {
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this);
        Iterator it = CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(this.g.getId()), Integer.valueOf(this.i.getId()), Integer.valueOf(this.h.getId())}).iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            constraintSet.connect(intValue, 1, 0, 1);
            constraintSet.connect(intValue, 2, 0, 2);
            constraintSet.connect(intValue, 3, 0, 3);
            constraintSet.connect(intValue, 4, 0, 4);
        }
        constraintSet.applyTo(this);
    }
}
