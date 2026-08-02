package defpackage;

import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kqb implements Externalizable {
    private static final long serialVersionUID = 0;
    private Collection a;
    private final int b;

    public kqb(Collection collection, int i) {
        this.a = collection;
        this.b = i;
    }

    private final Object readResolve() {
        return this.a;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        Collection a;
        objectInput.getClass();
        byte readByte = objectInput.readByte();
        int i = readByte & 1;
        if ((readByte & (-2)) != 0) {
            throw new InvalidObjectException(a.ai(readByte, "Unsupported flags value: ", "."));
        }
        int readInt = objectInput.readInt();
        if (readInt < 0) {
            throw new InvalidObjectException(a.ai(readInt, "Illegal size value: ", "."));
        }
        int i2 = 0;
        if (i != 0) {
            kqd kqdVar = new kqd(new kpy(readInt));
            while (i2 < readInt) {
                kqdVar.add(objectInput.readObject());
                i2++;
            }
            a = ixd.j(kqdVar);
        } else {
            kpt kptVar = new kpt(readInt);
            while (i2 < readInt) {
                kptVar.add(objectInput.readObject());
                i2++;
            }
            a = ixc.a(kptVar);
        }
        this.a = a;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.getClass();
        objectOutput.writeByte(this.b);
        objectOutput.writeInt(this.a.size());
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            objectOutput.writeObject(it.next());
        }
    }

    public kqb() {
        this(kpk.a, 0);
    }
}
