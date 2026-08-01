package io.ktor.client.plugins.json;

import io.ktor.client.HttpClient;
import io.ktor.client.plugins.HttpClientPlugin;
import io.ktor.client.request.HttpRequestPipeline;
import io.ktor.client.statement.HttpResponsePipeline;
import io.ktor.http.ContentType;
import io.ktor.http.ContentTypeMatcher;
import io.ktor.http.LinkHeader;
import io.ktor.util.AttributeKey;
import io.ktor.util.KtorDsl;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* compiled from: JsonPlugin.kt */
@Deprecated(message = "Please use ContentNegotiation plugin: https://ktor.io/docs/migrating-2.html#serialization-client")
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0002\u0018\u0019B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004BC\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b\u0012\u0012\b\u0002\u0010\f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\r¢\u0006\u0002\u0010\u000fJ\u0015\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\tH\u0000¢\u0006\u0002\b\u0017R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001a"}, d2 = {"Lio/ktor/client/plugins/json/JsonPlugin;", "", "config", "Lio/ktor/client/plugins/json/JsonPlugin$Config;", "(Lio/ktor/client/plugins/json/JsonPlugin$Config;)V", "serializer", "Lio/ktor/client/plugins/json/JsonSerializer;", "acceptContentTypes", "", "Lio/ktor/http/ContentType;", "receiveContentTypeMatchers", "Lio/ktor/http/ContentTypeMatcher;", "ignoredTypes", "", "Lkotlin/reflect/KClass;", "(Lio/ktor/client/plugins/json/JsonSerializer;Ljava/util/List;Ljava/util/List;Ljava/util/Set;)V", "getAcceptContentTypes", "()Ljava/util/List;", "getSerializer", "()Lio/ktor/client/plugins/json/JsonSerializer;", "canHandle", "", "contentType", "canHandle$ktor_client_json", "Config", "Plugin", "ktor-client-json"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class JsonPlugin {

    /* renamed from: Plugin, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final AttributeKey<JsonPlugin> key = new AttributeKey<>("Json");
    private final List<ContentType> acceptContentTypes;
    private final Set<KClass<?>> ignoredTypes;
    private final List<ContentTypeMatcher> receiveContentTypeMatchers;
    private final JsonSerializer serializer;

    /* JADX WARN: Multi-variable type inference failed */
    public JsonPlugin(JsonSerializer serializer, List<ContentType> acceptContentTypes, List<? extends ContentTypeMatcher> receiveContentTypeMatchers, Set<? extends KClass<?>> ignoredTypes) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(acceptContentTypes, "acceptContentTypes");
        Intrinsics.checkNotNullParameter(receiveContentTypeMatchers, "receiveContentTypeMatchers");
        Intrinsics.checkNotNullParameter(ignoredTypes, "ignoredTypes");
        this.serializer = serializer;
        this.acceptContentTypes = acceptContentTypes;
        this.receiveContentTypeMatchers = receiveContentTypeMatchers;
        this.ignoredTypes = ignoredTypes;
    }

    public final JsonSerializer getSerializer() {
        return this.serializer;
    }

    public /* synthetic */ JsonPlugin(JsonSerializer jsonSerializer, List list, List list2, Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(jsonSerializer, (i & 2) != 0 ? CollectionsKt.listOf(ContentType.Application.INSTANCE.getJson()) : list, (i & 4) != 0 ? CollectionsKt.listOf(new JsonContentTypeMatcher()) : list2, (i & 8) != 0 ? SetsKt.plus((Set) JsonPluginKt.getDefaultCommonIgnoredTypes(), (Iterable) JsonPluginJvmKt.getDefaultIgnoredTypes()) : set);
    }

    public final List<ContentType> getAcceptContentTypes() {
        return this.acceptContentTypes;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public JsonPlugin(Config config) {
        this(r0 == null ? DefaultJvmKt.defaultSerializer() : r0, config.getAcceptContentTypes(), config.getReceiveContentTypeMatchers(), null, 8, null);
        Intrinsics.checkNotNullParameter(config, "config");
        JsonSerializer serializer = config.getSerializer();
    }

    /* compiled from: JsonPlugin.kt */
    @KtorDsl
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001f\u0010\u001d\u001a\u00020\u001e2\u0012\u0010\u001f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050 \"\u00020\u0005¢\u0006\u0002\u0010!J\u0006\u0010\"\u001a\u00020\u001eJ\u0011\u0010#\u001a\u00020\u001e\"\u0006\b\u0000\u0010$\u0018\u0001H\u0086\bJ\u0012\u0010#\u001a\u00020\u001e2\n\u0010%\u001a\u0006\u0012\u0002\b\u00030\u0011J\u000e\u0010&\u001a\u00020\u001e2\u0006\u0010'\u001a\u00020\u0007J\u0011\u0010(\u001a\u00020\u001e\"\u0006\b\u0000\u0010$\u0018\u0001H\u0086\bJ\u0012\u0010(\u001a\u00020\u001e2\n\u0010%\u001a\u0006\u0012\u0002\b\u00030\u0011R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R0\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00110\u0010X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R0\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000eR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006)"}, d2 = {"Lio/ktor/client/plugins/json/JsonPlugin$Config;", "", "()V", "_acceptContentTypes", "", "Lio/ktor/http/ContentType;", "_receiveContentTypeMatchers", "Lio/ktor/http/ContentTypeMatcher;", "value", "", "acceptContentTypes", "getAcceptContentTypes", "()Ljava/util/List;", "setAcceptContentTypes", "(Ljava/util/List;)V", "ignoredTypes", "", "Lkotlin/reflect/KClass;", "getIgnoredTypes$ktor_client_json", "()Ljava/util/Set;", "receiveContentTypeMatchers", "getReceiveContentTypeMatchers", "setReceiveContentTypeMatchers", "serializer", "Lio/ktor/client/plugins/json/JsonSerializer;", "getSerializer", "()Lio/ktor/client/plugins/json/JsonSerializer;", "setSerializer", "(Lio/ktor/client/plugins/json/JsonSerializer;)V", "accept", "", "contentTypes", "", "([Lio/ktor/http/ContentType;)V", "clearIgnoredTypes", "ignoreType", "T", LinkHeader.Parameters.Type, "receive", "matcher", "removeIgnoredType", "ktor-client-json"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Config {
        private JsonSerializer serializer;
        private final Set<KClass<?>> ignoredTypes = CollectionsKt.toMutableSet(SetsKt.plus((Set) JsonPluginJvmKt.getDefaultIgnoredTypes(), (Iterable) JsonPluginKt.getDefaultCommonIgnoredTypes()));
        private final List<ContentType> _acceptContentTypes = CollectionsKt.mutableListOf(ContentType.Application.INSTANCE.getJson());
        private final List<ContentTypeMatcher> _receiveContentTypeMatchers = CollectionsKt.mutableListOf(new JsonContentTypeMatcher());

        public final Set<KClass<?>> getIgnoredTypes$ktor_client_json() {
            return this.ignoredTypes;
        }

        public final JsonSerializer getSerializer() {
            return this.serializer;
        }

        public final void setSerializer(JsonSerializer jsonSerializer) {
            this.serializer = jsonSerializer;
        }

        public final void setAcceptContentTypes(List<ContentType> value) {
            Intrinsics.checkNotNullParameter(value, "value");
            List<ContentType> list = value;
            if (!(!list.isEmpty())) {
                throw new IllegalArgumentException("At least one content type should be provided to acceptContentTypes".toString());
            }
            this._acceptContentTypes.clear();
            this._acceptContentTypes.addAll(list);
        }

        public final List<ContentType> getAcceptContentTypes() {
            return this._acceptContentTypes;
        }

        public final void setReceiveContentTypeMatchers(List<? extends ContentTypeMatcher> value) {
            Intrinsics.checkNotNullParameter(value, "value");
            List<? extends ContentTypeMatcher> list = value;
            if (!(!list.isEmpty())) {
                throw new IllegalArgumentException("At least one content type should be provided to acceptContentTypes".toString());
            }
            this._receiveContentTypeMatchers.clear();
            this._receiveContentTypeMatchers.addAll(list);
        }

        public final List<ContentTypeMatcher> getReceiveContentTypeMatchers() {
            return this._receiveContentTypeMatchers;
        }

        public final void accept(ContentType... contentTypes) {
            Intrinsics.checkNotNullParameter(contentTypes, "contentTypes");
            CollectionsKt.addAll(this._acceptContentTypes, contentTypes);
        }

        public final void receive(ContentTypeMatcher matcher) {
            Intrinsics.checkNotNullParameter(matcher, "matcher");
            this._receiveContentTypeMatchers.add(matcher);
        }

        public final /* synthetic */ <T> void ignoreType() {
            Intrinsics.reifiedOperationMarker(4, "T");
            ignoreType(Reflection.getOrCreateKotlinClass(Object.class));
        }

        public final /* synthetic */ <T> void removeIgnoredType() {
            Intrinsics.reifiedOperationMarker(4, "T");
            removeIgnoredType(Reflection.getOrCreateKotlinClass(Object.class));
        }

        public final void removeIgnoredType(KClass<?> type) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.ignoredTypes.remove(type);
        }

        public final void ignoreType(KClass<?> type) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.ignoredTypes.add(type);
        }

        public final void clearIgnoredTypes() {
            this.ignoredTypes.clear();
        }
    }

    public final boolean canHandle$ktor_client_json(ContentType contentType) {
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        List<ContentType> list = this.acceptContentTypes;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (contentType.match((ContentType) it.next())) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        List<ContentTypeMatcher> list2 = this.receiveContentTypeMatchers;
        if (z) {
            return true;
        }
        List<ContentTypeMatcher> list3 = list2;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            Iterator<T> it2 = list3.iterator();
            while (it2.hasNext()) {
                if (((ContentTypeMatcher) it2.next()).contains(contentType)) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        return z2;
    }

    /* compiled from: JsonPlugin.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0016J!\u0010\u000e\u001a\u00020\u00032\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\u0010¢\u0006\u0002\b\u0011H\u0016R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lio/ktor/client/plugins/json/JsonPlugin$Plugin;", "Lio/ktor/client/plugins/HttpClientPlugin;", "Lio/ktor/client/plugins/json/JsonPlugin$Config;", "Lio/ktor/client/plugins/json/JsonPlugin;", "()V", "key", "Lio/ktor/util/AttributeKey;", "getKey", "()Lio/ktor/util/AttributeKey;", "install", "", "plugin", "scope", "Lio/ktor/client/HttpClient;", "prepare", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "ktor-client-json"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: io.ktor.client.plugins.json.JsonPlugin$Plugin, reason: from kotlin metadata */
    public static final class Companion implements HttpClientPlugin<Config, JsonPlugin> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public AttributeKey<JsonPlugin> getKey() {
            return JsonPlugin.key;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.ktor.client.plugins.HttpClientPlugin
        public JsonPlugin prepare(Function1<? super Config, Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            Config config = new Config();
            block.invoke(config);
            JsonSerializer serializer = config.getSerializer();
            if (serializer == null) {
                serializer = DefaultJvmKt.defaultSerializer();
            }
            return new JsonPlugin(serializer, CollectionsKt.toList(config.getAcceptContentTypes()), config.getReceiveContentTypeMatchers(), config.getIgnoredTypes$ktor_client_json());
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public void install(JsonPlugin plugin, HttpClient scope) {
            Intrinsics.checkNotNullParameter(plugin, "plugin");
            Intrinsics.checkNotNullParameter(scope, "scope");
            scope.getRequestPipeline().intercept(HttpRequestPipeline.INSTANCE.getTransform(), new JsonPlugin$Plugin$install$1(plugin, null));
            scope.getResponsePipeline().intercept(HttpResponsePipeline.INSTANCE.getTransform(), new JsonPlugin$Plugin$install$2(plugin, null));
        }
    }
}
