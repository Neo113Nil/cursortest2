package com.monetization.ads.mediation.banner;

import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.yandex.mobile.ads.impl.C1873da;
import com.yandex.mobile.ads.impl.ao1;
import com.yandex.mobile.ads.impl.bo1;
import com.yandex.mobile.ads.impl.pg2;
import com.yandex.mobile.ads.impl.vo0;
import com.yandex.mobile.ads.impl.vy1;
import j2.AbstractC3185a;
import kotlin.jvm.internal.Intrinsics;
import m2.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    static final /* synthetic */ h[] f20724d = {C1873da.a(d.class, "adView", "getAdView()Landroid/view/ViewGroup;", 0)};

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final vy1 f20725a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Handler f20726b = new Handler(Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ao1 f20727c;

    public interface a {
        void a();
    }

    public d(@Nullable vo0 vo0Var, @Nullable vy1 vy1Var) {
        this.f20725a = vy1Var;
        this.f20727c = bo1.a(vo0Var);
    }

    public static final ViewGroup a(d dVar) {
        return (ViewGroup) dVar.f20727c.getValue(dVar, f20724d[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(d this$0, View contentView, a contentViewShowListener) {
        RelativeLayout.LayoutParams layoutParams;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(contentView, "$contentView");
        Intrinsics.checkNotNullParameter(contentViewShowListener, "$contentViewShowListener");
        ViewGroup viewGroup = (ViewGroup) this$0.f20727c.getValue(this$0, f20724d[0]);
        if (viewGroup != null && viewGroup.indexOfChild(contentView) == -1) {
            vy1 vy1Var = this$0.f20725a;
            if (vy1Var == null) {
                layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            } else {
                int height = vy1Var.getHeight();
                float f4 = Resources.getSystem().getDisplayMetrics().density;
                if (height >= 0) {
                    height = AbstractC3185a.c(height * f4);
                }
                int width = this$0.f20725a.getWidth();
                float f5 = Resources.getSystem().getDisplayMetrics().density;
                if (width >= 0) {
                    width = AbstractC3185a.c(width * f5);
                }
                contentView.measure(0, 0);
                int measuredHeight = contentView.getMeasuredHeight();
                layoutParams = new RelativeLayout.LayoutParams(Math.min(width, contentView.getMeasuredWidth()), Math.min(height, measuredHeight));
            }
            layoutParams.addRule(13);
            pg2.a(contentView);
            viewGroup.addView(contentView, layoutParams);
            viewGroup.setVisibility(0);
            contentView.setVisibility(0);
        }
        contentView.getViewTreeObserver().addOnPreDrawListener(new e(this$0, contentView, contentViewShowListener));
    }

    public final void a(@NotNull final View contentView, @NotNull final a contentViewShowListener) {
        Intrinsics.checkNotNullParameter(contentView, "contentView");
        Intrinsics.checkNotNullParameter(contentViewShowListener, "contentViewShowListener");
        this.f20726b.post(new Runnable() { // from class: com.monetization.ads.mediation.banner.f
            @Override // java.lang.Runnable
            public final void run() {
                d.a(d.this, contentView, contentViewShowListener);
            }
        });
    }
}
