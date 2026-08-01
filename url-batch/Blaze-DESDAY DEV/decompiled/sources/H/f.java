package H;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class f implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f281a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f282b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f283c;
    public final /* synthetic */ e d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f284e;

    public /* synthetic */ f(String str, Context context, e eVar, int i, int i2) {
        this.f281a = i2;
        this.f282b = str;
        this.f283c = context;
        this.d = eVar;
        this.f284e = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f281a) {
            case 0:
                return i.a(this.f282b, this.f283c, this.d, this.f284e);
            default:
                try {
                    return i.a(this.f282b, this.f283c, this.d, this.f284e);
                } catch (Throwable unused) {
                    return new h(-3);
                }
        }
    }
}
