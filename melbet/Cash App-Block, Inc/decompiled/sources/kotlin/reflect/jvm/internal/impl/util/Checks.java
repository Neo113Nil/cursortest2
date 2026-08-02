package kotlin.reflect.jvm.internal.impl.util;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ImplicitClassReceiver;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.util.CheckResult;
import kotlin.reflect.jvm.internal.impl.util.ReturnsCheck;
import kotlin.text.Regex;

/* loaded from: classes9.dex */
public final class Checks {
    public final Function1 additionalCheck;
    public final Check[] checks;
    public final Name name;
    public final Collection nameList;
    public final Regex regex;

    /* renamed from: kotlin.reflect.jvm.internal.impl.util.Checks$2, reason: invalid class name */
    public final class AnonymousClass2 implements Function1 {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2(0);
        public static final AnonymousClass2 INSTANCE$1 = new AnonymousClass2(1);
        public static final AnonymousClass2 INSTANCE$2 = new AnonymousClass2(2);
        public static final AnonymousClass2 INSTANCE$3 = new AnonymousClass2(3);
        public static final AnonymousClass2 INSTANCE$4 = new AnonymousClass2(4);
        public static final AnonymousClass2 INSTANCE$5 = new AnonymousClass2(5);
        public static final AnonymousClass2 INSTANCE$6 = new AnonymousClass2(6);
        public static final AnonymousClass2 INSTANCE$7 = new AnonymousClass2(7);
        public static final AnonymousClass2 INSTANCE$8 = new AnonymousClass2(8);
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ AnonymousClass2(int i) {
            this.$r8$classId = i;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            boolean z;
            ClassId classId;
            KotlinType returnType;
            switch (this.$r8$classId) {
                case 0:
                    ((FunctionDescriptor) obj).getClass();
                    return null;
                case 1:
                    ((FunctionDescriptor) obj).getClass();
                    return null;
                case 2:
                    ((FunctionDescriptor) obj).getClass();
                    return null;
                case 3:
                    FunctionDescriptor functionDescriptor = (FunctionDescriptor) obj;
                    OperatorChecks operatorChecks = OperatorChecks.INSTANCE;
                    functionDescriptor.getClass();
                    List<ValueParameterDescriptor> valueParameters = functionDescriptor.getValueParameters();
                    valueParameters.getClass();
                    ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) CollectionsKt.lastOrNull((List) valueParameters);
                    if (valueParameterDescriptor == null || DescriptorUtilsKt.declaresOrInheritsDefaultValue(valueParameterDescriptor) || valueParameterDescriptor.getVarargElementType() != null) {
                        return "last parameter should not have a default value or be a vararg";
                    }
                    return null;
                case 4:
                    FunctionDescriptor functionDescriptor2 = (FunctionDescriptor) obj;
                    OperatorChecks operatorChecks2 = OperatorChecks.INSTANCE;
                    functionDescriptor2.getClass();
                    DeclarationDescriptor containingDeclaration = functionDescriptor2.getContainingDeclaration();
                    containingDeclaration.getClass();
                    if ((containingDeclaration instanceof ClassDescriptor) && KotlinBuiltIns.isAny((ClassDescriptor) containingDeclaration)) {
                        return null;
                    }
                    Collection<? extends FunctionDescriptor> overriddenDescriptors = functionDescriptor2.getOverriddenDescriptors();
                    overriddenDescriptors.getClass();
                    Collection<? extends FunctionDescriptor> collection = overriddenDescriptors;
                    if (!collection.isEmpty()) {
                        Iterator<T> it = collection.iterator();
                        while (it.hasNext()) {
                            DeclarationDescriptor containingDeclaration2 = ((FunctionDescriptor) it.next()).getContainingDeclaration();
                            containingDeclaration2.getClass();
                            if ((containingDeclaration2 instanceof ClassDescriptor) && KotlinBuiltIns.isAny((ClassDescriptor) containingDeclaration2)) {
                                return null;
                            }
                        }
                    }
                    if (DescriptorUtilKt.isTypedEqualsInValueClass(functionDescriptor2)) {
                        return null;
                    }
                    StringBuilder sb = new StringBuilder("must override ''equals()'' in Any");
                    DeclarationDescriptor containingDeclaration3 = functionDescriptor2.getContainingDeclaration();
                    containingDeclaration3.getClass();
                    if (InlineClassesUtilsKt.isValueClass(containingDeclaration3)) {
                        DescriptorRenderer descriptorRenderer = DescriptorRenderer.SHORT_NAMES_IN_TYPES;
                        DeclarationDescriptor containingDeclaration4 = functionDescriptor2.getContainingDeclaration();
                        containingDeclaration4.getClass();
                        SimpleType defaultType = ((ClassDescriptor) containingDeclaration4).getDefaultType();
                        defaultType.getClass();
                        sb.append(" or define ''equals(other: " + descriptorRenderer.renderType(TypeUtilsKt.replaceArgumentsWithStarProjections(defaultType)) + "): Boolean''");
                    }
                    return sb.toString();
                case 5:
                    FunctionDescriptor functionDescriptor3 = (FunctionDescriptor) obj;
                    OperatorChecks operatorChecks3 = OperatorChecks.INSTANCE;
                    functionDescriptor3.getClass();
                    ReceiverParameterDescriptor dispatchReceiverParameter = functionDescriptor3.getDispatchReceiverParameter();
                    if (dispatchReceiverParameter == null) {
                        dispatchReceiverParameter = functionDescriptor3.getExtensionReceiverParameter();
                    }
                    OperatorChecks operatorChecks4 = OperatorChecks.INSTANCE;
                    if (dispatchReceiverParameter != null) {
                        KotlinType returnType2 = functionDescriptor3.getReturnType();
                        boolean z2 = false;
                        if (returnType2 != null) {
                            KotlinType type2 = dispatchReceiverParameter.getType();
                            type2.getClass();
                            z = TypeUtilsKt.isSubtypeOf(returnType2, type2);
                        } else {
                            z = false;
                        }
                        if (z) {
                            return null;
                        }
                        operatorChecks4.getClass();
                        ReceiverValue value = dispatchReceiverParameter.getValue();
                        value.getClass();
                        if (value instanceof ImplicitClassReceiver) {
                            ClassDescriptor classDescriptor = ((ImplicitClassReceiver) value).getClassDescriptor();
                            if (classDescriptor.isExpect() && (classId = DescriptorUtilsKt.getClassId(classDescriptor)) != null) {
                                ClassifierDescriptor findClassifierAcrossModuleDependencies = FindClassInModuleKt.findClassifierAcrossModuleDependencies(DescriptorUtilsKt.getModule(classDescriptor), classId);
                                TypeAliasDescriptor typeAliasDescriptor = findClassifierAcrossModuleDependencies instanceof TypeAliasDescriptor ? (TypeAliasDescriptor) findClassifierAcrossModuleDependencies : null;
                                if (typeAliasDescriptor != null && (returnType = functionDescriptor3.getReturnType()) != null) {
                                    z2 = TypeUtilsKt.isSubtypeOf(returnType, typeAliasDescriptor.getExpandedType());
                                }
                            }
                        }
                        if (z2) {
                            return null;
                        }
                    }
                    return "receiver must be a supertype of the return type";
                case 6:
                    KotlinBuiltIns kotlinBuiltIns = (KotlinBuiltIns) obj;
                    ReturnsCheck.ReturnsBoolean returnsBoolean = ReturnsCheck.ReturnsBoolean.INSTANCE;
                    kotlinBuiltIns.getClass();
                    SimpleType booleanType = kotlinBuiltIns.getBooleanType();
                    booleanType.getClass();
                    return booleanType;
                case 7:
                    KotlinBuiltIns kotlinBuiltIns2 = (KotlinBuiltIns) obj;
                    ReturnsCheck.ReturnsInt returnsInt = ReturnsCheck.ReturnsInt.INSTANCE;
                    kotlinBuiltIns2.getClass();
                    SimpleType intType = kotlinBuiltIns2.getIntType();
                    intType.getClass();
                    return intType;
                default:
                    KotlinBuiltIns kotlinBuiltIns3 = (KotlinBuiltIns) obj;
                    ReturnsCheck.ReturnsUnit returnsUnit = ReturnsCheck.ReturnsUnit.INSTANCE;
                    kotlinBuiltIns3.getClass();
                    SimpleType unitType = kotlinBuiltIns3.getUnitType();
                    unitType.getClass();
                    return unitType;
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Checks(Name name, Check[] checkArr, Function1<? super FunctionDescriptor, String> function1) {
        this(name, (Regex) null, (Collection) null, function1, (Check[]) Arrays.copyOf(checkArr, checkArr.length));
        name.getClass();
        checkArr.getClass();
        function1.getClass();
    }

    public final CheckResult checkAll(FunctionDescriptor functionDescriptor) {
        functionDescriptor.getClass();
        for (Check check : this.checks) {
            String invoke = check.invoke(functionDescriptor);
            if (invoke != null) {
                return new CheckResult.IllegalSignature(invoke);
            }
        }
        String str = (String) this.additionalCheck.invoke(functionDescriptor);
        return str != null ? new CheckResult.IllegalSignature(str) : CheckResult.SuccessCheck.INSTANCE;
    }

    public final boolean isApplicable(FunctionDescriptor functionDescriptor) {
        functionDescriptor.getClass();
        Name name = this.name;
        if (name != null && !Intrinsics.areEqual(functionDescriptor.getName(), name)) {
            return false;
        }
        Regex regex = this.regex;
        if (regex != null) {
            String asString = functionDescriptor.getName().asString();
            asString.getClass();
            if (!regex.matches(asString)) {
                return false;
            }
        }
        Collection collection = this.nameList;
        return collection == null || collection.contains(functionDescriptor.getName());
    }

    public /* synthetic */ Checks(Name name, Check[] checkArr, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(name, checkArr, (Function1<? super FunctionDescriptor, String>) ((i & 4) != 0 ? AnonymousClass2.INSTANCE : function1));
    }

    public Checks(Name name, Regex regex, Collection collection, Function1 function1, Check... checkArr) {
        this.name = name;
        this.regex = regex;
        this.nameList = collection;
        this.additionalCheck = function1;
        this.checks = checkArr;
    }

    public /* synthetic */ Checks(Regex regex, Check[] checkArr, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(regex, checkArr, (Function1<? super FunctionDescriptor, String>) ((i & 4) != 0 ? AnonymousClass2.INSTANCE$1 : function1));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Checks(Regex regex, Check[] checkArr, Function1<? super FunctionDescriptor, String> function1) {
        this((Name) null, regex, (Collection) null, function1, (Check[]) Arrays.copyOf(checkArr, checkArr.length));
        regex.getClass();
        checkArr.getClass();
        function1.getClass();
    }

    public /* synthetic */ Checks(Collection collection, Check[] checkArr, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((Collection<Name>) collection, checkArr, (Function1<? super FunctionDescriptor, String>) ((i & 4) != 0 ? AnonymousClass2.INSTANCE$2 : function1));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Checks(Collection<Name> collection, Check[] checkArr, Function1<? super FunctionDescriptor, String> function1) {
        this((Name) null, (Regex) null, collection, function1, (Check[]) Arrays.copyOf(checkArr, checkArr.length));
        collection.getClass();
        checkArr.getClass();
        function1.getClass();
    }
}
