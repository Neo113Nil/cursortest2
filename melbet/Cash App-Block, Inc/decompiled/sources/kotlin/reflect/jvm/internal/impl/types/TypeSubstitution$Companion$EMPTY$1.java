package kotlin.reflect.jvm.internal.impl.types;

/* loaded from: classes9.dex */
public final class TypeSubstitution$Companion$EMPTY$1 extends TypeSubstitution {
    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    /* renamed from: get, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ TypeProjection mo4156get(KotlinType kotlinType) {
        return (TypeProjection) get(kotlinType);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public boolean isEmpty() {
        return true;
    }

    public String toString() {
        return "Empty TypeSubstitution";
    }

    public Void get(KotlinType kotlinType) {
        kotlinType.getClass();
        return null;
    }
}
