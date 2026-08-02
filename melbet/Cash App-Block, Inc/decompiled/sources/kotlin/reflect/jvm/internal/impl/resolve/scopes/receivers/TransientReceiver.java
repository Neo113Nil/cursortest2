package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* loaded from: classes9.dex */
public class TransientReceiver extends AbstractReceiverValue {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransientReceiver(KotlinType kotlinType) {
        super(kotlinType, null);
        if (kotlinType == null) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "type", "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/TransientReceiver", "<init>"));
        }
    }

    public String toString() {
        return "{Transient} : " + getType();
    }
}
