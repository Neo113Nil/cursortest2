package kotlin.jvm.internal;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.reflect.KVariance;

/* loaded from: classes4.dex */
public final class TypeReference implements kotlin.reflect.q {
    public static final a Companion = new a(null);
    public static final int IS_MARKED_NULLABLE = 1;
    public static final int IS_MUTABLE_COLLECTION_TYPE = 2;
    public static final int IS_NOTHING_TYPE = 4;
    private final List<kotlin.reflect.s> arguments;
    private final kotlin.reflect.f classifier;
    private final int flags;
    private final kotlin.reflect.q platformTypeUpperBound;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[KVariance.values().length];
            try {
                iArr[KVariance.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KVariance.IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KVariance.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public TypeReference(kotlin.reflect.f classifier, List<kotlin.reflect.s> arguments, kotlin.reflect.q qVar, int i8) {
        s.checkNotNullParameter(classifier, "classifier");
        s.checkNotNullParameter(arguments, "arguments");
        this.classifier = classifier;
        this.arguments = arguments;
        this.platformTypeUpperBound = qVar;
        this.flags = i8;
    }

    private final String asString(boolean z7) {
        String name;
        kotlin.reflect.f classifier = getClassifier();
        kotlin.reflect.d dVar = classifier instanceof kotlin.reflect.d ? (kotlin.reflect.d) classifier : null;
        Class<?> javaClass = dVar != null ? e6.a.getJavaClass(dVar) : null;
        if (javaClass == null) {
            name = getClassifier().toString();
        } else if ((this.flags & 4) != 0) {
            name = "kotlin.Nothing";
        } else if (javaClass.isArray()) {
            name = getArrayClassName(javaClass);
        } else if (z7 && javaClass.isPrimitive()) {
            kotlin.reflect.f classifier2 = getClassifier();
            s.checkNotNull(classifier2, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
            name = e6.a.getJavaObjectType((kotlin.reflect.d) classifier2).getName();
        } else {
            name = javaClass.getName();
        }
        String str = name + (getArguments().isEmpty() ? "" : CollectionsKt___CollectionsKt.joinToString$default(getArguments(), ", ", "<", ">", 0, null, new f6.l() { // from class: kotlin.jvm.internal.TypeReference$asString$args$1
            {
                super(1);
            }

            @Override // f6.l
            public final CharSequence invoke(kotlin.reflect.s it) {
                String asString;
                s.checkNotNullParameter(it, "it");
                asString = TypeReference.this.asString(it);
                return asString;
            }
        }, 24, null)) + (isMarkedNullable() ? "?" : "");
        kotlin.reflect.q qVar = this.platformTypeUpperBound;
        if (!(qVar instanceof TypeReference)) {
            return str;
        }
        String asString = ((TypeReference) qVar).asString(true);
        if (s.areEqual(asString, str)) {
            return str;
        }
        if (s.areEqual(asString, str + '?')) {
            return str + '!';
        }
        return '(' + str + ".." + asString + ')';
    }

    private final String getArrayClassName(Class<?> cls) {
        return s.areEqual(cls, boolean[].class) ? "kotlin.BooleanArray" : s.areEqual(cls, char[].class) ? "kotlin.CharArray" : s.areEqual(cls, byte[].class) ? "kotlin.ByteArray" : s.areEqual(cls, short[].class) ? "kotlin.ShortArray" : s.areEqual(cls, int[].class) ? "kotlin.IntArray" : s.areEqual(cls, float[].class) ? "kotlin.FloatArray" : s.areEqual(cls, long[].class) ? "kotlin.LongArray" : s.areEqual(cls, double[].class) ? "kotlin.DoubleArray" : "kotlin.Array";
    }

    public static /* synthetic */ void getFlags$kotlin_stdlib$annotations() {
    }

    public static /* synthetic */ void getPlatformTypeUpperBound$kotlin_stdlib$annotations() {
    }

    public boolean equals(Object obj) {
        if (obj instanceof TypeReference) {
            TypeReference typeReference = (TypeReference) obj;
            if (s.areEqual(getClassifier(), typeReference.getClassifier()) && s.areEqual(getArguments(), typeReference.getArguments()) && s.areEqual(this.platformTypeUpperBound, typeReference.platformTypeUpperBound) && this.flags == typeReference.flags) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.q, kotlin.reflect.b
    public List<Annotation> getAnnotations() {
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.q
    public List<kotlin.reflect.s> getArguments() {
        return this.arguments;
    }

    @Override // kotlin.reflect.q
    public kotlin.reflect.f getClassifier() {
        return this.classifier;
    }

    public final int getFlags$kotlin_stdlib() {
        return this.flags;
    }

    public final kotlin.reflect.q getPlatformTypeUpperBound$kotlin_stdlib() {
        return this.platformTypeUpperBound;
    }

    public int hashCode() {
        return (((getClassifier().hashCode() * 31) + getArguments().hashCode()) * 31) + this.flags;
    }

    @Override // kotlin.reflect.q
    public boolean isMarkedNullable() {
        return (this.flags & 1) != 0;
    }

    public String toString() {
        return asString(false) + " (Kotlin reflection is not available)";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TypeReference(kotlin.reflect.f classifier, List<kotlin.reflect.s> arguments, boolean z7) {
        this(classifier, arguments, null, z7 ? 1 : 0);
        s.checkNotNullParameter(classifier, "classifier");
        s.checkNotNullParameter(arguments, "arguments");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String asString(kotlin.reflect.s sVar) {
        String valueOf;
        if (sVar.getVariance() == null) {
            return "*";
        }
        kotlin.reflect.q type = sVar.getType();
        TypeReference typeReference = type instanceof TypeReference ? (TypeReference) type : null;
        if (typeReference == null || (valueOf = typeReference.asString(true)) == null) {
            valueOf = String.valueOf(sVar.getType());
        }
        int i8 = b.$EnumSwitchMapping$0[sVar.getVariance().ordinal()];
        if (i8 == 1) {
            return valueOf;
        }
        if (i8 == 2) {
            return "in " + valueOf;
        }
        if (i8 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return "out " + valueOf;
    }
}
