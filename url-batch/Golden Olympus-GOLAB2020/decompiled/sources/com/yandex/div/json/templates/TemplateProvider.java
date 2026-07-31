package com.yandex.div.json.templates;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.json.ParsingExceptionKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public interface TemplateProvider<T extends EntityTemplate<?>> {

    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    @Metadata
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final <T extends EntityTemplate<?>> TemplateProvider<T> empty() {
            return (TemplateProvider<T>) new TemplateProvider<T>() { // from class: com.yandex.div.json.templates.TemplateProvider$Companion$empty$1
                /* JADX WARN: Incorrect return type in method signature: (Ljava/lang/String;)TT; */
                @Override // com.yandex.div.json.templates.TemplateProvider
                @Nullable
                public EntityTemplate get(@NotNull String templateId) {
                    Intrinsics.checkNotNullParameter(templateId, "templateId");
                    return null;
                }
            };
        }

        @NotNull
        public final <T extends EntityTemplate<?>> TemplateProvider<T> wrap(@NotNull final Map<String, ? extends T> map) {
            Intrinsics.checkNotNullParameter(map, "map");
            return (TemplateProvider<T>) new TemplateProvider<T>() { // from class: com.yandex.div.json.templates.TemplateProvider$Companion$wrap$1
                /* JADX WARN: Incorrect return type in method signature: (Ljava/lang/String;)TT; */
                @Override // com.yandex.div.json.templates.TemplateProvider
                @Nullable
                public EntityTemplate get(@NotNull String templateId) {
                    Intrinsics.checkNotNullParameter(templateId, "templateId");
                    return (EntityTemplate) map.get(templateId);
                }
            };
        }
    }

    @Nullable
    T get(@NotNull String str);

    @NotNull
    default T getOrThrow(@NotNull String templateId, @NotNull JSONObject json) {
        Intrinsics.checkNotNullParameter(templateId, "templateId");
        Intrinsics.checkNotNullParameter(json, "json");
        T t4 = get(templateId);
        if (t4 != null) {
            return t4;
        }
        throw ParsingExceptionKt.templateNotFound(json, templateId);
    }
}
