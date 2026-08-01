package k0;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class e implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2287a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f2288b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f2289c;
    public final /* synthetic */ int d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2290e;

    public /* synthetic */ e(String str, Context context, Object obj, int i, int i4) {
        this.f2287a = i4;
        this.f2288b = str;
        this.f2289c = context;
        this.f2290e = obj;
        this.d = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f2287a) {
            case 0:
                Object[] objArr = {(d) this.f2290e};
                ArrayList arrayList = new ArrayList(1);
                Object obj = objArr[0];
                Objects.requireNonNull(obj);
                arrayList.add(obj);
                return h.b(this.f2288b, this.f2289c, Collections.unmodifiableList(arrayList), this.d);
            default:
                try {
                    return h.b(this.f2288b, this.f2289c, (ArrayList) this.f2290e, this.d);
                } catch (Throwable unused) {
                    return new g(-3);
                }
        }
    }
}
