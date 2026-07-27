package com.onesignal.user.internal.backend.impl;

import com.onesignal.user.internal.backend.PurchaseObject;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import org.json.JSONObject;
import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public final class JSONConverter$convertToJSON$1 extends j implements InterfaceC1441l {
    public static final JSONConverter$convertToJSON$1 INSTANCE = new JSONConverter$convertToJSON$1();

    public JSONConverter$convertToJSON$1() {
        super(1);
    }

    @Override // t4.InterfaceC1441l
    public final JSONObject invoke(PurchaseObject it) {
        i.e(it, "it");
        return new JSONObject().put("sku", it.getSku()).put("iso", it.getIso()).put("amount", it.getAmount().toString());
    }
}
