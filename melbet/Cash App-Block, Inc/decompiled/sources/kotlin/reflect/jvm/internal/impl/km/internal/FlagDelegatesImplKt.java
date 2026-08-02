package kotlin.reflect.jvm.internal.impl.km.internal;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.enums.EnumEntries;
import kotlin.reflect.KMutableProperty1;
import kotlin.reflect.jvm.internal.impl.km.KmClass;
import kotlin.reflect.jvm.internal.impl.km.KmConstructor;
import kotlin.reflect.jvm.internal.impl.km.KmFunction;
import kotlin.reflect.jvm.internal.impl.km.KmProperty;
import kotlin.reflect.jvm.internal.impl.km.KmPropertyAccessorAttributes;
import kotlin.reflect.jvm.internal.impl.km.KmType;
import kotlin.reflect.jvm.internal.impl.km.KmTypeAlias;
import kotlin.reflect.jvm.internal.impl.km.KmValueParameter;
import kotlin.reflect.jvm.internal.impl.km.MemberKind;
import kotlin.reflect.jvm.internal.impl.km.Modality;
import kotlin.reflect.jvm.internal.impl.km.ReturnValueStatus;
import kotlin.reflect.jvm.internal.impl.km.Visibility;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.protobuf.Internal;

/* loaded from: classes9.dex */
public final class FlagDelegatesImplKt {
    public static final BooleanFlagDelegate<KmClass> classBooleanFlag(FlagImpl flagImpl) {
        flagImpl.getClass();
        return new BooleanFlagDelegate<>(FlagDelegatesImplKt$classBooleanFlag$1.INSTANCE, flagImpl);
    }

    public static final BooleanFlagDelegate<KmConstructor> constructorBooleanFlag(FlagImpl flagImpl) {
        flagImpl.getClass();
        return new BooleanFlagDelegate<>(FlagDelegatesImplKt$constructorBooleanFlag$1.INSTANCE, flagImpl);
    }

    public static final BooleanFlagDelegate<KmFunction> functionBooleanFlag(FlagImpl flagImpl) {
        flagImpl.getClass();
        return new BooleanFlagDelegate<>(FlagDelegatesImplKt$functionBooleanFlag$1.INSTANCE, flagImpl);
    }

    public static final <Node> EnumFlagDelegate<Node, MemberKind> memberKindDelegate(KMutableProperty1 kMutableProperty1) {
        kMutableProperty1.getClass();
        Flags.FlagField<ProtoBuf.MemberKind> flagField = Flags.MEMBER_KIND;
        flagField.getClass();
        EnumEntries entries = MemberKind.getEntries();
        EnumEntries entries2 = MemberKind.getEntries();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(entries2, 10));
        Iterator<E> it = entries2.iterator();
        while (it.hasNext()) {
            arrayList.add(((MemberKind) it.next()).getFlag$kotlin_metadata());
        }
        return new EnumFlagDelegate<>(kMutableProperty1, flagField, entries, arrayList);
    }

    public static final <Node> EnumFlagDelegate<Node, Modality> modalityDelegate(KMutableProperty1 kMutableProperty1) {
        kMutableProperty1.getClass();
        Flags.FlagField<ProtoBuf.Modality> flagField = Flags.MODALITY;
        flagField.getClass();
        EnumEntries entries = Modality.getEntries();
        EnumEntries entries2 = Modality.getEntries();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(entries2, 10));
        Iterator<E> it = entries2.iterator();
        while (it.hasNext()) {
            arrayList.add(((Modality) it.next()).getFlag$kotlin_metadata());
        }
        return new EnumFlagDelegate<>(kMutableProperty1, flagField, entries, arrayList);
    }

    public static final BooleanFlagDelegate<KmPropertyAccessorAttributes> propertyAccessorBooleanFlag(FlagImpl flagImpl) {
        flagImpl.getClass();
        return new BooleanFlagDelegate<>(FlagDelegatesImplKt$propertyAccessorBooleanFlag$1.INSTANCE, flagImpl);
    }

    public static final BooleanFlagDelegate<KmProperty> propertyBooleanFlag(FlagImpl flagImpl) {
        flagImpl.getClass();
        return new BooleanFlagDelegate<>(FlagDelegatesImplKt$propertyBooleanFlag$1.INSTANCE, flagImpl);
    }

    public static final <Node> EnumFlagDelegate<Node, ReturnValueStatus> returnValueStatusDelegate(KMutableProperty1 kMutableProperty1, Flags.FlagField<? extends Internal.EnumLite> flagField) {
        kMutableProperty1.getClass();
        flagField.getClass();
        EnumEntries entries = ReturnValueStatus.getEntries();
        EnumEntries entries2 = ReturnValueStatus.getEntries();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(entries2, 10));
        Iterator<E> it = entries2.iterator();
        while (it.hasNext()) {
            arrayList.add(new FlagImpl(flagField, ((ReturnValueStatus) it.next()).ordinal()));
        }
        return new EnumFlagDelegate<>(kMutableProperty1, flagField, entries, arrayList);
    }

    public static final BooleanFlagDelegate<KmTypeAlias> typeAliasBooleanFlag(FlagImpl flagImpl) {
        flagImpl.getClass();
        return new BooleanFlagDelegate<>(FlagDelegatesImplKt$typeAliasBooleanFlag$1.INSTANCE, flagImpl);
    }

    public static final BooleanFlagDelegate<KmType> typeBooleanFlag(FlagImpl flagImpl) {
        flagImpl.getClass();
        return new BooleanFlagDelegate<>(FlagDelegatesImplKt$typeBooleanFlag$1.INSTANCE, flagImpl);
    }

    public static final BooleanFlagDelegate<KmValueParameter> valueParameterBooleanFlag(FlagImpl flagImpl) {
        flagImpl.getClass();
        return new BooleanFlagDelegate<>(FlagDelegatesImplKt$valueParameterBooleanFlag$1.INSTANCE, flagImpl);
    }

    public static final <Node> EnumFlagDelegate<Node, Visibility> visibilityDelegate(KMutableProperty1 kMutableProperty1) {
        kMutableProperty1.getClass();
        Flags.FlagField<ProtoBuf.Visibility> flagField = Flags.VISIBILITY;
        flagField.getClass();
        EnumEntries entries = Visibility.getEntries();
        EnumEntries entries2 = Visibility.getEntries();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(entries2, 10));
        Iterator<E> it = entries2.iterator();
        while (it.hasNext()) {
            arrayList.add(((Visibility) it.next()).getFlag$kotlin_metadata());
        }
        return new EnumFlagDelegate<>(kMutableProperty1, flagField, entries, arrayList);
    }
}
