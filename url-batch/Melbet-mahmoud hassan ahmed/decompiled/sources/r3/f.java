package r3;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.api.Scope;
import r3.i;

/* loaded from: classes.dex */
public class f extends s3.a {

    @RecentlyNonNull
    public static final Parcelable.Creator<f> CREATOR = new y0();

    /* renamed from: f, reason: collision with root package name */
    final int f21260f;

    /* renamed from: g, reason: collision with root package name */
    final int f21261g;

    /* renamed from: h, reason: collision with root package name */
    int f21262h;

    /* renamed from: i, reason: collision with root package name */
    String f21263i;

    /* renamed from: j, reason: collision with root package name */
    IBinder f21264j;

    /* renamed from: k, reason: collision with root package name */
    Scope[] f21265k;

    /* renamed from: l, reason: collision with root package name */
    Bundle f21266l;

    /* renamed from: m, reason: collision with root package name */
    Account f21267m;

    /* renamed from: n, reason: collision with root package name */
    o3.d[] f21268n;

    /* renamed from: o, reason: collision with root package name */
    o3.d[] f21269o;

    /* renamed from: p, reason: collision with root package name */
    boolean f21270p;

    /* renamed from: q, reason: collision with root package name */
    int f21271q;

    /* renamed from: r, reason: collision with root package name */
    boolean f21272r;

    /* renamed from: s, reason: collision with root package name */
    private final String f21273s;

    f(int i7, int i8, int i9, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, o3.d[] dVarArr, o3.d[] dVarArr2, boolean z6, int i10, boolean z7, String str2) {
        this.f21260f = i7;
        this.f21261g = i8;
        this.f21262h = i9;
        if ("com.google.android.gms".equals(str)) {
            this.f21263i = "com.google.android.gms";
        } else {
            this.f21263i = str;
        }
        if (i7 < 2) {
            this.f21267m = iBinder != null ? a.O0(i.a.q0(iBinder)) : null;
        } else {
            this.f21264j = iBinder;
            this.f21267m = account;
        }
        this.f21265k = scopeArr;
        this.f21266l = bundle;
        this.f21268n = dVarArr;
        this.f21269o = dVarArr2;
        this.f21270p = z6;
        this.f21271q = i10;
        this.f21272r = z7;
        this.f21273s = str2;
    }

    public f(int i7, String str) {
        this.f21260f = 6;
        this.f21262h = o3.f.f19857a;
        this.f21261g = i7;
        this.f21270p = true;
        this.f21273s = str;
    }

    @RecentlyNullable
    public final String c() {
        return this.f21273s;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i7) {
        y0.a(this, parcel, i7);
    }
}
