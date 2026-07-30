package A6;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o extends kotlin.jvm.internal.p implements Function1 {

    /* renamed from: e, reason: collision with root package name */
    public static final o f128e;

    /* renamed from: i, reason: collision with root package name */
    public static final o f129i;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f130d;

    static {
        int i2 = 1;
        f128e = new o(i2, 0);
        f129i = new o(i2, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i2, int i5) {
        super(i2);
        this.f130d = i5;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f130d) {
            case 0:
                x6.a buildSerialDescriptor = (x6.a) obj;
                Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
                x6.a.a(buildSerialDescriptor, "JsonPrimitive", new q(n.f121e));
                x6.a.a(buildSerialDescriptor, "JsonNull", new q(n.f122i));
                x6.a.a(buildSerialDescriptor, "JsonLiteral", new q(n.f123l));
                x6.a.a(buildSerialDescriptor, "JsonObject", new q(n.f124m));
                x6.a.a(buildSerialDescriptor, "JsonArray", new q(n.f125n));
                return Unit.f6114a;
            default:
                Map.Entry entry = (Map.Entry) obj;
                Intrinsics.checkNotNullParameter(entry, "<name for destructuring parameter 0>");
                String str = (String) entry.getKey();
                l lVar = (l) entry.getValue();
                StringBuilder sb = new StringBuilder();
                B6.w.a(sb, str);
                sb.append(':');
                sb.append(lVar);
                String sb2 = sb.toString();
                Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
                return sb2;
        }
    }
}
