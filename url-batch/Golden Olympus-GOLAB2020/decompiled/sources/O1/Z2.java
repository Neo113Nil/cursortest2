package O1;

import O1.AbstractC0734b3;
import O1.G8;
import O1.Ma;
import O1.R6;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Z2 implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f5454a;

    public Z2(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f5454a = component;
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
    public AbstractC0734b3 deserialize(ParsingContext context, JSONObject data) {
        String a4;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        String readString = JsonPropertyParser.readString(context, data, "type");
        Intrinsics.checkNotNullExpressionValue(readString, "readString(context, data, \"type\")");
        EntityTemplate<?> entityTemplate = context.getTemplates().get(readString);
        AbstractC0734b3 abstractC0734b3 = entityTemplate instanceof AbstractC0734b3 ? (AbstractC0734b3) entityTemplate : null;
        if (abstractC0734b3 != null && (a4 = abstractC0734b3.a()) != null) {
            readString = a4;
        }
        switch (readString.hashCode()) {
            case -30518633:
                if (readString.equals("nine_patch_image")) {
                    return new AbstractC0734b3.e(((T8) this.f5454a.c5().getValue()).deserialize(context, (V8) (abstractC0734b3 != null ? abstractC0734b3.b() : null), data));
                }
                break;
            case 89650992:
                if (readString.equals("gradient")) {
                    return new AbstractC0734b3.d(((G8.c) this.f5454a.T4().getValue()).deserialize(context, (H8) (abstractC0734b3 != null ? abstractC0734b3.b() : null), data));
                }
                break;
            case 100313435:
                if (readString.equals("image")) {
                    return new AbstractC0734b3.c(((R6.f) this.f5454a.S3().getValue()).deserialize(context, (S6) (abstractC0734b3 != null ? abstractC0734b3.b() : null), data));
                }
                break;
            case 109618859:
                if (readString.equals("solid")) {
                    return new AbstractC0734b3.g(((C1155yc) this.f5454a.l7().getValue()).deserialize(context, (Ac) (abstractC0734b3 != null ? abstractC0734b3.b() : null), data));
                }
                break;
            case 1881846096:
                if (readString.equals("radial_gradient")) {
                    return new AbstractC0734b3.f(((Ma.c) this.f5454a.j6().getValue()).deserialize(context, (C0724ab) (abstractC0734b3 != null ? abstractC0734b3.b() : null), data));
                }
                break;
        }
        throw ParsingExceptionKt.typeMismatch(data, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, AbstractC0734b3 value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof AbstractC0734b3.d) {
            return ((G8.c) this.f5454a.T4().getValue()).serialize(context, ((AbstractC0734b3.d) value).c());
        }
        if (value instanceof AbstractC0734b3.f) {
            return ((Ma.c) this.f5454a.j6().getValue()).serialize(context, ((AbstractC0734b3.f) value).c());
        }
        if (value instanceof AbstractC0734b3.c) {
            return ((R6.f) this.f5454a.S3().getValue()).serialize(context, ((AbstractC0734b3.c) value).c());
        }
        if (value instanceof AbstractC0734b3.g) {
            return ((C1155yc) this.f5454a.l7().getValue()).serialize(context, ((AbstractC0734b3.g) value).c());
        }
        if (value instanceof AbstractC0734b3.e) {
            return ((T8) this.f5454a.c5().getValue()).serialize(context, ((AbstractC0734b3.e) value).c());
        }
        throw new W1.m();
    }
}
