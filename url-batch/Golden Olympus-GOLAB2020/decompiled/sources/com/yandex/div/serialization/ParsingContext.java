package com.yandex.div.serialization;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.templates.TemplateProvider;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public interface ParsingContext {
    default boolean getAllowPropertyOverride() {
        return true;
    }

    @NotNull
    ParsingErrorLogger getLogger();

    @NotNull
    TemplateProvider<EntityTemplate<?>> getTemplates();
}
