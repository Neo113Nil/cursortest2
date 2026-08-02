package com.stripe.android.financialconnections.analytics;

import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import kotlin.enums.EnumEntriesList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class FinancialConnectionsEvent {
    public final Metadata metadata;
    public final Name name;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes6.dex */
    public final class ErrorCode {
        public static final /* synthetic */ EnumEntriesList $ENTRIES;
        public static final /* synthetic */ ErrorCode[] $VALUES;
        public static final ErrorCode UNEXPECTED_ERROR;
        public static final ErrorCode WEB_BROWSER_UNAVAILABLE;
        public final String value;

        static {
            ErrorCode errorCode = new ErrorCode("ACCOUNT_NUMBERS_UNAVAILABLE", 0, "account_numbers_unavailable");
            ErrorCode errorCode2 = new ErrorCode("ACCOUNTS_UNAVAILABLE", 1, "accounts_unavailable");
            ErrorCode errorCode3 = new ErrorCode("NO_DEBITABLE_ACCOUNT", 2, "no_debitable_account");
            ErrorCode errorCode4 = new ErrorCode("AUTHORIZATION_FAILED", 3, "authorization_failed");
            ErrorCode errorCode5 = new ErrorCode("INSTITUTION_UNAVAILABLE_PLANNED", 4, "institution_unavailable_planned");
            ErrorCode errorCode6 = new ErrorCode("INSTITUTION_UNAVAILABLE_UNPLANNED", 5, "institution_unavailable_unplanned");
            ErrorCode errorCode7 = new ErrorCode("INSTITUTION_TIMEOUT", 6, "institution_timeout");
            ErrorCode errorCode8 = new ErrorCode("UNEXPECTED_ERROR", 7, "unexpected_error");
            UNEXPECTED_ERROR = errorCode8;
            ErrorCode errorCode9 = new ErrorCode("SESSION_EXPIRED", 8, "session_expired");
            ErrorCode errorCode10 = new ErrorCode("FAILED_BOT_DETECTION", 9, "failed_bot_detection");
            ErrorCode errorCode11 = new ErrorCode("WEB_BROWSER_UNAVAILABLE", 10, "web_browser_unavailable");
            WEB_BROWSER_UNAVAILABLE = errorCode11;
            ErrorCode[] errorCodeArr = {errorCode, errorCode2, errorCode3, errorCode4, errorCode5, errorCode6, errorCode7, errorCode8, errorCode9, errorCode10, errorCode11};
            $VALUES = errorCodeArr;
            $ENTRIES = new EnumEntriesList(errorCodeArr);
        }

        public ErrorCode(String str, int i, String str2) {
            this.value = str2;
        }

        public static ErrorCode valueOf(String str) {
            return (ErrorCode) Enum.valueOf(ErrorCode.class, str);
        }

        public static ErrorCode[] values() {
            return (ErrorCode[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Name {
        public static final /* synthetic */ EnumEntriesList $ENTRIES;
        public static final /* synthetic */ Name[] $VALUES;
        public static final Name ACCOUNTS_SELECTED;
        public static final Name CANCEL;
        public static final Name CONSENT_ACQUIRED;
        public static final Name ERROR;
        public static final Name FLOW_LAUNCHED_IN_BROWSER;
        public static final Name INSTITUTION_AUTHORIZED;
        public static final Name INSTITUTION_SELECTED;
        public static final Name MANUAL_ENTRY_INITIATED;
        public static final Name OPEN;
        public static final Name SEARCH_INITIATED;
        public static final Name SUCCESS;
        public final String value;

        static {
            Name name = new Name("OPEN", 0, "open");
            OPEN = name;
            Name name2 = new Name("FLOW_LAUNCHED_IN_BROWSER", 1, "flow_launched_in_browser");
            FLOW_LAUNCHED_IN_BROWSER = name2;
            Name name3 = new Name("MANUAL_ENTRY_INITIATED", 2, "manual_entry_initiated");
            MANUAL_ENTRY_INITIATED = name3;
            Name name4 = new Name("CONSENT_ACQUIRED", 3, "consent_acquired");
            CONSENT_ACQUIRED = name4;
            Name name5 = new Name("SEARCH_INITIATED", 4, "search_initiated");
            SEARCH_INITIATED = name5;
            Name name6 = new Name("INSTITUTION_SELECTED", 5, "institution_selected");
            INSTITUTION_SELECTED = name6;
            Name name7 = new Name("INSTITUTION_AUTHORIZED", 6, "institution_authorized");
            INSTITUTION_AUTHORIZED = name7;
            Name name8 = new Name("ACCOUNTS_SELECTED", 7, "accounts_selected");
            ACCOUNTS_SELECTED = name8;
            Name name9 = new Name("SUCCESS", 8, "success");
            SUCCESS = name9;
            Name name10 = new Name("ERROR", 9, BreadcrumbHelper.Category.ERROR);
            ERROR = name10;
            Name name11 = new Name("CANCEL", 10, "cancel");
            CANCEL = name11;
            Name[] nameArr = {name, name2, name3, name4, name5, name6, name7, name8, name9, name10, name11};
            $VALUES = nameArr;
            $ENTRIES = new EnumEntriesList(nameArr);
        }

        public Name(String str, int i, String str2) {
            this.value = str2;
        }

        public static Name valueOf(String str) {
            return (Name) Enum.valueOf(Name.class, str);
        }

        public static Name[] values() {
            return (Name[]) $VALUES.clone();
        }
    }

    public FinancialConnectionsEvent(Name name, Metadata metadata) {
        name.getClass();
        this.name = name;
        this.metadata = metadata;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FinancialConnectionsEvent)) {
            return false;
        }
        FinancialConnectionsEvent financialConnectionsEvent = (FinancialConnectionsEvent) obj;
        return this.name == financialConnectionsEvent.name && this.metadata.equals(financialConnectionsEvent.metadata);
    }

    public final int hashCode() {
        return this.metadata.hashCode() + (this.name.hashCode() * 31);
    }

    public final String toString() {
        return "FinancialConnectionsEvent(name=" + this.name + ", metadata=" + this.metadata + ")";
    }

    public final class Metadata {
        public final ErrorCode errorCode;
        public final String institutionName;
        public final Boolean manualEntry;

        public /* synthetic */ Metadata(String str, Boolean bool, ErrorCode errorCode, int i) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : errorCode);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Metadata)) {
                return false;
            }
            Metadata metadata = (Metadata) obj;
            return Intrinsics.areEqual(this.institutionName, metadata.institutionName) && Intrinsics.areEqual(this.manualEntry, metadata.manualEntry) && this.errorCode == metadata.errorCode;
        }

        public final int hashCode() {
            String str = this.institutionName;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Boolean bool = this.manualEntry;
            int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            ErrorCode errorCode = this.errorCode;
            return hashCode2 + (errorCode != null ? errorCode.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = Thread$State$EnumUnboxingLocalUtility.m(this.manualEntry, "Metadata(institutionName=", this.institutionName, ", manualEntry=", ", errorCode=");
            m.append(this.errorCode);
            m.append(")");
            return m.toString();
        }

        public Metadata(String str, Boolean bool, ErrorCode errorCode) {
            this.institutionName = str;
            this.manualEntry = bool;
            this.errorCode = errorCode;
        }
    }
}
