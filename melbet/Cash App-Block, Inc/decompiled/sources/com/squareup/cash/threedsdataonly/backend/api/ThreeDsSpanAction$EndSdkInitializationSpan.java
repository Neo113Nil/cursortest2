package com.squareup.cash.threedsdataonly.backend.api;

import androidx.media3.ui.HtmlUtils;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes7.dex */
public final class ThreeDsSpanAction$EndSdkInitializationSpan extends HtmlUtils {
    public final boolean sdkInitializationFailed;
    public final boolean sdkPreInitialized;
    public final Source source;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Source {
        public static final /* synthetic */ Source[] $VALUES;
        public static final Source APP_START;
        public static final Source BLOCKER;

        static {
            Source source = new Source("APP_START", 0);
            APP_START = source;
            Source source2 = new Source("BLOCKER", 1);
            BLOCKER = source2;
            $VALUES = new Source[]{source, source2};
        }

        public static Source valueOf(String str) {
            return (Source) Enum.valueOf(Source.class, str);
        }

        public static Source[] values() {
            return (Source[]) $VALUES.clone();
        }
    }

    public ThreeDsSpanAction$EndSdkInitializationSpan(boolean z, boolean z2, Source source) {
        this.sdkPreInitialized = z;
        this.sdkInitializationFailed = z2;
        this.source = source;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThreeDsSpanAction$EndSdkInitializationSpan)) {
            return false;
        }
        ThreeDsSpanAction$EndSdkInitializationSpan threeDsSpanAction$EndSdkInitializationSpan = (ThreeDsSpanAction$EndSdkInitializationSpan) obj;
        return this.sdkPreInitialized == threeDsSpanAction$EndSdkInitializationSpan.sdkPreInitialized && this.sdkInitializationFailed == threeDsSpanAction$EndSdkInitializationSpan.sdkInitializationFailed && this.source == threeDsSpanAction$EndSdkInitializationSpan.source;
    }

    public final boolean getSdkInitializationFailed() {
        return this.sdkInitializationFailed;
    }

    public final boolean getSdkPreInitialized() {
        return this.sdkPreInitialized;
    }

    public final Source getSource() {
        return this.source;
    }

    public final int hashCode() {
        return this.source.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Boolean.hashCode(this.sdkPreInitialized) * 31, 31, this.sdkInitializationFailed);
    }

    public final String toString() {
        StringBuilder m = NavAction$$ExternalSyntheticOutline0.m("EndSdkInitializationSpan(sdkPreInitialized=", ", sdkInitializationFailed=", ", source=", this.sdkPreInitialized, this.sdkInitializationFailed);
        m.append(this.source);
        m.append(")");
        return m.toString();
    }
}
