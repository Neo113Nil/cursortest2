package androidx.fragment.app;

import defpackage.c9;
import defpackage.o30;
import java.util.HashSet;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public abstract class e {
    public final s a;
    public final c9 b;

    public e(s sVar, c9 c9Var) {
        this.a = sVar;
        this.b = c9Var;
    }

    public final void a() {
        s sVar = this.a;
        HashSet hashSet = sVar.e;
        if (hashSet.remove(this.b) && hashSet.isEmpty()) {
            sVar.b();
        }
    }

    public final boolean b() {
        s sVar = this.a;
        int c = o30.c(sVar.c.mView);
        int i = sVar.a;
        if (c != i) {
            return (c == 2 || i == 2) ? false : true;
        }
        return true;
    }
}
