package h3;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.ads.rh0;
import com.google.android.gms.internal.ads.xz;
import r2.g;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final xz f16820a;

    public b(xz xzVar) {
        this.f16820a = xzVar;
    }

    public static void a(@RecentlyNonNull Context context, @RecentlyNonNull r2.b bVar, g gVar, @RecentlyNonNull c cVar) {
        new rh0(context, bVar, gVar == null ? null : gVar.a()).b(cVar);
    }

    @RecentlyNonNull
    public String b() {
        return this.f16820a.a();
    }
}
