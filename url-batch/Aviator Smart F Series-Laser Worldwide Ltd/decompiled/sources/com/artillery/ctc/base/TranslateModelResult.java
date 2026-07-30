package com.artillery.ctc.base;

import androidx.annotation.Keep;
import androidx.collection.a;
import java.util.List;
import kotlin.jvm.internal.s;

@Keep
/* loaded from: classes.dex */
public final class TranslateModelResult {
    private final int code;
    private final List<Result> data;
    private final String message;
    private final boolean success;
    private final long timestamp;

    public TranslateModelResult(int i8, boolean z7, List<Result> list, String str, long j8) {
        this.code = i8;
        this.success = z7;
        this.data = list;
        this.message = str;
        this.timestamp = j8;
    }

    public static /* synthetic */ TranslateModelResult copy$default(TranslateModelResult translateModelResult, int i8, boolean z7, List list, String str, long j8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = translateModelResult.code;
        }
        if ((i9 & 2) != 0) {
            z7 = translateModelResult.success;
        }
        boolean z8 = z7;
        if ((i9 & 4) != 0) {
            list = translateModelResult.data;
        }
        List list2 = list;
        if ((i9 & 8) != 0) {
            str = translateModelResult.message;
        }
        String str2 = str;
        if ((i9 & 16) != 0) {
            j8 = translateModelResult.timestamp;
        }
        return translateModelResult.copy(i8, z8, list2, str2, j8);
    }

    public final int component1() {
        return this.code;
    }

    public final boolean component2() {
        return this.success;
    }

    public final List<Result> component3() {
        return this.data;
    }

    public final String component4() {
        return this.message;
    }

    public final long component5() {
        return this.timestamp;
    }

    public final TranslateModelResult copy(int i8, boolean z7, List<Result> list, String str, long j8) {
        return new TranslateModelResult(i8, z7, list, str, j8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TranslateModelResult)) {
            return false;
        }
        TranslateModelResult translateModelResult = (TranslateModelResult) obj;
        return this.code == translateModelResult.code && this.success == translateModelResult.success && s.areEqual(this.data, translateModelResult.data) && s.areEqual(this.message, translateModelResult.message) && this.timestamp == translateModelResult.timestamp;
    }

    public final int getCode() {
        return this.code;
    }

    public final List<Result> getData() {
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
        List<Result> list = this.data;
        int hashCode = (i10 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.message;
        return ((hashCode + (str != null ? str.hashCode() : 0)) * 31) + a.a(this.timestamp);
    }

    public String toString() {
        return "TranslateModelResult(code=" + this.code + ", success=" + this.success + ", data=" + this.data + ", message=" + this.message + ", timestamp=" + this.timestamp + ')';
    }
}
