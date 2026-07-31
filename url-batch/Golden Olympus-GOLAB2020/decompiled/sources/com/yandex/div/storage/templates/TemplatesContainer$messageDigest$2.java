package com.yandex.div.storage.templates;

import com.yandex.div.json.ParsingErrorLogger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
final class TemplatesContainer$messageDigest$2 extends s implements Function0<MessageDigest> {
    final /* synthetic */ TemplatesContainer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TemplatesContainer$messageDigest$2(TemplatesContainer templatesContainer) {
        super(0);
        this.this$0 = templatesContainer;
    }

    @Override // kotlin.jvm.functions.Function0
    @Nullable
    public final MessageDigest invoke() {
        ParsingErrorLogger parsingErrorLogger;
        try {
            return MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e4) {
            parsingErrorLogger = this.this$0.errorLogger;
            parsingErrorLogger.logError(new IllegalStateException("Storage cannot work with templates!", e4));
            return null;
        }
    }
}
