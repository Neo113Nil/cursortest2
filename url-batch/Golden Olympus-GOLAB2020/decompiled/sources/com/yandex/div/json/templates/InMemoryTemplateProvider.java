package com.yandex.div.json.templates;

import com.yandex.div.internal.util.CollectionsKt;
import com.yandex.div.json.JsonTemplate;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class InMemoryTemplateProvider<T extends JsonTemplate<?>> implements TemplateProvider<T> {

    @NotNull
    private final Map<String, T> templatesMap = CollectionsKt.arrayMap();

    public final void put$div_data_release(@NotNull String templateId, @NotNull T jsonTemplate) {
        Intrinsics.checkNotNullParameter(templateId, "templateId");
        Intrinsics.checkNotNullParameter(jsonTemplate, "jsonTemplate");
        this.templatesMap.put(templateId, jsonTemplate);
    }

    public final void takeSnapshot$div_data_release(@NotNull Map<String, T> target) {
        Intrinsics.checkNotNullParameter(target, "target");
        target.putAll(this.templatesMap);
    }

    @Override // com.yandex.div.json.templates.TemplateProvider
    @Nullable
    public T get(@NotNull String templateId) {
        Intrinsics.checkNotNullParameter(templateId, "templateId");
        return this.templatesMap.get(templateId);
    }
}
