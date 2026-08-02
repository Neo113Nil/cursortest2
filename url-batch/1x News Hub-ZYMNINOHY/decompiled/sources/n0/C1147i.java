package n0;

import a0.C0130a;
import com.google.android.gms.internal.play_billing.AbstractC0248o0;
import com.google.android.gms.internal.play_billing.W;

/* renamed from: n0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1147i {

    /* renamed from: a, reason: collision with root package name */
    public int f10092a;

    /* renamed from: b, reason: collision with root package name */
    public String f10093b;

    public static C0130a a() {
        C0130a c0130a = new C0130a();
        c0130a.f1919a = "";
        return c0130a;
    }

    public final String toString() {
        int i3 = this.f10092a;
        int i4 = AbstractC0248o0.f2894a;
        W w3 = com.google.android.gms.internal.play_billing.L.f2757c;
        Integer valueOf = Integer.valueOf(i3);
        return "Response Code: " + (!w3.containsKey(valueOf) ? com.google.android.gms.internal.play_billing.L.RESPONSE_CODE_UNSPECIFIED : (com.google.android.gms.internal.play_billing.L) w3.get(valueOf)).toString() + ", Debug Message: " + this.f10093b;
    }
}
