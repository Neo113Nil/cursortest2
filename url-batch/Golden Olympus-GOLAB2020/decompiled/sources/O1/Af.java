package O1;

import O1.AbstractC1176zf;
import com.ironsource.b9;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Af implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f1436a;

    public Af(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f1436a = component;
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
    public AbstractC1176zf deserialize(ParsingContext context, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        String readString = JsonPropertyParser.readString(context, data, "type");
        Intrinsics.checkNotNullExpressionValue(readString, "readString(context, data, \"type\")");
        switch (readString.hashCode()) {
            case -1034364087:
                if (readString.equals("number")) {
                    return new AbstractC1176zf.h(((Jg) this.f1436a.O9().getValue()).deserialize(context, data));
                }
                break;
            case -891985903:
                if (readString.equals("string")) {
                    return new AbstractC1176zf.i(((dh) this.f1436a.aa().getValue()).deserialize(context, data));
                }
                break;
            case 116079:
                if (readString.equals("url")) {
                    return new AbstractC1176zf.j(((nh) this.f1436a.ga().getValue()).deserialize(context, data));
                }
                break;
            case 3083190:
                if (readString.equals("dict")) {
                    return new AbstractC1176zf.f(((V) this.f1436a.B().getValue()).deserialize(context, data));
                }
                break;
            case 64711720:
                if (readString.equals("boolean")) {
                    return new AbstractC1176zf.b(((C0999q) this.f1436a.j().getValue()).deserialize(context, data));
                }
                break;
            case 93090393:
                if (readString.equals("array")) {
                    return new AbstractC1176zf.a(((C0820g) this.f1436a.d().getValue()).deserialize(context, data));
                }
                break;
            case 94842723:
                if (readString.equals(b9.h.f15459S)) {
                    return new AbstractC1176zf.c(((A) this.f1436a.p().getValue()).deserialize(context, data));
                }
                break;
            case 1958052158:
                if (readString.equals("integer")) {
                    return new AbstractC1176zf.g(((C1159yg) this.f1436a.I9().getValue()).deserialize(context, data));
                }
                break;
        }
        EntityTemplate<?> orThrow = context.getTemplates().getOrThrow(readString, data);
        Df df = orThrow instanceof Df ? (Df) orThrow : null;
        if (df != null) {
            return ((Cf) this.f1436a.g9().getValue()).resolve(context, df, data);
        }
        throw ParsingExceptionKt.typeMismatch(data, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, AbstractC1176zf value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof AbstractC1176zf.i) {
            return ((dh) this.f1436a.aa().getValue()).serialize(context, ((AbstractC1176zf.i) value).c());
        }
        if (value instanceof AbstractC1176zf.h) {
            return ((Jg) this.f1436a.O9().getValue()).serialize(context, ((AbstractC1176zf.h) value).c());
        }
        if (value instanceof AbstractC1176zf.g) {
            return ((C1159yg) this.f1436a.I9().getValue()).serialize(context, ((AbstractC1176zf.g) value).c());
        }
        if (value instanceof AbstractC1176zf.b) {
            return ((C0999q) this.f1436a.j().getValue()).serialize(context, ((AbstractC1176zf.b) value).c());
        }
        if (value instanceof AbstractC1176zf.c) {
            return ((A) this.f1436a.p().getValue()).serialize(context, ((AbstractC1176zf.c) value).c());
        }
        if (value instanceof AbstractC1176zf.j) {
            return ((nh) this.f1436a.ga().getValue()).serialize(context, ((AbstractC1176zf.j) value).c());
        }
        if (value instanceof AbstractC1176zf.f) {
            return ((V) this.f1436a.B().getValue()).serialize(context, ((AbstractC1176zf.f) value).c());
        }
        if (value instanceof AbstractC1176zf.a) {
            return ((C0820g) this.f1436a.d().getValue()).serialize(context, ((AbstractC1176zf.a) value).c());
        }
        throw new W1.m();
    }
}
