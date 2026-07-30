package j$.time;

import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes2.dex */
public final class a extends b implements Serializable {
    private static final long serialVersionUID = 6740630888130243051L;
    public final y a;

    static {
        System.currentTimeMillis();
        ZoneOffset zoneOffset = ZoneOffset.UTC;
    }

    public a(y yVar) {
        this.a = yVar;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.a.equals(((a) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + 1;
    }

    public final String toString() {
        return "SystemClock[" + this.a + "]";
    }
}
