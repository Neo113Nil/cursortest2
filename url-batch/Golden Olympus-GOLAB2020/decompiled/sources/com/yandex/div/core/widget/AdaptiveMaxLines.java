package com.yandex.div.core.widget;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.core.view.AbstractC1281a0;
import com.yandex.div.core.widget.AdaptiveMaxLines;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class AdaptiveMaxLines {
    private boolean isAdaptLinesRequested;

    @Nullable
    private Params params;

    @Nullable
    private ViewTreeObserver.OnPreDrawListener preDrawListener;

    @NotNull
    private final TextView textView;

    @Nullable
    private View.OnAttachStateChangeListener viewAttachListener;

    @Metadata
    public static final class Params {
        private final int maxLines;
        private final int minHiddenLines;

        public Params(int i4, int i5) {
            this.maxLines = i4;
            this.minHiddenLines = i5;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Params)) {
                return false;
            }
            Params params = (Params) obj;
            return this.maxLines == params.maxLines && this.minHiddenLines == params.minHiddenLines;
        }

        public final int getMaxLines() {
            return this.maxLines;
        }

        public final int getTotalVisibleLines() {
            return this.maxLines + this.minHiddenLines;
        }

        public int hashCode() {
            return (Integer.hashCode(this.maxLines) * 31) + Integer.hashCode(this.minHiddenLines);
        }

        @NotNull
        public String toString() {
            return "Params(maxLines=" + this.maxLines + ", minHiddenLines=" + this.minHiddenLines + ')';
        }
    }

    public AdaptiveMaxLines(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "textView");
        this.textView = textView;
    }

    private final void addAttachListener() {
        if (this.viewAttachListener != null) {
            return;
        }
        View.OnAttachStateChangeListener onAttachStateChangeListener = new View.OnAttachStateChangeListener() { // from class: com.yandex.div.core.widget.AdaptiveMaxLines$addAttachListener$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(@NotNull View v4) {
                Intrinsics.checkNotNullParameter(v4, "v");
                AdaptiveMaxLines.this.addPreDrawListener();
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(@NotNull View v4) {
                Intrinsics.checkNotNullParameter(v4, "v");
                AdaptiveMaxLines.this.removePreDrawListener();
            }
        };
        this.textView.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.viewAttachListener = onAttachStateChangeListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addPreDrawListener() {
        if (this.preDrawListener != null) {
            return;
        }
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: com.yandex.div.core.widget.AdaptiveMaxLines$addPreDrawListener$1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                AdaptiveMaxLines.Params params;
                TextView textView;
                boolean z4;
                TextView textView2;
                TextView textView3;
                TextView textView4;
                params = AdaptiveMaxLines.this.params;
                if (params == null) {
                    return true;
                }
                textView = AdaptiveMaxLines.this.textView;
                if (TextUtils.isEmpty(textView.getText())) {
                    return true;
                }
                z4 = AdaptiveMaxLines.this.isAdaptLinesRequested;
                if (z4) {
                    AdaptiveMaxLines.this.removePreDrawListener();
                    AdaptiveMaxLines.this.isAdaptLinesRequested = false;
                    return true;
                }
                textView2 = AdaptiveMaxLines.this.textView;
                Integer num = textView2.getLineCount() > params.getTotalVisibleLines() ? null : Integer.MAX_VALUE;
                int intValue = num != null ? num.intValue() : params.getMaxLines();
                textView3 = AdaptiveMaxLines.this.textView;
                if (intValue == textView3.getMaxLines()) {
                    AdaptiveMaxLines.this.removePreDrawListener();
                    return true;
                }
                textView4 = AdaptiveMaxLines.this.textView;
                textView4.setMaxLines(intValue);
                AdaptiveMaxLines.this.isAdaptLinesRequested = true;
                return false;
            }
        };
        ViewTreeObserver viewTreeObserver = this.textView.getViewTreeObserver();
        Intrinsics.checkNotNullExpressionValue(viewTreeObserver, "textView.viewTreeObserver");
        viewTreeObserver.addOnPreDrawListener(onPreDrawListener);
        this.preDrawListener = onPreDrawListener;
    }

    private final void removeAttachListener() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.viewAttachListener;
        if (onAttachStateChangeListener != null) {
            this.textView.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        }
        this.viewAttachListener = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removePreDrawListener() {
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.preDrawListener;
        if (onPreDrawListener != null) {
            ViewTreeObserver viewTreeObserver = this.textView.getViewTreeObserver();
            Intrinsics.checkNotNullExpressionValue(viewTreeObserver, "textView.viewTreeObserver");
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
        }
        this.preDrawListener = null;
    }

    public final void apply(@NotNull Params params) {
        Intrinsics.checkNotNullParameter(params, "params");
        if (Intrinsics.areEqual(this.params, params)) {
            return;
        }
        this.params = params;
        if (AbstractC1281a0.S(this.textView)) {
            addPreDrawListener();
        }
        addAttachListener();
    }

    public final void reset() {
        removeAttachListener();
        removePreDrawListener();
    }
}
