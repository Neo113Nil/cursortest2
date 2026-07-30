package androidx.compose.animation;

import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;

/* compiled from: AnimatedContent.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\u0007\u001a\u00020\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\bH\u0016J\"\u0010\u000e\u001a\u00020\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000f\u001a\u00020\bH\u0016J,\u0010\u0010\u001a\u00020\u0011*\u00020\u00122\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00130\u000b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\"\u0010\u0018\u001a\u00020\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\bH\u0016J\"\u0010\u0019\u001a\u00020\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000f\u001a\u00020\bH\u0016R\u0015\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"Landroidx/compose/animation/AnimatedContentMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "rootScope", "Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;", "(Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;)V", "getRootScope", "()Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class AnimatedContentMeasurePolicy implements MeasurePolicy {
    private final AnimatedContentTransitionScopeImpl<?> rootScope;

    public AnimatedContentMeasurePolicy(AnimatedContentTransitionScopeImpl<?> animatedContentTransitionScopeImpl) {
        this.rootScope = animatedContentTransitionScopeImpl;
    }

    public final AnimatedContentTransitionScopeImpl<?> getRootScope() {
        return this.rootScope;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00be  */
    /* JADX WARN: Type inference failed for: r1v11, types: [kotlin.collections.IntIterator] */
    /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.collections.IntIterator] */
    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MeasureResult mo33measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        Placeable placeable;
        Placeable placeable2;
        final int i;
        int width;
        int size = list.size();
        final Placeable[] placeableArr = new Placeable[size];
        long m6440getZeroYbymL2g = IntSize.INSTANCE.m6440getZeroYbymL2g();
        int size2 = list.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            placeable = null;
            if (i3 >= size2) {
                break;
            }
            Measurable measurable = list.get(i3);
            Object parentData = measurable.getParentData();
            AnimatedContentTransitionScopeImpl.ChildData childData = parentData instanceof AnimatedContentTransitionScopeImpl.ChildData ? (AnimatedContentTransitionScopeImpl.ChildData) parentData : null;
            if (childData != null && childData.isTarget()) {
                Placeable mo5152measureBRTryo0 = measurable.mo5152measureBRTryo0(j);
                long IntSize = IntSizeKt.IntSize(mo5152measureBRTryo0.getWidth(), mo5152measureBRTryo0.getHeight());
                Unit unit = Unit.INSTANCE;
                placeableArr[i3] = mo5152measureBRTryo0;
                m6440getZeroYbymL2g = IntSize;
            }
            i3++;
        }
        int size3 = list.size();
        for (int i4 = 0; i4 < size3; i4++) {
            Measurable measurable2 = list.get(i4);
            if (placeableArr[i4] == null) {
                placeableArr[i4] = measurable2.mo5152measureBRTryo0(j);
            }
        }
        if (measureScope.isLookingAhead()) {
            width = IntSize.m6435getWidthimpl(m6440getZeroYbymL2g);
        } else {
            if (size == 0) {
                placeable2 = null;
            } else {
                placeable2 = placeableArr[0];
                int lastIndex = ArraysKt.getLastIndex(placeableArr);
                if (lastIndex != 0) {
                    int width2 = placeable2 != null ? placeable2.getWidth() : 0;
                    ?? it = new IntRange(1, lastIndex).iterator();
                    while (it.hasNext()) {
                        Placeable placeable3 = placeableArr[it.nextInt()];
                        int width3 = placeable3 != null ? placeable3.getWidth() : 0;
                        if (width2 < width3) {
                            placeable2 = placeable3;
                            width2 = width3;
                        }
                    }
                }
            }
            if (placeable2 == null) {
                i = 0;
                if (measureScope.isLookingAhead()) {
                    if (size != 0) {
                        placeable = placeableArr[0];
                        int lastIndex2 = ArraysKt.getLastIndex(placeableArr);
                        if (lastIndex2 != 0) {
                            int height = placeable != null ? placeable.getHeight() : 0;
                            ?? it2 = new IntRange(1, lastIndex2).iterator();
                            while (it2.hasNext()) {
                                Placeable placeable4 = placeableArr[it2.nextInt()];
                                int height2 = placeable4 != null ? placeable4.getHeight() : 0;
                                if (height < height2) {
                                    placeable = placeable4;
                                    height = height2;
                                }
                            }
                        }
                    }
                    if (placeable != null) {
                        i2 = placeable.getHeight();
                    }
                } else {
                    i2 = IntSize.m6434getHeightimpl(m6440getZeroYbymL2g);
                }
                final int i5 = i2;
                if (!measureScope.isLookingAhead()) {
                    this.rootScope.m58setMeasuredSizeozmzZPI$animation_release(IntSizeKt.IntSize(i, i5));
                }
                return MeasureScope.layout$default(measureScope, i, i5, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.animation.AnimatedContentMeasurePolicy$measure$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                        invoke2(placementScope);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Placeable.PlacementScope placementScope) {
                        Placeable.PlacementScope placementScope2;
                        Placeable[] placeableArr2 = placeableArr;
                        AnimatedContentMeasurePolicy animatedContentMeasurePolicy = this;
                        int i6 = i;
                        int i7 = i5;
                        int length = placeableArr2.length;
                        int i8 = 0;
                        while (i8 < length) {
                            Placeable placeable5 = placeableArr2[i8];
                            if (placeable5 != null) {
                                long mo3428alignKFBX0sM = animatedContentMeasurePolicy.getRootScope().getContentAlignment().mo3428alignKFBX0sM(IntSizeKt.IntSize(placeable5.getWidth(), placeable5.getHeight()), IntSizeKt.IntSize(i6, i7), LayoutDirection.Ltr);
                                placementScope2 = placementScope;
                                Placeable.PlacementScope.place$default(placementScope2, placeable5, IntOffset.m6393getXimpl(mo3428alignKFBX0sM), IntOffset.m6394getYimpl(mo3428alignKFBX0sM), 0.0f, 4, null);
                            } else {
                                placementScope2 = placementScope;
                            }
                            i8++;
                            placementScope = placementScope2;
                        }
                    }
                }, 4, null);
            }
            width = placeable2.getWidth();
        }
        i = width;
        if (measureScope.isLookingAhead()) {
        }
        final int i52 = i2;
        if (!measureScope.isLookingAhead()) {
        }
        return MeasureScope.layout$default(measureScope, i, i52, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.animation.AnimatedContentMeasurePolicy$measure$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope placementScope2;
                Placeable[] placeableArr2 = placeableArr;
                AnimatedContentMeasurePolicy animatedContentMeasurePolicy = this;
                int i6 = i;
                int i7 = i52;
                int length = placeableArr2.length;
                int i8 = 0;
                while (i8 < length) {
                    Placeable placeable5 = placeableArr2[i8];
                    if (placeable5 != null) {
                        long mo3428alignKFBX0sM = animatedContentMeasurePolicy.getRootScope().getContentAlignment().mo3428alignKFBX0sM(IntSizeKt.IntSize(placeable5.getWidth(), placeable5.getHeight()), IntSizeKt.IntSize(i6, i7), LayoutDirection.Ltr);
                        placementScope2 = placementScope;
                        Placeable.PlacementScope.place$default(placementScope2, placeable5, IntOffset.m6393getXimpl(mo3428alignKFBX0sM), IntOffset.m6394getYimpl(mo3428alignKFBX0sM), 0.0f, 4, null);
                    } else {
                        placementScope2 = placementScope;
                    }
                    i8++;
                    placementScope = placementScope2;
                }
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(list.get(0).minIntrinsicWidth(i));
            int lastIndex = CollectionsKt.getLastIndex(list);
            int i2 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(list.get(i2).minIntrinsicWidth(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == lastIndex) {
                        break;
                    }
                    i2++;
                }
            }
        }
        Integer num = valueOf;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(list.get(0).minIntrinsicHeight(i));
            int lastIndex = CollectionsKt.getLastIndex(list);
            int i2 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(list.get(i2).minIntrinsicHeight(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == lastIndex) {
                        break;
                    }
                    i2++;
                }
            }
        }
        Integer num = valueOf;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(list.get(0).maxIntrinsicWidth(i));
            int lastIndex = CollectionsKt.getLastIndex(list);
            int i2 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(list.get(i2).maxIntrinsicWidth(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == lastIndex) {
                        break;
                    }
                    i2++;
                }
            }
        }
        Integer num = valueOf;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(list.get(0).maxIntrinsicHeight(i));
            int lastIndex = CollectionsKt.getLastIndex(list);
            int i2 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(list.get(i2).maxIntrinsicHeight(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == lastIndex) {
                        break;
                    }
                    i2++;
                }
            }
        }
        Integer num = valueOf;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }
}
