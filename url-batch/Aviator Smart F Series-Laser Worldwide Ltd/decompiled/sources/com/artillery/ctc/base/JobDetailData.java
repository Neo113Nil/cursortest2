package com.artillery.ctc.base;

import androidx.annotation.Keep;
import kotlin.jvm.internal.s;

@Keep
/* loaded from: classes.dex */
public final class JobDetailData {
    private final Integer jobErrCode;
    private final String jobErrMsg;
    private final String jobId;
    private final CrateJobData jobResult;
    private final Integer jobStatus;
    private final String sdJobId;
    private final String token;
    private final Integer waitTime;

    public JobDetailData(String str, String str2, Integer num, Integer num2, Integer num3, String str3, String str4, CrateJobData crateJobData) {
        this.sdJobId = str;
        this.jobId = str2;
        this.waitTime = num;
        this.jobStatus = num2;
        this.jobErrCode = num3;
        this.jobErrMsg = str3;
        this.token = str4;
        this.jobResult = crateJobData;
    }

    public final String component1() {
        return this.sdJobId;
    }

    public final String component2() {
        return this.jobId;
    }

    public final Integer component3() {
        return this.waitTime;
    }

    public final Integer component4() {
        return this.jobStatus;
    }

    public final Integer component5() {
        return this.jobErrCode;
    }

    public final String component6() {
        return this.jobErrMsg;
    }

    public final String component7() {
        return this.token;
    }

    public final CrateJobData component8() {
        return this.jobResult;
    }

    public final JobDetailData copy(String str, String str2, Integer num, Integer num2, Integer num3, String str3, String str4, CrateJobData crateJobData) {
        return new JobDetailData(str, str2, num, num2, num3, str3, str4, crateJobData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JobDetailData)) {
            return false;
        }
        JobDetailData jobDetailData = (JobDetailData) obj;
        return s.areEqual(this.sdJobId, jobDetailData.sdJobId) && s.areEqual(this.jobId, jobDetailData.jobId) && s.areEqual(this.waitTime, jobDetailData.waitTime) && s.areEqual(this.jobStatus, jobDetailData.jobStatus) && s.areEqual(this.jobErrCode, jobDetailData.jobErrCode) && s.areEqual(this.jobErrMsg, jobDetailData.jobErrMsg) && s.areEqual(this.token, jobDetailData.token) && s.areEqual(this.jobResult, jobDetailData.jobResult);
    }

    public final Integer getJobErrCode() {
        return this.jobErrCode;
    }

    public final String getJobErrMsg() {
        return this.jobErrMsg;
    }

    public final String getJobId() {
        return this.jobId;
    }

    public final CrateJobData getJobResult() {
        return this.jobResult;
    }

    public final Integer getJobStatus() {
        return this.jobStatus;
    }

    public final String getSdJobId() {
        return this.sdJobId;
    }

    public final String getToken() {
        return this.token;
    }

    public final Integer getWaitTime() {
        return this.waitTime;
    }

    public int hashCode() {
        String str = this.sdJobId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.jobId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.waitTime;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.jobStatus;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.jobErrCode;
        int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str3 = this.jobErrMsg;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.token;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        CrateJobData crateJobData = this.jobResult;
        return hashCode7 + (crateJobData != null ? crateJobData.hashCode() : 0);
    }

    public String toString() {
        return "JobDetailData(sdJobId=" + this.sdJobId + ", jobId=" + this.jobId + ", waitTime=" + this.waitTime + ", jobStatus=" + this.jobStatus + ", jobErrCode=" + this.jobErrCode + ", jobErrMsg=" + this.jobErrMsg + ", token=" + this.token + ", jobResult=" + this.jobResult + ')';
    }
}
