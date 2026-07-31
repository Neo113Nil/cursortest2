package com.applovin.mediation;

import androidx.annotation.NonNull;
import com.applovin.impl.mediation.MaxAdViewConfigurationImpl;
import com.pubmatic.sdk.common.POBCommonConstants;

/* loaded from: classes10.dex */
public abstract class MaxAdViewConfiguration {

    public enum AdaptiveType {
        NONE("none"),
        ANCHORED("anchored"),
        INLINE(POBCommonConstants.BANNER_PLACEMENT_TYPE);

        private final String a;

        AdaptiveType(String str) {
            this.a = str;
        }

        @Override // java.lang.Enum
        @NonNull
        public String toString() {
            return this.a;
        }
    }

    public interface Builder {
        MaxAdViewConfiguration build();

        Builder setAdaptiveType(AdaptiveType adaptiveType);

        Builder setAdaptiveWidth(int i);

        Builder setInlineMaximumHeight(int i);
    }

    public static Builder builder() {
        return new MaxAdViewConfigurationImpl.BuilderImpl();
    }

    public abstract AdaptiveType getAdaptiveType();

    public abstract int getAdaptiveWidth();

    public abstract int getInlineMaximumHeight();
}
