package O1;

import O1.G8;
import O1.Ma;
import O1.R6;
import O1.X2;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Y2 implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f5300a;

    public Y2(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f5300a = component;
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
    public X2 deserialize(ParsingContext context, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        String readString = JsonPropertyParser.readString(context, data, "type");
        Intrinsics.checkNotNullExpressionValue(readString, "readString(context, data, \"type\")");
        switch (readString.hashCode()) {
            case -30518633:
                if (readString.equals("nine_patch_image")) {
                    return new X2.e(((S8) this.f5300a.b5().getValue()).deserialize(context, data));
                }
                break;
            case 89650992:
                if (readString.equals("gradient")) {
                    return new X2.d(((G8.b) this.f5300a.S4().getValue()).deserialize(context, data));
                }
                break;
            case 100313435:
                if (readString.equals("image")) {
                    return new X2.c(((R6.e) this.f5300a.R3().getValue()).deserialize(context, data));
                }
                break;
            case 109618859:
                if (readString.equals("solid")) {
                    return new X2.g(((C1137xc) this.f5300a.k7().getValue()).deserialize(context, data));
                }
                break;
            case 1881846096:
                if (readString.equals("radial_gradient")) {
                    return new X2.f(((Ma.b) this.f5300a.i6().getValue()).deserialize(context, data));
                }
                break;
        }
        EntityTemplate<?> orThrow = context.getTemplates().getOrThrow(readString, data);
        AbstractC0734b3 abstractC0734b3 = orThrow instanceof AbstractC0734b3 ? (AbstractC0734b3) orThrow : null;
        if (abstractC0734b3 != null) {
            return ((C0716a3) this.f5300a.E1().getValue()).resolve(context, abstractC0734b3, data);
        }
        throw ParsingExceptionKt.typeMismatch(data, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, X2 value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof X2.d) {
            return ((G8.b) this.f5300a.S4().getValue()).serialize(context, ((X2.d) value).c());
        }
        if (value instanceof X2.f) {
            return ((Ma.b) this.f5300a.i6().getValue()).serialize(context, ((X2.f) value).c());
        }
        if (value instanceof X2.c) {
            return ((R6.e) this.f5300a.R3().getValue()).serialize(context, ((X2.c) value).c());
        }
        if (value instanceof X2.g) {
            return ((C1137xc) this.f5300a.k7().getValue()).serialize(context, ((X2.g) value).c());
        }
        if (value instanceof X2.e) {
            return ((S8) this.f5300a.b5().getValue()).serialize(context, ((X2.e) value).c());
        }
        throw new W1.m();
    }
}
