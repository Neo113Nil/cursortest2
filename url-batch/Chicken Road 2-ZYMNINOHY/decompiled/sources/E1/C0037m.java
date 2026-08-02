package E1;

import com.google.android.gms.internal.play_billing.AbstractC0352w;
import com.google.android.gms.internal.play_billing.EnumC0331l;

/* renamed from: E1.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0037m {

    /* renamed from: a, reason: collision with root package name */
    public int f633a;

    /* renamed from: b, reason: collision with root package name */
    public int f634b;

    /* renamed from: c, reason: collision with root package name */
    public String f635c;

    public static C0036l a() {
        C0036l c0036l = new C0036l();
        c0036l.f631b = 0;
        c0036l.f632c = "";
        return c0036l;
    }

    public final String toString() {
        int i4 = this.f633a;
        int i5 = AbstractC0352w.f6025a;
        com.google.android.gms.internal.play_billing.C c4 = EnumC0331l.f5965c;
        Integer valueOf = Integer.valueOf(i4);
        return "Response Code: " + (!c4.containsKey(valueOf) ? EnumC0331l.RESPONSE_CODE_UNSPECIFIED : (EnumC0331l) c4.get(valueOf)).toString() + ", Debug Message: " + this.f635c;
    }
}
