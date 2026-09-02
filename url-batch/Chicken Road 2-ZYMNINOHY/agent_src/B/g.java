package B;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class g implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f163a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f164b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f165c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f166d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f167e;

    public /* synthetic */ g(String str, Context context, Object obj, int i4, int i5) {
        this.f163a = i5;
        this.f164b = str;
        this.f165c = context;
        this.f167e = obj;
        this.f166d = i4;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f163a) {
            case 0:
                Object[] objArr = {(f) this.f167e};
                ArrayList arrayList = new ArrayList(1);
                Object obj = objArr[0];
                Objects.requireNonNull(obj);
                arrayList.add(obj);
                return j.b(this.f164b, this.f165c, Collections.unmodifiableList(arrayList), this.f166d);
            default:
                try {
                    return j.b(this.f164b, this.f165c, (ArrayList) this.f167e, this.f166d);
                } catch (Throwable unused) {
                    return new i(-3);
                }
        }
    }
}
