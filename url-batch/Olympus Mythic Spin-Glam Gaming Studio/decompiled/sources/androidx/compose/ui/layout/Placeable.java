package androidx.compose.ui.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.ironsource.X3;
import io.bidmachine.iab.vast.tags.VastAttributes;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: Placeable.kt */
@StabilityInferred
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\b'\u0018\u00002\u00020\u0001:\u0001*B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J;\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\nH$ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eR$\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R$\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R3\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00188\u0004@DX\u0084\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR3\u0010!\u001a\u00020 2\u0006\u0010\u0019\u001a\u00020 8\u0004@DX\u0084\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010\u001d\"\u0004\b#\u0010\u001fR\u0014\u0010%\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u0015R\u0014\u0010'\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u0015R\u001d\u0010)\u001a\u00020\u00068DX\u0084\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b(\u0010\u001d\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006+"}, d2 = {"Landroidx/compose/ui/layout/Placeable;", "Landroidx/compose/ui/layout/Measured;", "<init>", "()V", "", "recalculateWidthAndHeight", "Landroidx/compose/ui/unit/IntOffset;", X3.i.L, "", "zIndex", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "layerBlock", "placeAt-f8xVGno", "(JFLkotlin/jvm/functions/Function1;)V", "placeAt", "", "<set-?>", "width", "I", "getWidth", "()I", "height", "getHeight", "Landroidx/compose/ui/unit/IntSize;", "value", "measuredSize", "J", "getMeasuredSize-YbymL2g", "()J", "setMeasuredSize-ozmzZPI", "(J)V", "Landroidx/compose/ui/unit/Constraints;", "measurementConstraints", "getMeasurementConstraints-msEJaDk", "setMeasurementConstraints-BRTryo0", "getMeasuredWidth", "measuredWidth", "getMeasuredHeight", "measuredHeight", "getApparentToRealOffset-nOcc-ac", "apparentToRealOffset", "PlacementScope", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class Placeable implements Measured {
    private int height;
    private long measuredSize = IntSizeKt.IntSize(0, 0);
    private long measurementConstraints;
    private int width;

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: placeAt-f8xVGno */
    public abstract void mo1945placeAtf8xVGno(long position, float zIndex, Function1 layerBlock);

    public Placeable() {
        long j;
        j = PlaceableKt.DefaultConstraints;
        this.measurementConstraints = j;
    }

    public final int getWidth() {
        return this.width;
    }

    public final int getHeight() {
        return this.height;
    }

    public int getMeasuredWidth() {
        return IntSize.m2567getWidthimpl(this.measuredSize);
    }

    public int getMeasuredHeight() {
        return IntSize.m2566getHeightimpl(this.measuredSize);
    }

    /* renamed from: getMeasuredSize-YbymL2g, reason: not valid java name and from getter */
    protected final long getMeasuredSize() {
        return this.measuredSize;
    }

    /* renamed from: setMeasuredSize-ozmzZPI, reason: not valid java name */
    protected final void m1959setMeasuredSizeozmzZPI(long j) {
        if (IntSize.m2565equalsimpl0(this.measuredSize, j)) {
            return;
        }
        this.measuredSize = j;
        recalculateWidthAndHeight();
    }

    private final void recalculateWidthAndHeight() {
        this.width = RangesKt.coerceIn(IntSize.m2567getWidthimpl(this.measuredSize), Constraints.m2489getMinWidthimpl(this.measurementConstraints), Constraints.m2487getMaxWidthimpl(this.measurementConstraints));
        this.height = RangesKt.coerceIn(IntSize.m2566getHeightimpl(this.measuredSize), Constraints.m2488getMinHeightimpl(this.measurementConstraints), Constraints.m2486getMaxHeightimpl(this.measurementConstraints));
    }

    /* renamed from: getMeasurementConstraints-msEJaDk, reason: not valid java name and from getter */
    protected final long getMeasurementConstraints() {
        return this.measurementConstraints;
    }

    /* renamed from: setMeasurementConstraints-BRTryo0, reason: not valid java name */
    protected final void m1960setMeasurementConstraintsBRTryo0(long j) {
        if (Constraints.m2480equalsimpl0(this.measurementConstraints, j)) {
            return;
        }
        this.measurementConstraints = j;
        recalculateWidthAndHeight();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: getApparentToRealOffset-nOcc-ac, reason: not valid java name */
    public final long m1956getApparentToRealOffsetnOccac() {
        return IntOffsetKt.IntOffset((this.width - IntSize.m2567getWidthimpl(this.measuredSize)) / 2, (this.height - IntSize.m2566getHeightimpl(this.measuredSize)) / 2);
    }

    /* compiled from: Placeable.kt */
    @StabilityInferred
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000 #2\u00020\u0001:\u0001#B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\f\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\f\u001a\u00020\t*\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\u0010J+\u0010\u0011\u001a\u00020\t*\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0010J)\u0010\u0011\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ?\u0010\u0018\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\t0\u0013ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017JA\u0010\u0018\u001a\u00020\t*\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\b\u001a\u00020\u00072\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\t0\u0013¢\u0006\u0004\b\u0018\u0010\u0019JA\u0010\u001a\u001a\u00020\t*\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\b\u001a\u00020\u00072\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\t0\u0013¢\u0006\u0004\b\u001a\u0010\u0019J?\u0010\u001a\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\t0\u0013ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u0017R\u0014\u0010\u001e\u001a\u00020\r8$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8$X¤\u0004¢\u0006\u0006\u001a\u0004\b \u0010!\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "<init>", "()V", "Landroidx/compose/ui/layout/Placeable;", "Landroidx/compose/ui/unit/IntOffset;", X3.i.L, "", "zIndex", "", "placeRelative-70tqf50", "(Landroidx/compose/ui/layout/Placeable;JF)V", "placeRelative", "", VastAttributes.HORIZONTAL_POSITION, VastAttributes.VERTICAL_POSITION, "(Landroidx/compose/ui/layout/Placeable;IIF)V", "place", "place-70tqf50", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "layerBlock", "placeRelativeWithLayer-aW-9-wM", "(Landroidx/compose/ui/layout/Placeable;JFLkotlin/jvm/functions/Function1;)V", "placeRelativeWithLayer", "(Landroidx/compose/ui/layout/Placeable;IIFLkotlin/jvm/functions/Function1;)V", "placeWithLayer", "placeWithLayer-aW-9-wM", "getParentWidth", "()I", "parentWidth", "Landroidx/compose/ui/unit/LayoutDirection;", "getParentLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "parentLayoutDirection", "Companion", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static abstract class PlacementScope {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static LayoutDirection parentLayoutDirection = LayoutDirection.Ltr;
        private static int parentWidth;

        /* JADX INFO: Access modifiers changed from: protected */
        public abstract LayoutDirection getParentLayoutDirection();

        /* JADX INFO: Access modifiers changed from: protected */
        public abstract int getParentWidth();

        /* renamed from: placeRelative-70tqf50$default, reason: not valid java name */
        public static /* synthetic */ void m1962placeRelative70tqf50$default(PlacementScope placementScope, Placeable placeable, long j, float f, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative-70tqf50");
            }
            if ((i & 2) != 0) {
                f = 0.0f;
            }
            placementScope.m1966placeRelative70tqf50(placeable, j, f);
        }

        public static /* synthetic */ void placeRelative$default(PlacementScope placementScope, Placeable placeable, int i, int i2, float f, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative");
            }
            if ((i3 & 4) != 0) {
                f = 0.0f;
            }
            placementScope.placeRelative(placeable, i, i2, f);
        }

        public final void placeRelative(Placeable placeable, int i, int i2, float f) {
            Intrinsics.checkNotNullParameter(placeable, "<this>");
            long IntOffset = IntOffsetKt.IntOffset(i, i2);
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                long m1956getApparentToRealOffsetnOccac = placeable.m1956getApparentToRealOffsetnOccac();
                placeable.mo1945placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m2553getXimpl(IntOffset) + IntOffset.m2553getXimpl(m1956getApparentToRealOffsetnOccac), IntOffset.m2554getYimpl(IntOffset) + IntOffset.m2554getYimpl(m1956getApparentToRealOffsetnOccac)), f, null);
            } else {
                long IntOffset2 = IntOffsetKt.IntOffset((getParentWidth() - IntSize.m2567getWidthimpl(placeable.measuredSize)) - IntOffset.m2553getXimpl(IntOffset), IntOffset.m2554getYimpl(IntOffset));
                long m1956getApparentToRealOffsetnOccac2 = placeable.m1956getApparentToRealOffsetnOccac();
                placeable.mo1945placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m2553getXimpl(IntOffset2) + IntOffset.m2553getXimpl(m1956getApparentToRealOffsetnOccac2), IntOffset.m2554getYimpl(IntOffset2) + IntOffset.m2554getYimpl(m1956getApparentToRealOffsetnOccac2)), f, null);
            }
        }

        public static /* synthetic */ void place$default(PlacementScope placementScope, Placeable placeable, int i, int i2, float f, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place");
            }
            if ((i3 & 4) != 0) {
                f = 0.0f;
            }
            placementScope.place(placeable, i, i2, f);
        }

        public final void place(Placeable placeable, int i, int i2, float f) {
            Intrinsics.checkNotNullParameter(placeable, "<this>");
            long IntOffset = IntOffsetKt.IntOffset(i, i2);
            long m1956getApparentToRealOffsetnOccac = placeable.m1956getApparentToRealOffsetnOccac();
            placeable.mo1945placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m2553getXimpl(IntOffset) + IntOffset.m2553getXimpl(m1956getApparentToRealOffsetnOccac), IntOffset.m2554getYimpl(IntOffset) + IntOffset.m2554getYimpl(m1956getApparentToRealOffsetnOccac)), f, null);
        }

        /* renamed from: place-70tqf50$default, reason: not valid java name */
        public static /* synthetic */ void m1961place70tqf50$default(PlacementScope placementScope, Placeable placeable, long j, float f, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place-70tqf50");
            }
            if ((i & 2) != 0) {
                f = 0.0f;
            }
            placementScope.m1965place70tqf50(placeable, j, f);
        }

        /* renamed from: placeRelativeWithLayer-aW-9-wM$default, reason: not valid java name */
        public static /* synthetic */ void m1963placeRelativeWithLayeraW9wM$default(PlacementScope placementScope, Placeable placeable, long j, float f, Function1 function1, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
            }
            if ((i & 2) != 0) {
                f = 0.0f;
            }
            float f2 = f;
            if ((i & 4) != 0) {
                function1 = PlaceableKt.DefaultLayerBlock;
            }
            placementScope.m1967placeRelativeWithLayeraW9wM(placeable, j, f2, function1);
        }

        public static /* synthetic */ void placeRelativeWithLayer$default(PlacementScope placementScope, Placeable placeable, int i, int i2, float f, Function1 function1, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer");
            }
            if ((i3 & 4) != 0) {
                f = 0.0f;
            }
            float f2 = f;
            if ((i3 & 8) != 0) {
                function1 = PlaceableKt.DefaultLayerBlock;
            }
            placementScope.placeRelativeWithLayer(placeable, i, i2, f2, function1);
        }

        public final void placeRelativeWithLayer(Placeable placeable, int i, int i2, float f, Function1 layerBlock) {
            Intrinsics.checkNotNullParameter(placeable, "<this>");
            Intrinsics.checkNotNullParameter(layerBlock, "layerBlock");
            long IntOffset = IntOffsetKt.IntOffset(i, i2);
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                long m1956getApparentToRealOffsetnOccac = placeable.m1956getApparentToRealOffsetnOccac();
                placeable.mo1945placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m2553getXimpl(IntOffset) + IntOffset.m2553getXimpl(m1956getApparentToRealOffsetnOccac), IntOffset.m2554getYimpl(IntOffset) + IntOffset.m2554getYimpl(m1956getApparentToRealOffsetnOccac)), f, layerBlock);
            } else {
                long IntOffset2 = IntOffsetKt.IntOffset((getParentWidth() - IntSize.m2567getWidthimpl(placeable.measuredSize)) - IntOffset.m2553getXimpl(IntOffset), IntOffset.m2554getYimpl(IntOffset));
                long m1956getApparentToRealOffsetnOccac2 = placeable.m1956getApparentToRealOffsetnOccac();
                placeable.mo1945placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m2553getXimpl(IntOffset2) + IntOffset.m2553getXimpl(m1956getApparentToRealOffsetnOccac2), IntOffset.m2554getYimpl(IntOffset2) + IntOffset.m2554getYimpl(m1956getApparentToRealOffsetnOccac2)), f, layerBlock);
            }
        }

        public static /* synthetic */ void placeWithLayer$default(PlacementScope placementScope, Placeable placeable, int i, int i2, float f, Function1 function1, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer");
            }
            if ((i3 & 4) != 0) {
                f = 0.0f;
            }
            float f2 = f;
            if ((i3 & 8) != 0) {
                function1 = PlaceableKt.DefaultLayerBlock;
            }
            placementScope.placeWithLayer(placeable, i, i2, f2, function1);
        }

        public final void placeWithLayer(Placeable placeable, int i, int i2, float f, Function1 layerBlock) {
            Intrinsics.checkNotNullParameter(placeable, "<this>");
            Intrinsics.checkNotNullParameter(layerBlock, "layerBlock");
            long IntOffset = IntOffsetKt.IntOffset(i, i2);
            long m1956getApparentToRealOffsetnOccac = placeable.m1956getApparentToRealOffsetnOccac();
            placeable.mo1945placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m2553getXimpl(IntOffset) + IntOffset.m2553getXimpl(m1956getApparentToRealOffsetnOccac), IntOffset.m2554getYimpl(IntOffset) + IntOffset.m2554getYimpl(m1956getApparentToRealOffsetnOccac)), f, layerBlock);
        }

        /* renamed from: placeWithLayer-aW-9-wM$default, reason: not valid java name */
        public static /* synthetic */ void m1964placeWithLayeraW9wM$default(PlacementScope placementScope, Placeable placeable, long j, float f, Function1 function1, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
            }
            if ((i & 2) != 0) {
                f = 0.0f;
            }
            float f2 = f;
            if ((i & 4) != 0) {
                function1 = PlaceableKt.DefaultLayerBlock;
            }
            placementScope.m1968placeWithLayeraW9wM(placeable, j, f2, function1);
        }

        /* renamed from: placeRelative-70tqf50, reason: not valid java name */
        public final void m1966placeRelative70tqf50(Placeable placeRelative, long j, float f) {
            Intrinsics.checkNotNullParameter(placeRelative, "$this$placeRelative");
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                long m1956getApparentToRealOffsetnOccac = placeRelative.m1956getApparentToRealOffsetnOccac();
                placeRelative.mo1945placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m2553getXimpl(j) + IntOffset.m2553getXimpl(m1956getApparentToRealOffsetnOccac), IntOffset.m2554getYimpl(j) + IntOffset.m2554getYimpl(m1956getApparentToRealOffsetnOccac)), f, null);
            } else {
                long IntOffset = IntOffsetKt.IntOffset((getParentWidth() - IntSize.m2567getWidthimpl(placeRelative.measuredSize)) - IntOffset.m2553getXimpl(j), IntOffset.m2554getYimpl(j));
                long m1956getApparentToRealOffsetnOccac2 = placeRelative.m1956getApparentToRealOffsetnOccac();
                placeRelative.mo1945placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m2553getXimpl(IntOffset) + IntOffset.m2553getXimpl(m1956getApparentToRealOffsetnOccac2), IntOffset.m2554getYimpl(IntOffset) + IntOffset.m2554getYimpl(m1956getApparentToRealOffsetnOccac2)), f, null);
            }
        }

        /* renamed from: placeRelativeWithLayer-aW-9-wM, reason: not valid java name */
        public final void m1967placeRelativeWithLayeraW9wM(Placeable placeRelativeWithLayer, long j, float f, Function1 layerBlock) {
            Intrinsics.checkNotNullParameter(placeRelativeWithLayer, "$this$placeRelativeWithLayer");
            Intrinsics.checkNotNullParameter(layerBlock, "layerBlock");
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                long m1956getApparentToRealOffsetnOccac = placeRelativeWithLayer.m1956getApparentToRealOffsetnOccac();
                placeRelativeWithLayer.mo1945placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m2553getXimpl(j) + IntOffset.m2553getXimpl(m1956getApparentToRealOffsetnOccac), IntOffset.m2554getYimpl(j) + IntOffset.m2554getYimpl(m1956getApparentToRealOffsetnOccac)), f, layerBlock);
            } else {
                long IntOffset = IntOffsetKt.IntOffset((getParentWidth() - IntSize.m2567getWidthimpl(placeRelativeWithLayer.measuredSize)) - IntOffset.m2553getXimpl(j), IntOffset.m2554getYimpl(j));
                long m1956getApparentToRealOffsetnOccac2 = placeRelativeWithLayer.m1956getApparentToRealOffsetnOccac();
                placeRelativeWithLayer.mo1945placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m2553getXimpl(IntOffset) + IntOffset.m2553getXimpl(m1956getApparentToRealOffsetnOccac2), IntOffset.m2554getYimpl(IntOffset) + IntOffset.m2554getYimpl(m1956getApparentToRealOffsetnOccac2)), f, layerBlock);
            }
        }

        /* renamed from: place-70tqf50, reason: not valid java name */
        public final void m1965place70tqf50(Placeable place, long j, float f) {
            Intrinsics.checkNotNullParameter(place, "$this$place");
            long m1956getApparentToRealOffsetnOccac = place.m1956getApparentToRealOffsetnOccac();
            place.mo1945placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m2553getXimpl(j) + IntOffset.m2553getXimpl(m1956getApparentToRealOffsetnOccac), IntOffset.m2554getYimpl(j) + IntOffset.m2554getYimpl(m1956getApparentToRealOffsetnOccac)), f, null);
        }

        /* renamed from: placeWithLayer-aW-9-wM, reason: not valid java name */
        public final void m1968placeWithLayeraW9wM(Placeable placeWithLayer, long j, float f, Function1 layerBlock) {
            Intrinsics.checkNotNullParameter(placeWithLayer, "$this$placeWithLayer");
            Intrinsics.checkNotNullParameter(layerBlock, "layerBlock");
            long m1956getApparentToRealOffsetnOccac = placeWithLayer.m1956getApparentToRealOffsetnOccac();
            placeWithLayer.mo1945placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m2553getXimpl(j) + IntOffset.m2553getXimpl(m1956getApparentToRealOffsetnOccac), IntOffset.m2554getYimpl(j) + IntOffset.m2554getYimpl(m1956getApparentToRealOffsetnOccac)), f, layerBlock);
        }

        /* compiled from: Placeable.kt */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048\u0014@RX\u0094\u000e¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR$\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\n8\u0014@RX\u0094\u000e¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope$Companion;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "<init>", "()V", "Landroidx/compose/ui/unit/LayoutDirection;", "<set-?>", "parentLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getParentLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "", "parentWidth", "I", "getParentWidth", "()I", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class Companion extends PlacementScope {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.compose.ui.layout.Placeable.PlacementScope
            public LayoutDirection getParentLayoutDirection() {
                return PlacementScope.parentLayoutDirection;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.compose.ui.layout.Placeable.PlacementScope
            public int getParentWidth() {
                return PlacementScope.parentWidth;
            }
        }
    }
}
