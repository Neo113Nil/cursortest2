package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dfz implements jrw {
    private final jsb a;

    public dfz(jsb jsbVar) {
        this.a = jsbVar;
    }

    @Override // defpackage.koe, defpackage.kod
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Handler b() {
        Handler handler;
        int ordinal = ((dhb) ((gzp) ((jrx) this.a).a).d(dhb.a)).ordinal();
        if (ordinal == 0) {
            handler = new Handler(Looper.getMainLooper());
        } else {
            if (ordinal != 1) {
                throw new RuntimeException(null, null);
            }
            handler = Handler.createAsync(Looper.getMainLooper());
        }
        handler.getClass();
        return handler;
    }
}
