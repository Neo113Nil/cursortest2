package com.yandex.div.serialization;

import O1.Cg;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.templates.TemplateProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public abstract class BuiltInParserKt {

    @NotNull
    private static final ParsingContext builtInParsingContext = new ParsingContext() { // from class: com.yandex.div.serialization.BuiltInParserKt$builtInParsingContext$1

        @NotNull
        private final ParsingErrorLogger logger;

        @NotNull
        private final TemplateProvider<JsonTemplate<?>> templates = TemplateProvider.Companion.empty();

        {
            ParsingErrorLogger LOG = ParsingErrorLogger.LOG;
            Intrinsics.checkNotNullExpressionValue(LOG, "LOG");
            this.logger = LOG;
        }

        @Override // com.yandex.div.serialization.ParsingContext
        @NotNull
        public ParsingErrorLogger getLogger() {
            return this.logger;
        }

        @Override // com.yandex.div.serialization.ParsingContext
        @NotNull
        public TemplateProvider<JsonTemplate<?>> getTemplates() {
            return this.templates;
        }
    };

    @NotNull
    private static final Cg builtInParserComponent = new Cg();

    @NotNull
    public static final Cg getBuiltInParserComponent() {
        return builtInParserComponent;
    }

    @NotNull
    public static final ParsingContext getBuiltInParsingContext() {
        return builtInParsingContext;
    }
}
