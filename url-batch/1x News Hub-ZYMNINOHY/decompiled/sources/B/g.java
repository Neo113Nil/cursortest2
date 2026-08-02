package B;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class g implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f90a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f91b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f92c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f93d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f94e;

    public /* synthetic */ g(String str, Context context, Object obj, int i3, int i4) {
        this.f90a = i4;
        this.f91b = str;
        this.f92c = context;
        this.f94e = obj;
        this.f93d = i3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f90a) {
            case 0:
                Object[] objArr = {(f) this.f94e};
                ArrayList arrayList = new ArrayList(1);
                Object obj = objArr[0];
                Objects.requireNonNull(obj);
                arrayList.add(obj);
                return j.b(this.f91b, this.f92c, Collections.unmodifiableList(arrayList), this.f93d);
            default:
                try {
                    return j.b(this.f91b, this.f92c, (ArrayList) this.f94e, this.f93d);
                } catch (Throwable unused) {
                    return new i(-3);
                }
        }
    }
}
