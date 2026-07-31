package com.onesignal.common.modeling;

/* loaded from: classes.dex */
public final class j {
    private final i model;
    private final Object newValue;
    private final Object oldValue;
    private final String path;
    private final String property;

    public j(i model, String path, String property, Object obj, Object obj2) {
        kotlin.jvm.internal.i.e(model, "model");
        kotlin.jvm.internal.i.e(path, "path");
        kotlin.jvm.internal.i.e(property, "property");
        this.model = model;
        this.path = path;
        this.property = property;
        this.oldValue = obj;
        this.newValue = obj2;
    }

    public final i getModel() {
        return this.model;
    }

    public final Object getNewValue() {
        return this.newValue;
    }

    public final Object getOldValue() {
        return this.oldValue;
    }

    public final String getPath() {
        return this.path;
    }

    public final String getProperty() {
        return this.property;
    }
}
