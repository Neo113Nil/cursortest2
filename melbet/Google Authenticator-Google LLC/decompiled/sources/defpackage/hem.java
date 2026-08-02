package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class hem extends hfc implements hgv {
    private static final long serialVersionUID = 0;
    private transient hem a;

    public hem(her herVar, int i) {
        super(herVar, i);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt < 0) {
            throw new InvalidObjectException(a.Y(readInt, "Invalid key count "));
        }
        hen henVar = new hen(4);
        int i = 0;
        for (int i2 = 0; i2 < readInt; i2++) {
            Object readObject = objectInputStream.readObject();
            readObject.getClass();
            int readInt2 = objectInputStream.readInt();
            if (readInt2 <= 0) {
                throw new InvalidObjectException(a.Y(readInt2, "Invalid value count "));
            }
            int i3 = hel.d;
            heg hegVar = new heg(4);
            for (int i4 = 0; i4 < readInt2; i4++) {
                Object readObject2 = objectInputStream.readObject();
                readObject2.getClass();
                hegVar.h(readObject2);
            }
            henVar.g(readObject, hegVar.g());
            i += readInt2;
        }
        try {
            this.a = new hem(henVar.d(true), i);
        } catch (IllegalArgumentException e) {
            throw ((InvalidObjectException) new InvalidObjectException(e.getMessage()).initCause(e));
        }
    }

    private Object readResolve() {
        hem hemVar = this.a;
        hemVar.getClass();
        return hemVar;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        hnu.p(this, objectOutputStream);
    }

    @Override // defpackage.hgv
    public final /* bridge */ /* synthetic */ List c(Object obj) {
        hel helVar = (hel) this.map.get(obj);
        if (helVar != null) {
            return helVar;
        }
        int i = hel.d;
        return his.a;
    }
}
