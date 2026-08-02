package defpackage;

import android.content.Context;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class enc implements hac {
    private final Context a;

    public enc(Context context) {
        this.a = context;
    }

    @Override // defpackage.hac
    public final /* bridge */ /* synthetic */ Object bB() {
        Context context = this.a;
        return djl.h(context) ? gyf.a : gzp.h(new File(context.getFilesDir(), "primes/crash"));
    }
}
