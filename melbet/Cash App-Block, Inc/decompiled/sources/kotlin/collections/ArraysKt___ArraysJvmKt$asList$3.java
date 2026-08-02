package kotlin.collections;

import java.util.RandomAccess;
import kotlin.ULong;

/* loaded from: classes9.dex */
public final class ArraysKt___ArraysJvmKt$asList$3 extends AbstractList implements RandomAccess {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $this_asList;

    public /* synthetic */ ArraysKt___ArraysJvmKt$asList$3(Object obj, int i) {
        this.$r8$classId = i;
        this.$this_asList = obj;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.$this_asList;
        switch (i) {
            case 0:
                if (!(obj instanceof Integer)) {
                    return false;
                }
                return ArraysKt___ArraysKt.contains((int[]) obj2, ((Number) obj).intValue());
            default:
                if (!(obj instanceof ULong)) {
                    return false;
                }
                return ArraysKt___ArraysKt.contains((long[]) obj2, ((ULong) obj).data);
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.$r8$classId;
        Object obj = this.$this_asList;
        switch (i2) {
            case 0:
                return Integer.valueOf(((int[]) obj)[i]);
            default:
                return new ULong(((long[]) obj)[i]);
        }
    }

    @Override // kotlin.collections.AbstractCollection
    public final int getSize() {
        int i = this.$r8$classId;
        Object obj = this.$this_asList;
        switch (i) {
            case 0:
                return ((int[]) obj).length;
            default:
                return ((long[]) obj).length;
        }
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i = this.$r8$classId;
        int i2 = 0;
        Object obj2 = this.$this_asList;
        switch (i) {
            case 0:
                if (obj instanceof Integer) {
                    int intValue = ((Number) obj).intValue();
                    int[] iArr = (int[]) obj2;
                    iArr.getClass();
                    int length = iArr.length;
                    while (i2 < length) {
                        if (intValue == iArr[i2]) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                    break;
                }
                break;
            default:
                if (obj instanceof ULong) {
                    long j = ((ULong) obj).data;
                    long[] jArr = (long[]) obj2;
                    int length2 = jArr.length;
                    while (i2 < length2) {
                        if (j == jArr[i2]) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                    break;
                }
                break;
        }
        return i2;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        int i = this.$r8$classId;
        Object obj = this.$this_asList;
        switch (i) {
            case 0:
                if (((int[]) obj).length == 0) {
                    break;
                }
                break;
            default:
                if (((long[]) obj).length == 0) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.$this_asList;
        switch (i) {
            case 0:
                if (obj instanceof Integer) {
                    int intValue = ((Number) obj).intValue();
                    int[] iArr = (int[]) obj2;
                    iArr.getClass();
                    int length = iArr.length - 1;
                    if (length >= 0) {
                        while (true) {
                            int i2 = length - 1;
                            if (intValue == iArr[length]) {
                                break;
                            } else if (i2 < 0) {
                                break;
                            } else {
                                length = i2;
                            }
                        }
                    }
                }
                break;
            default:
                if (obj instanceof ULong) {
                    long j = ((ULong) obj).data;
                    long[] jArr = (long[]) obj2;
                    int length2 = jArr.length - 1;
                    if (length2 >= 0) {
                        while (true) {
                            int i3 = length2 - 1;
                            if (j == jArr[length2]) {
                                break;
                            } else if (i3 < 0) {
                                break;
                            } else {
                                length2 = i3;
                            }
                        }
                    }
                }
                break;
        }
        return -1;
    }
}
