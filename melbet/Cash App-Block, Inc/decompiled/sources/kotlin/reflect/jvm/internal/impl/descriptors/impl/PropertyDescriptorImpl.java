package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FieldDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ContextReceiver;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ExtensionReceiver;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ImplicitContextReceiver;
import kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import kotlin.reflect.jvm.internal.impl.types.DescriptorSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes9.dex */
public class PropertyDescriptorImpl extends VariableDescriptorWithInitializerImpl implements PropertyDescriptor {
    public FieldDescriptor backingField;
    public List contextReceiverParameters;
    public FieldDescriptor delegateField;
    public ReceiverParameterDescriptor dispatchReceiverParameter;
    public ReceiverParameterDescriptor extensionReceiverParameter;
    public PropertyGetterDescriptorImpl getter;
    public final boolean isActual;
    public final boolean isConst;
    public final boolean isDelegated;
    public final boolean isExpect;
    public final boolean isExternal;
    public final CallableMemberDescriptor.Kind kind;
    public final boolean lateInit;
    public final Modality modality;
    public final PropertyDescriptor original;
    public Collection overriddenProperties;
    public PropertySetterDescriptor setter;
    public boolean setterProjectedOut;
    public ArrayList typeParameters;
    public DescriptorVisibility visibility;

    public class CopyConfiguration {
        public final ReceiverParameterDescriptor dispatchReceiverParameter;
        public CallableMemberDescriptor.Kind kind;
        public Modality modality;
        public final Name name;
        public DeclarationDescriptor owner;
        public final KotlinType returnType;
        public DescriptorVisibility visibility;
        public PropertyDescriptor original = null;
        public TypeSubstitution substitution = TypeSubstitution.EMPTY;
        public boolean copyOverrides = true;

