package io.ktor.client.plugins.json;

import io.ktor.http.ContentType;
import io.ktor.http.LinkHeader;
import io.ktor.http.content.OutgoingContent;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.utils.io.core.Input;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: JsonSerializer.kt */
@Deprecated(message = "Please use ContentNegotiation plugin and its converters: https://ktor.io/docs/migrating-2.html#serialization-client")
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0001H\u0016J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, d2 = {"Lio/ktor/client/plugins/json/JsonSerializer;", "", "read", LinkHeader.Parameters.Type, "Lio/ktor/util/reflect/TypeInfo;", "body", "Lio/ktor/utils/io/core/Input;", "write", "Lio/ktor/http/content/OutgoingContent;", "data", "contentType", "Lio/ktor/http/ContentType;", "ktor-client-json"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface JsonSerializer {
    Object read(TypeInfo type, Input body);

    OutgoingContent write(Object data);

    OutgoingContent write(Object data, ContentType contentType);

    /* compiled from: JsonSerializer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static OutgoingContent write(JsonSerializer jsonSerializer, Object data) {
            Intrinsics.checkNotNullParameter(data, "data");
            return jsonSerializer.write(data, ContentType.Application.INSTANCE.getJson());
        }
    }
}
