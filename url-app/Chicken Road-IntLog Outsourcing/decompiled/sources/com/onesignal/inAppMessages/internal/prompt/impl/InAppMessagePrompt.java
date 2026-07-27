package com.onesignal.inAppMessages.internal.prompt.impl;

import k4.InterfaceC1218d;
import n4.InterfaceC1344a;
import u1.AbstractC1477a;

/* loaded from: classes.dex */
public abstract class InAppMessagePrompt {
    private boolean prompted;

    public interface OSPromptActionCompletionCallback {
        void onCompleted(PromptActionResult promptActionResult);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class PromptActionResult {
        private static final /* synthetic */ InterfaceC1344a $ENTRIES;
        private static final /* synthetic */ PromptActionResult[] $VALUES;
        public static final PromptActionResult PERMISSION_GRANTED = new PromptActionResult("PERMISSION_GRANTED", 0);
        public static final PromptActionResult PERMISSION_DENIED = new PromptActionResult("PERMISSION_DENIED", 1);
        public static final PromptActionResult LOCATION_PERMISSIONS_MISSING_MANIFEST = new PromptActionResult("LOCATION_PERMISSIONS_MISSING_MANIFEST", 2);
        public static final PromptActionResult ERROR = new PromptActionResult("ERROR", 3);

        private static final /* synthetic */ PromptActionResult[] $values() {
            return new PromptActionResult[]{PERMISSION_GRANTED, PERMISSION_DENIED, LOCATION_PERMISSIONS_MISSING_MANIFEST, ERROR};
        }

        static {
            PromptActionResult[] $values = $values();
            $VALUES = $values;
            $ENTRIES = AbstractC1477a.n($values);
        }

        private PromptActionResult(String str, int i2) {
        }

        public static InterfaceC1344a getEntries() {
            return $ENTRIES;
        }

        public static PromptActionResult valueOf(String str) {
            return (PromptActionResult) Enum.valueOf(PromptActionResult.class, str);
        }

        public static PromptActionResult[] values() {
            return (PromptActionResult[]) $VALUES.clone();
        }
    }

    public abstract String getPromptKey();

    public abstract Object handlePrompt(InterfaceC1218d interfaceC1218d);

    public final boolean hasPrompted() {
        return this.prompted;
    }

    public final void setPrompted(boolean z) {
        this.prompted = z;
    }

    public String toString() {
        return "OSInAppMessagePrompt{key=" + getPromptKey() + " prompted=" + this.prompted + '}';
    }
}
