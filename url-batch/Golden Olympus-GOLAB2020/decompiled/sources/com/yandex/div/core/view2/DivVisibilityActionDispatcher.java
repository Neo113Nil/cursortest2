package com.yandex.div.core.view2;

import O1.M4;
import O1.Wf;
import O1.Xb;
import O1.Z;
import android.support.v4.media.session.b;
import android.view.View;
import com.yandex.div.DivDataTag;
import com.yandex.div.core.Div2Logger;
import com.yandex.div.core.DivActionHandler;
import com.yandex.div.core.view2.divs.DivActionBeaconSender;
import com.yandex.div.internal.KLog;
import com.yandex.div.internal.util.CollectionsKt;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.logging.Severity;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public class DivVisibilityActionDispatcher {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final Map<CompositeLogId, Integer> appearLogCounters;

    @NotNull
    private final Map<CompositeLogId, Integer> disappearLogCounters;

    @NotNull
    private final DivActionBeaconSender divActionBeaconSender;

    @NotNull
    private final DivActionHandler divActionHandler;

    @NotNull
    private final Div2Logger logger;

    @NotNull
    private final List<Object> visibilityListeners;

    @Metadata
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public DivVisibilityActionDispatcher(@NotNull Div2Logger logger, @NotNull List<Object> visibilityListeners, @NotNull DivActionHandler divActionHandler, @NotNull DivActionBeaconSender divActionBeaconSender) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(visibilityListeners, "visibilityListeners");
        Intrinsics.checkNotNullParameter(divActionHandler, "divActionHandler");
        Intrinsics.checkNotNullParameter(divActionBeaconSender, "divActionBeaconSender");
        this.logger = logger;
        this.visibilityListeners = visibilityListeners;
        this.divActionHandler = divActionHandler;
        this.divActionBeaconSender = divActionBeaconSender;
        this.appearLogCounters = CollectionsKt.arrayMap();
        this.disappearLogCounters = CollectionsKt.arrayMap();
    }

    private Map<CompositeLogId, Integer> countersFor(Xb xb) {
        return xb instanceof Wf ? this.appearLogCounters : this.disappearLogCounters;
    }

    private void logAction(Div2View div2View, ExpressionResolver expressionResolver, View view, Xb xb) {
        if (xb instanceof Wf) {
            this.logger.logViewShown(div2View, expressionResolver, view, (Wf) xb);
        } else {
            Div2Logger div2Logger = this.logger;
            Intrinsics.checkNotNull(xb, "null cannot be cast to non-null type com.yandex.div2.DivDisappearAction");
            div2Logger.logViewDisappeared(div2View, expressionResolver, view, (M4) xb);
        }
        this.divActionBeaconSender.sendVisibilityActionBeacon(xb, expressionResolver);
    }

    public void dispatchAction(@NotNull Div2View scope, @NotNull ExpressionResolver resolver, @NotNull View view, @NotNull Xb action) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(action, "action");
        CompositeLogId compositeLogIdOf = CompositeLogIdKt.compositeLogIdOf(scope, (String) action.g().evaluate(resolver));
        Map<CompositeLogId, Integer> countersFor = countersFor(action);
        Integer num = countersFor.get(compositeLogIdOf);
        if (num == null) {
            num = 0;
            countersFor.put(compositeLogIdOf, num);
        }
        int intValue = num.intValue();
        KLog kLog = KLog.INSTANCE;
        Severity severity = Severity.INFO;
        if (kLog.isAtLeast(severity)) {
            kLog.print(4, "DivVisibilityActionDispatcher", "visibility action dispatched: id=" + compositeLogIdOf + ", counter=" + intValue);
        }
        long longValue = ((Number) action.f().evaluate(resolver)).longValue();
        if (longValue == 0 || intValue < longValue) {
            if (this.divActionHandler.getUseActionUid()) {
                String uuid = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
                DivActionHandler actionHandler = scope.getActionHandler();
                if (!(actionHandler != null ? actionHandler.handleAction(action, scope, resolver, uuid) : false) && !this.divActionHandler.handleAction(action, scope, resolver, uuid)) {
                    logAction(scope, resolver, view, action, uuid);
                }
            } else {
                DivActionHandler actionHandler2 = scope.getActionHandler();
                if (!(actionHandler2 != null ? actionHandler2.handleAction(action, scope, resolver) : false) && !this.divActionHandler.handleAction(action, scope, resolver)) {
                    logAction(scope, resolver, view, action);
                }
            }
            countersFor(action).put(compositeLogIdOf, Integer.valueOf(intValue + 1));
            if (kLog.isAtLeast(severity)) {
                kLog.print(4, "DivVisibilityActionDispatcher", "visibility action logged: " + compositeLogIdOf);
            }
        }
    }

    public void dispatchActions(@NotNull Div2View scope, @NotNull ExpressionResolver resolver, @NotNull View view, @NotNull Xb[] actions) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(actions, "actions");
        scope.bulkActions$div_release(new DivVisibilityActionDispatcher$dispatchActions$1(actions, this, scope, resolver, view));
    }

    public void dispatchVisibleViewsChanged(@NotNull Map<View, ? extends Z> visibleViews) {
        Intrinsics.checkNotNullParameter(visibleViews, "visibleViews");
        Iterator<T> it = this.visibilityListeners.iterator();
        if (it.hasNext()) {
            b.a(it.next());
            throw null;
        }
    }

    public void reset(@NotNull List<? extends DivDataTag> tags) {
        Intrinsics.checkNotNullParameter(tags, "tags");
        if (tags.isEmpty()) {
            this.appearLogCounters.clear();
            this.disappearLogCounters.clear();
            return;
        }
        for (DivDataTag divDataTag : tags) {
            kotlin.collections.CollectionsKt.removeAll(this.appearLogCounters.keySet(), new DivVisibilityActionDispatcher$reset$1$1(divDataTag));
            kotlin.collections.CollectionsKt.removeAll(this.disappearLogCounters.keySet(), new DivVisibilityActionDispatcher$reset$1$2(divDataTag));
        }
    }

    private void logAction(Div2View div2View, ExpressionResolver expressionResolver, View view, Xb xb, String str) {
        if (xb instanceof Wf) {
            this.logger.logViewShown(div2View, expressionResolver, view, (Wf) xb, str);
        } else {
            Div2Logger div2Logger = this.logger;
            Intrinsics.checkNotNull(xb, "null cannot be cast to non-null type com.yandex.div2.DivDisappearAction");
            div2Logger.logViewDisappeared(div2View, expressionResolver, view, (M4) xb, str);
        }
        this.divActionBeaconSender.sendVisibilityActionBeacon(xb, expressionResolver);
    }
}
