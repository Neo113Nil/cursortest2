package J;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class e implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f629a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f630b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f631c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f632d;
    public final /* synthetic */ int e;

    public /* synthetic */ e(String str, Context context, d dVar, int i, int i2) {
        this.f629a = i2;
        this.f630b = str;
        this.f631c = context;
        this.f632d = dVar;
        this.e = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f629a) {
            case 0:
                return h.a(this.f630b, this.f631c, this.f632d, this.e);
            default:
                try {
                    return h.a(this.f630b, this.f631c, this.f632d, this.e);
                } catch (Throwable unused) {
                    return new g(-3);
                }
        }
    }
}
