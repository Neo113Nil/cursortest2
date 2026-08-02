package kotlin.reflect.jvm.internal.impl.km.jvm;

import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion;

/* loaded from: classes9.dex */
public final class JvmMetadataVersion implements Comparable<JvmMetadataVersion> {
    public final int major;
    public final int minor;
    public final int patch;
    public static final Companion Companion = new Companion(null);
    public static final JvmMetadataVersion LATEST_STABLE_SUPPORTED = new JvmMetadataVersion(MetadataVersion.INSTANCE.toArray());
    public static final JvmMetadataVersion HIGHEST_ALLOWED_TO_WRITE = new JvmMetadataVersion(MetadataVersion.INSTANCE_NEXT.toArray());

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public JvmMetadataVersion(int i, int i2, int i3) {
        this.major = i;
        this.minor = i2;
        this.patch = i3;
        if (i < 0) {
            a$$ExternalSyntheticBUOutline0.m$3("Major version should be not less than 0");
            throw null;
        }
        if (i2 < 0) {
            a$$ExternalSyntheticBUOutline0.m$3("Minor version should be not less than 0");
            throw null;
        }
        if (i3 >= 0) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$3("Patch version should be not less than 0");
        throw null;
    }

    @Override // java.lang.Comparable
    public int compareTo(JvmMetadataVersion jvmMetadataVersion) {
        jvmMetadataVersion.getClass();
        int compare = Intrinsics.compare(this.major, jvmMetadataVersion.major);
        if (compare != 0) {
            return compare;
        }
        int compare2 = Intrinsics.compare(this.minor, jvmMetadataVersion.minor);
        return compare2 != 0 ? compare2 : Intrinsics.compare(this.patch, jvmMetadataVersion.patch);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!JvmMetadataVersion.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        JvmMetadataVersion jvmMetadataVersion = (JvmMetadataVersion) obj;
        return this.major == jvmMetadataVersion.major && this.minor == jvmMetadataVersion.minor && this.patch == jvmMetadataVersion.patch;
    }

    public int hashCode() {
        return (((this.major * 31) + this.minor) * 31) + this.patch;
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

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public JvmMetadataVersion(int[] iArr) {
        this(iArr[0], iArr[1], iArr[2]);
        iArr.getClass();
    }
}
