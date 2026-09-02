package A;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class f implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f13b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f14c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f15d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f16e;

    public /* synthetic */ f(String str, Context context, e eVar, int i7, int i8) {
        this.f12a = i8;
        this.f13b = str;
        this.f14c = context;
        this.f15d = eVar;
        this.f16e = i7;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f12a) {
            case 0:
                return i.a(this.f13b, this.f14c, this.f15d, this.f16e);
            default:
                try {
                    return i.a(this.f13b, this.f14c, this.f15d, this.f16e);
                } catch (Throwable unused) {
                    return new h(-3);
                }
        }
    }
}
