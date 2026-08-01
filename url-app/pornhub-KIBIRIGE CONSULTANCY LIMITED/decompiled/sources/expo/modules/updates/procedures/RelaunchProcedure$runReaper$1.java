package expo.modules.updates.procedures;

import expo.modules.updates.UpdatesConfiguration;
import expo.modules.updates.db.DatabaseHolder;
import expo.modules.updates.db.Reaper;
import expo.modules.updates.db.UpdatesDatabase;
import expo.modules.updates.db.entity.UpdateEntity;
import expo.modules.updates.launcher.Launcher;
import expo.modules.updates.logging.UpdatesErrorCode;
import expo.modules.updates.logging.UpdatesLogger;
import expo.modules.updates.selectionpolicy.SelectionPolicy;
import java.io.File;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RelaunchProcedure.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.updates.procedures.RelaunchProcedure$runReaper$1", f = "RelaunchProcedure.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class RelaunchProcedure$runReaper$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ RelaunchProcedure this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RelaunchProcedure$runReaper$1(RelaunchProcedure relaunchProcedure, Continuation<? super RelaunchProcedure$runReaper$1> continuation) {
        super(2, continuation);
        this.this$0 = relaunchProcedure;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RelaunchProcedure$runReaper$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RelaunchProcedure$runReaper$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        UpdatesLogger updatesLogger;
        UpdatesConfiguration updatesConfiguration;
        DatabaseHolder databaseHolder;
        File file;
        Function0 function0;
        SelectionPolicy selectionPolicy;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                updatesConfiguration = this.this$0.updatesConfiguration;
                databaseHolder = this.this$0.databaseHolder;
                UpdatesDatabase database = databaseHolder.getDatabase();
                file = this.this$0.updatesDirectory;
                function0 = this.this$0.getCurrentLauncher;
                UpdateEntity launchedUpdate = ((Launcher) function0.invoke()).getLaunchedUpdate();
                selectionPolicy = this.this$0.selectionPolicy;
                Reaper.reapUnusedUpdates(updatesConfiguration, database, file, launchedUpdate, selectionPolicy);
            } catch (Exception e) {
                updatesLogger = this.this$0.logger;
                updatesLogger.error("Could not run Reaper.", e, UpdatesErrorCode.Unknown);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
