package com.stripe.android.stripe3ds2.init;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.stripe3ds2.init.AppInfo;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class Warning implements Parcelable {
    public static final Parcelable.Creator<Warning> CREATOR = new AppInfo.Creator(11);
    public final String id;
    public final String message;
    public final Severity severity;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Severity {
        public static final /* synthetic */ Severity[] $VALUES;
        public static final Severity HIGH;
        public static final Severity MEDIUM;

        /* JADX INFO: Fake field, exist only in values array */
        Severity EF0;

        static {
            Severity severity = new Severity("LOW", 0);
            Severity severity2 = new Severity("MEDIUM", 1);
            MEDIUM = severity2;
            Severity severity3 = new Severity("HIGH", 2);
            HIGH = severity3;
            $VALUES = new Severity[]{severity, severity2, severity3};
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

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
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

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.id);
        parcel.writeString(this.message);
        parcel.writeString(this.severity.name());
    }
}
