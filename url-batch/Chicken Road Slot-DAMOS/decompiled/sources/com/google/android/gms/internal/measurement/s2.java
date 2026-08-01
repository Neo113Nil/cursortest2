package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class s2 extends RuntimeException {
    public s2() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final v1 a() {
        return new v1(getMessage());
    }
}
