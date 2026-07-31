package com.yandex.div.core.timer;

import O1.C0892k0;
import O1.Ne;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.DivActionBinder;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class TimerController {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @Nullable
    private Div2View div2View;

    @NotNull
    private final DivActionBinder divActionBinder;

    @NotNull
    private final Ne divTimer;

    @Nullable
    private final List<C0892k0> endActions;

    @NotNull
    private final ErrorCollector errorCollector;

    @NotNull
    private final ExpressionResolver expressionResolver;

    @NotNull
    private final String id;
    private boolean savedForBackground;

    @Nullable
    private final List<C0892k0> tickActions;

    @NotNull
    private final Ticker ticker;

    @Nullable
    private final String valueVariable;

    @Metadata
    /* renamed from: com.yandex.div.core.timer.TimerController$1, reason: invalid class name */
    static final class AnonymousClass1 extends s implements Function1<Long, Unit> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).longValue());
            return Unit.f41027a;
        }

        public final void invoke(long j4) {
            TimerController.this.updateTimer();
        }
    }

    @Metadata
    /* renamed from: com.yandex.div.core.timer.TimerController$2, reason: invalid class name */
    static final class AnonymousClass2 extends s implements Function1<Long, Unit> {
        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).longValue());
            return Unit.f41027a;
        }

        public final void invoke(long j4) {
            TimerController.this.updateTimer();
        }
    }

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public TimerController(@NotNull Ne divTimer, @NotNull DivActionBinder divActionBinder, @NotNull ErrorCollector errorCollector, @NotNull ExpressionResolver expressionResolver) {
        Intrinsics.checkNotNullParameter(divTimer, "divTimer");
        Intrinsics.checkNotNullParameter(divActionBinder, "divActionBinder");
        Intrinsics.checkNotNullParameter(errorCollector, "errorCollector");
        Intrinsics.checkNotNullParameter(expressionResolver, "expressionResolver");
        this.divTimer = divTimer;
        this.divActionBinder = divActionBinder;
        this.errorCollector = errorCollector;
        this.expressionResolver = expressionResolver;
        String str = divTimer.f4167c;
        this.id = str;
        this.valueVariable = divTimer.f4170f;
        this.endActions = divTimer.f4166b;
        this.tickActions = divTimer.f4168d;
        this.ticker = new Ticker(str, new TimerController$ticker$1(this), new TimerController$ticker$2(this), new TimerController$ticker$3(this), new TimerController$ticker$4(this), errorCollector);
        divTimer.f4165a.observeAndGet(expressionResolver, new AnonymousClass1());
        Expression expression = divTimer.f4169e;
        if (expression != null) {
            expression.observeAndGet(expressionResolver, new AnonymousClass2());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onEnd(long j4) {
        updateTimerVariable(j4);
        Div2View div2View = this.div2View;
        if (div2View != null) {
            DivActionBinder.handleActions$div_release$default(this.divActionBinder, div2View, div2View.getExpressionResolver(), this.endActions, "timer", null, 16, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onTick(long j4) {
        updateTimerVariable(j4);
        Div2View div2View = this.div2View;
        if (div2View != null) {
            DivActionBinder.handleActions$div_release$default(this.divActionBinder, div2View, div2View.getExpressionResolver(), this.tickActions, "timer", null, 16, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateTimer() {
        Ticker ticker = this.ticker;
        long longValue = ((Number) this.divTimer.f4165a.evaluate(this.expressionResolver)).longValue();
        Expression expression = this.divTimer.f4169e;
        ticker.update(longValue, expression != null ? (Long) expression.evaluate(this.expressionResolver) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateTimerVariable(long j4) {
        Div2View div2View;
        String str = this.valueVariable;
        if (str == null || (div2View = this.div2View) == null) {
            return;
        }
        div2View.setVariable(str, String.valueOf(j4));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    public final void applyCommand(@NotNull String command) {
        Intrinsics.checkNotNullParameter(command, "command");
        switch (command.hashCode()) {
            case -1367724422:
                if (command.equals("cancel")) {
                    this.ticker.cancel();
                    return;
                }
                break;
            case -934426579:
                if (command.equals("resume")) {
                    this.ticker.resume();
                    return;
                }
                break;
            case 3540994:
                if (command.equals("stop")) {
                    this.ticker.stop();
                    return;
                }
                break;
            case 106440182:
                if (command.equals("pause")) {
                    this.ticker.pause();
                    return;
                }
                break;
            case 108404047:
                if (command.equals("reset")) {
                    this.ticker.reset();
                    return;
                }
                break;
            case 109757538:
                if (command.equals("start")) {
                    this.ticker.start();
                    return;
                }
                break;
        }
        this.errorCollector.logError(new IllegalArgumentException(command + " is unsupported timer command!"));
    }

    @NotNull
    public final Ne getDivTimer() {
        return this.divTimer;
    }

    public final boolean isAttachedToView(@NotNull Div2View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return Intrinsics.areEqual(view, this.div2View);
    }

    public final void onAttach(@NotNull Div2View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.div2View = view;
        if (this.savedForBackground) {
            this.ticker.restoreState(true);
            this.savedForBackground = false;
        }
    }

    public final void onDetach(@Nullable Div2View div2View) {
        if (Intrinsics.areEqual(div2View, this.div2View)) {
            reset();
        }
    }

    public final void reset() {
        this.div2View = null;
        this.ticker.saveState();
        this.savedForBackground = true;
    }
}
