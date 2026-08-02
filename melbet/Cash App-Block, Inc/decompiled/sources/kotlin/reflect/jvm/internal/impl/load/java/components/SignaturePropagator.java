package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* loaded from: classes9.dex */
public interface SignaturePropagator {
    public static final SignaturePropagator DO_NOTHING = new AnonymousClass1();

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator$1, reason: invalid class name */
    public final class AnonymousClass1 implements SignaturePropagator {
        public static /* synthetic */ void $$$reportNull$$$0(int i) {
            Object[] objArr = new Object[3];
            switch (i) {
                case 1:
                    objArr[0] = "owner";
                    break;
                case 2:
                    objArr[0] = "returnType";
                    break;
                case 3:
                    objArr[0] = "valueParameters";
                    break;
                case 4:
                    objArr[0] = "typeParameters";
                    break;
                case 5:
                    objArr[0] = "descriptor";
                    break;
                case 6:
                    objArr[0] = "signatureErrors";
                    break;
                default:
                    objArr[0] = "method";
                    break;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$1";
            if (i == 5 || i == 6) {
                objArr[2] = "reportSignatureErrors";
            } else {
                objArr[2] = "resolvePropagatedSignature";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator
        public final void reportSignatureErrors(CallableMemberDescriptor callableMemberDescriptor, List list) {
            if (callableMemberDescriptor == null) {
                $$$reportNull$$$0(5);
                throw null;
            }
            if (list != null) {
                throw new UnsupportedOperationException("Should not be called");
            }
            $$$reportNull$$$0(6);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator
        public final PropagatedSignature resolvePropagatedSignature(JavaMethod javaMethod, ClassDescriptor classDescriptor, KotlinType kotlinType, KotlinType kotlinType2, List list, List list2) {
            if (javaMethod == null) {
                $$$reportNull$$$0(0);
                throw null;
            }
            if (classDescriptor == null) {
                $$$reportNull$$$0(1);
                throw null;
            }
            if (kotlinType == null) {
                $$$reportNull$$$0(2);
                throw null;
            }
            if (list == null) {
                $$$reportNull$$$0(3);
                throw null;
            }
            if (list2 != null) {
                return new PropagatedSignature(kotlinType, kotlinType2, list, list2, Collections.EMPTY_LIST, false);
            }
            $$$reportNull$$$0(4);
            throw null;
        }
    }

    public static class PropagatedSignature {
        public final boolean hasStableParameterNames;
        public final KotlinType receiverType;
        public final KotlinType returnType;
        public final List signatureErrors;
        public final List typeParameters;
        public final List valueParameters;

        public static /* synthetic */ void $$$reportNull$$$0(int i) {
            String str = (i == 4 || i == 5 || i == 6 || i == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i == 4 || i == 5 || i == 6 || i == 7) ? 2 : 3];
            switch (i) {
                case 1:
                    objArr[0] = "valueParameters";
                    break;
                case 2:
                    objArr[0] = "typeParameters";
                    break;
                case 3:
                    objArr[0] = "signatureErrors";
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
                    break;
                default:
                    objArr[0] = "returnType";
                    break;
            }
            if (i == 4) {
                objArr[1] = "getReturnType";
            } else if (i == 5) {
                objArr[1] = "getValueParameters";
            } else if (i == 6) {
                objArr[1] = "getTypeParameters";
            } else if (i != 7) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
            } else {
                objArr[1] = "getErrors";
            }
            if (i != 4 && i != 5 && i != 6 && i != 7) {
                objArr[2] = "<init>";
            }
            String format2 = String.format(str, objArr);
            if (i != 4 && i != 5 && i != 6 && i != 7) {
                throw new IllegalArgumentException(format2);
            }
            throw new IllegalStateException(format2);
        }

        public PropagatedSignature(KotlinType kotlinType, KotlinType kotlinType2, List<ValueParameterDescriptor> list, List<TypeParameterDescriptor> list2, List<String> list3, boolean z) {
            if (kotlinType == null) {
                $$$reportNull$$$0(0);
                throw null;
            }
            if (list == null) {
                $$$reportNull$$$0(1);
                throw null;
            }
            if (list2 == null) {
                $$$reportNull$$$0(2);
                throw null;
            }
            if (list3 == null) {
                $$$reportNull$$$0(3);
                throw null;
            }
            this.returnType = kotlinType;
            this.receiverType = kotlinType2;
            this.valueParameters = list;
            this.typeParameters = list2;
            this.signatureErrors = list3;
            this.hasStableParameterNames = z;
        }

        public List<String> getErrors() {
            List<String> list = this.signatureErrors;
            if (list != null) {
                return list;
            }
            $$$reportNull$$$0(7);
            throw null;
        }

        public KotlinType getReceiverType() {
            return this.receiverType;
        }

        public KotlinType getReturnType() {
            KotlinType kotlinType = this.returnType;
            if (kotlinType != null) {
                return kotlinType;
            }
            $$$reportNull$$$0(4);
            throw null;
        }

        public List<TypeParameterDescriptor> getTypeParameters() {
            List<TypeParameterDescriptor> list = this.typeParameters;
            if (list != null) {
                return list;
            }
            $$$reportNull$$$0(6);
            throw null;
        }

        public List<ValueParameterDescriptor> getValueParameters() {
            List<ValueParameterDescriptor> list = this.valueParameters;
            if (list != null) {
                return list;
            }
            $$$reportNull$$$0(5);
            throw null;
        }

        public boolean hasStableParameterNames() {
            return this.hasStableParameterNames;
        }
    }

    void reportSignatureErrors(CallableMemberDescriptor callableMemberDescriptor, List<String> list);

    PropagatedSignature resolvePropagatedSignature(JavaMethod javaMethod, ClassDescriptor classDescriptor, KotlinType kotlinType, KotlinType kotlinType2, List<ValueParameterDescriptor> list, List<TypeParameterDescriptor> list2);
}
