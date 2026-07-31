package androidx.compose.ui.draw;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DrawModifier.kt */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0000\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007R.\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\u0007¨\u0006\f"}, d2 = {"Landroidx/compose/ui/draw/DrawResult;", "", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "", "block", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Lkotlin/jvm/functions/Function1;", "getBlock$ui_release", "()Lkotlin/jvm/functions/Function1;", "setBlock$ui_release", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DrawResult {
    private Function1 block;

    public DrawResult(Function1 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.block = block;
    }

    /* renamed from: getBlock$ui_release, reason: from getter */
    public final Function1 getBlock() {
        return this.block;
    }
}
