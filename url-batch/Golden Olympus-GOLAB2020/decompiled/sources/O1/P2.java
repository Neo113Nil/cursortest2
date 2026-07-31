package O1;

import O1.AbstractC0851hc;
import O1.AbstractC0903kb;
import O1.AbstractC1094v5;
import O1.M2;
import O1.O2;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class P2 implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f4299a;

    public P2(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f4299a = component;
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
    public O2 deserialize(ParsingContext context, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        String readString = JsonPropertyParser.readString(context, data, "type");
        Intrinsics.checkNotNullExpressionValue(readString, "readString(context, data, \"type\")");
        switch (readString.hashCode()) {
            case 113762:
                if (readString.equals("set")) {
                    return new O2.e(((M2.b) this.f4299a.t1().getValue()).deserialize(context, data));
                }
                break;
            case 3135100:
                if (readString.equals("fade")) {
                    return new O2.c(((AbstractC1094v5.c) this.f4299a.b3().getValue()).deserialize(context, data));
                }
                break;
            case 109250890:
                if (readString.equals("scale")) {
                    return new O2.d(((AbstractC0903kb.c) this.f4299a.x6().getValue()).deserialize(context, data));
                }
                break;
            case 109526449:
                if (readString.equals("slide")) {
                    return new O2.f(((AbstractC0851hc.d) this.f4299a.Y6().getValue()).deserialize(context, data));
                }
                break;
        }
        EntityTemplate<?> orThrow = context.getTemplates().getOrThrow(readString, data);
        S2 s22 = orThrow instanceof S2 ? (S2) orThrow : null;
        if (s22 != null) {
            return ((R2) this.f4299a.y1().getValue()).resolve(context, s22, data);
        }
        throw ParsingExceptionKt.typeMismatch(data, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, O2 value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof O2.e) {
            return ((M2.b) this.f4299a.t1().getValue()).serialize(context, ((O2.e) value).c());
        }
        if (value instanceof O2.c) {
            return ((AbstractC1094v5.c) this.f4299a.b3().getValue()).serialize(context, ((O2.c) value).c());
        }
        if (value instanceof O2.d) {
            return ((AbstractC0903kb.c) this.f4299a.x6().getValue()).serialize(context, ((O2.d) value).c());
        }
        if (value instanceof O2.f) {
            return ((AbstractC0851hc.d) this.f4299a.Y6().getValue()).serialize(context, ((O2.f) value).c());
        }
        throw new W1.m();
    }
}
