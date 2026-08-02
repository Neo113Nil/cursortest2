package kotlin.reflect.jvm.internal.impl.km;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class KmVersionRequirement {
    public Integer errorCode;
    public KmVersionRequirementVersionKind kind;
    public KmVersionRequirementLevel level;
    public String message;
    public KmVersion version;

    public final Integer getErrorCode() {
        return this.errorCode;
    }

    public final KmVersionRequirementVersionKind getKind() {
        KmVersionRequirementVersionKind kmVersionRequirementVersionKind = this.kind;
        if (kmVersionRequirementVersionKind != null) {
            return kmVersionRequirementVersionKind;
        }
        Intrinsics.throwUninitializedPropertyAccessException("kind");
        throw null;
    }

    public final KmVersionRequirementLevel getLevel() {
        KmVersionRequirementLevel kmVersionRequirementLevel = this.level;
        if (kmVersionRequirementLevel != null) {
            return kmVersionRequirementLevel;
        }
        Intrinsics.throwUninitializedPropertyAccessException("level");
        throw null;
    }

    public final String getMessage() {
        return this.message;
    }

    public final KmVersion getVersion() {
        KmVersion kmVersion = this.version;
        if (kmVersion != null) {
            return kmVersion;
        }
        Intrinsics.throwUninitializedPropertyAccessException("version");
        throw null;
    }

    public final void setErrorCode(Integer num) {
        this.errorCode = num;
    }

    public final void setKind(KmVersionRequirementVersionKind kmVersionRequirementVersionKind) {
        kmVersionRequirementVersionKind.getClass();
        this.kind = kmVersionRequirementVersionKind;
    }

    public final void setLevel(KmVersionRequirementLevel kmVersionRequirementLevel) {
        kmVersionRequirementLevel.getClass();
        this.level = kmVersionRequirementLevel;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setVersion(KmVersion kmVersion) {
        kmVersion.getClass();
        this.version = kmVersion;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("KmVersionRequirement(kind=");
        sb.append(getKind());
        sb.append(", level=");
        sb.append(getLevel());
        sb.append(", version=");
        sb.append(getVersion());
        sb.append(", errorCode=");
        sb.append(this.errorCode);
        sb.append(", message=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.message, ')');
    }
}
