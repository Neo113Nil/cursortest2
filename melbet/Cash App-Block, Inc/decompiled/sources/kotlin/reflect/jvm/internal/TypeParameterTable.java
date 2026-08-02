package kotlin.reflect.jvm.internal;

import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.KTypeParameterBase;

/* loaded from: classes9.dex */
public final class TypeParameterTable {
    public static final TypeParameterTable EMPTY;
    public final Map map;
    public final List ownTypeParameters;
    public final TypeParameterTable parent;

    static {
        EmptyList emptyList = EmptyList.INSTANCE;
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        EMPTY = new TypeParameterTable(emptyList, emptyMap, null);
    }

    public TypeParameterTable(List list, Map map, TypeParameterTable typeParameterTable) {
        this.ownTypeParameters = list;
        this.map = map;
        this.parent = typeParameterTable;
    }

    public final KTypeParameterBase get(int i) {
        KTypeParameterBase kTypeParameterBase = (KTypeParameterBase) this.map.get(Integer.valueOf(i));
        if (kTypeParameterBase != null) {
            return kTypeParameterBase;
        }
        TypeParameterTable typeParameterTable = this.parent;
        if (typeParameterTable != null) {
            return typeParameterTable.get(i);
        }
        return null;
    }

    public final List getOwnTypeParameters() {
        return this.ownTypeParameters;
    }
}
