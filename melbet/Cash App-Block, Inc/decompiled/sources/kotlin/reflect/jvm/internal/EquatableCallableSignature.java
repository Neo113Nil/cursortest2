package kotlin.reflect.jvm.internal;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.compose.ui.semantics.SemanticsSortKt$special$$inlined$thenBy$1;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.KTypeParameterBase;
import kotlin.reflect.KType;
import kotlin.reflect.KVariance;
import kotlin.reflect.full.KTypes;
import kotlin.reflect.jvm.internal.EqualityMode;
import kotlin.reflect.jvm.internal.types.KTypeSubstitutor;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes9.dex */
public final class EquatableCallableSignature {
    public final EqualityMode equalityMode;
    public final boolean isStatic;
    public final List javaGenericParameterTypesIfFunction;
    public final List javaParameterTypesIfFunction;
    public final String jvmNameIfFunction;
    public final SignatureKind kind;
    public final ArrayList kotlinParameterTypes;
    public final String name;
    public final List typeParameters;

    public EquatableCallableSignature(SignatureKind signatureKind, String str, String str2, List list, ArrayList arrayList, List list2, List list3, boolean z, EqualityMode equalityMode) {
        str.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.kind = signatureKind;
        this.name = str;
        this.jvmNameIfFunction = str2;
        this.typeParameters = list;
        this.kotlinParameterTypes = arrayList;
        this.javaParameterTypesIfFunction = list2;
        this.javaGenericParameterTypesIfFunction = list3;
        this.isStatic = z;
        this.equalityMode = equalityMode;
        if (signatureKind != SignatureKind.FIELD_IN_JAVA_CLASS || (arrayList.isEmpty() && list.isEmpty() && list2.isEmpty())) {
            if (list2.size() == list3.size()) {
                return;
            }
            StringBuilder sb = new StringBuilder("javaParameterTypesIfFunction.size (");
            sb.append(list2.size());
            sb.append(") and javaGenericParameterTypesIfFunction.size (");
            sb.append(list3.size());
            sb.append(") must be equal. For member: '");
            Path$$ExternalSyntheticBUOutline0.m((Object) CameraState$Type$EnumUnboxingLocalUtility.m(sb, str, '\''));
            throw null;
        }
        StringBuilder sb2 = new StringBuilder("Inconsistent combination of EquatableCallableSignature values. kind: ");
        sb2.append(signatureKind);
        boolean isEmpty = arrayList.isEmpty();
        boolean isEmpty2 = list.isEmpty();
        boolean isEmpty3 = list2.isEmpty();
        sb2.append(", kotlinParameterTypes.isEmpty(): ");
        sb2.append(isEmpty);
        sb2.append(",typeParameters.isEmpty(): ");
        sb2.append(isEmpty2);
        sb2.append(", javaParameterTypesIfFunction.isEmpty(): ");
        sb2.append(isEmpty3);
        sb2.append(".For member: '");
        sb2.append(str);
        sb2.append('\'');
        throw new IllegalStateException(sb2.toString().toString());
    }

