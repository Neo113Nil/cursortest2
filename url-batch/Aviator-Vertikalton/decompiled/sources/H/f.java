package H;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class f implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f228a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f229b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f230c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f231d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f232e;

    public /* synthetic */ f(String str, Context context, e eVar, int i, int i2) {
        this.f228a = i2;
        this.f229b = str;
        this.f230c = context;
        this.f231d = eVar;
        this.f232e = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f228a) {
            case 0:
                return i.a(this.f229b, this.f230c, this.f231d, this.f232e);
            default:
                try {
                    return i.a(this.f229b, this.f230c, this.f231d, this.f232e);
                } catch (Throwable unused) {
                    return new h(-3);
                }
        }
    }
}
