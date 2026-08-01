package io.ktor.http.content;

import io.ktor.http.HttpStatusCode;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Versions.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lio/ktor/http/content/VersionCheckResult;", "", "statusCode", "Lio/ktor/http/HttpStatusCode;", "(Ljava/lang/String;ILio/ktor/http/HttpStatusCode;)V", "getStatusCode", "()Lio/ktor/http/HttpStatusCode;", "OK", "NOT_MODIFIED", "PRECONDITION_FAILED", "ktor-http"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class VersionCheckResult {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ VersionCheckResult[] $VALUES;
    private final HttpStatusCode statusCode;
    public static final VersionCheckResult OK = new VersionCheckResult("OK", 0, HttpStatusCode.INSTANCE.getOK());
    public static final VersionCheckResult NOT_MODIFIED = new VersionCheckResult("NOT_MODIFIED", 1, HttpStatusCode.INSTANCE.getNotModified());
    public static final VersionCheckResult PRECONDITION_FAILED = new VersionCheckResult("PRECONDITION_FAILED", 2, HttpStatusCode.INSTANCE.getPreconditionFailed());

    private static final /* synthetic */ VersionCheckResult[] $values() {
        return new VersionCheckResult[]{OK, NOT_MODIFIED, PRECONDITION_FAILED};
    }

    public static EnumEntries<VersionCheckResult> getEntries() {
        return $ENTRIES;
    }

    public static VersionCheckResult valueOf(String str) {
        return (VersionCheckResult) Enum.valueOf(VersionCheckResult.class, str);
    }

    public static VersionCheckResult[] values() {
        return (VersionCheckResult[]) $VALUES.clone();
    }

    private VersionCheckResult(String str, int i, HttpStatusCode httpStatusCode) {
        this.statusCode = httpStatusCode;
    }

    public final HttpStatusCode getStatusCode() {
        return this.statusCode;
    }

    static {
        VersionCheckResult[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }
}
