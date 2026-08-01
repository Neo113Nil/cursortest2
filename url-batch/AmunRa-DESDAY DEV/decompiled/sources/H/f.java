package H;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class f implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f202a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f203b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f204c;
    public final /* synthetic */ e d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f205e;

    public /* synthetic */ f(String str, Context context, e eVar, int i, int i2) {
        this.f202a = i2;
        this.f203b = str;
        this.f204c = context;
        this.d = eVar;
        this.f205e = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f202a) {
            case 0:
                return i.a(this.f203b, this.f204c, this.d, this.f205e);
            default:
                try {
                    return i.a(this.f203b, this.f204c, this.d, this.f205e);
                } catch (Throwable unused) {
                    return new h(-3);
                }
        }
    }
}
