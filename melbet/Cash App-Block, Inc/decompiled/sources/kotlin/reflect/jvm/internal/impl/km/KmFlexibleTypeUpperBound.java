package kotlin.reflect.jvm.internal.impl.km;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class KmFlexibleTypeUpperBound {
    public static final Companion Companion = new Companion(null);

    /* renamed from: type, reason: collision with root package name */
    public final KmType f1527type;
    public final String typeFlexibilityId;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public KmFlexibleTypeUpperBound(KmType kmType, String str) {
        kmType.getClass();
        this.f1527type = kmType;
        this.typeFlexibilityId = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KmFlexibleTypeUpperBound)) {
            return false;
        }
        KmFlexibleTypeUpperBound kmFlexibleTypeUpperBound = (KmFlexibleTypeUpperBound) obj;
        return Intrinsics.areEqual(this.f1527type, kmFlexibleTypeUpperBound.f1527type) && Intrinsics.areEqual(this.typeFlexibilityId, kmFlexibleTypeUpperBound.typeFlexibilityId);
    }

    public final KmType getType() {
        return this.f1527type;
    }

    public final String getTypeFlexibilityId() {
        return this.typeFlexibilityId;
    }

    public int hashCode() {
        int hashCode = this.f1527type.hashCode() * 31;
        String str = this.typeFlexibilityId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("KmFlexibleTypeUpperBound(type=");
        sb.append(this.f1527type);
        sb.append(", typeFlexibilityId=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.typeFlexibilityId, ')');
    }
}
