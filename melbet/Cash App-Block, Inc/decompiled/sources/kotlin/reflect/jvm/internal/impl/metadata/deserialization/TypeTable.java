package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;

/* loaded from: classes9.dex */
public final class TypeTable {
    public final List types;

    public TypeTable(ProtoBuf.TypeTable typeTable) {
        typeTable.getClass();
        List<ProtoBuf.Type> typeList = typeTable.getTypeList();
        if (typeTable.hasFirstNullable()) {
            int firstNullable = typeTable.getFirstNullable();
            List<ProtoBuf.Type> typeList2 = typeTable.getTypeList();
            typeList2.getClass();
            List<ProtoBuf.Type> list = typeList2;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                    throw null;
                }
                ProtoBuf.Type type2 = (ProtoBuf.Type) obj;
                if (i >= firstNullable) {
                    type2 = type2.toBuilder().setNullable(true).build();
                }
                arrayList.add(type2);
                i = i2;
            }
            typeList = arrayList;
        }
        typeList.getClass();
        this.types = typeList;
    }

    public final ProtoBuf.Type get(int i) {
        return (ProtoBuf.Type) this.types.get(i);
    }
}
