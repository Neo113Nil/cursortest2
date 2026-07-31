package com.yandex.div.storage.analytics;

import V1.a;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.storage.templates.TemplatesContainer;
import com.yandex.div.storage.util.LazyProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public class CardErrorLoggerFactory {

    @NotNull
    private final a errorTransformer;

    @NotNull
    private final ParsingErrorLogger parsingErrorLogger;

    @NotNull
    private final TemplatesContainer templateContainer;

    public CardErrorLoggerFactory(@Nullable a aVar, @NotNull TemplatesContainer templateContainer, @NotNull ParsingErrorLogger parsingErrorLogger) {
        Intrinsics.checkNotNullParameter(templateContainer, "templateContainer");
        Intrinsics.checkNotNullParameter(parsingErrorLogger, "parsingErrorLogger");
        this.templateContainer = templateContainer;
        this.parsingErrorLogger = parsingErrorLogger;
        this.errorTransformer = new LazyProvider(new CardErrorLoggerFactory$errorTransformer$1(aVar, this));
    }
}
