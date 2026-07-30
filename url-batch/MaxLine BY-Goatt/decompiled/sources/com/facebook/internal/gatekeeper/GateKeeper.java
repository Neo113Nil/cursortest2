package com.facebook.internal.gatekeeper;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class GateKeeper {
    private final String name;
    private final boolean value;

    public GateKeeper(String str, boolean z) {
        str.getClass();
        this.name = str;
        this.value = z;
    }

    public static /* synthetic */ GateKeeper copy$default(GateKeeper gateKeeper, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = gateKeeper.name;
        }
        if ((i & 2) != 0) {
            z = gateKeeper.value;
        }
        return gateKeeper.copy(str, z);
    }

    public final String component1() {
        return this.name;
    }

    public final boolean component2() {
        return this.value;
    }

    public final GateKeeper copy(String str, boolean z) {
        str.getClass();
        return new GateKeeper(str, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GateKeeper)) {
            return false;
        }
        GateKeeper gateKeeper = (GateKeeper) obj;
        return Intrinsics.b(this.name, gateKeeper.name) && this.value == gateKeeper.value;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean getValue() {
        return this.value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.name.hashCode() * 31;
        boolean z = this.value;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        return "GateKeeper(name=" + this.name + ", value=" + this.value + ')';
    }
}
