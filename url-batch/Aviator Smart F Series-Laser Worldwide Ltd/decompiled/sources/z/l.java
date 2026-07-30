package z;

import com.google.android.exoplayer2.upstream.CmcdConfiguration;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class l {

    @SerializedName(CmcdConfiguration.KEY_STREAM_TYPE)
    private final o st;

    public l(o st) {
        s.checkNotNullParameter(st, "st");
        this.st = st;
    }

    public static /* synthetic */ l copy$default(l lVar, o oVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            oVar = lVar.st;
        }
        return lVar.copy(oVar);
    }

    public final o component1() {
        return this.st;
    }

    public final l copy(o st) {
        s.checkNotNullParameter(st, "st");
        return new l(st);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && s.areEqual(this.st, ((l) obj).st);
    }

    public final o getSt() {
        return this.st;
    }

    public int hashCode() {
        return this.st.hashCode();
    }

    public String toString() {
        return "SmartCnData(st=" + this.st + ')';
    }
}
