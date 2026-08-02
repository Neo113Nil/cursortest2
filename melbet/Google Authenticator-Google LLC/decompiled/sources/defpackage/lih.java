package defpackage;

import java.net.URL;
import java.net.URLConnection;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class lih implements lit {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ lih(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    @Override // defpackage.lit
    public final Object a() {
        URLConnection openConnection;
        if (this.c != 0) {
            openConnection = ((lia) this.a).a.openConnection((URL) this.b);
            return openConnection;
        }
        lim b = lim.b(mx$$ExternalSyntheticApiModelOutline0.m(this.b));
        lij lijVar = (lij) this.a;
        lijVar.a.onResponseStarted(lijVar.b, b);
        return null;
    }
}
