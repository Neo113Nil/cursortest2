package com.onevcat.uniwebview.internal.obfuscated;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.onevcat.uniwebview.internal.obfuscated.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0086n0 implements q3 {
    public final C0090o0 a;

    public C0086n0(C0090o0 popupProvider) {
        Intrinsics.checkNotNullParameter(popupProvider, "popupProvider");
        this.a = popupProvider;
    }

    @Override // com.onevcat.uniwebview.internal.obfuscated.q3
    public final void a() {
    }

    @Override // com.onevcat.uniwebview.internal.obfuscated.q3
    public final void a(String parameters) {
        com.onevcat.uniwebview.a aVar = (com.onevcat.uniwebview.a) this.a.invoke();
        if (aVar == null) {
            return;
        }
        H3 method = H3.PageStarted;
        String parameters2 = parameters == null ? "" : parameters;
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(parameters2, "parameters");
        aVar.j.a(method, parameters2);
        H3 method2 = H3.PageCommitted;
        if (parameters == null) {
            parameters = "";
        }
        Intrinsics.checkNotNullParameter(method2, "method");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        aVar.j.a(method2, parameters);
    }

    @Override // com.onevcat.uniwebview.internal.obfuscated.q3
    public final void a(String str, int i) {
        com.onevcat.uniwebview.a aVar = (com.onevcat.uniwebview.a) this.a.invoke();
        if (aVar == null) {
            return;
        }
        String valueOf = String.valueOf(i);
        if (str == null) {
            str = "";
        }
        aVar.a(H3.PageFinished, new v3("", valueOf, str, null));
    }

    @Override // com.onevcat.uniwebview.internal.obfuscated.q3
    public final void a(v3 payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        com.onevcat.uniwebview.a aVar = (com.onevcat.uniwebview.a) this.a.invoke();
        if (aVar == null) {
            return;
        }
        aVar.a(H3.PageErrorReceived, payload);
    }
}
