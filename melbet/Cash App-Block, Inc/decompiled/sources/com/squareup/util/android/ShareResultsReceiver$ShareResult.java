package com.squareup.util.android;

import android.content.ComponentName;
import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class ShareResultsReceiver$ShareResult {
    public final ComponentName componentName;
    public final Intent intent;

    public ShareResultsReceiver$ShareResult(ComponentName componentName, Intent intent) {
        this.componentName = componentName;
        this.intent = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShareResultsReceiver$ShareResult)) {
            return false;
        }
        ShareResultsReceiver$ShareResult shareResultsReceiver$ShareResult = (ShareResultsReceiver$ShareResult) obj;
        return Intrinsics.areEqual(this.componentName, shareResultsReceiver$ShareResult.componentName) && this.intent.equals(shareResultsReceiver$ShareResult.intent);
    }

    public final int hashCode() {
        ComponentName componentName = this.componentName;
        return this.intent.hashCode() + ((componentName == null ? 0 : componentName.hashCode()) * 31);
    }

    public final String toString() {
        return "ShareResult(componentName=" + this.componentName + ", intent=" + this.intent + ")";
    }
}
