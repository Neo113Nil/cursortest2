package sqip.internal.event;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.squareup.moshi.JsonClass;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lsqip/internal/event/LogEventsResponse;", "", "success_count", "", "failure_count", "invalid_count", "(III)V", "getFailure_count", "()I", "getInvalid_count", "getSuccess_count", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "sqip_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class LogEventsResponse {
    private final int failure_count;
    private final int invalid_count;
    private final int success_count;

    public LogEventsResponse(int i, int i2, int i3) {
        this.success_count = i;
        this.failure_count = i2;
        this.invalid_count = i3;
    }

    public static /* synthetic */ LogEventsResponse copy$default(LogEventsResponse logEventsResponse, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = logEventsResponse.success_count;
        }
        if ((i4 & 2) != 0) {
            i2 = logEventsResponse.failure_count;
        }
        if ((i4 & 4) != 0) {
            i3 = logEventsResponse.invalid_count;
        }
        return logEventsResponse.copy(i, i2, i3);
    }

    /* renamed from: component1, reason: from getter */
    public final int getSuccess_count() {
        return this.success_count;
    }

    /* renamed from: component2, reason: from getter */
    public final int getFailure_count() {
        return this.failure_count;
    }

    /* renamed from: component3, reason: from getter */
    public final int getInvalid_count() {
        return this.invalid_count;
    }

    public final LogEventsResponse copy(int success_count, int failure_count, int invalid_count) {
        return new LogEventsResponse(success_count, failure_count, invalid_count);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LogEventsResponse)) {
            return false;
        }
        LogEventsResponse logEventsResponse = (LogEventsResponse) other;
        return this.success_count == logEventsResponse.success_count && this.failure_count == logEventsResponse.failure_count && this.invalid_count == logEventsResponse.invalid_count;
    }

    public final int getFailure_count() {
        return this.failure_count;
    }

    public final int getInvalid_count() {
        return this.invalid_count;
    }

    public final int getSuccess_count() {
        return this.success_count;
    }

    public int hashCode() {
        return Integer.hashCode(this.invalid_count) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.failure_count, Integer.hashCode(this.success_count) * 31, 31);
    }

    public String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.invalid_count, ")", Recorder$$ExternalSyntheticOutline2.m107m(this.success_count, this.failure_count, "LogEventsResponse(success_count=", ", failure_count=", ", invalid_count="));
    }
}
