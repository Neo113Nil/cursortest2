package h0;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class e implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1983a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f1984b;
    public final /* synthetic */ Context c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1985d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1986e;

    public /* synthetic */ e(String str, Context context, Object obj, int i4, int i5) {
        this.f1983a = i5;
        this.f1984b = str;
        this.c = context;
        this.f1986e = obj;
        this.f1985d = i4;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f1983a) {
            case 0:
                Object[] objArr = {(d) this.f1986e};
                ArrayList arrayList = new ArrayList(1);
                Object obj = objArr[0];
                Objects.requireNonNull(obj);
                arrayList.add(obj);
                return h.b(this.f1984b, this.c, Collections.unmodifiableList(arrayList), this.f1985d);
            default:
                try {
                    return h.b(this.f1984b, this.c, (List) this.f1986e, this.f1985d);
                } catch (Throwable unused) {
                    return new g(-3);
                }
        }
    }
}
