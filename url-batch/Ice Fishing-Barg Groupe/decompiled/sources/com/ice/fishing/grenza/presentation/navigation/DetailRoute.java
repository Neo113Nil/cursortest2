package com.ice.fishing.grenza.presentation.navigation;

import defpackage.h42;
import defpackage.o0;
import defpackage.th0;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
@h42
/* loaded from: classes.dex */
public final class DetailRoute {
    public static final Companion Companion = new Companion();
    public final int PxuCJdSBwIXG;

    /* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
    public static final class Companion {
        public final KSerializer serializer() {
            return DetailRoute$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DetailRoute(int i, int i2) {
        if (1 == (i & 1)) {
            this.PxuCJdSBwIXG = i2;
        } else {
            th0.ryVscX7ZL4Ux(i, 1, DetailRoute$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DetailRoute) && this.PxuCJdSBwIXG == ((DetailRoute) obj).PxuCJdSBwIXG;
    }

    public final int hashCode() {
        return Integer.hashCode(this.PxuCJdSBwIXG);
    }

    public final String toString() {
        return o0.OPXfSBeufaJ8(this.PxuCJdSBwIXG, "DetailRoute(id=", ")");
    }

    public DetailRoute(int i) {
        this.PxuCJdSBwIXG = i;
    }
}
