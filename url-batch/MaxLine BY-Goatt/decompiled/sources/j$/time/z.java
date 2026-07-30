package j$.time;

import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Objects;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes2.dex */
public final class z extends y {
    public static final /* synthetic */ int d = 0;
    private static final long serialVersionUID = 8386373296231747096L;
    public final String b;
    public final transient j$.time.zone.f c;

    public z(String str, j$.time.zone.f fVar) {
        this.b = str;
        this.c = fVar;
    }

    public static z Z(String str, boolean z) {
        Objects.requireNonNull(str, "zoneId");
        int length = str.length();
        j$.time.zone.f fVar = null;
        if (length < 2) {
            h.a("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
            return null;
        }
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && ((charAt != '/' || i == 0) && ((charAt < '0' || charAt > '9' || i == 0) && ((charAt != '~' || i == 0) && ((charAt != '.' || i == 0) && ((charAt != '_' || i == 0) && ((charAt != '+' || i == 0) && (charAt != '-' || i == 0))))))))) {
                h.a("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
                return null;
            }
        }
        try {
            fVar = j$.time.zone.i.a(str);
        } catch (j$.time.zone.g e) {
            if (z) {
                throw e;
            }
        }
        return new z(str, fVar);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new t((byte) 7, this);
    }

    @Override // j$.time.y
    public final j$.time.zone.f B() {
        j$.time.zone.f fVar = this.c;
        return fVar != null ? fVar : j$.time.zone.i.a(this.b);
    }

    @Override // j$.time.y
    public final void W(DataOutput dataOutput) {
        dataOutput.writeByte(7);
        dataOutput.writeUTF(this.b);
    }

    @Override // j$.time.y
    public final String q() {
        return this.b;
    }
}
