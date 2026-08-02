package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iks {
    public static final Object a = new Object();
    public static iks b;
    public ial c;

    public static iks b() {
        iks iksVar;
        synchronized (a) {
            oy.aq(b != null, "MlKitContext has not been initialized");
            iksVar = b;
            oy.at(iksVar);
        }
        return iksVar;
    }

    public final Context a() {
        return (Context) c(Context.class);
    }

    public final Object c(Class cls) {
        oy.aq(b == this, "MlKitContext has been deleted");
        oy.at(this.c);
        return hnu.at(this.c, cls);
    }
}
