package com.ironsource;

import com.ironsource.mediationsdk.e;
import java.net.URL;
import org.json.JSONObject;

/* renamed from: com.ironsource.h5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1478h5 extends e.a {
    public C1478h5(InterfaceC1555s4 interfaceC1555s4, URL url, JSONObject jSONObject, boolean z4, int i4, long j4, boolean z5, boolean z6, int i5) {
        super(interfaceC1555s4, url, jSONObject, z4, i4, j4, z5, z6, i5);
    }

    @Override // com.ironsource.mediationsdk.e.a
    protected void a(boolean z4, InterfaceC1555s4 interfaceC1555s4, long j4) {
        try {
            if (z4) {
                ((InterfaceC1429a5) interfaceC1555s4).a(this.f17554b, this.f17558f + 1, j4, this.f17562j, this.f17561i);
            } else {
                interfaceC1555s4.a(this.f17555c, this.f17556d, this.f17558f + 1, this.f17559g, j4);
            }
        } catch (Exception e4) {
            o9.d().a(e4);
            interfaceC1555s4.a(1009, e4.getMessage(), this.f17558f + 1, this.f17559g, j4);
        }
    }
}
