package H;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class f implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f224a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f225b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f226c;
    public final /* synthetic */ e d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f227e;

    public /* synthetic */ f(String str, Context context, e eVar, int i, int i2) {
        this.f224a = i2;
        this.f225b = str;
        this.f226c = context;
        this.d = eVar;
        this.f227e = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f224a) {
            case 0:
                return i.a(this.f225b, this.f226c, this.d, this.f227e);
            default:
                try {
                    return i.a(this.f225b, this.f226c, this.d, this.f227e);
                } catch (Throwable unused) {
                    return new h(-3);
                }
        }
    }
}
