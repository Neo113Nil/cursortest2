package y4;

import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import z4.C1059a;

/* renamed from: y4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1033b extends s4.v {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8581d;

    public /* synthetic */ C1033b(int i2) {
        this.f8581d = i2;
    }

    @Override // s4.v
    public final Object f(byte b7, ByteBuffer buffer) {
        switch (this.f8581d) {
            case 0:
                Intrinsics.checkNotNullParameter(buffer, "buffer");
                if (b7 == -127) {
                    Long l7 = (Long) e(buffer);
                    if (l7 != null) {
                        int longValue = (int) l7.longValue();
                        M.f8571e.getClass();
                        M[] values = M.values();
                        int length = values.length;
                        for (int i2 = 0; i2 < length; i2++) {
                            M m2 = values[i2];
                            if (m2.f8576d == longValue) {
                                break;
                            }
                        }
                        break;
                    }
                } else if (b7 == -126) {
                    Object e7 = e(buffer);
                    List pigeonVar_list = e7 instanceof List ? (List) e7 : null;
                    if (pigeonVar_list != null) {
                        Intrinsics.checkNotNullParameter(pigeonVar_list, "pigeonVar_list");
                        String str = (String) pigeonVar_list.get(0);
                        Object obj = pigeonVar_list.get(1);
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Boolean");
                        break;
                    }
                } else if (b7 == -125) {
                    Object e8 = e(buffer);
                    List pigeonVar_list2 = e8 instanceof List ? (List) e8 : null;
                    if (pigeonVar_list2 != null) {
                        Intrinsics.checkNotNullParameter(pigeonVar_list2, "pigeonVar_list");
                        String str2 = (String) pigeonVar_list2.get(0);
                        Object obj2 = pigeonVar_list2.get(1);
                        Intrinsics.c(obj2, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.StringListLookupResultType");
                        break;
                    }
                } else {
                    break;
                }
                break;
            case 1:
                Intrinsics.checkNotNullParameter(buffer, "buffer");
                break;
            default:
                Intrinsics.checkNotNullParameter(buffer, "buffer");
                if (b7 == -127) {
                    Object e9 = e(buffer);
                    List pigeonVar_list3 = e9 instanceof List ? (List) e9 : null;
                    if (pigeonVar_list3 != null) {
                        Intrinsics.checkNotNullParameter(pigeonVar_list3, "pigeonVar_list");
                        Object obj3 = pigeonVar_list3.get(0);
                        Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                        boolean booleanValue = ((Boolean) obj3).booleanValue();
                        Object obj4 = pigeonVar_list3.get(1);
                        Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                        boolean booleanValue2 = ((Boolean) obj4).booleanValue();
                        Object obj5 = pigeonVar_list3.get(2);
                        Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                        break;
                    }
                } else if (b7 == -126) {
                    Object e10 = e(buffer);
                    List pigeonVar_list4 = e10 instanceof List ? (List) e10 : null;
                    if (pigeonVar_list4 != null) {
                        Intrinsics.checkNotNullParameter(pigeonVar_list4, "pigeonVar_list");
                        Object obj6 = pigeonVar_list4.get(0);
                        Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                        break;
                    }
                } else {
                    break;
                }
                break;
        }
        return super.f(b7, buffer);
    }

    @Override // s4.v
    public final void k(s4.u stream, Object obj) {
        switch (this.f8581d) {
            case 0:
                Intrinsics.checkNotNullParameter(stream, "stream");
                if (!(obj instanceof M)) {
                    if (!(obj instanceof C1040i)) {
                        if (!(obj instanceof O)) {
                            super.k(stream, obj);
                            break;
                        } else {
                            stream.write(131);
                            O o7 = (O) obj;
                            k(stream, kotlin.collections.r.d(o7.f8577a, o7.f8578b));
                            break;
                        }
                    } else {
                        stream.write(130);
                        C1040i c1040i = (C1040i) obj;
                        k(stream, kotlin.collections.r.d(c1040i.f8591a, Boolean.valueOf(c1040i.f8592b)));
                        break;
                    }
                } else {
                    stream.write(129);
                    k(stream, Long.valueOf(((M) obj).f8576d));
                    break;
                }
            case 1:
                Intrinsics.checkNotNullParameter(stream, "stream");
                super.k(stream, obj);
                break;
            default:
                Intrinsics.checkNotNullParameter(stream, "stream");
                if (!(obj instanceof z4.j)) {
                    if (!(obj instanceof C1059a)) {
                        super.k(stream, obj);
                        break;
                    } else {
                        stream.write(130);
                        k(stream, kotlin.collections.q.b(Boolean.valueOf(((C1059a) obj).f8716a)));
                        break;
                    }
                } else {
                    stream.write(129);
                    z4.j jVar = (z4.j) obj;
                    k(stream, kotlin.collections.r.d(Boolean.valueOf(jVar.f8727a), Boolean.valueOf(jVar.f8728b), jVar.f8729c));
                    break;
                }
        }
    }
}
