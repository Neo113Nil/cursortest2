package O1;

import O1.AbstractC1086uf;
import com.ironsource.b9;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.vf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1104vf implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f8293a;

    public C1104vf(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f8293a = component;
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
    public AbstractC1086uf deserialize(ParsingContext context, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        String readString = JsonPropertyParser.readString(context, data, "type");
        Intrinsics.checkNotNullExpressionValue(readString, "readString(context, data, \"type\")");
        switch (readString.hashCode()) {
            case -1034364087:
                if (readString.equals("number")) {
                    return new AbstractC1086uf.h(((Eg) this.f8293a.L9().getValue()).deserialize(context, data));
                }
                break;
            case -891985903:
                if (readString.equals("string")) {
                    return new AbstractC1086uf.i(((Yg) this.f8293a.X9().getValue()).deserialize(context, data));
                }
                break;
            case 116079:
                if (readString.equals("url")) {
                    return new AbstractC1086uf.j(((ih) this.f8293a.da().getValue()).deserialize(context, data));
                }
                break;
            case 3083190:
                if (readString.equals("dict")) {
                    return new AbstractC1086uf.f(((P) this.f8293a.y().getValue()).deserialize(context, data));
                }
                break;
            case 64711720:
                if (readString.equals("boolean")) {
                    return new AbstractC1086uf.b(((C0909l) this.f8293a.g().getValue()).deserialize(context, data));
                }
                break;
            case 93090393:
                if (readString.equals("array")) {
                    return new AbstractC1086uf.a(((C0730b) this.f8293a.a().getValue()).deserialize(context, data));
                }
                break;
            case 94842723:
                if (readString.equals(b9.h.f15459S)) {
                    return new AbstractC1086uf.c(((C1088v) this.f8293a.m().getValue()).deserialize(context, data));
                }
                break;
            case 1958052158:
                if (readString.equals("integer")) {
                    return new AbstractC1086uf.g(((C1069tg) this.f8293a.F9().getValue()).deserialize(context, data));
                }
                break;
        }
        EntityTemplate<?> orThrow = context.getTemplates().getOrThrow(readString, data);
        AbstractC1158yf abstractC1158yf = orThrow instanceof AbstractC1158yf ? (AbstractC1158yf) orThrow : null;
        if (abstractC1158yf != null) {
            return ((C1140xf) this.f8293a.d9().getValue()).resolve(context, abstractC1158yf, data);
        }
        throw ParsingExceptionKt.typeMismatch(data, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, AbstractC1086uf value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof AbstractC1086uf.i) {
            return ((Yg) this.f8293a.X9().getValue()).serialize(context, ((AbstractC1086uf.i) value).c());
        }
        if (value instanceof AbstractC1086uf.g) {
            return ((C1069tg) this.f8293a.F9().getValue()).serialize(context, ((AbstractC1086uf.g) value).c());
        }
        if (value instanceof AbstractC1086uf.h) {
            return ((Eg) this.f8293a.L9().getValue()).serialize(context, ((AbstractC1086uf.h) value).c());
        }
        if (value instanceof AbstractC1086uf.c) {
            return ((C1088v) this.f8293a.m().getValue()).serialize(context, ((AbstractC1086uf.c) value).c());
        }
        if (value instanceof AbstractC1086uf.b) {
            return ((C0909l) this.f8293a.g().getValue()).serialize(context, ((AbstractC1086uf.b) value).c());
        }
        if (value instanceof AbstractC1086uf.j) {
            return ((ih) this.f8293a.da().getValue()).serialize(context, ((AbstractC1086uf.j) value).c());
        }
        if (value instanceof AbstractC1086uf.f) {
            return ((P) this.f8293a.y().getValue()).serialize(context, ((AbstractC1086uf.f) value).c());
        }
        if (value instanceof AbstractC1086uf.a) {
            return ((C0730b) this.f8293a.a().getValue()).serialize(context, ((AbstractC1086uf.a) value).c());
        }
        throw new W1.m();
    }
}
