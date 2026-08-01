package H;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class f implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f209a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f210b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f211c;
    public final /* synthetic */ e d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f212e;

    public /* synthetic */ f(String str, Context context, e eVar, int i, int i2) {
        this.f209a = i2;
        this.f210b = str;
        this.f211c = context;
        this.d = eVar;
        this.f212e = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f209a) {
            case 0:
                return i.a(this.f210b, this.f211c, this.d, this.f212e);
            default:
                try {
                    return i.a(this.f210b, this.f211c, this.d, this.f212e);
                } catch (Throwable unused) {
                    return new h(-3);
                }
        }
    }
}