    public final boolean equals(Object obj) {
        List list;
        KTypeSubstitutor access$substitutedWith;
        if (this == obj) {
            return true;
        }
        if (obj instanceof EquatableCallableSignature) {
            EquatableCallableSignature equatableCallableSignature = (EquatableCallableSignature) obj;
            List list2 = equatableCallableSignature.typeParameters;
            List list3 = equatableCallableSignature.javaParameterTypesIfFunction;
            String str = equatableCallableSignature.name;
            ArrayList arrayList = equatableCallableSignature.kotlinParameterTypes;
            EqualityMode equalityMode = equatableCallableSignature.equalityMode;
            EqualityMode equalityMode2 = this.equalityMode;
            boolean equals = equalityMode2.equals(equalityMode);
            String str2 = this.name;
            if (!equals) {
                Path$$ExternalSyntheticBUOutline0.m((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Equality modes must be the same for member '", str2, "'. Please recreate signatures on inheritance"));
                return false;
            }
            SignatureKind signatureKind = equatableCallableSignature.kind;
            SignatureKind signatureKind2 = this.kind;
            if (signatureKind2 == signatureKind && this.isStatic == equatableCallableSignature.isStatic) {
                ArrayList arrayList2 = this.kotlinParameterTypes;
                if (arrayList2.size() == arrayList.size()) {
                    if (!equalityMode2.equals(EqualityMode.JavaSignature.INSTANCE) || signatureKind2 != SignatureKind.FUNCTION) {
                        if (!Intrinsics.areEqual(str2, str) || (access$substitutedWith = FakeOverridesKt.access$substitutedWith((list = this.typeParameters), list2)) == null) {
                            return false;
                        }
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            KTypeParameterBase kTypeParameterBase = (KTypeParameterBase) list.get(i);
                            KTypeParameterBase kTypeParameterBase2 = (KTypeParameterBase) list2.get(i);
                            if (kTypeParameterBase.getUpperBounds().size() != kTypeParameterBase2.getUpperBounds().size()) {
                                return false;
                            }
                            List<KType> upperBounds = kTypeParameterBase.getUpperBounds();
                            ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(upperBounds, 10));
                            for (KType kType : upperBounds) {
                                KTypeSubstitutor kTypeSubstitutor = KTypeSubstitutor.EMPTY;
                                KType kType2 = access$substitutedWith.substitute(kType, KVariance.INVARIANT).f1521type;
                                if (kType2 == null) {
                                    FakeOverridesKt.starProjectionInTopLevelTypeIsNotPossible(str2);
                                    throw null;
                                }
                                arrayList3.add(kType2);
                            }
                            ArrayList zip = CollectionsKt.zip(CollectionsKt.sortedWith(arrayList3, new SemanticsSortKt$special$$inlined$thenBy$1(str2, 21)), CollectionsKt.sortedWith(kTypeParameterBase2.getUpperBounds(), new SemanticsSortKt$special$$inlined$thenBy$1(str, 21)));
                            if (!zip.isEmpty()) {
                                Iterator it = zip.iterator();
                                while (it.hasNext()) {
                                    Pair pair = (Pair) it.next();
                                    KType kType3 = (KType) pair.first;
                                    KType kType4 = (KType) pair.second;
                                    if (!KTypes.isSubtypeOf(kType3, kType4) || !KTypes.isSubtypeOf(kType4, kType3)) {
                                        return false;
                                    }
                                }
                            }
                        }
                        int size2 = arrayList2.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            KType kType5 = (KType) arrayList2.get(i2);
                            KTypeSubstitutor kTypeSubstitutor2 = KTypeSubstitutor.EMPTY;
                            KType kType6 = access$substitutedWith.substitute(kType5, KVariance.INVARIANT).f1521type;
                            if (kType6 == null) {
                                FakeOverridesKt.starProjectionInTopLevelTypeIsNotPossible(str2);
                                throw null;
                            }
                            KType kType7 = (KType) arrayList.get(i2);
                            if (!KTypes.isSubtypeOf(kType6, kType7) || !KTypes.isSubtypeOf(kType7, kType6)) {
                                return false;
                            }
                        }
                        return true;
                    }
                    if (Intrinsics.areEqual(this.jvmNameIfFunction, equatableCallableSignature.jvmNameIfFunction)) {
                        List list4 = this.javaParameterTypesIfFunction;
                        if (list4.size() == list3.size()) {
                            if (list4.size() != arrayList2.size()) {
                                StringBuilder sb = new StringBuilder("javaParameterTypesIfFunction.size (");
                                sb.append(list4.size());
                                sb.append(") and kotlinParameterTypes.size (");
                                sb.append(arrayList2.size());
                                sb.append(") must be equal for member '");
                                Path$$ExternalSyntheticBUOutline0.m((Object) CameraState$Type$EnumUnboxingLocalUtility.m(sb, str2, '\''));
                                return false;
                            }
                            int size3 = list4.size();
                            for (int i3 = 0; i3 < size3; i3++) {
                                Type type2 = (Type) this.javaGenericParameterTypesIfFunction.get(i3);
                                Class cls = (Class) list4.get(i3);
                                Type type3 = (Type) equatableCallableSignature.javaGenericParameterTypesIfFunction.get(i3);
                                Class cls2 = (Class) list3.get(i3);
                                TypeVariable typeVariable = type2 instanceof TypeVariable ? (TypeVariable) type2 : null;
                                boolean z = (typeVariable != null ? typeVariable.getGenericDeclaration() : null) instanceof Class;
                                TypeVariable typeVariable2 = type3 instanceof TypeVariable ? (TypeVariable) type3 : null;
                                boolean z2 = (typeVariable2 != null ? typeVariable2.getGenericDeclaration() : null) instanceof Class;
                                if (z || z2) {
                                    if (cls.isPrimitive() != cls2.isPrimitive()) {
                                        return false;
                                    }
                                    KType coerceFlexibleTypesAndMutabilityRecursive = FakeOverridesKt.coerceFlexibleTypesAndMutabilityRecursive((KType) arrayList2.get(i3), str2);
                                    KType coerceFlexibleTypesAndMutabilityRecursive2 = FakeOverridesKt.coerceFlexibleTypesAndMutabilityRecursive((KType) arrayList.get(i3), str);
                                    if (!KTypes.isSubtypeOf(coerceFlexibleTypesAndMutabilityRecursive, coerceFlexibleTypesAndMutabilityRecursive2) || !KTypes.isSubtypeOf(coerceFlexibleTypesAndMutabilityRecursive2, coerceFlexibleTypesAndMutabilityRecursive)) {
                                        return false;
                                    }
                                } else if (!Intrinsics.areEqual(cls, cls2)) {
                                    return false;
                                }
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        boolean equals = this.equalityMode.equals(EqualityMode.JavaSignature.INSTANCE);
        SignatureKind signatureKind = this.kind;
        boolean z = equals && signatureKind == SignatureKind.FUNCTION;
        boolean z2 = this.isStatic;
        ArrayList arrayList = this.kotlinParameterTypes;
        if (!z) {
            if (!z) {
                return Arrays.hashCode(new Object[]{signatureKind, Integer.valueOf(arrayList.size()), Boolean.valueOf(z2), this.name});
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return 0;
        }
        Integer valueOf = Integer.valueOf(arrayList.size());
        Boolean valueOf2 = Boolean.valueOf(z2);
        String str = this.jvmNameIfFunction;
        if (str == null) {
            str = "";
        }
        return Arrays.hashCode(new Object[]{signatureKind, valueOf, valueOf2, str});
    }

    public final String toString() {
        return "EquatableCallableSignature(kind=" + this.kind + ", name=" + this.name + ", jvmNameIfFunction=" + this.jvmNameIfFunction + ", typeParameters=" + this.typeParameters + ", kotlinParameterTypes=" + this.kotlinParameterTypes + ", javaParameterTypesIfFunction=" + this.javaParameterTypesIfFunction + ", javaGenericParameterTypesIfFunction=" + this.javaGenericParameterTypesIfFunction + ", isStatic=" + this.isStatic + ", equalityMode=" + this.equalityMode + ')';
    }
}
