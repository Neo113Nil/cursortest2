package com.onesignal.common.modeling;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class j {
    private final i model;
    private final Object newValue;
    private final Object oldValue;
    private final String path;
    private final String property;

    public j(i iVar, String str, String str2, Object obj, Object obj2) {
        iVar.getClass();
        str.getClass();
        str2.getClass();
        this.model = iVar;
        this.path = str;
        this.property = str2;
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
