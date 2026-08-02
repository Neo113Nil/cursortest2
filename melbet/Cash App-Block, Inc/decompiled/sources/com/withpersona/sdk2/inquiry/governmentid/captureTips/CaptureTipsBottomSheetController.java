package com.withpersona.sdk2.inquiry.governmentid.captureTips;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.squareup.workflow1.ui.BackPressHandlerKt;
import com.withpersona.sdk2.camera.CameraHelper$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.inquiry.governmentid.databinding.Pi2GovernmentidCaptureTipsBinding;

/* loaded from: classes9.dex */
public final class CaptureTipsBottomSheetController {
    public Pi2GovernmentidCaptureTipsBinding binding;
    public final ViewGroup contentView;
    public View currentAssetIllustrationView;
    public boolean isShowing;
    public boolean setup;

    public CaptureTipsBottomSheetController(FrameLayout frameLayout) {
        frameLayout.getClass();
        this.contentView = frameLayout;
    }

    public final void updateBackPressedHandler() {
        Pi2GovernmentidCaptureTipsBinding pi2GovernmentidCaptureTipsBinding = this.binding;
        if (pi2GovernmentidCaptureTipsBinding == null) {
            return;
        }
        boolean z = this.isShowing;
        FrameLayout frameLayout = pi2GovernmentidCaptureTipsBinding.rootView;
        if (z) {
            frameLayout.getClass();
            BackPressHandlerKt.setBackPressedHandler(frameLayout, new CameraHelper$$ExternalSyntheticLambda0(pi2GovernmentidCaptureTipsBinding, 7));
        } else {
            frameLayout.getClass();
            BackPressHandlerKt.setBackPressedHandler(frameLayout, null);
        }
    }
}
