package com.yandex.div.json.templates;

import com.yandex.div.json.JsonTemplate;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public class CachingTemplateProvider<T extends JsonTemplate<?>> implements TemplateProvider<T> {

    @NotNull
    private final InMemoryTemplateProvider<T> cacheProvider;

    @NotNull
    private TemplateProvider<? extends T> fallbackProvider;

    public CachingTemplateProvider(@NotNull InMemoryTemplateProvider<T> cacheProvider, @NotNull TemplateProvider<? extends T> fallbackProvider) {
        Intrinsics.checkNotNullParameter(cacheProvider, "cacheProvider");
        Intrinsics.checkNotNullParameter(fallbackProvider, "fallbackProvider");
        this.cacheProvider = cacheProvider;
        this.fallbackProvider = fallbackProvider;
    }

    public void putAll(@NotNull Map<String, ? extends T> parsed) {
        Intrinsics.checkNotNullParameter(parsed, "parsed");
        for (Map.Entry<String, ? extends T> entry : parsed.entrySet()) {
            this.cacheProvider.put$div_data_release(entry.getKey(), entry.getValue());
        }
    }

    public void takeSnapshot(@NotNull Map<String, T> target) {
        Intrinsics.checkNotNullParameter(target, "target");
        this.cacheProvider.takeSnapshot$div_data_release(target);
    }

    @Override // com.yandex.div.json.templates.TemplateProvider
    @Nullable
    public T get(@NotNull String templateId) {
        Intrinsics.checkNotNullParameter(templateId, "templateId");
        T t4 = this.cacheProvider.get(templateId);
        if (t4 != null) {
            return t4;
        }
        T t5 = this.fallbackProvider.get(templateId);
        if (t5 == null) {
            return null;
        }
        this.cacheProvider.put$div_data_release(templateId, t5);
        return t5;
    }
}
