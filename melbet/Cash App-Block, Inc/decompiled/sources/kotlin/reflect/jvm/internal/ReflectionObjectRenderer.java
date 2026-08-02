package kotlin.reflect.jvm.internal;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.KTypeParameterBase;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KCallable;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KFunction;
import kotlin.reflect.KMutableProperty;
import kotlin.reflect.KParameter$Kind;
import kotlin.reflect.KProperty;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.full.KCallables;
import kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.renderer.RenderingUtilsKt;
import kotlin.reflect.jvm.internal.types.AbstractKType;
import kotlin.text.StringsKt__StringsJVMKt;
import papa.PapaEvent;

/* loaded from: classes9.dex */
public final class ReflectionObjectRenderer {
    public static void appendContexts(StringBuilder sb, KCallable kCallable) {
        List parameters = kCallable.getParameters();
        ArrayList arrayList = new ArrayList();
        for (Object obj : parameters) {
            if (((ReflectKParameter) obj).getKind() == KParameter$Kind.CONTEXT) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        CollectionsKt.joinTo$default(arrayList, sb, null, "context(", ") ", UtilKt$$Lambda$0.INSTANCE$16, 50);
    }

    public static void appendName(StringBuilder sb, String str) {
        Name identifier = Name.identifier(str);
        identifier.getClass();
        sb.append(RenderingUtilsKt.render$default(identifier, false, 1, null));
    }

    public static void appendReceivers(StringBuilder sb, KCallable kCallable) {
        List allParameters = ((ReflectKCallable) kCallable).getAllParameters();
        ArrayList arrayList = new ArrayList();
        for (Object obj : allParameters) {
            ReflectKParameter reflectKParameter = (ReflectKParameter) obj;
            if (reflectKParameter.getKind() == KParameter$Kind.INSTANCE || reflectKParameter.getKind() == KParameter$Kind.EXTENSION_RECEIVER) {
                arrayList.add(obj);
            }
        }
        ReflectKParameter reflectKParameter2 = (ReflectKParameter) CollectionsKt.getOrNull(0, arrayList);
        if (reflectKParameter2 != null) {
            sb.append(renderType(reflectKParameter2.getType(), false));
            sb.append(".");
        }
        ReflectKParameter reflectKParameter3 = (ReflectKParameter) CollectionsKt.getOrNull(1, arrayList);
        if (reflectKParameter3 != null) {
            sb.append("(");
            sb.append(renderType(reflectKParameter3.getType(), false));
            sb.append(".");
            sb.append(")");
        }
    }

    public static String renderFunction(KFunction kFunction) {
        StringBuilder sb = new StringBuilder();
        appendContexts(sb, kFunction);
        sb.append("fun ");
        appendReceivers(sb, kFunction);
        appendName(sb, kFunction.getName());
        CollectionsKt.joinTo$default(KCallables.getValueParameters(kFunction), sb, ", ", "(", ")", UtilKt$$Lambda$0.INSTANCE$17, 48);
        sb.append(": ");
        sb.append(renderType(kFunction.getReturnType(), false));
        return sb.toString();
    }

    public static String renderLambda(DescriptorKFunction descriptorKFunction) {
        StringBuilder sb = new StringBuilder();
        Iterator it = descriptorKFunction.getParameters().iterator();
        Object obj = null;
        Object obj2 = null;
        boolean z = false;
        while (true) {
            if (it.hasNext()) {
                Object next = it.next();
                if (((ReflectKParameter) next).getKind() == KParameter$Kind.EXTENSION_RECEIVER) {
                    if (z) {
                        break;
                    }
                    z = true;
                    obj2 = next;
                }
            } else if (z) {
                obj = obj2;
            }
        }
        ReflectKParameter reflectKParameter = (ReflectKParameter) obj;
        if (reflectKParameter != null) {
            sb.append(renderType(reflectKParameter.getType(), false));
            sb.append(".");
        }
        CollectionsKt.joinTo$default(KCallables.getValueParameters(descriptorKFunction), sb, ", ", "(", ")", UtilKt$$Lambda$0.INSTANCE$18, 48);
        sb.append(" -> ");
        sb.append(renderType(descriptorKFunction.getReturnType(), false));
        return sb.toString();
    }

    public static String renderProperty(KProperty kProperty) {
        StringBuilder sb = new StringBuilder();
        appendContexts(sb, kProperty);
        sb.append(kProperty instanceof KMutableProperty ? "var " : "val ");
        appendReceivers(sb, kProperty);
        appendName(sb, kProperty.getName());
        sb.append(": ");
        sb.append(renderType(kProperty.getReturnType(), false));
        return sb.toString();
    }

    public static void renderSimpleType(StringBuilder sb, KClass kClass, FqNameUnsafe fqNameUnsafe, List list, boolean z, boolean z2) {
        StringBuilder sb2;
        boolean z3;
        if (kClass.getTypeParameters().size() >= list.size() || PapaEvent.getJavaClass(kClass).getDeclaringClass() == null) {
            sb2 = sb;
            z3 = z2;
            sb2.append(RenderingUtilsKt.render(fqNameUnsafe));
        } else {
            Class<?> declaringClass = PapaEvent.getJavaClass(kClass).getDeclaringClass();
            declaringClass.getClass();
            sb2 = sb;
            z3 = z2;
            renderSimpleType(sb2, Reflection.factory.getOrCreateKotlinClass(declaringClass), fqNameUnsafe.parent(), CollectionsKt.drop(list, kClass.getTypeParameters().size()), false, z3);
            sb2.append(".");
            sb2.append(RenderingUtilsKt.render$default(fqNameUnsafe.shortName(), false, 1, null));
        }
        renderTypeArgumentsAndNullability(sb2, CollectionsKt.take(list, kClass.getTypeParameters().size()), z, z3);
    }

    public static String renderType(KType kType, boolean z) {
        FqNameUnsafe fqNameUnsafe;
        kType.getClass();
        AbstractKType abstractKType = (AbstractKType) kType;
        final int i = 1;
        if (abstractKType.isRawType()) {
            AbstractKType lowerBoundIfFlexible = abstractKType.lowerBoundIfFlexible();
            lowerBoundIfFlexible.getClass();
            return renderType(lowerBoundIfFlexible, true);
        }
        AbstractKType lowerBoundIfFlexible2 = abstractKType.lowerBoundIfFlexible();
        AbstractKType upperBoundIfFlexible = abstractKType.upperBoundIfFlexible();
        if (lowerBoundIfFlexible2 != null && upperBoundIfFlexible != null) {
            final String renderType$default = renderType$default(lowerBoundIfFlexible2);
            String renderType$default2 = renderType$default(upperBoundIfFlexible);
            if (Intrinsics.areEqual(renderType$default, StringsKt__StringsJVMKt.replace$default(renderType$default2, "?", ""))) {
                return StringsKt__StringsJVMKt.replace$default(renderType$default2, "?", "!");
            }
            final int i2 = 0;
            if (StringsKt__StringsJVMKt.endsWith(renderType$default2, "?", false)) {
                if ((renderType$default + '?').equals(renderType$default2)) {
                    return renderType$default + '!';
                }
            }
            if (("(" + renderType$default + ")?").equals(renderType$default2)) {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("(", renderType$default, ")!");
            }
            String renderFlexibleMutabilityOrArrayElementVarianceType$default = RenderingUtilsKt.renderFlexibleMutabilityOrArrayElementVarianceType$default(renderType$default, renderType$default2, new Function0(renderType$default, i2) { // from class: kotlin.reflect.jvm.internal.ReflectionObjectRenderer$$Lambda$5
                public final /* synthetic */ int $r8$classId;
                public final String arg$0;

                {
                    this.$r8$classId = i2;
                    this.arg$0 = renderType$default;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String str;
                    int i3 = this.$r8$classId;
                    String str2 = this.arg$0;
                    switch (i3) {
                        case 0:
                            String str3 = StandardNames.COLLECTIONS_PACKAGE_FQ_NAME.asString() + '.';
                            str = StringsKt__StringsJVMKt.startsWith(str2, str3, false) ? str3 : null;
                            if (str != null) {
                                break;
                            }
                            break;
                        default:
                            String str4 = StandardNames.BUILT_INS_PACKAGE_FQ_NAME.asString() + '.';
                            str = StringsKt__StringsJVMKt.startsWith(str2, str4, false) ? str4 : null;
                            if (str != null) {
                                break;
                            }
                            break;
                    }
                    return str;
                }
            }, new Function0(renderType$default, i) { // from class: kotlin.reflect.jvm.internal.ReflectionObjectRenderer$$Lambda$5
                public final /* synthetic */ int $r8$classId;
                public final String arg$0;

                {
                    this.$r8$classId = i;
                    this.arg$0 = renderType$default;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String str;
                    int i3 = this.$r8$classId;
                    String str2 = this.arg$0;
                    switch (i3) {
                        case 0:
                            String str3 = StandardNames.COLLECTIONS_PACKAGE_FQ_NAME.asString() + '.';
                            str = StringsKt__StringsJVMKt.startsWith(str2, str3, false) ? str3 : null;
                            if (str != null) {
                                break;
                            }
                            break;
                        default:
                            String str4 = StandardNames.BUILT_INS_PACKAGE_FQ_NAME.asString() + '.';
                            str = StringsKt__StringsJVMKt.startsWith(str2, str4, false) ? str4 : null;
                            if (str != null) {
                                break;
                            }
                            break;
                    }
                    return str;
                }
            }, null, 16, null);
            if (renderFlexibleMutabilityOrArrayElementVarianceType$default != null) {
                return renderFlexibleMutabilityOrArrayElementVarianceType$default;
            }
            return "(" + renderType$default + ".." + renderType$default2 + ')';
        }
        StringBuilder sb = new StringBuilder();
        KType abbreviation = abstractKType.getAbbreviation();
        if (abbreviation != null) {
            sb.append(abbreviation);
            sb.append(" /* = ");
        }
        KClassifier classifier = kType.getClassifier();
        if (classifier instanceof KTypeParameterBase) {
            appendName(sb, ((KTypeParameterImpl) ((KTypeParameterBase) classifier)).name);
            if (kType.isMarkedNullable()) {
                sb.append("?");
            } else if (abstractKType.isDefinitelyNotNullType()) {
                sb.append(" & Any");
            }
        } else if (classifier instanceof KClass) {
            KClass kClass = (KClass) classifier;
            if (abstractKType.isNothingType()) {
                fqNameUnsafe = StandardNames.FqNames.nothing;
            } else {
                KClass mutableCollectionClass = abstractKType.getMutableCollectionClass();
                if (mutableCollectionClass == null) {
                    mutableCollectionClass = kClass;
                }
                String qualifiedName = mutableCollectionClass.getQualifiedName();
                fqNameUnsafe = qualifiedName != null ? new FqNameUnsafe(qualifiedName) : null;
            }
            if (fqNameUnsafe == null) {
                fqNameUnsafe = new FqNameUnsafe(((KClassImpl) kClass).jClass.getName());
            }
            if (FunctionTypesKt.isNumberedFunctionClassFqName(fqNameUnsafe)) {
                List arguments = kType.getArguments();
                KTypeProjection.INSTANCE.getClass();
                if (!arguments.contains(KTypeProjection.star)) {
                    if (abstractKType.isMarkedNullable()) {
                        sb.append("(");
                    }
                    if (abstractKType.isSuspendFunctionType()) {
                        sb.append("suspend ");
                    }
                    CollectionsKt.joinTo$default(CollectionsKt.dropLast(1, abstractKType.getArguments()), sb, null, "(", ") -> ", null, 114);
                    sb.append(CollectionsKt.last(abstractKType.getArguments()));
                    if (abstractKType.isMarkedNullable()) {
                        sb.append(")?");
                    }
                }
            }
            renderSimpleType(sb, kClass, fqNameUnsafe, kType.getArguments(), kType.isMarkedNullable(), z);
        } else if (classifier instanceof KTypeAliasImpl) {
            CollectionsKt.joinTo$default(((KTypeAliasImpl) classifier).fqName.pathSegments(), sb, ".", null, null, UtilKt$$Lambda$0.INSTANCE$19, 60);
            sb = sb;
            renderTypeArgumentsAndNullability(sb, kType.getArguments(), kType.isMarkedNullable(), z);
        } else {
            sb.append("???");
        }
        if (abstractKType.getAbbreviation() != null) {
            sb.append(" */");
        }
        return sb.toString();
    }

    public static /* synthetic */ String renderType$default(KType kType) {
        return renderType(kType, false);
    }

    public static void renderTypeArgumentsAndNullability(StringBuilder sb, List list, boolean z, boolean z2) {
        StringBuilder sb2;
        if (list.isEmpty()) {
            sb2 = sb;
        } else {
            sb2 = sb;
            CollectionsKt.joinTo$default(list, sb2, null, "<", ">", new ReflectionObjectRenderer$$Lambda$4(z2, 0), 50);
        }
        if (z) {
            sb2.append("?");
        }
    }
}
