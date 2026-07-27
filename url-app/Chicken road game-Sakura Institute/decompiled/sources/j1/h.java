package j1;

import androidx.datastore.preferences.protobuf.AbstractC0456v;
import androidx.datastore.preferences.protobuf.AbstractC0458x;
import androidx.datastore.preferences.protobuf.C0442g;
import androidx.datastore.preferences.protobuf.C0447l;
import androidx.datastore.preferences.protobuf.C0460z;
import androidx.datastore.preferences.protobuf.InterfaceC0457w;
import com.android.installreferrer.api.InstallReferrerClient;
import f1.C0609c;
import i1.i;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import l.AbstractC0784j;
import q.AbstractC1024c;
import y2.C1338m;
import z2.C1403G;
import z2.C1412P;
import z3.w;
import z3.x;
import z3.y;
import z3.z;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f7154a = new h();

    public final C0708b a(z zVar) {
        byte[] bArr;
        y input = new y(zVar);
        Intrinsics.checkNotNullParameter(input, "input");
        try {
            i1.e q2 = i1.e.q(input);
            Intrinsics.checkNotNullExpressionValue(q2, "{\n                Prefer…From(input)\n            }");
            e[] pairs = new e[0];
            Intrinsics.checkNotNullParameter(pairs, "pairs");
            C0708b c0708b = new C0708b(false);
            e[] pairs2 = (e[]) Arrays.copyOf(pairs, 0);
            Intrinsics.checkNotNullParameter(pairs2, "pairs");
            c0708b.b();
            if (pairs2.length > 0) {
                e eVar = pairs2[0];
                throw null;
            }
            Map o4 = q2.o();
            Intrinsics.checkNotNullExpressionValue(o4, "preferencesProto.preferencesMap");
            for (Map.Entry entry : o4.entrySet()) {
                String name = (String) entry.getKey();
                i value = (i) entry.getValue();
                Intrinsics.checkNotNullExpressionValue(name, "name");
                Intrinsics.checkNotNullExpressionValue(value, "value");
                int E3 = value.E();
                switch (E3 == 0 ? -1 : g.f7153a[AbstractC0784j.d(E3)]) {
                    case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                        throw new C0609c("Value case is null.");
                    case 0:
                    default:
                        throw new C1338m();
                    case 1:
                        Intrinsics.checkNotNullParameter(name, "name");
                        C0710d key = new C0710d(name);
                        Boolean valueOf = Boolean.valueOf(value.v());
                        Intrinsics.checkNotNullParameter(key, "key");
                        c0708b.c(key, valueOf);
                        break;
                    case 2:
                        Intrinsics.checkNotNullParameter(name, "name");
                        C0710d key2 = new C0710d(name);
                        Float valueOf2 = Float.valueOf(value.z());
                        Intrinsics.checkNotNullParameter(key2, "key");
                        c0708b.c(key2, valueOf2);
                        break;
                    case 3:
                        Intrinsics.checkNotNullParameter(name, "name");
                        C0710d key3 = new C0710d(name);
                        Double valueOf3 = Double.valueOf(value.y());
                        Intrinsics.checkNotNullParameter(key3, "key");
                        c0708b.c(key3, valueOf3);
                        break;
                    case 4:
                        Intrinsics.checkNotNullParameter(name, "name");
                        C0710d key4 = new C0710d(name);
                        Integer valueOf4 = Integer.valueOf(value.A());
                        Intrinsics.checkNotNullParameter(key4, "key");
                        c0708b.c(key4, valueOf4);
                        break;
                    case 5:
                        Intrinsics.checkNotNullParameter(name, "name");
                        C0710d key5 = new C0710d(name);
                        Long valueOf5 = Long.valueOf(value.B());
                        Intrinsics.checkNotNullParameter(key5, "key");
                        c0708b.c(key5, valueOf5);
                        break;
                    case 6:
                        Intrinsics.checkNotNullParameter(name, "name");
                        C0710d key6 = new C0710d(name);
                        String C3 = value.C();
                        Intrinsics.checkNotNullExpressionValue(C3, "value.string");
                        Intrinsics.checkNotNullParameter(key6, "key");
                        c0708b.c(key6, C3);
                        break;
                    case i.DOUBLE_FIELD_NUMBER /* 7 */:
                        Intrinsics.checkNotNullParameter(name, "name");
                        C0710d key7 = new C0710d(name);
                        InterfaceC0457w p4 = value.D().p();
                        Intrinsics.checkNotNullExpressionValue(p4, "value.stringSet.stringsList");
                        Set K3 = C1403G.K(p4);
                        Intrinsics.checkNotNullParameter(key7, "key");
                        c0708b.c(key7, K3);
                        break;
                    case i.BYTES_FIELD_NUMBER /* 8 */:
                        Intrinsics.checkNotNullParameter(name, "name");
                        C0710d key8 = new C0710d(name);
                        C0442g w4 = value.w();
                        int size = w4.size();
                        if (size == 0) {
                            bArr = AbstractC0458x.f5410b;
                        } else {
                            byte[] bArr2 = new byte[size];
                            w4.s(bArr2, size);
                            bArr = bArr2;
                        }
                        Intrinsics.checkNotNullExpressionValue(bArr, "value.bytes.toByteArray()");
                        Intrinsics.checkNotNullParameter(key8, "key");
                        c0708b.c(key8, bArr);
                        break;
                    case AbstractC1024c.f9242c /* 9 */:
                        throw new C0609c("Value not set.");
                }
            }
            return new C0708b(C1412P.j(c0708b.a()), true);
        } catch (C0460z e4) {
            Intrinsics.checkNotNullParameter("Unable to parse preferences proto.", "message");
            throw new C0609c("Unable to parse preferences proto.", e4);
        }
    }

    public final Unit b(Object obj, x xVar) {
        AbstractC0456v a4;
        Map a5 = ((C0708b) obj).a();
        i1.c p4 = i1.e.p();
        for (Map.Entry entry : a5.entrySet()) {
            C0710d c0710d = (C0710d) entry.getKey();
            Object value = entry.getValue();
            String str = c0710d.f7149a;
            if (value instanceof Boolean) {
                i1.h F3 = i.F();
                boolean booleanValue = ((Boolean) value).booleanValue();
                F3.c();
                i.s((i) F3.f5406e, booleanValue);
                a4 = F3.a();
                Intrinsics.checkNotNullExpressionValue(a4, "newBuilder().setBoolean(value).build()");
            } else if (value instanceof Float) {
                i1.h F4 = i.F();
                float floatValue = ((Number) value).floatValue();
                F4.c();
                i.t((i) F4.f5406e, floatValue);
                a4 = F4.a();
                Intrinsics.checkNotNullExpressionValue(a4, "newBuilder().setFloat(value).build()");
            } else if (value instanceof Double) {
                i1.h F5 = i.F();
                double doubleValue = ((Number) value).doubleValue();
                F5.c();
                i.q((i) F5.f5406e, doubleValue);
                a4 = F5.a();
                Intrinsics.checkNotNullExpressionValue(a4, "newBuilder().setDouble(value).build()");
            } else if (value instanceof Integer) {
                i1.h F6 = i.F();
                int intValue = ((Number) value).intValue();
                F6.c();
                i.u((i) F6.f5406e, intValue);
                a4 = F6.a();
                Intrinsics.checkNotNullExpressionValue(a4, "newBuilder().setInteger(value).build()");
            } else if (value instanceof Long) {
                i1.h F7 = i.F();
                long longValue = ((Number) value).longValue();
                F7.c();
                i.n((i) F7.f5406e, longValue);
                a4 = F7.a();
                Intrinsics.checkNotNullExpressionValue(a4, "newBuilder().setLong(value).build()");
            } else if (value instanceof String) {
                i1.h F8 = i.F();
                F8.c();
                i.o((i) F8.f5406e, (String) value);
                a4 = F8.a();
                Intrinsics.checkNotNullExpressionValue(a4, "newBuilder().setString(value).build()");
            } else if (value instanceof Set) {
                i1.h F9 = i.F();
                i1.f q2 = i1.g.q();
                Intrinsics.d(value, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                q2.c();
                i1.g.n((i1.g) q2.f5406e, (Set) value);
                F9.c();
                i.p((i) F9.f5406e, (i1.g) q2.a());
                a4 = F9.a();
                Intrinsics.checkNotNullExpressionValue(a4, "newBuilder().setStringSe…                ).build()");
            } else {
                if (!(value instanceof byte[])) {
                    throw new IllegalStateException("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
                }
                i1.h F10 = i.F();
                byte[] bArr = (byte[]) value;
                C0442g c0442g = C0442g.f5338i;
                C0442g j4 = C0442g.j(bArr, 0, bArr.length);
                F10.c();
                i.r((i) F10.f5406e, j4);
                a4 = F10.a();
                Intrinsics.checkNotNullExpressionValue(a4, "newBuilder().setBytes(By….copyFrom(value)).build()");
            }
            p4.getClass();
            str.getClass();
            p4.c();
            i1.e.n((i1.e) p4.f5406e).put(str, (i) a4);
        }
        i1.e eVar = (i1.e) p4.a();
        w wVar = new w(xVar);
        int a6 = eVar.a(null);
        Logger logger = C0447l.f5371h;
        if (a6 > 4096) {
            a6 = 4096;
        }
        C0447l c0447l = new C0447l(wVar, a6);
        eVar.b(c0447l);
        if (c0447l.f5376f > 0) {
            c0447l.I();
        }
        return Unit.f7487a;
    }
}
