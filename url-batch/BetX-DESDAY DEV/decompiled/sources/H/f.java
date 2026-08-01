package H;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class f implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f227a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f228b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f229c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f230d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f231e;

    public /* synthetic */ f(String str, Context context, e eVar, int i, int i2) {
        this.f227a = i2;
        this.f228b = str;
        this.f229c = context;
        this.f230d = eVar;
        this.f231e = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f227a) {
            case 0:
                return i.a(this.f228b, this.f229c, this.f230d, this.f231e);
            default:
                try {
                    return i.a(this.f228b, this.f229c, this.f230d, this.f231e);
                } catch (Throwable unused) {
                    return new h(-3);
                }
        }
    }
}
