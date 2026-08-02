package defpackage;

import android.content.Intent;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class fsd implements hac {
    private final /* synthetic */ int a;

    @Override // defpackage.hac
    public final Object bB() {
        int i = this.a;
        if (i == 0) {
            return false;
        }
        if (i == 1) {
            return new Intent();
        }
        if (i != 2 && i != 3) {
            if (i != 4) {
                if (i != 5) {
                    Logger logger = kat.a;
                    ArrayList arrayList = new ArrayList();
                    try {
                        arrayList.add(Class.forName("kgn"));
                    } catch (ClassNotFoundException e) {
                        kat.a.logp(Level.FINE, "io.grpc.NameResolverRegistry", "getHardCodedClasses", "Unable to find DNS NameResolver", (Throwable) e);
                    }
                    try {
                        arrayList.add(Class.forName("kdg"));
                    } catch (ClassNotFoundException e2) {
                        kat.a.logp(Level.FINE, "io.grpc.NameResolverRegistry", "getHardCodedClasses", "Unable to find IntentNameResolverProvider", (Throwable) e2);
                    }
                    return DesugarCollections.unmodifiableList(arrayList);
                }
                Logger logger2 = jzn.a;
                ArrayList arrayList2 = new ArrayList();
                try {
                    arrayList2.add(Class.forName("kjz"));
                } catch (ClassNotFoundException e3) {
                    jzn.a.logp(Level.WARNING, "io.grpc.LoadBalancerRegistry", "getHardCodedClasses", "Unable to find pick-first LoadBalancer", (Throwable) e3);
                }
                try {
                    arrayList2.add(Class.forName("knz"));
                } catch (ClassNotFoundException e4) {
                    jzn.a.logp(Level.FINE, "io.grpc.LoadBalancerRegistry", "getHardCodedClasses", "Unable to find round-robin LoadBalancer", (Throwable) e4);
                }
                return DesugarCollections.unmodifiableList(arrayList2);
            }
            long j = idc.a;
        }
        return false;
    }
}
