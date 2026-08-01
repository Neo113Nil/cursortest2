package J;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class e implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f362a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f363b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f364c;
    public final /* synthetic */ d d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f365e;

    public /* synthetic */ e(String str, Context context, d dVar, int i, int i2) {
        this.f362a = i2;
        this.f363b = str;
        this.f364c = context;
        this.d = dVar;
        this.f365e = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f362a) {
            case 0:
                return h.a(this.f363b, this.f364c, this.d, this.f365e);
            default:
                try {
                    return h.a(this.f363b, this.f364c, this.d, this.f365e);
                } catch (Throwable unused) {
                    return new g(-3);
                }
        }
    }
}
