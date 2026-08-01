package com.onesignal.common.modeling;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class l extends k {
    private final Function0<i> _create;

    public /* synthetic */ l(Function0 function0, String str, qa.b bVar, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, (i3 & 2) != 0 ? null : str, (i3 & 4) != 0 ? null : bVar);
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
    public l(Function0<i> function0, String str, qa.b bVar) {
        super(str, bVar);
        function0.getClass();
        this._create = function0;
        load();
    }
}
