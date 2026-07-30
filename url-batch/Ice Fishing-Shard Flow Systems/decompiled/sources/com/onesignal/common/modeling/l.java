package com.onesignal.common.modeling;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class l extends k {
    private final Function0<i> _create;

    public /* synthetic */ l(Function0 function0, String str, H2.b bVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : bVar);
    }

    @Override // com.onesignal.common.modeling.k, com.onesignal.common.modeling.c
    public i create(JSONObject jSONObject) {
        i iVar = (i) this._create.invoke();
        if (jSONObject != null) {
            iVar.initializeFromJson(jSONObject);
        }
        return iVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Function0<i> _create, String str, H2.b bVar) {
        super(str, bVar);
        Intrinsics.checkNotNullParameter(_create, "_create");
        this._create = _create;
        load();
    }
}
