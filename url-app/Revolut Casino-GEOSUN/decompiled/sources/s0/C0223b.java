package s0;

import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: s0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0223b extends n0.n {

    /* renamed from: e, reason: collision with root package name */
    public static final C0223b f2887e = new C0223b(0);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2888d;

    public /* synthetic */ C0223b(int i2) {
        this.f2888d = i2;
    }

    @Override // n0.n
    public Object f(byte b2, ByteBuffer byteBuffer) {
        switch (this.f2888d) {
            case 1:
                F0.i.e(byteBuffer, "buffer");
                if (b2 == -127) {
                    Long l2 = (Long) e(byteBuffer);
                    if (l2 != null) {
                        int longValue = (int) l2.longValue();
                        L.f2877f.getClass();
                        L[] values = L.values();
                        int length = values.length;
                        for (int i2 = 0; i2 < length; i2++) {
                            L l3 = values[i2];
                            if (l3.f2882e == longValue) {
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
                        F0.i.c(obj, "null cannot be cast to non-null type kotlin.Boolean");
                        break;
                    }
                } else if (b2 == -125) {
                    Object e3 = e(byteBuffer);
                    List list2 = e3 instanceof List ? (List) e3 : null;
                    if (list2 != null) {
                        String str2 = (String) list2.get(0);
                        Object obj2 = list2.get(1);
                        F0.i.c(obj2, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.StringListLookupResultType");
                        break;
                    }
                } else {
                    break;
                }
                break;
        }
        return super.f(b2, byteBuffer);
    }

    @Override // n0.n
    public void k(n0.m mVar, Object obj) {
        switch (this.f2888d) {
            case 1:
                if (!(obj instanceof L)) {
                    if (!(obj instanceof C0229h)) {
                        if (!(obj instanceof N)) {
                            super.k(mVar, obj);
                            break;
                        } else {
                            mVar.write(131);
                            N n2 = (N) obj;
                            k(mVar, v0.e.B(n2.f2883a, n2.f2884b));
                            break;
                        }
                    } else {
                        mVar.write(130);
                        k(mVar, ((C0229h) obj).a());
                        break;
                    }
                } else {
                    mVar.write(129);
                    k(mVar, Long.valueOf(((L) obj).f2882e));
                    break;
                }
            default:
                super.k(mVar, obj);
                break;
        }
    }
}
