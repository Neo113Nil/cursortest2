package defpackage;

import android.app.ApplicationErrorReport;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cto extends cri {
    public static final Parcelable.Creator CREATOR = new ctp();
    public String a;
    public Bundle b;
    public String c;
    public final ApplicationErrorReport d;
    public String e;
    public BitmapTeleporter f;
    public final String g;
    public List h;
    public boolean i;
    public ctw j;
    public ctr k;
    public boolean l;
    public Bitmap m;
    public String n;
    public boolean o;
    public long p;
    public boolean q;
    public String r;
    public ctj s;
    public String t;
    public kee u;

    public cto(String str, Bundle bundle, String str2, ApplicationErrorReport applicationErrorReport, String str3, BitmapTeleporter bitmapTeleporter, String str4, List list, boolean z, ctw ctwVar, ctr ctrVar, boolean z2, Bitmap bitmap, String str5, boolean z3, long j, boolean z4, String str6, ctj ctjVar, String str7) {
        this.a = str;
        this.b = bundle == null ? new Bundle() : bundle;
        this.c = str2;
        this.d = applicationErrorReport == null ? new ApplicationErrorReport() : applicationErrorReport;
        this.e = str3;
        this.f = bitmapTeleporter;
        this.g = str4;
        this.h = list == null ? new ArrayList() : list;
        this.i = z;
        this.j = ctwVar;
        this.k = ctrVar;
        this.l = z2;
        this.m = bitmap;
        this.n = str5;
        this.o = z3;
        this.p = j;
        this.q = z4;
        this.r = str6;
        this.s = ctjVar;
        this.t = str7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int q = oy.q(parcel, 20293);
        oy.I(parcel, 2, this.a);
        oy.z(parcel, 3, this.b);
        oy.I(parcel, 5, this.c);
        oy.H(parcel, 6, this.d, i);
        oy.I(parcel, 7, this.e);
        oy.H(parcel, 8, this.f, i);
        oy.I(parcel, 9, this.g);
        oy.M(parcel, 10, this.h);
        oy.s(parcel, 11, this.i);
        oy.H(parcel, 12, this.j, i);
        oy.H(parcel, 13, this.k, i);
        oy.s(parcel, 14, this.l);
        oy.H(parcel, 15, this.m, i);
        oy.I(parcel, 16, this.n);
        oy.s(parcel, 17, this.o);
        oy.w(parcel, 18, this.p);
        oy.s(parcel, 19, this.q);
        oy.I(parcel, 20, this.r);
        oy.H(parcel, 21, this.s, i);
        oy.I(parcel, 22, this.t);
        oy.r(parcel, q);
    }
}
