package com.yandex.div.core.view2.divs;

import O1.Ef;
import O1.Z;
import android.content.Context;
import android.view.View;
import com.yandex.div.core.DecodeBase64ImageTask;
import com.yandex.div.core.expression.variables.TwoWayIntegerVariableBinder;
import com.yandex.div.core.expression.variables.TwoWayVariableBinder;
import com.yandex.div.core.player.DivPlayer;
import com.yandex.div.core.player.DivPlayerFactory;
import com.yandex.div.core.player.DivPlayerPlaybackConfig;
import com.yandex.div.core.player.DivPlayerView;
import com.yandex.div.core.player.DivVideoSource;
import com.yandex.div.core.player.DivVideoViewMapper;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.util.ImageRepresentation;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.divs.widgets.DivVideoView;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class DivVideoBinder extends DivViewBinder<Z.s, Ef, DivVideoView> {

    @NotNull
    private final DivActionBinder divActionBinder;

    @NotNull
    private final ExecutorService executorService;

    @NotNull
    private final DivPlayerFactory playerFactory;

    @NotNull
    private final TwoWayIntegerVariableBinder variableBinder;

    @NotNull
    private final DivVideoViewMapper videoViewMapper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivVideoBinder(@NotNull DivBaseBinder baseBinder, @NotNull TwoWayIntegerVariableBinder variableBinder, @NotNull DivActionBinder divActionBinder, @NotNull DivVideoViewMapper videoViewMapper, @NotNull ExecutorService executorService, @NotNull DivPlayerFactory playerFactory) {
        super(baseBinder);
        Intrinsics.checkNotNullParameter(baseBinder, "baseBinder");
        Intrinsics.checkNotNullParameter(variableBinder, "variableBinder");
        Intrinsics.checkNotNullParameter(divActionBinder, "divActionBinder");
        Intrinsics.checkNotNullParameter(videoViewMapper, "videoViewMapper");
        Intrinsics.checkNotNullParameter(executorService, "executorService");
        Intrinsics.checkNotNullParameter(playerFactory, "playerFactory");
        this.variableBinder = variableBinder;
        this.divActionBinder = divActionBinder;
        this.videoViewMapper = videoViewMapper;
        this.executorService = executorService;
        this.playerFactory = playerFactory;
    }

    private final void applyPreview(Ef ef, ExpressionResolver expressionResolver, Function1<? super ImageRepresentation, Unit> function1) {
        Expression expression = ef.f2651B;
        String str = expression != null ? (String) expression.evaluate(expressionResolver) : null;
        if (str == null) {
            function1.invoke(null);
        } else {
            this.executorService.submit(new DecodeBase64ImageTask(str, false, function1));
        }
    }

    private final DivPlayer.Observer createObserver(BindingContext bindingContext, final Ef ef, final View view) {
        final Div2View divView = bindingContext.getDivView();
        final ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        return new DivPlayer.Observer() { // from class: com.yandex.div.core.view2.divs.DivVideoBinder$createObserver$1
        };
    }

    private final void observeElapsedTime(DivVideoView divVideoView, Ef ef, BindingContext bindingContext, final DivPlayer divPlayer, DivStatePath divStatePath) {
        String str = ef.f2684m;
        if (str == null) {
            return;
        }
        divVideoView.addSubscription(this.variableBinder.bindVariable(bindingContext, str, new TwoWayVariableBinder.Callbacks() { // from class: com.yandex.div.core.view2.divs.DivVideoBinder$observeElapsedTime$callbacks$1
            @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder.Callbacks
            public void setViewStateChangeListener(@NotNull final Function1<? super Long, Unit> valueUpdater) {
                Intrinsics.checkNotNullParameter(valueUpdater, "valueUpdater");
                DivPlayer.this.addObserver(new DivPlayer.Observer() { // from class: com.yandex.div.core.view2.divs.DivVideoBinder$observeElapsedTime$callbacks$1$setViewStateChangeListener$1
                });
            }

            @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder.Callbacks
            public void onVariableChanged(@Nullable Long l4) {
                if (l4 != null) {
                    DivPlayer.this.seek(l4.longValue());
                }
            }
        }, divStatePath));
    }

    private final void observeMuted(DivVideoView divVideoView, Ef ef, ExpressionResolver expressionResolver, DivPlayer divPlayer) {
        divVideoView.addSubscription(ef.f2694w.observeAndGet(expressionResolver, new DivVideoBinder$observeMuted$1(divPlayer)));
    }

    private final void observeScale(DivVideoView divVideoView, Ef ef, ExpressionResolver expressionResolver, DivPlayerView divPlayerView, PreviewImageView previewImageView) {
        divVideoView.addSubscription(ef.f2656G.observeAndGet(expressionResolver, new DivVideoBinder$observeScale$1(divPlayerView, previewImageView)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.yandex.div.core.view2.DivViewBinder
    public void bind(@NotNull DivVideoView divVideoView, @NotNull BindingContext bindingContext, @NotNull Ef div, @Nullable Ef ef, @NotNull DivStatePath path) {
        PreviewImageView previewImageView;
        DivPlayerView divPlayerView;
        PreviewImageView previewImageView2;
        Intrinsics.checkNotNullParameter(divVideoView, "<this>");
        Intrinsics.checkNotNullParameter(bindingContext, "bindingContext");
        Intrinsics.checkNotNullParameter(div, "div");
        Intrinsics.checkNotNullParameter(path, "path");
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        List<DivVideoSource> createSource = DivVideoBinderKt.createSource(div, expressionResolver);
        DivPlayerPlaybackConfig divPlayerPlaybackConfig = new DivPlayerPlaybackConfig(((Boolean) div.f2678g.evaluate(expressionResolver)).booleanValue(), ((Boolean) div.f2694w.evaluate(expressionResolver)).booleanValue(), ((Boolean) div.f2652C.evaluate(expressionResolver)).booleanValue(), div.f2697z);
        DivPlayerView playerView = divVideoView.getPlayerView();
        int childCount = divVideoView.getChildCount();
        int i4 = 0;
        while (true) {
            if (i4 >= childCount) {
                previewImageView = null;
                break;
            }
            View childAt = divVideoView.getChildAt(i4);
            if (childAt instanceof PreviewImageView) {
                previewImageView = (PreviewImageView) childAt;
                break;
            }
            i4++;
        }
        if (playerView == null) {
            DivPlayerFactory divPlayerFactory = this.playerFactory;
            Context context = divVideoView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            divPlayerView = divPlayerFactory.makePlayerView(context);
            divPlayerView.setVisibility(4);
        } else {
            divPlayerView = playerView;
        }
        if (previewImageView == null) {
            Context context2 = divVideoView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "context");
            previewImageView2 = new PreviewImageView(context2);
        } else {
            previewImageView2 = previewImageView;
        }
        applyPreview(div, expressionResolver, new DivVideoBinder$bind$1(divPlayerView, previewImageView2));
        DivPlayer makePlayer = this.playerFactory.makePlayer(createSource, divPlayerPlaybackConfig);
        makePlayer.addObserver(createObserver(bindingContext, div, previewImageView2));
        divPlayerView.attach(makePlayer);
        observeElapsedTime(divVideoView, div, bindingContext, makePlayer, path);
        observeMuted(divVideoView, div, expressionResolver, makePlayer);
        DivPlayerView divPlayerView2 = divPlayerView;
        PreviewImageView previewImageView3 = previewImageView2;
        observeScale(divVideoView, div, expressionResolver, divPlayerView2, previewImageView3);
        if (previewImageView == null && playerView == null) {
            divVideoView.removeAllViews();
            divVideoView.addView(divPlayerView2);
            divVideoView.addView(previewImageView3);
        }
        this.videoViewMapper.addView(divVideoView, div);
        BaseDivViewExtensionsKt.bindAspectRatio(divVideoView, div.f2677f, ef != null ? ef.f2677f : null, expressionResolver);
    }
}
