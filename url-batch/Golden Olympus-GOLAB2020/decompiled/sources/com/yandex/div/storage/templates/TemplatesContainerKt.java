package com.yandex.div.storage.templates;

import com.yandex.div.data.DivParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.templates.CachingTemplateProvider;
import com.yandex.div.json.templates.InMemoryTemplateProvider;
import com.yandex.div.json.templates.TemplateProvider;
import kotlin.Metadata;

@Metadata
/* loaded from: classes2.dex */
public abstract class TemplatesContainerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final DivParsingEnvironment createEmptyEnv(ParsingErrorLogger parsingErrorLogger) {
        return new DivParsingEnvironment(parsingErrorLogger, new CachingTemplateProvider(new InMemoryTemplateProvider(), TemplateProvider.Companion.empty()));
    }
}
