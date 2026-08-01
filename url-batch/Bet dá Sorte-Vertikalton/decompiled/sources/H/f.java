package H;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class f implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f278a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f279b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f280c;
    public final /* synthetic */ e d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f281e;

    public /* synthetic */ f(String str, Context context, e eVar, int i, int i2) {
        this.f278a = i2;
        this.f279b = str;
        this.f280c = context;
        this.d = eVar;
        this.f281e = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f278a) {
            case 0:
                return i.a(this.f279b, this.f280c, this.d, this.f281e);
            default:
                try {
                    return i.a(this.f279b, this.f280c, this.d, this.f281e);
                } catch (Throwable unused) {
                    return new h(-3);
                }
        }
    }
}
