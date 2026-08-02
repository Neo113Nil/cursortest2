package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class PreReleaseInfo {
    public static final Companion Companion = new Companion(null);
    public static final PreReleaseInfo DEFAULT_VISIBLE = new PreReleaseInfo(false, null, 2, null);
    public final boolean isInvisible;
    public final List poisoningFeatures;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final PreReleaseInfo getDEFAULT_VISIBLE() {
            return PreReleaseInfo.DEFAULT_VISIBLE;
        }
    }

    public PreReleaseInfo(boolean z, List<String> list) {
        list.getClass();
        this.isInvisible = z;
        this.poisoningFeatures = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreReleaseInfo)) {
            return false;
        }
        PreReleaseInfo preReleaseInfo = (PreReleaseInfo) obj;
        return this.isInvisible == preReleaseInfo.isInvisible && Intrinsics.areEqual(this.poisoningFeatures, preReleaseInfo.poisoningFeatures);
    }

    public int hashCode() {
        return this.poisoningFeatures.hashCode() + (Boolean.hashCode(this.isInvisible) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PreReleaseInfo(isInvisible=");
        sb.append(this.isInvisible);
        sb.append(", poisoningFeatures=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.poisoningFeatures, ')');
    }

    public PreReleaseInfo(boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? EmptyList.INSTANCE : list);
    }
}
