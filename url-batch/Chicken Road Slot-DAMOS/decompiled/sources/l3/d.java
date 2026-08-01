package l3;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d implements Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5840d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f5841e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Context f5842i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f5843r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f5844s;

    public /* synthetic */ d(String str, Context context, Object obj, int i3, int i10) {
        this.f5840d = i10;
        this.f5841e = str;
        this.f5842i = context;
        this.f5844s = obj;
        this.f5843r = i3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f5840d) {
            case 0:
                Object[] objArr = {(c) this.f5844s};
                ArrayList arrayList = new ArrayList(1);
                Object obj = objArr[0];
                Objects.requireNonNull(obj);
                arrayList.add(obj);
                return g.b(this.f5841e, this.f5842i, Collections.unmodifiableList(arrayList), this.f5843r);
            default:
                try {
                    return g.b(this.f5841e, this.f5842i, (ArrayList) this.f5844s, this.f5843r);
                } catch (Throwable unused) {
                    return new f(-3);
                }
        }
    }
}
