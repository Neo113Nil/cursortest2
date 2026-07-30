package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class up0 implements Callable {
    public final /* synthetic */ int m;
    public final /* synthetic */ String n;
    public final /* synthetic */ Context o;
    public final /* synthetic */ int p;
    public final /* synthetic */ Object q;

    public /* synthetic */ up0(String str, Context context, Object obj, int i, int i2) {
        this.m = i2;
        this.n = str;
        this.o = context;
        this.q = obj;
        this.p = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.m;
        int i2 = this.p;
        Object obj = this.q;
        Context context = this.o;
        String str = this.n;
        switch (i) {
            case 0:
                Object[] objArr = {(rp0) obj};
                ArrayList arrayList = new ArrayList(1);
                Object obj2 = objArr[0];
                Objects.requireNonNull(obj2);
                arrayList.add(obj2);
                return xp0.b(str, context, Collections.unmodifiableList(arrayList), i2);
            default:
                try {
                    return xp0.b(str, context, (ArrayList) obj, i2);
                } catch (Throwable unused) {
                    return new wp0(-3);
                }
        }
    }
}
