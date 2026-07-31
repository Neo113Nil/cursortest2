package com.rnstartiosdk;

import android.content.Context;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CustomView.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0007H\u0014J\b\u0010\u000b\u001a\u00020\u0007H\u0014R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/rnstartiosdk/CustomView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "visibilityChanged", "Lkotlin/Function1;", "", "", "<init>", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "onAttachedToWindow", "onDetachedFromWindow", "react-native-start-io-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CustomView extends LinearLayout {
    private final Function1<Boolean, Unit> visibilityChanged;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CustomView(Context context, Function1<? super Boolean, Unit> visibilityChanged) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(visibilityChanged, "visibilityChanged");
        this.visibilityChanged = visibilityChanged;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.visibilityChanged.invoke(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.visibilityChanged.invoke(false);
    }
}
