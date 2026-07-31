package O1;

import O1.AbstractC0835ge;
import O1.AbstractC0935m7;
import O1.AbstractC0976oc;
import O1.AbstractC0977od;
import O1.AbstractC1100vb;
import O1.AbstractC1129x4;
import O1.AbstractC1131x6;
import O1.Ad;
import O1.E6;
import O1.Gb;
import O1.Hc;
import O1.K9;
import O1.Kf;
import O1.M6;
import O1.S7;
import O1.W3;
import O1.X6;
import O1.Z;
import com.ironsource.b9;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.r8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1025r8 implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f7779a;

    public C1025r8(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f7779a = component;
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
    public Z deserialize(ParsingContext context, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        String readString = JsonPropertyParser.readString(context, data, "type");
        Intrinsics.checkNotNullExpressionValue(readString, "readString(context, data, \"type\")");
        switch (readString.hashCode()) {
            case -1349088399:
                if (readString.equals("custom")) {
                    return new Z.d(((AbstractC1129x4.e) this.f7779a.y2().getValue()).deserialize(context, data));
                }
                break;
            case -906021636:
                if (readString.equals("select")) {
                    return new Z.l(((AbstractC1100vb.g) this.f7779a.A6().getValue()).deserialize(context, data));
                }
                break;
            case -899647263:
                if (readString.equals("slider")) {
                    return new Z.n(((AbstractC0976oc.e) this.f7779a.b7().getValue()).deserialize(context, data));
                }
                break;
            case -889473228:
                if (readString.equals("switch")) {
                    return new Z.p(((AbstractC0977od.e) this.f7779a.I7().getValue()).deserialize(context, data));
                }
                break;
            case -711999985:
                if (readString.equals("indicator")) {
                    return new Z.i(((AbstractC0935m7.f) this.f7779a.a4().getValue()).deserialize(context, data));
                }
                break;
            case -410956671:
                if (readString.equals("container")) {
                    return new Z.c(((W3.i) this.f7779a.j2().getValue()).deserialize(context, data));
                }
                break;
            case -196315310:
                if (readString.equals("gallery")) {
                    return new Z.e(((AbstractC1131x6.i) this.f7779a.I3().getValue()).deserialize(context, data));
                }
                break;
            case 102340:
                if (readString.equals("gif")) {
                    return new Z.f(((E6.h) this.f7779a.L3().getValue()).deserialize(context, data));
                }
                break;
            case 3181382:
                if (readString.equals("grid")) {
                    return new Z.g(((M6.g) this.f7779a.O3().getValue()).deserialize(context, data));
                }
                break;
            case 3552126:
                if (readString.equals("tabs")) {
                    return new Z.q(((Ad.e) this.f7779a.O7().getValue()).deserialize(context, data));
                }
                break;
            case 3556653:
                if (readString.equals(b9.h.f15450K0)) {
                    return new Z.r(((AbstractC0835ge.l) this.f7779a.j8().getValue()).deserialize(context, data));
                }
                break;
            case 100313435:
                if (readString.equals("image")) {
                    return new Z.h(((X6.i) this.f7779a.U3().getValue()).deserialize(context, data));
                }
                break;
            case 100358090:
                if (readString.equals("input")) {
                    return new Z.j(((S7.l) this.f7779a.p4().getValue()).deserialize(context, data));
                }
                break;
            case 106426307:
                if (readString.equals("pager")) {
                    return new Z.k(((K9.h) this.f7779a.w5().getValue()).deserialize(context, data));
                }
                break;
            case 109757585:
                if (readString.equals(b9.h.f15456P)) {
                    return new Z.o(((Hc.f) this.f7779a.n7().getValue()).deserialize(context, data));
                }
                break;
            case 112202875:
                if (readString.equals("video")) {
                    return new Z.s(((Kf.f) this.f7779a.h9().getValue()).deserialize(context, data));
                }
                break;
            case 1732829925:
                if (readString.equals("separator")) {
                    return new Z.m(((Gb.e) this.f7779a.J6().getValue()).deserialize(context, data));
                }
                break;
        }
        EntityTemplate<?> orThrow = context.getTemplates().getOrThrow(readString, data);
        Jd jd = orThrow instanceof Jd ? (Jd) orThrow : null;
        if (jd != null) {
            return ((C1061t8) this.f7779a.L4().getValue()).resolve(context, jd, data);
        }
        throw ParsingExceptionKt.typeMismatch(data, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, Z value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof Z.h) {
            return ((X6.i) this.f7779a.U3().getValue()).serialize(context, ((Z.h) value).c());
        }
        if (value instanceof Z.f) {
            return ((E6.h) this.f7779a.L3().getValue()).serialize(context, ((Z.f) value).c());
        }
        if (value instanceof Z.r) {
            return ((AbstractC0835ge.l) this.f7779a.j8().getValue()).serialize(context, ((Z.r) value).c());
        }
        if (value instanceof Z.m) {
            return ((Gb.e) this.f7779a.J6().getValue()).serialize(context, ((Z.m) value).c());
        }
        if (value instanceof Z.c) {
            return ((W3.i) this.f7779a.j2().getValue()).serialize(context, ((Z.c) value).c());
        }
        if (value instanceof Z.g) {
            return ((M6.g) this.f7779a.O3().getValue()).serialize(context, ((Z.g) value).c());
        }
        if (value instanceof Z.e) {
            return ((AbstractC1131x6.i) this.f7779a.I3().getValue()).serialize(context, ((Z.e) value).c());
        }
        if (value instanceof Z.k) {
            return ((K9.h) this.f7779a.w5().getValue()).serialize(context, ((Z.k) value).c());
        }
        if (value instanceof Z.q) {
            return ((Ad.e) this.f7779a.O7().getValue()).serialize(context, ((Z.q) value).c());
        }
        if (value instanceof Z.o) {
            return ((Hc.f) this.f7779a.n7().getValue()).serialize(context, ((Z.o) value).c());
        }
        if (value instanceof Z.d) {
            return ((AbstractC1129x4.e) this.f7779a.y2().getValue()).serialize(context, ((Z.d) value).c());
        }
        if (value instanceof Z.i) {
            return ((AbstractC0935m7.f) this.f7779a.a4().getValue()).serialize(context, ((Z.i) value).c());
        }
        if (value instanceof Z.n) {
            return ((AbstractC0976oc.e) this.f7779a.b7().getValue()).serialize(context, ((Z.n) value).c());
        }
        if (value instanceof Z.p) {
            return ((AbstractC0977od.e) this.f7779a.I7().getValue()).serialize(context, ((Z.p) value).c());
        }
        if (value instanceof Z.j) {
            return ((S7.l) this.f7779a.p4().getValue()).serialize(context, ((Z.j) value).c());
        }
        if (value instanceof Z.l) {
            return ((AbstractC1100vb.g) this.f7779a.A6().getValue()).serialize(context, ((Z.l) value).c());
        }
        if (value instanceof Z.s) {
            return ((Kf.f) this.f7779a.h9().getValue()).serialize(context, ((Z.s) value).c());
        }
        throw new W1.m();
    }
}
