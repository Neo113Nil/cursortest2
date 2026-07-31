package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextRange;
import com.ironsource.X3;
import com.yandex.div.core.DivActionHandler;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TextFieldScroll.kt */
@Stable
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0001\u0018\u0000 42\u00020\u0001:\u00014B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019R+\u0010\"\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R+\u0010&\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00048F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010\u001d\u001a\u0004\b$\u0010\u001f\"\u0004\b%\u0010!R\u0016\u0010'\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R+\u0010)\u001a\u00020\u00168\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R+\u0010\b\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b/\u0010\u001d\u001a\u0004\b0\u00101\"\u0004\b2\u00103\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00065"}, d2 = {"Landroidx/compose/foundation/text/TextFieldScrollerPosition;", "", "Landroidx/compose/foundation/gestures/Orientation;", "initialOrientation", "", "initial", "<init>", "(Landroidx/compose/foundation/gestures/Orientation;F)V", X3.i.n, "Landroidx/compose/ui/geometry/Rect;", "cursorRect", "", "containerSize", "textFieldSize", "", "update", "(Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/ui/geometry/Rect;II)V", "cursorStart", "cursorEnd", "coerceOffset$foundation_release", "(FFI)V", "coerceOffset", "Landroidx/compose/ui/text/TextRange;", DivActionHandler.DivActionReason.SELECTION, "getOffsetToFollow-5zc-tL8", "(J)I", "getOffsetToFollow", "<set-?>", "offset$delegate", "Landroidx/compose/runtime/MutableState;", "getOffset", "()F", "setOffset", "(F)V", "offset", "maximum$delegate", "getMaximum", "setMaximum", "maximum", "previousCursorRect", "Landroidx/compose/ui/geometry/Rect;", "previousSelection", "J", "getPreviousSelection-d9O1mEE", "()J", "setPreviousSelection-5zc-tL8", "(J)V", "orientation$delegate", "getOrientation", "()Landroidx/compose/foundation/gestures/Orientation;", "setOrientation", "(Landroidx/compose/foundation/gestures/Orientation;)V", "Companion", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldScrollerPosition {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Saver Saver = ListSaverKt.listSaver(new Function2() { // from class: androidx.compose.foundation.text.TextFieldScrollerPosition$Companion$Saver$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final List<Object> invoke(@NotNull SaverScope listSaver, @NotNull TextFieldScrollerPosition it) {
            Intrinsics.checkNotNullParameter(listSaver, "$this$listSaver");
            Intrinsics.checkNotNullParameter(it, "it");
            return CollectionsKt.listOf(Float.valueOf(it.getOffset()), Boolean.valueOf(it.getOrientation() == Orientation.Vertical));
        }
    }, new Function1() { // from class: androidx.compose.foundation.text.TextFieldScrollerPosition$Companion$Saver$2
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final TextFieldScrollerPosition invoke(@NotNull List<? extends Object> restored) {
            Intrinsics.checkNotNullParameter(restored, "restored");
            return new TextFieldScrollerPosition(((Boolean) restored.get(1)).booleanValue() ? Orientation.Vertical : Orientation.Horizontal, ((Float) restored.get(0)).floatValue());
        }
    });

    /* renamed from: maximum$delegate, reason: from kotlin metadata */
    private final MutableState maximum;

    /* renamed from: offset$delegate, reason: from kotlin metadata */
    private final MutableState offset;

    /* renamed from: orientation$delegate, reason: from kotlin metadata */
    private final MutableState orientation;
    private Rect previousCursorRect;
    private long previousSelection;

    public TextFieldScrollerPosition(Orientation initialOrientation, float f) {
        Intrinsics.checkNotNullParameter(initialOrientation, "initialOrientation");
        this.offset = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(f), null, 2, null);
        this.maximum = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
        this.previousCursorRect = Rect.INSTANCE.getZero();
        this.previousSelection = TextRange.INSTANCE.m2254getZerod9O1mEE();
        this.orientation = SnapshotStateKt.mutableStateOf(initialOrientation, SnapshotStateKt.structuralEqualityPolicy());
    }

    public /* synthetic */ TextFieldScrollerPosition(Orientation orientation, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(orientation, (i & 2) != 0 ? 0.0f : f);
    }

    public final float getOffset() {
        return ((Number) this.offset.getValue()).floatValue();
    }

    public final void setOffset(float f) {
        this.offset.setValue(Float.valueOf(f));
    }

    private final void setMaximum(float f) {
        this.maximum.setValue(Float.valueOf(f));
    }

    public final float getMaximum() {
        return ((Number) this.maximum.getValue()).floatValue();
    }

    /* renamed from: setPreviousSelection-5zc-tL8, reason: not valid java name */
    public final void m590setPreviousSelection5zctL8(long j) {
        this.previousSelection = j;
    }

    public final Orientation getOrientation() {
        return (Orientation) this.orientation.getValue();
    }

    public final void update(Orientation orientation, Rect cursorRect, int containerSize, int textFieldSize) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(cursorRect, "cursorRect");
        float f = textFieldSize - containerSize;
        setMaximum(f);
        if (cursorRect.getLeft() != this.previousCursorRect.getLeft() || cursorRect.getTop() != this.previousCursorRect.getTop()) {
            boolean z = orientation == Orientation.Vertical;
            coerceOffset$foundation_release(z ? cursorRect.getTop() : cursorRect.getLeft(), z ? cursorRect.getBottom() : cursorRect.getRight(), containerSize);
            this.previousCursorRect = cursorRect;
        }
        setOffset(RangesKt.coerceIn(getOffset(), 0.0f, f));
    }

    public final void coerceOffset$foundation_release(float cursorStart, float cursorEnd, int containerSize) {
        float offset = getOffset();
        float f = containerSize;
        float f2 = offset + f;
        setOffset(getOffset() + ((cursorEnd <= f2 && (cursorStart >= offset || cursorEnd - cursorStart <= f)) ? (cursorStart >= offset || cursorEnd - cursorStart > f) ? 0.0f : cursorStart - offset : cursorEnd - f2));
    }

    /* renamed from: getOffsetToFollow-5zc-tL8, reason: not valid java name */
    public final int m589getOffsetToFollow5zctL8(long selection) {
        return TextRange.m2249getStartimpl(selection) != TextRange.m2249getStartimpl(this.previousSelection) ? TextRange.m2249getStartimpl(selection) : TextRange.m2244getEndimpl(selection) != TextRange.m2244getEndimpl(this.previousSelection) ? TextRange.m2244getEndimpl(selection) : TextRange.m2247getMinimpl(selection);
    }

    /* compiled from: TextFieldScroll.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/text/TextFieldScrollerPosition$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/text/TextFieldScrollerPosition;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Saver getSaver() {
            return TextFieldScrollerPosition.Saver;
        }
    }
}
