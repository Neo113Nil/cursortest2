package com.yandex.div.storage.analytics;

import V1.a;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.storage.templates.TemplatesContainer;
import com.yandex.div.storage.util.CardErrorTransformer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class CardErrorLoggerFactory$errorTransformer$1 extends s implements Function0<CardErrorTransformer> {
    final /* synthetic */ a $externalErrorTransformer;
    final /* synthetic */ CardErrorLoggerFactory this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CardErrorLoggerFactory$errorTransformer$1(a aVar, CardErrorLoggerFactory cardErrorLoggerFactory) {
        super(0);
        this.$externalErrorTransformer = aVar;
        this.this$0 = cardErrorLoggerFactory;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final CardErrorTransformer invoke() {
        TemplatesContainer templatesContainer;
        ParsingErrorLogger parsingErrorLogger;
        TemplatesContainer templatesContainer2;
        ParsingErrorLogger parsingErrorLogger2;
        a aVar = this.$externalErrorTransformer;
        if (aVar == null) {
            templatesContainer2 = this.this$0.templateContainer;
            parsingErrorLogger2 = this.this$0.parsingErrorLogger;
            return new TemplateCardErrorTransformer(templatesContainer2, parsingErrorLogger2);
        }
        Object obj = aVar.get();
        Intrinsics.checkNotNullExpressionValue(obj, "externalErrorTransformer.get()");
        templatesContainer = this.this$0.templateContainer;
        parsingErrorLogger = this.this$0.parsingErrorLogger;
        return new CardErrorTransformer.Composite(obj, new TemplateCardErrorTransformer(templatesContainer, parsingErrorLogger));
    }
}
