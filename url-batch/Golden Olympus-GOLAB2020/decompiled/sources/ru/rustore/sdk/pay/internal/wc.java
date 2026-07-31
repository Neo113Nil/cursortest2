package ru.rustore.sdk.pay.internal;

import java.util.Map;
import ru.rustore.sdk.pay.model.InvoiceId;

/* loaded from: classes3.dex */
public final /* synthetic */ class wc {
    public static void a(Map map, String str, String str2, InvoiceId invoiceId, String str3) {
        map.put(str, str2);
        map.put(str3, invoiceId.getValue());
    }
}
