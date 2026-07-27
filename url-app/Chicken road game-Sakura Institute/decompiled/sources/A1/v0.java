package A1;

import W2.AbstractC0298u;
import com.appsflyer.attribution.RequestError;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import q.AbstractC1024c;
import z1.AbstractC1359C;
import z1.AbstractC1366J;
import z1.C1367K;
import z2.C1403G;

/* loaded from: classes.dex */
public final /* synthetic */ class v0 implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f745d;

    public /* synthetic */ v0(int i2) {
        this.f745d = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CharSequence string$lambda$1;
        switch (this.f745d) {
            case 0:
                r.g LazyColumn = (r.g) obj;
                Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                Q.v vVar = AbstractC1366J.f11823i;
                LazyColumn.b(vVar.size(), new C0055f0(vVar, 1), new O.a(-632812321, true, new C0(vVar, 0)));
                return Unit.f7487a;
            case 1:
                r.g LazyColumn2 = (r.g) obj;
                Intrinsics.checkNotNullParameter(LazyColumn2, "$this$LazyColumn");
                Q.v vVar2 = AbstractC1366J.f11819e;
                LazyColumn2.b(vVar2.size(), new C0055f0(vVar2, 4), new O.a(-632812321, true, new C0(vVar2, 1)));
                return Unit.f7487a;
            case 2:
                r.g LazyColumn3 = (r.g) obj;
                Intrinsics.checkNotNullParameter(LazyColumn3, "$this$LazyColumn");
                Q.v vVar3 = AbstractC1366J.f11822h;
                LazyColumn3.b(vVar3.size(), new C0055f0(vVar3, 5), new O.a(-632812321, true, new C0(vVar3, 2)));
                return Unit.f7487a;
            case 3:
                r.g LazyColumn4 = (r.g) obj;
                Intrinsics.checkNotNullParameter(LazyColumn4, "$this$LazyColumn");
                List list = N0.f513a;
                LazyColumn4.b(list.size(), new W(3, list), new O.a(-632812321, true, new C0067l0(1, list)));
                r.g.a(LazyColumn4, B.f431b);
                return Unit.f7487a;
            case 4:
                j3.h Json = (j3.h) obj;
                Intrinsics.checkNotNullParameter(Json, "$this$Json");
                Json.f7183c = true;
                Json.f7184d = true;
                return Unit.f7487a;
            case 5:
                Byte b4 = (Byte) obj;
                b4.byteValue();
                String format = String.format("%02x", Arrays.copyOf(new Object[]{b4}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                return format;
            case 6:
                CoroutineContext.Element element = (CoroutineContext.Element) obj;
                if (element instanceof AbstractC0298u) {
                    return (AbstractC0298u) element;
                }
                return null;
            case i1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                CoroutineContext.Element element2 = (CoroutineContext.Element) obj;
                if (element2 instanceof W2.V) {
                    return (W2.V) element2;
                }
                return null;
            case i1.i.BYTES_FIELD_NUMBER /* 8 */:
                Intrinsics.checkNotNullParameter((g3.a) obj, "<this>");
                return Unit.f7487a;
            case AbstractC1024c.f9242c /* 9 */:
                g3.a buildSerialDescriptor = (g3.a) obj;
                Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
                g3.a.a(buildSerialDescriptor, "JsonPrimitive", new j3.p(new K(2)));
                g3.a.a(buildSerialDescriptor, "JsonNull", new j3.p(new K(3)));
                g3.a.a(buildSerialDescriptor, "JsonLiteral", new j3.p(new K(4)));
                g3.a.a(buildSerialDescriptor, "JsonObject", new j3.p(new K(5)));
                g3.a.a(buildSerialDescriptor, "JsonArray", new j3.p(new K(6)));
                return Unit.f7487a;
            case 10:
                string$lambda$1 = j3.x.toString$lambda$1((Map.Entry) obj);
                return string$lambda$1;
            case RequestError.STOP_TRACKING /* 11 */:
                s1.F navigate = (s1.F) obj;
                Intrinsics.checkNotNullParameter(navigate, "$this$navigate");
                String route = ((C1367K) C1403G.q(AbstractC1359C.f11785a)).f11827a;
                v0 popUpToBuilder = new v0(12);
                navigate.getClass();
                Intrinsics.checkNotNullParameter(route, "route");
                Intrinsics.checkNotNullParameter(popUpToBuilder, "popUpToBuilder");
                if (kotlin.text.y.x(route)) {
                    throw new IllegalArgumentException("Cannot pop up to an empty route");
                }
                navigate.f10482e = route;
                navigate.f10481d = -1;
                s1.J j4 = new s1.J();
                popUpToBuilder.invoke(j4);
                navigate.f10483f = j4.f10488a;
                navigate.f10479b = true;
                navigate.f10480c = true;
                return Unit.f7487a;
            default:
                s1.J popUpTo = (s1.J) obj;
                Intrinsics.checkNotNullParameter(popUpTo, "$this$popUpTo");
                popUpTo.f10488a = true;
                return Unit.f7487a;
        }
    }
}
