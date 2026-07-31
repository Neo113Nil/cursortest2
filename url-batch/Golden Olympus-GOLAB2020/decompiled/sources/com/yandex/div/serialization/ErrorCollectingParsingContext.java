package com.yandex.div.serialization;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.templates.TemplateProvider;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class ErrorCollectingParsingContext implements ParsingContext, ParsingContextWrapper {

    @NotNull
    private final ParsingContext baseContext;

    @NotNull
    private final List<Exception> errors;

    @NotNull
    private final ParsingErrorLogger logger;

    public ErrorCollectingParsingContext(@NotNull ParsingContext baseContext) {
        Intrinsics.checkNotNullParameter(baseContext, "baseContext");
        this.baseContext = baseContext;
        this.errors = new ArrayList();
        this.logger = new ParsingErrorLogger() { // from class: com.yandex.div.serialization.a
            @Override // com.yandex.div.json.ParsingErrorLogger
            public final void logError(Exception exc) {
                ErrorCollectingParsingContext.logger$lambda$0(ErrorCollectingParsingContext.this, exc);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void logger$lambda$0(ErrorCollectingParsingContext this$0, Exception error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "error");
        this$0.errors.add(error);
        this$0.getBaseContext().getLogger().logError(error);
    }

    @Override // com.yandex.div.serialization.ParsingContext
    public boolean getAllowPropertyOverride() {
        return this.baseContext.getAllowPropertyOverride();
    }

    @Override // com.yandex.div.serialization.ParsingContextWrapper
    @NotNull
    public ParsingContext getBaseContext() {
        return this.baseContext;
    }

    @NotNull
    public final List<Exception> getErrors() {
        return this.errors;
    }

    @Override // com.yandex.div.serialization.ParsingContext
    @NotNull
    public ParsingErrorLogger getLogger() {
        return this.logger;
    }

    @Override // com.yandex.div.serialization.ParsingContext
    @NotNull
    public TemplateProvider<EntityTemplate<?>> getTemplates() {
        return this.baseContext.getTemplates();
    }
}
