package androidx.compose.ui.draw;

import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.platform.InspectorValueInfo;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DrawModifier.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B/\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\u00020\u0005*\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/draw/DrawWithContentModifier;", "Landroidx/compose/ui/draw/DrawModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "", "onDraw", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectorInfo", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "draw", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlin/jvm/functions/Function1;", "getOnDraw", "()Lkotlin/jvm/functions/Function1;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
final class DrawWithContentModifier extends InspectorValueInfo implements DrawModifier {
    private final Function1 onDraw;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawWithContentModifier(Function1 onDraw, Function1 inspectorInfo) {
        super(inspectorInfo);
        Intrinsics.checkNotNullParameter(onDraw, "onDraw");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.onDraw = onDraw;
    }

    @Override // androidx.compose.ui.draw.DrawModifier
    public void draw(ContentDrawScope contentDrawScope) {
        Intrinsics.checkNotNullParameter(contentDrawScope, "<this>");
        this.onDraw.invoke(contentDrawScope);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof DrawWithContentModifier) {
            return Intrinsics.areEqual(this.onDraw, ((DrawWithContentModifier) other).onDraw);
        }
        return false;
    }

    public int hashCode() {
        return this.onDraw.hashCode();
    }
}
