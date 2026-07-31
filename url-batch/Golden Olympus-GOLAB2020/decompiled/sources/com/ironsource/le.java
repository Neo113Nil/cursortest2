package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public final class le {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final bk f17018a;

    public le(@NotNull bk globalDataWriter) {
        Intrinsics.checkNotNullParameter(globalDataWriter, "globalDataWriter");
        this.f17018a = globalDataWriter;
    }

    public final void a(@NotNull JSONObject metaDataJson) {
        Intrinsics.checkNotNullParameter(metaDataJson, "metaDataJson");
        if (metaDataJson.has(com.ironsource.mediationsdk.metadata.a.f17683i)) {
            try {
                Object remove = metaDataJson.remove(com.ironsource.mediationsdk.metadata.a.f17683i);
                Intrinsics.checkNotNull(remove, "null cannot be cast to non-null type java.util.ArrayList<*>{ kotlin.collections.TypeAliasesKt.ArrayList<*> }");
                ArrayList arrayList = (ArrayList) remove;
                if (arrayList.isEmpty()) {
                    return;
                }
                Object obj = arrayList.get(0);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                this.f17018a.d((String) obj);
            } catch (ClassCastException e4) {
                o9.d().a(e4);
                IronLog.INTERNAL.error("got the following error " + e4.getMessage());
            }
        }
    }
}
