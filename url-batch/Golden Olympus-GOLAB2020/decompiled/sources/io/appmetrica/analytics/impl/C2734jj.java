package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.jj, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2734jj extends AbstractC2601eh {

    /* renamed from: b, reason: collision with root package name */
    public final Hf f39290b;

    public C2734jj(@NonNull C2953s5 c2953s5) {
        this(c2953s5, Ia.j().s());
    }

    @Override // io.appmetrica.analytics.impl.AbstractC2601eh
    public final boolean a(@NonNull C2773l6 c2773l6) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(c2773l6.getValue()).optJSONObject("preloadInfo");
        } catch (Throwable unused) {
            jSONObject = null;
        }
        this.f39290b.b(Ef.a(jSONObject));
        return false;
    }

    public C2734jj(C2953s5 c2953s5, Hf hf) {
        super(c2953s5);
        this.f39290b = hf;
    }
}
