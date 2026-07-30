package com.artillery.ctc.base;

import androidx.annotation.Keep;
import com.google.gson.JsonObject;
import java.util.List;
import kotlin.jvm.internal.s;

@Keep
/* loaded from: classes.dex */
public final class CrateJobData {
    private final String imageSign;
    private final List<String> images;
    private final String jobId;
    private final Integer queue;
    private final JsonObject resizedImages;
    private final Integer waitTime;

    public CrateJobData(String str, Integer num, Integer num2, String str2, JsonObject jsonObject, List<String> list) {
        this.jobId = str;
        this.waitTime = num;
        this.queue = num2;
        this.imageSign = str2;
        this.resizedImages = jsonObject;
        this.images = list;
    }

    public static /* synthetic */ CrateJobData copy$default(CrateJobData crateJobData, String str, Integer num, Integer num2, String str2, JsonObject jsonObject, List list, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = crateJobData.jobId;
        }
        if ((i8 & 2) != 0) {
            num = crateJobData.waitTime;
        }
        Integer num3 = num;
        if ((i8 & 4) != 0) {
            num2 = crateJobData.queue;
        }
        Integer num4 = num2;
        if ((i8 & 8) != 0) {
            str2 = crateJobData.imageSign;
        }
        String str3 = str2;
        if ((i8 & 16) != 0) {
            jsonObject = crateJobData.resizedImages;
        }
        JsonObject jsonObject2 = jsonObject;
        if ((i8 & 32) != 0) {
            list = crateJobData.images;
        }
        return crateJobData.copy(str, num3, num4, str3, jsonObject2, list);
    }

    public final String component1() {
        return this.jobId;
    }

    public final Integer component2() {
        return this.waitTime;
    }

    public final Integer component3() {
        return this.queue;
    }

    public final String component4() {
        return this.imageSign;
    }

    public final JsonObject component5() {
        return this.resizedImages;
    }

    public final List<String> component6() {
        return this.images;
    }

    public final CrateJobData copy(String str, Integer num, Integer num2, String str2, JsonObject jsonObject, List<String> list) {
        return new CrateJobData(str, num, num2, str2, jsonObject, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CrateJobData)) {
            return false;
        }
        CrateJobData crateJobData = (CrateJobData) obj;
        return s.areEqual(this.jobId, crateJobData.jobId) && s.areEqual(this.waitTime, crateJobData.waitTime) && s.areEqual(this.queue, crateJobData.queue) && s.areEqual(this.imageSign, crateJobData.imageSign) && s.areEqual(this.resizedImages, crateJobData.resizedImages) && s.areEqual(this.images, crateJobData.images);
    }

    public final String getImageSign() {
        return this.imageSign;
    }

    public final List<String> getImages() {
        return this.images;
    }

    public final String getJobId() {
        return this.jobId;
    }

    public final Integer getQueue() {
        return this.queue;
    }

    public final JsonObject getResizedImages() {
        return this.resizedImages;
    }

    public final Integer getWaitTime() {
        return this.waitTime;
    }

    public int hashCode() {
        String str = this.jobId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.waitTime;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.queue;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.imageSign;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        JsonObject jsonObject = this.resizedImages;
        int hashCode5 = (hashCode4 + (jsonObject == null ? 0 : jsonObject.hashCode())) * 31;
        List<String> list = this.images;
        return hashCode5 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "CrateJobData(jobId=" + this.jobId + ", waitTime=" + this.waitTime + ", queue=" + this.queue + ", imageSign=" + this.imageSign + ", resizedImages=" + this.resizedImages + ", images=" + this.images + ')';
    }
}
