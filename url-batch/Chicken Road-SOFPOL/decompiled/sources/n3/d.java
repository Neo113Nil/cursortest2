package n3;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class d implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5346a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f5347b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f5348c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5349d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5350e;

    public /* synthetic */ d(String str, Context context, Object obj, int i, int i8) {
        this.f5346a = i8;
        this.f5347b = str;
        this.f5348c = context;
        this.f5350e = obj;
        this.f5349d = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f5346a) {
            case 0:
                Object[] objArr = {(c) this.f5350e};
                ArrayList arrayList = new ArrayList(1);
                Object obj = objArr[0];
                Objects.requireNonNull(obj);
                arrayList.add(obj);
                return g.b(this.f5347b, this.f5348c, Collections.unmodifiableList(arrayList), this.f5349d);
            default:
                try {
                    return g.b(this.f5347b, this.f5348c, (ArrayList) this.f5350e, this.f5349d);
                } catch (Throwable unused) {
                    return new f(-3);
                }
        }
    }
}
