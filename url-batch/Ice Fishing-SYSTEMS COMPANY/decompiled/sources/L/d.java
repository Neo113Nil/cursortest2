package L;

import B2.N;
import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class d implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1673a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f1674b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f1675c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ N f1676d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1677e;

    public /* synthetic */ d(String str, Context context, N n9, int i, int i4) {
        this.f1673a = i4;
        this.f1674b = str;
        this.f1675c = context;
        this.f1676d = n9;
        this.f1677e = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f1673a) {
            case 0:
                return g.a(this.f1674b, this.f1675c, this.f1676d, this.f1677e);
            default:
                try {
                    return g.a(this.f1674b, this.f1675c, this.f1676d, this.f1677e);
                } catch (Throwable unused) {
                    return new f(-3);
                }
        }
    }
}
