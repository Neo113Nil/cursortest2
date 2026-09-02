package k0;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class e implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2139a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f2140b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f2141c;
    public final /* synthetic */ int d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2142e;

    public /* synthetic */ e(String str, Context context, Object obj, int i, int i4) {
        this.f2139a = i4;
        this.f2140b = str;
        this.f2141c = context;
        this.f2142e = obj;
        this.d = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f2139a) {
            case 0:
                Object[] objArr = {(d) this.f2142e};
                ArrayList arrayList = new ArrayList(1);
                Object obj = objArr[0];
                Objects.requireNonNull(obj);
                arrayList.add(obj);
                return h.b(this.f2140b, this.f2141c, Collections.unmodifiableList(arrayList), this.d);
            default:
                try {
                    return h.b(this.f2140b, this.f2141c, (ArrayList) this.f2142e, this.d);
                } catch (Throwable unused) {
                    return new g(-3);
                }
        }
    }
}
