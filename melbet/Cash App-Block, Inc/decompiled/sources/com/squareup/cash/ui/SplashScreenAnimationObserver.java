package com.squareup.cash.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.elementboundsregistry.core.ElementBoundsRegistry;
import com.squareup.cash.paymentpad.views.HomeViewKt$$ExternalSyntheticLambda10;
import com.squareup.wire.internal.FieldBinding$$ExternalSyntheticLambda4;
import dev.zacsweers.metro.internal.Factory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.collections.EmptySet;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class SplashScreenAnimationObserver {
    public final AtomicInteger observers = new AtomicInteger();
    public final ParcelableSnapshotMutableFloatState translationY = new ParcelableSnapshotMutableFloatState(RecyclerView.DECELERATION_RATE);

    public final class MetroFactory implements Factory {
        public final /* synthetic */ int $r8$classId;
        public static final MetroFactory INSTANCE$1 = new MetroFactory(1);
        public static final MetroFactory INSTANCE$2 = new MetroFactory(2);
        public static final MetroFactory INSTANCE = new MetroFactory(0);

        public /* synthetic */ MetroFactory(int i) {
            this.$r8$classId = i;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            switch (this.$r8$classId) {
                case 0:
                    return new SplashScreenAnimationObserver();
                case 1:
                    return new ElementBoundsRegistry();
                default:
                    return EmptySet.INSTANCE;
            }
        }
    }

    public final void TranslationYObserver(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1600567668);
        int i2 = (gapComposer.changed(this) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Unit unit = Unit.INSTANCE;
            boolean z = (i2 & 14) == 4;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new HomeViewKt$$ExternalSyntheticLambda10(this, 3);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Updater.DisposableEffect(unit, (Function1) rememberedValue, gapComposer);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FieldBinding$$ExternalSyntheticLambda4(this, i, 9);
        }
    }
}
