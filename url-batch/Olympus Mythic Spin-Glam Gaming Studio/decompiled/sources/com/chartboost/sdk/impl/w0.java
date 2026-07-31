package com.chartboost.sdk.impl;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.VisibleForTesting;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.R;
import com.chartboost.sdk.impl.o7;
import com.chartboost.sdk.impl.xh;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class w0 extends ConstraintLayout {
    public final t5 a;
    public final u b;
    public final a0 c;
    public final Mediation d;
    public final bb e;
    public final ql f;
    public final g5 g;
    public final f5 h;
    public final zh i;
    public xh j;
    public k2 k;
    public final rh l;
    public boolean m;
    public a1 n;
    public boolean o;
    public long p;

    public /* synthetic */ class f {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[y0.values().length];
            try {
                iArr[y0.d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[y0.e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[y0.f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[y0.g.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
            int[] iArr2 = new int[z0.values().length];
            try {
                iArr2[z0.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[z0.c.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[z0.d.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[z0.e.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[z0.f.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[z0.g.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[z0.h.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            b = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(Context context, t5 t5Var, u adFormat, a0 adMarkupConfig, Mediation mediation) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(adMarkupConfig, "adMarkupConfig");
        this.a = t5Var;
        this.b = adFormat;
        this.c = adMarkupConfig;
        this.d = mediation;
        this.l = f4.b.a().q();
        this.p = 30000L;
        u uVar = u.b;
        if (adFormat != uVar) {
            setPadding(a(16), a(4), a(16), a(0));
        }
        bb bbVar = new bb(context, null, 0, null, new a(), 14, null);
        this.e = bbVar;
        if (adFormat == uVar) {
            bbVar.a(false);
        }
        ql qlVar = new ql(context, null, 0, null, null, new b(), 30, null);
        this.f = qlVar;
        String string = context.getString(R.string.timer_notification_icon_description);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = context.getString(R.string.close_button_description);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String string3 = context.getString(R.string.skip_button_description);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        g5 g5Var = new g5(context, null, 0, string, string2, string3, null, new c(), new d(), 70, null);
        g5.a(g5Var, false, 1, null);
        this.g = g5Var;
        this.h = new f5(g5Var);
        zh zhVar = new zh(context, null, 0, null, null, 30, null);
        zhVar.setVisibility(8);
        this.i = zhVar;
        if (t5Var != null) {
            k2 a2 = te.a.a(context, t5Var, new e());
            this.k = a2;
            addView(a2);
            a(this, true, (String) null, 2, (Object) null);
        }
        addView(qlVar);
        addView(bbVar);
        addView(zhVar);
        addView(g5Var);
        j();
        i();
    }

    @VisibleForTesting
    public static /* synthetic */ void getTimerCompleteCallback$annotations() {
    }

    private final void setTimerRunning(boolean z) {
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

    public final void i() {
        this.e.setAccessibilityTraversalBefore(this.f.getId());
        this.f.setAccessibilityTraversalBefore(this.i.getId());
        this.i.setAccessibilityTraversalBefore(this.g.getId());
        k2 k2Var = this.k;
        if (k2Var != null) {
            this.g.setAccessibilityTraversalBefore(k2Var.getId());
        }
    }

    public final void a(boolean z, y0 position, x0 margin, x0 padding, x0 size) {
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(margin, "margin");
        Intrinsics.checkNotNullParameter(padding, "padding");
        Intrinsics.checkNotNullParameter(size, "size");
        if (!z) {
            this.g.setVisibility(8);
        }
        if (z) {
            ConstraintSet constraintSet = new ConstraintSet();
            constraintSet.clone(this);
            constraintSet.clear(this.g.getId(), 1);
            constraintSet.clear(this.g.getId(), 2);
            constraintSet.clear(this.g.getId(), 3);
            constraintSet.clear(this.g.getId(), 4);
            int i = f.a[position.ordinal()];
            if (i == 1) {
                constraintSet.connect(this.g.getId(), 1, 0, 1, a(margin.b()));
                constraintSet.connect(this.g.getId(), 3, 0, 3, a(margin.a()));
            } else if (i == 2) {
                constraintSet.connect(this.g.getId(), 2, 0, 2, a(margin.b()));
                constraintSet.connect(this.g.getId(), 3, 0, 3, a(margin.a()));
            } else if (i == 3) {
                constraintSet.connect(this.g.getId(), 1, 0, 1, a(margin.b()));
                constraintSet.connect(this.g.getId(), 4, 0, 4, a(margin.a()));
            } else if (i == 4) {
                constraintSet.connect(this.g.getId(), 2, 0, 2, a(margin.b()));
                constraintSet.connect(this.g.getId(), 4, 0, 4, a(margin.a()));
            }
            constraintSet.applyTo(this);
        }
    }

    @Nullable
    public final a1 getAdViewOverlayListener() {
        return this.n;
    }

    public final void setAdViewOverlayListener(@Nullable a1 a1Var) {
        this.n = a1Var;
    }

    @Nullable
    public final Function0 getTimerCompleteCallback() {
        xh b2 = this.h.b();
        if (b2 != null) {
            return b2.b();
        }
        return null;
    }

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final void a(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            a1 adViewOverlayListener = w0.this.getAdViewOverlayListener();
            if (adViewOverlayListener != null) {
                adViewOverlayListener.g();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((String) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class b extends Lambda implements Function1 {
        public b() {
            super(1);
        }

        public final void a(boolean z) {
            a1 adViewOverlayListener = w0.this.getAdViewOverlayListener();
            if (adViewOverlayListener != null) {
                adViewOverlayListener.a(z);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }
    }

    public static final class c extends Lambda implements Function0 {
        public c() {
            super(0);
        }

        public final void a() {
            a1 adViewOverlayListener = w0.this.getAdViewOverlayListener();
            if (adViewOverlayListener != null) {
                adViewOverlayListener.e();
            }
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    public static final class d extends Lambda implements Function0 {
        public d() {
            super(0);
        }

        public final void a() {
            a1 adViewOverlayListener = w0.this.getAdViewOverlayListener();
            if (adViewOverlayListener != null) {
                adViewOverlayListener.c();
            }
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    public static final class e extends Lambda implements Function0 {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }

        public final void a() {
            a1 adViewOverlayListener = w0.this.getAdViewOverlayListener();
            if (adViewOverlayListener != null) {
                adViewOverlayListener.b();
            }
        }
    }

    public final void j() {
        this.e.setId(View.generateViewId());
        this.f.setId(View.generateViewId());
        this.g.setId(View.generateViewId());
        k2 k2Var = this.k;
        if (k2Var != null) {
            k2Var.setId(View.generateViewId());
        }
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this);
        constraintSet.constrainWidth(this.f.getId(), -2);
        constraintSet.constrainHeight(this.f.getId(), -2);
        constraintSet.connect(this.f.getId(), 1, 0, 1);
        constraintSet.connect(this.f.getId(), 3, 0, 3);
        constraintSet.constrainWidth(this.e.getId(), -2);
        constraintSet.constrainHeight(this.e.getId(), -2);
        constraintSet.connect(this.e.getId(), 1, this.f.getId(), 2, a(8));
        constraintSet.setGoneMargin(this.e.getId(), 1, 0);
        constraintSet.connect(this.e.getId(), 3, 0, 3);
        constraintSet.constrainWidth(this.g.getId(), -2);
        constraintSet.constrainHeight(this.g.getId(), -2);
        constraintSet.connect(this.g.getId(), 2, 0, 2);
        constraintSet.connect(this.g.getId(), 3, 0, 3);
        k2 k2Var2 = this.k;
        if (k2Var2 != null) {
            constraintSet.constrainWidth(k2Var2.getId(), 0);
            constraintSet.connect(k2Var2.getId(), 1, 0, 1);
            constraintSet.connect(k2Var2.getId(), 2, 0, 2);
            constraintSet.connect(k2Var2.getId(), 4, 0, 4);
        }
        constraintSet.applyTo(this);
    }

    public final void setTimerDuration(long j) {
        this.p = j;
    }

    public static final class g extends Lambda implements Function0 {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }

        public final void a() {
            a1 adViewOverlayListener = w0.this.getAdViewOverlayListener();
            if (adViewOverlayListener != null) {
                adViewOverlayListener.d();
            }
            rh rhVar = w0.this.l;
            f7 f7Var = new f7(w0.this.c.c(), CollectionsKt.emptyList(), g7.d, null, null, null, null, null, w0.this.d, 240, null);
            List e = w0.this.c.e();
            ArrayList<o7> arrayList = new ArrayList();
            for (Object obj : e) {
                if (Intrinsics.areEqual(((o7) obj).d(), o7.b.f.b())) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            for (o7 o7Var : arrayList) {
                arrayList2.add(new ei(o7Var.e(), o7Var.c(), o7Var.a(), null, 8, null));
            }
            rh.a(rhVar, f7Var, arrayList2, (o7.b) null, 4, (Object) null);
        }
    }

    public final void setTimer(long j) {
        f5.a(this.h, j, ai.c, null, null, new g(), 12, null);
    }

    public final void setupRewardChip(long j) {
        xh xhVar = this.j;
        if (xhVar != null) {
            xhVar.a();
        }
        this.i.a(ai.b, getContext().getString(R.string.reward_timer_running), getContext().getString(R.string.reward_timer_complete));
        if (j > 0) {
            xh xhVar2 = new xh(j, null);
            xhVar2.a(this.i);
            this.j = xhVar2;
        }
        a();
    }

    public final void l() {
        xh xhVar = this.j;
        if (xhVar != null) {
            xhVar.g();
        }
    }

    public final void k() {
        xh xhVar = this.j;
        if (xhVar != null) {
            xhVar.h();
        }
        this.i.setVisibility(0);
        this.i.a(0L, 1L);
        a();
    }

    public final void m() {
        this.h.e();
    }

    public final void h() {
        this.h.d();
    }

    public final void setRewardedMode(boolean z) {
        this.o = z;
    }

    public final void g(boolean z) {
        this.f.setVisibility(z ? 0 : 8);
        this.f.setImportantForAccessibility(z ? 1 : 2);
    }

    public final void d(boolean z) {
        this.i.setVisibility(z ? 0 : 8);
    }

    public final void c(boolean z) {
        this.e.setVisibility(z ? 0 : 8);
        this.e.setImportantForAccessibility(z ? 1 : 2);
    }

    public final void e(boolean z) {
        this.g.b(z);
        this.g.setImportantForAccessibility(z ? 1 : 2);
    }

    public final void f(boolean z) {
        this.g.c(z);
        this.g.setImportantForAccessibility(z ? 1 : 2);
    }

    public final boolean d() {
        return this.h.b() != null;
    }

    public final void a(boolean z, String ctaTextTitle) {
        k2 k2Var;
        Intrinsics.checkNotNullParameter(ctaTextTitle, "ctaTextTitle");
        if (this.k == null) {
            return;
        }
        a(z0.g, z);
        if (z && (k2Var = this.k) != null) {
            k2Var.setCustomContentDescription(ctaTextTitle);
        }
    }

    public final boolean e() {
        xh b2 = this.h.b();
        return (b2 != null ? b2.d() : null) == xh.b.b;
    }

    public final void b() {
        this.h.a();
        xh xhVar = this.j;
        if (xhVar != null) {
            xhVar.a();
        }
        this.j = null;
    }

    public final void g() {
        this.h.c();
    }

    public final void h(boolean z) {
        this.f.setMuted(z);
    }

    public final void f() {
        xh xhVar = this.j;
        if (xhVar != null) {
            xhVar.e();
        }
    }

    public final boolean c() {
        return this.g.getCloseButton().getVisibility() == 0;
    }

    public final void b(boolean z) {
        k2 k2Var = this.k;
        if (k2Var != null) {
            k2Var.setVisibility(z ? 0 : 8);
            k2Var.setImportantForAccessibility(z ? 1 : 2);
            if (!z || this.m) {
                return;
            }
            this.m = true;
            rh rhVar = this.l;
            f7 f7Var = new f7(this.c.c(), CollectionsKt.emptyList(), g7.c, u5.a(this.a), null, null, null, null, this.d, 240, null);
            List e2 = this.c.e();
            ArrayList<o7> arrayList = new ArrayList();
            for (Object obj : e2) {
                if (Intrinsics.areEqual(((o7) obj).d(), o7.b.f.b())) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            for (o7 o7Var : arrayList) {
                arrayList2.add(new ei(o7Var.e(), o7Var.c(), o7Var.a(), null, 8, null));
            }
            rh.a(rhVar, f7Var, arrayList2, (o7.b) null, 4, (Object) null);
        }
    }

    public static /* synthetic */ void a(w0 w0Var, boolean z, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        w0Var.a(z, str);
    }

    public final void a(boolean z, y0 position, x0 margin, x0 padding, x0 size, String imageUrl, String clickthroughUrl, boolean z2) {
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(margin, "margin");
        Intrinsics.checkNotNullParameter(padding, "padding");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(clickthroughUrl, "clickthroughUrl");
        a(z0.b, z);
        if (z) {
            this.e.a(size);
            ConstraintSet constraintSet = new ConstraintSet();
            constraintSet.clone(this);
            constraintSet.clear(this.e.getId(), 1);
            constraintSet.clear(this.e.getId(), 2);
            constraintSet.clear(this.e.getId(), 3);
            constraintSet.clear(this.e.getId(), 4);
            int i = f.a[position.ordinal()];
            if (i == 1) {
                constraintSet.connect(this.f.getId(), 1, 0, 1, a(margin.b()));
                constraintSet.connect(this.e.getId(), 1, this.f.getId(), 2, a(8));
                constraintSet.setGoneMargin(this.e.getId(), 1, 0);
                constraintSet.connect(this.e.getId(), 3, 0, 3, a(margin.a()));
                constraintSet.connect(this.f.getId(), 3, 0, 3, a(margin.a()));
                constraintSet.connect(this.g.getId(), 3, 0, 3, a(margin.a()));
            } else if (i == 2) {
                constraintSet.connect(this.e.getId(), 2, 0, 2, a(margin.b()));
                constraintSet.connect(this.e.getId(), 3, 0, 3, a(margin.a()));
            } else if (i == 3) {
                constraintSet.connect(this.e.getId(), 1, 0, 1, a(margin.b()));
                constraintSet.connect(this.e.getId(), 4, 0, 4, a(margin.a()));
            } else if (i == 4) {
                constraintSet.connect(this.e.getId(), 2, 0, 2, a(margin.b()));
                constraintSet.connect(this.e.getId(), 4, 0, 4, a(margin.a()));
            }
            constraintSet.applyTo(this);
            if (imageUrl.length() > 0) {
                this.e.a(imageUrl);
            }
            this.e.setClickthroughUrl(clickthroughUrl);
            this.e.setEnableSponsorText(z2);
        }
    }

    public final void a(z0 chip, boolean z) {
        Intrinsics.checkNotNullParameter(chip, "chip");
        switch (f.b[chip.ordinal()]) {
            case 1:
                c(z);
                break;
            case 2:
                g(z);
                break;
            case 3:
                a(z);
                break;
            case 4:
                e(z);
                break;
            case 5:
                f(z);
                break;
            case 6:
                b(z);
                break;
            case 7:
                d(z);
                break;
        }
    }

    public final void a(boolean z) {
        this.g.a(z);
        this.g.setImportantForAccessibility(z ? 1 : 2);
    }

    public final int a(double d2) {
        return (int) (d2 * getContext().getResources().getDisplayMetrics().density);
    }

    public final int a(int i) {
        return (int) (i * getContext().getResources().getDisplayMetrics().density);
    }

    public final void a(il tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        tracker.a(this, gl.j);
        this.e.a(tracker, gl.h);
        this.f.a(tracker, gl.l);
        zh timerChipView = this.g.getTimerChipView();
        gl glVar = gl.i;
        timerChipView.a(tracker, glVar);
        this.g.getCloseButton().a(tracker, gl.e);
        this.g.getSkipButton().a(tracker, gl.g);
        k2 k2Var = this.k;
        if (k2Var != null) {
            k2Var.a(tracker, gl.f);
        }
        this.i.a(tracker, glVar);
    }

    public final void a() {
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this);
        constraintSet.clear(this.i.getId(), 1);
        constraintSet.clear(this.i.getId(), 2);
        constraintSet.clear(this.i.getId(), 3);
        constraintSet.clear(this.i.getId(), 4);
        constraintSet.connect(this.i.getId(), 2, this.g.getId(), 1, a(8));
        constraintSet.connect(this.i.getId(), 3, this.g.getId(), 3);
        constraintSet.applyTo(this);
    }
}
