package H;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class f implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f264a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f265b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f266c;
    public final /* synthetic */ e d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f267e;

    public /* synthetic */ f(String str, Context context, e eVar, int i, int i2) {
        this.f264a = i2;
        this.f265b = str;
        this.f266c = context;
        this.d = eVar;
        this.f267e = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f264a) {
            case 0:
                return i.a(this.f265b, this.f266c, this.d, this.f267e);
            default:
                try {
                    return i.a(this.f265b, this.f266c, this.d, this.f267e);
                } catch (Throwable unused) {
                    return new h(-3);
                }
        }
    }
}
