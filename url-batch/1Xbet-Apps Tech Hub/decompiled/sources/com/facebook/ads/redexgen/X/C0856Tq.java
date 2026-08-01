package com.facebook.ads.redexgen.X;

import android.content.DialogInterface;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Tq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0856Tq extends K8 {
    public static String[] A02 = {"r", "tRYI", "7UJuVMqBcP2QEoAe5I9ReZPElv0qEy55", "leQvAr8Bdm", "IrxDcEzjLLQBxw", "x58zC904VQqUCNnuzCjkyAfM", "58DZzAqOGTGaE", "1xO3"};
    public final /* synthetic */ DialogInterface A00;
    public final /* synthetic */ DialogInterfaceOnClickListenerC0641Li A01;

    public C0856Tq(DialogInterfaceOnClickListenerC0641Li dialogInterfaceOnClickListenerC0641Li, DialogInterface dialogInterface) {
        this.A01 = dialogInterfaceOnClickListenerC0641Li;
        this.A00 = dialogInterface;
    }

    @Override // com.facebook.ads.redexgen.X.K8
    public final void A06() {
        InterfaceC0770Qh interfaceC0770Qh;
        InterfaceC0770Qh interfaceC0770Qh2;
        Y9 y9;
        Map<? extends String, ? extends String> A022;
        interfaceC0770Qh = this.A01.A01.A02;
        if (interfaceC0770Qh != null) {
            interfaceC0770Qh2 = this.A01.A01.A02;
            y9 = this.A01.A01.A00;
            String A03 = C0598Jo.A03(y9);
            C0784Qv c0784Qv = new C0784Qv();
            A022 = this.A01.A01.A02(this.A01.A00.getText().toString());
            interfaceC0770Qh2.ADp(A03, c0784Qv.A05(A022).A08());
        }
        DialogInterface dialogInterface = this.A00;
        if (A02[6].length() != 13) {
            throw new RuntimeException();
        }
        A02[6] = "1hADnGgCLejuT";
        dialogInterface.cancel();
    }
}
