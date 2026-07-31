package androidx.compose.foundation;

import androidx.compose.ui.draw.DrawModifier;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.platform.InspectorValueInfo;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AndroidOverscroll.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\f\u001a\u00020\u0007*\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0019¨\u0006\u001a"}, d2 = {"Landroidx/compose/foundation/DrawOverscrollModifier;", "Landroidx/compose/ui/draw/DrawModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "Landroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect;", "overscrollEffect", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "inspectorInfo", "<init>", "(Landroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect;Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "draw", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
final class DrawOverscrollModifier extends InspectorValueInfo implements DrawModifier {
    private final AndroidEdgeEffectOverscrollEffect overscrollEffect;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawOverscrollModifier(AndroidEdgeEffectOverscrollEffect overscrollEffect, Function1 inspectorInfo) {
        super(inspectorInfo);
        Intrinsics.checkNotNullParameter(overscrollEffect, "overscrollEffect");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.overscrollEffect = overscrollEffect;
    }

    @Override // androidx.compose.ui.draw.DrawModifier
    public void draw(ContentDrawScope contentDrawScope) {
        Intrinsics.checkNotNullParameter(contentDrawScope, "<this>");
        contentDrawScope.drawContent();
        this.overscrollEffect.drawOverscroll(contentDrawScope);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof DrawOverscrollModifier) {
            return Intrinsics.areEqual(this.overscrollEffect, ((DrawOverscrollModifier) other).overscrollEffect);
        }
        return false;
    }

    public int hashCode() {
        return this.overscrollEffect.hashCode();
    }

    public String toString() {
        return "DrawOverscrollModifier(overscrollEffect=" + this.overscrollEffect + ')';
    }
}
