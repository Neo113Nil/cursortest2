package z;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class p {

    @SerializedName("cw")
    private final List<m> cwList;

    @SerializedName("wb")
    private final int wordBeginTime;

    @SerializedName("we")
    private final int wordEndTime;

    public p(List<m> cwList, int i8, int i9) {
        s.checkNotNullParameter(cwList, "cwList");
        this.cwList = cwList;
        this.wordBeginTime = i8;
        this.wordEndTime = i9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ p copy$default(p pVar, List list, int i8, int i9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = pVar.cwList;
        }
        if ((i10 & 2) != 0) {
            i8 = pVar.wordBeginTime;
        }
        if ((i10 & 4) != 0) {
            i9 = pVar.wordEndTime;
        }
        return pVar.copy(list, i8, i9);
    }

    public final List<m> component1() {
        return this.cwList;
    }

    public final int component2() {
        return this.wordBeginTime;
    }

    public final int component3() {
        return this.wordEndTime;
    }

    public final p copy(List<m> cwList, int i8, int i9) {
        s.checkNotNullParameter(cwList, "cwList");
        return new p(cwList, i8, i9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return s.areEqual(this.cwList, pVar.cwList) && this.wordBeginTime == pVar.wordBeginTime && this.wordEndTime == pVar.wordEndTime;
    }

    public final List<m> getCwList() {
        return this.cwList;
    }

    public final int getWordBeginTime() {
        return this.wordBeginTime;
    }

    public final int getWordEndTime() {
        return this.wordEndTime;
    }

    public int hashCode() {
        return (((this.cwList.hashCode() * 31) + this.wordBeginTime) * 31) + this.wordEndTime;
    }

    public String toString() {
        return "SmartWsData(cwList=" + this.cwList + ", wordBeginTime=" + this.wordBeginTime + ", wordEndTime=" + this.wordEndTime + ')';
    }
}
