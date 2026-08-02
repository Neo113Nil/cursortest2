package defpackage;

import android.content.Context;
import java.util.List;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class atd {
    public static atd d(Context context) {
        context.getClass();
        return auy.i(context);
    }

    public abstract asv a(String str);

    public abstract asv b(UUID uuid);

    public abstract asv c(List list);

    public abstract asv e(String str, int i, List list);

    public final asv f(bvw bvwVar) {
        return c(ixc.b(bvwVar));
    }

    public abstract asv g(String str, int i, bvw bvwVar);

    public abstract hvi h(brn brnVar);
}
