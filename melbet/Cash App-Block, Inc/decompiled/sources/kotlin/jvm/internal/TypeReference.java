package kotlin.jvm.internal;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.time.InstantKt$$ExternalSyntheticLambda0;
import papa.PapaEvent;

/* loaded from: classes9.dex */
public final class TypeReference implements KType {
    public static final Companion Companion = new Companion(null);
    public final List arguments;
    public final KClassifier classifier;
    public final int flags;
    public final KType platformTypeUpperBound;

    public final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public TypeReference(KClassifier kClassifier, List list, KType kType, int i) {
        kClassifier.getClass();
        list.getClass();
        this.classifier = kClassifier;
        this.arguments = list;
        this.platformTypeUpperBound = kType;
        this.flags = i;
    }

    public final String asString(boolean z) {
        KClassifier kClassifier = this.classifier;
        KClass kClass = kClassifier instanceof KClass ? (KClass) kClassifier : null;
        Class javaClass = kClass != null ? PapaEvent.getJavaClass(kClass) : null;
        String obj = javaClass == null ? kClassifier.toString() : (this.flags & 4) != 0 ? "kotlin.Nothing" : javaClass.isArray() ? javaClass.equals(boolean[].class) ? "kotlin.BooleanArray" : javaClass.equals(char[].class) ? "kotlin.CharArray" : javaClass.equals(byte[].class) ? "kotlin.ByteArray" : javaClass.equals(short[].class) ? "kotlin.ShortArray" : javaClass.equals(int[].class) ? "kotlin.IntArray" : javaClass.equals(float[].class) ? "kotlin.FloatArray" : javaClass.equals(long[].class) ? "kotlin.LongArray" : javaClass.equals(double[].class) ? "kotlin.DoubleArray" : "kotlin.Array" : (z && javaClass.isPrimitive()) ? PapaEvent.getJavaObjectType((KClass) kClassifier).getName() : javaClass.getName();
        List list = this.arguments;
        String m = Recorder$$ExternalSyntheticOutline2.m(obj, list.isEmpty() ? "" : CollectionsKt.joinToString$default(list, ", ", "<", ">", 0, null, new InstantKt$$ExternalSyntheticLambda0(this, 17), 24), isMarkedNullable() ? "?" : "");
        KType kType = this.platformTypeUpperBound;
        if (kType instanceof TypeReference) {
            String asString = ((TypeReference) kType).asString(true);
            if (!asString.equals(m)) {
                if (asString.equals(m.concat("?"))) {
                    return m.concat("!");
                }
                return "(" + m + ".." + asString + ')';
            }
        }
        return m;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TypeReference)) {
            return false;
        }
        TypeReference typeReference = (TypeReference) obj;
        return Intrinsics.areEqual(this.classifier, typeReference.classifier) && Intrinsics.areEqual(this.arguments, typeReference.arguments) && Intrinsics.areEqual(this.platformTypeUpperBound, typeReference.platformTypeUpperBound) && this.flags == typeReference.flags;
    }

    @Override // kotlin.reflect.KAnnotatedElement
    public final List getAnnotations() {
        return EmptyList.INSTANCE;
    }

    @Override // kotlin.reflect.KType
    public final List getArguments() {
        return this.arguments;
    }

    @Override // kotlin.reflect.KType
    public final KClassifier getClassifier() {
        return this.classifier;
    }

    public final int getFlags$kotlin_stdlib() {
        return this.flags;
    }

    public final KType getPlatformTypeUpperBound$kotlin_stdlib() {
        return this.platformTypeUpperBound;
    }

    public final int hashCode() {
        return Integer.hashCode(this.flags) + Recorder$$ExternalSyntheticOutline2.m(this.classifier.hashCode() * 31, 31, this.arguments);
    }

    @Override // kotlin.reflect.KType
    public final boolean isMarkedNullable() {
        return (this.flags & 1) != 0;
    }

    public final String toString() {
        return asString(false).concat(" (Kotlin reflection is not available)");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TypeReference(KClassifier kClassifier, List list, boolean z) {
        this(kClassifier, list, null, z ? 1 : 0);
        kClassifier.getClass();
        list.getClass();
    }
}
