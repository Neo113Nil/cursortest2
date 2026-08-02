package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ibv implements ibg {
    private final /* synthetic */ int a;

    @Override // defpackage.ibd
    public final void a(Object obj, Object obj2) {
        int i = this.a;
        if (i == 0) {
            Map.Entry entry = (Map.Entry) obj;
            ibh ibhVar = (ibh) obj2;
            ibhVar.b(ibw.a, entry.getKey());
            ibhVar.b(ibw.b, entry.getValue());
            return;
        }
        if (i != 1) {
            throw new ibe("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
        int i2 = ibn.e;
        throw new ibe("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
    }
}
