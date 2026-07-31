package com.yandex.div.core.view2.backbutton;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.div.core.view2.backbutton.BackKeyPressedHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public abstract class BackHandlingRecyclerView extends RecyclerView {

    @NotNull
    private final BackKeyPressedHelper backKeyPressedHelper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackHandlingRecyclerView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        Intrinsics.checkNotNullParameter(context, "context");
        this.backKeyPressedHelper = new BackKeyPressedHelper(this);
    }

    @Override // android.view.View
    public boolean onKeyPreIme(int i4, @NotNull KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return this.backKeyPressedHelper.onKeyAction(i4, event) || super.onKeyPreIme(i4, event);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(@NotNull View changedView, int i4) {
        Intrinsics.checkNotNullParameter(changedView, "changedView");
        this.backKeyPressedHelper.onVisibilityChanged();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z4) {
        super.onWindowFocusChanged(z4);
        this.backKeyPressedHelper.onWindowFocusChanged(z4);
    }

    public void setOnBackClickListener(@Nullable BackKeyPressedHelper.OnBackClickListener onBackClickListener) {
        setDescendantFocusability(onBackClickListener != null ? 131072 : 262144);
        this.backKeyPressedHelper.setOnBackClickListener(onBackClickListener);
    }
}
