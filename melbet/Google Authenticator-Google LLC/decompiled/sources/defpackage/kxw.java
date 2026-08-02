package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kxw extends CancellationException implements kvg {
    public final transient kwu a;

    public kxw(String str, kwu kwuVar) {
        super(str);
        this.a = kwuVar;
    }

    @Override // defpackage.kvg
    public final /* bridge */ /* synthetic */ Throwable a() {
        String message = getMessage();
        if (message == null) {
            message = "";
        }
        kxw kxwVar = new kxw(message, this.a);
        kxwVar.initCause(this);
        return kxwVar;
    }
}
