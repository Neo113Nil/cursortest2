package com.yandex.div.internal.core;

import O1.Ab;
import O1.Bc;
import O1.C0720a7;
import O1.C0886jc;
import O1.C0887jd;
import O1.C0939mb;
import O1.C0970o6;
import O1.C1013qd;
import O1.C1039s4;
import O1.C1060t7;
import O1.C1167z6;
import O1.E9;
import O1.Ef;
import O1.G6;
import O1.H3;
import O1.Kd;
import O1.O6;
import O1.R3;
import O1.Z;
import W1.m;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.ironsource.mediationsdk.metadata.a;
import com.yandex.div.core.DivViewFacade;
import com.yandex.div.core.expression.ExpressionResolverImpl;
import com.yandex.div.core.expression.local.UtilsKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public abstract class DivCollectionExtensionsKt {
    @NotNull
    public static final List<DivItemBuilderResult> build(@NotNull H3 h32, @Nullable DivViewFacade divViewFacade, @NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(h32, "<this>");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        JSONArray jSONArray = (JSONArray) h32.f2947a.evaluate(resolver);
        int length = jSONArray.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i4 = 0; i4 < length; i4++) {
            Object obj = jSONArray.get(i4);
            Intrinsics.checkNotNullExpressionValue(obj, "get(i)");
            DivItemBuilderResult buildItem = buildItem(h32, divViewFacade, obj, i4, resolver);
            if (buildItem != null) {
                arrayList.add(buildItem);
            }
        }
        return arrayList;
    }

    private static final DivItemBuilderResult buildItem(H3 h32, DivViewFacade divViewFacade, Object obj, int i4, ExpressionResolver expressionResolver) {
        Object obj2;
        ExpressionResolver itemResolver = getItemResolver(h32, divViewFacade, obj, i4, expressionResolver);
        if (itemResolver == null) {
            return null;
        }
        Iterator it = h32.f2949c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (((Boolean) ((H3.c) obj2).f2957c.evaluate(itemResolver)).booleanValue()) {
                break;
            }
        }
        H3.c cVar = (H3.c) obj2;
        if (cVar == null) {
            return null;
        }
        Z z4 = cVar.f2955a;
        Expression expression = cVar.f2956b;
        return toItemBuilderResult(copy(z4, expression != null ? (String) expression.evaluate(itemResolver) : null), itemResolver);
    }

    @NotNull
    public static final List<DivItemBuilderResult> buildItems(@NotNull R3 r32, @Nullable DivViewFacade divViewFacade, @NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(r32, "<this>");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        return buildItems(divViewFacade, r32.f4510A, r32.f4563z, resolver);
    }

    private static final Z copy(Z z4, String str) {
        C1039s4 A4;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        if (z4 instanceof Z.h) {
            return new Z.h(O6.B(((Z.h) z4).c(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -67108865, 8388607, null));
        }
        if (z4 instanceof Z.f) {
            return new Z.f(C1167z6.B(((Z.f) z4).c(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16777217, 262143, null));
        }
        if (z4 instanceof Z.r) {
            return new Z.r(Kd.B(((Z.r) z4).c(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1073741825, -1, 31, null));
        }
        if (z4 instanceof Z.m) {
            return new Z.m(Ab.B(((Z.m) z4).c(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2097153, 2047, null));
        }
        if (z4 instanceof Z.c) {
            Z.c cVar = (Z.c) z4;
            R3 c4 = cVar.c();
            List list = cVar.c().f4510A;
            if (list != null) {
                List list2 = list;
                ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList5.add(copy$default((Z) it.next(), null, 1, null));
                }
                arrayList4 = arrayList5;
            } else {
                arrayList4 = null;
            }
            return new Z.c(R3.B(c4, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str, null, arrayList4, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -83886081, 1048575, null));
        }
        if (z4 instanceof Z.g) {
            Z.g gVar = (Z.g) z4;
            G6 c5 = gVar.c();
            List list3 = gVar.c().f2887y;
            if (list3 != null) {
                List list4 = list3;
                ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
                Iterator it2 = list4.iterator();
                while (it2.hasNext()) {
                    arrayList6.add(copy$default((Z) it2.next(), null, 1, null));
                }
                arrayList3 = arrayList6;
            } else {
                arrayList3 = null;
            }
            return new Z.g(G6.B(c5, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str, arrayList3, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -25165825, 16383, null));
        }
        if (z4 instanceof Z.e) {
            Z.e eVar = (Z.e) z4;
            C0970o6 c6 = eVar.c();
            List list5 = eVar.c().f7311u;
            if (list5 != null) {
                List list6 = list5;
                ArrayList arrayList7 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list6, 10));
                Iterator it3 = list6.iterator();
                while (it3.hasNext()) {
                    arrayList7.add(copy$default((Z) it3.next(), null, 1, null));
                }
                arrayList2 = arrayList7;
            } else {
                arrayList2 = null;
            }
            return new Z.e(C0970o6.B(c6, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str, null, null, arrayList2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1179649, 2047, null));
        }
        if (z4 instanceof Z.k) {
            Z.k kVar = (Z.k) z4;
            E9 c7 = kVar.c();
            List list7 = kVar.c().f2594t;
            if (list7 != null) {
                List list8 = list7;
                ArrayList arrayList8 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list8, 10));
                Iterator it4 = list8.iterator();
                while (it4.hasNext()) {
                    arrayList8.add(copy$default((Z) it4.next(), null, 1, null));
                }
                arrayList = arrayList8;
            } else {
                arrayList = null;
            }
            return new Z.k(E9.B(c7, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str, null, null, null, arrayList, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -557057, 2047, null));
        }
        if (z4 instanceof Z.q) {
            Z.q qVar = (Z.q) z4;
            C1013qd c8 = qVar.c();
            List<C1013qd.c> list9 = qVar.c().f7630q;
            ArrayList arrayList9 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list9, 10));
            for (C1013qd.c cVar2 : list9) {
                arrayList9.add(C1013qd.c.b(cVar2, copy$default(cVar2.f7643a, null, 1, null), null, null, 6, null));
            }
            return new Z.q(C1013qd.B(c8, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str, arrayList9, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -98305, 2047, null));
        }
        if (z4 instanceof Z.o) {
            Z.o oVar = (Z.o) z4;
            Bc c9 = oVar.c();
            List<Bc.c> list10 = oVar.c().f1529y;
            ArrayList arrayList10 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list10, 10));
            for (Bc.c cVar3 : list10) {
                Z z5 = cVar3.f1536c;
                arrayList10.add(Bc.c.b(cVar3, null, null, z5 != null ? copy$default(z5, null, 1, null) : null, null, null, 27, null));
            }
            return new Z.o(Bc.B(c9, null, null, null, null, null, null, null, null, null, null, null, str, null, null, null, null, str, null, null, null, null, null, null, null, arrayList10, null, null, null, null, null, null, null, null, null, null, null, null, null, -16844801, 63, null));
        }
        if (z4 instanceof Z.d) {
            A4 = r2.A((r71 & 1) != 0 ? r2.d() : null, (r71 & 2) != 0 ? r2.l() : null, (r71 & 4) != 0 ? r2.s() : null, (r71 & 8) != 0 ? r2.v() : null, (r71 & 16) != 0 ? r2.u() : null, (r71 & 32) != 0 ? r2.getBackground() : null, (r71 & 64) != 0 ? r2.w() : null, (r71 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? r2.e() : null, (r71 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? r2.f7833i : null, (r71 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? r2.f7834j : null, (r71 & 1024) != 0 ? r2.a() : null, (r71 & a.f17688n) != 0 ? r2.getExtensions() : null, (r71 & Base64Utils.IO_BUFFER_SIZE) != 0 ? r2.x() : null, (r71 & 8192) != 0 ? r2.r() : null, (r71 & 16384) != 0 ? r2.getHeight() : null, (r71 & 32768) != 0 ? r2.getId() : str, (r71 & 65536) != 0 ? r2.f7841q : null, (r71 & 131072) != 0 ? r2.m() : null, (r71 & 262144) != 0 ? r2.g() : null, (r71 & 524288) != 0 ? r2.i() : null, (r71 & 1048576) != 0 ? r2.n() : null, (r71 & 2097152) != 0 ? r2.h() : null, (r71 & 4194304) != 0 ? r2.k() : null, (r71 & 8388608) != 0 ? r2.p() : null, (r71 & 16777216) != 0 ? r2.b() : null, (r71 & 33554432) != 0 ? r2.z() : null, (r71 & 67108864) != 0 ? r2.t() : null, (r71 & 134217728) != 0 ? r2.y() : null, (r71 & 268435456) != 0 ? r2.j() : null, (r71 & 536870912) != 0 ? r2.o() : null, (r71 & 1073741824) != 0 ? r2.f() : null, (r71 & Integer.MIN_VALUE) != 0 ? r2.getVisibility() : null, (r72 & 1) != 0 ? r2.q() : null, (r72 & 2) != 0 ? r2.c() : null, (r72 & 4) != 0 ? ((Z.d) z4).c().getWidth() : null);
            return new Z.d(A4);
        }
        if (z4 instanceof Z.i) {
            return new Z.i(C0720a7.B(((Z.i) z4).c(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -131073, 4095, null));
        }
        if (z4 instanceof Z.n) {
            return new Z.n(C0886jc.B(((Z.n) z4).c(), null, null, null, null, null, null, null, null, null, null, null, null, null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8193, 32767, null));
        }
        if (z4 instanceof Z.j) {
            return new Z.j(C1060t7.B(((Z.j) z4).c(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -67108865, 134217727, null));
        }
        if (z4 instanceof Z.l) {
            return new Z.l(C0939mb.B(((Z.l) z4).c(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2097153, 8191, null));
        }
        if (z4 instanceof Z.s) {
            return new Z.s(Ef.B(((Z.s) z4).c(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -524289, 32767, null));
        }
        if (z4 instanceof Z.p) {
            return new Z.p(C0887jd.B(((Z.p) z4).c(), null, null, null, null, null, null, null, null, null, null, null, null, null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8193, 7, null));
        }
        throw new m();
    }

    static /* synthetic */ Z copy$default(Z z4, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = z4.b().getId();
        }
        return copy(z4, str);
    }

    @NotNull
    public static final ExpressionResolver getItemResolver(@NotNull H3 h32, @Nullable DivViewFacade divViewFacade, @NotNull ExpressionResolver resolver) {
        ExpressionResolver itemResolver;
        Intrinsics.checkNotNullParameter(h32, "<this>");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        JSONArray jSONArray = (JSONArray) h32.f2947a.evaluate(resolver);
        int length = jSONArray.length();
        for (int i4 = 0; i4 < length; i4++) {
            Object obj = jSONArray.get(i4);
            if (obj != null && (itemResolver = getItemResolver(h32, divViewFacade, obj, i4, resolver)) != null) {
                return itemResolver;
            }
        }
        return resolver;
    }

    @NotNull
    public static final List<Z> getNonNullItems(@NotNull C1039s4 c1039s4) {
        Intrinsics.checkNotNullParameter(c1039s4, "<this>");
        List<Z> list = c1039s4.f7841q;
        return list == null ? CollectionsKt.emptyList() : list;
    }

    @NotNull
    public static final List<DivItemBuilderResult> itemsToDivItemBuilderResult(@NotNull G6 g6, @NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(g6, "<this>");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        return toDivItemBuilderResult(getNonNullItems(g6), resolver);
    }

    @NotNull
    public static final List<DivItemBuilderResult> statesToDivItemBuilderResult(@NotNull Bc bc, @NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(bc, "<this>");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        List list = bc.f1529y;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Z z4 = ((Bc.c) it.next()).f1536c;
            DivItemBuilderResult itemBuilderResult = z4 != null ? toItemBuilderResult(z4, resolver) : null;
            if (itemBuilderResult != null) {
                arrayList.add(itemBuilderResult);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<DivItemBuilderResult> toDivItemBuilderResult(@NotNull List<? extends Z> list, @NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        List<? extends Z> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(toItemBuilderResult((Z) it.next(), resolver));
        }
        return arrayList;
    }

    @NotNull
    public static final DivItemBuilderResult toItemBuilderResult(@NotNull Z z4, @NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(z4, "<this>");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        return new DivItemBuilderResult(z4, resolver);
    }

    @NotNull
    public static final List<DivItemBuilderResult> buildItems(@NotNull C0970o6 c0970o6, @Nullable DivViewFacade divViewFacade, @NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(c0970o6, "<this>");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        return buildItems(divViewFacade, c0970o6.f7311u, c0970o6.f7309s, resolver);
    }

    @NotNull
    public static final List<Z> getNonNullItems(@NotNull G6 g6) {
        Intrinsics.checkNotNullParameter(g6, "<this>");
        List<Z> list = g6.f2887y;
        return list == null ? CollectionsKt.emptyList() : list;
    }

    @NotNull
    public static final List<DivItemBuilderResult> itemsToDivItemBuilderResult(@NotNull C1013qd c1013qd, @NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(c1013qd, "<this>");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        List list = c1013qd.f7630q;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(toItemBuilderResult(((C1013qd.c) it.next()).f7643a, resolver));
        }
        return arrayList;
    }

    @NotNull
    public static final List<DivItemBuilderResult> buildItems(@NotNull E9 e9, @Nullable DivViewFacade divViewFacade, @NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(e9, "<this>");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        return buildItems(divViewFacade, e9.f2594t, e9.f2592r, resolver);
    }

    private static final List<DivItemBuilderResult> buildItems(DivViewFacade divViewFacade, List<? extends Z> list, H3 h32, ExpressionResolver expressionResolver) {
        List<DivItemBuilderResult> build;
        if (h32 != null && (build = build(h32, divViewFacade, expressionResolver)) != null) {
            return build;
        }
        if (list != null) {
            return toDivItemBuilderResult(list, expressionResolver);
        }
        return CollectionsKt.emptyList();
    }

    private static final ExpressionResolver getItemResolver(H3 h32, DivViewFacade divViewFacade, Object obj, int i4, ExpressionResolver expressionResolver) {
        ExpressionResolverImpl asImpl = UtilsKt.getAsImpl(expressionResolver);
        if (asImpl == null) {
            return expressionResolver;
        }
        JSONObject validateItemBuilderDataElement = asImpl.validateItemBuilderDataElement(obj, i4);
        if (validateItemBuilderDataElement == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(':');
        sb.append(i4);
        String sb2 = sb.toString();
        return asImpl.getRuntimeStore().getOrPutItemBuilderResolver(asImpl.getPath() + '/' + sb2, expressionResolver, new DivCollectionExtensionsKt$getItemResolver$2(h32, validateItemBuilderDataElement, i4, asImpl, sb2));
    }
}
