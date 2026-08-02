package kotlinx.serialization.json.internal;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.ElementMarker;
import operations.array.Map$evaluateLogic$1;

/* loaded from: classes9.dex */
public final class JsonElementMarker {
    public boolean isUnmarkedNull;
    public final ElementMarker origin;

    public JsonElementMarker(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        this.origin = new ElementMarker(serialDescriptor, new Map$evaluateLogic$1(2, this, JsonElementMarker.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0, 7));
    }
}
