package com.withpersona.sdk2.inquiry.governmentid.live_hint;

import android.content.Context;
import com.withpersona.sdk2.camera.GovernmentIdFeed;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorker_Factory;

/* loaded from: classes9.dex */
public final class GovernmentIdHintWorker_Factory_Impl {
    public final DeviceFeatureRequestWorker_Factory delegateFactory;

    public GovernmentIdHintWorker_Factory_Impl(DeviceFeatureRequestWorker_Factory deviceFeatureRequestWorker_Factory) {
        this.delegateFactory = deviceFeatureRequestWorker_Factory;
    }

    public final GovernmentIdHintWorker create(IdConfig.Side side) {
        DeviceFeatureRequestWorker_Factory deviceFeatureRequestWorker_Factory = this.delegateFactory;
        return new GovernmentIdHintWorker((Context) deviceFeatureRequestWorker_Factory.resolvableApiLauncherProvider.get(), (GovernmentIdFeed) deviceFeatureRequestWorker_Factory.contextProvider.get(), side);
    }
}
