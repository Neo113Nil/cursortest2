package b8;

import java.util.Map;

/* loaded from: classes2.dex */
public final class o extends kotlin.jvm.internal.i implements E7.l {

    /* renamed from: u, reason: collision with root package name */
    public static final o f5614u = new o(1, 0);

    /* renamed from: v, reason: collision with root package name */
    public static final o f5615v = new o(1, 1);

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f5616n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i, int i4) {
        super(i);
        this.f5616n = i4;
    }

    @Override // E7.l
    public final Object invoke(Object obj) {
        switch (this.f5616n) {
            case 0:
                Y7.a buildSerialDescriptor = (Y7.a) obj;
                kotlin.jvm.internal.h.e(buildSerialDescriptor, "$this$buildSerialDescriptor");
                Y7.a.a(buildSerialDescriptor, "JsonPrimitive", new q(n.f5607u));
                Y7.a.a(buildSerialDescriptor, "JsonNull", new q(n.f5608v));
                Y7.a.a(buildSerialDescriptor, "JsonLiteral", new q(n.f5609w));
                Y7.a.a(buildSerialDescriptor, "JsonObject", new q(n.f5610x));
                Y7.a.a(buildSerialDescriptor, "JsonArray", new q(n.f5611y));
                return q7.v.f40183a;
            default:
                Map.Entry entry = (Map.Entry) obj;
                kotlin.jvm.internal.h.e(entry, "<name for destructuring parameter 0>");
                String str = (String) entry.getKey();
                l lVar = (l) entry.getValue();
                StringBuilder sb = new StringBuilder();
                c8.t.a(sb, str);
                sb.append(':');
                sb.append(lVar);
                String sb2 = sb.toString();
                kotlin.jvm.internal.h.d(sb2, "toString(...)");
                return sb2;
        }
    }
}
