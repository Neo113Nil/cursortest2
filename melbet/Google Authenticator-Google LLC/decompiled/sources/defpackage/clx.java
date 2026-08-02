package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class clx extends cri {
    public static final Parcelable.Creator CREATOR = new ckq(7);
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    private final Context g;

    public clx(String str, boolean z, boolean z2, IBinder iBinder, boolean z3, boolean z4, boolean z5) {
        csu cssVar;
        this.a = str;
        this.b = z;
        this.c = z2;
        if (iBinder == null) {
            cssVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            cssVar = queryLocalInterface instanceof csu ? (csu) queryLocalInterface : new css(iBinder);
        }
        this.g = (Context) cst.b(cssVar);
        this.d = z3;
        this.e = z4;
        this.f = z5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int q = oy.q(parcel, 20293);
        oy.I(parcel, 1, str);
        oy.s(parcel, 2, this.b);
        oy.s(parcel, 3, this.c);
        oy.C(parcel, 4, new cst(this.g));
        oy.s(parcel, 5, this.d);
        oy.s(parcel, 6, this.e);
        oy.s(parcel, 8, this.f);
        oy.r(parcel, q);
    }
}
