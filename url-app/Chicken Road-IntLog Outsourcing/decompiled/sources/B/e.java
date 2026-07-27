package B;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class e implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f111a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f112b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f113c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f114d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f115e;

    public /* synthetic */ e(String str, Context context, d dVar, int i2, int i3) {
        this.f111a = i3;
        this.f112b = str;
        this.f113c = context;
        this.f114d = dVar;
        this.f115e = i2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f111a) {
            case 0:
                return h.a(this.f112b, this.f113c, this.f114d, this.f115e);
            default:
                try {
                    return h.a(this.f112b, this.f113c, this.f114d, this.f115e);
                } catch (Throwable unused) {
                    return new g(-3);
                }
        }
    }
}
