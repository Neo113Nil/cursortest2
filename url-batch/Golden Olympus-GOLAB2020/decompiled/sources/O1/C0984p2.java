package O1;

import O1.AbstractC0912l2;
import O1.AbstractC0964o0;
import O1.AbstractC1019r2;
import O1.AbstractC1055t2;
import O1.AbstractC1144y1;
import O1.G1;
import O1.J1;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.p2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0984p2 implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f7450a;

    public C0984p2(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f7450a = component;
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
    public AbstractC1019r2 deserialize(ParsingContext context, JSONObject data) {
        String a4;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        String readString = JsonPropertyParser.readString(context, data, "type");
        Intrinsics.checkNotNullExpressionValue(readString, "readString(context, data, \"type\")");
        EntityTemplate<?> entityTemplate = context.getTemplates().get(readString);
        AbstractC1019r2 abstractC1019r2 = entityTemplate instanceof AbstractC1019r2 ? (AbstractC1019r2) entityTemplate : null;
        if (abstractC1019r2 != null && (a4 = abstractC1019r2.a()) != null) {
            readString = a4;
        }
        switch (readString.hashCode()) {
            case -1623648839:
                if (readString.equals("set_variable")) {
                    return new AbstractC1019r2.r(((S1) this.f7450a.Q0().getValue()).deserialize(context, (U1) (abstractC1019r2 != null ? abstractC1019r2.b() : null), data));
                }
                break;
            case -1623635702:
                if (readString.equals("animator_start")) {
                    return new AbstractC1019r2.a(((AbstractC0964o0.e) this.f7450a.L().getValue()).deserialize(context, (C0982p0) (abstractC1019r2 != null ? abstractC1019r2.b() : null), data));
                }
                break;
            case -1254965146:
                if (readString.equals("clear_focus")) {
                    return new AbstractC1019r2.f(((M0) this.f7450a.a0().getValue()).deserialize(context, (O0) (abstractC1019r2 != null ? abstractC1019r2.b() : null), data));
                }
                break;
            case -1160753574:
                if (readString.equals("animator_stop")) {
                    return new AbstractC1019r2.b(((C1035s0) this.f7450a.O().getValue()).deserialize(context, (C1071u0) (abstractC1019r2 != null ? abstractC1019r2.b() : null), data));
                }
                break;
            case -891535336:
                if (readString.equals("submit")) {
                    return new AbstractC1019r2.t(((C0751c2) this.f7450a.W0().getValue()).deserialize(context, (C0859i2) (abstractC1019r2 != null ? abstractC1019r2.b() : null), data));
                }
                break;
            case -796594542:
                if (readString.equals("set_stored_value")) {
                    return new AbstractC1019r2.q(((N1) this.f7450a.N0().getValue()).deserialize(context, (P1) (abstractC1019r2 != null ? abstractC1019r2.b() : null), data));
                }
                break;
            case -404256420:
                if (readString.equals("copy_to_clipboard")) {
                    return new AbstractC1019r2.i(((W0) this.f7450a.g0().getValue()).deserialize(context, (Y0) (abstractC1019r2 != null ? abstractC1019r2.b() : null), data));
                }
                break;
            case 10055918:
                if (readString.equals("array_set_value")) {
                    return new AbstractC1019r2.e(((H0) this.f7450a.X().getValue()).deserialize(context, (J0) (abstractC1019r2 != null ? abstractC1019r2.b() : null), data));
                }
                break;
            case 110364485:
                if (readString.equals("timer")) {
                    return new AbstractC1019r2.u(((AbstractC0912l2.d) this.f7450a.f1().getValue()).deserialize(context, (C0930m2) (abstractC1019r2 != null ? abstractC1019r2.b() : null), data));
                }
                break;
            case 112202875:
                if (readString.equals("video")) {
                    return new AbstractC1019r2.v(((AbstractC1055t2.d) this.f7450a.l1().getValue()).deserialize(context, (C1073u2) (abstractC1019r2 != null ? abstractC1019r2.b() : null), data));
                }
                break;
            case 203934236:
                if (readString.equals("array_remove_value")) {
                    return new AbstractC1019r2.d(((C0) this.f7450a.U().getValue()).deserialize(context, (E0) (abstractC1019r2 != null ? abstractC1019r2.b() : null), data));
                }
                break;
            case 301532353:
                if (readString.equals("show_tooltip")) {
                    return new AbstractC1019r2.s(((X1) this.f7450a.T0().getValue()).deserialize(context, (Z1) (abstractC1019r2 != null ? abstractC1019r2.b() : null), data));
                }
                break;
            case 417790729:
                if (readString.equals("scroll_by")) {
                    return new AbstractC1019r2.n(((AbstractC1144y1.d) this.f7450a.B0().getValue()).deserialize(context, (C1162z1) (abstractC1019r2 != null ? abstractC1019r2.b() : null), data));
                }
                break;
            case 417791277:
                if (readString.equals("scroll_to")) {
                    return new AbstractC1019r2.o(((G1.c) this.f7450a.H0().getValue()).deserialize(context, (H1) (abstractC1019r2 != null ? abstractC1019r2.b() : null), data));
                }
                break;
            case 932090484:
                if (readString.equals("set_state")) {
                    return new AbstractC1019r2.p(((J1.c) this.f7450a.K0().getValue()).deserialize(context, (K1) (abstractC1019r2 != null ? abstractC1019r2.b() : null), data));
                }
                break;
            case 1427818632:
                if (readString.equals("download")) {
                    return new AbstractC1019r2.k(((C0822g1) this.f7450a.m0().getValue()).deserialize(context, (C0858i1) (abstractC1019r2 != null ? abstractC1019r2.b() : null), data));
                }
                break;
            case 1550697109:
                if (readString.equals("focus_element")) {
                    return new AbstractC1019r2.l(((C0911l1) this.f7450a.p0().getValue()).deserialize(context, (C0947n1) (abstractC1019r2 != null ? abstractC1019r2.b() : null), data));
                }
                break;
            case 1587919371:
                if (readString.equals("dict_set_value")) {
                    return new AbstractC1019r2.j(((C0732b1) this.f7450a.j0().getValue()).deserialize(context, (C0768d1) (abstractC1019r2 != null ? abstractC1019r2.b() : null), data));
                }
                break;
            case 1715728902:
                if (readString.equals("hide_tooltip")) {
                    return new AbstractC1019r2.m(((C1001q1) this.f7450a.s0().getValue()).deserialize(context, (C1036s1) (abstractC1019r2 != null ? abstractC1019r2.b() : null), data));
                }
                break;
            case 1811437713:
                if (readString.equals("array_insert_value")) {
                    return new AbstractC1019r2.c(((C1125x0) this.f7450a.R().getValue()).deserialize(context, (C1161z0) (abstractC1019r2 != null ? abstractC1019r2.b() : null), data));
                }
                break;
        }
        throw ParsingExceptionKt.typeMismatch(data, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, AbstractC1019r2 value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof AbstractC1019r2.a) {
            return ((AbstractC0964o0.e) this.f7450a.L().getValue()).serialize(context, ((AbstractC1019r2.a) value).c());
        }
        if (value instanceof AbstractC1019r2.b) {
            return ((C1035s0) this.f7450a.O().getValue()).serialize(context, ((AbstractC1019r2.b) value).c());
        }
        if (value instanceof AbstractC1019r2.c) {
            return ((C1125x0) this.f7450a.R().getValue()).serialize(context, ((AbstractC1019r2.c) value).c());
        }
        if (value instanceof AbstractC1019r2.d) {
            return ((C0) this.f7450a.U().getValue()).serialize(context, ((AbstractC1019r2.d) value).c());
        }
        if (value instanceof AbstractC1019r2.e) {
            return ((H0) this.f7450a.X().getValue()).serialize(context, ((AbstractC1019r2.e) value).c());
        }
        if (value instanceof AbstractC1019r2.f) {
            return ((M0) this.f7450a.a0().getValue()).serialize(context, ((AbstractC1019r2.f) value).c());
        }
        if (value instanceof AbstractC1019r2.i) {
            return ((W0) this.f7450a.g0().getValue()).serialize(context, ((AbstractC1019r2.i) value).c());
        }
        if (value instanceof AbstractC1019r2.j) {
            return ((C0732b1) this.f7450a.j0().getValue()).serialize(context, ((AbstractC1019r2.j) value).c());
        }
        if (value instanceof AbstractC1019r2.k) {
            return ((C0822g1) this.f7450a.m0().getValue()).serialize(context, ((AbstractC1019r2.k) value).c());
        }
        if (value instanceof AbstractC1019r2.l) {
            return ((C0911l1) this.f7450a.p0().getValue()).serialize(context, ((AbstractC1019r2.l) value).c());
        }
        if (value instanceof AbstractC1019r2.m) {
            return ((C1001q1) this.f7450a.s0().getValue()).serialize(context, ((AbstractC1019r2.m) value).c());
        }
        if (value instanceof AbstractC1019r2.n) {
            return ((AbstractC1144y1.d) this.f7450a.B0().getValue()).serialize(context, ((AbstractC1019r2.n) value).c());
        }
        if (value instanceof AbstractC1019r2.o) {
            return ((G1.c) this.f7450a.H0().getValue()).serialize(context, ((AbstractC1019r2.o) value).c());
        }
        if (value instanceof AbstractC1019r2.p) {
            return ((J1.c) this.f7450a.K0().getValue()).serialize(context, ((AbstractC1019r2.p) value).c());
        }
        if (value instanceof AbstractC1019r2.q) {
            return ((N1) this.f7450a.N0().getValue()).serialize(context, ((AbstractC1019r2.q) value).c());
        }
        if (value instanceof AbstractC1019r2.r) {
            return ((S1) this.f7450a.Q0().getValue()).serialize(context, ((AbstractC1019r2.r) value).c());
        }
        if (value instanceof AbstractC1019r2.s) {
            return ((X1) this.f7450a.T0().getValue()).serialize(context, ((AbstractC1019r2.s) value).c());
        }
        if (value instanceof AbstractC1019r2.t) {
            return ((C0751c2) this.f7450a.W0().getValue()).serialize(context, ((AbstractC1019r2.t) value).c());
        }
        if (value instanceof AbstractC1019r2.u) {
            return ((AbstractC0912l2.d) this.f7450a.f1().getValue()).serialize(context, ((AbstractC1019r2.u) value).c());
        }
        if (value instanceof AbstractC1019r2.v) {
            return ((AbstractC1055t2.d) this.f7450a.l1().getValue()).serialize(context, ((AbstractC1019r2.v) value).c());
        }
        throw new W1.m();
    }
}
