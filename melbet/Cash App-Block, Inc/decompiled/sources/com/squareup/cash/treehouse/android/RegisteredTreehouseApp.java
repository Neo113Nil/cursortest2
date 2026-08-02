package com.squareup.cash.treehouse.android;

import app.cash.redwood.treehouse.RealTreehouseApp;

/* loaded from: classes.dex */
public interface RegisteredTreehouseApp {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class FeatureFlagState {
        public static final /* synthetic */ FeatureFlagState[] $VALUES;
        public static final FeatureFlagState ENABLED;
        public static final FeatureFlagState NONE;

        static {
            FeatureFlagState featureFlagState = new FeatureFlagState("NONE", 0);
            NONE = featureFlagState;
            FeatureFlagState featureFlagState2 = new FeatureFlagState("DISABLED", 1);
            FeatureFlagState featureFlagState3 = new FeatureFlagState("ENABLED", 2);
            ENABLED = featureFlagState3;
            $VALUES = new FeatureFlagState[]{featureFlagState, featureFlagState2, featureFlagState3};
        }

        public static FeatureFlagState valueOf(String str) {
            return (FeatureFlagState) Enum.valueOf(FeatureFlagState.class, str);
        }

        public static FeatureFlagState[] values() {
            return (FeatureFlagState[]) $VALUES.clone();
        }
    }

    RealTreehouseApp getTreehouseApp();
}
