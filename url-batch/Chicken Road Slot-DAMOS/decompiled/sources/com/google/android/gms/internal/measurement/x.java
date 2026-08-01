package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: b, reason: collision with root package name */
    public static final t f2958b = new t(0);

    /* renamed from: c, reason: collision with root package name */
    public static final x f2959c;

    /* renamed from: a, reason: collision with root package name */
    public final w f2960a;

    static {
        List list = Collections.EMPTY_LIST;
        f2959c = new x(new w());
    }

    public x(w wVar) {
        this.f2960a = wVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof x) && ((x) obj).f2960a.equals(this.f2960a);
    }

    public final int hashCode() {
        return ~this.f2960a.hashCode();
    }

    public final String toString() {
        return this.f2960a.toString();
    }
}
