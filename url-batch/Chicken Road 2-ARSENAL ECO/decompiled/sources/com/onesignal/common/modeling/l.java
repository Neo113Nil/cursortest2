package com.onesignal.common.modeling;

import f2.InterfaceC0365b;
import org.json.JSONObject;
import x5.InterfaceC0732a;

/* loaded from: classes.dex */
public class l extends k {
    private final InterfaceC0732a _create;

    public /* synthetic */ l(InterfaceC0732a interfaceC0732a, String str, InterfaceC0365b interfaceC0365b, int i7, kotlin.jvm.internal.e eVar) {
        this(interfaceC0732a, (i7 & 2) != 0 ? null : str, (i7 & 4) != 0 ? null : interfaceC0365b);
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
    public l(InterfaceC0732a _create, String str, InterfaceC0365b interfaceC0365b) {
        super(str, interfaceC0365b);
        kotlin.jvm.internal.i.e(_create, "_create");
        this._create = _create;
        load();
    }
}
