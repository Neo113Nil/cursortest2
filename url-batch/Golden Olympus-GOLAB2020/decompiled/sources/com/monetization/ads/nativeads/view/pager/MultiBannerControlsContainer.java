package com.monetization.ads.nativeads.view.pager;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.impl.c50;
import com.yandex.mobile.ads.impl.k30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class MultiBannerControlsContainer extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final k30 f20835a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final c50 f20836b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f20837c;

    public static final class a extends ViewPager2.i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewPager2 f20838a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MultiBannerControlsContainer f20839b;

        a(ViewPager2 viewPager2, MultiBannerControlsContainer multiBannerControlsContainer) {
            this.f20838a = viewPager2;
            this.f20839b = multiBannerControlsContainer;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public final void onPageSelected(int i4) {
            RecyclerView.h adapter = this.f20838a.getAdapter();
            this.f20839b.a(i4, adapter != null ? adapter.getItemCount() : 0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiBannerControlsContainer(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f20835a = new k30();
        this.f20836b = new c50();
        this.f20837c = true;
    }

    public final void setOnClickLeftButtonListener(@NotNull View.OnClickListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        View findViewById = findViewById(R.id.left_scroll_control_button);
        ImageView imageView = findViewById instanceof ImageView ? (ImageView) findViewById : null;
        if (imageView != null) {
            imageView.setOnClickListener(listener);
        }
    }

    public final void setOnClickRightButtonListener(@NotNull View.OnClickListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        View findViewById = findViewById(R.id.right_scroll_control_button);
        ImageView imageView = findViewById instanceof ImageView ? (ImageView) findViewById : null;
        if (imageView != null) {
            imageView.setOnClickListener(listener);
        }
    }

    public final void a(@NotNull ViewPager2 viewPager) {
        Intrinsics.checkNotNullParameter(viewPager, "viewPager");
        viewPager.h(new a(viewPager, this));
        viewPager.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.monetization.ads.nativeads.view.pager.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
                MultiBannerControlsContainer.a(MultiBannerControlsContainer.this, view, i4, i5, i6, i7, i8, i9, i10, i11);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiBannerControlsContainer(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f20835a = new k30();
        this.f20836b = new c50();
        this.f20837c = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(MultiBannerControlsContainer this$0, View view, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (view instanceof ViewPager2) {
            boolean z4 = this$0.f20837c;
            boolean a4 = this$0.f20836b.a(view, i4, i5, i6, i7);
            this$0.f20837c = a4;
            if (a4 != z4) {
                ViewPager2 viewPager2 = (ViewPager2) view;
                int currentItem = viewPager2.getCurrentItem();
                RecyclerView.h adapter = viewPager2.getAdapter();
                this$0.a(currentItem, adapter != null ? adapter.getItemCount() : 0);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiBannerControlsContainer(@NotNull Context context, @Nullable AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f20835a = new k30();
        this.f20836b = new c50();
        this.f20837c = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(int i4, int i5) {
        View findViewById = findViewById(R.id.left_scroll_control_button);
        ImageView imageView = findViewById instanceof ImageView ? (ImageView) findViewById : null;
        View findViewById2 = findViewById(R.id.right_scroll_control_button);
        ImageView imageView2 = findViewById2 instanceof ImageView ? (ImageView) findViewById2 : null;
        View findViewById3 = findViewById(R.id.dot_indicator);
        ImageView imageView3 = findViewById3 instanceof ImageView ? (ImageView) findViewById3 : null;
        if (!this.f20837c) {
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
            if (imageView3 == null) {
                return;
            }
            imageView3.setVisibility(8);
            return;
        }
        View findViewById4 = findViewById(R.id.dot_indicator);
        ImageView imageView4 = findViewById4 instanceof ImageView ? (ImageView) findViewById4 : null;
        if (imageView4 != null) {
            imageView4.setVisibility(0);
            k30 k30Var = this.f20835a;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            imageView4.setImageDrawable(k30Var.a(context, i4, i5));
        }
        View findViewById5 = findViewById(R.id.left_scroll_control_button);
        ImageView imageView5 = findViewById5 instanceof ImageView ? (ImageView) findViewById5 : null;
        View findViewById6 = findViewById(R.id.right_scroll_control_button);
        ImageView imageView6 = findViewById6 instanceof ImageView ? (ImageView) findViewById6 : null;
        if (imageView5 == null || imageView6 == null) {
            if (imageView5 != null) {
                imageView5.setVisibility(8);
            }
            if (imageView6 == null) {
                return;
            }
            imageView6.setVisibility(8);
            return;
        }
        if (i4 == 0) {
            imageView5.setVisibility(8);
            imageView6.setVisibility(0);
        } else if (i4 == i5 - 1) {
            imageView5.setVisibility(0);
            imageView6.setVisibility(8);
        } else {
            imageView5.setVisibility(0);
            imageView6.setVisibility(0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiBannerControlsContainer(@NotNull Context context, @Nullable AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f20835a = new k30();
        this.f20836b = new c50();
        this.f20837c = true;
    }
}
