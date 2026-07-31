package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: Vector.kt */
@StabilityInferred
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\u0006\u0010\n\u001a\u00020\u0005J\f\u0010\u000b\u001a\u00020\u0005*\u00020\fH&R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0090\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u0082\u0001\u0003\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/graphics/vector/VNode;", "", "()V", "invalidateListener", "Lkotlin/Function0;", "", "getInvalidateListener$ui_release", "()Lkotlin/jvm/functions/Function0;", "setInvalidateListener$ui_release", "(Lkotlin/jvm/functions/Function0;)V", "invalidate", "draw", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/graphics/vector/VectorComponent;", "Landroidx/compose/ui/graphics/vector/PathComponent;", "Landroidx/compose/ui/graphics/vector/GroupComponent;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class VNode {
    private Function0 invalidateListener;

    public /* synthetic */ VNode(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract void draw(DrawScope drawScope);

    private VNode() {
    }

    /* renamed from: getInvalidateListener$ui_release, reason: from getter */
    public Function0 getInvalidateListener() {
        return this.invalidateListener;
    }

    public void setInvalidateListener$ui_release(Function0 function0) {
        this.invalidateListener = function0;
    }

    public final void invalidate() {
        Function0 invalidateListener = getInvalidateListener();
        if (invalidateListener != null) {
            invalidateListener.mo4828invoke();
        }
    }
}
