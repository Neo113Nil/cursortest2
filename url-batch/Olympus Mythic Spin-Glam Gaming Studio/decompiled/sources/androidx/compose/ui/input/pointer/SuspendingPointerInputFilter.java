package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.IntSize;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.Nullable;

/* compiled from: SuspendingPointerInputFilter.kt */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001hB\u0019\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000e\u001a\u00020\u000b*\u00020\nH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000e\u001a\u00020\u000b*\u00020\u000fH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\n*\u00020\u000fH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0014\u001a\u00020\n*\u00020\u0015H\u0097\u0001ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0014\u001a\u00020\n*\u00020\u000bH\u0097\u0001ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0018J\u001a\u0010\u001d\u001a\u00020\u001a*\u00020\u0019H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u0015*\u00020\nH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u0017J\u001a\u0010\u001f\u001a\u00020\u0015*\u00020\u000fH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010\u0013J\u0014\u0010#\u001a\u00020\"*\u00020!H\u0097\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u00020\u0019*\u00020\u001aH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010\u001cJ\u001a\u0010)\u001a\u00020\u000f*\u00020\nH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010(J\u001d\u0010)\u001a\u00020\u000f*\u00020\u0015H\u0097\u0001ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b*\u0010(J\u001d\u0010)\u001a\u00020\u000f*\u00020\u000bH\u0097\u0001ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b*\u0010+J-\u00105\u001a\u0002022\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000200H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b3\u00104J\u000f\u00106\u001a\u000202H\u0016¢\u0006\u0004\b6\u00107J=\u0010>\u001a\u00028\u0000\"\u0004\b\u0000\u001082\"\u0010=\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020:\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000;\u0012\u0006\u0012\u0004\u0018\u00010<09H\u0096@ø\u0001\u0000¢\u0006\u0004\b>\u0010?J\u001f\u0010@\u001a\u0002022\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\b@\u0010AR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010B\u001a\u0004\bC\u0010DR\u0016\u0010E\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\"\u0010I\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u00030HR\u00020\u00000G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\"\u0010K\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u00030HR\u00020\u00000G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010JR\u0018\u0010L\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010FR\u001f\u0010M\u001a\u0002008\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\bM\u0010NR(\u0010P\u001a\u00020O8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\bP\u0010Q\u0012\u0004\bV\u00107\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\"\u0010X\u001a\u00020W8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\u0014\u0010\u0007\u001a\u00020\u00158\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b^\u0010_R\u0014\u0010a\u001a\u00020\u00158\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b`\u0010_R\u0014\u0010d\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bb\u0010cR\u001d\u0010g\u001a\u00020\u00198VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\be\u0010f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006i"}, d2 = {"Landroidx/compose/ui/input/pointer/SuspendingPointerInputFilter;", "Landroidx/compose/ui/input/pointer/PointerInputFilter;", "Landroidx/compose/ui/input/pointer/PointerInputModifier;", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/platform/ViewConfiguration;", "viewConfiguration", "density", "<init>", "(Landroidx/compose/ui/platform/ViewConfiguration;Landroidx/compose/ui/unit/Density;)V", "Landroidx/compose/ui/unit/Dp;", "", "roundToPx-0680j_4", "(F)I", "roundToPx", "Landroidx/compose/ui/unit/TextUnit;", "roundToPx--R2X_6o", "(J)I", "toDp-GaN1DYA", "(J)F", "toDp", "", "toDp-u2uoSUM", "(F)F", "(I)F", "Landroidx/compose/ui/geometry/Size;", "Landroidx/compose/ui/unit/DpSize;", "toDpSize-k-rfVVM", "(J)J", "toDpSize", "toPx-0680j_4", "toPx", "toPx--R2X_6o", "Landroidx/compose/ui/unit/DpRect;", "Landroidx/compose/ui/geometry/Rect;", "toRect", "(Landroidx/compose/ui/unit/DpRect;)Landroidx/compose/ui/geometry/Rect;", "toSize-XkaWNTQ", "toSize", "toSp-0xMU5do", "(F)J", "toSp", "toSp-kPz2Gy4", "(I)J", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "Landroidx/compose/ui/unit/IntSize;", "bounds", "", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "onPointerEvent", "onCancel", "()V", "R", "Lkotlin/Function2;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Lkotlin/coroutines/Continuation;", "", "block", "awaitPointerEventScope", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dispatchPointerEvent", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;)V", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "currentEvent", "Landroidx/compose/ui/input/pointer/PointerEvent;", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputFilter$PointerEventHandlerCoroutine;", "pointerHandlers", "Landroidx/compose/runtime/collection/MutableVector;", "dispatchingPointerHandlers", "lastPointerEvent", "boundsSize", "J", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "getCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "setCoroutineScope", "(Lkotlinx/coroutines/CoroutineScope;)V", "getCoroutineScope$annotations", "", "interceptOutOfBoundsChildEvents", "Z", "getInterceptOutOfBoundsChildEvents", "()Z", "setInterceptOutOfBoundsChildEvents", "(Z)V", "getDensity", "()F", "getFontScale", "fontScale", "getPointerInputFilter", "()Landroidx/compose/ui/input/pointer/PointerInputFilter;", "pointerInputFilter", "getExtendedTouchPadding-NH-jbRc", "()J", "extendedTouchPadding", "PointerEventHandlerCoroutine", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SuspendingPointerInputFilter extends PointerInputFilter implements PointerInputModifier, PointerInputScope, Density {
    private final /* synthetic */ Density $$delegate_0;
    private long boundsSize;
    private CoroutineScope coroutineScope;
    private PointerEvent currentEvent;
    private final MutableVector dispatchingPointerHandlers;
    private boolean interceptOutOfBoundsChildEvents;
    private PointerEvent lastPointerEvent;
    private final MutableVector pointerHandlers;
    private final ViewConfiguration viewConfiguration;

    /* compiled from: SuspendingPointerInputFilter.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PointerEventPass.values().length];
            iArr[PointerEventPass.Initial.ordinal()] = 1;
            iArr[PointerEventPass.Final.ordinal()] = 2;
            iArr[PointerEventPass.Main.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.$$delegate_0.getDensity();
    }

    @Override // androidx.compose.ui.unit.Density
    public float getFontScale() {
        return this.$$delegate_0.getFontScale();
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputModifier
    public PointerInputFilter getPointerInputFilter() {
        return this;
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: roundToPx--R2X_6o */
    public int mo264roundToPxR2X_6o(long j) {
        return this.$$delegate_0.mo264roundToPxR2X_6o(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: roundToPx-0680j_4 */
    public int mo265roundToPx0680j_4(float f) {
        return this.$$delegate_0.mo265roundToPx0680j_4(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-GaN1DYA */
    public float mo266toDpGaN1DYA(long j) {
        return this.$$delegate_0.mo266toDpGaN1DYA(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public float mo267toDpu2uoSUM(float f) {
        return this.$$delegate_0.mo267toDpu2uoSUM(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public float mo268toDpu2uoSUM(int i) {
        return this.$$delegate_0.mo268toDpu2uoSUM(i);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDpSize-k-rfVVM */
    public long mo269toDpSizekrfVVM(long j) {
        return this.$$delegate_0.mo269toDpSizekrfVVM(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toPx--R2X_6o */
    public float mo270toPxR2X_6o(long j) {
        return this.$$delegate_0.mo270toPxR2X_6o(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toPx-0680j_4 */
    public float mo271toPx0680j_4(float f) {
        return this.$$delegate_0.mo271toPx0680j_4(f);
    }

    @Override // androidx.compose.ui.unit.Density
    public Rect toRect(DpRect dpRect) {
        Intrinsics.checkNotNullParameter(dpRect, "<this>");
        return this.$$delegate_0.toRect(dpRect);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSize-XkaWNTQ */
    public long mo272toSizeXkaWNTQ(long j) {
        return this.$$delegate_0.mo272toSizeXkaWNTQ(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSp-0xMU5do */
    public long mo273toSp0xMU5do(float f) {
        return this.$$delegate_0.mo273toSp0xMU5do(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public long mo274toSpkPz2Gy4(float f) {
        return this.$$delegate_0.mo274toSpkPz2Gy4(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public long mo275toSpkPz2Gy4(int i) {
        return this.$$delegate_0.mo275toSpkPz2Gy4(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SuspendingPointerInputFilter.kt */
    @Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\f\u001a\u00020\t*\u00020\bH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\f\u001a\u00020\t*\u00020\rH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\b*\u00020\rH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0012\u001a\u00020\b*\u00020\u0013H\u0097\u0001ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0012\u001a\u00020\b*\u00020\tH\u0097\u0001ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0016J\u001a\u0010\u001b\u001a\u00020\u0018*\u00020\u0017H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u0013*\u00020\bH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u0015J\u001a\u0010\u001d\u001a\u00020\u0013*\u00020\rH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u0011J\u0014\u0010!\u001a\u00020 *\u00020\u001fH\u0097\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020\u0017*\u00020\u0018H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010\u001aJ\u001a\u0010'\u001a\u00020\r*\u00020\bH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010&J\u001d\u0010'\u001a\u00020\r*\u00020\u0013H\u0097\u0001ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b(\u0010&J\u001d\u0010'\u001a\u00020\r*\u00020\tH\u0097\u0001ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b(\u0010)J\u001d\u0010/\u001a\u00020.2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u00020.2\b\u00102\u001a\u0004\u0018\u000101¢\u0006\u0004\b3\u00104J \u00107\u001a\u00020.2\f\u00106\u001a\b\u0012\u0004\u0012\u00028\u000005H\u0016ø\u0001\u0000¢\u0006\u0004\b7\u00108J\u001b\u00109\u001a\u00020*2\u0006\u0010-\u001a\u00020,H\u0096@ø\u0001\u0000¢\u0006\u0004\b9\u0010:JG\u0010A\u001a\u0004\u0018\u00018\u0001\"\u0004\b\u0001\u0010;2\u0006\u0010=\u001a\u00020<2\"\u0010@\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010?0>H\u0096@ø\u0001\u0000¢\u0006\u0004\bA\u0010BJE\u0010C\u001a\u00028\u0001\"\u0004\b\u0001\u0010;2\u0006\u0010=\u001a\u00020<2\"\u0010@\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010?0>H\u0096@ø\u0001\u0000¢\u0006\u0004\bC\u0010BR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010DR\u001e\u0010F\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010H\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u001a\u0010K\u001a\u00020J8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u0014\u0010Q\u001a\u00020\u00138\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0014\u0010S\u001a\u00020\u00138\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\bR\u0010PR\u0014\u0010V\u001a\u00020*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bT\u0010UR\u001d\u0010Z\u001a\u00020W8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bX\u0010YR\u0014\u0010^\u001a\u00020[8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010]R\u001d\u0010`\u001a\u00020\u00178VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b_\u0010Y\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006a"}, d2 = {"Landroidx/compose/ui/input/pointer/SuspendingPointerInputFilter$PointerEventHandlerCoroutine;", "R", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Landroidx/compose/ui/unit/Density;", "Lkotlin/coroutines/Continuation;", "completion", "<init>", "(Landroidx/compose/ui/input/pointer/SuspendingPointerInputFilter;Lkotlin/coroutines/Continuation;)V", "Landroidx/compose/ui/unit/Dp;", "", "roundToPx-0680j_4", "(F)I", "roundToPx", "Landroidx/compose/ui/unit/TextUnit;", "roundToPx--R2X_6o", "(J)I", "toDp-GaN1DYA", "(J)F", "toDp", "", "toDp-u2uoSUM", "(F)F", "(I)F", "Landroidx/compose/ui/geometry/Size;", "Landroidx/compose/ui/unit/DpSize;", "toDpSize-k-rfVVM", "(J)J", "toDpSize", "toPx-0680j_4", "toPx", "toPx--R2X_6o", "Landroidx/compose/ui/unit/DpRect;", "Landroidx/compose/ui/geometry/Rect;", "toRect", "(Landroidx/compose/ui/unit/DpRect;)Landroidx/compose/ui/geometry/Rect;", "toSize-XkaWNTQ", "toSize", "toSp-0xMU5do", "(F)J", "toSp", "toSp-kPz2Gy4", "(I)J", "Landroidx/compose/ui/input/pointer/PointerEvent;", "event", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "", "offerPointerEvent", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;)V", "", "cause", "cancel", "(Ljava/lang/Throwable;)V", "Lkotlin/Result;", "result", "resumeWith", "(Ljava/lang/Object;)V", "awaitPointerEvent", "(Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "T", "", "timeMillis", "Lkotlin/Function2;", "", "block", "withTimeoutOrNull", "(JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "withTimeout", "Lkotlin/coroutines/Continuation;", "Lkotlinx/coroutines/CancellableContinuation;", "pointerAwaiter", "Lkotlinx/coroutines/CancellableContinuation;", "awaitPass", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "getDensity", "()F", "density", "getFontScale", "fontScale", "getCurrentEvent", "()Landroidx/compose/ui/input/pointer/PointerEvent;", "currentEvent", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "()J", "size", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "viewConfiguration", "getExtendedTouchPadding-NH-jbRc", "extendedTouchPadding", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    final class PointerEventHandlerCoroutine<R> implements AwaitPointerEventScope, Density, Continuation {
        private final /* synthetic */ SuspendingPointerInputFilter $$delegate_0;
        private PointerEventPass awaitPass;
        private final Continuation completion;
        private final CoroutineContext context;
        private CancellableContinuation pointerAwaiter;
        final /* synthetic */ SuspendingPointerInputFilter this$0;

        @Override // androidx.compose.ui.unit.Density
        public float getDensity() {
            return this.$$delegate_0.getDensity();
        }

        @Override // androidx.compose.ui.unit.Density
        public float getFontScale() {
            return this.$$delegate_0.getFontScale();
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: roundToPx--R2X_6o */
        public int mo264roundToPxR2X_6o(long j) {
            return this.$$delegate_0.mo264roundToPxR2X_6o(j);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: roundToPx-0680j_4 */
        public int mo265roundToPx0680j_4(float f) {
            return this.$$delegate_0.mo265roundToPx0680j_4(f);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toDp-GaN1DYA */
        public float mo266toDpGaN1DYA(long j) {
            return this.$$delegate_0.mo266toDpGaN1DYA(j);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toDp-u2uoSUM */
        public float mo267toDpu2uoSUM(float f) {
            return this.$$delegate_0.mo267toDpu2uoSUM(f);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toDp-u2uoSUM */
        public float mo268toDpu2uoSUM(int i) {
            return this.$$delegate_0.mo268toDpu2uoSUM(i);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toDpSize-k-rfVVM */
        public long mo269toDpSizekrfVVM(long j) {
            return this.$$delegate_0.mo269toDpSizekrfVVM(j);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toPx--R2X_6o */
        public float mo270toPxR2X_6o(long j) {
            return this.$$delegate_0.mo270toPxR2X_6o(j);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toPx-0680j_4 */
        public float mo271toPx0680j_4(float f) {
            return this.$$delegate_0.mo271toPx0680j_4(f);
        }

        @Override // androidx.compose.ui.unit.Density
        public Rect toRect(DpRect dpRect) {
            Intrinsics.checkNotNullParameter(dpRect, "<this>");
            return this.$$delegate_0.toRect(dpRect);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toSize-XkaWNTQ */
        public long mo272toSizeXkaWNTQ(long j) {
            return this.$$delegate_0.mo272toSizeXkaWNTQ(j);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toSp-0xMU5do */
        public long mo273toSp0xMU5do(float f) {
            return this.$$delegate_0.mo273toSp0xMU5do(f);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toSp-kPz2Gy4 */
        public long mo274toSpkPz2Gy4(float f) {
            return this.$$delegate_0.mo274toSpkPz2Gy4(f);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toSp-kPz2Gy4 */
        public long mo275toSpkPz2Gy4(int i) {
            return this.$$delegate_0.mo275toSpkPz2Gy4(i);
        }

        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        public Object awaitPointerEvent(PointerEventPass pointerEventPass, Continuation continuation) {
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
            cancellableContinuationImpl.initCancellability();
            this.awaitPass = pointerEventPass;
            this.pointerAwaiter = cancellableContinuationImpl;
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return result;
        }

        public PointerEventHandlerCoroutine(SuspendingPointerInputFilter suspendingPointerInputFilter, Continuation completion) {
            Intrinsics.checkNotNullParameter(completion, "completion");
            this.this$0 = suspendingPointerInputFilter;
            this.completion = completion;
            this.$$delegate_0 = suspendingPointerInputFilter;
            this.awaitPass = PointerEventPass.Main;
            this.context = EmptyCoroutineContext.INSTANCE;
        }

        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        public PointerEvent getCurrentEvent() {
            return this.this$0.currentEvent;
        }

        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        /* renamed from: getSize-YbymL2g */
        public long mo1834getSizeYbymL2g() {
            return this.this$0.boundsSize;
        }

        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        public ViewConfiguration getViewConfiguration() {
            return this.this$0.getViewConfiguration();
        }

        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        /* renamed from: getExtendedTouchPadding-NH-jbRc */
        public long mo1833getExtendedTouchPaddingNHjbRc() {
            return this.this$0.m1916getExtendedTouchPaddingNHjbRc();
        }

        public final void offerPointerEvent(PointerEvent event, PointerEventPass pass) {
            CancellableContinuation cancellableContinuation;
            Intrinsics.checkNotNullParameter(event, "event");
            Intrinsics.checkNotNullParameter(pass, "pass");
            if (pass != this.awaitPass || (cancellableContinuation = this.pointerAwaiter) == null) {
                return;
            }
            this.pointerAwaiter = null;
            cancellableContinuation.resumeWith(Result.m8023constructorimpl(event));
        }

        public final void cancel(Throwable cause) {
            CancellableContinuation cancellableContinuation = this.pointerAwaiter;
            if (cancellableContinuation != null) {
                cancellableContinuation.cancel(cause);
            }
            this.pointerAwaiter = null;
        }

        @Override // kotlin.coroutines.Continuation
        public CoroutineContext getContext() {
            return this.context;
        }

        @Override // kotlin.coroutines.Continuation
        public void resumeWith(Object result) {
            MutableVector mutableVector = this.this$0.pointerHandlers;
            SuspendingPointerInputFilter suspendingPointerInputFilter = this.this$0;
            synchronized (mutableVector) {
                suspendingPointerInputFilter.pointerHandlers.remove(this);
                Unit unit = Unit.INSTANCE;
            }
            this.completion.resumeWith(result);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object withTimeoutOrNull(long j, Function2 function2, Continuation continuation) {
            SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$1 suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$1;
            int i;
            try {
                if (continuation instanceof SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$1) {
                    suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$1 = (SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$1) continuation;
                    int i2 = suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$1.label;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$1.label = i2 - Integer.MIN_VALUE;
                        Object obj = suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$1.result;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$1.label;
                        if (i != 0) {
                            ResultKt.throwOnFailure(obj);
                            suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$1.label = 1;
                            obj = withTimeout(j, function2, suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$1);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                        }
                        return obj;
                    }
                }
                if (i != 0) {
                }
                return obj;
            } catch (PointerEventTimeoutCancellationException unused) {
                return null;
            }
            suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$1 = new SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$1(this, continuation);
            Object obj2 = suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$1.result;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$1.label;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
        /* JADX WARN: Type inference failed for: r12v0, types: [long] */
        /* JADX WARN: Type inference failed for: r12v1, types: [kotlinx.coroutines.Job] */
        /* JADX WARN: Type inference failed for: r12v3, types: [kotlinx.coroutines.Job] */
        /* JADX WARN: Type inference failed for: r12v7 */
        /* JADX WARN: Type inference failed for: r12v8 */
        /* JADX WARN: Type inference failed for: r14v0, types: [kotlin.jvm.functions.Function2] */
        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object withTimeout(long j, Function2 function2, Continuation continuation) {
            SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1 suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1;
            int i;
            Job launch$default;
            CancellableContinuation cancellableContinuation;
            try {
                if (continuation instanceof SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1) {
                    suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1 = (SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1) continuation;
                    int i2 = suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1.label;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1.label = i2 - Integer.MIN_VALUE;
                        Object obj = suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1.result;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1.label;
                        if (i != 0) {
                            ResultKt.throwOnFailure(obj);
                            if (j <= 0 && (cancellableContinuation = this.pointerAwaiter) != null) {
                                Result.Companion companion = Result.INSTANCE;
                                cancellableContinuation.resumeWith(Result.m8023constructorimpl(ResultKt.createFailure(new PointerEventTimeoutCancellationException(j))));
                            }
                            launch$default = BuildersKt__Builders_commonKt.launch$default(this.this$0.getCoroutineScope(), null, null, new SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$job$1(j, this, null), 3, null);
                            suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1.L$0 = launch$default;
                            suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1.label = 1;
                            obj = function2.invoke(this, suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1);
                            j = launch$default;
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Job job = (Job) suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            j = job;
                        }
                        return obj;
                    }
                }
                if (i != 0) {
                }
                return obj;
            } finally {
                Job.DefaultImpls.cancel$default(j, null, 1, null);
            }
            suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1 = new SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1(this, continuation);
            Object obj2 = suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1.result;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1.label;
        }
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputScope
    public Object awaitPointerEventScope(Function2 function2, Continuation continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final PointerEventHandlerCoroutine pointerEventHandlerCoroutine = new PointerEventHandlerCoroutine(this, cancellableContinuationImpl);
        synchronized (this.pointerHandlers) {
            this.pointerHandlers.add(pointerEventHandlerCoroutine);
            Continuation createCoroutine = ContinuationKt.createCoroutine(function2, pointerEventHandlerCoroutine, pointerEventHandlerCoroutine);
            Result.Companion companion = Result.INSTANCE;
            createCoroutine.resumeWith(Result.m8023constructorimpl(Unit.INSTANCE));
        }
        cancellableContinuationImpl.invokeOnCancellation(new Function1() { // from class: androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$awaitPointerEventScope$2$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Throwable th) {
                pointerEventHandlerCoroutine.cancel(th);
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputScope
    public ViewConfiguration getViewConfiguration() {
        return this.viewConfiguration;
    }

    public SuspendingPointerInputFilter(ViewConfiguration viewConfiguration, Density density) {
        PointerEvent pointerEvent;
        Intrinsics.checkNotNullParameter(viewConfiguration, "viewConfiguration");
        Intrinsics.checkNotNullParameter(density, "density");
        this.viewConfiguration = viewConfiguration;
        this.$$delegate_0 = density;
        pointerEvent = SuspendingPointerInputFilterKt.EmptyPointerEvent;
        this.currentEvent = pointerEvent;
        this.pointerHandlers = new MutableVector(new PointerEventHandlerCoroutine[16], 0);
        this.dispatchingPointerHandlers = new MutableVector(new PointerEventHandlerCoroutine[16], 0);
        this.boundsSize = IntSize.INSTANCE.m2571getZeroYbymL2g();
        this.coroutineScope = GlobalScope.INSTANCE;
    }

    public final CoroutineScope getCoroutineScope() {
        return this.coroutineScope;
    }

    public final void setCoroutineScope(CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(coroutineScope, "<set-?>");
        this.coroutineScope = coroutineScope;
    }

    /* renamed from: getExtendedTouchPadding-NH-jbRc, reason: not valid java name */
    public long m1916getExtendedTouchPaddingNHjbRc() {
        long mo272toSizeXkaWNTQ = mo272toSizeXkaWNTQ(getViewConfiguration().mo2020getMinimumTouchTargetSizeMYxV2XQ());
        long m1886getSizeYbymL2g = m1886getSizeYbymL2g();
        return SizeKt.Size(Math.max(0.0f, Size.m1335getWidthimpl(mo272toSizeXkaWNTQ) - IntSize.m2567getWidthimpl(m1886getSizeYbymL2g)) / 2.0f, Math.max(0.0f, Size.m1333getHeightimpl(mo272toSizeXkaWNTQ) - IntSize.m2566getHeightimpl(m1886getSizeYbymL2g)) / 2.0f);
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputFilter
    public boolean getInterceptOutOfBoundsChildEvents() {
        return this.interceptOutOfBoundsChildEvents;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputScope
    public void setInterceptOutOfBoundsChildEvents(boolean z) {
        this.interceptOutOfBoundsChildEvents = z;
    }

    private final void dispatchPointerEvent(PointerEvent pointerEvent, PointerEventPass pass) {
        MutableVector mutableVector;
        int size;
        synchronized (this.pointerHandlers) {
            MutableVector mutableVector2 = this.dispatchingPointerHandlers;
            mutableVector2.addAll(mutableVector2.getSize(), this.pointerHandlers);
        }
        try {
            int i = WhenMappings.$EnumSwitchMapping$0[pass.ordinal()];
            if (i == 1 || i == 2) {
                MutableVector mutableVector3 = this.dispatchingPointerHandlers;
                int size2 = mutableVector3.getSize();
                if (size2 > 0) {
                    Object[] content = mutableVector3.getContent();
                    int i2 = 0;
                    do {
                        ((PointerEventHandlerCoroutine) content[i2]).offerPointerEvent(pointerEvent, pass);
                        i2++;
                    } while (i2 < size2);
                }
            } else if (i == 3 && (size = (mutableVector = this.dispatchingPointerHandlers).getSize()) > 0) {
                int i3 = size - 1;
                Object[] content2 = mutableVector.getContent();
                do {
                    ((PointerEventHandlerCoroutine) content2[i3]).offerPointerEvent(pointerEvent, pass);
                    i3--;
                } while (i3 >= 0);
            }
        } finally {
            this.dispatchingPointerHandlers.clear();
        }
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputFilter
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo1887onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pass, long bounds) {
        Intrinsics.checkNotNullParameter(pointerEvent, "pointerEvent");
        Intrinsics.checkNotNullParameter(pass, "pass");
        this.boundsSize = bounds;
        if (pass == PointerEventPass.Initial) {
            this.currentEvent = pointerEvent;
        }
        dispatchPointerEvent(pointerEvent, pass);
        List changes = pointerEvent.getChanges();
        int size = changes.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                z = true;
                break;
            } else if (!PointerEventKt.changedToUpIgnoreConsumed((PointerInputChange) changes.get(i))) {
                break;
            } else {
                i++;
            }
        }
        if (z) {
            pointerEvent = null;
        }
        this.lastPointerEvent = pointerEvent;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputFilter
    public void onCancel() {
        PointerEvent pointerEvent = this.lastPointerEvent;
        if (pointerEvent == null) {
            return;
        }
        List changes = pointerEvent.getChanges();
        int size = changes.size();
        for (int i = 0; i < size; i++) {
            if (((PointerInputChange) changes.get(i)).getPressed()) {
                List changes2 = pointerEvent.getChanges();
                ArrayList arrayList = new ArrayList(changes2.size());
                int size2 = changes2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    PointerInputChange pointerInputChange = (PointerInputChange) changes2.get(i2);
                    arrayList.add(new PointerInputChange(pointerInputChange.getId(), pointerInputChange.getUptimeMillis(), pointerInputChange.getPosition(), false, pointerInputChange.getUptimeMillis(), pointerInputChange.getPosition(), pointerInputChange.getPressed(), pointerInputChange.getPressed(), 0, 0L, 768, (DefaultConstructorMarker) null));
                }
                PointerEvent pointerEvent2 = new PointerEvent(arrayList);
                this.currentEvent = pointerEvent2;
                dispatchPointerEvent(pointerEvent2, PointerEventPass.Initial);
                dispatchPointerEvent(pointerEvent2, PointerEventPass.Main);
                dispatchPointerEvent(pointerEvent2, PointerEventPass.Final);
                this.lastPointerEvent = null;
                return;
            }
        }
    }
}
