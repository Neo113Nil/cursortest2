package com.google.firebase.components;

import java.lang.annotation.Annotation;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class Qualified<T> {
    private final Class<? extends Annotation> qualifier;
    private final Class<T> type;

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public @interface Unqualified {
    }

    public Qualified(Class<? extends Annotation> cls, Class<T> cls2) {
        this.qualifier = cls;
        this.type = cls2;
    }

    public static <T> Qualified<T> qualified(Class<? extends Annotation> cls, Class<T> cls2) {
        return new Qualified<>(cls, cls2);
    }

    public static <T> Qualified<T> unqualified(Class<T> cls) {
        return new Qualified<>(Unqualified.class, cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Qualified.class != obj.getClass()) {
            return false;
        }
        Qualified qualified = (Qualified) obj;
        if (this.type.equals(qualified.type)) {
            return this.qualifier.equals(qualified.qualifier);
        }
        return false;
    }

    public int hashCode() {
        return this.qualifier.hashCode() + (this.type.hashCode() * 31);
    }

    public String toString() {
        if (this.qualifier == Unqualified.class) {
            return this.type.getName();
        }
        return "@" + this.qualifier.getName() + " " + this.type.getName();
    }
}
