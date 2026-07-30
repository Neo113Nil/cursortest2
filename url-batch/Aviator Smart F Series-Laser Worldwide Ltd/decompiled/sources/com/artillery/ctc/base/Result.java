package com.artillery.ctc.base;

import androidx.annotation.Keep;
import androidx.collection.a;
import kotlin.jvm.internal.s;

@Keep
/* loaded from: classes.dex */
public final class Result {
    private final int code;
    private final String data;
    private final String message;
    private final boolean success;
    private final long timestamp;

    public Result(int i8, boolean z7, String str, String str2, long j8) {
        this.code = i8;
        this.success = z7;
        this.data = str;
        this.message = str2;
        this.timestamp = j8;
    }

    public static /* synthetic */ Result copy$default(Result result, int i8, boolean z7, String str, String str2, long j8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = result.code;
        }
        if ((i9 & 2) != 0) {
            z7 = result.success;
        }
        boolean z8 = z7;
        if ((i9 & 4) != 0) {
            str = result.data;
        }
        String str3 = str;
        if ((i9 & 8) != 0) {
            str2 = result.message;
        }
        String str4 = str2;
        if ((i9 & 16) != 0) {
            j8 = result.timestamp;
        }
        return result.copy(i8, z8, str3, str4, j8);
    }

    public final int component1() {
        return this.code;
    }

    public final boolean component2() {
        return this.success;
    }

    public final String component3() {
        return this.data;
    }

    public final String component4() {
        return this.message;
    }

    public final long component5() {
        return this.timestamp;
    }

    public final Result copy(int i8, boolean z7, String str, String str2, long j8) {
        return new Result(i8, z7, str, str2, j8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Result)) {
            return false;
        }
        Result result = (Result) obj;
        return this.code == result.code && this.success == result.success && s.areEqual(this.data, result.data) && s.areEqual(this.message, result.message) && this.timestamp == result.timestamp;
    }

    public final int getCode() {
        return this.code;
    }

    public final String getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int i8 = this.code * 31;
        boolean z7 = this.success;
        int i9 = z7;
        if (z7 != 0) {
            i9 = 1;
        }
        int i10 = (i8 + i9) * 31;
        String str = this.data;
        int hashCode = (i10 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.message;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + a.a(this.timestamp);
    }

    public String toString() {
        return "Result(code=" + this.code + ", success=" + this.success + ", data=" + this.data + ", message=" + this.message + ", timestamp=" + this.timestamp + ')';
    }
}
