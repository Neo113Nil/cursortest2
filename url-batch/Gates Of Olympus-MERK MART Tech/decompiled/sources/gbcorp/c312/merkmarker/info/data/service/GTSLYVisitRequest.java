package gbcorp.c312.merkmarker.info.data.service;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GTSLYApiService.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lgbcorp/c312/merkmarker/info/data/service/GTSLYVisitRequest;", "", "recordId", "", "linkUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getRecordId", "()Ljava/lang/String;", "getLinkUrl", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class GTSLYVisitRequest {
    public static final int $stable = 0;
    private final String linkUrl;
    private final String recordId;

    public static /* synthetic */ GTSLYVisitRequest copy$default(GTSLYVisitRequest gTSLYVisitRequest, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = gTSLYVisitRequest.recordId;
        }
        if ((i & 2) != 0) {
            str2 = gTSLYVisitRequest.linkUrl;
        }
        return gTSLYVisitRequest.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getRecordId() {
        return this.recordId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLinkUrl() {
        return this.linkUrl;
    }

    public final GTSLYVisitRequest copy(String recordId, String linkUrl) {
        return new GTSLYVisitRequest(recordId, linkUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GTSLYVisitRequest)) {
            return false;
        }
        GTSLYVisitRequest gTSLYVisitRequest = (GTSLYVisitRequest) other;
        return Intrinsics.areEqual(this.recordId, gTSLYVisitRequest.recordId) && Intrinsics.areEqual(this.linkUrl, gTSLYVisitRequest.linkUrl);
    }

    public int hashCode() {
        String str = this.recordId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.linkUrl;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "GTSLYVisitRequest(recordId=" + this.recordId + ", linkUrl=" + this.linkUrl + ")";
    }

    public GTSLYVisitRequest(String str, String str2) {
        this.recordId = str;
        this.linkUrl = str2;
    }

    public final String getRecordId() {
        return this.recordId;
    }

    public final String getLinkUrl() {
        return this.linkUrl;
    }
}
