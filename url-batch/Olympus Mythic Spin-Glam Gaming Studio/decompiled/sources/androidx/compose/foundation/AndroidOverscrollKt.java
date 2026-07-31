package androidx.compose.foundation;

import android.content.Context;
import android.os.Build;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidOverscroll.kt */
@Metadata(d1 = {"\u0000\u0017\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002\"\u001a\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u0012\u0004\b\u0006\u0010\u0007\"\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/foundation/OverscrollEffect;", "rememberOverscrollEffect", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/OverscrollEffect;", "androidx/compose/foundation/AndroidOverscrollKt$NoOpOverscrollEffect$1", "NoOpOverscrollEffect", "Landroidx/compose/foundation/AndroidOverscrollKt$NoOpOverscrollEffect$1;", "getNoOpOverscrollEffect$annotations", "()V", "Landroidx/compose/ui/Modifier;", "StretchOverscrollNonClippingLayer", "Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AndroidOverscrollKt {
    private static final AndroidOverscrollKt$NoOpOverscrollEffect$1 NoOpOverscrollEffect = new OverscrollEffect() { // from class: androidx.compose.foundation.AndroidOverscrollKt$NoOpOverscrollEffect$1
        private boolean isEnabled;

        @Override // androidx.compose.foundation.OverscrollEffect
        /* renamed from: consumePostScroll-l7mfB5k */
        public void mo151consumePostScrolll7mfB5k(long initialDragDelta, long overscrollDelta, Offset pointerPosition, int source) {
        }

        @Override // androidx.compose.foundation.OverscrollEffect
        public boolean isInProgress() {
            return false;
        }

        @Override // androidx.compose.foundation.OverscrollEffect
        /* renamed from: consumePreScroll-A0NYTsA */
        public long mo153consumePreScrollA0NYTsA(long scrollDelta, Offset pointerPosition, int source) {
            return Offset.INSTANCE.m1308getZeroF1C5BW0();
        }

        @Override // androidx.compose.foundation.OverscrollEffect
        /* renamed from: consumePreFling-QWom1Mo */
        public Object mo152consumePreFlingQWom1Mo(long j, Continuation continuation) {
            return Velocity.m2599boximpl(Velocity.INSTANCE.m2612getZero9UxMQ8M());
        }

        @Override // androidx.compose.foundation.OverscrollEffect
        /* renamed from: consumePostFling-sF-c-tU */
        public Object mo150consumePostFlingsFctU(long j, Continuation continuation) {
            return Unit.INSTANCE;
        }

        @Override // androidx.compose.foundation.OverscrollEffect
        /* renamed from: isEnabled, reason: from getter */
        public boolean getIsEnabled() {
            return this.isEnabled;
        }

        @Override // androidx.compose.foundation.OverscrollEffect
        public void setEnabled(boolean z) {
            this.isEnabled = z;
        }

        @Override // androidx.compose.foundation.OverscrollEffect
        public Modifier getEffectModifier() {
            return Modifier.INSTANCE;
        }
    };
    private static final Modifier StretchOverscrollNonClippingLayer;

    public static final OverscrollEffect rememberOverscrollEffect(Composer composer, int i) {
        composer.startReplaceableGroup(-81138291);
        Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        OverscrollConfiguration overscrollConfiguration = (OverscrollConfiguration) composer.consume(OverscrollConfigurationKt.getLocalOverscrollConfiguration());
        composer.startReplaceableGroup(511388516);
        boolean changed = composer.changed(context) | composer.changed(overscrollConfiguration);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            if (overscrollConfiguration != null) {
                rememberedValue = new AndroidEdgeEffectOverscrollEffect(context, overscrollConfiguration);
            } else {
                rememberedValue = NoOpOverscrollEffect;
            }
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        OverscrollEffect overscrollEffect = (OverscrollEffect) rememberedValue;
        composer.endReplaceableGroup();
        return overscrollEffect;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.foundation.AndroidOverscrollKt$NoOpOverscrollEffect$1] */
    static {
        Modifier modifier;
        if (Build.VERSION.SDK_INT >= 31) {
            modifier = LayoutModifierKt.layout(LayoutModifierKt.layout(Modifier.INSTANCE, new Function3() { // from class: androidx.compose.foundation.AndroidOverscrollKt$StretchOverscrollNonClippingLayer$1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return m155invoke3p2s80s((MeasureScope) obj, (Measurable) obj2, ((Constraints) obj3).getValue());
                }

                @NotNull
                /* renamed from: invoke-3p2s80s, reason: not valid java name */
                public final MeasureResult m155invoke3p2s80s(@NotNull MeasureScope layout, @NotNull Measurable measurable, long j) {
                    Intrinsics.checkNotNullParameter(layout, "$this$layout");
                    Intrinsics.checkNotNullParameter(measurable, "measurable");
                    final Placeable mo1944measureBRTryo0 = measurable.mo1944measureBRTryo0(j);
                    final int mo265roundToPx0680j_4 = layout.mo265roundToPx0680j_4(Dp.m2507constructorimpl(ClipScrollableContainerKt.getMaxSupportedElevation() * 2));
                    return MeasureScope.layout$default(layout, mo1944measureBRTryo0.getMeasuredWidth() - mo265roundToPx0680j_4, mo1944measureBRTryo0.getMeasuredHeight() - mo265roundToPx0680j_4, null, new Function1() { // from class: androidx.compose.foundation.AndroidOverscrollKt$StretchOverscrollNonClippingLayer$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((Placeable.PlacementScope) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull Placeable.PlacementScope layout2) {
                            Intrinsics.checkNotNullParameter(layout2, "$this$layout");
                            Placeable placeable = Placeable.this;
                            Placeable.PlacementScope.placeWithLayer$default(layout2, placeable, ((-mo265roundToPx0680j_4) / 2) - ((placeable.getWidth() - Placeable.this.getMeasuredWidth()) / 2), ((-mo265roundToPx0680j_4) / 2) - ((Placeable.this.getHeight() - Placeable.this.getMeasuredHeight()) / 2), 0.0f, null, 12, null);
                        }
                    }, 4, null);
                }
            }), new Function3() { // from class: androidx.compose.foundation.AndroidOverscrollKt$StretchOverscrollNonClippingLayer$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return m156invoke3p2s80s((MeasureScope) obj, (Measurable) obj2, ((Constraints) obj3).getValue());
                }

                @NotNull
                /* renamed from: invoke-3p2s80s, reason: not valid java name */
                public final MeasureResult m156invoke3p2s80s(@NotNull MeasureScope layout, @NotNull Measurable measurable, long j) {
                    Intrinsics.checkNotNullParameter(layout, "$this$layout");
                    Intrinsics.checkNotNullParameter(measurable, "measurable");
                    final Placeable mo1944measureBRTryo0 = measurable.mo1944measureBRTryo0(j);
                    final int mo265roundToPx0680j_4 = layout.mo265roundToPx0680j_4(Dp.m2507constructorimpl(ClipScrollableContainerKt.getMaxSupportedElevation() * 2));
                    return MeasureScope.layout$default(layout, mo1944measureBRTryo0.getWidth() + mo265roundToPx0680j_4, mo1944measureBRTryo0.getHeight() + mo265roundToPx0680j_4, null, new Function1() { // from class: androidx.compose.foundation.AndroidOverscrollKt$StretchOverscrollNonClippingLayer$2.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((Placeable.PlacementScope) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull Placeable.PlacementScope layout2) {
                            Intrinsics.checkNotNullParameter(layout2, "$this$layout");
                            Placeable placeable = Placeable.this;
                            int i = mo265roundToPx0680j_4;
                            Placeable.PlacementScope.place$default(layout2, placeable, i / 2, i / 2, 0.0f, 4, null);
                        }
                    }, 4, null);
                }
            });
        } else {
            modifier = Modifier.INSTANCE;
        }
        StretchOverscrollNonClippingLayer = modifier;
    }
}
