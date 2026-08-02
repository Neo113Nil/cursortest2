package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hfj extends hbq implements Serializable {
    public static final hfj a;
    public static final hfj b;
    private final transient hel c;

    static {
        int i = hel.d;
        a = new hfj(his.a);
        b = new hfj(hel.q(hip.a));
    }

    public hfj(hel helVar) {
        this.c = helVar;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // defpackage.hiq
    public final /* bridge */ /* synthetic */ Set a() {
        hel helVar = this.c;
        if (helVar.isEmpty()) {
            return hjb.a;
        }
        hip hipVar = hip.a;
        return new hjc(helVar, hio.a);
    }

    Object writeReplace() {
        return new hfi(this.c);
    }
}
