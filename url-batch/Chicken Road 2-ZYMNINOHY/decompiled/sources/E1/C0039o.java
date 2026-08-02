package E1;

import org.json.JSONObject;

/* renamed from: E1.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0039o {

    /* renamed from: a, reason: collision with root package name */
    public final int f637a;

    /* renamed from: b, reason: collision with root package name */
    public final int f638b;

    public C0039o(JSONObject jSONObject) {
        this.f637a = jSONObject.getInt("commitmentPaymentsCount");
        this.f638b = jSONObject.optInt("subsequentCommitmentPaymentsCount");
    }
}
