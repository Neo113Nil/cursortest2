package com.google.android.gms.googlehelp;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import defpackage.cri;
import defpackage.ctw;
import defpackage.cuc;
import defpackage.kee;
import defpackage.oy;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class GoogleHelp extends cri implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new cuc();
    boolean A;
    public boolean B;
    int C;
    String D;
    boolean E;
    String F;
    boolean G;
    ND4CSettings H;
    boolean I;
    List J;

    @Deprecated
    String K;
    public int L;
    public int M;
    public List N;
    String O;
    Intent P;
    List Q;
    public kee R;
    final int a;
    String b;
    public Account c;
    Bundle d;
    String e;
    String f;
    Bitmap g;
    boolean h;
    boolean i;
    List j;

    @Deprecated
    Bundle k;

    @Deprecated
    Bitmap l;

    @Deprecated
    byte[] m;

    @Deprecated
    int n;

    @Deprecated
    int o;
    String p;
    public Uri q;
    public List r;
    public ctw s;
    List t;
    boolean u;
    public ErrorReport v;
    public TogglingData w;
    int x;
    PendingIntent y;
    public int z;

    public GoogleHelp(int i, String str, Account account, Bundle bundle, String str2, String str3, Bitmap bitmap, boolean z, boolean z2, List list, Bundle bundle2, Bitmap bitmap2, byte[] bArr, int i2, int i3, String str4, Uri uri, List list2, int i4, ctw ctwVar, List list3, boolean z3, ErrorReport errorReport, TogglingData togglingData, int i5, PendingIntent pendingIntent, int i6, boolean z4, boolean z5, int i7, String str5, boolean z6, String str6, boolean z7, ND4CSettings nD4CSettings, boolean z8, List list4, String str7, int i8, int i9, List list5, String str8, Intent intent, List list6) {
        this.v = new ErrorReport();
        if (TextUtils.isEmpty(str)) {
            throw new IllegalStateException("Help requires a non-empty appContext");
        }
        this.a = i;
        this.z = i6;
        this.A = z4;
        this.B = z5;
        this.C = i7;
        this.D = str5;
        this.b = str;
        this.c = account;
        this.d = bundle;
        this.e = str2;
        this.f = str3;
        this.g = bitmap;
        this.h = z;
        this.i = z2;
        this.E = z6;
        this.j = list;
        this.y = pendingIntent;
        this.k = bundle2;
        this.l = bitmap2;
        this.m = bArr;
        this.n = i2;
        this.o = i3;
        this.p = str4;
        this.q = uri;
        this.r = list2;
        if (i < 4) {
            ctw ctwVar2 = new ctw(3, 0);
            ctwVar2.a = i4;
            this.s = ctwVar2;
        } else {
            this.s = ctwVar == null ? new ctw(3, 0) : ctwVar;
        }
        this.t = list3;
        this.u = z3;
        this.v = errorReport;
        if (errorReport != null) {
            errorReport.X = "GoogleHelp";
        }
        this.w = togglingData;
        this.x = i5;
        this.F = str6;
        this.G = z7;
        this.H = nD4CSettings;
        this.I = z8;
        this.J = list4;
        this.K = str7;
        this.L = i8;
        this.M = i9;
        this.N = list5;
        this.O = str8;
        this.P = intent;
        this.Q = list6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int q = oy.q(parcel, 20293);
        oy.v(parcel, 1, this.a);
        oy.I(parcel, 2, this.b);
        oy.H(parcel, 3, this.c, i);
        oy.z(parcel, 4, this.d);
        oy.s(parcel, 5, this.h);
        oy.s(parcel, 6, this.i);
        oy.K(parcel, 7, this.j);
        oy.z(parcel, 10, this.k);
        oy.H(parcel, 11, this.l, i);
        oy.I(parcel, 14, this.p);
        oy.H(parcel, 15, this.q, i);
        oy.M(parcel, 16, this.r);
        oy.v(parcel, 17, 0);
        oy.M(parcel, 18, this.t);
        oy.A(parcel, 19, this.m);
        oy.v(parcel, 20, this.n);
        oy.v(parcel, 21, this.o);
        oy.s(parcel, 22, this.u);
        oy.H(parcel, 23, this.v, i);
        oy.H(parcel, 25, this.s, i);
        oy.I(parcel, 28, this.e);
        oy.H(parcel, 31, this.w, i);
        oy.v(parcel, 32, this.x);
        oy.H(parcel, 33, this.y, i);
        oy.I(parcel, 34, this.f);
        oy.H(parcel, 35, this.g, i);
        oy.v(parcel, 36, this.z);
        oy.s(parcel, 37, this.A);
        oy.s(parcel, 38, this.B);
        oy.v(parcel, 39, this.C);
        oy.I(parcel, 40, this.D);
        oy.s(parcel, 41, this.E);
        oy.I(parcel, 42, this.F);
        oy.s(parcel, 43, this.G);
        oy.H(parcel, 44, this.H, i);
        oy.s(parcel, 45, this.I);
        oy.M(parcel, 46, this.J);
        oy.I(parcel, 47, this.K);
        oy.v(parcel, 48, this.L);
        oy.v(parcel, 49, this.M);
        oy.M(parcel, 50, this.N);
        oy.I(parcel, 51, this.O);
        oy.H(parcel, 52, this.P, i);
        oy.K(parcel, 53, this.Q);
        oy.r(parcel, q);
    }
}
