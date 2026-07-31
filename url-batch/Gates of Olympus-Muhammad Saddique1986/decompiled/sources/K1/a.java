package K1;

import B.Y;
import G1.m;
import G1.n;
import Q1.h;
import f2.j;
import java.util.Calendar;
import n2.AbstractC0730j;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Y f3256a;

    public /* synthetic */ a(Y y3) {
        this.f3256a = y3;
    }

    public static long a(boolean z3) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        if (z3) {
            calendar.set(5, 1);
        }
        return calendar.getTimeInMillis();
    }

    public Object b(J1.d dVar, h hVar) {
        String str = dVar.f3177c;
        if (AbstractC0730j.K(str)) {
            throw new IllegalArgumentException("Client name is required");
        }
        if (dVar.f3179e < 0.0d) {
            throw new IllegalArgumentException("Price must be positive");
        }
        if (dVar.f3181g == 0) {
            long currentTimeMillis = System.currentTimeMillis();
            j.f(str, "clientName");
            String str2 = dVar.f3178d;
            j.f(str2, "service");
            String str3 = dVar.f3180f;
            j.f(str3, "note");
            dVar = new J1.d(dVar.f3175a, dVar.f3176b, str, str2, dVar.f3179e, str3, currentTimeMillis);
        }
        Y y3 = this.f3256a;
        return ((m) ((G1.j) y3.f334d)).insert(new n(dVar.f3175a, dVar.f3176b, dVar.f3177c, dVar.f3178d, dVar.f3179e, dVar.f3180f, dVar.f3181g), hVar);
    }
}
