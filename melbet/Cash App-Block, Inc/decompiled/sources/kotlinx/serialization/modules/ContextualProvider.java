package kotlinx.serialization.modules;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;

/* loaded from: classes3.dex */
public abstract class ContextualProvider {

    public final class Argless extends ContextualProvider {
        public final KSerializer serializer;

        public Argless(KSerializer kSerializer) {
            kSerializer.getClass();
            this.serializer = kSerializer;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof Argless) && Intrinsics.areEqual(((Argless) obj).serializer, this.serializer);
        }

        public final int hashCode() {
            return this.serializer.hashCode();
        }

        @Override // kotlinx.serialization.modules.ContextualProvider
        public final KSerializer invoke(List list) {
            list.getClass();
            return this.serializer;
        }
    }

    /* loaded from: classes9.dex */
    public final class WithTypeArguments extends ContextualProvider {
        public final Function1 provider;

        public WithTypeArguments(Function1 function1) {
            function1.getClass();
            this.provider = function1;
        }

        public final Function1 getProvider() {
            return this.provider;
        }

        @Override // kotlinx.serialization.modules.ContextualProvider
        public final KSerializer invoke(List list) {
            list.getClass();
            return (KSerializer) this.provider.invoke(list);
        }
    }

    public abstract KSerializer invoke(List list);
}
