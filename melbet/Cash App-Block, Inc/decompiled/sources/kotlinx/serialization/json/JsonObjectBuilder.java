package kotlinx.serialization.json;

import java.util.LinkedHashMap;

/* loaded from: classes5.dex */
public final class JsonObjectBuilder {
    public final LinkedHashMap content = new LinkedHashMap();

    public final JsonElement put(String str, JsonElement jsonElement) {
        str.getClass();
        jsonElement.getClass();
        return (JsonElement) this.content.put(str, jsonElement);
    }
}
