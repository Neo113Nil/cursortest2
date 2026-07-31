package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.oe2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ge2 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f26118a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ag2 f26119b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final fg2 f26120c;

    public ge2(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f26118a = context.getApplicationContext();
        this.f26119b = new ag2();
        this.f26120c = new fg2();
    }

    public final void a(@NotNull List<String> rawUrls, @Nullable Map<String, String> macros) {
        Intrinsics.checkNotNullParameter(rawUrls, "rawUrls");
        ArrayList trackingUrls = new ArrayList(CollectionsKt.collectionSizeOrDefault(rawUrls, 10));
        Iterator<T> it = rawUrls.iterator();
        while (true) {
            if (!it.hasNext()) {
                this.f26120c.getClass();
                Intrinsics.checkNotNullParameter(trackingUrls, "trackingUrls");
                ArrayList arrayList = new ArrayList();
                int size = trackingUrls.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = trackingUrls.get(i4);
                    i4++;
                    if (!Intrinsics.areEqual((String) obj, "about:blank")) {
                        arrayList.add(obj);
                    }
                }
                int size2 = arrayList.size();
                while (r2 < size2) {
                    Object obj2 = arrayList.get(r2);
                    r2++;
                    oe2.a aVar = oe2.f30007c;
                    Context applicationContext = this.f26118a;
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
                    aVar.a(applicationContext).a((String) obj2);
                }
                return;
            }
            String url = (String) it.next();
            r2 = macros != null ? 1 : 0;
            if (r2 == 1) {
                this.f26119b.getClass();
                Intrinsics.checkNotNullParameter(url, "url");
                Intrinsics.checkNotNullParameter(macros, "macros");
                String str = url;
                for (Map.Entry<String, String> entry : macros.entrySet()) {
                    str = StringsKt.G(str, entry.getKey(), entry.getValue(), false, 4, null);
                }
                url = str;
            } else if (r2 != 0) {
                throw new W1.m();
            }
            trackingUrls.add(url);
        }
    }
}
