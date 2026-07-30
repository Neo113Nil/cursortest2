package androidx.lifecycle;

import com.drake.net.scope.AndroidScope;
import com.drake.net.scope.NetCoroutineScope;
import com.drake.net.time.Interval;
import f6.p;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.t0;

/* loaded from: classes.dex */
public final class ScopeKt {
    public static final Interval life(Interval interval, ViewModel viewModel) {
        s.checkNotNullParameter(interval, "<this>");
        s.checkNotNullParameter(viewModel, "viewModel");
        viewModel.setTagIfAbsent(interval.toString(), interval);
        return interval;
    }

    public static final AndroidScope scopeLife(ViewModel viewModel, CoroutineDispatcher dispatcher, p block) {
        s.checkNotNullParameter(viewModel, "<this>");
        s.checkNotNullParameter(dispatcher, "dispatcher");
        s.checkNotNullParameter(block, "block");
        AndroidScope launch = new AndroidScope(null, null, dispatcher, 3, null).launch(block);
        Object tagIfAbsent = viewModel.setTagIfAbsent(launch.toString(), launch);
        s.checkNotNullExpressionValue(tagIfAbsent, "setTagIfAbsent(scope.toString(), scope)");
        return (AndroidScope) tagIfAbsent;
    }

    public static /* synthetic */ AndroidScope scopeLife$default(ViewModel viewModel, CoroutineDispatcher coroutineDispatcher, p pVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            coroutineDispatcher = t0.getMain();
        }
        return scopeLife(viewModel, coroutineDispatcher, pVar);
    }

    public static final NetCoroutineScope scopeNetLife(ViewModel viewModel, CoroutineDispatcher dispatcher, p block) {
        s.checkNotNullParameter(viewModel, "<this>");
        s.checkNotNullParameter(dispatcher, "dispatcher");
        s.checkNotNullParameter(block, "block");
        NetCoroutineScope launch = new NetCoroutineScope(null, null, dispatcher, 3, null).launch(block);
        Object tagIfAbsent = viewModel.setTagIfAbsent(launch.toString(), launch);
        s.checkNotNullExpressionValue(tagIfAbsent, "setTagIfAbsent(scope.toString(), scope)");
        return (NetCoroutineScope) tagIfAbsent;
    }

    public static /* synthetic */ NetCoroutineScope scopeNetLife$default(ViewModel viewModel, CoroutineDispatcher coroutineDispatcher, p pVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            coroutineDispatcher = t0.getMain();
        }
        return scopeNetLife(viewModel, coroutineDispatcher, pVar);
    }
}
