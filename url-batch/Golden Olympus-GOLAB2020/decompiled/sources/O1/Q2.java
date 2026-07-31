package O1;

import O1.AbstractC0851hc;
import O1.AbstractC0903kb;
import O1.AbstractC1094v5;
import O1.M2;
import O1.S2;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Q2 implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f4371a;

    public Q2(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f4371a = component;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public S2 deserialize(ParsingContext context, JSONObject data) {
        String a4;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        String readString = JsonPropertyParser.readString(context, data, "type");
        Intrinsics.checkNotNullExpressionValue(readString, "readString(context, data, \"type\")");
        EntityTemplate<?> entityTemplate = context.getTemplates().get(readString);
        S2 s22 = entityTemplate instanceof S2 ? (S2) entityTemplate : null;
        if (s22 != null && (a4 = s22.a()) != null) {
            readString = a4;
        }
        switch (readString.hashCode()) {
            case 113762:
                if (readString.equals("set")) {
                    return new S2.e(((M2.c) this.f4371a.u1().getValue()).deserialize(context, (N2) (s22 != null ? s22.b() : null), data));
                }
                break;
            case 3135100:
                if (readString.equals("fade")) {
                    return new S2.c(((AbstractC1094v5.d) this.f4371a.c3().getValue()).deserialize(context, (C1112w5) (s22 != null ? s22.b() : null), data));
                }
                break;
            case 109250890:
                if (readString.equals("scale")) {
                    return new S2.d(((AbstractC0903kb.d) this.f4371a.y6().getValue()).deserialize(context, (C0921lb) (s22 != null ? s22.b() : null), data));
                }
                break;
            case 109526449:
                if (readString.equals("slide")) {
                    return new S2.f(((AbstractC0851hc.e) this.f4371a.Z6().getValue()).deserialize(context, (C0869ic) (s22 != null ? s22.b() : null), data));
                }
                break;
        }
        throw ParsingExceptionKt.typeMismatch(data, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, S2 value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof S2.e) {
            return ((M2.c) this.f4371a.u1().getValue()).serialize(context, ((S2.e) value).c());
        }
        if (value instanceof S2.c) {
            return ((AbstractC1094v5.d) this.f4371a.c3().getValue()).serialize(context, ((S2.c) value).c());
        }
        if (value instanceof S2.d) {
            return ((AbstractC0903kb.d) this.f4371a.y6().getValue()).serialize(context, ((S2.d) value).c());
        }
        if (value instanceof S2.f) {
            return ((AbstractC0851hc.e) this.f4371a.Z6().getValue()).serialize(context, ((S2.f) value).c());
        }
        throw new W1.m();
    }
}
