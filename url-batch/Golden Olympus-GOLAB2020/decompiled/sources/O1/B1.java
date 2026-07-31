package O1;

import O1.A1;
import O1.AbstractC1016qg;
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
public final class B1 implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f1440a;

    public B1(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f1440a = component;
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
    public A1 deserialize(ParsingContext context, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        String readString = JsonPropertyParser.readString(context, data, "type");
        Intrinsics.checkNotNullExpressionValue(readString, "readString(context, data, \"type\")");
        switch (readString.hashCode()) {
            case -1019779949:
                if (readString.equals("offset")) {
                    return new A1.e(((Pg.b) this.f1440a.R9().getValue()).deserialize(context, data));
                }
                break;
            case 100571:
                if (readString.equals("end")) {
                    return new A1.c(((C0908kg) this.f1440a.z9().getValue()).deserialize(context, data));
                }
                break;
            case 100346066:
                if (readString.equals(FirebaseAnalytics.Param.INDEX)) {
                    return new A1.d(((AbstractC1016qg.b) this.f1440a.C9().getValue()).deserialize(context, data));
                }
                break;
            case 109757538:
                if (readString.equals("start")) {
                    return new A1.f(((Tg) this.f1440a.U9().getValue()).deserialize(context, data));
                }
                break;
        }
        EntityTemplate<?> orThrow = context.getTemplates().getOrThrow(readString, data);
        E1 e12 = orThrow instanceof E1 ? (E1) orThrow : null;
        if (e12 != null) {
            return ((D1) this.f1440a.F0().getValue()).resolve(context, e12, data);
        }
        throw ParsingExceptionKt.typeMismatch(data, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, A1 value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof A1.e) {
            return ((Pg.b) this.f1440a.R9().getValue()).serialize(context, ((A1.e) value).c());
        }
        if (value instanceof A1.d) {
            return ((AbstractC1016qg.b) this.f1440a.C9().getValue()).serialize(context, ((A1.d) value).c());
        }
        if (value instanceof A1.f) {
            return ((Tg) this.f1440a.U9().getValue()).serialize(context, ((A1.f) value).c());
        }
        if (value instanceof A1.c) {
            return ((C0908kg) this.f1440a.z9().getValue()).serialize(context, ((A1.c) value).c());
        }
        throw new W1.m();
    }
}
