package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

@Serializable(with = JsonElementSerializer.class)
/* loaded from: classes9.dex */
public abstract class JsonElement {
    public static final Companion Companion = new Companion();

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"kotlinx/serialization/json/JsonElement$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/json/JsonElement;", "serializer", "()Lkotlinx/serialization/KSerializer;", "kotlinx-serialization-json"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return JsonElementSerializer.INSTANCE;
        }
    }
}