        public static /* synthetic */ void $$$reportNull$$$0(int i) {
            String str = (i == 1 || i == 2 || i == 3 || i == 5 || i == 7 || i == 9 || i == 11 || i == 19 || i == 13 || i == 14 || i == 16 || i == 17) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i == 1 || i == 2 || i == 3 || i == 5 || i == 7 || i == 9 || i == 11 || i == 19 || i == 13 || i == 14 || i == 16 || i == 17) ? 2 : 3];
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case 13:
                case 14:
                case 16:
                case 17:
                case 19:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
                    break;
                case 4:
                    objArr[0] = "type";
                    break;
                case 6:
                    objArr[0] = "modality";
                    break;
                case 8:
                    objArr[0] = "visibility";
                    break;
                case 10:
                    objArr[0] = "kind";
                    break;
                case 12:
                    objArr[0] = "typeParameters";
                    break;
                case 15:
                    objArr[0] = "substitution";
                    break;
                case 18:
                    objArr[0] = "name";
                    break;
                default:
                    objArr[0] = "owner";
                    break;
            }
            if (i == 1) {
                objArr[1] = "setOwner";
            } else if (i == 2) {
                objArr[1] = "setOriginal";
            } else if (i == 3) {
                objArr[1] = "setPreserveSourceElement";
            } else if (i == 5) {
                objArr[1] = "setReturnType";
            } else if (i == 7) {
                objArr[1] = "setModality";
            } else if (i == 9) {
                objArr[1] = "setVisibility";
            } else if (i == 11) {
                objArr[1] = "setKind";
            } else if (i == 19) {
                objArr[1] = "setName";
            } else if (i == 13) {
                objArr[1] = "setTypeParameters";
            } else if (i == 14) {
                objArr[1] = "setDispatchReceiverParameter";
            } else if (i == 16) {
                objArr[1] = "setSubstitution";
            } else if (i != 17) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
            } else {
                objArr[1] = "setCopyOverrides";
            }
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case 13:
                case 14:
                case 16:
                case 17:
                case 19:
                    break;
                case 4:
                    objArr[2] = "setReturnType";
                    break;
                case 6:
                    objArr[2] = "setModality";
                    break;
                case 8:
                    objArr[2] = "setVisibility";
                    break;
                case 10:
                    objArr[2] = "setKind";
                    break;
                case 12:
                    objArr[2] = "setTypeParameters";
                    break;
                case 15:
                    objArr[2] = "setSubstitution";
                    break;
                case 18:
                    objArr[2] = "setName";
                    break;
                default:
                    objArr[2] = "setOwner";
                    break;
            }
            String format2 = String.format(str, objArr);
            if (i != 1 && i != 2 && i != 3 && i != 5 && i != 7 && i != 9 && i != 11 && i != 19 && i != 13 && i != 14 && i != 16 && i != 17) {
                throw new IllegalArgumentException(format2);
            }
            throw new IllegalStateException(format2);
        }

        public CopyConfiguration() {
            this.owner = PropertyDescriptorImpl.this.getContainingDeclaration();
            this.modality = PropertyDescriptorImpl.this.getModality();
            this.visibility = PropertyDescriptorImpl.this.getVisibility();
            this.kind = PropertyDescriptorImpl.this.getKind();
            this.dispatchReceiverParameter = PropertyDescriptorImpl.this.dispatchReceiverParameter;
            this.name = PropertyDescriptorImpl.this.getName();
            this.returnType = PropertyDescriptorImpl.this.getType();
        }

        /* JADX WARN: Type inference failed for: r21v1, types: [java.lang.Throwable, kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor] */
        public PropertyDescriptor build() {
            ReceiverParameterDescriptor receiverParameterDescriptor;
            ReceiverParameterDescriptorImpl receiverParameterDescriptorImpl;
            PropertyGetterDescriptorImpl propertyGetterDescriptorImpl;
            PropertySetterDescriptorImpl propertySetterDescriptorImpl;
            TypeSubstitutor typeSubstitutor;
            Function0<NullableLazyValue<ConstantValue<?>>> function0;
            ReceiverParameterDescriptorImpl receiverParameterDescriptorImpl2;
            ReceiverParameterDescriptorImpl receiverParameterDescriptorImpl3;
            PropertyDescriptorImpl propertyDescriptorImpl = PropertyDescriptorImpl.this;
            propertyDescriptorImpl.getClass();
            DeclarationDescriptor declarationDescriptor = this.owner;
            Modality modality = this.modality;
            DescriptorVisibility descriptorVisibility = this.visibility;
            PropertyDescriptor propertyDescriptor = this.original;
            CallableMemberDescriptor.Kind kind = this.kind;
            SourceElement sourceElement = SourceElement.NO_SOURCE;
            ReceiverParameterDescriptorImpl receiverParameterDescriptorImpl4 = null;
            if (sourceElement == null) {
                PropertyDescriptorImpl.$$$reportNull$$$0(28);
                throw null;
            }
            PropertyDescriptorImpl createSubstitutedCopy = propertyDescriptorImpl.createSubstitutedCopy(declarationDescriptor, modality, descriptorVisibility, propertyDescriptor, kind, this.name, sourceElement);
            List<TypeParameterDescriptor> typeParameters = propertyDescriptorImpl.getTypeParameters();
            ArrayList arrayList = new ArrayList(typeParameters.size());
            TypeSubstitutor substituteTypeParameters = DescriptorSubstitutor.substituteTypeParameters(typeParameters, this.substitution, createSubstitutedCopy, arrayList);
            Variance variance = Variance.OUT_VARIANCE;
            KotlinType kotlinType = this.returnType;
            KotlinType substitute = substituteTypeParameters.substitute(kotlinType, variance);
            if (substitute != null) {
                Variance variance2 = Variance.IN_VARIANCE;
                KotlinType substitute2 = substituteTypeParameters.substitute(kotlinType, variance2);
                if (substitute2 != null) {
                    createSubstitutedCopy.setInType(substitute2);
                }
                ReceiverParameterDescriptor receiverParameterDescriptor2 = this.dispatchReceiverParameter;
                if (receiverParameterDescriptor2 != null) {
                    ReceiverParameterDescriptor substitute3 = receiverParameterDescriptor2.substitute(substituteTypeParameters);
                    receiverParameterDescriptor = substitute3 != null ? substitute3 : null;
                }
                ReceiverParameterDescriptor receiverParameterDescriptor3 = propertyDescriptorImpl.extensionReceiverParameter;
                if (receiverParameterDescriptor3 != null) {
                    KotlinType substitute4 = substituteTypeParameters.substitute(receiverParameterDescriptor3.getType(), variance2);
                    receiverParameterDescriptorImpl = substitute4 == null ? null : new ReceiverParameterDescriptorImpl(createSubstitutedCopy, new ExtensionReceiver(createSubstitutedCopy, substitute4, receiverParameterDescriptor3.getValue()), receiverParameterDescriptor3.getAnnotations());
                } else {
                    receiverParameterDescriptorImpl = null;
                }
                ArrayList arrayList2 = new ArrayList();
                for (ReceiverParameterDescriptor receiverParameterDescriptor4 : propertyDescriptorImpl.contextReceiverParameters) {
                    KotlinType substitute5 = substituteTypeParameters.substitute(receiverParameterDescriptor4.getType(), Variance.IN_VARIANCE);
                    if (substitute5 == null) {
                        receiverParameterDescriptorImpl2 = receiverParameterDescriptorImpl4;
                        receiverParameterDescriptorImpl3 = receiverParameterDescriptorImpl2;
                    } else {
                        receiverParameterDescriptorImpl3 = receiverParameterDescriptorImpl4;
                        receiverParameterDescriptorImpl2 = new ReceiverParameterDescriptorImpl(createSubstitutedCopy, new ContextReceiver(createSubstitutedCopy, substitute5, ((ImplicitContextReceiver) receiverParameterDescriptor4.getValue()).getCustomLabelName(), receiverParameterDescriptor4.getValue()), receiverParameterDescriptor4.getAnnotations());
                    }
                    if (receiverParameterDescriptorImpl2 != null) {
                        arrayList2.add(receiverParameterDescriptorImpl2);
                    }
                    receiverParameterDescriptorImpl4 = receiverParameterDescriptorImpl3;
                }
                ?? r21 = receiverParameterDescriptorImpl4;
                createSubstitutedCopy.setType(substitute, arrayList, receiverParameterDescriptor, receiverParameterDescriptorImpl, arrayList2);
                PropertyGetterDescriptorImpl propertyGetterDescriptorImpl2 = propertyDescriptorImpl.getter;
                if (propertyGetterDescriptorImpl2 == null) {
                    propertyGetterDescriptorImpl = r21;
                } else {
                    Annotations annotations = propertyGetterDescriptorImpl2.getAnnotations();
                    Modality modality2 = this.modality;
                    DescriptorVisibility visibility = propertyDescriptorImpl.getter.getVisibility();
                    if (this.kind == CallableMemberDescriptor.Kind.FAKE_OVERRIDE && DescriptorVisibilities.isPrivate(visibility.normalize())) {
                        visibility = DescriptorVisibilities.INVISIBLE_FAKE;
                    }
                    DescriptorVisibility descriptorVisibility2 = visibility;
                    boolean isDefault = propertyDescriptorImpl.getter.isDefault();
                    boolean isExternal = propertyDescriptorImpl.getter.isExternal();
                    boolean isInline = propertyDescriptorImpl.getter.isInline();
                    CallableMemberDescriptor.Kind kind2 = this.kind;
                    PropertyDescriptor propertyDescriptor2 = this.original;
                    propertyGetterDescriptorImpl = new PropertyGetterDescriptorImpl(createSubstitutedCopy, annotations, modality2, descriptorVisibility2, isDefault, isExternal, isInline, kind2, propertyDescriptor2 == null ? r21 : propertyDescriptor2.getGetter(), SourceElement.NO_SOURCE);
                }
                if (propertyGetterDescriptorImpl != null) {
                    KotlinType returnType = propertyDescriptorImpl.getter.getReturnType();
                    PropertyGetterDescriptorImpl propertyGetterDescriptorImpl3 = propertyDescriptorImpl.getter;
                    if (propertyGetterDescriptorImpl3 == null) {
                        PropertyDescriptorImpl.$$$reportNull$$$0(31);
                        throw r21;
                    }
                    propertyGetterDescriptorImpl.setInitialSignatureDescriptor(propertyGetterDescriptorImpl3.getInitialSignatureDescriptor() != null ? propertyGetterDescriptorImpl3.getInitialSignatureDescriptor().substitute(substituteTypeParameters) : r21);
                    propertyGetterDescriptorImpl.initialize(returnType != null ? substituteTypeParameters.substitute(returnType, Variance.OUT_VARIANCE) : r21);
                }
                PropertySetterDescriptor propertySetterDescriptor = propertyDescriptorImpl.setter;
                if (propertySetterDescriptor == null) {
                    propertySetterDescriptorImpl = r21;
                } else {
                    Annotations annotations2 = propertySetterDescriptor.getAnnotations();
                    Modality modality3 = this.modality;
                    DescriptorVisibility visibility2 = propertyDescriptorImpl.setter.getVisibility();
                    if (this.kind == CallableMemberDescriptor.Kind.FAKE_OVERRIDE && DescriptorVisibilities.isPrivate(visibility2.normalize())) {
                        visibility2 = DescriptorVisibilities.INVISIBLE_FAKE;
                    }
                    DescriptorVisibility descriptorVisibility3 = visibility2;
                    boolean isDefault2 = propertyDescriptorImpl.setter.isDefault();
                    boolean isExternal2 = propertyDescriptorImpl.setter.isExternal();
                    boolean isInline2 = propertyDescriptorImpl.setter.isInline();
                    CallableMemberDescriptor.Kind kind3 = this.kind;
                    PropertyDescriptor propertyDescriptor3 = this.original;
                    propertySetterDescriptorImpl = new PropertySetterDescriptorImpl(createSubstitutedCopy, annotations2, modality3, descriptorVisibility3, isDefault2, isExternal2, isInline2, kind3, propertyDescriptor3 == null ? r21 : propertyDescriptor3.getSetter(), SourceElement.NO_SOURCE);
                }
                if (propertySetterDescriptorImpl != null) {
                    typeSubstitutor = substituteTypeParameters;
                    List<ValueParameterDescriptor> substitutedValueParameters = FunctionDescriptorImpl.getSubstitutedValueParameters(propertySetterDescriptorImpl, propertyDescriptorImpl.setter.getValueParameters(), typeSubstitutor, false, false, null);
                    if (substitutedValueParameters == null) {
                        createSubstitutedCopy.setSetterProjectedOut(true);
                        substitutedValueParameters = Collections.singletonList(PropertySetterDescriptorImpl.createSetterParameter(propertySetterDescriptorImpl, DescriptorUtilsKt.getBuiltIns(this.owner).getNothingType(), propertyDescriptorImpl.setter.getValueParameters().get(0).getAnnotations()));
                    }
                    if (substitutedValueParameters.size() != 1) {
                        Path$$ExternalSyntheticBUOutline0.m();
                        return r21;
                    }
                    PropertySetterDescriptor propertySetterDescriptor2 = propertyDescriptorImpl.setter;
                    if (propertySetterDescriptor2 == null) {
                        PropertyDescriptorImpl.$$$reportNull$$$0(31);
                        throw r21;
                    }
                    propertySetterDescriptorImpl.setInitialSignatureDescriptor(propertySetterDescriptor2.getInitialSignatureDescriptor() != null ? propertySetterDescriptor2.getInitialSignatureDescriptor().substitute(typeSubstitutor) : r21);
                    propertySetterDescriptorImpl.initialize(substitutedValueParameters.get(0));
                } else {
                    typeSubstitutor = substituteTypeParameters;
                }
                FieldDescriptor fieldDescriptor = propertyDescriptorImpl.backingField;
                FieldDescriptorImpl fieldDescriptorImpl = fieldDescriptor == null ? r21 : new FieldDescriptorImpl(fieldDescriptor.getAnnotations(), createSubstitutedCopy);
                FieldDescriptor fieldDescriptor2 = propertyDescriptorImpl.delegateField;
                createSubstitutedCopy.initialize(propertyGetterDescriptorImpl, propertySetterDescriptorImpl, fieldDescriptorImpl, fieldDescriptor2 == null ? r21 : new FieldDescriptorImpl(fieldDescriptor2.getAnnotations(), createSubstitutedCopy));
                if (this.copyOverrides) {
                    SmartSet create = SmartSet.create();
                    Iterator<? extends PropertyDescriptor> it = propertyDescriptorImpl.getOverriddenDescriptors().iterator();
                    while (it.hasNext()) {
                        create.add(it.next().substitute(typeSubstitutor));
                    }
                    createSubstitutedCopy.setOverriddenDescriptors(create);
                }
                if (propertyDescriptorImpl.isConst() && (function0 = propertyDescriptorImpl.compileTimeInitializerFactory) != null) {
                    createSubstitutedCopy.setCompileTimeInitializer(propertyDescriptorImpl.compileTimeInitializer, function0);
                }
                return createSubstitutedCopy;
            }
            return null;
        }

        public CopyConfiguration setCopyOverrides(boolean z) {
            this.copyOverrides = z;
            return this;
        }

        public CopyConfiguration setKind(CallableMemberDescriptor.Kind kind) {
            if (kind != null) {
                this.kind = kind;
                return this;
            }
            $$$reportNull$$$0(10);
            throw null;
        }

        public CopyConfiguration setModality(Modality modality) {
            if (modality != null) {
                this.modality = modality;
                return this;
            }
            $$$reportNull$$$0(6);
            throw null;
        }

        public CopyConfiguration setOriginal(CallableMemberDescriptor callableMemberDescriptor) {
            this.original = (PropertyDescriptor) callableMemberDescriptor;
            return this;
        }

        public CopyConfiguration setOwner(DeclarationDescriptor declarationDescriptor) {
            if (declarationDescriptor != null) {
                this.owner = declarationDescriptor;
                return this;
            }
            $$$reportNull$$$0(0);
            throw null;
        }

        public CopyConfiguration setSubstitution(TypeSubstitution typeSubstitution) {
            if (typeSubstitution != null) {
                this.substitution = typeSubstitution;
                return this;
            }
            $$$reportNull$$$0(15);
            throw null;
        }

        public CopyConfiguration setVisibility(DescriptorVisibility descriptorVisibility) {
            if (descriptorVisibility != null) {
                this.visibility = descriptorVisibility;
                return this;
            }
            $$$reportNull$$$0(8);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str;
        int i2;
        if (i != 28 && i != 38 && i != 39 && i != 41 && i != 42) {
            switch (i) {
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            if (i != 28 && i != 38 && i != 39 && i != 41 && i != 42) {
                switch (i) {
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                        break;
                    default:
                        i2 = 3;
                        break;
                }
                Object[] objArr = new Object[i2];
                switch (i) {
                    case 1:
                    case 8:
                        objArr[0] = "annotations";
                        break;
                    case 2:
                    case 9:
                        objArr[0] = "modality";
                        break;
                    case 3:
                    case 10:
                    case 20:
                        objArr[0] = "visibility";
                        break;
                    case 4:
                    case 11:
                        objArr[0] = "name";
                        break;
                    case 5:
                    case 12:
                    case 35:
                        objArr[0] = "kind";
                        break;
                    case 6:
                    case 13:
                    case 37:
                        objArr[0] = "source";
                        break;
                    case 7:
                    default:
                        objArr[0] = "containingDeclaration";
                        break;
                    case 14:
                        objArr[0] = "inType";
                        break;
                    case 15:
                    case 17:
                        objArr[0] = "outType";
                        break;
                    case 16:
                    case 18:
                        objArr[0] = "typeParameters";
                        break;
                    case 19:
                        objArr[0] = "contextReceiverParameters";
                        break;
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 28:
                    case 38:
                    case 39:
                    case 41:
                    case 42:
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                        break;
                    case 27:
                        objArr[0] = "originalSubstitutor";
                        break;
                    case 29:
                        objArr[0] = "copyConfiguration";
                        break;
                    case 30:
                        objArr[0] = "substitutor";
                        break;
                    case 31:
                        objArr[0] = "accessorDescriptor";
                        break;
                    case 32:
                        objArr[0] = "newOwner";
                        break;
                    case 33:
                        objArr[0] = "newModality";
                        break;
                    case 34:
                        objArr[0] = "newVisibility";
                        break;
                    case 36:
                        objArr[0] = "newName";
                        break;
                    case 40:
                        objArr[0] = "overriddenDescriptors";
                        break;
                }
                if (i != 28) {
                    objArr[1] = "getSourceToUseForCopy";
                } else if (i == 38) {
                    objArr[1] = "getOriginal";
                } else if (i == 39) {
                    objArr[1] = "getKind";
                } else if (i == 41) {
                    objArr[1] = "getOverriddenDescriptors";
                } else if (i != 42) {
                    switch (i) {
                        case 21:
                            objArr[1] = "getTypeParameters";
                            break;
                        case 22:
                            objArr[1] = "getContextReceiverParameters";
                            break;
                        case 23:
                            objArr[1] = "getReturnType";
                            break;
                        case 24:
                            objArr[1] = "getModality";
                            break;
                        case 25:
                            objArr[1] = "getVisibility";
                            break;
                        case 26:
                            objArr[1] = "getAccessors";
                            break;
                        default:
                            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                            break;
                    }
                } else {
                    objArr[1] = "copy";
                }
                switch (i) {
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        objArr[2] = "create";
                        break;
                    case 14:
                        objArr[2] = "setInType";
                        break;
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        objArr[2] = "setType";
                        break;
                    case 20:
                        objArr[2] = "setVisibility";
                        break;
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 28:
                    case 38:
                    case 39:
                    case 41:
                    case 42:
                        break;
                    case 27:
                        objArr[2] = "substitute";
                        break;
                    case 29:
                        objArr[2] = "doSubstitute";
                        break;
                    case 30:
                    case 31:
                        objArr[2] = "getSubstitutedInitialSignatureDescriptor";
                        break;
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                        objArr[2] = "createSubstitutedCopy";
                        break;
                    case 40:
                        objArr[2] = "setOverriddenDescriptors";
                        break;
                    default:
                        objArr[2] = "<init>";
                        break;
                }
                String format2 = String.format(str, objArr);
                if (i != 28 && i != 38 && i != 39 && i != 41 && i != 42) {
                    switch (i) {
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
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
            if (i != 28) {
            }
            switch (i) {
            }
            String format22 = String.format(str, objArr2);
            if (i != 28) {
                switch (i) {
                }
            }
            throw new IllegalStateException(format22);
        }
        str = "@NotNull method %s.%s must not return null";
        if (i != 28) {
            switch (i) {
            }
            Object[] objArr22 = new Object[i2];
            switch (i) {
            }
            if (i != 28) {
            }
            switch (i) {
            }
            String format222 = String.format(str, objArr22);
            if (i != 28) {
            }
            throw new IllegalStateException(format222);
        }
        i2 = 2;
        Object[] objArr222 = new Object[i2];
        switch (i) {
        }
        if (i != 28) {
        }
        switch (i) {
        }
        String format2222 = String.format(str, objArr222);
        if (i != 28) {
        }
        throw new IllegalStateException(format2222);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PropertyDescriptorImpl(DeclarationDescriptor declarationDescriptor, PropertyDescriptor propertyDescriptor, Annotations annotations, Modality modality, DescriptorVisibility descriptorVisibility, boolean z, Name name, CallableMemberDescriptor.Kind kind, SourceElement sourceElement, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        super(declarationDescriptor, annotations, name, null, z, sourceElement);
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(0);
            throw null;
        }
        if (annotations == null) {
            $$$reportNull$$$0(1);
            throw null;
        }
        if (modality == null) {
            $$$reportNull$$$0(2);
            throw null;
        }
        if (descriptorVisibility == null) {
            $$$reportNull$$$0(3);
            throw null;
        }
        if (name == null) {
            $$$reportNull$$$0(4);
            throw null;
        }
        if (kind == null) {
            $$$reportNull$$$0(5);
            throw null;
        }
        if (sourceElement == null) {
            $$$reportNull$$$0(6);
            throw null;
        }
        this.overriddenProperties = null;
        this.contextReceiverParameters = Collections.EMPTY_LIST;
        this.modality = modality;
        this.visibility = descriptorVisibility;
        this.original = propertyDescriptor == null ? this : propertyDescriptor;
        this.kind = kind;
        this.lateInit = z2;
        this.isConst = z3;
        this.isExpect = z4;
        this.isActual = z5;
        this.isExternal = z6;
        this.isDelegated = z7;
    }

    public static PropertyDescriptorImpl create(DeclarationDescriptor declarationDescriptor, Annotations annotations, Modality modality, DescriptorVisibility descriptorVisibility, boolean z, Name name, CallableMemberDescriptor.Kind kind, SourceElement sourceElement, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(7);
            throw null;
        }
        if (annotations == null) {
            $$$reportNull$$$0(8);
            throw null;
        }
        if (modality == null) {
            $$$reportNull$$$0(9);
            throw null;
        }
        if (descriptorVisibility == null) {
            $$$reportNull$$$0(10);
            throw null;
        }
        if (name == null) {
            $$$reportNull$$$0(11);
            throw null;
        }
        if (kind == null) {
            $$$reportNull$$$0(12);
            throw null;
        }
        if (sourceElement != null) {
            return new PropertyDescriptorImpl(declarationDescriptor, null, annotations, modality, descriptorVisibility, z, name, kind, sourceElement, z2, z3, z4, z5, z6, z7);
        }
        $$$reportNull$$$0(13);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public <R, D> R accept(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d) {
        return declarationDescriptorVisitor.visitPropertyDescriptor(this, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public PropertyDescriptor copy(DeclarationDescriptor declarationDescriptor, Modality modality, DescriptorVisibility descriptorVisibility, CallableMemberDescriptor.Kind kind, boolean z) {
        PropertyDescriptor build = newCopyBuilder().setOwner(declarationDescriptor).setOriginal(null).setModality(modality).setVisibility(descriptorVisibility).setKind(kind).setCopyOverrides(z).build();
        if (build != null) {
            return build;
        }
        $$$reportNull$$$0(42);
        throw null;
    }

    public PropertyDescriptorImpl createSubstitutedCopy(DeclarationDescriptor declarationDescriptor, Modality modality, DescriptorVisibility descriptorVisibility, PropertyDescriptor propertyDescriptor, CallableMemberDescriptor.Kind kind, Name name, SourceElement sourceElement) {
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(32);
            throw null;
        }
        if (modality == null) {
            $$$reportNull$$$0(33);
            throw null;
        }
        if (descriptorVisibility == null) {
            $$$reportNull$$$0(34);
            throw null;
        }
        if (kind == null) {
            $$$reportNull$$$0(35);
            throw null;
        }
        if (name != null) {
            return new PropertyDescriptorImpl(declarationDescriptor, propertyDescriptor, getAnnotations(), modality, descriptorVisibility, isVar(), name, kind, sourceElement, isLateInit(), isConst(), isExpect(), isActual(), isExternal(), isDelegated());
        }
        $$$reportNull$$$0(36);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    public List<PropertyAccessorDescriptor> getAccessors() {
        ArrayList arrayList = new ArrayList(2);
        PropertyGetterDescriptorImpl propertyGetterDescriptorImpl = this.getter;
        if (propertyGetterDescriptorImpl != null) {
            arrayList.add(propertyGetterDescriptorImpl);
        }
        PropertySetterDescriptor propertySetterDescriptor = this.setter;
        if (propertySetterDescriptor != null) {
            arrayList.add(propertySetterDescriptor);
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    public FieldDescriptor getBackingField() {
        return this.backingField;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public List<ReceiverParameterDescriptor> getContextReceiverParameters() {
        List<ReceiverParameterDescriptor> list = this.contextReceiverParameters;
        if (list != null) {
            return list;
        }
        $$$reportNull$$$0(22);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    public FieldDescriptor getDelegateField() {
        return this.delegateField;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public ReceiverParameterDescriptor getDispatchReceiverParameter() {
        return this.dispatchReceiverParameter;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public ReceiverParameterDescriptor getExtensionReceiverParameter() {
        return this.extensionReceiverParameter;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public CallableMemberDescriptor.Kind getKind() {
        CallableMemberDescriptor.Kind kind = this.kind;
        if (kind != null) {
            return kind;
        }
        $$$reportNull$$$0(39);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public Modality getModality() {
        Modality modality = this.modality;
        if (modality != null) {
            return modality;
        }
        $$$reportNull$$$0(24);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public PropertyDescriptor getOriginal() {
        PropertyDescriptor propertyDescriptor = this.original;
        ?? r1 = this;
        if (propertyDescriptor != this) {
            r1 = propertyDescriptor.getOriginal();
        }
        if (r1 != 0) {
            return r1;
        }
        $$$reportNull$$$0(38);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public Collection<? extends PropertyDescriptor> getOverriddenDescriptors() {
        Collection<? extends PropertyDescriptor> collection = this.overriddenProperties;
        if (collection == null) {
            collection = Collections.EMPTY_LIST;
        }
        if (collection != null) {
            return collection;
        }
        $$$reportNull$$$0(41);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public KotlinType getReturnType() {
        KotlinType type2 = getType();
        if (type2 != null) {
            return type2;
        }
        $$$reportNull$$$0(23);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    public PropertySetterDescriptor getSetter() {
        return this.setter;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public List<TypeParameterDescriptor> getTypeParameters() {
        ArrayList arrayList = this.typeParameters;
        if (arrayList != null) {
            return arrayList;
        }
        OptionalProvider$$ExternalSyntheticLambda0.m$1(this, "typeParameters == null for ");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public <V> V getUserData(CallableDescriptor.UserDataKey<V> userDataKey) {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    public DescriptorVisibility getVisibility() {
        DescriptorVisibility descriptorVisibility = this.visibility;
        if (descriptorVisibility != null) {
            return descriptorVisibility;
        }
        $$$reportNull$$$0(25);
        throw null;
    }

    public void initialize(PropertyGetterDescriptorImpl propertyGetterDescriptorImpl, PropertySetterDescriptor propertySetterDescriptor, FieldDescriptor fieldDescriptor, FieldDescriptor fieldDescriptor2) {
        this.getter = propertyGetterDescriptorImpl;
        this.setter = propertySetterDescriptor;
        this.backingField = fieldDescriptor;
        this.delegateField = fieldDescriptor2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isActual() {
        return this.isActual;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    public boolean isConst() {
        return this.isConst;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptorWithAccessors
    public boolean isDelegated() {
        return this.isDelegated;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExpect() {
        return this.isExpect;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExternal() {
        return this.isExternal;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    public boolean isLateInit() {
        return this.lateInit;
    }

    public boolean isSetterProjectedOut() {
        return this.setterProjectedOut;
    }

    public CopyConfiguration newCopyBuilder() {
        return new CopyConfiguration();
    }

    public void setInType(KotlinType kotlinType) {
        if (kotlinType != null) {
            return;
        }
        $$$reportNull$$$0(14);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public void setOverriddenDescriptors(Collection<? extends CallableMemberDescriptor> collection) {
        if (collection != null) {
            this.overriddenProperties = collection;
        } else {
            $$$reportNull$$$0(40);
            throw null;
        }
    }

    public void setSetterProjectedOut(boolean z) {
        this.setterProjectedOut = z;
    }

    public void setType(KotlinType kotlinType, List<? extends TypeParameterDescriptor> list, ReceiverParameterDescriptor receiverParameterDescriptor, ReceiverParameterDescriptor receiverParameterDescriptor2, List<ReceiverParameterDescriptor> list2) {
        if (kotlinType == null) {
            $$$reportNull$$$0(17);
            throw null;
        }
        if (list == null) {
            $$$reportNull$$$0(18);
            throw null;
        }
        if (list2 == null) {
            $$$reportNull$$$0(19);
            throw null;
        }
        setOutType(kotlinType);
        this.typeParameters = new ArrayList(list);
        this.extensionReceiverParameter = receiverParameterDescriptor2;
        this.dispatchReceiverParameter = receiverParameterDescriptor;
        this.contextReceiverParameters = list2;
    }

    public void setVisibility(DescriptorVisibility descriptorVisibility) {
        if (descriptorVisibility != null) {
            this.visibility = descriptorVisibility;
        } else {
            $$$reportNull$$$0(20);
            throw null;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    public PropertyDescriptor substitute(TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor != null) {
            return typeSubstitutor.isEmpty() ? this : newCopyBuilder().setSubstitution(typeSubstitutor.getSubstitution()).setOriginal(getOriginal()).build();
        }
        $$$reportNull$$$0(27);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    public PropertyGetterDescriptorImpl getGetter() {
        return this.getter;
    }

    public void initialize(PropertyGetterDescriptorImpl propertyGetterDescriptorImpl, PropertySetterDescriptor propertySetterDescriptor) {
        initialize(propertyGetterDescriptorImpl, propertySetterDescriptor, null, null);
    }
}
