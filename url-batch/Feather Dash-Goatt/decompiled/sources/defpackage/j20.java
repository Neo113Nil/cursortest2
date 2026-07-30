package defpackage;

import android.content.Context;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class j20 implements Callable {
    public final /* synthetic */ String d;
    public final /* synthetic */ Context e;
    public final /* synthetic */ List g;

    public j20(String str, Context context, List list) {
        this.d = str;
        this.e = context;
        this.g = list;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        try {
            return l20.a(this.d, this.e, this.g);
        } catch (Throwable unused) {
            return new k20(-3);
        }
    }
}
