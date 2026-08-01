package I;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class e implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f324a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f325b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f326c;
    public final /* synthetic */ d d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f327e;

    public /* synthetic */ e(String str, Context context, d dVar, int i, int i2) {
        this.f324a = i2;
        this.f325b = str;
        this.f326c = context;
        this.d = dVar;
        this.f327e = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f324a) {
            case 0:
                return h.a(this.f325b, this.f326c, this.d, this.f327e);
            default:
                try {
                    return h.a(this.f325b, this.f326c, this.d, this.f327e);
                } catch (Throwable unused) {
                    return new g(-3);
                }
        }
    }
}
