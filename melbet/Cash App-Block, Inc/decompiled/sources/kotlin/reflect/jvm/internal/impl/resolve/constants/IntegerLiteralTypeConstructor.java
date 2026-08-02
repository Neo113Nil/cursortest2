package kotlin.reflect.jvm.internal.impl.resolve.constants;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.KotlinKPropertyN$$Lambda$0;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* loaded from: classes9.dex */
public final class IntegerLiteralTypeConstructor implements TypeConstructor {
    public static final Companion Companion = new Companion(null);
    public final ModuleDescriptor module;
    public final Set possibleTypes;
    public final long value;

    /* renamed from: type, reason: collision with root package name */
    public final SimpleType f1534type = KotlinTypeFactory.integerLiteralType(TypeAttributes.Companion.getEmpty(), this, false);
    public final Lazy supertypes$delegate = LazyKt.lazy(new KotlinKPropertyN$$Lambda$0(this, 19));

    public static final class Companion {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class Mode {
            public static final /* synthetic */ Mode[] $VALUES = {new Mode("COMMON_SUPER_TYPE", 0), new Mode("INTERSECTION_TYPE", 1)};

            /* JADX INFO: Fake field, exist only in values array */
            Mode EF5;

            public static Mode valueOf(String str) {
                return (Mode) Enum.valueOf(Mode.class, str);
            }

            public static Mode[] values() {
                return (Mode[]) $VALUES.clone();
            }
        }

        public static final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Mode.values().length];
                try {
                    Mode[] modeArr = Mode.$VALUES;
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    Mode[] modeArr2 = Mode.$VALUES;
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v11 */
        /* JADX WARN: Type inference failed for: r10v16, types: [kotlin.reflect.jvm.internal.impl.types.SimpleType] */
        /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r10v4 */
        /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object, kotlin.reflect.jvm.internal.impl.types.KotlinType, kotlin.reflect.jvm.internal.impl.types.SimpleType] */
        /* JADX WARN: Type inference failed for: r10v7 */
        /* JADX WARN: Type inference failed for: r10v8 */
        public final SimpleType findIntersectionType(Collection<? extends SimpleType> collection) {
            collection.getClass();
            Mode[] modeArr = Mode.$VALUES;
            if (collection.isEmpty()) {
                return null;
            }
            Iterator it = collection.iterator();
            if (!it.hasNext()) {
                a$$ExternalSyntheticBUOutline0.m("Empty collection can't be reduced.");
                return null;
            }
            ?? next = it.next();
            while (it.hasNext()) {
                SimpleType simpleType = (SimpleType) it.next();
                next = (SimpleType) next;
                IntegerLiteralTypeConstructor.Companion.getClass();
                if (next != 0 && simpleType != null) {
                    TypeConstructor constructor = next.getConstructor();
                    TypeConstructor constructor2 = simpleType.getConstructor();
                    boolean z = constructor instanceof IntegerLiteralTypeConstructor;
                    if (z && (constructor2 instanceof IntegerLiteralTypeConstructor)) {
                        IntegerLiteralTypeConstructor integerLiteralTypeConstructor = (IntegerLiteralTypeConstructor) constructor;
                        next = KotlinTypeFactory.integerLiteralType(TypeAttributes.Companion.getEmpty(), new IntegerLiteralTypeConstructor(integerLiteralTypeConstructor.value, integerLiteralTypeConstructor.module, CollectionsKt.union(integerLiteralTypeConstructor.getPossibleTypes(), ((IntegerLiteralTypeConstructor) constructor2).getPossibleTypes()), null), false);
                    } else if (z) {
                        if (!((IntegerLiteralTypeConstructor) constructor).getPossibleTypes().contains(simpleType)) {
                            simpleType = null;
                        }
                        next = simpleType;
                    } else if ((constructor2 instanceof IntegerLiteralTypeConstructor) && ((IntegerLiteralTypeConstructor) constructor2).getPossibleTypes().contains(next)) {
                    }
                }
                next = 0;
            }
            return (SimpleType) next;
        }
    }

    public IntegerLiteralTypeConstructor(long j, ModuleDescriptor moduleDescriptor, Set set, DefaultConstructorMarker defaultConstructorMarker) {
        this.value = j;
        this.module = moduleDescriptor;
        this.possibleTypes = set;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public KotlinBuiltIns getBuiltIns() {
        return this.module.getBuiltIns();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* renamed from: getDeclarationDescriptor */
    public ClassifierDescriptor mo4153getDeclarationDescriptor() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public List<TypeParameterDescriptor> getParameters() {
        return EmptyList.INSTANCE;
    }

    public final Set<KotlinType> getPossibleTypes() {
        return this.possibleTypes;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public Collection<KotlinType> getSupertypes() {
        return (List) this.supertypes$delegate.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public boolean isDenotable() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public TypeConstructor refine(KotlinTypeRefiner kotlinTypeRefiner) {
        kotlinTypeRefiner.getClass();
        return this;
    }

    public String toString() {
        return "IntegerLiteralType".concat("[" + CollectionsKt.joinToString$default(this.possibleTypes, ",", null, null, 0, null, IntegerLiteralTypeConstructor$$Lambda$1.INSTANCE, 30) + ']');
    }
}
