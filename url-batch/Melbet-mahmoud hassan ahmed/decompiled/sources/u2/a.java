package u2;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.ads.a60;
import com.google.android.gms.internal.ads.b60;

/* loaded from: classes.dex */
public final class a extends s3.a {

    @RecentlyNonNull
    public static final Parcelable.Creator<a> CREATOR = new j();

    /* renamed from: f, reason: collision with root package name */
    private final boolean f22459f;

    /* renamed from: g, reason: collision with root package name */
    private final IBinder f22460g;

    a(boolean z6, IBinder iBinder) {
        this.f22459f = z6;
        this.f22460g = iBinder;
    }

    public boolean c() {
        return this.f22459f;
    }

    public final b60 g() {
        IBinder iBinder = this.f22460g;
        if (iBinder == null) {
            return null;
        }
        return a60.s6(iBinder);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i7) {
        int a7 = s3.c.a(parcel);
        s3.c.c(parcel, 1, c());
        s3.c.g(parcel, 2, this.f22460g, false);
        s3.c.b(parcel, a7);
    }
}
