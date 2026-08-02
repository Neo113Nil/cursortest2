package com.withpersona.sdk2.inquiry.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class Environment {
    public static final /* synthetic */ Environment[] $VALUES;
    public static final Environment PRODUCTION;
    public static final Environment SANDBOX;

    static {
        Environment environment = new Environment("PRODUCTION", 0);
        PRODUCTION = environment;
        Environment environment2 = new Environment("SANDBOX", 1);
        SANDBOX = environment2;
        $VALUES = new Environment[]{environment, environment2};
    }

    public static Environment valueOf(String str) {
        return (Environment) Enum.valueOf(Environment.class, str);
    }

    public static Environment[] values() {
        return (Environment[]) $VALUES.clone();
    }
}
