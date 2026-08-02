package com.stripe.android.core.networking;

import android.content.Context;
import com.stripe.hcaptcha.HCaptcha$$ExternalSyntheticLambda0;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* loaded from: classes8.dex */
public final class RealAnalyticsRequestV2Storage {
    public final Context context;
    public final CoroutineDispatcher dispatcher;
    public final Lazy sharedPrefs$delegate;

    public RealAnalyticsRequestV2Storage(Context context) {
        context.getClass();
        DefaultScheduler defaultScheduler = Dispatchers.Default;
        DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.INSTANCE;
        this.context = context;
        this.dispatcher = defaultIoScheduler;
        this.sharedPrefs$delegate = LazyKt.lazy(new HCaptcha$$ExternalSyntheticLambda0(this, 13));
    }
}
