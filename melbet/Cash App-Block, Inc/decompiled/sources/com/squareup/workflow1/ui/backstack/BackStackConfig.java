package com.squareup.workflow1.ui.backstack;

import com.squareup.workflow1.ui.ViewEnvironmentKey;
import kotlin.jvm.internal.Reflection;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class BackStackConfig {
    public static final /* synthetic */ BackStackConfig[] $VALUES;
    public static final Companion Companion;
    public static final BackStackConfig First;
    public static final BackStackConfig Other;

    /* renamed from: default, reason: not valid java name */
    public static final BackStackConfig f796default;

    /* JADX INFO: Fake field, exist only in values array */
    BackStackConfig EF0;

    public final class Companion extends ViewEnvironmentKey {
        @Override // com.squareup.workflow1.ui.ViewEnvironmentKey
        public final Object getDefault() {
            return BackStackConfig.f796default;
        }
    }

    static {
        BackStackConfig backStackConfig = new BackStackConfig("None", 0);
        BackStackConfig backStackConfig2 = new BackStackConfig("First", 1);
        First = backStackConfig2;
        BackStackConfig backStackConfig3 = new BackStackConfig("Other", 2);
        Other = backStackConfig3;
        $VALUES = new BackStackConfig[]{backStackConfig, backStackConfig2, backStackConfig3};
        Companion = new Companion(Reflection.factory.getOrCreateKotlinClass(BackStackConfig.class));
        f796default = backStackConfig;
    }

    public static BackStackConfig valueOf(String str) {
        return (BackStackConfig) Enum.valueOf(BackStackConfig.class, str);
    }

    public static BackStackConfig[] values() {
        return (BackStackConfig[]) $VALUES.clone();
    }
}
