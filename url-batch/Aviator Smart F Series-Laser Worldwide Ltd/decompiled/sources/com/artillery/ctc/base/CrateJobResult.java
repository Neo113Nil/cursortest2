package com.artillery.ctc.base;

import androidx.annotation.Keep;
import kotlin.jvm.internal.s;

@Keep
/* loaded from: classes.dex */
public final class CrateJobResult {
    private final CrateJobData data;
    private final String logId;
    private final String msg;
    private final Integer status;

    public CrateJobResult(Integer num, String str, CrateJobData crateJobData, String str2) {
        this.status = num;
        this.msg = str;
        this.data = crateJobData;
        this.logId = str2;
    }

    public static /* synthetic */ CrateJobResult copy$default(CrateJobResult crateJobResult, Integer num, String str, CrateJobData crateJobData, String str2, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            num = crateJobResult.status;
        }
        if ((i8 & 2) != 0) {
            str = crateJobResult.msg;
        }
        if ((i8 & 4) != 0) {
            crateJobData = crateJobResult.data;
        }
        if ((i8 & 8) != 0) {
            str2 = crateJobResult.logId;
        }
        return crateJobResult.copy(num, str, crateJobData, str2);
    }

    public final Integer component1() {
        return this.status;
    }

    public final String component2() {
        return this.msg;
    }

    public final CrateJobData component3() {
        return this.data;
    }

    public final String component4() {
        return this.logId;
    }

    public final CrateJobResult copy(Integer num, String str, CrateJobData crateJobData, String str2) {
        return new CrateJobResult(num, str, crateJobData, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CrateJobResult)) {
            return false;
        }
        CrateJobResult crateJobResult = (CrateJobResult) obj;
        return s.areEqual(this.status, crateJobResult.status) && s.areEqual(this.msg, crateJobResult.msg) && s.areEqual(this.data, crateJobResult.data) && s.areEqual(this.logId, crateJobResult.logId);
    }

    public final CrateJobData getData() {
        return this.data;
    }

    public final String getLogId() {
        return this.logId;
    }

    public final String getMsg() {
        return this.msg;
    }

    public final Integer getStatus() {
        return this.status;
    }

    public int hashCode() {
        Integer num = this.status;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.msg;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        CrateJobData crateJobData = this.data;
        int hashCode3 = (hashCode2 + (crateJobData == null ? 0 : crateJobData.hashCode())) * 31;
        String str2 = this.logId;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "CrateJobResult(status=" + this.status + ", msg=" + this.msg + ", data=" + this.data + ", logId=" + this.logId + ')';
    }
}
