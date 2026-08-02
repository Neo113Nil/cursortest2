package com.squareup.cash.threedsdataonly.backend.api;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class Warning {
    public final String id;
    public final String message;
    public final Severity severity;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Severity {
        public static final /* synthetic */ Severity[] $VALUES;
        public static final Severity HIGH;

        static {
            Severity severity = new Severity("HIGH", 0);
            HIGH = severity;
            $VALUES = new Severity[]{severity, new Severity("MEDIUM", 1), new Severity("LOW", 2)};
        }

        public static Severity valueOf(String str) {
            return (Severity) Enum.valueOf(Severity.class, str);
        }

        public static Severity[] values() {
            return (Severity[]) $VALUES.clone();
        }
    }

    public Warning(String str, String str2, Severity severity) {
        str.getClass();
        str2.getClass();
        severity.getClass();
        this.id = str;
        this.message = str2;
        this.severity = severity;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Warning)) {
            return false;
        }
        Warning warning = (Warning) obj;
        return Intrinsics.areEqual(this.id, warning.id) && Intrinsics.areEqual(this.message, warning.message) && this.severity == warning.severity;
    }

    public final int hashCode() {
        return this.severity.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.message);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Warning(id=", this.id, ", message=", this.message, ", severity=");
        m.append(this.severity);
        m.append(")");
        return m.toString();
    }
}
