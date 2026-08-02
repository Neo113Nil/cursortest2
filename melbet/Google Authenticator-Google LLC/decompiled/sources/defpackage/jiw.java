package defpackage;

import android.view.View;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jiw {
    private static final kui a = new kui(0, kul.a);
    private final Map b = new LinkedHashMap();

    public final jiu a(krt krtVar) {
        jkj k = jiu.a.k();
        k.getClass();
        int b = a.b();
        if (!k.b.M()) {
            k.t();
        }
        jiu jiuVar = (jiu) k.b;
        jiuVar.b |= 1;
        jiuVar.c = b;
        jkp q = k.q();
        q.getClass();
        jiu jiuVar2 = (jiu) q;
        this.b.put(jiuVar2, krtVar);
        return jiuVar2;
    }

    public final jiv b(jiu jiuVar, View view) {
        krt krtVar = (krt) this.b.get(jiuVar);
        if (krtVar != null) {
            return (jiv) krtVar.a(view);
        }
        throw new IllegalStateException("Tap is not mapped to any action.");
    }

    public final void c(jiu jiuVar, krt krtVar) {
        jiuVar.getClass();
        Map map = this.b;
        if (!map.containsKey(jiuVar)) {
            throw new IllegalArgumentException("Can't update tap that is not registered. Make sure to create Taps using TapMapper.newTap()");
        }
        map.put(jiuVar, krtVar);
    }
}
