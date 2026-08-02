package com.squareup.cash.support.screenshot;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.room.Room;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class ScreenshotView$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ ScreenshotView f$0;

    public /* synthetic */ ScreenshotView$$ExternalSyntheticLambda0(ScreenshotView screenshotView) {
        this.f$0 = screenshotView;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (this.$r8$classId) {
            case 0:
                int intValue = num.intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    ScreenshotView screenshotView = this.f$0;
                    Room.ScreenshotOverlay(screenshotView, screenshotView.screenshotManager, screenshotView.screenshotEventReceiver, screenshotView.toaster, null, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                num.getClass();
                this.f$0.Content(composer, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ ScreenshotView$$ExternalSyntheticLambda0(ScreenshotView screenshotView, int i) {
        this.f$0 = screenshotView;
    }
}
