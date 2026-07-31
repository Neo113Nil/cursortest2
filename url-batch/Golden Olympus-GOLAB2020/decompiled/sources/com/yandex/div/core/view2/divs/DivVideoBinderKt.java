package com.yandex.div.core.view2.divs;

import O1.Ef;
import O1.Mf;
import android.net.Uri;
import com.yandex.div.core.player.DivVideoResolution;
import com.yandex.div.core.player.DivVideoSource;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public abstract class DivVideoBinderKt {
    @NotNull
    public static final List<DivVideoSource> createSource(@NotNull Ef ef, @NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(ef, "<this>");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        List<Mf> list = ef.f2666Q;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (Mf mf : list) {
            Uri uri = (Uri) mf.f4060d.evaluate(resolver);
            String str = (String) mf.f4058b.evaluate(resolver);
            Mf.c cVar = mf.f4059c;
            Long l4 = null;
            DivVideoResolution divVideoResolution = cVar != null ? new DivVideoResolution((int) ((Number) cVar.f4066b.evaluate(resolver)).longValue(), (int) ((Number) cVar.f4065a.evaluate(resolver)).longValue()) : null;
            Expression expression = mf.f4057a;
            if (expression != null) {
                l4 = (Long) expression.evaluate(resolver);
            }
            arrayList.add(new DivVideoSource(uri, str, divVideoResolution, l4));
        }
        return arrayList;
    }
}
