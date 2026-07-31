package com.monetization.ads.nativeads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.impl.ViewOnAttachStateChangeListenerC1808ah;
import com.yandex.mobile.ads.impl.nf2;
import com.yandex.mobile.ads.impl.of2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public class CustomizableMediaView extends FrameLayout {

    /* renamed from: f, reason: collision with root package name */
    private static final int f20828f = R.layout.monetization_ads_internal_outstream_controls_default;

    /* renamed from: a, reason: collision with root package name */
    private int f20829a;

    /* renamed from: b, reason: collision with root package name */
    private int f20830b;

    /* renamed from: c, reason: collision with root package name */
    private int f20831c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private nf2 f20832d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private a f20833e;

    public interface a {
        void a(int i4, int i5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @SuppressLint({"CustomViewStyleable"})
    public CustomizableMediaView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        Intrinsics.checkNotNullParameter(context, "context");
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.MonetizationAdsInternalMediaView);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
            this.f20829a = obtainStyledAttributes.getResourceId(R.styleable.MonetizationAdsInternalMediaView_monetization_internal_video_controls_layout, f20828f);
            this.f20832d = of2.a(obtainStyledAttributes);
            obtainStyledAttributes.recycle();
        } else {
            this.f20829a = f20828f;
            this.f20832d = null;
        }
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1808ah(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.monetization.ads.nativeads.a
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                CustomizableMediaView.a(CustomizableMediaView.this);
            }
        }));
    }

    protected final void a(int i4) {
        this.f20829a = i4;
    }

    public final int getHeightMeasureSpec() {
        return this.f20831c;
    }

    @Nullable
    public final a getOnSizeChangedListener$mobileads_externalRelease() {
        return this.f20833e;
    }

    public final int getVideoControlsLayoutId() {
        return this.f20829a;
    }

    @Nullable
    public final nf2 getVideoScaleType() {
        return this.f20832d;
    }

    public final int getWidthMeasureSpec() {
        return this.f20830b;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        this.f20830b = i4;
        this.f20831c = i5;
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        a aVar = this.f20833e;
        if (aVar != null) {
            aVar.a(i4, i5);
        }
    }

    public final void setOnSizeChangedListener$mobileads_externalRelease(@Nullable a aVar) {
        this.f20833e = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(CustomizableMediaView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        a aVar = this$0.f20833e;
        if (aVar != null) {
            aVar.a(this$0.getWidth(), this$0.getHeight());
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CustomizableMediaView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CustomizableMediaView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
