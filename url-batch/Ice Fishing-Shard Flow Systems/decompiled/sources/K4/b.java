package K4;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class b {
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        List list = Collections.EMPTY_LIST;
        ((b) obj).getClass();
        return list.equals(list);
    }

    public final int hashCode() {
        return Collections.EMPTY_LIST.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ArrayBasedTraceState{entries=" + Collections.EMPTY_LIST + "}";
    }
}
