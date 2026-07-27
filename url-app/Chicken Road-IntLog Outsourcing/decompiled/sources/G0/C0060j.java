package G0;

import com.google.android.gms.internal.play_billing.AbstractC0357o0;
import com.google.android.gms.internal.play_billing.X;

/* renamed from: G0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0060j {

    /* renamed from: a, reason: collision with root package name */
    public int f862a;

    /* renamed from: b, reason: collision with root package name */
    public String f863b;

    public static C0058h b() {
        C0058h c0058h = new C0058h();
        c0058h.f855b = "";
        return c0058h;
    }

    public final int a() {
        return this.f862a;
    }

    public final String toString() {
        int i2 = this.f862a;
        int i3 = AbstractC0357o0.f5220a;
        X x5 = com.google.android.gms.internal.play_billing.L.f5074c;
        Integer valueOf = Integer.valueOf(i2);
        return "Response Code: " + (!x5.containsKey(valueOf) ? com.google.android.gms.internal.play_billing.L.RESPONSE_CODE_UNSPECIFIED : (com.google.android.gms.internal.play_billing.L) x5.get(valueOf)).toString() + ", Debug Message: " + this.f863b;
    }
}
