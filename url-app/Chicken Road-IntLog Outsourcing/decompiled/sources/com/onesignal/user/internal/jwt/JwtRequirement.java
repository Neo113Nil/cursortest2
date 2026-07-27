package com.onesignal.user.internal.jwt;

import C1.b;
import kotlin.jvm.internal.e;
import n4.InterfaceC1344a;
import u1.AbstractC1477a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class JwtRequirement {
    private static final /* synthetic */ InterfaceC1344a $ENTRIES;
    private static final /* synthetic */ JwtRequirement[] $VALUES;
    public static final Companion Companion;
    public static final JwtRequirement UNKNOWN = new JwtRequirement("UNKNOWN", 0);
    public static final JwtRequirement NOT_REQUIRED = new JwtRequirement("NOT_REQUIRED", 1);
    public static final JwtRequirement REQUIRED = new JwtRequirement("REQUIRED", 2);

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final JwtRequirement fromBoolean(Boolean bool) {
            if (bool == null) {
                return JwtRequirement.UNKNOWN;
            }
            if (bool.equals(Boolean.FALSE)) {
                return JwtRequirement.NOT_REQUIRED;
            }
            if (bool.equals(Boolean.TRUE)) {
                return JwtRequirement.REQUIRED;
            }
            throw new b();
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ JwtRequirement[] $values() {
        return new JwtRequirement[]{UNKNOWN, NOT_REQUIRED, REQUIRED};
    }

    static {
        JwtRequirement[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC1477a.n($values);
        Companion = new Companion(null);
    }

    private JwtRequirement(String str, int i2) {
    }

    public static InterfaceC1344a getEntries() {
        return $ENTRIES;
    }

    public static JwtRequirement valueOf(String str) {
        return (JwtRequirement) Enum.valueOf(JwtRequirement.class, str);
    }

    public static JwtRequirement[] values() {
        return (JwtRequirement[]) $VALUES.clone();
    }
}
