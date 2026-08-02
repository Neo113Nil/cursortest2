package com.startapp.flutter.sdk;

import io.flutter.plugin.common.MethodChannel;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
class StartAppMethodResultWrapper {
    private final AtomicReference<MethodChannel.Result> ref;

    public StartAppMethodResultWrapper(MethodChannel.Result result) {
        this.ref = new AtomicReference<>(result);
    }

    public void error(String str, String str2) {
        MethodChannel.Result andSet = this.ref.getAndSet(null);
        if (andSet != null) {
            andSet.error(str, str2, null);
        }
    }

    public void success(Object obj) {
        MethodChannel.Result andSet = this.ref.getAndSet(null);
        if (andSet != null) {
            andSet.success(obj);
        }
    }
}
