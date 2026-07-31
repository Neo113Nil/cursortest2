package androidx.compose.foundation;

import android.content.Context;
import android.widget.EdgeEffect;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidOverscroll.kt */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00020\b*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f2\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0014\u001a\u00020\b*\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\f2\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0012J'\u0010\u0016\u001a\u00020\b*\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\f2\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0012J'\u0010\u0018\u001a\u00020\b*\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\f2\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000fH\u0002¢\u0006\u0004\b\u0018\u0010\u0012J\u000f\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001bJ\u001d\u0010!\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 J%\u0010'\u001a\u00020$2\u0006\u0010\"\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\u001dH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010&J%\u0010)\u001a\u00020$2\u0006\u0010\"\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\u001dH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b(\u0010&J%\u0010+\u001a\u00020$2\u0006\u0010\"\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\u001dH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b*\u0010&J%\u0010-\u001a\u00020$2\u0006\u0010\"\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\u001dH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b,\u0010&J/\u00104\u001a\u00020\u001d2\u0006\u0010.\u001a\u00020\u001d2\b\u0010/\u001a\u0004\u0018\u00010\u001d2\u0006\u00101\u001a\u000200H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b2\u00103J7\u00109\u001a\u00020\u00192\u0006\u00105\u001a\u00020\u001d2\u0006\u00106\u001a\u00020\u001d2\b\u0010/\u001a\u0004\u0018\u00010\u001d2\u0006\u00101\u001a\u000200H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b7\u00108J!\u0010>\u001a\u00020:2\u0006\u0010;\u001a\u00020:H\u0096@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b<\u0010=J!\u0010@\u001a\u00020\u00192\u0006\u0010;\u001a\u00020:H\u0096@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b?\u0010=J\u0011\u0010A\u001a\u00020\u0019*\u00020\u000b¢\u0006\u0004\bA\u0010BR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010CR\u0014\u0010D\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010F\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010ER\u0014\u0010G\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010ER\u0014\u0010H\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010ER\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020\f0I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010L\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010ER\u0014\u0010M\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010ER\u0014\u0010N\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010ER\u0014\u0010O\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010ER\u001a\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00190P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR(\u0010S\u001a\u00020\b8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bS\u0010T\u0012\u0004\bX\u0010\u001b\u001a\u0004\bU\u0010\n\"\u0004\bV\u0010WR\u0016\u0010Y\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010TR\u001f\u0010[\u001a\u00020Z8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b[\u0010\\R\u001a\u0010]\u001a\b\u0012\u0004\u0012\u00020\b0P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010RR*\u0010_\u001a\u00020\b2\u0006\u0010^\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\u0012\n\u0004\b_\u0010T\u001a\u0004\b_\u0010\n\"\u0004\b`\u0010WR#\u0010c\u001a\u000e\u0012\u0004\u0012\u00020b\u0012\u0004\u0012\u00020\u00190a8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\bc\u0010dR\u001a\u0010f\u001a\u00020e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010iR\u0014\u0010j\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bj\u0010\n\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006k"}, d2 = {"Landroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect;", "Landroidx/compose/foundation/OverscrollEffect;", "Landroid/content/Context;", "context", "Landroidx/compose/foundation/OverscrollConfiguration;", "overscrollConfig", "<init>", "(Landroid/content/Context;Landroidx/compose/foundation/OverscrollConfiguration;)V", "", "stopOverscrollAnimation", "()Z", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroid/widget/EdgeEffect;", "left", "Landroid/graphics/Canvas;", "Landroidx/compose/ui/graphics/NativeCanvas;", "canvas", "drawLeft", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z", ViewHierarchyConstants.DIMENSION_TOP_KEY, "drawTop", "right", "drawRight", "bottom", "drawBottom", "", "invalidateOverscroll", "()V", "animateToRelease", "Landroidx/compose/ui/geometry/Offset;", "delta", "releaseOppositeOverscroll-k-4lQ0M", "(J)Z", "releaseOppositeOverscroll", "scroll", "displacement", "", "pullTop-0a9Yr6o", "(JJ)F", "pullTop", "pullBottom-0a9Yr6o", "pullBottom", "pullLeft-0a9Yr6o", "pullLeft", "pullRight-0a9Yr6o", "pullRight", "scrollDelta", "pointerPosition", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "consumePreScroll-A0NYTsA", "(JLandroidx/compose/ui/geometry/Offset;I)J", "consumePreScroll", "initialDragDelta", "overscrollDelta", "consumePostScroll-l7mfB5k", "(JJLandroidx/compose/ui/geometry/Offset;I)V", "consumePostScroll", "Landroidx/compose/ui/unit/Velocity;", "velocity", "consumePreFling-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "consumePreFling", "consumePostFling-sF-c-tU", "consumePostFling", "drawOverscroll", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "Landroidx/compose/foundation/OverscrollConfiguration;", "topEffect", "Landroid/widget/EdgeEffect;", "bottomEffect", "leftEffect", "rightEffect", "", "allEffects", "Ljava/util/List;", "topEffectNegation", "bottomEffectNegation", "leftEffectNegation", "rightEffectNegation", "Landroidx/compose/runtime/MutableState;", "redrawSignal", "Landroidx/compose/runtime/MutableState;", "invalidationEnabled", "Z", "getInvalidationEnabled$foundation_release", "setInvalidationEnabled$foundation_release", "(Z)V", "getInvalidationEnabled$foundation_release$annotations", "scrollCycleInProgress", "Landroidx/compose/ui/geometry/Size;", "containerSize", "J", "isEnabledState", "value", "isEnabled", "setEnabled", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/IntSize;", "onNewSize", "Lkotlin/jvm/functions/Function1;", "Landroidx/compose/ui/Modifier;", "effectModifier", "Landroidx/compose/ui/Modifier;", "getEffectModifier", "()Landroidx/compose/ui/Modifier;", "isInProgress", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class AndroidEdgeEffectOverscrollEffect implements OverscrollEffect {
    private final List allEffects;
    private final EdgeEffect bottomEffect;
    private final EdgeEffect bottomEffectNegation;
    private long containerSize;
    private final Modifier effectModifier;
    private boolean invalidationEnabled;
    private boolean isEnabled;
    private final MutableState isEnabledState;
    private final EdgeEffect leftEffect;
    private final EdgeEffect leftEffectNegation;
    private final Function1 onNewSize;
    private final OverscrollConfiguration overscrollConfig;
    private final MutableState redrawSignal;
    private final EdgeEffect rightEffect;
    private final EdgeEffect rightEffectNegation;
    private boolean scrollCycleInProgress;
    private final EdgeEffect topEffect;
    private final EdgeEffect topEffectNegation;

    public AndroidEdgeEffectOverscrollEffect(Context context, OverscrollConfiguration overscrollConfig) {
        Modifier modifier;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(overscrollConfig, "overscrollConfig");
        this.overscrollConfig = overscrollConfig;
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        EdgeEffect create = edgeEffectCompat.create(context, null);
        this.topEffect = create;
        EdgeEffect create2 = edgeEffectCompat.create(context, null);
        this.bottomEffect = create2;
        EdgeEffect create3 = edgeEffectCompat.create(context, null);
        this.leftEffect = create3;
        EdgeEffect create4 = edgeEffectCompat.create(context, null);
        this.rightEffect = create4;
        List listOf = CollectionsKt.listOf((Object[]) new EdgeEffect[]{create3, create, create4, create2});
        this.allEffects = listOf;
        this.topEffectNegation = edgeEffectCompat.create(context, null);
        this.bottomEffectNegation = edgeEffectCompat.create(context, null);
        this.leftEffectNegation = edgeEffectCompat.create(context, null);
        this.rightEffectNegation = edgeEffectCompat.create(context, null);
        int size = listOf.size();
        for (int i = 0; i < size; i++) {
            ((EdgeEffect) listOf.get(i)).setColor(ColorKt.m1471toArgb8_81llA(this.overscrollConfig.getGlowColor()));
        }
        this.redrawSignal = SnapshotStateKt.mutableStateOf(Unit.INSTANCE, SnapshotStateKt.neverEqualPolicy());
        this.invalidationEnabled = true;
        this.containerSize = Size.INSTANCE.m1341getZeroNHjbRc();
        this.isEnabledState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        Function1 function1 = new Function1() { // from class: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$onNewSize$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m154invokeozmzZPI(((IntSize) obj).getPackedValue());
                return Unit.INSTANCE;
            }

            /* renamed from: invoke-ozmzZPI, reason: not valid java name */
            public final void m154invokeozmzZPI(long j) {
                long j2;
                EdgeEffect edgeEffect;
                EdgeEffect edgeEffect2;
                EdgeEffect edgeEffect3;
                EdgeEffect edgeEffect4;
                EdgeEffect edgeEffect5;
                EdgeEffect edgeEffect6;
                EdgeEffect edgeEffect7;
                EdgeEffect edgeEffect8;
                long m2572toSizeozmzZPI = IntSizeKt.m2572toSizeozmzZPI(j);
                j2 = AndroidEdgeEffectOverscrollEffect.this.containerSize;
                boolean m1332equalsimpl0 = Size.m1332equalsimpl0(m2572toSizeozmzZPI, j2);
                AndroidEdgeEffectOverscrollEffect.this.containerSize = IntSizeKt.m2572toSizeozmzZPI(j);
                if (!m1332equalsimpl0) {
                    edgeEffect = AndroidEdgeEffectOverscrollEffect.this.topEffect;
                    edgeEffect.setSize(IntSize.m2567getWidthimpl(j), IntSize.m2566getHeightimpl(j));
                    edgeEffect2 = AndroidEdgeEffectOverscrollEffect.this.bottomEffect;
                    edgeEffect2.setSize(IntSize.m2567getWidthimpl(j), IntSize.m2566getHeightimpl(j));
                    edgeEffect3 = AndroidEdgeEffectOverscrollEffect.this.leftEffect;
                    edgeEffect3.setSize(IntSize.m2566getHeightimpl(j), IntSize.m2567getWidthimpl(j));
                    edgeEffect4 = AndroidEdgeEffectOverscrollEffect.this.rightEffect;
                    edgeEffect4.setSize(IntSize.m2566getHeightimpl(j), IntSize.m2567getWidthimpl(j));
                    edgeEffect5 = AndroidEdgeEffectOverscrollEffect.this.topEffectNegation;
                    edgeEffect5.setSize(IntSize.m2567getWidthimpl(j), IntSize.m2566getHeightimpl(j));
                    edgeEffect6 = AndroidEdgeEffectOverscrollEffect.this.bottomEffectNegation;
                    edgeEffect6.setSize(IntSize.m2567getWidthimpl(j), IntSize.m2566getHeightimpl(j));
                    edgeEffect7 = AndroidEdgeEffectOverscrollEffect.this.leftEffectNegation;
                    edgeEffect7.setSize(IntSize.m2566getHeightimpl(j), IntSize.m2567getWidthimpl(j));
                    edgeEffect8 = AndroidEdgeEffectOverscrollEffect.this.rightEffectNegation;
                    edgeEffect8.setSize(IntSize.m2566getHeightimpl(j), IntSize.m2567getWidthimpl(j));
                }
                if (m1332equalsimpl0) {
                    return;
                }
                AndroidEdgeEffectOverscrollEffect.this.invalidateOverscroll();
                AndroidEdgeEffectOverscrollEffect.this.animateToRelease();
            }
        };
        this.onNewSize = function1;
        Modifier.Companion companion = Modifier.INSTANCE;
        modifier = AndroidOverscrollKt.StretchOverscrollNonClippingLayer;
        this.effectModifier = OnRemeasuredModifierKt.onSizeChanged(companion.then(modifier), function1).then(new DrawOverscrollModifier(this, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1() { // from class: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$special$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("overscroll");
                inspectorInfo.setValue(AndroidEdgeEffectOverscrollEffect.this);
            }
        } : InspectableValueKt.getNoInspectorInfo()));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b9  */
    @Override // androidx.compose.foundation.OverscrollEffect
    /* renamed from: consumePreScroll-A0NYTsA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long mo153consumePreScrollA0NYTsA(long scrollDelta, Offset pointerPosition, int source) {
        float m148pullTop0a9Yr6o;
        long Offset;
        float m146pullLeft0a9Yr6o;
        if (!this.scrollCycleInProgress) {
            stopOverscrollAnimation();
            this.scrollCycleInProgress = true;
        }
        long packedValue = pointerPosition != null ? pointerPosition.getPackedValue() : SizeKt.m1342getCenteruvyYCjk(this.containerSize);
        float f = 0.0f;
        if (Offset.m1298getYimpl(scrollDelta) != 0.0f) {
            EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
            if (edgeEffectCompat.getDistanceCompat(this.topEffect) != 0.0f) {
                m148pullTop0a9Yr6o = m148pullTop0a9Yr6o(scrollDelta, packedValue);
                if (edgeEffectCompat.getDistanceCompat(this.topEffect) == 0.0f) {
                    this.topEffect.onRelease();
                }
            } else if (edgeEffectCompat.getDistanceCompat(this.bottomEffect) != 0.0f) {
                m148pullTop0a9Yr6o = m145pullBottom0a9Yr6o(scrollDelta, packedValue);
                if (edgeEffectCompat.getDistanceCompat(this.bottomEffect) == 0.0f) {
                    this.bottomEffect.onRelease();
                }
            }
            if (Offset.m1297getXimpl(scrollDelta) != 0.0f) {
                EdgeEffectCompat edgeEffectCompat2 = EdgeEffectCompat.INSTANCE;
                if (edgeEffectCompat2.getDistanceCompat(this.leftEffect) != 0.0f) {
                    m146pullLeft0a9Yr6o = m146pullLeft0a9Yr6o(scrollDelta, packedValue);
                    if (edgeEffectCompat2.getDistanceCompat(this.leftEffect) == 0.0f) {
                        this.leftEffect.onRelease();
                    }
                } else if (edgeEffectCompat2.getDistanceCompat(this.rightEffect) != 0.0f) {
                    m146pullLeft0a9Yr6o = m147pullRight0a9Yr6o(scrollDelta, packedValue);
                    if (edgeEffectCompat2.getDistanceCompat(this.rightEffect) == 0.0f) {
                        this.rightEffect.onRelease();
                    }
                }
                f = m146pullLeft0a9Yr6o;
            }
            Offset = OffsetKt.Offset(f, m148pullTop0a9Yr6o);
            if (!Offset.m1294equalsimpl0(Offset, Offset.INSTANCE.m1308getZeroF1C5BW0())) {
                invalidateOverscroll();
            }
            return Offset;
        }
        m148pullTop0a9Yr6o = 0.0f;
        if (Offset.m1297getXimpl(scrollDelta) != 0.0f) {
        }
        Offset = OffsetKt.Offset(f, m148pullTop0a9Yr6o);
        if (!Offset.m1294equalsimpl0(Offset, Offset.INSTANCE.m1308getZeroF1C5BW0())) {
        }
        return Offset;
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    /* renamed from: consumePostScroll-l7mfB5k, reason: not valid java name */
    public void mo151consumePostScrolll7mfB5k(long initialDragDelta, long overscrollDelta, Offset pointerPosition, int source) {
        boolean z;
        if (NestedScrollSource.m1827equalsimpl0(source, NestedScrollSource.INSTANCE.m1831getDragWNlRxjI())) {
            long packedValue = pointerPosition != null ? pointerPosition.getPackedValue() : SizeKt.m1342getCenteruvyYCjk(this.containerSize);
            if (Offset.m1297getXimpl(overscrollDelta) > 0.0f) {
                m146pullLeft0a9Yr6o(overscrollDelta, packedValue);
            } else if (Offset.m1297getXimpl(overscrollDelta) < 0.0f) {
                m147pullRight0a9Yr6o(overscrollDelta, packedValue);
            }
            if (Offset.m1298getYimpl(overscrollDelta) > 0.0f) {
                m148pullTop0a9Yr6o(overscrollDelta, packedValue);
            } else if (Offset.m1298getYimpl(overscrollDelta) < 0.0f) {
                m145pullBottom0a9Yr6o(overscrollDelta, packedValue);
            }
            z = !Offset.m1294equalsimpl0(overscrollDelta, Offset.INSTANCE.m1308getZeroF1C5BW0());
        } else {
            z = false;
        }
        if (m149releaseOppositeOverscrollk4lQ0M(initialDragDelta) || z) {
            invalidateOverscroll();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0059  */
    @Override // androidx.compose.foundation.OverscrollEffect
    /* renamed from: consumePreFling-QWom1Mo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo152consumePreFlingQWom1Mo(long j, Continuation continuation) {
        float f;
        long Velocity;
        float f2 = 0.0f;
        if (Velocity.m2605getXimpl(j) > 0.0f) {
            EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
            if (edgeEffectCompat.getDistanceCompat(this.leftEffect) != 0.0f) {
                edgeEffectCompat.onAbsorbCompat(this.leftEffect, MathKt.roundToInt(Velocity.m2605getXimpl(j)));
                f = Velocity.m2605getXimpl(j);
                if (Velocity.m2606getYimpl(j) > 0.0f) {
                    EdgeEffectCompat edgeEffectCompat2 = EdgeEffectCompat.INSTANCE;
                    if (edgeEffectCompat2.getDistanceCompat(this.topEffect) != 0.0f) {
                        edgeEffectCompat2.onAbsorbCompat(this.topEffect, MathKt.roundToInt(Velocity.m2606getYimpl(j)));
                        f2 = Velocity.m2606getYimpl(j);
                        Velocity = VelocityKt.Velocity(f, f2);
                        if (!Velocity.m2604equalsimpl0(Velocity, Velocity.INSTANCE.m2612getZero9UxMQ8M())) {
                            invalidateOverscroll();
                        }
                        return Velocity.m2599boximpl(Velocity);
                    }
                }
                if (Velocity.m2606getYimpl(j) < 0.0f) {
                    EdgeEffectCompat edgeEffectCompat3 = EdgeEffectCompat.INSTANCE;
                    if (edgeEffectCompat3.getDistanceCompat(this.bottomEffect) != 0.0f) {
                        edgeEffectCompat3.onAbsorbCompat(this.bottomEffect, -MathKt.roundToInt(Velocity.m2606getYimpl(j)));
                        f2 = Velocity.m2606getYimpl(j);
                    }
                }
                Velocity = VelocityKt.Velocity(f, f2);
                if (!Velocity.m2604equalsimpl0(Velocity, Velocity.INSTANCE.m2612getZero9UxMQ8M())) {
                }
                return Velocity.m2599boximpl(Velocity);
            }
        }
        if (Velocity.m2605getXimpl(j) < 0.0f) {
            EdgeEffectCompat edgeEffectCompat4 = EdgeEffectCompat.INSTANCE;
            if (edgeEffectCompat4.getDistanceCompat(this.rightEffect) != 0.0f) {
                edgeEffectCompat4.onAbsorbCompat(this.rightEffect, -MathKt.roundToInt(Velocity.m2605getXimpl(j)));
                f = Velocity.m2605getXimpl(j);
                if (Velocity.m2606getYimpl(j) > 0.0f) {
                }
                if (Velocity.m2606getYimpl(j) < 0.0f) {
                }
                Velocity = VelocityKt.Velocity(f, f2);
                if (!Velocity.m2604equalsimpl0(Velocity, Velocity.INSTANCE.m2612getZero9UxMQ8M())) {
                }
                return Velocity.m2599boximpl(Velocity);
            }
        }
        f = 0.0f;
        if (Velocity.m2606getYimpl(j) > 0.0f) {
        }
        if (Velocity.m2606getYimpl(j) < 0.0f) {
        }
        Velocity = VelocityKt.Velocity(f, f2);
        if (!Velocity.m2604equalsimpl0(Velocity, Velocity.INSTANCE.m2612getZero9UxMQ8M())) {
        }
        return Velocity.m2599boximpl(Velocity);
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    /* renamed from: consumePostFling-sF-c-tU, reason: not valid java name */
    public Object mo150consumePostFlingsFctU(long j, Continuation continuation) {
        this.scrollCycleInProgress = false;
        if (Velocity.m2605getXimpl(j) > 0.0f) {
            EdgeEffectCompat.INSTANCE.onAbsorbCompat(this.leftEffect, MathKt.roundToInt(Velocity.m2605getXimpl(j)));
        } else if (Velocity.m2605getXimpl(j) < 0.0f) {
            EdgeEffectCompat.INSTANCE.onAbsorbCompat(this.rightEffect, -MathKt.roundToInt(Velocity.m2605getXimpl(j)));
        }
        if (Velocity.m2606getYimpl(j) > 0.0f) {
            EdgeEffectCompat.INSTANCE.onAbsorbCompat(this.topEffect, MathKt.roundToInt(Velocity.m2606getYimpl(j)));
        } else if (Velocity.m2606getYimpl(j) < 0.0f) {
            EdgeEffectCompat.INSTANCE.onAbsorbCompat(this.bottomEffect, -MathKt.roundToInt(Velocity.m2606getYimpl(j)));
        }
        if (!Velocity.m2604equalsimpl0(j, Velocity.INSTANCE.m2612getZero9UxMQ8M())) {
            invalidateOverscroll();
        }
        animateToRelease();
        return Unit.INSTANCE;
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    /* renamed from: isEnabled */
    public boolean getIsEnabled() {
        return ((Boolean) this.isEnabledState.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    public void setEnabled(boolean z) {
        boolean z2 = this.isEnabled != z;
        this.isEnabledState.setValue(Boolean.valueOf(z));
        this.isEnabled = z;
        if (z2) {
            this.scrollCycleInProgress = false;
            animateToRelease();
        }
    }

    public final void drawOverscroll(DrawScope drawScope) {
        boolean z;
        Intrinsics.checkNotNullParameter(drawScope, "<this>");
        Canvas canvas = drawScope.getDrawContext().getCanvas();
        this.redrawSignal.getValue();
        android.graphics.Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(canvas);
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        if (edgeEffectCompat.getDistanceCompat(this.leftEffectNegation) != 0.0f) {
            drawRight(drawScope, this.leftEffectNegation, nativeCanvas);
            this.leftEffectNegation.finish();
        }
        if (this.leftEffect.isFinished()) {
            z = false;
        } else {
            z = drawLeft(drawScope, this.leftEffect, nativeCanvas);
            edgeEffectCompat.onPullDistanceCompat(this.leftEffectNegation, edgeEffectCompat.getDistanceCompat(this.leftEffect), 0.0f);
        }
        if (edgeEffectCompat.getDistanceCompat(this.topEffectNegation) != 0.0f) {
            drawBottom(drawScope, this.topEffectNegation, nativeCanvas);
            this.topEffectNegation.finish();
        }
        if (!this.topEffect.isFinished()) {
            z = drawTop(drawScope, this.topEffect, nativeCanvas) || z;
            edgeEffectCompat.onPullDistanceCompat(this.topEffectNegation, edgeEffectCompat.getDistanceCompat(this.topEffect), 0.0f);
        }
        if (edgeEffectCompat.getDistanceCompat(this.rightEffectNegation) != 0.0f) {
            drawLeft(drawScope, this.rightEffectNegation, nativeCanvas);
            this.rightEffectNegation.finish();
        }
        if (!this.rightEffect.isFinished()) {
            z = drawRight(drawScope, this.rightEffect, nativeCanvas) || z;
            edgeEffectCompat.onPullDistanceCompat(this.rightEffectNegation, edgeEffectCompat.getDistanceCompat(this.rightEffect), 0.0f);
        }
        if (edgeEffectCompat.getDistanceCompat(this.bottomEffectNegation) != 0.0f) {
            drawTop(drawScope, this.bottomEffectNegation, nativeCanvas);
            this.bottomEffectNegation.finish();
        }
        if (!this.bottomEffect.isFinished()) {
            boolean z2 = drawBottom(drawScope, this.bottomEffect, nativeCanvas) || z;
            edgeEffectCompat.onPullDistanceCompat(this.bottomEffectNegation, edgeEffectCompat.getDistanceCompat(this.bottomEffect), 0.0f);
            z = z2;
        }
        if (z) {
            invalidateOverscroll();
        }
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    public boolean isInProgress() {
        List list = this.allEffects;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!(EdgeEffectCompat.INSTANCE.getDistanceCompat((EdgeEffect) list.get(i)) == 0.0f)) {
                return true;
            }
        }
        return false;
    }

    private final boolean stopOverscrollAnimation() {
        boolean z;
        long m1342getCenteruvyYCjk = SizeKt.m1342getCenteruvyYCjk(this.containerSize);
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        if (edgeEffectCompat.getDistanceCompat(this.leftEffect) == 0.0f) {
            z = false;
        } else {
            m146pullLeft0a9Yr6o(Offset.INSTANCE.m1308getZeroF1C5BW0(), m1342getCenteruvyYCjk);
            z = true;
        }
        if (edgeEffectCompat.getDistanceCompat(this.rightEffect) != 0.0f) {
            m147pullRight0a9Yr6o(Offset.INSTANCE.m1308getZeroF1C5BW0(), m1342getCenteruvyYCjk);
            z = true;
        }
        if (edgeEffectCompat.getDistanceCompat(this.topEffect) != 0.0f) {
            m148pullTop0a9Yr6o(Offset.INSTANCE.m1308getZeroF1C5BW0(), m1342getCenteruvyYCjk);
            z = true;
        }
        if (edgeEffectCompat.getDistanceCompat(this.bottomEffect) == 0.0f) {
            return z;
        }
        m145pullBottom0a9Yr6o(Offset.INSTANCE.m1308getZeroF1C5BW0(), m1342getCenteruvyYCjk);
        return true;
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    public Modifier getEffectModifier() {
        return this.effectModifier;
    }

    private final boolean drawLeft(DrawScope drawScope, EdgeEffect edgeEffect, android.graphics.Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(270.0f);
        canvas.translate(-Size.m1333getHeightimpl(this.containerSize), drawScope.mo271toPx0680j_4(this.overscrollConfig.getDrawPadding().mo320calculateLeftPaddingu2uoSUM(drawScope.getLayoutDirection())));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    private final boolean drawTop(DrawScope drawScope, EdgeEffect edgeEffect, android.graphics.Canvas canvas) {
        int save = canvas.save();
        canvas.translate(0.0f, drawScope.mo271toPx0680j_4(this.overscrollConfig.getDrawPadding().getTop()));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    private final boolean drawRight(DrawScope drawScope, EdgeEffect edgeEffect, android.graphics.Canvas canvas) {
        int save = canvas.save();
        int roundToInt = MathKt.roundToInt(Size.m1335getWidthimpl(this.containerSize));
        float mo321calculateRightPaddingu2uoSUM = this.overscrollConfig.getDrawPadding().mo321calculateRightPaddingu2uoSUM(drawScope.getLayoutDirection());
        canvas.rotate(90.0f);
        canvas.translate(0.0f, (-roundToInt) + drawScope.mo271toPx0680j_4(mo321calculateRightPaddingu2uoSUM));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    private final boolean drawBottom(DrawScope drawScope, EdgeEffect edgeEffect, android.graphics.Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(180.0f);
        canvas.translate(-Size.m1335getWidthimpl(this.containerSize), (-Size.m1333getHeightimpl(this.containerSize)) + drawScope.mo271toPx0680j_4(this.overscrollConfig.getDrawPadding().getBottom()));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void invalidateOverscroll() {
        if (this.invalidationEnabled) {
            this.redrawSignal.setValue(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void animateToRelease() {
        List list = this.allEffects;
        int size = list.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            EdgeEffect edgeEffect = (EdgeEffect) list.get(i);
            edgeEffect.onRelease();
            z = edgeEffect.isFinished() || z;
        }
        if (z) {
            invalidateOverscroll();
        }
    }

    /* renamed from: releaseOppositeOverscroll-k-4lQ0M, reason: not valid java name */
    private final boolean m149releaseOppositeOverscrollk4lQ0M(long delta) {
        boolean z;
        if (this.leftEffect.isFinished() || Offset.m1297getXimpl(delta) >= 0.0f) {
            z = false;
        } else {
            this.leftEffect.onRelease();
            z = this.leftEffect.isFinished();
        }
        if (!this.rightEffect.isFinished() && Offset.m1297getXimpl(delta) > 0.0f) {
            this.rightEffect.onRelease();
            z = z || this.rightEffect.isFinished();
        }
        if (!this.topEffect.isFinished() && Offset.m1298getYimpl(delta) < 0.0f) {
            this.topEffect.onRelease();
            z = z || this.topEffect.isFinished();
        }
        if (this.bottomEffect.isFinished() || Offset.m1298getYimpl(delta) <= 0.0f) {
            return z;
        }
        this.bottomEffect.onRelease();
        return z || this.bottomEffect.isFinished();
    }

    /* renamed from: pullTop-0a9Yr6o, reason: not valid java name */
    private final float m148pullTop0a9Yr6o(long scroll, long displacement) {
        float m1297getXimpl = Offset.m1297getXimpl(displacement) / Size.m1335getWidthimpl(this.containerSize);
        return EdgeEffectCompat.INSTANCE.onPullDistanceCompat(this.topEffect, Offset.m1298getYimpl(scroll) / Size.m1333getHeightimpl(this.containerSize), m1297getXimpl) * Size.m1333getHeightimpl(this.containerSize);
    }

    /* renamed from: pullBottom-0a9Yr6o, reason: not valid java name */
    private final float m145pullBottom0a9Yr6o(long scroll, long displacement) {
        return (-EdgeEffectCompat.INSTANCE.onPullDistanceCompat(this.bottomEffect, -(Offset.m1298getYimpl(scroll) / Size.m1333getHeightimpl(this.containerSize)), 1 - (Offset.m1297getXimpl(displacement) / Size.m1335getWidthimpl(this.containerSize)))) * Size.m1333getHeightimpl(this.containerSize);
    }

    /* renamed from: pullLeft-0a9Yr6o, reason: not valid java name */
    private final float m146pullLeft0a9Yr6o(long scroll, long displacement) {
        return EdgeEffectCompat.INSTANCE.onPullDistanceCompat(this.leftEffect, Offset.m1297getXimpl(scroll) / Size.m1335getWidthimpl(this.containerSize), 1 - (Offset.m1298getYimpl(displacement) / Size.m1333getHeightimpl(this.containerSize))) * Size.m1335getWidthimpl(this.containerSize);
    }

    /* renamed from: pullRight-0a9Yr6o, reason: not valid java name */
    private final float m147pullRight0a9Yr6o(long scroll, long displacement) {
        return (-EdgeEffectCompat.INSTANCE.onPullDistanceCompat(this.rightEffect, -(Offset.m1297getXimpl(scroll) / Size.m1335getWidthimpl(this.containerSize)), Offset.m1298getYimpl(displacement) / Size.m1333getHeightimpl(this.containerSize))) * Size.m1335getWidthimpl(this.containerSize);
    }
}
