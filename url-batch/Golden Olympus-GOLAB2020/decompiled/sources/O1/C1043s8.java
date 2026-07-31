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
import O1.Jd;
import O1.K9;
import O1.Kf;
import O1.M6;
import O1.S7;
import O1.W3;
import O1.X6;
import com.ironsource.b9;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.s8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1043s8 implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f7855a;

    public C1043s8(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f7855a = component;
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
    public Jd deserialize(ParsingContext context, JSONObject data) {
        String a4;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        String readString = JsonPropertyParser.readString(context, data, "type");
        Intrinsics.checkNotNullExpressionValue(readString, "readString(context, data, \"type\")");
        EntityTemplate<?> entityTemplate = context.getTemplates().get(readString);
        Jd jd = entityTemplate instanceof Jd ? (Jd) entityTemplate : null;
        if (jd != null && (a4 = jd.a()) != null) {
            readString = a4;
        }
        switch (readString.hashCode()) {
            case -1349088399:
                if (readString.equals("custom")) {
                    return new Jd.d(((AbstractC1129x4.f) this.f7855a.z2().getValue()).deserialize(context, (C1147y4) (jd != null ? jd.b() : null), data));
                }
                break;
            case -906021636:
                if (readString.equals("select")) {
                    return new Jd.l(((AbstractC1100vb.h) this.f7855a.B6().getValue()).deserialize(context, (C1172zb) (jd != null ? jd.b() : null), data));
                }
                break;
            case -899647263:
                if (readString.equals("slider")) {
                    return new Jd.n(((AbstractC0976oc.f) this.f7855a.c7().getValue()).deserialize(context, (C1047sc) (jd != null ? jd.b() : null), data));
                }
                break;
            case -889473228:
                if (readString.equals("switch")) {
                    return new Jd.p(((AbstractC0977od.f) this.f7855a.J7().getValue()).deserialize(context, (C0995pd) (jd != null ? jd.b() : null), data));
                }
                break;
            case -711999985:
                if (readString.equals("indicator")) {
                    return new Jd.i(((AbstractC0935m7.g) this.f7855a.b4().getValue()).deserialize(context, (C0953n7) (jd != null ? jd.b() : null), data));
                }
                break;
            case -410956671:
                if (readString.equals("container")) {
                    return new Jd.c(((W3.j) this.f7855a.k2().getValue()).deserialize(context, (Y3) (jd != null ? jd.b() : null), data));
                }
                break;
            case -196315310:
                if (readString.equals("gallery")) {
                    return new Jd.e(((AbstractC1131x6.j) this.f7855a.J3().getValue()).deserialize(context, (C1149y6) (jd != null ? jd.b() : null), data));
                }
                break;
            case 102340:
                if (readString.equals("gif")) {
                    return new Jd.f(((E6.i) this.f7855a.M3().getValue()).deserialize(context, (F6) (jd != null ? jd.b() : null), data));
                }
                break;
            case 3181382:
                if (readString.equals("grid")) {
                    return new Jd.g(((M6.h) this.f7855a.P3().getValue()).deserialize(context, (N6) (jd != null ? jd.b() : null), data));
                }
                break;
            case 3552126:
                if (readString.equals("tabs")) {
                    return new Jd.q(((Ad.f) this.f7855a.P7().getValue()).deserialize(context, (Id) (jd != null ? jd.b() : null), data));
                }
                break;
            case 3556653:
                if (readString.equals(b9.h.f15450K0)) {
                    return new Jd.r(((AbstractC0835ge.m) this.f7855a.k8().getValue()).deserialize(context, (Me) (jd != null ? jd.b() : null), data));
                }
                break;
            case 100313435:
                if (readString.equals("image")) {
                    return new Jd.h(((X6.j) this.f7855a.V3().getValue()).deserialize(context, (Z6) (jd != null ? jd.b() : null), data));
                }
                break;
            case 100358090:
                if (readString.equals("input")) {
                    return new Jd.j(((S7.m) this.f7855a.q4().getValue()).deserialize(context, (C0757c8) (jd != null ? jd.b() : null), data));
                }
                break;
            case 106426307:
                if (readString.equals("pager")) {
                    return new Jd.k(((K9.i) this.f7855a.x5().getValue()).deserialize(context, (Q9) (jd != null ? jd.b() : null), data));
                }
                break;
            case 109757585:
                if (readString.equals(b9.h.f15456P)) {
                    return new Jd.o(((Hc.g) this.f7855a.o7().getValue()).deserialize(context, (Lc) (jd != null ? jd.b() : null), data));
                }
                break;
            case 112202875:
                if (readString.equals("video")) {
                    return new Jd.s(((Kf.g) this.f7855a.i9().getValue()).deserialize(context, (Uf) (jd != null ? jd.b() : null), data));
                }
                break;
            case 1732829925:
                if (readString.equals("separator")) {
                    return new Jd.m(((Gb.f) this.f7855a.K6().getValue()).deserialize(context, (Hb) (jd != null ? jd.b() : null), data));
                }
                break;
        }
        throw ParsingExceptionKt.typeMismatch(data, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, Jd value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof Jd.h) {
            return ((X6.j) this.f7855a.V3().getValue()).serialize(context, ((Jd.h) value).c());
        }
        if (value instanceof Jd.f) {
            return ((E6.i) this.f7855a.M3().getValue()).serialize(context, ((Jd.f) value).c());
        }
        if (value instanceof Jd.r) {
            return ((AbstractC0835ge.m) this.f7855a.k8().getValue()).serialize(context, ((Jd.r) value).c());
        }
        if (value instanceof Jd.m) {
            return ((Gb.f) this.f7855a.K6().getValue()).serialize(context, ((Jd.m) value).c());
        }
        if (value instanceof Jd.c) {
            return ((W3.j) this.f7855a.k2().getValue()).serialize(context, ((Jd.c) value).c());
        }
        if (value instanceof Jd.g) {
            return ((M6.h) this.f7855a.P3().getValue()).serialize(context, ((Jd.g) value).c());
        }
        if (value instanceof Jd.e) {
            return ((AbstractC1131x6.j) this.f7855a.J3().getValue()).serialize(context, ((Jd.e) value).c());
        }
        if (value instanceof Jd.k) {
            return ((K9.i) this.f7855a.x5().getValue()).serialize(context, ((Jd.k) value).c());
        }
        if (value instanceof Jd.q) {
            return ((Ad.f) this.f7855a.P7().getValue()).serialize(context, ((Jd.q) value).c());
        }
        if (value instanceof Jd.o) {
            return ((Hc.g) this.f7855a.o7().getValue()).serialize(context, ((Jd.o) value).c());
        }
        if (value instanceof Jd.d) {
            return ((AbstractC1129x4.f) this.f7855a.z2().getValue()).serialize(context, ((Jd.d) value).c());
        }
        if (value instanceof Jd.i) {
            return ((AbstractC0935m7.g) this.f7855a.b4().getValue()).serialize(context, ((Jd.i) value).c());
        }
        if (value instanceof Jd.n) {
            return ((AbstractC0976oc.f) this.f7855a.c7().getValue()).serialize(context, ((Jd.n) value).c());
        }
        if (value instanceof Jd.p) {
            return ((AbstractC0977od.f) this.f7855a.J7().getValue()).serialize(context, ((Jd.p) value).c());
        }
        if (value instanceof Jd.j) {
            return ((S7.m) this.f7855a.q4().getValue()).serialize(context, ((Jd.j) value).c());
        }
        if (value instanceof Jd.l) {
            return ((AbstractC1100vb.h) this.f7855a.B6().getValue()).serialize(context, ((Jd.l) value).c());
        }
        if (value instanceof Jd.s) {
            return ((Kf.g) this.f7855a.i9().getValue()).serialize(context, ((Jd.s) value).c());
        }
        throw new W1.m();
    }
}
