package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;

/* loaded from: classes9.dex */
public final class ProtoTypeTableUtilKt {
    public static final ProtoBuf.Type abbreviatedType(ProtoBuf.Type type2, TypeTable typeTable) {
        type2.getClass();
        typeTable.getClass();
        if (type2.hasAbbreviatedType()) {
            return type2.getAbbreviatedType();
        }
        if (type2.hasAbbreviatedTypeId()) {
            return typeTable.get(type2.getAbbreviatedTypeId());
        }
        return null;
    }

    public static final List<ProtoBuf.Type> contextReceiverTypes(ProtoBuf.Class r2, TypeTable typeTable) {
        r2.getClass();
        typeTable.getClass();
        List<ProtoBuf.Type> contextReceiverTypeList = r2.getContextReceiverTypeList();
        if (contextReceiverTypeList.isEmpty()) {
            contextReceiverTypeList = null;
        }
        if (contextReceiverTypeList == null) {
            List<Integer> contextReceiverTypeIdList = r2.getContextReceiverTypeIdList();
            contextReceiverTypeIdList.getClass();
            List<Integer> list = contextReceiverTypeIdList;
            contextReceiverTypeList = new ArrayList<>(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            for (Integer num : list) {
                num.getClass();
                contextReceiverTypeList.add(typeTable.get(num.intValue()));
            }
        }
        return contextReceiverTypeList;
    }

    public static final ProtoBuf.Type expandedType(ProtoBuf.TypeAlias typeAlias, TypeTable typeTable) {
        typeAlias.getClass();
        typeTable.getClass();
        if (typeAlias.hasExpandedType()) {
            ProtoBuf.Type expandedType = typeAlias.getExpandedType();
            expandedType.getClass();
            return expandedType;
        }
        if (typeAlias.hasExpandedTypeId()) {
            return typeTable.get(typeAlias.getExpandedTypeId());
        }
        a$$ExternalSyntheticBUOutline0.m$1("No expandedType in ProtoBuf.TypeAlias");
        return null;
    }

    public static final ProtoBuf.Type flexibleUpperBound(ProtoBuf.Type type2, TypeTable typeTable) {
        type2.getClass();
        typeTable.getClass();
        if (type2.hasFlexibleUpperBound()) {
            return type2.getFlexibleUpperBound();
        }
        if (type2.hasFlexibleUpperBoundId()) {
            return typeTable.get(type2.getFlexibleUpperBoundId());
        }
        return null;
    }

    public static final boolean hasReceiver(ProtoBuf.Function function) {
        function.getClass();
        return function.hasReceiverType() || function.hasReceiverTypeId();
    }

    public static final ProtoBuf.Type inlineClassUnderlyingType(ProtoBuf.Class r1, TypeTable typeTable) {
        r1.getClass();
        typeTable.getClass();
        if (r1.hasInlineClassUnderlyingType()) {
            return r1.getInlineClassUnderlyingType();
        }
        if (r1.hasInlineClassUnderlyingTypeId()) {
            return typeTable.get(r1.getInlineClassUnderlyingTypeId());
        }
        return null;
    }

    public static final ProtoBuf.Type isInstanceType(ProtoBuf.Expression expression, TypeTable typeTable) {
        expression.getClass();
        typeTable.getClass();
        if (expression.hasIsInstanceType()) {
            return expression.getIsInstanceType();
        }
        if (expression.hasIsInstanceTypeId()) {
            return typeTable.get(expression.getIsInstanceTypeId());
        }
        return null;
    }

    public static final ProtoBuf.Type outerType(ProtoBuf.Type type2, TypeTable typeTable) {
        type2.getClass();
        typeTable.getClass();
        if (type2.hasOuterType()) {
            return type2.getOuterType();
        }
        if (type2.hasOuterTypeId()) {
            return typeTable.get(type2.getOuterTypeId());
        }
        return null;
    }

    public static final ProtoBuf.Type receiverType(ProtoBuf.Function function, TypeTable typeTable) {
        function.getClass();
        typeTable.getClass();
        if (function.hasReceiverType()) {
            return function.getReceiverType();
        }
        if (function.hasReceiverTypeId()) {
            return typeTable.get(function.getReceiverTypeId());
        }
        return null;
    }

    public static final ProtoBuf.Type returnType(ProtoBuf.Function function, TypeTable typeTable) {
        function.getClass();
        typeTable.getClass();
        if (function.hasReturnType()) {
            ProtoBuf.Type returnType = function.getReturnType();
            returnType.getClass();
            return returnType;
        }
        if (function.hasReturnTypeId()) {
            return typeTable.get(function.getReturnTypeId());
        }
        a$$ExternalSyntheticBUOutline0.m$1("No returnType in ProtoBuf.Function");
        return null;
    }

    public static final List<ProtoBuf.Type> supertypes(ProtoBuf.Class r2, TypeTable typeTable) {
        r2.getClass();
        typeTable.getClass();
        List<ProtoBuf.Type> supertypeList = r2.getSupertypeList();
        if (supertypeList.isEmpty()) {
            supertypeList = null;
        }
        if (supertypeList == null) {
            List<Integer> supertypeIdList = r2.getSupertypeIdList();
            supertypeIdList.getClass();
            List<Integer> list = supertypeIdList;
            supertypeList = new ArrayList<>(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            for (Integer num : list) {
                num.getClass();
                supertypeList.add(typeTable.get(num.intValue()));
            }
        }
        return supertypeList;
    }

    public static final ProtoBuf.Type type(ProtoBuf.ValueParameter valueParameter, TypeTable typeTable) {
        valueParameter.getClass();
        typeTable.getClass();
        if (valueParameter.hasType()) {
            ProtoBuf.Type type2 = valueParameter.getType();
            type2.getClass();
            return type2;
        }
        if (valueParameter.hasTypeId()) {
            return typeTable.get(valueParameter.getTypeId());
        }
        a$$ExternalSyntheticBUOutline0.m$1("No type in ProtoBuf.ValueParameter");
        return null;
    }

    public static final ProtoBuf.Type underlyingType(ProtoBuf.TypeAlias typeAlias, TypeTable typeTable) {
        typeAlias.getClass();
        typeTable.getClass();
        if (typeAlias.hasUnderlyingType()) {
            ProtoBuf.Type underlyingType = typeAlias.getUnderlyingType();
            underlyingType.getClass();
            return underlyingType;
        }
        if (typeAlias.hasUnderlyingTypeId()) {
            return typeTable.get(typeAlias.getUnderlyingTypeId());
        }
        a$$ExternalSyntheticBUOutline0.m$1("No underlyingType in ProtoBuf.TypeAlias");
        return null;
    }

    public static final List<ProtoBuf.Type> upperBounds(ProtoBuf.TypeParameter typeParameter, TypeTable typeTable) {
        typeParameter.getClass();
        typeTable.getClass();
        List<ProtoBuf.Type> upperBoundList = typeParameter.getUpperBoundList();
        if (upperBoundList.isEmpty()) {
            upperBoundList = null;
        }
        if (upperBoundList == null) {
            List<Integer> upperBoundIdList = typeParameter.getUpperBoundIdList();
            upperBoundIdList.getClass();
            List<Integer> list = upperBoundIdList;
            upperBoundList = new ArrayList<>(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            for (Integer num : list) {
                num.getClass();
                upperBoundList.add(typeTable.get(num.intValue()));
            }
        }
        return upperBoundList;
    }

    public static final ProtoBuf.Type varargElementType(ProtoBuf.ValueParameter valueParameter, TypeTable typeTable) {
        valueParameter.getClass();
        typeTable.getClass();
        if (valueParameter.hasVarargElementType()) {
            return valueParameter.getVarargElementType();
        }
        if (valueParameter.hasVarargElementTypeId()) {
            return typeTable.get(valueParameter.getVarargElementTypeId());
        }
        return null;
    }

    public static final boolean hasReceiver(ProtoBuf.Property property) {
        property.getClass();
        return property.hasReceiverType() || property.hasReceiverTypeId();
    }

    public static final ProtoBuf.Type receiverType(ProtoBuf.Property property, TypeTable typeTable) {
        property.getClass();
        typeTable.getClass();
        if (property.hasReceiverType()) {
            return property.getReceiverType();
        }
        if (property.hasReceiverTypeId()) {
            return typeTable.get(property.getReceiverTypeId());
        }
        return null;
    }

    public static final ProtoBuf.Type returnType(ProtoBuf.Property property, TypeTable typeTable) {
        property.getClass();
        typeTable.getClass();
        if (property.hasReturnType()) {
            ProtoBuf.Type returnType = property.getReturnType();
            returnType.getClass();
            return returnType;
        }
        if (property.hasReturnTypeId()) {
            return typeTable.get(property.getReturnTypeId());
        }
        a$$ExternalSyntheticBUOutline0.m$1("No returnType in ProtoBuf.Property");
        return null;
    }

    public static final ProtoBuf.Type type(ProtoBuf.Type.Argument argument, TypeTable typeTable) {
        argument.getClass();
        typeTable.getClass();
        if (argument.hasType()) {
            return argument.getType();
        }
        if (argument.hasTypeId()) {
            return typeTable.get(argument.getTypeId());
        }
        return null;
    }

    public static final List<ProtoBuf.Type> contextReceiverTypes(ProtoBuf.Function function, TypeTable typeTable) {
        function.getClass();
        typeTable.getClass();
        List<ProtoBuf.Type> contextReceiverTypeList = function.getContextReceiverTypeList();
        if (contextReceiverTypeList.isEmpty()) {
            contextReceiverTypeList = null;
        }
        if (contextReceiverTypeList == null) {
            List<Integer> contextReceiverTypeIdList = function.getContextReceiverTypeIdList();
            contextReceiverTypeIdList.getClass();
            List<Integer> list = contextReceiverTypeIdList;
            contextReceiverTypeList = new ArrayList<>(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            for (Integer num : list) {
                num.getClass();
                contextReceiverTypeList.add(typeTable.get(num.intValue()));
            }
        }
        return contextReceiverTypeList;
    }

    public static final List<ProtoBuf.Type> contextReceiverTypes(ProtoBuf.Property property, TypeTable typeTable) {
        property.getClass();
        typeTable.getClass();
        List<ProtoBuf.Type> contextReceiverTypeList = property.getContextReceiverTypeList();
        if (contextReceiverTypeList.isEmpty()) {
            contextReceiverTypeList = null;
        }
        if (contextReceiverTypeList == null) {
            List<Integer> contextReceiverTypeIdList = property.getContextReceiverTypeIdList();
            contextReceiverTypeIdList.getClass();
            List<Integer> list = contextReceiverTypeIdList;
            contextReceiverTypeList = new ArrayList<>(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            for (Integer num : list) {
                num.getClass();
                contextReceiverTypeList.add(typeTable.get(num.intValue()));
            }
        }
        return contextReceiverTypeList;
    }
}
