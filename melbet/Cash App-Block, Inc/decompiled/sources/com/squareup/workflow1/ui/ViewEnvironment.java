package com.squareup.workflow1.ui;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class ViewEnvironment {
    public final Map map;

    public ViewEnvironment(Map map) {
        map.getClass();
        this.map = map;
    }

    public final boolean equals(Object obj) {
        ViewEnvironment viewEnvironment = obj instanceof ViewEnvironment ? (ViewEnvironment) obj : null;
        if (viewEnvironment == null) {
            return false;
        }
        return Intrinsics.areEqual(viewEnvironment.map, this.map);
    }

    public final Object get(ViewEnvironmentKey viewEnvironmentKey) {
        viewEnvironmentKey.getClass();
        Object obj = this.map.get(viewEnvironmentKey);
        if (obj == null) {
            obj = null;
        }
        return obj == null ? viewEnvironmentKey.getDefault() : obj;
    }

    public final int hashCode() {
        return this.map.hashCode();
    }

    public final String toString() {
        return "ViewEnvironment(" + this.map + ')';
    }
}
