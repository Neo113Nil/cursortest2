package kotlinx.collections.immutable.implementations.immutableMap;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.implementations.persistentOrderedMap.LinkedValue;

/* loaded from: classes9.dex */
public final class PersistentHashMap$equals$1 implements Function2 {
    public static final PersistentHashMap$equals$1 INSTANCE = new PersistentHashMap$equals$1(0);
    public static final PersistentHashMap$equals$1 INSTANCE$1 = new PersistentHashMap$equals$1(1);
    public static final PersistentHashMap$equals$1 INSTANCE$2 = new PersistentHashMap$equals$1(2);
    public static final PersistentHashMap$equals$1 INSTANCE$3 = new PersistentHashMap$equals$1(3);
    public static final PersistentHashMap$equals$1 INSTANCE$4 = new PersistentHashMap$equals$1(4);
    public static final PersistentHashMap$equals$1 INSTANCE$5 = new PersistentHashMap$equals$1(5);
    public static final PersistentHashMap$equals$1 INSTANCE$6 = new PersistentHashMap$equals$1(6);
    public static final PersistentHashMap$equals$1 INSTANCE$7 = new PersistentHashMap$equals$1(7);
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ PersistentHashMap$equals$1(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                LinkedValue linkedValue = (LinkedValue) obj2;
                linkedValue.getClass();
                return Boolean.valueOf(Intrinsics.areEqual(obj, linkedValue.value));
            case 1:
                LinkedValue linkedValue2 = (LinkedValue) obj2;
                linkedValue2.getClass();
                return Boolean.valueOf(Intrinsics.areEqual(obj, linkedValue2.value));
            case 2:
                return Boolean.valueOf(Intrinsics.areEqual(obj, obj2));
            case 3:
                return Boolean.valueOf(Intrinsics.areEqual(obj, obj2));
            case 4:
                return Boolean.valueOf(Intrinsics.areEqual(obj, obj2));
            case 5:
                return Boolean.valueOf(Intrinsics.areEqual(obj, obj2));
            case 6:
                LinkedValue linkedValue3 = (LinkedValue) obj2;
                linkedValue3.getClass();
                return Boolean.valueOf(Intrinsics.areEqual(obj, linkedValue3.value));
            default:
                LinkedValue linkedValue4 = (LinkedValue) obj2;
                linkedValue4.getClass();
                return Boolean.valueOf(Intrinsics.areEqual(obj, linkedValue4.value));
        }
    }
}
