package io.appmetrica.analytics.flutter.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaLibraryAdapter;
import io.appmetrica.analytics.flutter.pigeon.Pigeon;

/* loaded from: classes.dex */
public class AppMetricaLibraryAdapterImpl implements Pigeon.AppMetricaLibraryAdapterPigeon {
    private final Context context;

    public AppMetricaLibraryAdapterImpl(Context context) {
        this.context = context;
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaLibraryAdapterPigeon
    public void subscribeForAutoCollectedData(String str) {
        AppMetricaLibraryAdapter.subscribeForAutoCollectedData(this.context, str);
    }
}
