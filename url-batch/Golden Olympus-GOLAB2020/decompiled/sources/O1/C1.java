package O1;

import O1.AbstractC1016qg;
import O1.E1;
import O1.Pg;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class C1 implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f1556a;

    public C1(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f1556a = component;
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
    public E1 deserialize(ParsingContext context, JSONObject data) {
        String a4;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        String readString = JsonPropertyParser.readString(context, data, "type");
        Intrinsics.checkNotNullExpressionValue(readString, "readString(context, data, \"type\")");
        EntityTemplate<?> entityTemplate = context.getTemplates().get(readString);
        E1 e12 = entityTemplate instanceof E1 ? (E1) entityTemplate : null;
        if (e12 != null && (a4 = e12.a()) != null) {
            readString = a4;
        }
        switch (readString.hashCode()) {
            case -1019779949:
                if (readString.equals("offset")) {
                    return new E1.e(((Pg.c) this.f1556a.S9().getValue()).deserialize(context, (Qg) (e12 != null ? e12.b() : null), data));
                }
                break;
            case 100571:
                if (readString.equals("end")) {
                    return new E1.c(((C0926lg) this.f1556a.A9().getValue()).deserialize(context, (C0962ng) (e12 != null ? e12.b() : null), data));
                }
                break;
            case 100346066:
                if (readString.equals(FirebaseAnalytics.Param.INDEX)) {
                    return new E1.d(((AbstractC1016qg.c) this.f1556a.D9().getValue()).deserialize(context, (C1033rg) (e12 != null ? e12.b() : null), data));
                }
                break;
            case 109757538:
                if (readString.equals("start")) {
                    return new E1.f(((Ug) this.f1556a.V9().getValue()).deserialize(context, (Wg) (e12 != null ? e12.b() : null), data));
                }
                break;
        }
        throw ParsingExceptionKt.typeMismatch(data, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, E1 value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof E1.e) {
            return ((Pg.c) this.f1556a.S9().getValue()).serialize(context, ((E1.e) value).c());
        }
        if (value instanceof E1.d) {
            return ((AbstractC1016qg.c) this.f1556a.D9().getValue()).serialize(context, ((E1.d) value).c());
        }
        if (value instanceof E1.f) {
            return ((Ug) this.f1556a.V9().getValue()).serialize(context, ((E1.f) value).c());
        }
        if (value instanceof E1.c) {
            return ((C0926lg) this.f1556a.A9().getValue()).serialize(context, ((E1.c) value).c());
        }
        throw new W1.m();
    }
}
