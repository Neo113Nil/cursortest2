package com.squareup.cash.support.incidents.viewmodels;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class IncidentViewModel$Severity {
    public static final /* synthetic */ IncidentViewModel$Severity[] $VALUES;
    public static final IncidentViewModel$Severity ERROR;
    public static final IncidentViewModel$Severity INFO;
    public static final IncidentViewModel$Severity RESOLVED;

    static {
        IncidentViewModel$Severity incidentViewModel$Severity = new IncidentViewModel$Severity("RESOLVED", 0);
        RESOLVED = incidentViewModel$Severity;
        IncidentViewModel$Severity incidentViewModel$Severity2 = new IncidentViewModel$Severity("ERROR", 1);
        ERROR = incidentViewModel$Severity2;
        IncidentViewModel$Severity incidentViewModel$Severity3 = new IncidentViewModel$Severity("INFO", 2);
        INFO = incidentViewModel$Severity3;
        $VALUES = new IncidentViewModel$Severity[]{incidentViewModel$Severity, incidentViewModel$Severity2, incidentViewModel$Severity3};
    }

    public static IncidentViewModel$Severity valueOf(String str) {
        return (IncidentViewModel$Severity) Enum.valueOf(IncidentViewModel$Severity.class, str);
    }

    public static IncidentViewModel$Severity[] values() {
        return (IncidentViewModel$Severity[]) $VALUES.clone();
    }
}
