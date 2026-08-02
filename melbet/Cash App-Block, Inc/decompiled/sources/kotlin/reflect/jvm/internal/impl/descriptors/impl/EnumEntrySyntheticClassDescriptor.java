package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.KotlinKPropertyN$$Lambda$0;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.ClassTypeConstructorImpl;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* loaded from: classes9.dex */
public class EnumEntrySyntheticClassDescriptor extends ClassDescriptorBase {
    public final Annotations annotations;
    public final NotNullLazyValue enumMemberNames;
    public final EnumEntryScope scope;
    public final ClassTypeConstructorImpl typeConstructor;

    public final class EnumEntryScope extends MemberScopeImpl {
        public final NotNullLazyValue allDescriptors;
        public final MemoizedFunctionToNotNull functions;
        public final MemoizedFunctionToNotNull properties;
        public final /* synthetic */ EnumEntrySyntheticClassDescriptor this$0;

        /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x002d  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0090  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0095  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00a5  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00a8  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00ad  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00b5 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00be  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0032  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x003c  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0041  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0049  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x004e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static /* synthetic */ void $$$reportNull$$$0(int i) {
            String str;
            int i2;
            if (i != 3 && i != 7 && i != 9 && i != 12) {
                switch (i) {
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        break;
                    default:
                        str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                        break;
                }
                if (i != 3 && i != 7 && i != 9 && i != 12) {
                    switch (i) {
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                            break;
                        default:
                            i2 = 3;
                            break;
                    }
                    Object[] objArr = new Object[i2];
                    switch (i) {
                        case 1:
                        case 4:
                        case 5:
                        case 8:
                        case 10:
                            objArr[0] = "name";
                            break;
                        case 2:
                        case 6:
                            objArr[0] = "location";
                            break;
                        case 3:
                        case 7:
                        case 9:
                        case 12:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                            break;
                        case 11:
                            objArr[0] = "fromSupertypes";
                            break;
                        case 13:
                            objArr[0] = "kindFilter";
                            break;
                        case 14:
                            objArr[0] = "nameFilter";
                            break;
                        case 20:
                            objArr[0] = "p";
                            break;
                        default:
                            objArr[0] = "storageManager";
                            break;
                    }
                    if (i != 3) {
                        objArr[1] = "getContributedVariables";
                    } else if (i == 7) {
                        objArr[1] = "getContributedFunctions";
                    } else if (i == 9) {
                        objArr[1] = "getSupertypeScope";
                    } else if (i != 12) {
                        switch (i) {
                            case 15:
                                objArr[1] = "getContributedDescriptors";
                                break;
                            case 16:
                                objArr[1] = "computeAllDeclarations";
                                break;
                            case 17:
                                objArr[1] = "getFunctionNames";
                                break;
                            case 18:
                                objArr[1] = "getClassifierNames";
                                break;
                            case 19:
                                objArr[1] = "getVariableNames";
                                break;
                            default:
                                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                                break;
                        }
                    } else {
                        objArr[1] = "resolveFakeOverrides";
                    }
                    switch (i) {
                        case 1:
                        case 2:
                            objArr[2] = "getContributedVariables";
                            break;
                        case 3:
                        case 7:
                        case 9:
                        case 12:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                            break;
                        case 4:
                            objArr[2] = "computeProperties";
                            break;
                        case 5:
                        case 6:
                            objArr[2] = "getContributedFunctions";
                            break;
                        case 8:
                            objArr[2] = "computeFunctions";
                            break;
                        case 10:
                        case 11:
                            objArr[2] = "resolveFakeOverrides";
                            break;
                        case 13:
                        case 14:
                            objArr[2] = "getContributedDescriptors";
                            break;
                        case 20:
                            objArr[2] = "printScopeStructure";
                            break;
                        default:
                            objArr[2] = "<init>";
                            break;
                    }
                    String format2 = String.format(str, objArr);
                    if (i != 3 && i != 7 && i != 9 && i != 12) {
                        switch (i) {
                            case 15:
                            case 16:
                            case 17:
                            case 18:
                            case 19:
                                break;
                            default:
                                throw new IllegalArgumentException(format2);
                        }
                    }
                    throw new IllegalStateException(format2);
                }
                i2 = 2;
                Object[] objArr2 = new Object[i2];
                switch (i) {
                }
                if (i != 3) {
                }
                switch (i) {
                }
                String format22 = String.format(str, objArr2);
                if (i != 3) {
                    switch (i) {
                    }
                }
                throw new IllegalStateException(format22);
            }
            str = "@NotNull method %s.%s must not return null";
            if (i != 3) {
                switch (i) {
                }
                Object[] objArr22 = new Object[i2];
                switch (i) {
                }
                if (i != 3) {
                }
                switch (i) {
                }
                String format222 = String.format(str, objArr22);
                if (i != 3) {
                }
                throw new IllegalStateException(format222);
            }
            i2 = 2;
            Object[] objArr222 = new Object[i2];
            switch (i) {
            }
            if (i != 3) {
            }
            switch (i) {
            }
            String format2222 = String.format(str, objArr222);
            if (i != 3) {
            }
            throw new IllegalStateException(format2222);
        }

