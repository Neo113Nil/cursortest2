package v;

import android.content.Context;
import g0.C0131a;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class c implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3060a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f3061b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f3062c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0131a f3063d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3064e;

    public /* synthetic */ c(String str, Context context, C0131a c0131a, int i2, int i3) {
        this.f3060a = i3;
        this.f3061b = str;
        this.f3062c = context;
        this.f3063d = c0131a;
        this.f3064e = i2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f3060a) {
            case 0:
                return f.a(this.f3061b, this.f3062c, this.f3063d, this.f3064e);
            default:
                try {
                    return f.a(this.f3061b, this.f3062c, this.f3063d, this.f3064e);
                } catch (Throwable unused) {
                    return new e(-3);
                }
        }
    }
}
