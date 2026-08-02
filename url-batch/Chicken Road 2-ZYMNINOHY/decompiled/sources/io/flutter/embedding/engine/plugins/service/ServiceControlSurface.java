package io.flutter.embedding.engine.plugins.service;

import android.app.Service;
import androidx.lifecycle.AbstractC0231j;

/* loaded from: classes.dex */
public interface ServiceControlSurface {
    void attachToService(Service service, AbstractC0231j abstractC0231j, boolean z);

    void detachFromService();

    void onMoveToBackground();

    void onMoveToForeground();
}
