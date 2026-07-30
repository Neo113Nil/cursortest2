package kotlin.reflect;

/* loaded from: classes4.dex */
public abstract class e {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T cast(d dVar, Object obj) {
        kotlin.jvm.internal.s.checkNotNullParameter(dVar, "<this>");
        if (dVar.isInstance(obj)) {
            kotlin.jvm.internal.s.checkNotNull(obj, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.cast");
            return obj;
        }
        throw new ClassCastException("Value cannot be cast to " + dVar.getQualifiedName());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T safeCast(d dVar, Object obj) {
        kotlin.jvm.internal.s.checkNotNullParameter(dVar, "<this>");
        if (!dVar.isInstance(obj)) {
            return null;
        }
        kotlin.jvm.internal.s.checkNotNull(obj, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.safeCast");
        return obj;
    }
}
