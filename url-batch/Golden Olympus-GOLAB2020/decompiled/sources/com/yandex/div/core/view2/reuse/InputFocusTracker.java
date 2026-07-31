package com.yandex.div.core.view2.reuse;

import android.view.View;
import com.yandex.div.core.actions.DivActionTypedUtilsKt;
import com.yandex.div.core.downloader.PersistentDivDataObserver;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.widgets.DivInputView;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class InputFocusTracker {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @Nullable
    private static WeakReference<View> lastFocused;
    private boolean changingState;

    @NotNull
    private final InputFocusPersistentDivDataChangedObserver divDataChangedObserver;

    @Nullable
    private Object focusedInputTag;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata
    public final class InputFocusPersistentDivDataChangedObserver implements PersistentDivDataObserver {
        private boolean focusRequestedDuringChangeState;

        public InputFocusPersistentDivDataChangedObserver() {
        }

        @Override // com.yandex.div.core.downloader.PersistentDivDataObserver
        public void onAfterDivDataChanged() {
            InputFocusTracker.this.changingState = false;
            if (this.focusRequestedDuringChangeState) {
                return;
            }
            InputFocusTracker.this.focusedInputTag = null;
        }

        @Override // com.yandex.div.core.downloader.PersistentDivDataObserver
        public void onBeforeDivDataChanged() {
            InputFocusTracker.this.changingState = true;
            this.focusRequestedDuringChangeState = false;
        }

        public final void setFocusRequestedDuringChangeState(boolean z4) {
            this.focusRequestedDuringChangeState = z4;
        }
    }

    public InputFocusTracker(@NotNull Div2View div2View) {
        Intrinsics.checkNotNullParameter(div2View, "div2View");
        InputFocusPersistentDivDataChangedObserver inputFocusPersistentDivDataChangedObserver = new InputFocusPersistentDivDataChangedObserver();
        this.divDataChangedObserver = inputFocusPersistentDivDataChangedObserver;
        div2View.addPersistentDivDataObserver$div_release(inputFocusPersistentDivDataChangedObserver);
    }

    public final void inputFocusChanged(@Nullable Object obj, @NotNull DivInputView view, boolean z4) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (this.changingState) {
            return;
        }
        if (z4) {
            this.focusedInputTag = obj;
            lastFocused = new WeakReference<>(view);
            view.setSelection(view.length());
        } else {
            if (z4) {
                return;
            }
            this.focusedInputTag = null;
            lastFocused = null;
        }
    }

    public final boolean isFocusedOnInput() {
        return this.focusedInputTag != null;
    }

    public final void removeFocusFromFocusedInput() {
        View view;
        WeakReference<View> weakReference = lastFocused;
        if (weakReference == null || (view = weakReference.get()) == null) {
            return;
        }
        view.clearFocus();
        DivActionTypedUtilsKt.closeKeyboard(view);
    }

    public final void requestFocusIfNeeded(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (view.getTag() != null && Intrinsics.areEqual(view.getTag(), this.focusedInputTag) && this.changingState) {
            this.divDataChangedObserver.setFocusRequestedDuringChangeState(true);
            view.requestFocus();
        }
    }
}
