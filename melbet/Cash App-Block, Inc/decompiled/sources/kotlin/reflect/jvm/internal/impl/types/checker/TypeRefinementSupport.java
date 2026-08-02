package kotlin.reflect.jvm.internal.impl.types.checker;

/* loaded from: classes9.dex */
public abstract class TypeRefinementSupport {

    public static final class Enabled extends TypeRefinementSupport {
        public final KotlinTypeRefiner getTypeRefiner() {
            return null;
        }
    }

    public final boolean isEnabled() {
        return false;
    }
}
