package O1;

import O1.AbstractC1158yf;
import com.ironsource.b9;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.wf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1122wf implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f8367a;

    public C1122wf(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f8367a = component;
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
    public AbstractC1158yf deserialize(ParsingContext context, JSONObject data) {
        String a4;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        String readString = JsonPropertyParser.readString(context, data, "type");
        Intrinsics.checkNotNullExpressionValue(readString, "readString(context, data, \"type\")");
        EntityTemplate<?> entityTemplate = context.getTemplates().get(readString);
        AbstractC1158yf abstractC1158yf = entityTemplate instanceof AbstractC1158yf ? (AbstractC1158yf) entityTemplate : null;
        if (abstractC1158yf != null && (a4 = abstractC1158yf.a()) != null) {
            readString = a4;
        }
        switch (readString.hashCode()) {
            case -1034364087:
                if (readString.equals("number")) {
                    return new AbstractC1158yf.h(((Fg) this.f8367a.M9().getValue()).deserialize(context, (Hg) (abstractC1158yf != null ? abstractC1158yf.b() : null), data));
                }
                break;
            case -891985903:
                if (readString.equals("string")) {
                    return new AbstractC1158yf.i(((Zg) this.f8367a.Y9().getValue()).deserialize(context, (bh) (abstractC1158yf != null ? abstractC1158yf.b() : null), data));
                }
                break;
            case 116079:
                if (readString.equals("url")) {
                    return new AbstractC1158yf.j(((jh) this.f8367a.ea().getValue()).deserialize(context, (lh) (abstractC1158yf != null ? abstractC1158yf.b() : null), data));
                }
                break;
            case 3083190:
                if (readString.equals("dict")) {
                    return new AbstractC1158yf.f(((Q) this.f8367a.z().getValue()).deserialize(context, (T) (abstractC1158yf != null ? abstractC1158yf.b() : null), data));
                }
                break;
            case 64711720:
                if (readString.equals("boolean")) {
                    return new AbstractC1158yf.b(((C0927m) this.f8367a.h().getValue()).deserialize(context, (C0963o) (abstractC1158yf != null ? abstractC1158yf.b() : null), data));
                }
                break;
            case 93090393:
                if (readString.equals("array")) {
                    return new AbstractC1158yf.a(((C0748c) this.f8367a.b().getValue()).deserialize(context, (C0784e) (abstractC1158yf != null ? abstractC1158yf.b() : null), data));
                }
                break;
            case 94842723:
                if (readString.equals(b9.h.f15459S)) {
                    return new AbstractC1158yf.c(((C1106w) this.f8367a.n().getValue()).deserialize(context, (C1142y) (abstractC1158yf != null ? abstractC1158yf.b() : null), data));
                }
                break;
            case 1958052158:
                if (readString.equals("integer")) {
                    return new AbstractC1158yf.g(((C1087ug) this.f8367a.G9().getValue()).deserialize(context, (C1123wg) (abstractC1158yf != null ? abstractC1158yf.b() : null), data));
                }
                break;
        }
        throw ParsingExceptionKt.typeMismatch(data, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, AbstractC1158yf value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof AbstractC1158yf.i) {
            return ((Zg) this.f8367a.Y9().getValue()).serialize(context, ((AbstractC1158yf.i) value).c());
        }
        if (value instanceof AbstractC1158yf.g) {
            return ((C1087ug) this.f8367a.G9().getValue()).serialize(context, ((AbstractC1158yf.g) value).c());
        }
        if (value instanceof AbstractC1158yf.h) {
            return ((Fg) this.f8367a.M9().getValue()).serialize(context, ((AbstractC1158yf.h) value).c());
        }
        if (value instanceof AbstractC1158yf.c) {
            return ((C1106w) this.f8367a.n().getValue()).serialize(context, ((AbstractC1158yf.c) value).c());
        }
        if (value instanceof AbstractC1158yf.b) {
            return ((C0927m) this.f8367a.h().getValue()).serialize(context, ((AbstractC1158yf.b) value).c());
        }
        if (value instanceof AbstractC1158yf.j) {
            return ((jh) this.f8367a.ea().getValue()).serialize(context, ((AbstractC1158yf.j) value).c());
        }
        if (value instanceof AbstractC1158yf.f) {
            return ((Q) this.f8367a.z().getValue()).serialize(context, ((AbstractC1158yf.f) value).c());
        }
        if (value instanceof AbstractC1158yf.a) {
            return ((C0748c) this.f8367a.b().getValue()).serialize(context, ((AbstractC1158yf.a) value).c());
        }
        throw new W1.m();
    }
}
