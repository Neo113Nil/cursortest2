package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayp implements Runnable {
    private final atx a;
    private final boolean b;
    private final int c;
    private final brn d;

    public ayp(atx atxVar, brn brnVar, boolean z, int i) {
        atxVar.getClass();
        this.a = atxVar;
        this.d = brnVar;
        this.b = z;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        avi a;
        boolean z = this.b;
        atx atxVar = this.a;
        if (z) {
            brn brnVar = this.d;
            int i = this.c;
            String str = ((axl) brnVar.a).a;
            synchronized (atxVar.k) {
                a = atxVar.a(str);
            }
            atx.g(a, i);
        } else {
            brn brnVar2 = this.d;
            int i2 = this.c;
            String str2 = ((axl) brnVar2.a).a;
            synchronized (atxVar.k) {
                if (atxVar.f.get(str2) != null) {
                    asq.a();
                } else {
                    Set set = (Set) atxVar.h.get(str2);
                    if (set != null && set.contains(brnVar2)) {
                        atx.g(atxVar.a(str2), i2);
                    }
                }
            }
        }
        asq.a();
        asq.b("StopWorkRunnable");
    }
}
