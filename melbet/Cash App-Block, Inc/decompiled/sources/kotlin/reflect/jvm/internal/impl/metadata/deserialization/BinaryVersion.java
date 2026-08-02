package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysJvmKt$asList$3;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public abstract class BinaryVersion {
    public static final Companion Companion = new Companion(null);
    public final int major;
    public final int minor;
    public final int[] numbers;
    public final int patch;
    public final List rest;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public BinaryVersion(int... iArr) {
        List list;
        iArr.getClass();
        this.numbers = iArr;
        int i = 0;
        Integer orNull = ArraysKt___ArraysKt.getOrNull(0, iArr);
        this.major = orNull != null ? orNull.intValue() : -1;
        Integer orNull2 = ArraysKt___ArraysKt.getOrNull(1, iArr);
        this.minor = orNull2 != null ? orNull2.intValue() : -1;
        Integer orNull3 = ArraysKt___ArraysKt.getOrNull(2, iArr);
        this.patch = orNull3 != null ? orNull3.intValue() : -1;
        if (iArr.length <= 3) {
            list = EmptyList.INSTANCE;
        } else {
            if (iArr.length > 1024) {
                a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder("BinaryVersion with length more than 1024 are not supported. Provided length "), iArr.length, '.'));
                throw null;
            }
            list = CollectionsKt.toList(new ArraysKt___ArraysJvmKt$asList$3(iArr, i).subList(3, iArr.length));
        }
        this.rest = list;
    }

    public boolean equals(Object obj) {
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        BinaryVersion binaryVersion = (BinaryVersion) obj;
        return this.major == binaryVersion.major && this.minor == binaryVersion.minor && this.patch == binaryVersion.patch && Intrinsics.areEqual(this.rest, binaryVersion.rest);
    }

    public final int getMajor() {
        return this.major;
    }

    public final int getMinor() {
        return this.minor;
    }

    public int hashCode() {
        int i = this.major;
        int i2 = (i * 31) + this.minor + i;
        int i3 = (i2 * 31) + this.patch + i2;
        return this.rest.hashCode() + (i3 * 31) + i3;
    }

    public final boolean isAtLeast(int i, int i2, int i3) {
        int i4 = this.major;
        if (i4 > i) {
            return true;
        }
        if (i4 < i) {
            return false;
        }
        int i5 = this.minor;
        if (i5 > i2) {
            return true;
        }
        return i5 >= i2 && this.patch >= i3;
    }

    public final boolean isAtMost(int i, int i2, int i3) {
        int i4 = this.major;
        if (i4 < i) {
            return true;
        }
        if (i4 > i) {
            return false;
        }
        int i5 = this.minor;
        if (i5 < i2) {
            return true;
        }
        return i5 <= i2 && this.patch <= i3;
    }

    public final int[] toArray() {
        return this.numbers;
    }

    public String toString() {
        int[] array2 = toArray();
        ArrayList arrayList = new ArrayList();
        for (int i : array2) {
            if (i == -1) {
                break;
            }
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList.isEmpty() ? "unknown" : CollectionsKt.joinToString$default(arrayList, ".", null, null, 0, null, null, 62);
    }

    public final boolean isAtLeast(BinaryVersion binaryVersion) {
        binaryVersion.getClass();
        return isAtLeast(binaryVersion.major, binaryVersion.minor, binaryVersion.patch);
    }
}
