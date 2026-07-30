package com.google.firebase.components;

import defpackage.in1;
import defpackage.q40;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class Dependency {
    private final Qualified<?> anInterface;
    private final int injection;
    private final int type;

    private Dependency(Qualified<?> qualified, int i, int i2) {
        this.anInterface = (Qualified) Preconditions.checkNotNull(qualified, "Null dependency anInterface.");
        this.type = i;
        this.injection = i2;
    }

    public static Dependency deferred(Class<?> cls) {
        return new Dependency(cls, 0, 2);
    }

    private static String describeInjection(int i) {
        if (i == 0) {
            return "direct";
        }
        if (i == 1) {
            return "provider";
        }
        if (i == 2) {
            return "deferred";
        }
        throw new AssertionError(in1.k(i, "Unsupported injection: "));
    }

    @Deprecated
    public static Dependency optional(Class<?> cls) {
        return new Dependency(cls, 0, 0);
    }

    public static Dependency optionalProvider(Class<?> cls) {
        return new Dependency(cls, 0, 1);
    }

    public static Dependency required(Class<?> cls) {
        return new Dependency(cls, 1, 0);
    }

    public static Dependency requiredProvider(Class<?> cls) {
        return new Dependency(cls, 1, 1);
    }

    public static Dependency setOf(Class<?> cls) {
        return new Dependency(cls, 2, 0);
    }

    public static Dependency setOfProvider(Class<?> cls) {
        return new Dependency(cls, 2, 1);
    }

    public boolean equals(Object obj) {
        if (obj instanceof Dependency) {
            Dependency dependency = (Dependency) obj;
            if (this.anInterface.equals(dependency.anInterface) && this.type == dependency.type && this.injection == dependency.injection) {
                return true;
            }
        }
        return false;
    }

    public Qualified<?> getInterface() {
        return this.anInterface;
    }

    public int hashCode() {
        return this.injection ^ ((((this.anInterface.hashCode() ^ 1000003) * 1000003) ^ this.type) * 1000003);
    }

    public boolean isDeferred() {
        return this.injection == 2;
    }

    public boolean isDirectInjection() {
        return this.injection == 0;
    }

    public boolean isRequired() {
        return this.type == 1;
    }

    public boolean isSet() {
        return this.type == 2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.anInterface);
        sb.append(", type=");
        int i = this.type;
        sb.append(i == 1 ? "required" : i == 0 ? "optional" : "set");
        sb.append(", injection=");
        return q40.p(sb, describeInjection(this.injection), "}");
    }

    public static Dependency requiredProvider(Qualified<?> qualified) {
        return new Dependency(qualified, 1, 1);
    }

    public static Dependency deferred(Qualified<?> qualified) {
        return new Dependency(qualified, 0, 2);
    }

    public static Dependency optionalProvider(Qualified<?> qualified) {
        return new Dependency(qualified, 0, 1);
    }

    public static Dependency required(Qualified<?> qualified) {
        return new Dependency(qualified, 1, 0);
    }

    public static Dependency setOf(Qualified<?> qualified) {
        return new Dependency(qualified, 2, 0);
    }

    public static Dependency setOfProvider(Qualified<?> qualified) {
        return new Dependency(qualified, 2, 1);
    }

    private Dependency(Class<?> cls, int i, int i2) {
        this((Qualified<?>) Qualified.unqualified(cls), i, i2);
    }
}
