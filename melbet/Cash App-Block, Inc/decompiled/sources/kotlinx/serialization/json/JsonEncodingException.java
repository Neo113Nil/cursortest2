package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/json/JsonEncodingException;", "Lkotlinx/serialization/json/JsonException;", "kotlinx-serialization-json"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class JsonEncodingException extends JsonException {
    public JsonEncodingException(String str, String str2) {
        super(str.concat((str2 == null || StringsKt.isBlank(str2)) ? "" : "\n".concat(str2)));
    }
}
