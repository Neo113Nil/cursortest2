package com.yandex.div.internal.widget;

import android.view.ViewTreeObserver;
import com.yandex.div.internal.KLog;
import com.yandex.div.logging.Severity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class AutoEllipsizeHelper {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private boolean isEnabled;

    @Nullable
    private ViewTreeObserver.OnPreDrawListener preDrawListener;

    @NotNull
    private final EllipsizedTextView textView;

    @Metadata
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public AutoEllipsizeHelper(@NotNull EllipsizedTextView textView) {
        Intrinsics.checkNotNullParameter(textView, "textView");
        this.textView = textView;
    }

    private final void addListener() {
        if (this.preDrawListener != null) {
            return;
        }
        this.preDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: com.yandex.div.internal.widget.a
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                boolean addListener$lambda$2;
                addListener$lambda$2 = AutoEllipsizeHelper.addListener$lambda$2(AutoEllipsizeHelper.this);
                return addListener$lambda$2;
            }
        };
        this.textView.getViewTreeObserver().addOnPreDrawListener(this.preDrawListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean addListener$lambda$2(AutoEllipsizeHelper this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!this$0.isEnabled) {
            return true;
        }
        EllipsizedTextView ellipsizedTextView = this$0.textView;
        int height = (ellipsizedTextView.getHeight() - ellipsizedTextView.getCompoundPaddingTop()) - ellipsizedTextView.getCompoundPaddingBottom();
        int lineAt = TextViewsKt.lineAt(ellipsizedTextView, height);
        int i4 = lineAt + 1;
        if (height >= TextViewsKt.textHeight(ellipsizedTextView, i4)) {
            lineAt = i4;
        }
        if (lineAt <= 0 || lineAt >= this$0.textView.getLineCount()) {
            this$0.removeListener();
            return true;
        }
        KLog kLog = KLog.INSTANCE;
        if (kLog.isAtLeast(Severity.DEBUG)) {
            kLog.print(3, "AutoEllipsizeHelper", "Trying to set new max lines " + lineAt + ". Current drawing pass is canceled. ");
        }
        this$0.textView.setMaxLines(lineAt);
        return false;
    }

    private final void removeListener() {
        if (this.preDrawListener != null) {
            this.textView.getViewTreeObserver().removeOnPreDrawListener(this.preDrawListener);
            this.preDrawListener = null;
        }
    }

    public final void onViewAttachedToWindow() {
        if (this.isEnabled) {
            addListener();
        }
    }

    public final void onViewDetachedFromWindow() {
        removeListener();
    }

    public final void setEnabled(boolean z4) {
        this.isEnabled = z4;
    }
}
