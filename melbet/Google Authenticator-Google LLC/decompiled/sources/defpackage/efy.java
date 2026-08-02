package defpackage;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class efy implements efx {
    public static final String[] a;
    public final Context b;
    private final hvl c;

    static {
        int i = dek.a;
        a = new String[]{"service_googleone"};
    }

    public efy(Context context, ExecutorService executorService) {
        this.b = context;
        this.c = hnu.aB(executorService);
    }

    @Override // defpackage.efx
    public final hvi a() {
        return hoq.ar(new avc(this, 7), this.c);
    }

    @Override // defpackage.efx
    public final hvi b() {
        return hoq.ar(new avc(this, 6), this.c);
    }

    @Override // defpackage.efx
    public final hvi c() {
        return hoq.ar(new avc(this, 5), this.c);
    }
}
