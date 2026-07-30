package D5;

import java.util.StringJoiner;

/* loaded from: classes.dex */
public final class c {
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        cVar.getClass();
        cVar.getClass();
        cVar.getClass();
        cVar.getClass();
        cVar.getClass();
        cVar.getClass();
        return true;
    }

    public final int hashCode() {
        return ((1000003 * 1000003) ^ 42) * 1525764945;
    }

    public final String toString() {
        StringJoiner stringJoiner = new StringJoiner(", ", "InstrumentSelector{", "}");
        stringJoiner.add("instrumentName=*");
        return stringJoiner.toString();
    }
}
