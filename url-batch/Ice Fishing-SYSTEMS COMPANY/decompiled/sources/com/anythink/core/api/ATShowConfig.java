package com.anythink.core.api;

import com.anythink.core.common.v.p;

/* loaded from: classes.dex */
public class ATShowConfig {
    ATAdInfo atAdInfo;
    ATCustomContentResult atCustomContentResult;
    String scenarioId;
    String showCustomExt;

    public static final class Builder {
        private ATAdInfo atAdInfo;
        private ATCustomContentResult atCustomContentResult;
        private String scenarioId = "";
        private String showCustomExt = "";

        public final Builder adInfo(ATAdInfo aTAdInfo) {
            this.atAdInfo = aTAdInfo;
            return this;
        }

        public final ATShowConfig build() {
            ATShowConfig aTShowConfig = new ATShowConfig();
            aTShowConfig.scenarioId = this.scenarioId;
            aTShowConfig.showCustomExt = this.showCustomExt;
            aTShowConfig.atAdInfo = this.atAdInfo;
            aTShowConfig.atCustomContentResult = this.atCustomContentResult;
            return aTShowConfig;
        }

        public final Builder customContentResult(ATCustomContentResult aTCustomContentResult) {
            this.atCustomContentResult = aTCustomContentResult;
            return this;
        }

        public final Builder scenarioId(String str) {
            if (p.c(str)) {
                this.scenarioId = str;
            }
            return this;
        }

        public final Builder showCustomExt(String str) {
            this.showCustomExt = str;
            return this;
        }
    }

    public final ATAdInfo getATAdInfo() {
        return this.atAdInfo;
    }

    public final ATCustomContentResult getATCustomContentResult() {
        return this.atCustomContentResult;
    }

    public final String getScenarioId() {
        return this.scenarioId;
    }

    public final String getShowCustomExt() {
        return this.showCustomExt;
    }

    private ATShowConfig() {
    }
}
