package defpackage;

import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kqc implements Externalizable {
    private static final long serialVersionUID = 0;
    private Map a;

    public kqc(Map map) {
        this.a = map;
    }

    private final Object readResolve() {
        return this.a;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        objectInput.getClass();
        byte readByte = objectInput.readByte();
        if (readByte != 0) {
            throw new InvalidObjectException(a.Y(readByte, "Unsupported flags value: "));
        }
        int readInt = objectInput.readInt();
        if (readInt < 0) {
            throw new InvalidObjectException(a.ai(readInt, "Illegal size value: ", "."));
        }
        kpy kpyVar = new kpy(readInt);
        for (int i = 0; i < readInt; i++) {
            kpyVar.put(objectInput.readObject(), objectInput.readObject());
        }
        this.a = kpyVar.e();
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.getClass();
        objectOutput.writeByte(0);
        objectOutput.writeInt(this.a.size());
        for (Map.Entry entry : this.a.entrySet()) {
            objectOutput.writeObject(entry.getKey());
            objectOutput.writeObject(entry.getValue());
        }
    }

    public kqc() {
        this(kpl.a);
    }
}
