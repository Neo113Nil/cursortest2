package defpackage;

import android.app.Activity;
import android.os.MessageQueue;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class gin implements MessageQueue.IdleHandler {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ gin(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, java.util.Set] */
    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        if (this.b != 0) {
            Object obj = this.a;
            ((eij) obj).a.schedule(new avc(obj, 9), 7000L, TimeUnit.MILLISECONDS);
            return false;
        }
        Object obj2 = this.a;
        giq giqVar = (giq) obj2;
        if (!giqVar.a && giqVar.c.isEmpty()) {
            gty aC = hoq.aC(179, "Recreating all activities");
            try {
                if (((giq) obj2).a()) {
                    ((giq) obj2).a = true;
                    fao.e(gvx.h(new gfm(obj2, 5)));
                    Iterator it = ((giq) obj2).b.iterator();
                    while (it.hasNext()) {
                        ((Activity) it.next()).recreate();
                    }
                    fao.e(new gfm(obj2, 6));
                }
                ixf.j(aC, null);
            } finally {
            }
        }
        return false;
    }
}
