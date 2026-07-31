package com.yandex.div.core.expression.variables;

import O1.AbstractC1176zf;
import W1.m;
import android.net.Uri;
import com.yandex.div.data.Variable;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public abstract class DivVariablesParserKt {
    @NotNull
    public static final Variable toVariable(@NotNull AbstractC1176zf abstractC1176zf, @NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(abstractC1176zf, "<this>");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        if (abstractC1176zf instanceof AbstractC1176zf.b) {
            AbstractC1176zf.b bVar = (AbstractC1176zf.b) abstractC1176zf;
            return new Variable.BooleanVariable(bVar.c().f7434a, ((Boolean) bVar.c().f7435b.evaluate(resolver)).booleanValue());
        }
        if (abstractC1176zf instanceof AbstractC1176zf.g) {
            AbstractC1176zf.g gVar = (AbstractC1176zf.g) abstractC1176zf;
            return new Variable.IntegerVariable(gVar.c().f8502a, ((Number) gVar.c().f8503b.evaluate(resolver)).longValue());
        }
        if (abstractC1176zf instanceof AbstractC1176zf.h) {
            AbstractC1176zf.h hVar = (AbstractC1176zf.h) abstractC1176zf;
            return new Variable.DoubleVariable(hVar.c().f3283a, ((Number) hVar.c().f3284b.evaluate(resolver)).doubleValue());
        }
        if (abstractC1176zf instanceof AbstractC1176zf.i) {
            AbstractC1176zf.i iVar = (AbstractC1176zf.i) abstractC1176zf;
            return new Variable.StringVariable(iVar.c().f5984a, (String) iVar.c().f5985b.evaluate(resolver));
        }
        if (abstractC1176zf instanceof AbstractC1176zf.c) {
            AbstractC1176zf.c cVar = (AbstractC1176zf.c) abstractC1176zf;
            return new Variable.ColorVariable(cVar.c().f8666a, ((Number) cVar.c().f8667b.evaluate(resolver)).intValue());
        }
        if (abstractC1176zf instanceof AbstractC1176zf.j) {
            AbstractC1176zf.j jVar = (AbstractC1176zf.j) abstractC1176zf;
            return new Variable.UrlVariable(jVar.c().f7109a, (Uri) jVar.c().f7110b.evaluate(resolver));
        }
        if (abstractC1176zf instanceof AbstractC1176zf.f) {
            AbstractC1176zf.f fVar = (AbstractC1176zf.f) abstractC1176zf;
            return new Variable.DictVariable(fVar.c().f4900a, (JSONObject) fVar.c().f4901b.evaluate(resolver));
        }
        if (!(abstractC1176zf instanceof AbstractC1176zf.a)) {
            throw new m();
        }
        AbstractC1176zf.a aVar = (AbstractC1176zf.a) abstractC1176zf;
        return new Variable.ArrayVariable(aVar.c().f6155a, (JSONArray) aVar.c().f6156b.evaluate(resolver));
    }
}
