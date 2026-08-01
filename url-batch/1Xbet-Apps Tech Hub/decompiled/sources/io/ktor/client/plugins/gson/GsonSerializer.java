package io.ktor.client.plugins.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.ktor.client.plugins.json.JsonSerializer;
import io.ktor.http.ContentType;
import io.ktor.http.LinkHeader;
import io.ktor.http.content.OutgoingContent;
import io.ktor.http.content.TextContent;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.utils.io.core.Input;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GsonSerializer.kt */
@Deprecated(message = "Please use ContentNegotiation plugin and its converters: https://ktor.io/docs/migrating-2.html#serialization-client")
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B \u0012\u0019\b\u0002\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006¢\u0006\u0002\u0010\u0007J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lio/ktor/client/plugins/gson/GsonSerializer;", "Lio/ktor/client/plugins/json/JsonSerializer;", "block", "Lkotlin/Function1;", "Lcom/google/gson/GsonBuilder;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;)V", "backend", "Lcom/google/gson/Gson;", "read", "", LinkHeader.Parameters.Type, "Lio/ktor/util/reflect/TypeInfo;", "body", "Lio/ktor/utils/io/core/Input;", "write", "Lio/ktor/http/content/OutgoingContent;", "data", "contentType", "Lio/ktor/http/ContentType;", "ktor-client-gson"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GsonSerializer implements JsonSerializer {
    private final Gson backend;

    /* JADX WARN: Multi-variable type inference failed */
    public GsonSerializer() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public GsonSerializer(Function1<? super GsonBuilder, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        GsonBuilder gsonBuilder = new GsonBuilder();
        block.invoke(gsonBuilder);
        Gson create = gsonBuilder.create();
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        this.backend = create;
    }

    @Override // io.ktor.client.plugins.json.JsonSerializer
    public OutgoingContent write(Object obj) {
        return JsonSerializer.DefaultImpls.write(this, obj);
    }

    public /* synthetic */ GsonSerializer(AnonymousClass1 anonymousClass1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Function1<GsonBuilder, Unit>() { // from class: io.ktor.client.plugins.gson.GsonSerializer.1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(GsonBuilder gsonBuilder) {
                Intrinsics.checkNotNullParameter(gsonBuilder, "$this$null");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(GsonBuilder gsonBuilder) {
                invoke2(gsonBuilder);
                return Unit.INSTANCE;
            }
        } : anonymousClass1);
    }

    @Override // io.ktor.client.plugins.json.JsonSerializer
    public OutgoingContent write(Object data, ContentType contentType) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        String json = this.backend.toJson(data);
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        return new TextContent(json, contentType, null, 4, null);
    }

    @Override // io.ktor.client.plugins.json.JsonSerializer
    public Object read(TypeInfo type, Input body) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(body, "body");
        Object fromJson = this.backend.fromJson(Input.readText$default(body, 0, 0, 3, null), type.getReifiedType());
        Intrinsics.checkNotNullExpressionValue(fromJson, "fromJson(...)");
        return fromJson;
    }
}
