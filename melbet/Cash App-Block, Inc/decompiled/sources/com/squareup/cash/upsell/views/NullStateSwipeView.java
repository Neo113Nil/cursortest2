package com.squareup.cash.upsell.views;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import app.cash.broadway.ui.compose.ComposeUiView;
import coil3.RealImageLoader;
import coil3.compose.LocalImageLoaderKt;
import com.squareup.cash.upsell.viewmodels.NullStateViewModel$SwipeViewModel$Content;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final class NullStateSwipeView extends ComposeUiView {
    public final RealImageLoader imageLoader;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NullStateSwipeView(Context context, RealImageLoader realImageLoader) {
        super(context);
        context.getClass();
        realImageLoader.getClass();
        this.imageLoader = realImageLoader;
    }

    public final void Content(final NullStateViewModel$SwipeViewModel$Content nullStateViewModel$SwipeViewModel$Content, final Function1 function1, Composer composer, final int i) {
        NullStateSwipeView nullStateSwipeView;
        NullStateViewModel$SwipeViewModel$Content nullStateViewModel$SwipeViewModel$Content2;
        Function1 function12;
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1678097617);
        int i3 = (gapComposer.changedInstance(nullStateViewModel$SwipeViewModel$Content) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(this) ? 256 : 128);
        if (!gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            nullStateSwipeView = this;
            nullStateViewModel$SwipeViewModel$Content2 = nullStateViewModel$SwipeViewModel$Content;
            function12 = function1;
            i2 = i;
            gapComposer.skipToGroupEnd();
        } else {
            if (nullStateViewModel$SwipeViewModel$Content == null) {
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    final int i4 = 0;
                    endRestartGroup.block = new Function2(this, nullStateViewModel$SwipeViewModel$Content, function1, i, i4) { // from class: com.squareup.cash.upsell.views.NullStateSwipeView$$ExternalSyntheticLambda0
                        public final /* synthetic */ int $r8$classId;
                        public final /* synthetic */ NullStateSwipeView f$0;
                        public final /* synthetic */ NullStateViewModel$SwipeViewModel$Content f$1;
                        public final /* synthetic */ Function1 f$2;

                        {
                            this.$r8$classId = i4;
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = this.$r8$classId;
                            Function1 function13 = this.f$2;
                            NullStateViewModel$SwipeViewModel$Content nullStateViewModel$SwipeViewModel$Content3 = this.f$1;
                            NullStateSwipeView nullStateSwipeView2 = this.f$0;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    nullStateSwipeView2.Content(nullStateViewModel$SwipeViewModel$Content3, function13, composer2, Updater.updateChangedFlags(1));
                                    break;
                                default:
                                    nullStateSwipeView2.Content(nullStateViewModel$SwipeViewModel$Content3, function13, composer2, Updater.updateChangedFlags(1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(this.imageLoader), Expect_jvmKt.rememberComposableLambda(-1736708079, new NullStateSwipeView$$ExternalSyntheticLambda1(nullStateViewModel$SwipeViewModel$Content, function1, 0, (byte) 0), gapComposer), gapComposer, 56);
            nullStateSwipeView = this;
            nullStateViewModel$SwipeViewModel$Content2 = nullStateViewModel$SwipeViewModel$Content;
            function12 = function1;
            i2 = i;
        }
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            final int i5 = i2;
            final Function1 function13 = function12;
            final NullStateViewModel$SwipeViewModel$Content nullStateViewModel$SwipeViewModel$Content3 = nullStateViewModel$SwipeViewModel$Content2;
            final NullStateSwipeView nullStateSwipeView2 = nullStateSwipeView;
            final int i6 = 1;
            endRestartGroup2.block = new Function2(nullStateSwipeView2, nullStateViewModel$SwipeViewModel$Content3, function13, i5, i6) { // from class: com.squareup.cash.upsell.views.NullStateSwipeView$$ExternalSyntheticLambda0
                public final /* synthetic */ int $r8$classId;
                public final /* synthetic */ NullStateSwipeView f$0;
                public final /* synthetic */ NullStateViewModel$SwipeViewModel$Content f$1;
                public final /* synthetic */ Function1 f$2;

                {
                    this.$r8$classId = i6;
                    this.f$0 = nullStateSwipeView2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i52 = this.$r8$classId;
                    Function1 function132 = this.f$2;
                    NullStateViewModel$SwipeViewModel$Content nullStateViewModel$SwipeViewModel$Content32 = this.f$1;
                    NullStateSwipeView nullStateSwipeView22 = this.f$0;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    switch (i52) {
                        case 0:
                            nullStateSwipeView22.Content(nullStateViewModel$SwipeViewModel$Content32, function132, composer2, Updater.updateChangedFlags(1));
                            break;
                        default:
                            nullStateSwipeView22.Content(nullStateViewModel$SwipeViewModel$Content32, function132, composer2, Updater.updateChangedFlags(1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
        }
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        Content((NullStateViewModel$SwipeViewModel$Content) obj, function1, gapComposer, 0);
    }
}
