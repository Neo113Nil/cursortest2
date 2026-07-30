package com.google.android.gms.fitness.service;

import androidx.annotation.NonNull;
import com.google.android.gms.fitness.data.DataPoint;
import java.util.List;

/* loaded from: classes3.dex */
public interface SensorEventDispatcher {
    void publish(@NonNull DataPoint dataPoint);

    void publish(@NonNull List<DataPoint> list);
}
