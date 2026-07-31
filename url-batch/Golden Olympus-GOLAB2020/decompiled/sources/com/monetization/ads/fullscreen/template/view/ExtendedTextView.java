package com.monetization.ads.fullscreen.template.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.TextView;
import com.yandex.mobile.ads.impl.C1829be;
import com.yandex.mobile.ads.impl.C1853ce;
import com.yandex.mobile.ads.impl.au0;
import com.yandex.mobile.ads.impl.gy1;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class ExtendedTextView extends TextView {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private au0 f20694a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final C1829be f20695b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @SuppressLint({"CustomViewStyleable"})
    public ExtendedTextView(@NotNull Context context) {
        this(context, null, 0, null, null, 30, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        C1829be c1829be;
        super.onLayout(z4, i4, i5, i6, i7);
        if (Build.VERSION.SDK_INT < 27 && (c1829be = this.f20695b) != null) {
            c1829be.a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i4, int i5) {
        au0.a a4 = this.f20694a.a(i4, i5);
        super.onMeasure(a4.f23449a, a4.f23450b);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(@NotNull CharSequence text, int i4, int i5, int i6) {
        C1829be c1829be;
        Intrinsics.checkNotNullParameter(text, "text");
        super.onTextChanged(text, i4, i5, i6);
        if (Build.VERSION.SDK_INT < 27 && (c1829be = this.f20695b) != null) {
            c1829be.b();
        }
    }

    public final void setAutoSizeTextType(int i4) {
        if (Build.VERSION.SDK_INT >= 27) {
            setAutoSizeTextTypeWithDefaults(i4);
            return;
        }
        C1829be c1829be = this.f20695b;
        if (c1829be != null) {
            c1829be.a(i4);
        }
    }

    public final void setMeasureSpecProvider(@NotNull au0 measureSpecProvider) {
        Intrinsics.checkNotNullParameter(measureSpecProvider, "measureSpecProvider");
        this.f20694a = measureSpecProvider;
        requestLayout();
        invalidate();
    }

    @Override // android.widget.TextView
    public void setTextSize(int i4, float f4) {
        if (Build.VERSION.SDK_INT >= 27) {
            super.setTextSize(i4, f4);
            return;
        }
        C1829be c1829be = this.f20695b;
        if (c1829be != null) {
            c1829be.a(i4, f4);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @SuppressLint({"CustomViewStyleable"})
    public ExtendedTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, null, null, 28, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @SuppressLint({"CustomViewStyleable"})
    public ExtendedTextView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i4) {
        this(context, attributeSet, i4, null, null, 24, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @SuppressLint({"CustomViewStyleable"})
    public ExtendedTextView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i4, @NotNull au0 measureSpecProvider) {
        this(context, attributeSet, i4, measureSpecProvider, null, 16, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(measureSpecProvider, "measureSpecProvider");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @SuppressLint({"CustomViewStyleable"})
    public ExtendedTextView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i4, @NotNull au0 measureSpecProvider, @NotNull C1853ce appCompatAutoSizeControllerFactory) {
        super(context, attributeSet, i4);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(measureSpecProvider, "measureSpecProvider");
        Intrinsics.checkNotNullParameter(appCompatAutoSizeControllerFactory, "appCompatAutoSizeControllerFactory");
        this.f20694a = measureSpecProvider;
        appCompatAutoSizeControllerFactory.getClass();
        this.f20695b = C1853ce.a(this);
    }

    public /* synthetic */ ExtendedTextView(Context context, AttributeSet attributeSet, int i4, au0 au0Var, C1853ce c1853ce, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i5 & 2) != 0 ? null : attributeSet, (i5 & 4) != 0 ? 0 : i4, (i5 & 8) != 0 ? new gy1() : au0Var, (i5 & 16) != 0 ? new C1853ce() : c1853ce);
    }
}
