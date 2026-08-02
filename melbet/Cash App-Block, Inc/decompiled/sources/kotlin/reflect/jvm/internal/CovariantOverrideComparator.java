package kotlin.reflect.jvm.internal;

import java.lang.reflect.Method;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.reflect.KType;
import kotlin.reflect.KVariance;
import kotlin.reflect.full.KTypes;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.types.AbstractKType;
import kotlin.reflect.jvm.internal.types.KTypeSubstitutor;
import kotlin.text.Regex;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes9.dex */
public final class CovariantOverrideComparator implements Comparator {
    public static final CovariantOverrideComparator INSTANCE = new CovariantOverrideComparator(0);
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ CovariantOverrideComparator(int i) {
        this.$r8$classId = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ae A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0097  */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compare(Object obj, Object obj2) {
        boolean z;
        AbstractKType abstractKType;
        boolean z2;
        switch (this.$r8$classId) {
            case 0:
                DescriptorKCallable descriptorKCallable = (DescriptorKCallable) obj;
                DescriptorKCallable descriptorKCallable2 = (DescriptorKCallable) obj2;
                descriptorKCallable.getClass();
                descriptorKCallable2.getClass();
                KTypeSubstitutor access$substitutedWith = FakeOverridesKt.access$substitutedWith(descriptorKCallable.getTypeParameters(), descriptorKCallable2.getTypeParameters());
                if (access$substitutedWith == null) {
                    Path$$ExternalSyntheticBUOutline0.m("Intersection overrides can't have different type parameters sizes. It must have been reported by the compiler. The following members appear to be violating intersection overrides: '", descriptorKCallable, "' '", descriptorKCallable2);
                    return 0;
                }
                KType returnType = descriptorKCallable.getReturnType();
                KTypeSubstitutor kTypeSubstitutor = KTypeSubstitutor.EMPTY;
                KType kType = access$substitutedWith.substitute(returnType, KVariance.INVARIANT).f1521type;
                if (kType == null) {
                    FakeOverridesKt.starProjectionInTopLevelTypeIsNotPossible(descriptorKCallable.getName());
                    throw null;
                }
                KType returnType2 = descriptorKCallable2.getReturnType();
                boolean isSubtypeOf = KTypes.isSubtypeOf(kType, returnType2);
                boolean isSubtypeOf2 = KTypes.isSubtypeOf(returnType2, kType);
                if (!isSubtypeOf || isSubtypeOf2) {
                    if (!isSubtypeOf2 || isSubtypeOf) {
                        AbstractKType abstractKType2 = kType instanceof AbstractKType ? (AbstractKType) kType : null;
                        if (abstractKType2 != null) {
                            if (abstractKType2.lowerBoundIfFlexible() == null) {
                                abstractKType2 = null;
                            }
                            if (abstractKType2 != null) {
                                z = true;
                                abstractKType = !(returnType2 instanceof AbstractKType) ? (AbstractKType) returnType2 : null;
                                if (abstractKType != null) {
                                    if ((abstractKType.lowerBoundIfFlexible() != null ? abstractKType : null) != null) {
                                        z2 = true;
                                        if (z2 || z) {
                                            if (!z || z2) {
                                            }
                                        }
                                    }
                                }
                                z2 = false;
                                if (z2) {
                                }
                                return !z ? 0 : 0;
                            }
                        }
                        z = false;
                        if (!(returnType2 instanceof AbstractKType)) {
                        }
                        if (abstractKType != null) {
                        }
                        z2 = false;
                        if (z2) {
                        }
                        if (!z) {
                        }
                    }
                    return 1;
                }
                return -1;
            case 1:
                return ComparisonsKt__ComparisonsKt.compareValues(((ReflectKParameter) obj).getName(), ((ReflectKParameter) obj2).getName());
            case 2:
                return ComparisonsKt__ComparisonsKt.compareValues(((Method) obj).getName(), ((Method) obj2).getName());
            default:
                Regex regex = KDeclarationContainerImpl.LOCAL_PROPERTY_SIGNATURE;
                Integer compare = DescriptorVisibilities.compare((DescriptorVisibility) obj, (DescriptorVisibility) obj2);
                if (compare != null) {
                    return compare.intValue();
                }
                return 0;
        }
    }
}
