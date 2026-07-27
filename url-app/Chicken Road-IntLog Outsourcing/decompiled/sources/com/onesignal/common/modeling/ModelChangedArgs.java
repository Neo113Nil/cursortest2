package com.onesignal.common.modeling;

import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class ModelChangedArgs {
    private final Model model;
    private final Object newValue;
    private final Object oldValue;
    private final String path;
    private final String property;

    public ModelChangedArgs(Model model, String path, String property, Object obj, Object obj2) {
        i.e(model, "model");
        i.e(path, "path");
        i.e(property, "property");
        this.model = model;
        this.path = path;
        this.property = property;
        this.oldValue = obj;
        this.newValue = obj2;
    }

    public final Model getModel() {
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
