package androidx.compose.material;

import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Slider.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u001e\u0010\f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b0\t0\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b \u0010\u001fR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b$\u0010#R/\u0010\f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b0\t0\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010!\u001a\u0004\b%\u0010#¨\u0006&"}, d2 = {"Landroidx/compose/material/RangeSliderLogic;", "", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "startInteractionSource", "endInteractionSource", "Landroidx/compose/runtime/State;", "", "rawOffsetStart", "rawOffsetEnd", "Lkotlin/Function2;", "", "", "onDrag", "<init>", "(Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;)V", "draggingStart", "activeInteraction", "(Z)Landroidx/compose/foundation/interaction/MutableInteractionSource;", "eventX", "", "compareOffsets", "(F)I", "posX", "Landroidx/compose/foundation/interaction/Interaction;", "interaction", "Lkotlinx/coroutines/CoroutineScope;", "scope", "captureThumb", "(ZFLandroidx/compose/foundation/interaction/Interaction;Lkotlinx/coroutines/CoroutineScope;)V", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "getStartInteractionSource", "()Landroidx/compose/foundation/interaction/MutableInteractionSource;", "getEndInteractionSource", "Landroidx/compose/runtime/State;", "getRawOffsetStart", "()Landroidx/compose/runtime/State;", "getRawOffsetEnd", "getOnDrag", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
final class RangeSliderLogic {
    private final MutableInteractionSource endInteractionSource;
    private final State onDrag;
    private final State rawOffsetEnd;
    private final State rawOffsetStart;
    private final MutableInteractionSource startInteractionSource;

    public RangeSliderLogic(MutableInteractionSource startInteractionSource, MutableInteractionSource endInteractionSource, State rawOffsetStart, State rawOffsetEnd, State onDrag) {
        Intrinsics.checkNotNullParameter(startInteractionSource, "startInteractionSource");
        Intrinsics.checkNotNullParameter(endInteractionSource, "endInteractionSource");
        Intrinsics.checkNotNullParameter(rawOffsetStart, "rawOffsetStart");
        Intrinsics.checkNotNullParameter(rawOffsetEnd, "rawOffsetEnd");
        Intrinsics.checkNotNullParameter(onDrag, "onDrag");
        this.startInteractionSource = startInteractionSource;
        this.endInteractionSource = endInteractionSource;
        this.rawOffsetStart = rawOffsetStart;
        this.rawOffsetEnd = rawOffsetEnd;
        this.onDrag = onDrag;
    }

    public final MutableInteractionSource activeInteraction(boolean draggingStart) {
        return draggingStart ? this.startInteractionSource : this.endInteractionSource;
    }

    public final int compareOffsets(float eventX) {
        return Float.compare(Math.abs(((Number) this.rawOffsetStart.getValue()).floatValue() - eventX), Math.abs(((Number) this.rawOffsetEnd.getValue()).floatValue() - eventX));
    }

    public final void captureThumb(boolean draggingStart, float posX, Interaction interaction, CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(interaction, "interaction");
        Intrinsics.checkNotNullParameter(scope, "scope");
        ((Function2) this.onDrag.getValue()).invoke(Boolean.valueOf(draggingStart), Float.valueOf(posX - ((Number) (draggingStart ? this.rawOffsetStart : this.rawOffsetEnd).getValue()).floatValue()));
        BuildersKt__Builders_commonKt.launch$default(scope, null, null, new RangeSliderLogic$captureThumb$1(this, draggingStart, interaction, null), 3, null);
    }
}
