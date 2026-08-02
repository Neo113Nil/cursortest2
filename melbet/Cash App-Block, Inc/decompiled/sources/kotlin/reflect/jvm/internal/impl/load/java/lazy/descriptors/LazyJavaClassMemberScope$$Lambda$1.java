package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;

/* loaded from: classes9.dex */
public final class LazyJavaClassMemberScope$$Lambda$1 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final LazyJavaClassMemberScope arg$0;

    public /* synthetic */ LazyJavaClassMemberScope$$Lambda$1(LazyJavaClassMemberScope lazyJavaClassMemberScope, int i) {
        this.$r8$classId = i;
        this.arg$0 = lazyJavaClassMemberScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        LazyJavaClassMemberScope lazyJavaClassMemberScope = this.arg$0;
        switch (i) {
            case 0:
                return CollectionsKt.toSet(lazyJavaClassMemberScope.jClass.getInnerClassNames());
            case 1:
                Collection<JavaField> fields = lazyJavaClassMemberScope.jClass.getFields();
                ArrayList arrayList = new ArrayList();
                for (Object obj : fields) {
                    if (((JavaField) obj).isEnumEntry()) {
                        arrayList.add(obj);
                    }
                }
                int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                if (mapCapacity < 16) {
                    mapCapacity = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    linkedHashMap.put(((JavaField) next).getName(), next);
                }
                return linkedHashMap;
            default:
                int i2 = LazyJavaClassMemberScope.$r8$clinit;
                return SetsKt___SetsKt.plus((Set) lazyJavaClassMemberScope.getFunctionNames(), (Iterable) lazyJavaClassMemberScope.getVariableNames());
        }
    }
}
