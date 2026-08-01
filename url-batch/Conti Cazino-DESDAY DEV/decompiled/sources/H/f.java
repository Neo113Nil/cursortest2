package H;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class f implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f216a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f217b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f218c;
    public final /* synthetic */ e d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f219e;

    public /* synthetic */ f(String str, Context context, e eVar, int i, int i2) {
        this.f216a = i2;
        this.f217b = str;
        this.f218c = context;
        this.d = eVar;
        this.f219e = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f216a) {
            case 0:
                return i.a(this.f217b, this.f218c, this.d, this.f219e);
            default:
                try {
                    return i.a(this.f217b, this.f218c, this.d, this.f219e);
                } catch (Throwable unused) {
                    return new h(-3);
                }
        }
    }
}
