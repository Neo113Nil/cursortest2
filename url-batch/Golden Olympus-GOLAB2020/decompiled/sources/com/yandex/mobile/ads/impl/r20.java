package com.yandex.mobile.ads.impl;

import com.ironsource.b9;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
final class r20 extends kotlin.jvm.internal.s implements Function2<JSONObject, i20, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ s20 f31000b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ List<h20> f31001c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r20(s20 s20Var, ArrayList arrayList) {
        super(2);
        this.f31000b = s20Var;
        this.f31001c = arrayList;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        JSONObject node = (JSONObject) obj;
        i20 type = (i20) obj2;
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f31000b.getClass();
        String str = null;
        if (node.has("view_name")) {
            Intrinsics.checkNotNullParameter(node, "<this>");
            Intrinsics.checkNotNullParameter("view_name", b9.h.f15463W);
            try {
                obj3 = node.get("view_name");
            } catch (JSONException unused) {
                obj3 = null;
            }
            if (obj3 instanceof String) {
                str = (String) obj3;
            }
        }
        if (str != null) {
            this.f31001c.add(new h20(type, str));
        }
        return Unit.f41027a;
    }
}
