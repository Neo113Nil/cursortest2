package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.LinkedList;
import java.util.List;
import kotlin.Triple;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;

/* loaded from: classes9.dex */
public final class NameResolverImpl implements NameResolver {
    public final ProtoBuf.QualifiedNameTable qualifiedNames;
    public final ProtoBuf.StringTable strings;

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ProtoBuf.QualifiedNameTable.QualifiedName.Kind.values().length];
            try {
                iArr[ProtoBuf.QualifiedNameTable.QualifiedName.Kind.CLASS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProtoBuf.QualifiedNameTable.QualifiedName.Kind.PACKAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProtoBuf.QualifiedNameTable.QualifiedName.Kind.LOCAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public NameResolverImpl(ProtoBuf.StringTable stringTable, ProtoBuf.QualifiedNameTable qualifiedNameTable) {
        stringTable.getClass();
        qualifiedNameTable.getClass();
        this.strings = stringTable;
        this.qualifiedNames = qualifiedNameTable;
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    public String getQualifiedClassName(int i) {
        Triple traverseIds = traverseIds(i);
        List list = (List) traverseIds.first;
        String joinToString$default = CollectionsKt.joinToString$default((List) traverseIds.second, ".", null, null, 0, null, null, 62);
        if (list.isEmpty()) {
            return joinToString$default;
        }
        return CollectionsKt.joinToString$default(list, "/", null, null, 0, null, null, 62) + '/' + joinToString$default;
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    public String getString(int i) {
        String string2 = this.strings.getString(i);
        string2.getClass();
        return string2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    public boolean isLocalClassName(int i) {
        return ((Boolean) traverseIds(i).third).booleanValue();
    }

    public final Triple traverseIds(int i) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z = false;
        while (i != -1) {
            ProtoBuf.QualifiedNameTable.QualifiedName qualifiedName = this.qualifiedNames.getQualifiedName(i);
            String string2 = this.strings.getString(qualifiedName.getShortName());
            ProtoBuf.QualifiedNameTable.QualifiedName.Kind kind = qualifiedName.getKind();
            kind.getClass();
            int i2 = WhenMappings.$EnumSwitchMapping$0[kind.ordinal()];
            if (i2 == 1) {
                linkedList2.addFirst(string2);
            } else if (i2 == 2) {
                linkedList.addFirst(string2);
            } else {
                if (i2 != 3) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                linkedList2.addFirst(string2);
                z = true;
            }
            i = qualifiedName.getParentQualifiedName();
        }
        return new Triple(linkedList, linkedList2, Boolean.valueOf(z));
    }
}
