package com.yandex.div.storage.analytics;

import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.storage.templates.TemplatesContainer;
import com.yandex.div.storage.util.CardErrorTransformer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public class TemplateCardErrorTransformer implements CardErrorTransformer {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final ParsingErrorLogger internalLogger;

    @NotNull
    private final TemplatesContainer templateContainer;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public TemplateCardErrorTransformer(@NotNull TemplatesContainer templateContainer, @NotNull ParsingErrorLogger internalLogger) {
        Intrinsics.checkNotNullParameter(templateContainer, "templateContainer");
        Intrinsics.checkNotNullParameter(internalLogger, "internalLogger");
        this.templateContainer = templateContainer;
        this.internalLogger = internalLogger;
    }
}
