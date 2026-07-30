package com.artillery.ctc.base;

import androidx.annotation.Keep;
import kotlin.jvm.internal.s;

@Keep
/* loaded from: classes.dex */
public final class JobDetailResult {
    private final JobDetailData data;
    private final String logId;
    private final String msg;
    private final Integer status;

    public JobDetailResult(Integer num, String str, JobDetailData jobDetailData, String str2) {
        this.status = num;
        this.msg = str;
        this.data = jobDetailData;
        this.logId = str2;
    }

    public static /* synthetic */ JobDetailResult copy$default(JobDetailResult jobDetailResult, Integer num, String str, JobDetailData jobDetailData, String str2, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            num = jobDetailResult.status;
        }
        if ((i8 & 2) != 0) {
            str = jobDetailResult.msg;
        }
        if ((i8 & 4) != 0) {
            jobDetailData = jobDetailResult.data;
        }
        if ((i8 & 8) != 0) {
            str2 = jobDetailResult.logId;
        }
        return jobDetailResult.copy(num, str, jobDetailData, str2);
    }

    public final Integer component1() {
        return this.status;
    }

    public final String component2() {
        return this.msg;
    }

    public final JobDetailData component3() {
        return this.data;
    }

    public final String component4() {
        return this.logId;
    }

    public final JobDetailResult copy(Integer num, String str, JobDetailData jobDetailData, String str2) {
        return new JobDetailResult(num, str, jobDetailData, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JobDetailResult)) {
            return false;
        }
        JobDetailResult jobDetailResult = (JobDetailResult) obj;
        return s.areEqual(this.status, jobDetailResult.status) && s.areEqual(this.msg, jobDetailResult.msg) && s.areEqual(this.data, jobDetailResult.data) && s.areEqual(this.logId, jobDetailResult.logId);
    }

    public final JobDetailData getData() {
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
        JobDetailData jobDetailData = this.data;
        int hashCode3 = (hashCode2 + (jobDetailData == null ? 0 : jobDetailData.hashCode())) * 31;
        String str2 = this.logId;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "JobDetailResult(status=" + this.status + ", msg=" + this.msg + ", data=" + this.data + ", logId=" + this.logId + ')';
    }
}