        public EnumEntryScope(EnumEntrySyntheticClassDescriptor enumEntrySyntheticClassDescriptor, StorageManager storageManager) {
            final int i = 0;
            if (storageManager == null) {
                $$$reportNull$$$0(0);
                throw null;
            }
            this.this$0 = enumEntrySyntheticClassDescriptor;
            this.functions = storageManager.createMemoizedFunction(new Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor.EnumEntryScope.1
                public final /* synthetic */ EnumEntryScope this$1;

                {
                    this.this$1 = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i2 = i;
                    EnumEntryScope enumEntryScope = this.this$1;
                    switch (i2) {
                        case 0:
                            Name name = (Name) obj;
                            if (name == null) {
                                EnumEntryScope.$$$reportNull$$$0(8);
                                throw null;
                            }
                            MemberScope memberScope = enumEntryScope.this$0.getTypeConstructor().getSupertypes().iterator().next().getMemberScope();
                            if (memberScope != null) {
                                return enumEntryScope.resolveFakeOverrides(name, memberScope.getContributedFunctions(name, NoLookupLocation.FOR_NON_TRACKED_SCOPE));
                            }
                            EnumEntryScope.$$$reportNull$$$0(9);
                            throw null;
                        default:
                            Name name2 = (Name) obj;
                            if (name2 == null) {
                                EnumEntryScope.$$$reportNull$$$0(4);
                                throw null;
                            }
                            MemberScope memberScope2 = enumEntryScope.this$0.getTypeConstructor().getSupertypes().iterator().next().getMemberScope();
                            if (memberScope2 != null) {
                                return enumEntryScope.resolveFakeOverrides(name2, memberScope2.getContributedVariables(name2, NoLookupLocation.FOR_NON_TRACKED_SCOPE));
                            }
                            EnumEntryScope.$$$reportNull$$$0(9);
                            throw null;
                    }
                }
            });
            final int i2 = 1;
            this.properties = storageManager.createMemoizedFunction(new Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor.EnumEntryScope.1
                public final /* synthetic */ EnumEntryScope this$1;

                {
                    this.this$1 = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i22 = i2;
                    EnumEntryScope enumEntryScope = this.this$1;
                    switch (i22) {
                        case 0:
                            Name name = (Name) obj;
                            if (name == null) {
                                EnumEntryScope.$$$reportNull$$$0(8);
                                throw null;
                            }
                            MemberScope memberScope = enumEntryScope.this$0.getTypeConstructor().getSupertypes().iterator().next().getMemberScope();
                            if (memberScope != null) {
                                return enumEntryScope.resolveFakeOverrides(name, memberScope.getContributedFunctions(name, NoLookupLocation.FOR_NON_TRACKED_SCOPE));
                            }
                            EnumEntryScope.$$$reportNull$$$0(9);
                            throw null;
                        default:
                            Name name2 = (Name) obj;
                            if (name2 == null) {
                                EnumEntryScope.$$$reportNull$$$0(4);
                                throw null;
                            }
                            MemberScope memberScope2 = enumEntryScope.this$0.getTypeConstructor().getSupertypes().iterator().next().getMemberScope();
                            if (memberScope2 != null) {
                                return enumEntryScope.resolveFakeOverrides(name2, memberScope2.getContributedVariables(name2, NoLookupLocation.FOR_NON_TRACKED_SCOPE));
                            }
                            EnumEntryScope.$$$reportNull$$$0(9);
                            throw null;
                    }
                }
            });
            this.allDescriptors = storageManager.createLazyValue(new KotlinKPropertyN$$Lambda$0(this, 10));
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        public final Set getClassifierNames() {
            Set set = Collections.EMPTY_SET;
            if (set != null) {
                return set;
            }
            $$$reportNull$$$0(18);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
        public final Collection getContributedDescriptors(DescriptorKindFilter descriptorKindFilter, Function1 function1) {
            if (descriptorKindFilter == null) {
                $$$reportNull$$$0(13);
                throw null;
            }
            if (function1 == null) {
                $$$reportNull$$$0(14);
                throw null;
            }
            Collection collection = (Collection) this.allDescriptors.invoke();
            if (collection != null) {
                return collection;
            }
            $$$reportNull$$$0(15);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
        public final Collection getContributedFunctions(Name name, LookupLocation lookupLocation) {
            if (name == null) {
                $$$reportNull$$$0(5);
                throw null;
            }
            if (lookupLocation == null) {
                $$$reportNull$$$0(6);
                throw null;
            }
            Collection collection = (Collection) this.functions.invoke(name);
            if (collection != null) {
                return collection;
            }
            $$$reportNull$$$0(7);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        public final Collection getContributedVariables(Name name, LookupLocation lookupLocation) {
            if (name == null) {
                $$$reportNull$$$0(1);
                throw null;
            }
            if (lookupLocation == null) {
                $$$reportNull$$$0(2);
                throw null;
            }
            Collection collection = (Collection) this.properties.invoke(name);
            if (collection != null) {
                return collection;
            }
            $$$reportNull$$$0(3);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        public final Set getFunctionNames() {
            Set set = (Set) this.this$0.enumMemberNames.invoke();
            if (set != null) {
                return set;
            }
            $$$reportNull$$$0(17);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        public final Set getVariableNames() {
            Set set = (Set) this.this$0.enumMemberNames.invoke();
            if (set != null) {
                return set;
            }
            $$$reportNull$$$0(19);
            throw null;
        }

        public final LinkedHashSet resolveFakeOverrides(Name name, Collection collection) {
            if (name == null) {
                $$$reportNull$$$0(10);
                throw null;
            }
            if (collection == null) {
                $$$reportNull$$$0(11);
                throw null;
            }
            final LinkedHashSet linkedHashSet = new LinkedHashSet();
            OverridingUtil.DEFAULT.generateOverridesInFunctionGroup(name, collection, Collections.EMPTY_SET, this.this$0, new NonReportingOverrideStrategy() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor.EnumEntryScope.4
                public static /* synthetic */ void $$$reportNull$$$0(int i) {
                    Object[] objArr = new Object[3];
                    if (i == 1) {
                        objArr[0] = "fromSuper";
                    } else if (i != 2) {
                        objArr[0] = "fakeOverride";
                    } else {
                        objArr[0] = "fromCurrent";
                    }
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope$4";
                    if (i == 1 || i == 2) {
                        objArr[2] = "conflict";
                    } else {
                        objArr[2] = "addFakeOverride";
                    }
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
                }

                @Override // kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy
                public final void addFakeOverride(CallableMemberDescriptor callableMemberDescriptor) {
                    if (callableMemberDescriptor == null) {
                        $$$reportNull$$$0(0);
                        throw null;
                    }
                    OverridingUtil.resolveUnknownVisibilityForMember(callableMemberDescriptor, null);
                    linkedHashSet.add(callableMemberDescriptor);
                }

                @Override // kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy
                public final void conflict(CallableMemberDescriptor callableMemberDescriptor, CallableMemberDescriptor callableMemberDescriptor2) {
                    if (callableMemberDescriptor == null) {
                        $$$reportNull$$$0(1);
                        throw null;
                    }
                    if (callableMemberDescriptor2 != null) {
                        return;
                    }
                    $$$reportNull$$$0(2);
                    throw null;
                }
            });
            return linkedHashSet;
        }
    }

    public static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str;
        int i2;
        switch (i) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "enumClass";
                break;
            case 2:
            case 9:
                objArr[0] = "name";
                break;
            case 3:
            case 10:
                objArr[0] = "enumMemberNames";
                break;
            case 4:
            case 11:
                objArr[0] = "annotations";
                break;
            case 5:
            case 12:
                objArr[0] = "source";
                break;
            case 6:
            default:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "containingClass";
                break;
            case 8:
                objArr[0] = "supertype";
                break;
            case 13:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i) {
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getConstructors";
                break;
            case 17:
                objArr[1] = "getTypeConstructor";
                break;
            case 18:
                objArr[1] = "getKind";
                break;
            case 19:
                objArr[1] = "getModality";
                break;
            case 20:
                objArr[1] = "getVisibility";
                break;
            case 21:
                objArr[1] = "getAnnotations";
                break;
            case 22:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 23:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "<init>";
                break;
            case 13:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                break;
            default:
                objArr[2] = "create";
                break;
        }
        String format2 = String.format(str, objArr);
        switch (i) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                throw new IllegalStateException(format2);
            default:
                throw new IllegalArgumentException(format2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnumEntrySyntheticClassDescriptor(StorageManager storageManager, ClassDescriptor classDescriptor, SimpleType simpleType, Name name, NotNullLazyValue notNullLazyValue, Annotations annotations, SourceElement sourceElement) {
        super(storageManager, classDescriptor, name, sourceElement, false);
        if (storageManager == null) {
            $$$reportNull$$$0(6);
            throw null;
        }
        if (simpleType == null) {
            $$$reportNull$$$0(8);
            throw null;
        }
        if (name == null) {
            $$$reportNull$$$0(9);
            throw null;
        }
        if (notNullLazyValue == null) {
            $$$reportNull$$$0(10);
            throw null;
        }
        if (annotations == null) {
            $$$reportNull$$$0(11);
            throw null;
        }
        if (sourceElement == null) {
            $$$reportNull$$$0(12);
            throw null;
        }
        this.annotations = annotations;
        this.typeConstructor = new ClassTypeConstructorImpl(this, Collections.EMPTY_LIST, Collections.singleton(simpleType), storageManager);
        this.scope = new EnumEntryScope(this, storageManager);
        this.enumMemberNames = notNullLazyValue;
    }

    public static EnumEntrySyntheticClassDescriptor create(StorageManager storageManager, ClassDescriptor classDescriptor, Name name, NotNullLazyValue<Set<Name>> notNullLazyValue, Annotations annotations, SourceElement sourceElement) {
        if (storageManager == null) {
            $$$reportNull$$$0(0);
            throw null;
        }
        if (classDescriptor == null) {
            $$$reportNull$$$0(1);
            throw null;
        }
        if (name == null) {
            $$$reportNull$$$0(2);
            throw null;
        }
        if (notNullLazyValue == null) {
            $$$reportNull$$$0(3);
            throw null;
        }
        if (annotations == null) {
            $$$reportNull$$$0(4);
            throw null;
        }
        if (sourceElement != null) {
            return new EnumEntrySyntheticClassDescriptor(storageManager, classDescriptor, classDescriptor.getDefaultType(), name, notNullLazyValue, annotations, sourceElement);
        }
        $$$reportNull$$$0(5);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public Annotations getAnnotations() {
        Annotations annotations = this.annotations;
        if (annotations != null) {
            return annotations;
        }
        $$$reportNull$$$0(21);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* renamed from: getCompanionObjectDescriptor */
    public ClassDescriptor mo4141getCompanionObjectDescriptor() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public Collection<ClassConstructorDescriptor> getConstructors() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        $$$reportNull$$$0(16);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public List<TypeParameterDescriptor> getDeclaredTypeParameters() {
        List<TypeParameterDescriptor> list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        $$$reportNull$$$0(22);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public ClassKind getKind() {
        ClassKind classKind = ClassKind.ENUM_ENTRY;
        if (classKind != null) {
            return classKind;
        }
        $$$reportNull$$$0(18);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public Modality getModality() {
        Modality modality = Modality.FINAL;
        if (modality != null) {
            return modality;
        }
        $$$reportNull$$$0(19);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public MemberScope getStaticScope() {
        MemberScope.Empty empty = MemberScope.Empty.INSTANCE;
        if (empty != null) {
            return empty;
        }
        $$$reportNull$$$0(15);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public TypeConstructor getTypeConstructor() {
        ClassTypeConstructorImpl classTypeConstructorImpl = this.typeConstructor;
        if (classTypeConstructorImpl != null) {
            return classTypeConstructorImpl;
        }
        $$$reportNull$$$0(17);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    public MemberScope getUnsubstitutedMemberScope(KotlinTypeRefiner kotlinTypeRefiner) {
        if (kotlinTypeRefiner == null) {
            $$$reportNull$$$0(13);
            throw null;
        }
        EnumEntryScope enumEntryScope = this.scope;
        if (enumEntryScope != null) {
            return enumEntryScope;
        }
        $$$reportNull$$$0(14);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* renamed from: getUnsubstitutedPrimaryConstructor */
    public ClassConstructorDescriptor mo4142getUnsubstitutedPrimaryConstructor() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public ValueClassRepresentation<SimpleType> getValueClassRepresentation() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    public DescriptorVisibility getVisibility() {
        DescriptorVisibility descriptorVisibility = DescriptorVisibilities.PUBLIC;
        if (descriptorVisibility != null) {
            return descriptorVisibility;
        }
        $$$reportNull$$$0(20);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isActual() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isCompanionObject() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isData() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExpect() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isFun() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isInline() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public boolean isInner() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isValue() {
        return false;
    }

    public String toString() {
        return "enum entry " + getName();
    }
}
