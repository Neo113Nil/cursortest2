package coil.request;

import androidx.lifecycle.DefaultLifecycleObserver;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: RequestDelegate.kt */
/* loaded from: classes5.dex */
public abstract class RequestDelegate implements DefaultLifecycleObserver {
    public /* synthetic */ RequestDelegate(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public void assertActive() {
    }

    public void complete() {
    }

    public abstract void start();

    private RequestDelegate() {
    }
}
