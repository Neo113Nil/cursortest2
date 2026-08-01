package H;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class f implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f262a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f263b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f264c;
    public final /* synthetic */ e d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f265e;

    public /* synthetic */ f(String str, Context context, e eVar, int i, int i2) {
        this.f262a = i2;
        this.f263b = str;
        this.f264c = context;
        this.d = eVar;
        this.f265e = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f262a) {
            case 0:
                return i.a(this.f263b, this.f264c, this.d, this.f265e);
            default:
                try {
                    return i.a(this.f263b, this.f264c, this.d, this.f265e);
                } catch (Throwable unused) {
                    return new h(-3);
                }
        }
    }
}
