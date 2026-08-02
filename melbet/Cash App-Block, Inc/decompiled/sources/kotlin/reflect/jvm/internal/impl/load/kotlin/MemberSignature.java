package kotlin.reflect.jvm.internal.impl.load.kotlin;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;

/* loaded from: classes9.dex */
public final class MemberSignature {
    public static final Companion Companion = new Companion(null);
    public final String signature;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final MemberSignature fromFieldNameAndDesc(String str, String str2) {
            str.getClass();
            str2.getClass();
            return new MemberSignature(str + '#' + str2, null);
        }

        public final MemberSignature fromJvmMemberSignature(JvmMemberSignature jvmMemberSignature) {
            jvmMemberSignature.getClass();
            if (jvmMemberSignature instanceof JvmMemberSignature.Method) {
                JvmMemberSignature.Method method = (JvmMemberSignature.Method) jvmMemberSignature;
                return fromMethodNameAndDesc(method.getName(), method.getDesc());
            }
            if (jvmMemberSignature instanceof JvmMemberSignature.Field) {
                JvmMemberSignature.Field field = (JvmMemberSignature.Field) jvmMemberSignature;
                return fromFieldNameAndDesc(field.getName(), field.getDesc());
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }

        public final MemberSignature fromMethod(NameResolver nameResolver, JvmProtoBuf.JvmMethodSignature jvmMethodSignature) {
            nameResolver.getClass();
            jvmMethodSignature.getClass();
            return fromMethodNameAndDesc(nameResolver.getString(jvmMethodSignature.getName()), nameResolver.getString(jvmMethodSignature.getDesc()));
        }

        public final MemberSignature fromMethodNameAndDesc(String str, String str2) {
            str.getClass();
            str2.getClass();
            return new MemberSignature(Recorder$$ExternalSyntheticOutline2.m$1(str, str2), null);
        }

        public final MemberSignature fromMethodSignatureAndParameterIndex(MemberSignature memberSignature, int i) {
            memberSignature.getClass();
            return new MemberSignature(memberSignature.getSignature() + '@' + i, null);
        }
    }

    public MemberSignature(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this.signature = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MemberSignature) && Intrinsics.areEqual(this.signature, ((MemberSignature) obj).signature);
    }

    public final String getSignature() {
        return this.signature;
    }

    public int hashCode() {
        return this.signature.hashCode();
    }

    public String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m(new StringBuilder("MemberSignature(signature="), this.signature, ')');
    }
}
