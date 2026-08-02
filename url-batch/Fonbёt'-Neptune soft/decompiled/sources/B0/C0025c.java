package B0;

import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: B0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0025c extends w0.o {

    /* renamed from: e, reason: collision with root package name */
    public static final C0025c f142e = new C0025c(0);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f143d;

    public /* synthetic */ C0025c(int i2) {
        this.f143d = i2;
    }

    @Override // w0.o
    public Object f(byte b2, ByteBuffer byteBuffer) {
        switch (this.f143d) {
            case 1:
                Q0.h.e(byteBuffer, "buffer");
                if (b2 == -127) {
                    Long l2 = (Long) e(byteBuffer);
                    if (l2 != null) {
                        int longValue = (int) l2.longValue();
                        P[] values = P.values();
                        int length = values.length;
                        for (int i2 = 0; i2 < length; i2++) {
                            P p2 = values[i2];
                            if (p2.f134e == longValue) {
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
                        Q0.h.c(obj, "null cannot be cast to non-null type kotlin.Boolean");
                        break;
                    }
                } else if (b2 == -125) {
                    Object e3 = e(byteBuffer);
                    List list2 = e3 instanceof List ? (List) e3 : null;
                    if (list2 != null) {
                        String str2 = (String) list2.get(0);
                        Object obj2 = list2.get(1);
                        Q0.h.c(obj2, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.StringListLookupResultType");
                        break;
                    }
                } else {
                    break;
                }
                break;
        }
        return super.f(b2, byteBuffer);
    }

    @Override // w0.o
    public void k(w0.n nVar, Object obj) {
        switch (this.f143d) {
            case 1:
                if (!(obj instanceof P)) {
                    if (!(obj instanceof C0032j)) {
                        if (!(obj instanceof S)) {
                            super.k(nVar, obj);
                            break;
                        } else {
                            nVar.write(131);
                            S s2 = (S) obj;
                            k(nVar, G0.e.O(s2.f135a, s2.f136b));
                            break;
                        }
                    } else {
                        nVar.write(130);
                        C0032j c0032j = (C0032j) obj;
                        k(nVar, G0.e.O(c0032j.f157a, Boolean.valueOf(c0032j.f158b)));
                        break;
                    }
                } else {
                    nVar.write(129);
                    k(nVar, Integer.valueOf(((P) obj).f134e));
                    break;
                }
            default:
                super.k(nVar, obj);
                break;
        }
    }
}
