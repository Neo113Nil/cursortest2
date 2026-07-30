package z;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class n {

    @SerializedName("ws")
    private final List<p> wsList;

    public n(List<p> wsList) {
        s.checkNotNullParameter(wsList, "wsList");
        this.wsList = wsList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ n copy$default(n nVar, List list, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            list = nVar.wsList;
        }
        return nVar.copy(list);
    }

    public final List<p> component1() {
        return this.wsList;
    }

    public final n copy(List<p> wsList) {
        s.checkNotNullParameter(wsList, "wsList");
        return new n(wsList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && s.areEqual(this.wsList, ((n) obj).wsList);
    }

    public final List<p> getWsList() {
        return this.wsList;
    }

    public int hashCode() {
        return this.wsList.hashCode();
    }

    public String toString() {
        return "SmartRtData(wsList=" + this.wsList + ')';
    }
}
