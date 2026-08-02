package kotlin.reflect.jvm.internal.impl.km;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes9.dex */
public final class KmVersion {
    public final int major;
    public final int minor;
    public final int patch;

    public KmVersion(int i, int i2, int i3) {
        this.major = i;
        this.minor = i2;
        this.patch = i3;
    }

    public final int component1() {
        return this.major;
    }

    public final int component2() {
        return this.minor;
    }

    public final int component3() {
        return this.patch;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KmVersion)) {
            return false;
        }
        KmVersion kmVersion = (KmVersion) obj;
        return this.major == kmVersion.major && this.minor == kmVersion.minor && this.patch == kmVersion.patch;
    }

    public int hashCode() {
        return Integer.hashCode(this.patch) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.minor, Integer.hashCode(this.major) * 31, 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.major);
        sb.append('.');
        sb.append(this.minor);
        sb.append('.');
        sb.append(this.patch);
        return sb.toString();
    }
}
