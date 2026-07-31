package com.onesignal.inAppMessages.internal.prompt.impl;

import io.opentelemetry.semconv.OtelAttributes;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: InAppMessagePrompt.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001:\u0002\u0010\u0011B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u0004\u0018\u00010\nH¦@¢\u0006\u0002\u0010\u000bJ\u0006\u0010\f\u001a\u00020\bJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\bJ\b\u0010\u000f\u001a\u00020\u0004H\u0016R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/onesignal/inAppMessages/internal/prompt/impl/InAppMessagePrompt;", "", "()V", "promptKey", "", "getPromptKey", "()Ljava/lang/String;", "prompted", "", "handlePrompt", "Lcom/onesignal/inAppMessages/internal/prompt/impl/InAppMessagePrompt$PromptActionResult;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hasPrompted", "setPrompted", "", "toString", "OSPromptActionCompletionCallback", "PromptActionResult", "com.onesignal.inAppMessages"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class InAppMessagePrompt {
    private boolean prompted;

    /* compiled from: InAppMessagePrompt.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/onesignal/inAppMessages/internal/prompt/impl/InAppMessagePrompt$OSPromptActionCompletionCallback;", "", "onCompleted", "", "result", "Lcom/onesignal/inAppMessages/internal/prompt/impl/InAppMessagePrompt$PromptActionResult;", "com.onesignal.inAppMessages"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface OSPromptActionCompletionCallback {
        void onCompleted(PromptActionResult result);
    }

    public abstract String getPromptKey();

    public abstract Object handlePrompt(Continuation<? super PromptActionResult> continuation);

    /* renamed from: hasPrompted, reason: from getter */
    public final boolean getPrompted() {
        return this.prompted;
    }

    public final void setPrompted(boolean prompted) {
        this.prompted = prompted;
    }

    public String toString() {
        return "OSInAppMessagePrompt{key=" + getPromptKey() + " prompted=" + this.prompted + AbstractJsonLexerKt.END_OBJ;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: InAppMessagePrompt.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/onesignal/inAppMessages/internal/prompt/impl/InAppMessagePrompt$PromptActionResult;", "", "(Ljava/lang/String;I)V", "PERMISSION_GRANTED", "PERMISSION_DENIED", "LOCATION_PERMISSIONS_MISSING_MANIFEST", OtelAttributes.OtelStatusCodeValues.ERROR, "com.onesignal.inAppMessages"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PromptActionResult {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ PromptActionResult[] $VALUES;
        public static final PromptActionResult PERMISSION_GRANTED = new PromptActionResult("PERMISSION_GRANTED", 0);
        public static final PromptActionResult PERMISSION_DENIED = new PromptActionResult("PERMISSION_DENIED", 1);
        public static final PromptActionResult LOCATION_PERMISSIONS_MISSING_MANIFEST = new PromptActionResult("LOCATION_PERMISSIONS_MISSING_MANIFEST", 2);
        public static final PromptActionResult ERROR = new PromptActionResult(OtelAttributes.OtelStatusCodeValues.ERROR, 3);

        private static final /* synthetic */ PromptActionResult[] $values() {
            return new PromptActionResult[]{PERMISSION_GRANTED, PERMISSION_DENIED, LOCATION_PERMISSIONS_MISSING_MANIFEST, ERROR};
        }

        public static EnumEntries<PromptActionResult> getEntries() {
            return $ENTRIES;
        }

        public static PromptActionResult valueOf(String str) {
            return (PromptActionResult) Enum.valueOf(PromptActionResult.class, str);
        }

        public static PromptActionResult[] values() {
            return (PromptActionResult[]) $VALUES.clone();
        }

        private PromptActionResult(String str, int i) {
        }

        static {
            PromptActionResult[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }
    }
}
