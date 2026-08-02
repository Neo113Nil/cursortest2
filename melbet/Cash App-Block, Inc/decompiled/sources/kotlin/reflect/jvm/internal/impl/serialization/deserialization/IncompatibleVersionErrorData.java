package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class IncompatibleVersionErrorData<T> {
    public final Object actualVersion;
    public final Object compilerVersion;
    public final Object expectedVersion;
    public final String filePath;
    public final Object languageVersion;

    public IncompatibleVersionErrorData(T t, T t2, T t3, T t4, String str) {
        str.getClass();
        this.actualVersion = t;
        this.compilerVersion = t2;
        this.languageVersion = t3;
        this.expectedVersion = t4;
        this.filePath = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IncompatibleVersionErrorData)) {
            return false;
        }
        IncompatibleVersionErrorData incompatibleVersionErrorData = (IncompatibleVersionErrorData) obj;
        return Intrinsics.areEqual(this.actualVersion, incompatibleVersionErrorData.actualVersion) && Intrinsics.areEqual(this.compilerVersion, incompatibleVersionErrorData.compilerVersion) && Intrinsics.areEqual(this.languageVersion, incompatibleVersionErrorData.languageVersion) && Intrinsics.areEqual(this.expectedVersion, incompatibleVersionErrorData.expectedVersion) && Intrinsics.areEqual(this.filePath, incompatibleVersionErrorData.filePath);
    }

    public int hashCode() {
        Object obj = this.actualVersion;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.compilerVersion;
        int hashCode2 = (hashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.languageVersion;
        int hashCode3 = (hashCode2 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        Object obj4 = this.expectedVersion;
        return this.filePath.hashCode() + ((hashCode3 + (obj4 != null ? obj4.hashCode() : 0)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IncompatibleVersionErrorData(actualVersion=");
        sb.append(this.actualVersion);
        sb.append(", compilerVersion=");
        sb.append(this.compilerVersion);
        sb.append(", languageVersion=");
        sb.append(this.languageVersion);
        sb.append(", expectedVersion=");
        sb.append(this.expectedVersion);
        sb.append(", filePath=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.filePath, ')');
    }
}
