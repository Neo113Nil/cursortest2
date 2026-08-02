package com.squareup.cash.support.screenshot;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.squareup.cash.support.screens.SupportScreens;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ScreenshotManager$ScreenshotState {
    public final boolean isTakingScreenshot;
    public final ScreenshotManager$ScreenshotResult lastScreenshotResult;
    public final SupportScreens.ScreenshotScreen.ScreenshotArgs screenshotArgs;
    public final boolean screenshotControlsVisible;
    public final List screenshotFilePaths;

    public ScreenshotManager$ScreenshotState(boolean z, SupportScreens.ScreenshotScreen.ScreenshotArgs screenshotArgs, ScreenshotManager$ScreenshotResult screenshotManager$ScreenshotResult, List list, boolean z2) {
        list.getClass();
        this.screenshotControlsVisible = z;
        this.screenshotArgs = screenshotArgs;
        this.lastScreenshotResult = screenshotManager$ScreenshotResult;
        this.screenshotFilePaths = list;
        this.isTakingScreenshot = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.util.List] */
    public static ScreenshotManager$ScreenshotState copy$default(ScreenshotManager$ScreenshotState screenshotManager$ScreenshotState, boolean z, SupportScreens.ScreenshotScreen.ScreenshotArgs screenshotArgs, ScreenshotManager$ScreenshotResult screenshotManager$ScreenshotResult, ArrayList arrayList, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = screenshotManager$ScreenshotState.screenshotControlsVisible;
        }
        boolean z3 = z;
        if ((i & 2) != 0) {
            screenshotArgs = screenshotManager$ScreenshotState.screenshotArgs;
        }
        SupportScreens.ScreenshotScreen.ScreenshotArgs screenshotArgs2 = screenshotArgs;
        if ((i & 4) != 0) {
            screenshotManager$ScreenshotResult = screenshotManager$ScreenshotState.lastScreenshotResult;
        }
        ScreenshotManager$ScreenshotResult screenshotManager$ScreenshotResult2 = screenshotManager$ScreenshotResult;
        ArrayList arrayList2 = arrayList;
        if ((i & 8) != 0) {
            arrayList2 = screenshotManager$ScreenshotState.screenshotFilePaths;
        }
        ArrayList arrayList3 = arrayList2;
        if ((i & 16) != 0) {
            z2 = screenshotManager$ScreenshotState.isTakingScreenshot;
        }
        screenshotManager$ScreenshotState.getClass();
        arrayList3.getClass();
        return new ScreenshotManager$ScreenshotState(z3, screenshotArgs2, screenshotManager$ScreenshotResult2, arrayList3, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScreenshotManager$ScreenshotState)) {
            return false;
        }
        ScreenshotManager$ScreenshotState screenshotManager$ScreenshotState = (ScreenshotManager$ScreenshotState) obj;
        return this.screenshotControlsVisible == screenshotManager$ScreenshotState.screenshotControlsVisible && Intrinsics.areEqual(this.screenshotArgs, screenshotManager$ScreenshotState.screenshotArgs) && Intrinsics.areEqual(this.lastScreenshotResult, screenshotManager$ScreenshotState.lastScreenshotResult) && Intrinsics.areEqual(this.screenshotFilePaths, screenshotManager$ScreenshotState.screenshotFilePaths) && this.isTakingScreenshot == screenshotManager$ScreenshotState.isTakingScreenshot;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.screenshotControlsVisible) * 31;
        SupportScreens.ScreenshotScreen.ScreenshotArgs screenshotArgs = this.screenshotArgs;
        int hashCode2 = (hashCode + (screenshotArgs == null ? 0 : screenshotArgs.hashCode())) * 31;
        ScreenshotManager$ScreenshotResult screenshotManager$ScreenshotResult = this.lastScreenshotResult;
        return Boolean.hashCode(this.isTakingScreenshot) + Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (screenshotManager$ScreenshotResult != null ? screenshotManager$ScreenshotResult.hashCode() : 0)) * 31, 31, this.screenshotFilePaths);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScreenshotState(screenshotControlsVisible=");
        sb.append(this.screenshotControlsVisible);
        sb.append(", screenshotArgs=");
        sb.append(this.screenshotArgs);
        sb.append(", lastScreenshotResult=");
        sb.append(this.lastScreenshotResult);
        sb.append(", screenshotFilePaths=");
        sb.append(this.screenshotFilePaths);
        sb.append(", isTakingScreenshot=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.isTakingScreenshot, ")");
    }
}
