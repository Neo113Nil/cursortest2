package defpackage;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ej2 implements Externalizable {
    public static final a o = new a(null);
    private static final long serialVersionUID = 0;
    public Collection m;
    public final int n;

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public ej2(int i, Collection collection) {
        collection.getClass();
        this.m = collection;
        this.n = i;
    }

    private final Object readResolve() {
        return this.m;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        Collection a2;
        objectInput.getClass();
        byte readByte = objectInput.readByte();
        int i = readByte & 1;
        if ((readByte & (-2)) != 0) {
            ch2.f(readByte, "Unsupported flags value: ");
            return;
        }
        int readInt = objectInput.readInt();
        if (readInt < 0) {
            ch2.f(readInt, "Illegal size value: ");
            return;
        }
        int i2 = 0;
        if (i == 0) {
            le1 le1Var = new le1(readInt);
            while (i2 < readInt) {
                le1Var.add(objectInput.readObject());
                i2++;
            }
            a2 = pv.a(le1Var);
        } else {
            if (i != 1) {
                ch2.f(i, "Unsupported collection type tag: ");
                return;
            }
            jj2 jj2Var = new jj2(readInt);
            while (i2 < readInt) {
                jj2Var.add(objectInput.readObject());
                i2++;
            }
            a2 = qj2.a(jj2Var);
        }
        this.m = a2;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.getClass();
        objectOutput.writeByte(this.n);
        objectOutput.writeInt(this.m.size());
        Iterator it = this.m.iterator();
        while (it.hasNext()) {
            objectOutput.writeObject(it.next());
        }
    }

    public ej2() {
        this(0, ah0.m);
    }
}
