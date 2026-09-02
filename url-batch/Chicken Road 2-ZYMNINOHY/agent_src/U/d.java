package U;

import a0.C0143i;
import android.content.Context;
import java.util.HashMap;
import q0.C1374p;
import v2.a0;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements u2.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3023a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f3024b;

    public /* synthetic */ d(Context context, int i4) {
        this.f3023a = i4;
        this.f3024b = context;
    }

    @Override // u2.m
    public final Object get() {
        u0.g gVar;
        switch (this.f3023a) {
            case 0:
                return i.j(this.f3024b);
            case 1:
                return new C0143i(this.f3024b);
            case 2:
                return new C1374p(new l2.e(this.f3024b, 20), new y0.l());
            case 3:
                return new t0.r(this.f3024b);
            default:
                Context context = this.f3024b;
                a0 a0Var = u0.g.f15448p;
                synchronized (u0.g.class) {
                    try {
                        if (u0.g.v == null) {
                            Context applicationContext = context == null ? null : context.getApplicationContext();
                            HashMap hashMap = new HashMap(8);
                            hashMap.put(0, 1000000L);
                            hashMap.put(2, -9223372036854775807L);
                            hashMap.put(3, -9223372036854775807L);
                            hashMap.put(4, -9223372036854775807L);
                            hashMap.put(5, -9223372036854775807L);
                            hashMap.put(10, -9223372036854775807L);
                            hashMap.put(9, -9223372036854775807L);
                            hashMap.put(7, -9223372036854775807L);
                            u0.g.v = new u0.g(applicationContext, hashMap);
                        }
                        gVar = u0.g.v;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return gVar;
        }
    }
}
