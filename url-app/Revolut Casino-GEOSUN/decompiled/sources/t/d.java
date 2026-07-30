package t;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class d implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2970a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f2971b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f2972c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f2973d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2974e;

    public /* synthetic */ d(String str, Context context, c cVar, int i2, int i3) {
        this.f2970a = i3;
        this.f2971b = str;
        this.f2972c = context;
        this.f2973d = cVar;
        this.f2974e = i2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f2970a) {
            case 0:
                return g.a(this.f2971b, this.f2972c, this.f2973d, this.f2974e);
            default:
                try {
                    return g.a(this.f2971b, this.f2972c, this.f2973d, this.f2974e);
                } catch (Throwable unused) {
                    return new f(-3);
                }
        }
    }
}
