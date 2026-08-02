package j$.time;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public final class d0 extends b0 {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = 8386373296231747096L;
    public final String a;
    public final transient j$.time.zone.e b;

    public d0(String str, j$.time.zone.e eVar) {
        this.a = str;
        this.b = eVar;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new w((byte) 7, this);
    }

    public static d0 z(String str) {
        int length = str.length();
        j$.time.zone.e eVar = null;
        if (length < 2) {
            i.d("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
            return null;
        }
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && ((charAt != '/' || i == 0) && ((charAt < '0' || charAt > '9' || i == 0) && ((charAt != '~' || i == 0) && ((charAt != '.' || i == 0) && ((charAt != '_' || i == 0) && ((charAt != '+' || i == 0) && (charAt != '-' || i == 0))))))))) {
                i.d("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
                return null;
            }
        }
        try {
            eVar = j$.time.zone.h.a(str);
        } catch (j$.time.zone.f unused) {
        }
        return new d0(str, eVar);
    }

    @Override // j$.time.b0
    public final String u() {
        return this.a;
    }

    @Override // j$.time.b0
    public final j$.time.zone.e v() {
        j$.time.zone.e eVar = this.b;
        return eVar != null ? eVar : j$.time.zone.h.a(this.a);
    }

    @Override // j$.time.b0
    public final void y(ObjectOutput objectOutput) {
        objectOutput.writeByte(7);
        objectOutput.writeUTF(this.a);
    }
}
