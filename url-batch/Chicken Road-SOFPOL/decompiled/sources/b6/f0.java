package b6;

import java.util.List;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class f0 implements p6.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1316d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1317e;

    public /* synthetic */ f0(int i, Object obj) {
        this.f1316d = i;
        this.f1317e = obj;
    }

    @Override // p6.c
    public final Object i(Object obj) {
        long j7;
        switch (this.f1316d) {
            case 0:
                ((List) this.f1317e).get(((Number) obj).intValue());
                return null;
            case 1:
                ((List) this.f1317e).get(((Number) obj).intValue());
                return null;
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                ((List) this.f1317e).get(((Number) obj).intValue());
                return null;
            default:
                w0.k kVar = (w0.k) obj;
                synchronized (w0.m.f7537c) {
                    j7 = w0.m.f7539e;
                    w0.m.f7539e = 1 + j7;
                }
                return new w0.e(j7, kVar, (p6.c) this.f1317e);
        }
    }
}
