package x;

import D0.O;
import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: x.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class CallableC0325d implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3570a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f3571b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f3572c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ O f3573d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3574e;

    public /* synthetic */ CallableC0325d(String str, Context context, O o2, int i2, int i3) {
        this.f3570a = i3;
        this.f3571b = str;
        this.f3572c = context;
        this.f3573d = o2;
        this.f3574e = i2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f3570a) {
            case 0:
                return AbstractC0328g.a(this.f3571b, this.f3572c, this.f3573d, this.f3574e);
            default:
                try {
                    return AbstractC0328g.a(this.f3571b, this.f3572c, this.f3573d, this.f3574e);
                } catch (Throwable unused) {
                    return new C0327f(-3);
                }
        }
    }
}
