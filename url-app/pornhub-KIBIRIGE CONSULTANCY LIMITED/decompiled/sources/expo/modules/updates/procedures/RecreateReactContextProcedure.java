package expo.modules.updates.procedures;

import android.app.Activity;
import android.content.Context;
import com.facebook.react.ReactApplication;
import expo.modules.updates.launcher.Launcher;
import expo.modules.updates.procedures.StateMachineProcedure;
import expo.modules.updates.statemachine.UpdatesStateEvent;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: RecreateReactContextProcedure.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0096@¢\u0006\u0002\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000eX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, d2 = {"Lexpo/modules/updates/procedures/RecreateReactContextProcedure;", "Lexpo/modules/updates/procedures/StateMachineProcedure;", "context", "Landroid/content/Context;", "weakActivity", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "callback", "Lexpo/modules/updates/launcher/Launcher$LauncherCallback;", "procedureScope", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "(Landroid/content/Context;Ljava/lang/ref/WeakReference;Lexpo/modules/updates/launcher/Launcher$LauncherCallback;Lkotlinx/coroutines/CoroutineScope;)V", "loggerTimerLabel", "", "getLoggerTimerLabel", "()Ljava/lang/String;", "run", "", "procedureContext", "Lexpo/modules/updates/procedures/StateMachineProcedure$ProcedureContext;", "(Lexpo/modules/updates/procedures/StateMachineProcedure$ProcedureContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RecreateReactContextProcedure extends StateMachineProcedure {
    private final Launcher.LauncherCallback callback;
    private final Context context;
    private final String loggerTimerLabel;
    private final CoroutineScope procedureScope;
    private final WeakReference<Activity> weakActivity;

    public /* synthetic */ RecreateReactContextProcedure(Context context, WeakReference weakReference, Launcher.LauncherCallback launcherCallback, CoroutineScope coroutineScope, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, weakReference, launcherCallback, (i & 8) != 0 ? CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()) : coroutineScope);
    }

    public RecreateReactContextProcedure(Context context, WeakReference<Activity> weakReference, Launcher.LauncherCallback callback, CoroutineScope procedureScope) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(procedureScope, "procedureScope");
        this.context = context;
        this.weakActivity = weakReference;
        this.callback = callback;
        this.procedureScope = procedureScope;
        this.loggerTimerLabel = "timer-recreate-react-context";
    }

    @Override // expo.modules.updates.procedures.StateMachineProcedure
    public String getLoggerTimerLabel() {
        return this.loggerTimerLabel;
    }

    @Override // expo.modules.updates.procedures.StateMachineProcedure
    public Object run(StateMachineProcedure.ProcedureContext procedureContext, Continuation<? super Unit> continuation) {
        Object applicationContext = this.context.getApplicationContext();
        ReactApplication reactApplication = applicationContext instanceof ReactApplication ? (ReactApplication) applicationContext : null;
        if (reactApplication == null) {
            this.callback.onFailure(new Exception("Could not reload application. Ensure you have passed the correct instance of ReactApplication into UpdatesController.initialize()."));
            return Unit.INSTANCE;
        }
        procedureContext.processStateEvent(new UpdatesStateEvent.Restart());
        this.callback.onSuccess();
        BuildersKt__Builders_commonKt.launch$default(this.procedureScope, null, null, new RecreateReactContextProcedure$run$2(reactApplication, this, null), 3, null);
        procedureContext.resetStateAfterRestart();
        procedureContext.onComplete();
        return Unit.INSTANCE;
    }
}
