package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azu extends ContextWrapper {
    static final bai a = new azi();
    public final List b;
    public final Map c;
    public final bdj d;
    public final int e;
    public final bek f;
    public final a g;
    public final brn h;
    private final bmc i;
    private blf j;

    public azu(Context context, bek bekVar, bmc bmcVar, a aVar, Map map, List list, bdj bdjVar, brn brnVar) {
        super(context.getApplicationContext());
        this.f = bekVar;
        this.g = aVar;
        this.b = list;
        this.c = map;
        this.d = bdjVar;
        this.h = brnVar;
        this.e = 4;
        this.i = new bmb(bmcVar);
    }

    public final bac a() {
        return (bac) this.i.a();
    }

    public final synchronized blf b() {
        blf blfVar;
        blfVar = this.j;
        if (blfVar == null) {
            blfVar = new blf();
            blfVar.I();
            this.j = blfVar;
        }
        return blfVar;
    }
}
