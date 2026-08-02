package sqip.internal.event;

import java.util.concurrent.ThreadFactory;
import sqip.internal.CardEntryActivityController;

/* loaded from: classes10.dex */
public final /* synthetic */ class EventModule$$ExternalSyntheticLambda0 implements ThreadFactory {
    public final /* synthetic */ int $r8$classId;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread eventsUploadExecutor$lambda$0;
        Thread extraWorkExecutor$lambda$0;
        switch (this.$r8$classId) {
            case 0:
                eventsUploadExecutor$lambda$0 = EventModule.eventsUploadExecutor$lambda$0(runnable);
                return eventsUploadExecutor$lambda$0;
            case 1:
                return new Thread(runnable, "ExoPlayer:AudioTrackReleaseThread");
            case 2:
                Thread thread = new Thread(runnable, "SwampGL-Engine");
                thread.setPriority(10);
                return thread;
            default:
                extraWorkExecutor$lambda$0 = CardEntryActivityController.extraWorkExecutor$lambda$0(runnable);
                return extraWorkExecutor$lambda$0;
        }
    }

    public /* synthetic */ EventModule$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }
}
