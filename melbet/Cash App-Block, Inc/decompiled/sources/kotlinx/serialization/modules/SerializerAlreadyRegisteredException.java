package kotlinx.serialization.modules;

import kotlin.Metadata;
import kotlin.reflect.KClass;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/serialization/modules/SerializerAlreadyRegisteredException;", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "kotlinx-serialization-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class SerializerAlreadyRegisteredException extends IllegalArgumentException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SerializerAlreadyRegisteredException(KClass kClass, KClass kClass2) {
        super("Serializer for " + kClass2 + " already registered in the scope of " + kClass);
        kClass.getClass();
        kClass2.getClass();
    }

    public SerializerAlreadyRegisteredException(String str) {
        super(str);
    }
}
