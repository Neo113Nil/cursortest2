package F;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class g implements Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f731d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f732e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Context f733i;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f734l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f735m;

    public /* synthetic */ g(String str, Context context, Object obj, int i2, int i5) {
        this.f731d = i5;
        this.f732e = str;
        this.f733i = context;
        this.f735m = obj;
        this.f734l = i2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f731d) {
            case 0:
                Object[] objArr = {(f) this.f735m};
                ArrayList arrayList = new ArrayList(1);
                Object obj = objArr[0];
                Objects.requireNonNull(obj);
                arrayList.add(obj);
                return j.b(this.f732e, this.f733i, Collections.unmodifiableList(arrayList), this.f734l);
            default:
                try {
                    return j.b(this.f732e, this.f733i, (ArrayList) this.f735m, this.f734l);
                } catch (Throwable unused) {
                    return new i(-3);
                }
        }
    }
}
