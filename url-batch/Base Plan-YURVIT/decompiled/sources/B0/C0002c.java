package B0;

import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: B0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0002c extends v0.n {

    /* renamed from: e, reason: collision with root package name */
    public static final C0002c f72e = new C0002c(0);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f73d;

    public /* synthetic */ C0002c(int i2) {
        this.f73d = i2;
    }

    @Override // v0.n
    public Object f(byte b2, ByteBuffer byteBuffer) {
        switch (this.f73d) {
            case 1:
                P0.h.e(byteBuffer, "buffer");
                if (b2 == -127) {
                    Long l2 = (Long) e(byteBuffer);
                    if (l2 != null) {
                        int longValue = (int) l2.longValue();
                        Q.f59f.getClass();
                        Q[] values = Q.values();
                        int length = values.length;
                        for (int i2 = 0; i2 < length; i2++) {
                            Q q2 = values[i2];
                            if (q2.f64e == longValue) {
                                break;
                            }
                        }
                        break;
                    }
                } else if (b2 == -126) {
                    Object e2 = e(byteBuffer);
                    List list = e2 instanceof List ? (List) e2 : null;
                    if (list != null) {
                        String str = (String) list.get(0);
                        Object obj = list.get(1);
                        P0.h.c(obj, "null cannot be cast to non-null type kotlin.Boolean");
                        break;
                    }
                } else if (b2 == -125) {
                    Object e3 = e(byteBuffer);
                    List list2 = e3 instanceof List ? (List) e3 : null;
                    if (list2 != null) {
                        String str2 = (String) list2.get(0);
                        Object obj2 = list2.get(1);
                        P0.h.c(obj2, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.StringListLookupResultType");
                        break;
                    }
                } else {
                    break;
                }
                break;
        }
        return super.f(b2, byteBuffer);
    }

    @Override // v0.n
    public void k(v0.m mVar, Object obj) {
        switch (this.f73d) {
            case 1:
                if (!(obj instanceof Q)) {
                    if (!(obj instanceof C0009j)) {
                        if (!(obj instanceof T)) {
                            super.k(mVar, obj);
                            break;
                        } else {
                            mVar.write(131);
                            T t = (T) obj;
                            k(mVar, E0.g.O(t.f65a, t.f66b));
                            break;
                        }
                    } else {
                        mVar.write(130);
                        k(mVar, ((C0009j) obj).a());
                        break;
                    }
                } else {
                    mVar.write(129);
                    k(mVar, Long.valueOf(((Q) obj).f64e));
                    break;
                }
            default:
                super.k(mVar, obj);
                break;
        }
    }
}
