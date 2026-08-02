package kotlinx.collections.immutable.implementations.persistentOrderedMap;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class PersistentOrderedMap$equals$1 implements Function2 {
    public static final PersistentOrderedMap$equals$1 INSTANCE = new PersistentOrderedMap$equals$1(0);
    public static final PersistentOrderedMap$equals$1 INSTANCE$1 = new PersistentOrderedMap$equals$1(1);
    public static final PersistentOrderedMap$equals$1 INSTANCE$2 = new PersistentOrderedMap$equals$1(2);
    public static final PersistentOrderedMap$equals$1 INSTANCE$3 = new PersistentOrderedMap$equals$1(3);
    public static final PersistentOrderedMap$equals$1 INSTANCE$4 = new PersistentOrderedMap$equals$1(4);
    public static final PersistentOrderedMap$equals$1 INSTANCE$5 = new PersistentOrderedMap$equals$1(5);
    public static final PersistentOrderedMap$equals$1 INSTANCE$6 = new PersistentOrderedMap$equals$1(6);
    public static final PersistentOrderedMap$equals$1 INSTANCE$7 = new PersistentOrderedMap$equals$1(7);
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ PersistentOrderedMap$equals$1(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                LinkedValue linkedValue = (LinkedValue) obj;
                LinkedValue linkedValue2 = (LinkedValue) obj2;
                linkedValue.getClass();
                linkedValue2.getClass();
                return Boolean.valueOf(Intrinsics.areEqual(linkedValue.value, linkedValue2.value));
            case 1:
                LinkedValue linkedValue3 = (LinkedValue) obj;
                LinkedValue linkedValue4 = (LinkedValue) obj2;
                linkedValue3.getClass();
                linkedValue4.getClass();
                return Boolean.valueOf(Intrinsics.areEqual(linkedValue3.value, linkedValue4.value));
            case 2:
                LinkedValue linkedValue5 = (LinkedValue) obj;
                linkedValue5.getClass();
                return Boolean.valueOf(Intrinsics.areEqual(linkedValue5.value, obj2));
            case 3:
                LinkedValue linkedValue6 = (LinkedValue) obj;
                linkedValue6.getClass();
                return Boolean.valueOf(Intrinsics.areEqual(linkedValue6.value, obj2));
            case 4:
                LinkedValue linkedValue7 = (LinkedValue) obj;
                LinkedValue linkedValue8 = (LinkedValue) obj2;
                linkedValue7.getClass();
                linkedValue8.getClass();
                return Boolean.valueOf(Intrinsics.areEqual(linkedValue7.value, linkedValue8.value));
            case 5:
                LinkedValue linkedValue9 = (LinkedValue) obj;
                LinkedValue linkedValue10 = (LinkedValue) obj2;
                linkedValue9.getClass();
                linkedValue10.getClass();
                return Boolean.valueOf(Intrinsics.areEqual(linkedValue9.value, linkedValue10.value));
            case 6:
                LinkedValue linkedValue11 = (LinkedValue) obj;
                linkedValue11.getClass();
                return Boolean.valueOf(Intrinsics.areEqual(linkedValue11.value, obj2));
            default:
                LinkedValue linkedValue12 = (LinkedValue) obj;
                linkedValue12.getClass();
                return Boolean.valueOf(Intrinsics.areEqual(linkedValue12.value, obj2));
        }
    }
}
