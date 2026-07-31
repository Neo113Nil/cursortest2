package com.yandex.div.json;

import androidx.annotation.NonNull;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.Log;
import com.yandex.div.json.ParsingErrorLogger;

/* loaded from: classes2.dex */
public interface ParsingErrorLogger {
    public static final ParsingErrorLogger LOG = new ParsingErrorLogger() { // from class: L1.a
        @Override // com.yandex.div.json.ParsingErrorLogger
        public final void logError(Exception exc) {
            ParsingErrorLogger.a(exc);
        }
    };
    public static final ParsingErrorLogger ASSERT = new ParsingErrorLogger() { // from class: L1.b
        @Override // com.yandex.div.json.ParsingErrorLogger
        public final void logError(Exception exc) {
            ParsingErrorLogger.b(exc);
        }
    };

    static /* synthetic */ void a(Exception exc) {
        if (Log.isEnabled()) {
            Log.e("ParsingErrorLogger", "An error occurred during parsing process", exc);
        }
    }

    static /* synthetic */ void b(Exception exc) {
        if (Assert.isEnabled()) {
            Assert.fail(exc.getMessage(), exc);
        }
    }

    void logError(@NonNull Exception exc);

    default void logTemplateError(@NonNull Exception exc, @NonNull String str) {
        logError(exc);
    }
}
