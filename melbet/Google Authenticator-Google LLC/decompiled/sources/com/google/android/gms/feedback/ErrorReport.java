package com.google.android.gms.feedback;

import android.app.ApplicationErrorReport;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.cqc;
import defpackage.cri;
import defpackage.ctj;
import defpackage.cto;
import defpackage.ctq;
import defpackage.ctr;
import defpackage.cts;
import defpackage.ctw;
import defpackage.oy;
import java.io.File;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ErrorReport extends cri implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new cqc(11);
    public String A;
    public String B;
    public String C;
    public Bundle D;
    public boolean E;
    public int F;
    public int G;
    public boolean H;
    public String I;
    public String J;
    public int K;
    public String L;
    public String M;
    public String N;
    public String O;
    public String P;

    @Deprecated
    public String Q;
    public String R;
    public BitmapTeleporter S;
    public String T;
    public ctq[] U;
    public String[] V;
    public boolean W;
    public String X;
    public ctw Y;
    public ctr Z;
    public ApplicationErrorReport a;

    @Deprecated
    public String aa;
    public boolean ab;
    public Bundle ac;
    public List ad;
    public boolean ae;
    public Bitmap af;
    public String ag;
    public List ah;
    public int ai;
    public int aj;
    public String[] ak;
    public String[] al;
    public String[] am;
    public boolean an;
    public boolean ao;
    public String ap;
    public ctj aq;
    public cts[] ar;
    public String as;
    public String b;
    public int c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public int k;
    public String l;
    public String m;
    public String n;
    public String o;
    public String p;
    public String[] q;
    public String[] r;
    public String[] s;
    public String t;
    public String u;
    public byte[] v;
    public int w;
    public int x;
    public int y;
    public int z;

    public ErrorReport(ApplicationErrorReport applicationErrorReport, String str, int i, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i2, String str9, String str10, String str11, String str12, String str13, String[] strArr, String[] strArr2, String[] strArr3, String str14, String str15, byte[] bArr, int i3, int i4, int i5, int i6, String str16, String str17, String str18, Bundle bundle, boolean z, int i7, int i8, boolean z2, String str19, String str20, int i9, String str21, String str22, String str23, String str24, String str25, String str26, String str27, BitmapTeleporter bitmapTeleporter, String str28, ctq[] ctqVarArr, String[] strArr4, boolean z3, String str29, ctw ctwVar, ctr ctrVar, String str30, boolean z4, Bundle bundle2, List list, boolean z5, Bitmap bitmap, String str31, List list2, int i10, int i11, String[] strArr5, String[] strArr6, String[] strArr7, boolean z6, boolean z7, String str32, ctj ctjVar, cts[] ctsVarArr, String str33) {
        new ApplicationErrorReport();
        this.a = applicationErrorReport;
        this.b = str;
        this.c = i;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = i2;
        this.l = str9;
        this.m = str10;
        this.n = str11;
        this.o = str12;
        this.p = str13;
        this.q = strArr;
        this.r = strArr2;
        this.s = strArr3;
        this.t = str14;
        this.u = str15;
        this.v = bArr;
        this.w = i3;
        this.x = i4;
        this.y = i5;
        this.z = i6;
        this.A = str16;
        this.B = str17;
        this.C = str18;
        this.D = bundle;
        this.E = z;
        this.F = i7;
        this.G = i8;
        this.H = z2;
        this.I = str19;
        this.J = str20;
        this.K = i9;
        this.L = str21;
        this.M = str22;
        this.N = str23;
        this.O = str24;
        this.P = str25;
        this.Q = str26;
        this.R = str27;
        this.S = bitmapTeleporter;
        this.T = str28;
        this.U = ctqVarArr;
        this.V = strArr4;
        this.W = z3;
        this.X = str29;
        this.Y = ctwVar;
        this.Z = ctrVar;
        this.aa = str30;
        this.ab = z4;
        this.ac = bundle2;
        this.ad = list;
        this.ae = z5;
        this.af = bitmap;
        this.ag = str31;
        this.ah = list2;
        this.ai = i10;
        this.aj = i11;
        this.ak = strArr5;
        this.al = strArr6;
        this.am = strArr7;
        this.an = z6;
        this.ao = z7;
        this.ap = str32;
        this.aq = ctjVar;
        this.ar = ctsVarArr;
        this.as = str33;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int q = oy.q(parcel, 20293);
        oy.H(parcel, 2, this.a, i);
        oy.I(parcel, 3, this.b);
        oy.v(parcel, 4, this.c);
        oy.I(parcel, 5, this.d);
        oy.I(parcel, 6, this.e);
        oy.I(parcel, 7, this.f);
        oy.I(parcel, 8, this.g);
        oy.I(parcel, 9, this.h);
        oy.I(parcel, 10, this.i);
        oy.I(parcel, 11, this.j);
        oy.v(parcel, 12, this.k);
        oy.I(parcel, 13, this.l);
        oy.I(parcel, 14, this.m);
        oy.I(parcel, 15, this.n);
        oy.I(parcel, 16, this.o);
        oy.I(parcel, 17, this.p);
        oy.J(parcel, 18, this.q);
        oy.J(parcel, 19, this.r);
        oy.J(parcel, 20, this.s);
        oy.I(parcel, 21, this.t);
        oy.I(parcel, 22, this.u);
        oy.A(parcel, 23, this.v);
        oy.v(parcel, 24, this.w);
        oy.v(parcel, 25, this.x);
        oy.v(parcel, 26, this.y);
        oy.v(parcel, 27, this.z);
        oy.I(parcel, 28, this.A);
        oy.I(parcel, 29, this.B);
        oy.I(parcel, 30, this.C);
        oy.z(parcel, 31, this.D);
        oy.s(parcel, 32, this.E);
        oy.v(parcel, 33, this.F);
        oy.v(parcel, 34, this.G);
        oy.s(parcel, 35, this.H);
        oy.I(parcel, 36, this.I);
        oy.I(parcel, 37, this.J);
        oy.v(parcel, 38, this.K);
        oy.I(parcel, 39, this.L);
        oy.I(parcel, 40, this.M);
        oy.I(parcel, 41, this.N);
        oy.I(parcel, 42, this.O);
        oy.I(parcel, 43, this.P);
        oy.I(parcel, 44, this.Q);
        oy.I(parcel, 45, this.R);
        oy.H(parcel, 46, this.S, i);
        oy.I(parcel, 47, this.T);
        oy.L(parcel, 48, this.U, i);
        oy.J(parcel, 49, this.V);
        oy.s(parcel, 50, this.W);
        oy.I(parcel, 51, this.X);
        oy.H(parcel, 52, this.Y, i);
        oy.H(parcel, 53, this.Z, i);
        oy.I(parcel, 54, this.aa);
        oy.s(parcel, 55, this.ab);
        oy.z(parcel, 56, this.ac);
        oy.M(parcel, 57, this.ad);
        oy.s(parcel, 58, this.ae);
        oy.H(parcel, 59, this.af, i);
        oy.I(parcel, 60, this.ag);
        oy.K(parcel, 61, this.ah);
        oy.v(parcel, 62, this.ai);
        oy.v(parcel, 63, this.aj);
        oy.J(parcel, 64, this.ak);
        oy.J(parcel, 65, this.al);
        oy.J(parcel, 66, this.am);
        oy.s(parcel, 67, this.an);
        oy.s(parcel, 68, this.ao);
        oy.I(parcel, 69, this.ap);
        oy.H(parcel, 70, this.aq, i);
        oy.L(parcel, 71, this.ar, i);
        oy.I(parcel, 72, this.as);
        oy.r(parcel, q);
    }

    public ErrorReport() {
        this.a = new ApplicationErrorReport();
    }

    public ErrorReport(cto ctoVar, File file) {
        this.a = new ApplicationErrorReport();
        Bundle bundle = ctoVar.b;
        if (bundle != null && !bundle.isEmpty()) {
            this.D = ctoVar.b;
        }
        if (!TextUtils.isEmpty(ctoVar.a)) {
            this.B = ctoVar.a;
        }
        if (!TextUtils.isEmpty(ctoVar.c)) {
            this.b = ctoVar.c;
        }
        ApplicationErrorReport.CrashInfo crashInfo = ctoVar.d.crashInfo;
        if (crashInfo != null) {
            this.M = crashInfo.throwMethodName;
            this.K = crashInfo.throwLineNumber;
            this.L = crashInfo.throwClassName;
            this.N = crashInfo.stackTrace;
            this.I = crashInfo.exceptionClassName;
            this.O = crashInfo.exceptionMessage;
            this.J = crashInfo.throwFileName;
        }
        ctw ctwVar = ctoVar.j;
        if (ctwVar != null) {
            this.Y = ctwVar;
        }
        if (!TextUtils.isEmpty(ctoVar.e)) {
            this.P = ctoVar.e;
        }
        String str = ctoVar.g;
        if (!TextUtils.isEmpty(str)) {
            this.a.packageName = str;
        }
        if (!TextUtils.isEmpty(ctoVar.n)) {
            this.ag = ctoVar.n;
        }
        if (!TextUtils.isEmpty(ctoVar.t)) {
            this.as = ctoVar.t;
        }
        Bitmap bitmap = ctoVar.m;
        if (bitmap != null) {
            this.af = bitmap;
        }
        this.S = ctoVar.f;
        List list = ctoVar.h;
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((ctq) it.next()).e = file;
            }
            this.U = (ctq[]) list.toArray(new ctq[0]);
        }
        ctr ctrVar = ctoVar.k;
        if (ctrVar != null) {
            this.Z = ctrVar;
        }
        this.W = ctoVar.i;
        this.ae = ctoVar.l;
        this.E = ctoVar.o;
        this.an = ctoVar.q;
        this.ap = ctoVar.r;
        this.aq = ctoVar.s;
    }
}
