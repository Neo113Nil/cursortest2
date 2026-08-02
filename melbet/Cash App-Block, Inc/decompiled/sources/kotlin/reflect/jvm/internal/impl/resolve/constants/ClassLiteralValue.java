package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.ClassId;

/* loaded from: classes9.dex */
public final class ClassLiteralValue {
    public final int arrayNestedness;
    public final ClassId classId;

    public ClassLiteralValue(ClassId classId, int i) {
        classId.getClass();
        this.classId = classId;
        this.arrayNestedness = i;
    }

    public final ClassId component1() {
        return this.classId;
    }

    public final int component2() {
        return this.arrayNestedness;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassLiteralValue)) {
            return false;
        }
        ClassLiteralValue classLiteralValue = (ClassLiteralValue) obj;
        return Intrinsics.areEqual(this.classId, classLiteralValue.classId) && this.arrayNestedness == classLiteralValue.arrayNestedness;
    }

    public final int getArrayNestedness() {
        return this.arrayNestedness;
    }

    public final ClassId getClassId() {
        return this.classId;
    }

    public int hashCode() {
        return Integer.hashCode(this.arrayNestedness) + (this.classId.hashCode() * 31);
    }

    public String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (true) {
            i = this.arrayNestedness;
            if (i2 >= i) {
                break;
            }
            sb.append("kotlin/Array<");
            i2++;
        }
        sb.append(this.classId);
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(">");
        }
        return sb.toString();
    }
}
