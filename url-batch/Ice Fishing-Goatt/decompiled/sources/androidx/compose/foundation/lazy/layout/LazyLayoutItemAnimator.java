package androidx.compose.foundation.lazy.layout;

import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterMapKt;
import androidx.collection.ScatterSetKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LazyLayoutItemAnimator.kt */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0005\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0003IJKB\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010(\u001a\u0004\u0018\u00010\u00072\u0006\u0010)\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u000bJ1\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00028\u00002\u0006\u0010&\u001a\u00020\u000b2\u0012\b\u0002\u0010.\u001a\f0\u0010R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002¢\u0006\u0002\u0010/J\u0082\u0001\u00100\u001a\u00020,2\u0006\u00101\u001a\u00020\u000b2\u0006\u00102\u001a\u00020\u000b2\u0006\u00103\u001a\u00020\u000b2\f\u00104\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\f\u001a\u00020\r2\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u0000062\u0006\u00107\u001a\u00020#2\u0006\u00108\u001a\u00020#2\u0006\u00109\u001a\u00020\u000b2\u0006\u0010:\u001a\u00020#2\u0006\u0010;\u001a\u00020\u000b2\u0006\u0010<\u001a\u00020\u000b2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@J\u0010\u0010A\u001a\u00020,2\u0006\u0010)\u001a\u00020\u0003H\u0002J\u0006\u0010B\u001a\u00020,J\u001f\u0010C\u001a\u00020,2\u0006\u0010-\u001a\u00028\u00002\b\b\u0002\u0010D\u001a\u00020#H\u0002¢\u0006\u0002\u0010EJ\u0019\u0010F\u001a\u00020\u000b*\u00020G2\u0006\u0010-\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010HR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u000e\u0012\f0\u0010R\b\u0012\u0004\u0012\u00028\u00000\u00000\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\u00020\u00128Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u001f\u001a\u00020\u000b*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0018\u0010\"\u001a\u00020#*\u00028\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0018\u0010&\u001a\u00020\u000b*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010!\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006L"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "T", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;", "", "()V", "disappearingItems", "", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;", "displayingNode", "Landroidx/compose/ui/node/DrawModifierNode;", "firstVisibleIndex", "", "keyIndexMap", "Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "keyToItemInfoMap", "Landroidx/collection/MutableScatterMap;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;", "minSizeToFitDisappearingItems", "Landroidx/compose/ui/unit/IntSize;", "getMinSizeToFitDisappearingItems-YbymL2g", "()J", "modifier", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "movingAwayKeys", "Landroidx/collection/MutableScatterSet;", "movingAwayToEndBound", "movingAwayToStartBound", "movingInFromEndBound", "movingInFromStartBound", "crossAxisOffset", "getCrossAxisOffset", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;)I", "hasAnimations", "", "getHasAnimations", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;)Z", "mainAxisOffset", "getMainAxisOffset", "getAnimation", "key", "placeableIndex", "initializeAnimation", "", "item", "itemInfo", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;ILandroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;)V", "onMeasured", "consumedScroll", "layoutWidth", "layoutHeight", "positionedItems", "itemProvider", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItemProvider;", "isVertical", "isLookingAhead", "laneCount", "hasLookaheadOccurred", "layoutMinOffset", "layoutMaxOffset", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "graphicsContext", "Landroidx/compose/ui/graphics/GraphicsContext;", "removeInfoForKey", "reset", "startPlacementAnimationsIfNeeded", "isMovingAway", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;Z)V", "updateAndReturnOffsetFor", "", "([ILandroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;)I", "DisplayingDisappearingItemsElement", "DisplayingDisappearingItemsNode", "ItemInfo", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyLayoutItemAnimator<T extends LazyLayoutMeasuredItem> {
    public static final int $stable = 8;
    private DrawModifierNode displayingNode;
    private int firstVisibleIndex;
    private LazyLayoutKeyIndexMap keyIndexMap;
    private final MutableScatterMap<Object, LazyLayoutItemAnimator<T>.ItemInfo> keyToItemInfoMap = ScatterMapKt.mutableScatterMapOf();
    private final MutableScatterSet<Object> movingAwayKeys = ScatterSetKt.mutableScatterSetOf();
    private final List<T> movingInFromStartBound = new ArrayList();
    private final List<T> movingInFromEndBound = new ArrayList();
    private final List<T> movingAwayToStartBound = new ArrayList();
    private final List<T> movingAwayToEndBound = new ArrayList();
    private final List<LazyLayoutItemAnimation> disappearingItems = new ArrayList();
    private final Modifier modifier = new DisplayingDisappearingItemsElement(this);

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01dd, code lost:
    
        androidx.compose.ui.node.DrawModifierNodeKt.invalidateDraw(r7);
        r7 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01e2, code lost:
    
        r6.animateAppearance();
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01e5, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01e8, code lost:
    
        startPlacementAnimationsIfNeeded$default(r41, r12, false, 2, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x00f8, code lost:
    
        r15 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x00f1, code lost:
    
        r13 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0042, code lost:
    
        r41.firstVisibleIndex = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01f5, code lost:
    
        r34 = r1;
        r27 = r2;
        r29 = r5;
        removeInfoForKey(r12.getKey());
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x020b, code lost:
    
        r2 = 2;
        r6 = new int[r10];
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x020f, code lost:
    
        if (r1 >= r10) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0211, code lost:
    
        r6[r1] = 0;
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0218, code lost:
    
        if (r14 == false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x021a, code lost:
    
        if (r11 == null) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0044, code lost:
    
        if (r48 == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0224, code lost:
    
        if (r41.movingInFromStartBound.isEmpty() != false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0226, code lost:
    
        r1 = r41.movingInFromStartBound;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x022d, code lost:
    
        if (r1.size() <= 1) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x022f, code lost:
    
        kotlin.collections.CollectionsKt.sortWith(r1, new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$onMeasured$$inlined$sortByDescending$1(r11));
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0239, code lost:
    
        r7 = r41.movingInFromStartBound;
        r12 = r7.size();
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0240, code lost:
    
        if (r13 >= r12) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0242, code lost:
    
        r1 = r7.get(r13);
        r15 = r2;
        initializeAnimation$default(r41, r1, r52 - updateAndReturnOffsetFor(r6, r1), null, 4, null);
        startPlacementAnimationsIfNeeded$default(r41, r1, false, r15, null);
        r13 = r13 + 1;
        r2 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x025f, code lost:
    
        r15 = r2;
        kotlin.collections.ArraysKt.fill$default(r6, 0, 0, 0, 6, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0046, code lost:
    
        r3 = androidx.compose.ui.unit.IntOffsetKt.IntOffset(0, r42);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0279, code lost:
    
        if (r41.movingInFromEndBound.isEmpty() != false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x027b, code lost:
    
        r1 = r41.movingInFromEndBound;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0282, code lost:
    
        if (r1.size() <= 1) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0284, code lost:
    
        kotlin.collections.CollectionsKt.sortWith(r1, new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$onMeasured$$inlined$sortBy$1(r11));
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x028e, code lost:
    
        r7 = r41.movingInFromEndBound;
        r12 = r7.size();
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0295, code lost:
    
        if (r13 >= r12) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0297, code lost:
    
        r1 = r7.get(r13);
        initializeAnimation$default(r41, r1, (r53 + updateAndReturnOffsetFor(r6, r1)) - r1.getMainAxisSizeWithSpacings(), null, 4, null);
        startPlacementAnimationsIfNeeded$default(r41, r1, false, r15, null);
        r13 = r13 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02b6, code lost:
    
        kotlin.collections.ArraysKt.fill$default(r6, 0, 0, 0, 6, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02c7, code lost:
    
        r1 = r41.movingAwayKeys;
        r2 = r1.elements;
        r1 = r1.metadata;
        r3 = r1.length - r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:
    
        if (r49 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02d1, code lost:
    
        if (r3 < 0) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02d3, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02d4, code lost:
    
        r12 = r1[r4];
        r7 = r1;
        r5 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02e0, code lost:
    
        if (((((~r12) << 7) & r12) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02e2, code lost:
    
        r1 = 8 - ((~(r4 - r3)) >>> 31);
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02ec, code lost:
    
        if (r2 >= r1) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02f2, code lost:
    
        if ((r12 & 255) >= 128) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x02f4, code lost:
    
        r15 = r5[(r4 << 3) + r2];
        r25 = r2;
        r2 = r41.keyToItemInfoMap.get(r15);
        kotlin.jvm.internal.Intrinsics.checkNotNull(r2);
        r2 = r2;
        r51 = r5;
        r5 = r46.getIndex(r15);
        r33 = r7;
        r2.setSpan(java.lang.Math.min(r10, r2.getSpan()));
        r2.setLane(java.lang.Math.min(r10 - r2.getSpan(), r2.getLane()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x032b, code lost:
    
        if (r5 != (-1)) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
    
        if (r51 != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x032d, code lost:
    
        r5 = r2.getAnimations();
        r10 = r5.length;
        r7 = 0;
        r27 = false;
        r28 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0337, code lost:
    
        if (r7 >= r10) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0339, code lost:
    
        r34 = r2;
        r2 = r5[r7];
        r29 = r28 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x033f, code lost:
    
        if (r2 == null) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0345, code lost:
    
        if (r2.isDisappearanceAnimationInProgress() == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0347, code lost:
    
        r30 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0349, code lost:
    
        r27 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x03a0, code lost:
    
        r7 = r7 + 1;
        r28 = r29;
        r5 = r30;
        r2 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0054, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0352, code lost:
    
        if (r2.isDisappearanceAnimationFinished() == false) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0354, code lost:
    
        r2.release();
        r34.getAnimations()[r28] = null;
        r30 = r5;
        r41.disappearingItems.remove(r2);
        r2 = r41.displayingNode;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0368, code lost:
    
        if (r2 == null) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x036a, code lost:
    
        androidx.compose.ui.node.DrawModifierNodeKt.invalidateDraw(r2);
        r2 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0370, code lost:
    
        r30 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0376, code lost:
    
        if (r2.getLayer() == null) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0378, code lost:
    
        r2.animateDisappearance();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0057, code lost:
    
        r1 = r41.keyToItemInfoMap;
        r5 = r1.keys;
        r1 = r1.metadata;
        r15 = r1.length - 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x037f, code lost:
    
        if (r2.isDisappearanceAnimationInProgress() == false) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0381, code lost:
    
        r41.disappearingItems.add(r2);
        r2 = r41.displayingNode;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0388, code lost:
    
        if (r2 == null) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x038a, code lost:
    
        androidx.compose.ui.node.DrawModifierNodeKt.invalidateDraw(r2);
        r2 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0390, code lost:
    
        r2.release();
        r34.getAnimations()[r28] = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x039c, code lost:
    
        r30 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006f, code lost:
    
        if (r15 < 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x03ab, code lost:
    
        if (r27 != false) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x03ad, code lost:
    
        removeInfoForKey(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x042b, code lost:
    
        r12 = r12 >> 8;
        r10 = r50;
        r2 = r25 + 1;
        r7 = r33;
        r5 = r51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x03b2, code lost:
    
        r2 = r2.getConstraints();
        kotlin.jvm.internal.Intrinsics.checkNotNull(r2);
        r2 = r47.mo787getAndMeasurehBUhpc(r5, r2.getLane(), r2.getSpan(), r2.getValue());
        r2.setNonScrollableItem(true);
        r10 = r2.getAnimations();
        r7 = r10.length;
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x03dd, code lost:
    
        if (r2 >= r7) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x03df, code lost:
    
        r27 = r10[r2];
        r28 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x03e3, code lost:
    
        if (r27 == null) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x03e5, code lost:
    
        r2 = r27.isPlacementAnimationInProgress();
        r27 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0071, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x03ec, code lost:
    
        if (r2 != true) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0402, code lost:
    
        r2.updateAnimation(r2, r54, r55, r52, r53, r2.getCrossAxisOffset());
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0415, code lost:
    
        if (r5 >= r41.firstVisibleIndex) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0417, code lost:
    
        r41.movingAwayToStartBound.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x041d, code lost:
    
        r41.movingAwayToEndBound.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x03f1, code lost:
    
        r2 = r28 + 1;
        r7 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0072, code lost:
    
        r12 = r1[r5];
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x03ef, code lost:
    
        r27 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x03f6, code lost:
    
        if (r11 == null) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x03fc, code lost:
    
        if (r5 != r11.getIndex(r15)) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x03fe, code lost:
    
        removeInfoForKey(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x0423, code lost:
    
        r25 = r2;
        r51 = r5;
        r33 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007e, code lost:
    
        if (((((~r12) << 7) & r12) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0439, code lost:
    
        r51 = r5;
        r33 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0441, code lost:
    
        if (r1 != 8) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x044c, code lost:
    
        if (r4 == r3) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x044e, code lost:
    
        r4 = r4 + 1;
        r10 = r50;
        r2 = r51;
        r1 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0444, code lost:
    
        r51 = r5;
        r33 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0460, code lost:
    
        if (r41.movingAwayToStartBound.isEmpty() != false) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0080, code lost:
    
        r6 = 8 - ((~(r5 - r15)) >>> 31);
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0462, code lost:
    
        r1 = r41.movingAwayToStartBound;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0469, code lost:
    
        if (r1.size() <= 1) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x046b, code lost:
    
        kotlin.collections.CollectionsKt.sortWith(r1, new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$onMeasured$$inlined$sortByDescending$2(r46));
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0475, code lost:
    
        r1 = r41.movingAwayToStartBound;
        r2 = r1.size();
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x047c, code lost:
    
        if (r3 >= r2) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x047e, code lost:
    
        r4 = r1.get(r3);
        r5 = r41.keyToItemInfoMap.get(r4.getKey());
        kotlin.jvm.internal.Intrinsics.checkNotNull(r5);
        r5 = r5;
        r7 = updateAndReturnOffsetFor(r6, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0497, code lost:
    
        if (r49 == false) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0499, code lost:
    
        r10 = getMainAxisOffset((androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem) kotlin.collections.CollectionsKt.first((java.util.List) r45));
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x04a8, code lost:
    
        r4.position(r10 - r7, r5.getCrossAxisOffset(), r43, r44);
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x04b4, code lost:
    
        if (r14 == false) goto L270;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0088, code lost:
    
        if (r7 >= r6) goto L231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x04b6, code lost:
    
        startPlacementAnimationsIfNeeded(r4, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x04ba, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x04a4, code lost:
    
        r10 = r5.getLayoutMinOffset();
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x04bd, code lost:
    
        r7 = r43;
        r11 = r44;
        kotlin.collections.ArraysKt.fill$default(r6, 0, 0, 0, 6, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x04e2, code lost:
    
        if (r41.movingAwayToEndBound.isEmpty() != false) goto L225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x04e4, code lost:
    
        r1 = r41.movingAwayToEndBound;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x04eb, code lost:
    
        if (r1.size() <= 1) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x04ed, code lost:
    
        kotlin.collections.CollectionsKt.sortWith(r1, new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$onMeasured$$inlined$sortBy$2(r46));
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x04f7, code lost:
    
        r1 = r41.movingAwayToEndBound;
        r2 = r1.size();
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x04fe, code lost:
    
        if (r3 >= r2) goto L271;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x0500, code lost:
    
        r4 = r1.get(r3);
        r5 = r41.keyToItemInfoMap.get(r4.getKey());
        kotlin.jvm.internal.Intrinsics.checkNotNull(r5);
        r5 = r5;
        r9 = updateAndReturnOffsetFor(r6, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x0519, code lost:
    
        if (r49 == false) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x051b, code lost:
    
        r10 = getMainAxisOffset((androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem) kotlin.collections.CollectionsKt.last((java.util.List) r45));
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x052f, code lost:
    
        r4.position(r10 + r9, r5.getCrossAxisOffset(), r7, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0538, code lost:
    
        if (r14 == false) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x053a, code lost:
    
        startPlacementAnimationsIfNeeded(r4, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008e, code lost:
    
        if ((r12 & 255) >= 128) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x053d, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x0526, code lost:
    
        r10 = r5.getLayoutMaxOffset() - r4.getMainAxisSizeWithSpacings();
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0540, code lost:
    
        r1 = r41.movingAwayToStartBound;
        kotlin.collections.CollectionsKt.reverse(r1);
        r2 = kotlin.Unit.INSTANCE;
        r45.addAll(0, r1);
        r45.addAll(r41.movingAwayToEndBound);
        r41.movingInFromStartBound.clear();
        r41.movingInFromEndBound.clear();
        r41.movingAwayToStartBound.clear();
        r41.movingAwayToEndBound.clear();
        r41.movingAwayKeys.clear();
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x056d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x04d6, code lost:
    
        r7 = r43;
        r11 = r44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x0270, code lost:
    
        r15 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0090, code lost:
    
        r26 = r1;
        r25 = r7;
        r41.movingAwayKeys.add(r5[(r5 << 3) + r7]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x02c6, code lost:
    
        r15 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x0056, code lost:
    
        r14 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x004b, code lost:
    
        r3 = androidx.compose.ui.unit.IntOffsetKt.IntOffset(r42, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x0041, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a4, code lost:
    
        r12 = r12 >> 8;
        r7 = r25 + 1;
        r1 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a0, code lost:
    
        r26 = r1;
        r25 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ab, code lost:
    
        r26 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00af, code lost:
    
        if (r6 != 8) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b4, code lost:
    
        if (r5 == r15) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b6, code lost:
    
        r5 = r5 + 1;
        r1 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b2, code lost:
    
        r26 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00bb, code lost:
    
        r1 = r45.size();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c1, code lost:
    
        if (r5 >= r1) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c3, code lost:
    
        r12 = r45.get(r5);
        r41.movingAwayKeys.remove(r12.getKey());
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d6, code lost:
    
        if (getHasAnimations(r12) == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d8, code lost:
    
        r25 = r41.keyToItemInfoMap.get(r12.getKey());
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e6, code lost:
    
        if (r11 == null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e8, code lost:
    
        r13 = r11.getIndex(r12.getKey());
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f2, code lost:
    
        if (r13 != (-1)) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f4, code lost:
    
        if (r11 == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f6, code lost:
    
        r15 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f9, code lost:
    
        if (r25 != null) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00fb, code lost:
    
        r7 = new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.ItemInfo(r41);
        androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.ItemInfo.updateAnimation$default(r7, r12, r54, r55, r52, r53, 0, 32, null);
        r34 = r1;
        r41.keyToItemInfoMap.set(r12.getKey(), r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0124, code lost:
    
        if (r12.getIndex() == r13) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0127, code lost:
    
        if (r13 == (-1)) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0129, code lost:
    
        if (r13 >= r2) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x012b, code lost:
    
        r41.movingInFromStartBound.add(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01ef, code lost:
    
        r27 = r2;
        r29 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0203, code lost:
    
        r5 = r29 + 1;
        r2 = r27;
        r1 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0132, code lost:
    
        r41.movingInFromEndBound.add(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0139, code lost:
    
        r25 = r12.mo785getOffsetBjo55l4(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0142, code lost:
    
        if (r12.getIsVertical() == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0144, code lost:
    
        r1 = androidx.compose.ui.unit.IntOffset.m6394getYimpl(r25);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x014d, code lost:
    
        initializeAnimation(r12, r1, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0150, code lost:
    
        if (r15 == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0152, code lost:
    
        r1 = r7.getAnimations();
        r6 = r1.length;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0158, code lost:
    
        if (r7 >= r6) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x015a, code lost:
    
        r12 = r1[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x015c, code lost:
    
        if (r12 == null) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x015e, code lost:
    
        r12.animateAppearance();
        r12 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0163, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0149, code lost:
    
        r1 = androidx.compose.ui.unit.IntOffset.m6393getXimpl(r25);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0166, code lost:
    
        r34 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0168, code lost:
    
        if (r14 == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x016a, code lost:
    
        androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.ItemInfo.updateAnimation$default(r25, r12, r54, r55, r52, r53, 0, 32, null);
        r1 = r25.getAnimations();
        r6 = r1.length;
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0183, code lost:
    
        if (r13 >= r6) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0185, code lost:
    
        r7 = r1[r13];
        r42 = r1;
        r27 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0032, code lost:
    
        r2 = r41.firstVisibleIndex;
        r3 = (androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) r45);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x018b, code lost:
    
        if (r7 == null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x018d, code lost:
    
        r29 = r5;
        r30 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x019f, code lost:
    
        if (androidx.compose.ui.unit.IntOffset.m6392equalsimpl0(r7.getRawOffset(), androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation.INSTANCE.m837getNotInitializednOccac()) != false) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01a1, code lost:
    
        r7.m836setRawOffsetgyyYBs(androidx.compose.ui.unit.IntOffset.m6397plusqkQi6aY(r7.getRawOffset(), r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01b1, code lost:
    
        r13 = r13 + 1;
        r1 = r42;
        r2 = r27;
        r5 = r29;
        r6 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01ad, code lost:
    
        r29 = r5;
        r30 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003a, code lost:
    
        if (r3 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01bc, code lost:
    
        r27 = r2;
        r29 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01c0, code lost:
    
        if (r15 == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01c2, code lost:
    
        r1 = r25.getAnimations();
        r2 = r1.length;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01c8, code lost:
    
        if (r5 >= r2) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01ca, code lost:
    
        r6 = r1[r5];
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01cc, code lost:
    
        if (r6 == null) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01d2, code lost:
    
        if (r6.isDisappearanceAnimationInProgress() == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01d4, code lost:
    
        r41.disappearingItems.remove(r6);
        r7 = r41.displayingNode;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01db, code lost:
    
        if (r7 == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003c, code lost:
    
        r3 = r3.getIndex();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasured(int consumedScroll, int layoutWidth, int layoutHeight, List<T> positionedItems, final LazyLayoutKeyIndexMap keyIndexMap, LazyLayoutMeasuredItemProvider<T> itemProvider, boolean isVertical, boolean isLookingAhead, int laneCount, boolean hasLookaheadOccurred, int layoutMinOffset, int layoutMaxOffset, CoroutineScope coroutineScope, GraphicsContext graphicsContext) {
        int i = laneCount;
        final LazyLayoutKeyIndexMap lazyLayoutKeyIndexMap = this.keyIndexMap;
        this.keyIndexMap = keyIndexMap;
        int size = positionedItems.size();
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                if (getHasAnimations(positionedItems.get(i2))) {
                    break;
                } else {
                    i2++;
                }
            } else if (this.keyToItemInfoMap.isEmpty()) {
                reset();
                return;
            }
        }
    }

    private final void removeInfoForKey(Object key) {
        LazyLayoutItemAnimation[] animations;
        LazyLayoutItemAnimator<T>.ItemInfo remove = this.keyToItemInfoMap.remove(key);
        if (remove == null || (animations = remove.getAnimations()) == null) {
            return;
        }
        for (LazyLayoutItemAnimation lazyLayoutItemAnimation : animations) {
            if (lazyLayoutItemAnimation != null) {
                lazyLayoutItemAnimation.release();
            }
        }
    }

    public final void reset() {
        if (this.keyToItemInfoMap.isNotEmpty()) {
            MutableScatterMap<Object, LazyLayoutItemAnimator<T>.ItemInfo> mutableScatterMap = this.keyToItemInfoMap;
            Object[] objArr = mutableScatterMap.values;
            long[] jArr = mutableScatterMap.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                for (LazyLayoutItemAnimation lazyLayoutItemAnimation : ((ItemInfo) objArr[(i << 3) + i3]).getAnimations()) {
                                    if (lazyLayoutItemAnimation != null) {
                                        lazyLayoutItemAnimation.release();
                                    }
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            this.keyToItemInfoMap.clear();
        }
        this.keyIndexMap = LazyLayoutKeyIndexMap.INSTANCE;
        this.firstVisibleIndex = -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void initializeAnimation$default(LazyLayoutItemAnimator lazyLayoutItemAnimator, LazyLayoutMeasuredItem lazyLayoutMeasuredItem, int i, ItemInfo itemInfo, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            LazyLayoutItemAnimator<T>.ItemInfo itemInfo2 = lazyLayoutItemAnimator.keyToItemInfoMap.get(lazyLayoutMeasuredItem.getKey());
            Intrinsics.checkNotNull(itemInfo2);
            itemInfo = itemInfo2;
        }
        lazyLayoutItemAnimator.initializeAnimation(lazyLayoutMeasuredItem, i, itemInfo);
    }

    private final void initializeAnimation(T item, int mainAxisOffset, LazyLayoutItemAnimator<T>.ItemInfo itemInfo) {
        long m6389copyiSbpLlY$default;
        int i = 0;
        long mo785getOffsetBjo55l4 = item.mo785getOffsetBjo55l4(0);
        if (item.getIsVertical()) {
            m6389copyiSbpLlY$default = IntOffset.m6389copyiSbpLlY$default(mo785getOffsetBjo55l4, 0, mainAxisOffset, 1, null);
        } else {
            m6389copyiSbpLlY$default = IntOffset.m6389copyiSbpLlY$default(mo785getOffsetBjo55l4, mainAxisOffset, 0, 2, null);
        }
        LazyLayoutItemAnimation[] animations = itemInfo.getAnimations();
        int length = animations.length;
        int i2 = 0;
        while (i < length) {
            LazyLayoutItemAnimation lazyLayoutItemAnimation = animations[i];
            int i3 = i2 + 1;
            if (lazyLayoutItemAnimation != null) {
                lazyLayoutItemAnimation.m836setRawOffsetgyyYBs(IntOffset.m6397plusqkQi6aY(m6389copyiSbpLlY$default, IntOffset.m6396minusqkQi6aY(item.mo785getOffsetBjo55l4(i2), mo785getOffsetBjo55l4)));
            }
            i++;
            i2 = i3;
        }
    }

    static /* synthetic */ void startPlacementAnimationsIfNeeded$default(LazyLayoutItemAnimator lazyLayoutItemAnimator, LazyLayoutMeasuredItem lazyLayoutMeasuredItem, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        lazyLayoutItemAnimator.startPlacementAnimationsIfNeeded(lazyLayoutMeasuredItem, z);
    }

    private final void startPlacementAnimationsIfNeeded(T item, boolean isMovingAway) {
        LazyLayoutItemAnimator<T>.ItemInfo itemInfo = this.keyToItemInfoMap.get(item.getKey());
        Intrinsics.checkNotNull(itemInfo);
        LazyLayoutItemAnimation[] animations = itemInfo.getAnimations();
        int length = animations.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            LazyLayoutItemAnimation lazyLayoutItemAnimation = animations[i];
            int i3 = i2 + 1;
            if (lazyLayoutItemAnimation != null) {
                long mo785getOffsetBjo55l4 = item.mo785getOffsetBjo55l4(i2);
                long rawOffset = lazyLayoutItemAnimation.getRawOffset();
                if (!IntOffset.m6392equalsimpl0(rawOffset, LazyLayoutItemAnimation.INSTANCE.m837getNotInitializednOccac()) && !IntOffset.m6392equalsimpl0(rawOffset, mo785getOffsetBjo55l4)) {
                    lazyLayoutItemAnimation.m829animatePlacementDeltaar5cAso(IntOffset.m6396minusqkQi6aY(mo785getOffsetBjo55l4, rawOffset), isMovingAway);
                }
                lazyLayoutItemAnimation.m836setRawOffsetgyyYBs(mo785getOffsetBjo55l4);
            }
            i++;
            i2 = i3;
        }
    }

    public final LazyLayoutItemAnimation getAnimation(Object key, int placeableIndex) {
        LazyLayoutItemAnimation[] animations;
        LazyLayoutItemAnimator<T>.ItemInfo itemInfo = this.keyToItemInfoMap.get(key);
        if (itemInfo == null || (animations = itemInfo.getAnimations()) == null) {
            return null;
        }
        return animations[placeableIndex];
    }

    private final int updateAndReturnOffsetFor(int[] iArr, T t) {
        int lane = t.getLane();
        int span = t.getSpan() + lane;
        int i = 0;
        while (lane < span) {
            int mainAxisSizeWithSpacings = iArr[lane] + t.getMainAxisSizeWithSpacings();
            iArr[lane] = mainAxisSizeWithSpacings;
            i = Math.max(i, mainAxisSizeWithSpacings);
            lane++;
        }
        return i;
    }

    /* renamed from: getMinSizeToFitDisappearingItems-YbymL2g, reason: not valid java name */
    public final long m838getMinSizeToFitDisappearingItemsYbymL2g() {
        long m6440getZeroYbymL2g = IntSize.INSTANCE.m6440getZeroYbymL2g();
        List<LazyLayoutItemAnimation> list = this.disappearingItems;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            LazyLayoutItemAnimation lazyLayoutItemAnimation = list.get(i);
            GraphicsLayer layer = lazyLayoutItemAnimation.getLayer();
            if (layer != null) {
                m6440getZeroYbymL2g = IntSizeKt.IntSize(Math.max(IntSize.m6435getWidthimpl(m6440getZeroYbymL2g), IntOffset.m6393getXimpl(lazyLayoutItemAnimation.getRawOffset()) + IntSize.m6435getWidthimpl(layer.getSize())), Math.max(IntSize.m6434getHeightimpl(m6440getZeroYbymL2g), IntOffset.m6394getYimpl(lazyLayoutItemAnimation.getRawOffset()) + IntSize.m6434getHeightimpl(layer.getSize())));
            }
        }
        return m6440getZeroYbymL2g;
    }

    public final Modifier getModifier() {
        return this.modifier;
    }

    private final boolean getHasAnimations(T t) {
        LazyLayoutAnimationSpecsNode specs;
        int placeablesCount = t.getPlaceablesCount();
        for (int i = 0; i < placeablesCount; i++) {
            specs = LazyLayoutItemAnimatorKt.getSpecs(t.getParentData(i));
            if (specs != null) {
                return true;
            }
        }
        return false;
    }

    private final int getMainAxisOffset(LazyLayoutMeasuredItem lazyLayoutMeasuredItem) {
        long mo785getOffsetBjo55l4 = lazyLayoutMeasuredItem.mo785getOffsetBjo55l4(0);
        return lazyLayoutMeasuredItem.getIsVertical() ? IntOffset.m6394getYimpl(mo785getOffsetBjo55l4) : IntOffset.m6393getXimpl(mo785getOffsetBjo55l4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getCrossAxisOffset(LazyLayoutMeasuredItem lazyLayoutMeasuredItem) {
        long mo785getOffsetBjo55l4 = lazyLayoutMeasuredItem.mo785getOffsetBjo55l4(0);
        return !lazyLayoutMeasuredItem.getIsVertical() ? IntOffset.m6394getYimpl(mo785getOffsetBjo55l4) : IntOffset.m6393getXimpl(mo785getOffsetBjo55l4);
    }

    /* compiled from: LazyLayoutItemAnimator.kt */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J=\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00028\u00002\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00112\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010*R0\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004@BX\u0086\u000e¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R\u001e\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0011@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u001e\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0011@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013R\u001a\u0010 \u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0013\"\u0004\b\"\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006+"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;", "", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;)V", "<set-?>", "", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;", "animations", "getAnimations", "()[Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;", "[Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "getConstraints-DWUhwKw", "()Landroidx/compose/ui/unit/Constraints;", "setConstraints-_Sx5XlM", "(Landroidx/compose/ui/unit/Constraints;)V", "crossAxisOffset", "", "getCrossAxisOffset", "()I", "setCrossAxisOffset", "(I)V", "isRunningPlacement", "", "()Z", "lane", "getLane", "setLane", "layoutMaxOffset", "getLayoutMaxOffset", "layoutMinOffset", "getLayoutMinOffset", "span", "getSpan", "setSpan", "updateAnimation", "", "positionedItem", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "graphicsContext", "Landroidx/compose/ui/graphics/GraphicsContext;", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/ui/graphics/GraphicsContext;III)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class ItemInfo {
        private LazyLayoutItemAnimation[] animations;
        private Constraints constraints;
        private int crossAxisOffset;
        private int lane;
        private int layoutMaxOffset;
        private int layoutMinOffset;
        private int span;

        public ItemInfo() {
            LazyLayoutItemAnimation[] lazyLayoutItemAnimationArr;
            lazyLayoutItemAnimationArr = LazyLayoutItemAnimatorKt.EmptyArray;
            this.animations = lazyLayoutItemAnimationArr;
            this.span = 1;
        }

        public final LazyLayoutItemAnimation[] getAnimations() {
            return this.animations;
        }

        /* renamed from: getConstraints-DWUhwKw, reason: not valid java name and from getter */
        public final Constraints getConstraints() {
            return this.constraints;
        }

        /* renamed from: setConstraints-_Sx5XlM, reason: not valid java name */
        public final void m840setConstraints_Sx5XlM(Constraints constraints) {
            this.constraints = constraints;
        }

        public final int getCrossAxisOffset() {
            return this.crossAxisOffset;
        }

        public final void setCrossAxisOffset(int i) {
            this.crossAxisOffset = i;
        }

        public final int getLane() {
            return this.lane;
        }

        public final void setLane(int i) {
            this.lane = i;
        }

        public final int getSpan() {
            return this.span;
        }

        public final void setSpan(int i) {
            this.span = i;
        }

        private final boolean isRunningPlacement() {
            for (LazyLayoutItemAnimation lazyLayoutItemAnimation : this.animations) {
                if (lazyLayoutItemAnimation != null && lazyLayoutItemAnimation.getIsRunningMovingAwayAnimation()) {
                    return true;
                }
            }
            return false;
        }

        public final int getLayoutMinOffset() {
            return this.layoutMinOffset;
        }

        public final int getLayoutMaxOffset() {
            return this.layoutMaxOffset;
        }

        public static /* synthetic */ void updateAnimation$default(ItemInfo itemInfo, LazyLayoutMeasuredItem lazyLayoutMeasuredItem, CoroutineScope coroutineScope, GraphicsContext graphicsContext, int i, int i2, int i3, int i4, Object obj) {
            if ((i4 & 32) != 0) {
                i3 = LazyLayoutItemAnimator.this.getCrossAxisOffset(lazyLayoutMeasuredItem);
            }
            itemInfo.updateAnimation(lazyLayoutMeasuredItem, coroutineScope, graphicsContext, i, i2, i3);
        }

        public final void updateAnimation(T positionedItem, CoroutineScope coroutineScope, GraphicsContext graphicsContext, int layoutMinOffset, int layoutMaxOffset, int crossAxisOffset) {
            LazyLayoutItemAnimation[] lazyLayoutItemAnimationArr;
            LazyLayoutAnimationSpecsNode specs;
            if (!isRunningPlacement()) {
                this.layoutMinOffset = layoutMinOffset;
                this.layoutMaxOffset = layoutMaxOffset;
            }
            int placeablesCount = positionedItem.getPlaceablesCount();
            int length = this.animations.length;
            while (true) {
                lazyLayoutItemAnimationArr = this.animations;
                if (placeablesCount >= length) {
                    break;
                }
                LazyLayoutItemAnimation lazyLayoutItemAnimation = lazyLayoutItemAnimationArr[placeablesCount];
                if (lazyLayoutItemAnimation != null) {
                    lazyLayoutItemAnimation.release();
                }
                placeablesCount++;
            }
            if (lazyLayoutItemAnimationArr.length != positionedItem.getPlaceablesCount()) {
                Object[] copyOf = Arrays.copyOf(this.animations, positionedItem.getPlaceablesCount());
                Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
                this.animations = (LazyLayoutItemAnimation[]) copyOf;
            }
            this.constraints = Constraints.m6206boximpl(positionedItem.getConstraints());
            this.crossAxisOffset = crossAxisOffset;
            this.lane = positionedItem.getLane();
            this.span = positionedItem.getSpan();
            int placeablesCount2 = positionedItem.getPlaceablesCount();
            final LazyLayoutItemAnimator<T> lazyLayoutItemAnimator = LazyLayoutItemAnimator.this;
            for (int i = 0; i < placeablesCount2; i++) {
                specs = LazyLayoutItemAnimatorKt.getSpecs(positionedItem.getParentData(i));
                LazyLayoutItemAnimation[] lazyLayoutItemAnimationArr2 = this.animations;
                if (specs == null) {
                    LazyLayoutItemAnimation lazyLayoutItemAnimation2 = lazyLayoutItemAnimationArr2[i];
                    if (lazyLayoutItemAnimation2 != null) {
                        lazyLayoutItemAnimation2.release();
                    }
                    this.animations[i] = null;
                } else {
                    LazyLayoutItemAnimation lazyLayoutItemAnimation3 = lazyLayoutItemAnimationArr2[i];
                    if (lazyLayoutItemAnimation3 == null) {
                        lazyLayoutItemAnimation3 = new LazyLayoutItemAnimation(coroutineScope, graphicsContext, new Function0<Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$ItemInfo$updateAnimation$1$animation$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                DrawModifierNode drawModifierNode;
                                drawModifierNode = ((LazyLayoutItemAnimator) lazyLayoutItemAnimator).displayingNode;
                                if (drawModifierNode != null) {
                                    DrawModifierNodeKt.invalidateDraw(drawModifierNode);
                                }
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }
                        });
                        this.animations[i] = lazyLayoutItemAnimation3;
                    }
                    lazyLayoutItemAnimation3.setFadeInSpec(specs.getFadeInSpec());
                    lazyLayoutItemAnimation3.setPlacementSpec(specs.getPlacementSpec());
                    lazyLayoutItemAnimation3.setFadeOutSpec(specs.getFadeOutSpec());
                }
            }
        }
    }

    /* compiled from: LazyLayoutItemAnimator.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0002\u0010\u0005J\r\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0004HÂ\u0003J\u0017\u0010\u0007\u001a\u00020\u00002\f\b\u0002\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004HÆ\u0001J\b\u0010\b\u001a\u00020\u0002H\u0016J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u0016J\f\u0010\u0014\u001a\u00020\u0012*\u00020\u0015H\u0016R\u0012\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$DisplayingDisappearingItemsElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$DisplayingDisappearingItemsNode;", "animator", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;)V", "component1", "copy", "create", "equals", "", "other", "", "hashCode", "", "toString", "", "update", "", "node", "inspectableProperties", "Landroidx/compose/ui/platform/InspectorInfo;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final /* data */ class DisplayingDisappearingItemsElement extends ModifierNodeElement<DisplayingDisappearingItemsNode> {
        private final LazyLayoutItemAnimator<?> animator;

        private final LazyLayoutItemAnimator<?> component1() {
            return this.animator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DisplayingDisappearingItemsElement copy$default(DisplayingDisappearingItemsElement displayingDisappearingItemsElement, LazyLayoutItemAnimator lazyLayoutItemAnimator, int i, Object obj) {
            if ((i & 1) != 0) {
                lazyLayoutItemAnimator = displayingDisappearingItemsElement.animator;
            }
            return displayingDisappearingItemsElement.copy(lazyLayoutItemAnimator);
        }

        public final DisplayingDisappearingItemsElement copy(LazyLayoutItemAnimator<?> animator) {
            return new DisplayingDisappearingItemsElement(animator);
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DisplayingDisappearingItemsElement) && Intrinsics.areEqual(this.animator, ((DisplayingDisappearingItemsElement) other).animator);
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public int hashCode() {
            return this.animator.hashCode();
        }

        public String toString() {
            return "DisplayingDisappearingItemsElement(animator=" + this.animator + ')';
        }

        public DisplayingDisappearingItemsElement(LazyLayoutItemAnimator<?> lazyLayoutItemAnimator) {
            this.animator = lazyLayoutItemAnimator;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.compose.ui.node.ModifierNodeElement
        /* renamed from: create */
        public DisplayingDisappearingItemsNode getNode() {
            return new DisplayingDisappearingItemsNode(this.animator);
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public void update(DisplayingDisappearingItemsNode node) {
            node.setAnimator(this.animator);
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public void inspectableProperties(InspectorInfo inspectorInfo) {
            inspectorInfo.setName("DisplayingDisappearingItemsElement");
        }
    }

    /* compiled from: LazyLayoutItemAnimator.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0002\u0010\u0005J\r\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0004HÂ\u0003J\u0017\u0010\u0007\u001a\u00020\u00002\f\b\u0002\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004HÆ\u0001J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\u0012\u0010\u0011\u001a\u00020\u000f2\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\f\u0010\u0014\u001a\u00020\u000f*\u00020\u0015H\u0016R\u0012\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$DisplayingDisappearingItemsNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/DrawModifierNode;", "animator", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;)V", "component1", "copy", "equals", "", "other", "", "hashCode", "", "onAttach", "", "onDetach", "setAnimator", "toString", "", "draw", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final /* data */ class DisplayingDisappearingItemsNode extends Modifier.Node implements DrawModifierNode {
        private LazyLayoutItemAnimator<?> animator;

        private final LazyLayoutItemAnimator<?> component1() {
            return this.animator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DisplayingDisappearingItemsNode copy$default(DisplayingDisappearingItemsNode displayingDisappearingItemsNode, LazyLayoutItemAnimator lazyLayoutItemAnimator, int i, Object obj) {
            if ((i & 1) != 0) {
                lazyLayoutItemAnimator = displayingDisappearingItemsNode.animator;
            }
            return displayingDisappearingItemsNode.copy(lazyLayoutItemAnimator);
        }

        public final DisplayingDisappearingItemsNode copy(LazyLayoutItemAnimator<?> animator) {
            return new DisplayingDisappearingItemsNode(animator);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DisplayingDisappearingItemsNode) && Intrinsics.areEqual(this.animator, ((DisplayingDisappearingItemsNode) other).animator);
        }

        public int hashCode() {
            return this.animator.hashCode();
        }

        public String toString() {
            return "DisplayingDisappearingItemsNode(animator=" + this.animator + ')';
        }

        public DisplayingDisappearingItemsNode(LazyLayoutItemAnimator<?> lazyLayoutItemAnimator) {
            this.animator = lazyLayoutItemAnimator;
        }

        @Override // androidx.compose.ui.node.DrawModifierNode
        public void draw(ContentDrawScope contentDrawScope) {
            List list = ((LazyLayoutItemAnimator) this.animator).disappearingItems;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                LazyLayoutItemAnimation lazyLayoutItemAnimation = (LazyLayoutItemAnimation) list.get(i);
                GraphicsLayer layer = lazyLayoutItemAnimation.getLayer();
                if (layer != null) {
                    float m6393getXimpl = IntOffset.m6393getXimpl(lazyLayoutItemAnimation.getFinalOffset());
                    ContentDrawScope contentDrawScope2 = contentDrawScope;
                    float m6393getXimpl2 = m6393getXimpl - IntOffset.m6393getXimpl(layer.getTopLeft());
                    float m6394getYimpl = IntOffset.m6394getYimpl(lazyLayoutItemAnimation.getFinalOffset()) - IntOffset.m6394getYimpl(layer.getTopLeft());
                    contentDrawScope2.getDrawContext().getTransform().translate(m6393getXimpl2, m6394getYimpl);
                    try {
                        GraphicsLayerKt.drawLayer(contentDrawScope2, layer);
                    } finally {
                        contentDrawScope2.getDrawContext().getTransform().translate(-m6393getXimpl2, -m6394getYimpl);
                    }
                }
            }
            contentDrawScope.drawContent();
        }

        @Override // androidx.compose.ui.Modifier.Node
        public void onAttach() {
            ((LazyLayoutItemAnimator) this.animator).displayingNode = this;
        }

        @Override // androidx.compose.ui.Modifier.Node
        public void onDetach() {
            this.animator.reset();
        }

        public final void setAnimator(LazyLayoutItemAnimator<?> animator) {
            if (Intrinsics.areEqual(this.animator, animator) || !getNode().getIsAttached()) {
                return;
            }
            this.animator.reset();
            ((LazyLayoutItemAnimator) animator).displayingNode = this;
            this.animator = animator;
        }
    }
}
