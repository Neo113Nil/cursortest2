package O1;

import O1.AbstractC0912l2;
import O1.AbstractC0948n2;
import O1.AbstractC0964o0;
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

/* renamed from: O1.o2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0966o2 implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f7256a;

    public C0966o2(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f7256a = component;
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
    public AbstractC0948n2 deserialize(ParsingContext context, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        String readString = JsonPropertyParser.readString(context, data, "type");
        Intrinsics.checkNotNullExpressionValue(readString, "readString(context, data, \"type\")");
        switch (readString.hashCode()) {
            case -1623648839:
                if (readString.equals("set_variable")) {
                    return new AbstractC0948n2.r(((R1) this.f7256a.P0().getValue()).deserialize(context, data));
                }
                break;
            case -1623635702:
                if (readString.equals("animator_start")) {
                    return new AbstractC0948n2.a(((AbstractC0964o0.d) this.f7256a.K().getValue()).deserialize(context, data));
                }
                break;
            case -1254965146:
                if (readString.equals("clear_focus")) {
                    return new AbstractC0948n2.f(((L0) this.f7256a.Z().getValue()).deserialize(context, data));
                }
                break;
            case -1160753574:
                if (readString.equals("animator_stop")) {
                    return new AbstractC0948n2.b(((C1017r0) this.f7256a.N().getValue()).deserialize(context, data));
                }
                break;
            case -891535336:
                if (readString.equals("submit")) {
                    return new AbstractC0948n2.t(((C0733b2) this.f7256a.V0().getValue()).deserialize(context, data));
                }
                break;
            case -796594542:
                if (readString.equals("set_stored_value")) {
                    return new AbstractC0948n2.q(((M1) this.f7256a.M0().getValue()).deserialize(context, data));
                }
                break;
            case -404256420:
                if (readString.equals("copy_to_clipboard")) {
                    return new AbstractC0948n2.i(((V0) this.f7256a.f0().getValue()).deserialize(context, data));
                }
                break;
            case 10055918:
                if (readString.equals("array_set_value")) {
                    return new AbstractC0948n2.e(((G0) this.f7256a.W().getValue()).deserialize(context, data));
                }
                break;
            case 110364485:
                if (readString.equals("timer")) {
                    return new AbstractC0948n2.u(((AbstractC0912l2.c) this.f7256a.e1().getValue()).deserialize(context, data));
                }
                break;
            case 112202875:
                if (readString.equals("video")) {
                    return new AbstractC0948n2.v(((AbstractC1055t2.c) this.f7256a.k1().getValue()).deserialize(context, data));
                }
                break;
            case 203934236:
                if (readString.equals("array_remove_value")) {
                    return new AbstractC0948n2.d(((B0) this.f7256a.T().getValue()).deserialize(context, data));
                }
                break;
            case 301532353:
                if (readString.equals("show_tooltip")) {
                    return new AbstractC0948n2.s(((W1) this.f7256a.S0().getValue()).deserialize(context, data));
                }
                break;
            case 417790729:
                if (readString.equals("scroll_by")) {
                    return new AbstractC0948n2.n(((AbstractC1144y1.c) this.f7256a.A0().getValue()).deserialize(context, data));
                }
                break;
            case 417791277:
                if (readString.equals("scroll_to")) {
                    return new AbstractC0948n2.o(((G1.b) this.f7256a.G0().getValue()).deserialize(context, data));
                }
                break;
            case 932090484:
                if (readString.equals("set_state")) {
                    return new AbstractC0948n2.p(((J1.b) this.f7256a.J0().getValue()).deserialize(context, data));
                }
                break;
            case 1427818632:
                if (readString.equals("download")) {
                    return new AbstractC0948n2.k(((C0804f1) this.f7256a.l0().getValue()).deserialize(context, data));
                }
                break;
            case 1550697109:
                if (readString.equals("focus_element")) {
                    return new AbstractC0948n2.l(((C0893k1) this.f7256a.o0().getValue()).deserialize(context, data));
                }
                break;
            case 1587919371:
                if (readString.equals("dict_set_value")) {
                    return new AbstractC0948n2.j(((C0714a1) this.f7256a.i0().getValue()).deserialize(context, data));
                }
                break;
            case 1715728902:
                if (readString.equals("hide_tooltip")) {
                    return new AbstractC0948n2.m(((C0983p1) this.f7256a.r0().getValue()).deserialize(context, data));
                }
                break;
            case 1811437713:
                if (readString.equals("array_insert_value")) {
                    return new AbstractC0948n2.c(((C1107w0) this.f7256a.Q().getValue()).deserialize(context, data));
                }
                break;
        }
        EntityTemplate<?> orThrow = context.getTemplates().getOrThrow(readString, data);
        AbstractC1019r2 abstractC1019r2 = orThrow instanceof AbstractC1019r2 ? (AbstractC1019r2) orThrow : null;
        if (abstractC1019r2 != null) {
            return ((C1002q2) this.f7256a.j1().getValue()).resolve(context, abstractC1019r2, data);
        }
        throw ParsingExceptionKt.typeMismatch(data, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, AbstractC0948n2 value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof AbstractC0948n2.a) {
            return ((AbstractC0964o0.d) this.f7256a.K().getValue()).serialize(context, ((AbstractC0948n2.a) value).c());
        }
        if (value instanceof AbstractC0948n2.b) {
            return ((C1017r0) this.f7256a.N().getValue()).serialize(context, ((AbstractC0948n2.b) value).c());
        }
        if (value instanceof AbstractC0948n2.c) {
            return ((C1107w0) this.f7256a.Q().getValue()).serialize(context, ((AbstractC0948n2.c) value).c());
        }
        if (value instanceof AbstractC0948n2.d) {
            return ((B0) this.f7256a.T().getValue()).serialize(context, ((AbstractC0948n2.d) value).c());
        }
        if (value instanceof AbstractC0948n2.e) {
            return ((G0) this.f7256a.W().getValue()).serialize(context, ((AbstractC0948n2.e) value).c());
        }
        if (value instanceof AbstractC0948n2.f) {
            return ((L0) this.f7256a.Z().getValue()).serialize(context, ((AbstractC0948n2.f) value).c());
        }
        if (value instanceof AbstractC0948n2.i) {
            return ((V0) this.f7256a.f0().getValue()).serialize(context, ((AbstractC0948n2.i) value).c());
        }
        if (value instanceof AbstractC0948n2.j) {
            return ((C0714a1) this.f7256a.i0().getValue()).serialize(context, ((AbstractC0948n2.j) value).c());
        }
        if (value instanceof AbstractC0948n2.k) {
            return ((C0804f1) this.f7256a.l0().getValue()).serialize(context, ((AbstractC0948n2.k) value).c());
        }
        if (value instanceof AbstractC0948n2.l) {
            return ((C0893k1) this.f7256a.o0().getValue()).serialize(context, ((AbstractC0948n2.l) value).c());
        }
        if (value instanceof AbstractC0948n2.m) {
            return ((C0983p1) this.f7256a.r0().getValue()).serialize(context, ((AbstractC0948n2.m) value).c());
        }
        if (value instanceof AbstractC0948n2.n) {
            return ((AbstractC1144y1.c) this.f7256a.A0().getValue()).serialize(context, ((AbstractC0948n2.n) value).c());
        }
        if (value instanceof AbstractC0948n2.o) {
            return ((G1.b) this.f7256a.G0().getValue()).serialize(context, ((AbstractC0948n2.o) value).c());
        }
        if (value instanceof AbstractC0948n2.p) {
            return ((J1.b) this.f7256a.J0().getValue()).serialize(context, ((AbstractC0948n2.p) value).c());
        }
        if (value instanceof AbstractC0948n2.q) {
            return ((M1) this.f7256a.M0().getValue()).serialize(context, ((AbstractC0948n2.q) value).c());
        }
        if (value instanceof AbstractC0948n2.r) {
            return ((R1) this.f7256a.P0().getValue()).serialize(context, ((AbstractC0948n2.r) value).c());
        }
        if (value instanceof AbstractC0948n2.s) {
            return ((W1) this.f7256a.S0().getValue()).serialize(context, ((AbstractC0948n2.s) value).c());
        }
        if (value instanceof AbstractC0948n2.t) {
            return ((C0733b2) this.f7256a.V0().getValue()).serialize(context, ((AbstractC0948n2.t) value).c());
        }
        if (value instanceof AbstractC0948n2.u) {
            return ((AbstractC0912l2.c) this.f7256a.e1().getValue()).serialize(context, ((AbstractC0948n2.u) value).c());
        }
        if (value instanceof AbstractC0948n2.v) {
            return ((AbstractC1055t2.c) this.f7256a.k1().getValue()).serialize(context, ((AbstractC0948n2.v) value).c());
        }
        throw new W1.m();
    }
}
