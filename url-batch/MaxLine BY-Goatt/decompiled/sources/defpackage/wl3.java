package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class wl3 {
    public static final hi a = new hi(0);

    public static synchronized void a() {
        synchronized (wl3.class) {
            hi hiVar = a;
            Iterator it = ((gi) hiVar.values()).iterator();
            if (it.hasNext()) {
                ((wl3) it.next()).getClass();
                throw null;
            }
            hiVar.clear();
        }
    }
}
