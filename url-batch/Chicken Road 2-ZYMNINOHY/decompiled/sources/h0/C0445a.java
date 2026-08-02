package h0;

import E1.P;
import W.J;
import android.net.Uri;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.List;
import t0.C1427b;

/* renamed from: h0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0445a implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0447c f9041a;

    public C0445a(C0447c c0447c) {
        this.f9041a = c0447c;
    }

    @Override // h0.t
    public final void a() {
        this.f9041a.f9058e.remove(this);
    }

    @Override // h0.t
    public final boolean c(Uri uri, P p2, boolean z) {
        C0446b c0446b;
        C0447c c0447c = this.f9041a;
        HashMap hashMap = c0447c.f9057d;
        if (c0447c.f9065l == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            o oVar = c0447c.f9063j;
            String str = J.f3263a;
            List list = oVar.f9158e;
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                C0446b c0446b2 = (C0446b) hashMap.get(((n) list.get(i5)).f9150a);
                if (c0446b2 != null && elapsedRealtime < c0446b2.f9049h) {
                    i4++;
                }
            }
            u0.h hVar = new u0.h(1, 0, c0447c.f9063j.f9158e.size(), i4);
            c0447c.f9056c.getClass();
            g1.e f4 = C1427b.f(hVar, p2);
            if (f4 != null && f4.f9026a == 2 && (c0446b = (C0446b) hashMap.get(uri)) != null) {
                return C0446b.a(c0446b, f4.f9027b);
            }
        }
        return false;
    }
}
