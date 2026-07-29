package com.mopub.mobileads.factories;

import android.content.Context;
import com.mopub.common.AdReport;
import com.mopub.common.VisibleForTesting;
import com.mopub.mraid.MraidController;
import com.mopub.mraid.PlacementType;

/* loaded from: classes2.dex */
public class MraidControllerFactory {
    protected static MraidControllerFactory instance = new MraidControllerFactory();

    @VisibleForTesting
    public static void setInstance(MraidControllerFactory mraidControllerFactory) {
        instance = mraidControllerFactory;
    }

    public static MraidController create(Context context, AdReport adReport, PlacementType placementType) {
        return instance.internalCreate(context, adReport, placementType);
    }

    protected MraidController internalCreate(Context context, AdReport adReport, PlacementType placementType) {
        return new MraidController(context, adReport, placementType);
    }
}
