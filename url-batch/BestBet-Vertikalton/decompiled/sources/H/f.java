package H;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class f implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f486a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f487b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f488c;
    public final /* synthetic */ e d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f489e;

    public /* synthetic */ f(String str, Context context, e eVar, int i, int i2) {
        this.f486a = i2;
        this.f487b = str;
        this.f488c = context;
        this.d = eVar;
        this.f489e = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f486a) {
            case 0:
                return i.a(this.f487b, this.f488c, this.d, this.f489e);
            default:
                try {
                    return i.a(this.f487b, this.f488c, this.d, this.f489e);
                } catch (Throwable unused) {
                    return new h(-3);
                }
        }
    }
}
