package z;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class o {

    @SerializedName("bg")
    private final int beginTime;

    @SerializedName("ed")
    private final int endTime;

    @SerializedName("type")
    private final String resultType;

    @SerializedName("rt")
    private final List<n> rtList;

    public o(List<n> rtList, int i8, String resultType, int i9) {
        s.checkNotNullParameter(rtList, "rtList");
        s.checkNotNullParameter(resultType, "resultType");
        this.rtList = rtList;
        this.beginTime = i8;
        this.resultType = resultType;
        this.endTime = i9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ o copy$default(o oVar, List list, int i8, String str, int i9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = oVar.rtList;
        }
        if ((i10 & 2) != 0) {
            i8 = oVar.beginTime;
        }
        if ((i10 & 4) != 0) {
            str = oVar.resultType;
        }
        if ((i10 & 8) != 0) {
            i9 = oVar.endTime;
        }
        return oVar.copy(list, i8, str, i9);
    }

    public final List<n> component1() {
        return this.rtList;
    }

    public final int component2() {
        return this.beginTime;
    }

    public final String component3() {
        return this.resultType;
    }

    public final int component4() {
        return this.endTime;
    }

    public final o copy(List<n> rtList, int i8, String resultType, int i9) {
        s.checkNotNullParameter(rtList, "rtList");
        s.checkNotNullParameter(resultType, "resultType");
        return new o(rtList, i8, resultType, i9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return s.areEqual(this.rtList, oVar.rtList) && this.beginTime == oVar.beginTime && s.areEqual(this.resultType, oVar.resultType) && this.endTime == oVar.endTime;
    }

    public final int getBeginTime() {
        return this.beginTime;
    }

    public final int getEndTime() {
        return this.endTime;
    }

    public final String getResultType() {
        return this.resultType;
    }

    public final List<n> getRtList() {
        return this.rtList;
    }

    public int hashCode() {
        return (((((this.rtList.hashCode() * 31) + this.beginTime) * 31) + this.resultType.hashCode()) * 31) + this.endTime;
    }

    public String toString() {
        return "SmartStData(rtList=" + this.rtList + ", beginTime=" + this.beginTime + ", resultType=" + this.resultType + ", endTime=" + this.endTime + ')';
    }
}
