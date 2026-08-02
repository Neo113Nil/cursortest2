package defpackage;

import android.net.http.UrlResponseInfo;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class lii implements lit {
    public final /* synthetic */ lij a;
    public final /* synthetic */ UrlResponseInfo b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ lii(lij lijVar, UrlResponseInfo urlResponseInfo, Object obj, int i) {
        this.d = i;
        this.a = lijVar;
        this.b = urlResponseInfo;
        this.c = obj;
    }

    @Override // defpackage.lit
    public final Object a() {
        int i = this.d;
        UrlResponseInfo urlResponseInfo = this.b;
        if (i != 0) {
            lij lijVar = this.a;
            Object obj = this.c;
            lim b = lim.b(urlResponseInfo);
            lijVar.a.onReadCompleted(lijVar.b, b, (ByteBuffer) obj);
            return null;
        }
        lij lijVar2 = this.a;
        Object obj2 = this.c;
        lim b2 = lim.b(urlResponseInfo);
        lijVar2.a.onRedirectReceived(lijVar2.b, b2, (String) obj2);
        return null;
    }
}
