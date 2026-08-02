package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class MetadataVersion extends BinaryVersion {
    public static final Companion Companion = new Companion(null);
    public static final MetadataVersion INSTANCE;
    public static final MetadataVersion INSTANCE_NEXT;
    public static final MetadataVersion INVALID_VERSION;
    public final boolean isStrictSemantics;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        MetadataVersion metadataVersion = new MetadataVersion(2, 3, 0);
        INSTANCE = metadataVersion;
        INSTANCE_NEXT = metadataVersion.next();
        INVALID_VERSION = new MetadataVersion(new int[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetadataVersion(int[] iArr, boolean z) {
        super(Arrays.copyOf(iArr, iArr.length));
        iArr.getClass();
        this.isStrictSemantics = z;
    }

    public final boolean isCompatible(MetadataVersion metadataVersion) {
        metadataVersion.getClass();
        MetadataVersion lastSupportedVersionWithThisLanguageVersion = metadataVersion.lastSupportedVersionWithThisLanguageVersion(this.isStrictSemantics);
        if ((getMajor() == 1 && getMinor() == 0) || getMajor() == 0) {
            return false;
        }
        return !newerThan(lastSupportedVersionWithThisLanguageVersion);
    }

    public boolean isCompatibleWithCurrentCompilerVersion() {
        MetadataVersion metadataVersion = this.isStrictSemantics ? INSTANCE : INSTANCE_NEXT;
        if ((getMajor() == 1 && getMinor() == 0) || getMajor() == 0) {
            return false;
        }
        return !newerThan(metadataVersion);
    }

    public final boolean isStrictSemantics() {
        return this.isStrictSemantics;
    }

    public final MetadataVersion lastSupportedVersionWithThisLanguageVersion(boolean z) {
        MetadataVersion metadataVersion = z ? INSTANCE : INSTANCE_NEXT;
        return metadataVersion.newerThan(this) ? metadataVersion : this;
    }

    public final boolean newerThan(MetadataVersion metadataVersion) {
        if (getMajor() > metadataVersion.getMajor()) {
            return true;
        }
        return getMajor() >= metadataVersion.getMajor() && getMinor() > metadataVersion.getMinor();
    }

    public final MetadataVersion next() {
        return (getMajor() == 1 && getMinor() == 9) ? new MetadataVersion(2, 0, 0) : new MetadataVersion(getMajor(), getMinor() + 1, 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MetadataVersion(int... iArr) {
        this(iArr, false);
        iArr.getClass();
    }
}
