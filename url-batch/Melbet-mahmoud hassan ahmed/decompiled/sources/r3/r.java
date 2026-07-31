package r3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class r extends s3.a {

    @RecentlyNonNull
    public static final Parcelable.Creator<r> CREATOR = new v();

    /* renamed from: f, reason: collision with root package name */
    private final int f21322f;

    /* renamed from: g, reason: collision with root package name */
    private List<m> f21323g;

    public r(int i7, List<m> list) {
        this.f21322f = i7;
        this.f21323g = list;
    }

    public final int c() {
        return this.f21322f;
    }

    @RecentlyNullable
    public final List<m> g() {
        return this.f21323g;
    }

    public final void h(@RecentlyNonNull m mVar) {
        if (this.f21323g == null) {
            this.f21323g = new ArrayList();
        }
        this.f21323g.add(mVar);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i7) {
        int a7 = s3.c.a(parcel);
        s3.c.h(parcel, 1, this.f21322f);
        s3.c.q(parcel, 2, this.f21323g, false);
        s3.c.b(parcel, a7);
    }
}
