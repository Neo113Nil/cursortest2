package s2;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import r2.h;
import r2.l;
import r2.w;
import r2.x;
import r3.o;

/* loaded from: classes.dex */
public final class b extends l {
    public b(@RecentlyNonNull Context context) {
        super(context, 0);
        o.j(context, "Context cannot be null");
    }

    public void e(@RecentlyNonNull a aVar) {
        this.f21166f.o(aVar.a());
    }

    @RecentlyNullable
    public h[] getAdSizes() {
        return this.f21166f.a();
    }

    @RecentlyNullable
    public e getAppEventListener() {
        return this.f21166f.k();
    }

    @RecentlyNonNull
    public w getVideoController() {
        return this.f21166f.i();
    }

    @RecentlyNullable
    public x getVideoOptions() {
        return this.f21166f.j();
    }

    public void setAdSizes(@RecentlyNonNull h... hVarArr) {
        if (hVarArr == null || hVarArr.length <= 0) {
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }
        this.f21166f.u(hVarArr);
    }

    public void setAppEventListener(e eVar) {
        this.f21166f.w(eVar);
    }

    public void setManualImpressionsEnabled(boolean z6) {
        this.f21166f.x(z6);
    }

    public void setVideoOptions(@RecentlyNonNull x xVar) {
        this.f21166f.z(xVar);
    }
}
