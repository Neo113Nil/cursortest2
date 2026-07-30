package defpackage;

import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
final class fj2 implements Externalizable {
    public static final a n = new a(null);
    private static final long serialVersionUID = 0;
    public Map m = mi1.c();

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    private final Object readResolve() {
        return this.m;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        objectInput.getClass();
        byte readByte = objectInput.readByte();
        if (readByte != 0) {
            throw new InvalidObjectException(in1.k(readByte, "Unsupported flags value: "));
        }
        int readInt = objectInput.readInt();
        if (readInt < 0) {
            ch2.f(readInt, "Illegal size value: ");
            return;
        }
        uh1 uh1Var = new uh1(readInt);
        for (int i = 0; i < readInt; i++) {
            uh1Var.put(objectInput.readObject(), objectInput.readObject());
        }
        this.m = uh1Var.b();
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.getClass();
        objectOutput.writeByte(0);
        objectOutput.writeInt(this.m.size());
        for (Map.Entry entry : this.m.entrySet()) {
            objectOutput.writeObject(entry.getKey());
            objectOutput.writeObject(entry.getValue());
        }
    }
}
