package com.yandex.div.internal.parser;

import com.yandex.div.json.ParsingErrorLogger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class TemplateParsingErrorLogger implements ParsingErrorLogger {

    @NotNull
    private final ParsingErrorLogger logger;

    @NotNull
    private final String templateId;

    public TemplateParsingErrorLogger(@NotNull ParsingErrorLogger logger, @NotNull String templateId) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(templateId, "templateId");
        this.logger = logger;
        this.templateId = templateId;
    }

    @Override // com.yandex.div.json.ParsingErrorLogger
    public void logError(@NotNull Exception e4) {
        Intrinsics.checkNotNullParameter(e4, "e");
        this.logger.logTemplateError(e4, this.templateId);
    }
}
