package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dfx implements jrw {
    private final jsb a;
    private final jsb b;

    public dfx(jsb jsbVar, jsb jsbVar2) {
        this.a = jsbVar;
        this.b = jsbVar2;
    }

    @Override // defpackage.koe, defpackage.kod
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final dhr b() {
        dhr b;
        Map map = (Map) ((jrx) this.a).a;
        int size = map.size();
        jsb jsbVar = this.b;
        if (size == 0) {
            b = ((dhs) jsbVar).b();
        } else {
            if (size != 1) {
                throw new IllegalArgumentException("More than 1 ThreadMonitoringConfiguration: ".concat(String.valueOf(jsbVar.toString())));
            }
            b = (dhr) hnu.X(map.keySet());
        }
        b.getClass();
        return b;
    }
}
