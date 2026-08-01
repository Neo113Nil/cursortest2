package com.facebook.ads.redexgen.X;

import java.util.Collection;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.ax, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1076ax implements InterfaceC01390j {
    public final /* synthetic */ YA A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ JSONObject A02;

    public C1076ax(JSONObject jSONObject, YA ya, String str) {
        this.A02 = jSONObject;
        this.A00 = ya;
        this.A01 = str;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01390j
    public final String A6N() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01390j
    public final Collection<String> A6g() {
        return C01400k.A03(this.A00, this.A02);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01390j
    public final EnumC01380i A77() {
        return C01400k.A00(this.A02);
    }
}
