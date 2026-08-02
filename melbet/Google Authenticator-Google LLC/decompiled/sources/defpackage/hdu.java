package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hdu extends hbr {
    private static final long serialVersionUID = 0;
    transient int d;

    public hdu(byte[] bArr) {
        super(new hci(12));
        this.d = 2;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.d = 2;
        int readInt = objectInputStream.readInt();
        l(new hci(12));
        for (int i = 0; i < readInt; i++) {
            Set c = c(objectInputStream.readObject());
            int readInt2 = objectInputStream.readInt();
            for (int i2 = 0; i2 < readInt2; i2++) {
                c.add(objectInputStream.readObject());
            }
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        hnu.p(this, objectOutputStream);
    }

    @Override // defpackage.hbr, defpackage.hbg
    public final /* bridge */ /* synthetic */ Collection a() {
        return new hck(this.d);
    }

    private hdu() {
        throw null;
    }
}
