package u2;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.ads.a60;
import com.google.android.gms.internal.ads.b60;
import com.google.android.gms.internal.ads.tx;
import com.google.android.gms.internal.ads.ux;

@Deprecated
/* loaded from: classes.dex */
public final class g extends s3.a {

    @RecentlyNonNull
    public static final Parcelable.Creator<g> CREATOR = new m();

    /* renamed from: f, reason: collision with root package name */
    private final boolean f22477f;

    /* renamed from: g, reason: collision with root package name */
    private final ux f22478g;

    /* renamed from: h, reason: collision with root package name */
    private final IBinder f22479h;

    g(boolean z6, IBinder iBinder, IBinder iBinder2) {
        this.f22477f = z6;
        this.f22478g = iBinder != null ? tx.s6(iBinder) : null;
        this.f22479h = iBinder2;
    }

    public final ux c() {
        return this.f22478g;
    }

    public final b60 g() {
        IBinder iBinder = this.f22479h;
        if (iBinder == null) {
            return null;
        }
        return a60.s6(iBinder);
    }

    public final boolean h() {
        return this.f22477f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i7) {
        int a7 = s3.c.a(parcel);
        s3.c.c(parcel, 1, this.f22477f);
        ux uxVar = this.f22478g;
        s3.c.g(parcel, 2, uxVar == null ? null : uxVar.asBinder(), false);
        s3.c.g(parcel, 3, this.f22479h, false);
        s3.c.b(parcel, a7);
    }
}
