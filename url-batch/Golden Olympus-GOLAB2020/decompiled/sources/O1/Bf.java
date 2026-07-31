package O1;

import O1.Df;
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
public final class Bf implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f1548a;

    public Bf(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f1548a = component;
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
    public Df deserialize(ParsingContext context, JSONObject data) {
        String a4;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        String readString = JsonPropertyParser.readString(context, data, "type");
        Intrinsics.checkNotNullExpressionValue(readString, "readString(context, data, \"type\")");
        EntityTemplate<?> entityTemplate = context.getTemplates().get(readString);
        Df df = entityTemplate instanceof Df ? (Df) entityTemplate : null;
        if (df != null && (a4 = df.a()) != null) {
            readString = a4;
        }
        switch (readString.hashCode()) {
            case -1034364087:
                if (readString.equals("number")) {
                    return new Df.h(((Kg) this.f1548a.P9().getValue()).deserialize(context, (Mg) (df != null ? df.b() : null), data));
                }
                break;
            case -891985903:
                if (readString.equals("string")) {
                    return new Df.i(((eh) this.f1548a.ba().getValue()).deserialize(context, (gh) (df != null ? df.b() : null), data));
                }
                break;
            case 116079:
                if (readString.equals("url")) {
                    return new Df.j(((oh) this.f1548a.ha().getValue()).deserialize(context, (qh) (df != null ? df.b() : null), data));
                }
                break;
            case 3083190:
                if (readString.equals("dict")) {
                    return new Df.f(((W) this.f1548a.C().getValue()).deserialize(context, (Y) (df != null ? df.b() : null), data));
                }
                break;
            case 64711720:
                if (readString.equals("boolean")) {
                    return new Df.b(((r) this.f1548a.k().getValue()).deserialize(context, (C1052t) (df != null ? df.b() : null), data));
                }
                break;
            case 93090393:
                if (readString.equals("array")) {
                    return new Df.a(((C0838h) this.f1548a.e().getValue()).deserialize(context, (C0873j) (df != null ? df.b() : null), data));
                }
                break;
            case 94842723:
                if (readString.equals(b9.h.f15459S)) {
                    return new Df.c(((B) this.f1548a.q().getValue()).deserialize(context, (D) (df != null ? df.b() : null), data));
                }
                break;
            case 1958052158:
                if (readString.equals("integer")) {
                    return new Df.g(((C1177zg) this.f1548a.J9().getValue()).deserialize(context, (Bg) (df != null ? df.b() : null), data));
                }
                break;
        }
        throw ParsingExceptionKt.typeMismatch(data, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, Df value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof Df.i) {
            return ((eh) this.f1548a.ba().getValue()).serialize(context, ((Df.i) value).c());
        }
        if (value instanceof Df.h) {
            return ((Kg) this.f1548a.P9().getValue()).serialize(context, ((Df.h) value).c());
        }
        if (value instanceof Df.g) {
            return ((C1177zg) this.f1548a.J9().getValue()).serialize(context, ((Df.g) value).c());
        }
        if (value instanceof Df.b) {
            return ((r) this.f1548a.k().getValue()).serialize(context, ((Df.b) value).c());
        }
        if (value instanceof Df.c) {
            return ((B) this.f1548a.q().getValue()).serialize(context, ((Df.c) value).c());
        }
        if (value instanceof Df.j) {
            return ((oh) this.f1548a.ha().getValue()).serialize(context, ((Df.j) value).c());
        }
        if (value instanceof Df.f) {
            return ((W) this.f1548a.C().getValue()).serialize(context, ((Df.f) value).c());
        }
        if (value instanceof Df.a) {
            return ((C0838h) this.f1548a.e().getValue()).serialize(context, ((Df.a) value).c());
        }
        throw new W1.m();
    }
}
