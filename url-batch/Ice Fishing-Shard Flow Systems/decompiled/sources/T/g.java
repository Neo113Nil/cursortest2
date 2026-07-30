package T;

import P.C0137b;
import P.o0;
import R5.k;
import S.i;
import S.j;
import a.AbstractC0169a;
import androidx.datastore.preferences.protobuf.AbstractC0205v;
import androidx.datastore.preferences.protobuf.AbstractC0207x;
import androidx.datastore.preferences.protobuf.C0191g;
import androidx.datastore.preferences.protobuf.C0196l;
import androidx.datastore.preferences.protobuf.C0209z;
import androidx.datastore.preferences.protobuf.InterfaceC0206w;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.I;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f2557a = new g();

    public final b a(FileInputStream input) {
        byte[] bArr;
        Intrinsics.checkNotNullParameter(input, "input");
        try {
            S.e o7 = S.e.o(input);
            Intrinsics.checkNotNullExpressionValue(o7, "{\n                Prefer…From(input)\n            }");
            e[] pairs = new e[0];
            Intrinsics.checkNotNullParameter(pairs, "pairs");
            b bVar = new b(false);
            e[] pairs2 = (e[]) Arrays.copyOf(pairs, 0);
            Intrinsics.checkNotNullParameter(pairs2, "pairs");
            bVar.b();
            if (pairs2.length > 0) {
                e eVar = pairs2[0];
                throw null;
            }
            Map m2 = o7.m();
            Intrinsics.checkNotNullExpressionValue(m2, "preferencesProto.preferencesMap");
            for (Map.Entry entry : m2.entrySet()) {
                String name = (String) entry.getKey();
                j value = (j) entry.getValue();
                Intrinsics.checkNotNullExpressionValue(name, "name");
                Intrinsics.checkNotNullExpressionValue(value, "value");
                int C7 = value.C();
                switch (C7 == 0 ? -1 : f.f2556a[i.b(C7)]) {
                    case -1:
                        throw new C0137b("Value case is null.", 0);
                    case 0:
                    default:
                        throw new k();
                    case 1:
                        d key = AbstractC0169a.a(name);
                        Boolean valueOf = Boolean.valueOf(value.t());
                        Intrinsics.checkNotNullParameter(key, "key");
                        bVar.f(key, valueOf);
                        break;
                    case 2:
                        Intrinsics.checkNotNullParameter(name, "name");
                        d key2 = new d(name);
                        Float valueOf2 = Float.valueOf(value.x());
                        Intrinsics.checkNotNullParameter(key2, "key");
                        bVar.f(key2, valueOf2);
                        break;
                    case 3:
                        Intrinsics.checkNotNullParameter(name, "name");
                        d key3 = new d(name);
                        Double valueOf3 = Double.valueOf(value.w());
                        Intrinsics.checkNotNullParameter(key3, "key");
                        bVar.f(key3, valueOf3);
                        break;
                    case 4:
                        Intrinsics.checkNotNullParameter(name, "name");
                        d key4 = new d(name);
                        Integer valueOf4 = Integer.valueOf(value.y());
                        Intrinsics.checkNotNullParameter(key4, "key");
                        bVar.f(key4, valueOf4);
                        break;
                    case 5:
                        d key5 = AbstractC0169a.q(name);
                        Long valueOf5 = Long.valueOf(value.z());
                        Intrinsics.checkNotNullParameter(key5, "key");
                        bVar.f(key5, valueOf5);
                        break;
                    case 6:
                        d key6 = AbstractC0169a.E(name);
                        String A7 = value.A();
                        Intrinsics.checkNotNullExpressionValue(A7, "value.string");
                        Intrinsics.checkNotNullParameter(key6, "key");
                        bVar.f(key6, A7);
                        break;
                    case j.DOUBLE_FIELD_NUMBER /* 7 */:
                        d key7 = AbstractC0169a.F(name);
                        InterfaceC0206w n7 = value.B().n();
                        Intrinsics.checkNotNullExpressionValue(n7, "value.stringSet.stringsList");
                        Set C8 = CollectionsKt.C(n7);
                        Intrinsics.checkNotNullParameter(key7, "key");
                        bVar.f(key7, C8);
                        break;
                    case j.BYTES_FIELD_NUMBER /* 8 */:
                        Intrinsics.checkNotNullParameter(name, "name");
                        d key8 = new d(name);
                        C0191g u7 = value.u();
                        int size = u7.size();
                        if (size == 0) {
                            bArr = AbstractC0207x.f3572b;
                        } else {
                            byte[] bArr2 = new byte[size];
                            u7.d(bArr2, size);
                            bArr = bArr2;
                        }
                        Intrinsics.checkNotNullExpressionValue(bArr, "value.bytes.toByteArray()");
                        Intrinsics.checkNotNullParameter(key8, "key");
                        bVar.f(key8, bArr);
                        break;
                    case 9:
                        throw new C0137b("Value not set.", 0);
                }
            }
            return new b(I.j(bVar.a()), true);
        } catch (C0209z e7) {
            Intrinsics.checkNotNullParameter("Unable to parse preferences proto.", "message");
            throw new C0137b("Unable to parse preferences proto.", e7);
        }
    }

    public final Unit b(Object obj, o0 o0Var) {
        AbstractC0205v a7;
        Map a8 = ((b) obj).a();
        S.c n7 = S.e.n();
        for (Map.Entry entry : a8.entrySet()) {
            d dVar = (d) entry.getKey();
            Object value = entry.getValue();
            String str = dVar.f2555a;
            if (value instanceof Boolean) {
                S.h D7 = j.D();
                boolean booleanValue = ((Boolean) value).booleanValue();
                D7.c();
                j.q((j) D7.f3570e, booleanValue);
                a7 = D7.a();
                Intrinsics.checkNotNullExpressionValue(a7, "newBuilder().setBoolean(value).build()");
            } else if (value instanceof Float) {
                S.h D8 = j.D();
                float floatValue = ((Number) value).floatValue();
                D8.c();
                j.r((j) D8.f3570e, floatValue);
                a7 = D8.a();
                Intrinsics.checkNotNullExpressionValue(a7, "newBuilder().setFloat(value).build()");
            } else if (value instanceof Double) {
                S.h D9 = j.D();
                double doubleValue = ((Number) value).doubleValue();
                D9.c();
                j.o((j) D9.f3570e, doubleValue);
                a7 = D9.a();
                Intrinsics.checkNotNullExpressionValue(a7, "newBuilder().setDouble(value).build()");
            } else if (value instanceof Integer) {
                S.h D10 = j.D();
                int intValue = ((Number) value).intValue();
                D10.c();
                j.s((j) D10.f3570e, intValue);
                a7 = D10.a();
                Intrinsics.checkNotNullExpressionValue(a7, "newBuilder().setInteger(value).build()");
            } else if (value instanceof Long) {
                S.h D11 = j.D();
                long longValue = ((Number) value).longValue();
                D11.c();
                j.l((j) D11.f3570e, longValue);
                a7 = D11.a();
                Intrinsics.checkNotNullExpressionValue(a7, "newBuilder().setLong(value).build()");
            } else if (value instanceof String) {
                S.h D12 = j.D();
                D12.c();
                j.m((j) D12.f3570e, (String) value);
                a7 = D12.a();
                Intrinsics.checkNotNullExpressionValue(a7, "newBuilder().setString(value).build()");
            } else if (value instanceof Set) {
                S.h D13 = j.D();
                S.f o7 = S.g.o();
                Intrinsics.c(value, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                o7.c();
                S.g.l((S.g) o7.f3570e, (Set) value);
                D13.c();
                j.n((j) D13.f3570e, (S.g) o7.a());
                a7 = D13.a();
                Intrinsics.checkNotNullExpressionValue(a7, "newBuilder()\n           …                 .build()");
            } else {
                if (!(value instanceof byte[])) {
                    throw new IllegalStateException("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
                }
                S.h D14 = j.D();
                byte[] bArr = (byte[]) value;
                C0191g c0191g = C0191g.f3498i;
                C0191g c7 = C0191g.c(bArr, 0, bArr.length);
                D14.c();
                j.p((j) D14.f3570e, c7);
                a7 = D14.a();
                Intrinsics.checkNotNullExpressionValue(a7, "newBuilder().setBytes(By….copyFrom(value)).build()");
            }
            n7.getClass();
            str.getClass();
            n7.c();
            S.e.l((S.e) n7.f3570e).put(str, (j) a7);
        }
        S.e eVar = (S.e) n7.a();
        int a9 = eVar.a(null);
        Logger logger = C0196l.f3529h;
        if (a9 > 4096) {
            a9 = 4096;
        }
        C0196l c0196l = new C0196l(o0Var, a9);
        eVar.b(c0196l);
        if (c0196l.f3534f > 0) {
            c0196l.d0();
        }
        return Unit.f6114a;
    }
}
