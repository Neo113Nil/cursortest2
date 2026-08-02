package com.squareup.cash.support.screenshot;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.storage.Storage;
import com.squareup.cash.support.screens.SupportScreens;
import com.squareup.cash.wallet.views.CardTransitionKt$sceneCache$4$1$1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import kotlin.collections.EmptyList;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlowImpl;

/* loaded from: classes.dex */
public final class RealScreenshotManager {
    public static final ScreenshotManager$ScreenshotState INIT_STATE = new ScreenshotManager$ScreenshotState(false, null, null, EmptyList.INSTANCE, false);
    public final CoroutineContext ioDispatcher;
    public final CoroutineScope scope;
    public final Storage storage;
    public String sessionId = Boxes$$ExternalSyntheticOutline1.m();
    public final ArrayList jobs = new ArrayList();
    public final StateFlowImpl screenshotState = FlowKt.MutableStateFlow(INIT_STATE);

    public RealScreenshotManager(Storage storage, CoroutineScope coroutineScope, CoroutineContext coroutineContext) {
        this.storage = storage;
        this.scope = coroutineScope;
        this.ioDispatcher = coroutineContext;
    }

    public final void runWithIoCoroutineScope(Function0 function0) {
        this.jobs.add(JobKt.launch$default(this.scope, this.ioDispatcher, null, new CardTransitionKt$sceneCache$4$1$1(function0, null, 4), 2));
    }

    public final void showScreenshotControls(SupportScreens.ScreenshotScreen.ScreenshotArgs screenshotArgs) {
        StateFlowImpl stateFlowImpl = this.screenshotState;
        ScreenshotManager$ScreenshotState screenshotManager$ScreenshotState = (ScreenshotManager$ScreenshotState) stateFlowImpl.getValue();
        if (screenshotArgs == null) {
            screenshotArgs = ((ScreenshotManager$ScreenshotState) stateFlowImpl.getValue()).screenshotArgs;
        }
        ScreenshotManager$ScreenshotState copy$default = ScreenshotManager$ScreenshotState.copy$default(screenshotManager$ScreenshotState, true, screenshotArgs, null, null, false, 28);
        stateFlowImpl.getClass();
        stateFlowImpl.updateState(null, copy$default);
    }

    public final void startScreenshotSession() {
        this.screenshotState.setValue(INIT_STATE);
        String uuid = UUID.randomUUID().toString();
        uuid.getClass();
        this.sessionId = uuid;
        ArrayList arrayList = this.jobs;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Job) it.next()).cancel(null);
        }
        arrayList.clear();
    }
}
