package defpackage;

import java.nio.ByteBuffer;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ljn implements ljr {
    public final /* synthetic */ ljo a;
    public final /* synthetic */ UrlResponseInfo b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ ljn(ljo ljoVar, UrlResponseInfo urlResponseInfo, Object obj, int i) {
        this.d = i;
        this.a = ljoVar;
        this.b = urlResponseInfo;
        this.c = obj;
    }

    @Override // defpackage.ljr
    public final void a() {
        int i = this.d;
        ljo ljoVar = this.a;
        if (i == 0) {
            Object obj = this.c;
            ljoVar.a.onRedirectReceived(ljoVar.d, this.b, (String) obj);
        } else {
            ljq ljqVar = ljoVar.d;
            if (ljqVar.g.compareAndSet(5, 4)) {
                Object obj2 = this.c;
                ljoVar.a.onReadCompleted(ljqVar, this.b, (ByteBuffer) obj2);
            }
        }
    }
}
