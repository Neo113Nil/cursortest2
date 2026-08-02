package com.squareup.cash.support.screenshot;

import android.graphics.Bitmap;
import android.view.PixelCopy;
import com.squareup.cash.storage.RealSandboxer$$ExternalSyntheticLambda0;
import com.squareup.cash.support.screenshot.ScreenshotManager$ScreenshotResult;

/* loaded from: classes7.dex */
public final /* synthetic */ class RealScreenshotManager$$ExternalSyntheticLambda2 implements PixelCopy.OnPixelCopyFinishedListener {
    public final /* synthetic */ RealSandboxer$$ExternalSyntheticLambda0 f$0;
    public final /* synthetic */ Bitmap f$1;

    public /* synthetic */ RealScreenshotManager$$ExternalSyntheticLambda2(RealSandboxer$$ExternalSyntheticLambda0 realSandboxer$$ExternalSyntheticLambda0, Bitmap bitmap) {
        this.f$0 = realSandboxer$$ExternalSyntheticLambda0;
        this.f$1 = bitmap;
    }

    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
    public final void onPixelCopyFinished(int i) {
        RealSandboxer$$ExternalSyntheticLambda0 realSandboxer$$ExternalSyntheticLambda0 = this.f$0;
        if (i == 0) {
            realSandboxer$$ExternalSyntheticLambda0.invoke(new ScreenshotManager$ScreenshotResult.Success(this.f$1));
        } else if (i == 3 || i == 4) {
            realSandboxer$$ExternalSyntheticLambda0.invoke(ScreenshotManager$ScreenshotResult.Prohibited.INSTANCE);
        } else {
            realSandboxer$$ExternalSyntheticLambda0.invoke(ScreenshotManager$ScreenshotResult.Failed.INSTANCE);
        }
    }
}
