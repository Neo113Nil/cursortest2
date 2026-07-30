package G3;

import B4.c;
import B4.d;
import S.j;
import com.appsflyer.attribution.RequestError;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;
import k5.k;
import k5.o;
import k5.p;
import kotlin.jvm.internal.Intrinsics;
import y5.C1048b;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Supplier {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f841d;

    public /* synthetic */ a(int i2) {
        this.f841d = i2;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f841d) {
            case 0:
                C1048b c1048b = new C1048b(32000);
                Intrinsics.checkNotNullExpressionValue(c1048b, "build(...)");
                return c1048b;
            case 1:
                return N5.a.f1841a;
            case 2:
                return Collections.EMPTY_MAP;
            case 3:
                d dVar = c.f178c;
                if (dVar == null) {
                    synchronized (c.f177b) {
                        try {
                            dVar = c.f178c;
                            if (dVar == null) {
                                dVar = c.a();
                                if (dVar == null) {
                                    dVar = B4.a.f174d;
                                    c.b(dVar);
                                }
                            }
                        } finally {
                        }
                    }
                }
                return dVar.a();
            case 4:
                return new IdentityHashMap();
            case 5:
                return new ArrayList();
            case 6:
                return new k();
            case j.DOUBLE_FIELD_NUMBER /* 7 */:
                return new k();
            case j.BYTES_FIELD_NUMBER /* 8 */:
                return new p();
            case 9:
                return new p();
            case 10:
                return new o();
            case RequestError.STOP_TRACKING /* 11 */:
                return Double.valueOf(ThreadLocalRandom.current().nextDouble(0.8d, 1.2d));
            default:
                return C1048b.f8665b;
        }
    }
}
