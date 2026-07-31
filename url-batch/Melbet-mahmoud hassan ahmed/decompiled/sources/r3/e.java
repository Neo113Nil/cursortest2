package r3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;

/* loaded from: classes.dex */
public class e extends s3.a {

    @RecentlyNonNull
    public static final Parcelable.Creator<e> CREATOR = new x0();

    /* renamed from: f, reason: collision with root package name */
    private final q f21254f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f21255g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f21256h;

    /* renamed from: i, reason: collision with root package name */
    private final int[] f21257i;

    /* renamed from: j, reason: collision with root package name */
    private final int f21258j;

    /* renamed from: k, reason: collision with root package name */
    private final int[] f21259k;

    public e(@RecentlyNonNull q qVar, boolean z6, boolean z7, int[] iArr, int i7, int[] iArr2) {
        this.f21254f = qVar;
        this.f21255g = z6;
        this.f21256h = z7;
        this.f21257i = iArr;
        this.f21258j = i7;
        this.f21259k = iArr2;
    }

    public int c() {
        return this.f21258j;
    }

    @RecentlyNullable
    public int[] g() {
        return this.f21257i;
    }

    @RecentlyNullable
    public int[] h() {
        return this.f21259k;
    }

    public boolean i() {
        return this.f21255g;
    }

    public boolean j() {
        return this.f21256h;
    }

    @RecentlyNonNull
    public q k() {
        return this.f21254f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i7) {
        int a7 = s3.c.a(parcel);
        s3.c.l(parcel, 1, k(), i7, false);
        s3.c.c(parcel, 2, i());
        s3.c.c(parcel, 3, j());
        s3.c.i(parcel, 4, g(), false);
        s3.c.h(parcel, 5, c());
        s3.c.i(parcel, 6, h(), false);
        s3.c.b(parcel, a7);
    }
}
