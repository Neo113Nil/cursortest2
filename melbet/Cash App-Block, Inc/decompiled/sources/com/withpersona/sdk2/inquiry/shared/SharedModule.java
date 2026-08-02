package com.withpersona.sdk2.inquiry.shared;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.compat.quirk.CaptureIntentPreviewQuirk;
import androidx.camera.camera2.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk;
import androidx.camera.camera2.compat.workaround.TemplateParamsOverride;
import androidx.camera.camera2.pipe.RequestTemplate;
import androidx.camera.core.impl.Quirks;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsJVMKt;

/* loaded from: classes9.dex */
public final class SharedModule implements TemplateParamsOverride {
    public final boolean controlNavigationBar;
    public final boolean controlStatusBar;

    public SharedModule(Quirks quirks) {
        boolean z;
        quirks.getClass();
        Iterator it = quirks.getAll(CaptureIntentPreviewQuirk.class).iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            } else if (((CaptureIntentPreviewQuirk) it.next()).workaroundByCaptureIntentPreview()) {
                z = true;
                break;
            }
        }
        this.controlNavigationBar = z;
        this.controlStatusBar = quirks.contains(ImageCaptureFailedForVideoSnapshotQuirk.class);
    }

    @Override // androidx.camera.camera2.compat.workaround.TemplateParamsOverride
    /* renamed from: getOverrideParams-xlOpshk */
    public Map mo25getOverrideParamsxlOpshk(RequestTemplate requestTemplate) {
        if (requestTemplate != null && requestTemplate.value == 3 && this.controlNavigationBar) {
            return MapsKt__MapsJVMKt.mapOf(new Pair(CaptureRequest.CONTROL_CAPTURE_INTENT, 1));
        }
        if (requestTemplate != null && requestTemplate.value == 4 && this.controlStatusBar) {
            return MapsKt__MapsJVMKt.mapOf(new Pair(CaptureRequest.CONTROL_CAPTURE_INTENT, 2));
        }
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        return emptyMap;
    }

    public /* synthetic */ SharedModule(boolean z, boolean z2) {
        this.controlNavigationBar = z;
        this.controlStatusBar = z2;
    }
}
