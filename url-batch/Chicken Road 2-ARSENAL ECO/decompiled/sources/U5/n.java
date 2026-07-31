package U5;

import java.util.Map;
import x5.InterfaceC0743l;

/* loaded from: classes.dex */
public final class n extends kotlin.jvm.internal.j implements InterfaceC0743l {

    /* renamed from: g, reason: collision with root package name */
    public static final n f2659g;

    /* renamed from: h, reason: collision with root package name */
    public static final n f2660h;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2661f;

    static {
        int i7 = 1;
        f2659g = new n(i7, 0);
        f2660h = new n(i7, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(int i7, int i8) {
        super(i7);
        this.f2661f = i8;
    }

    @Override // x5.InterfaceC0743l
    public final Object invoke(Object obj) {
        switch (this.f2661f) {
            case 0:
                R5.a buildSerialDescriptor = (R5.a) obj;
                kotlin.jvm.internal.i.e(buildSerialDescriptor, "$this$buildSerialDescriptor");
                R5.a.a(buildSerialDescriptor, "JsonPrimitive", new p(m.f2652g));
                R5.a.a(buildSerialDescriptor, "JsonNull", new p(m.f2653h));
                R5.a.a(buildSerialDescriptor, "JsonLiteral", new p(m.f2654i));
                R5.a.a(buildSerialDescriptor, "JsonObject", new p(m.f2655j));
                R5.a.a(buildSerialDescriptor, "JsonArray", new p(m.f2656k));
                return k5.v.f5219a;
            default:
                Map.Entry entry = (Map.Entry) obj;
                kotlin.jvm.internal.i.e(entry, "<name for destructuring parameter 0>");
                String str = (String) entry.getKey();
                k kVar = (k) entry.getValue();
                StringBuilder sb = new StringBuilder();
                V5.v.a(sb, str);
                sb.append(':');
                sb.append(kVar);
                String sb2 = sb.toString();
                kotlin.jvm.internal.i.d(sb2, "toString(...)");
                return sb2;
        }
    }
}
