package kotlin.reflect.jvm.internal.types;

import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.KVariance;
import kotlin.reflect.jvm.internal.DescriptorKCallable$$Lambda$6;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor;
import kotlin.reflect.jvm.internal.types.DescriptorKType;

/* loaded from: classes9.dex */
public final class DescriptorKType$$Lambda$1 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final Object arg$0;
    public final Object arg$1;

    public /* synthetic */ DescriptorKType$$Lambda$1(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.arg$0 = obj;
        this.arg$1 = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        KTypeProjection invariant;
        KTypeProjection kTypeProjection;
        int i = this.$r8$classId;
        Object obj = this.arg$1;
        Object obj2 = this.arg$0;
        switch (i) {
            case 0:
                DescriptorKType descriptorKType = (DescriptorKType) obj2;
                Function0 function0 = (Function0) obj;
                List<TypeProjection> arguments = descriptorKType.f1540type.getArguments();
                if (arguments.isEmpty()) {
                    return EmptyList.INSTANCE;
                }
                List<TypeProjection> list = arguments;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                int i2 = 0;
                for (Object obj3 : list) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                        throw null;
                    }
                    TypeProjection typeProjection = (TypeProjection) obj3;
                    DescriptorKCallable$$Lambda$6 descriptorKCallable$$Lambda$6 = function0 == null ? null : new DescriptorKCallable$$Lambda$6(new DescriptorKType$$Lambda$0(descriptorKType, 1), i2, 3);
                    if (typeProjection.isStarProjection()) {
                        KTypeProjection.INSTANCE.getClass();
                        invariant = KTypeProjection.star;
                    } else {
                        KotlinType type2 = typeProjection.getType();
                        type2.getClass();
                        DescriptorKType descriptorKType2 = new DescriptorKType(type2, descriptorKCallable$$Lambda$6, false);
                        int i4 = DescriptorKType.WhenMappings.$EnumSwitchMapping$0[typeProjection.getProjectionKind().ordinal()];
                        if (i4 != 1) {
                            if (i4 == 2) {
                                KTypeProjection.INSTANCE.getClass();
                                kTypeProjection = new KTypeProjection(descriptorKType2, KVariance.IN);
                            } else {
                                if (i4 != 3) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                KTypeProjection.INSTANCE.getClass();
                                kTypeProjection = new KTypeProjection(descriptorKType2, KVariance.OUT);
                            }
                            invariant = kTypeProjection;
                        } else {
                            KTypeProjection.INSTANCE.getClass();
                            invariant = KTypeProjection.Companion.invariant(descriptorKType2);
                        }
                    }
                    arrayList.add(invariant);
                    i2 = i3;
                }
                return arrayList;
            default:
                KotlinTypeRefiner kotlinTypeRefiner = (KotlinTypeRefiner) obj;
                List<UnwrappedType> supertypes = ((NewCapturedTypeConstructor) obj2).getSupertypes();
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(supertypes, 10));
                Iterator<T> it = supertypes.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((UnwrappedType) it.next()).refine(kotlinTypeRefiner));
                }
                return arrayList2;
        }
    }
}
