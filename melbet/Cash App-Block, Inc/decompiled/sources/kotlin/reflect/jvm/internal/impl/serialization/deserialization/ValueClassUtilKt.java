package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.InlineClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.MultiFieldValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker;
import papa.Handlers$$ExternalSyntheticBUOutline0;

/* loaded from: classes9.dex */
public final class ValueClassUtilKt {
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008a, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008f, code lost:
    
        if (r5 == false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T extends RigidTypeMarker> ValueClassRepresentation<T> loadValueClassRepresentation(ProtoBuf.Class r4, boolean z, NameResolver nameResolver, TypeTable typeTable, Function1<? super ProtoBuf.Type, ? extends T> function1, Function1<? super Name, ? extends T> function12) {
        RigidTypeMarker rigidTypeMarker;
        r4.getClass();
        nameResolver.getClass();
        typeTable.getClass();
        function1.getClass();
        function12.getClass();
        if (r4.hasInlineClassUnderlyingPropertyName()) {
            Name name = NameResolverUtilKt.getName(nameResolver, r4.getInlineClassUnderlyingPropertyName());
            ProtoBuf.Type inlineClassUnderlyingType = ProtoTypeTableUtilKt.inlineClassUnderlyingType(r4, typeTable);
            if ((inlineClassUnderlyingType != null && (rigidTypeMarker = (RigidTypeMarker) function1.invoke(inlineClassUnderlyingType)) != null) || (rigidTypeMarker = (RigidTypeMarker) function12.invoke(name)) != null) {
                return new InlineClassRepresentation(name, rigidTypeMarker);
            }
            Handlers$$ExternalSyntheticBUOutline0.m("cannot determine underlying type for value class ", NameResolverUtilKt.getName(nameResolver, r4.getFqName()), " with property ", name);
            return null;
        }
        if (!z || !Flags.IS_VALUE_CLASS.get(r4.getFlags()).booleanValue()) {
            return null;
        }
        List<ProtoBuf.Constructor> constructorList = r4.getConstructorList();
        constructorList.getClass();
        Iterator<T> it = constructorList.iterator();
        boolean z2 = false;
        Object obj = null;
        while (true) {
            if (it.hasNext()) {
                Object next = it.next();
                if (!Flags.IS_SECONDARY.get(((ProtoBuf.Constructor) next).getFlags()).booleanValue()) {
                    if (z2) {
                        break;
                    }
                    z2 = true;
                    obj = next;
                }
            }
        }
        ProtoBuf.Constructor constructor = (ProtoBuf.Constructor) obj;
        if (constructor == null) {
            return null;
        }
        List<ProtoBuf.ValueParameter> valueParameterList = constructor.getValueParameterList();
        valueParameterList.getClass();
        List<ProtoBuf.ValueParameter> list = valueParameterList;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (ProtoBuf.ValueParameter valueParameter : list) {
            arrayList.add(new Pair(NameResolverUtilKt.getName(nameResolver, valueParameter.getName()), function1.invoke(ProtoTypeTableUtilKt.type(valueParameter, typeTable))));
        }
        return new MultiFieldValueClassRepresentation(arrayList);
    }
}
