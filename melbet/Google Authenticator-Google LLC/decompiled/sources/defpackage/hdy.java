package defpackage;

import j$.util.Map;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class hdy extends her implements Map, hbt {
    private static final long serialVersionUID = 912559;

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public abstract hdy a();

    @Override // defpackage.her
    public final /* bridge */ /* synthetic */ heb b() {
        throw new AssertionError("should never be called");
    }

    @Override // defpackage.her, java.util.Map
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final hfm values() {
        return a().keySet();
    }

    @Override // defpackage.her
    public Object writeReplace() {
        return new hdx(this);
    }
}
