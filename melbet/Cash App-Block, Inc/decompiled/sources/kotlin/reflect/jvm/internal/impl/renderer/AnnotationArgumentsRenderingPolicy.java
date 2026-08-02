package kotlin.reflect.jvm.internal.impl.renderer;

/* loaded from: classes9.dex */
public enum AnnotationArgumentsRenderingPolicy {
    NO_ARGUMENTS(3),
    UNLESS_EMPTY(2),
    ALWAYS_PARENTHESIZED("ALWAYS_PARENTHESIZED", 2);

    public final boolean includeAnnotationArguments;
    public final boolean includeEmptyAnnotationArguments;

    /* synthetic */ AnnotationArgumentsRenderingPolicy(int i) {
        this(r3, r4);
    }

    public final boolean getIncludeAnnotationArguments() {
        return this.includeAnnotationArguments;
    }

    public final boolean getIncludeEmptyAnnotationArguments() {
        return this.includeEmptyAnnotationArguments;
    }

    AnnotationArgumentsRenderingPolicy(String str, int i) {
        this.includeAnnotationArguments = r1;
        this.includeEmptyAnnotationArguments = r2;
    }
}
