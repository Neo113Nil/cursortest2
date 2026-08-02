package kotlin.reflect.jvm.internal.impl.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;

/* loaded from: classes9.dex */
public abstract class AttributeArrayOwner<K, T> extends AbstractArrayMapOwner<K, T> {
    public ArrayMap arrayMap;

    public AttributeArrayOwner() {
        EmptyArrayMap emptyArrayMap = EmptyArrayMap.INSTANCE;
        emptyArrayMap.getClass();
        this.arrayMap = emptyArrayMap;
    }

    public final String buildDiagnosticMessage(ArrayMap arrayMap, int i, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("Race condition happened, the size of ArrayMap is " + i + " but it isn't an `" + str + '`');
        sb.append('\n');
        StringBuilder sb2 = new StringBuilder("Type: ");
        sb2.append(arrayMap.getClass());
        sb.append(sb2.toString());
        sb.append('\n');
        StringBuilder sb3 = new StringBuilder();
        Map<String, Integer> allValuesThreadUnsafeForRendering = getTypeRegistry().allValuesThreadUnsafeForRendering();
        sb3.append("[\n");
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayMap, 10));
        int i2 = 0;
        for (T t : arrayMap) {
            int i3 = i2 + 1;
            T t2 = null;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
                throw null;
            }
            Iterator<T> it = allValuesThreadUnsafeForRendering.entrySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    T next = it.next();
                    if (((Number) ((Map.Entry) next).getValue()).intValue() == i2) {
                        t2 = next;
                        break;
                    }
                }
            }
            sb3.append("  " + ((Map.Entry) t2) + '[' + i2 + "]: " + t);
            sb3.append('\n');
            arrayList.add(sb3);
            i2 = i3;
        }
        sb3.append("]");
        sb3.append('\n');
        sb.append("Content: ".concat(sb3.toString()));
        sb.append('\n');
        return sb.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.AbstractArrayMapOwner
    public final ArrayMap getArrayMap() {
        return this.arrayMap;
    }
}
