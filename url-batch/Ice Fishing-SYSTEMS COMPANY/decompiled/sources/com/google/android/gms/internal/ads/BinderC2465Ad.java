package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n2.AbstractC4810f;

/* renamed from: com.google.android.gms.internal.ads.Ad, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC2465Ad extends AbstractBinderC3186f8 implements InterfaceC3962td {

    /* renamed from: n, reason: collision with root package name */
    public final com.google.ads.mediation.a f23880n;

    public BinderC2465Ad(com.google.ads.mediation.a aVar) {
        super("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
        this.f23880n = aVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3186f8
    public final boolean F3(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 2:
                String str = this.f23880n.f23686a;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 3:
                List f6 = f();
                parcel2.writeNoException();
                parcel2.writeList(f6);
                return true;
            case 4:
                String str2 = this.f23880n.f23688c;
                parcel2.writeNoException();
                parcel2.writeString(str2);
                return true;
            case 5:
                InterfaceC3637nb g9 = g();
                parcel2.writeNoException();
                AbstractC3241g8.e(parcel2, g9);
                return true;
            case 6:
                String str3 = this.f23880n.f23690e;
                parcel2.writeNoException();
                parcel2.writeString(str3);
                return true;
            case 7:
                String str4 = this.f23880n.f23691f;
                parcel2.writeNoException();
                parcel2.writeString(str4);
                return true;
            case 8:
                double j9 = j();
                parcel2.writeNoException();
                parcel2.writeDouble(j9);
                return true;
            case 9:
                String str5 = this.f23880n.f23693h;
                parcel2.writeNoException();
                parcel2.writeString(str5);
                return true;
            case 10:
                String str6 = this.f23880n.i;
                parcel2.writeNoException();
                parcel2.writeString(str6);
                return true;
            case 11:
                q2.A0 p6 = p();
                parcel2.writeNoException();
                AbstractC3241g8.e(parcel2, p6);
                return true;
            case 12:
                parcel2.writeNoException();
                ClassLoader classLoader = AbstractC3241g8.f30958a;
                parcel2.writeStrongBinder(null);
                return true;
            case 13:
                r();
                parcel2.writeNoException();
                ClassLoader classLoader2 = AbstractC3241g8.f30958a;
                parcel2.writeStrongBinder(null);
                return true;
            case 14:
                n();
                parcel2.writeNoException();
                ClassLoader classLoader3 = AbstractC3241g8.f30958a;
                parcel2.writeStrongBinder(null);
                return true;
            case 15:
                V2.a t9 = t();
                parcel2.writeNoException();
                AbstractC3241g8.e(parcel2, t9);
                return true;
            case 16:
                Bundle c32 = c3();
                parcel2.writeNoException();
                AbstractC3241g8.d(parcel2, c32);
                return true;
            case 17:
                boolean z8 = this.f23880n.f23697m;
                parcel2.writeNoException();
                ClassLoader classLoader4 = AbstractC3241g8.f30958a;
                parcel2.writeInt(z8 ? 1 : 0);
                return true;
            case 18:
                boolean z9 = this.f23880n.f23698n;
                parcel2.writeNoException();
                ClassLoader classLoader5 = AbstractC3241g8.f30958a;
                parcel2.writeInt(z9 ? 1 : 0);
                return true;
            case 19:
                v();
                parcel2.writeNoException();
                return true;
            case 20:
                V2.a u02 = V2.b.u0(parcel.readStrongBinder());
                AbstractC3241g8.f(parcel);
                a0(u02);
                parcel2.writeNoException();
                return true;
            case 21:
                V2.a u03 = V2.b.u0(parcel.readStrongBinder());
                V2.a u04 = V2.b.u0(parcel.readStrongBinder());
                V2.a u05 = V2.b.u0(parcel.readStrongBinder());
                AbstractC3241g8.f(parcel);
                U2(u03, u04, u05);
                parcel2.writeNoException();
                return true;
            case 22:
                V2.a u06 = V2.b.u0(parcel.readStrongBinder());
                AbstractC3241g8.f(parcel);
                S0(u06);
                parcel2.writeNoException();
                return true;
            case 23:
                R();
                parcel2.writeNoException();
                parcel2.writeFloat(0.0f);
                return true;
            case 24:
                L();
                parcel2.writeNoException();
                parcel2.writeFloat(0.0f);
                return true;
            case 25:
                H();
                parcel2.writeNoException();
                parcel2.writeFloat(0.0f);
                return true;
            case 26:
                J();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3962td
    public final float H() {
        this.f23880n.getClass();
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3962td
    public final void J() {
        this.f23880n.getClass();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3962td
    public final float L() {
        this.f23880n.getClass();
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3962td
    public final boolean M() {
        return this.f23880n.f23697m;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3962td
    public final float R() {
        this.f23880n.getClass();
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3962td
    public final void S0(V2.a aVar) {
        this.f23880n.getClass();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3962td
    public final void U2(V2.a aVar, V2.a aVar2, V2.a aVar3) {
        View view = (View) V2.b.A0(aVar);
        this.f23880n.getClass();
        if (AbstractC4810f.f39640a.get(view) != null) {
            throw new ClassCastException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3962td
    public final void a0(V2.a aVar) {
        this.f23880n.getClass();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3962td
    public final String c() {
        return this.f23880n.f23686a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3962td
    public final Bundle c3() {
        return this.f23880n.f23696l;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3962td
    public final String e() {
        return this.f23880n.f23688c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3962td
    public final List f() {
        ArrayList arrayList = this.f23880n.f23687b;
        ArrayList arrayList2 = new ArrayList();
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C3691ob c3691ob = (C3691ob) it.next();
                arrayList2.add(new BinderC3098db(c3691ob.f33148b, c3691ob.f33149c, c3691ob.f33150d, c3691ob.f33151e, c3691ob.f33152f, null));
            }
        }
        return arrayList2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3962td
    public final InterfaceC3637nb g() {
        C3691ob c3691ob = this.f23880n.f23689d;
        if (c3691ob == null) {
            return null;
        }
        return new BinderC3098db(c3691ob.f33148b, c3691ob.f33149c, c3691ob.f33150d, c3691ob.f33151e, c3691ob.f33152f, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3962td
    public final String h() {
        return this.f23880n.f23691f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3962td
    public final double j() {
        Double d2 = this.f23880n.f23692g;
        if (d2 != null) {
            return d2.doubleValue();
        }
        return -1.0d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3962td
    public final String k() {
        return this.f23880n.f23693h;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3962td
    public final String l() {
        return this.f23880n.f23690e;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3962td
    public final String m() {
        return this.f23880n.i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3962td
    public final V2.a n() {
        this.f23880n.getClass();
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3962td
    public final q2.A0 p() {
        q2.A0 a02;
        k2.v vVar = this.f23880n.f23694j;
        if (vVar == null) {
            return null;
        }
        synchronized (vVar.f38736a) {
            a02 = vVar.f38737b;
        }
        return a02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3962td
    public final InterfaceC3421jb q() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3962td
    public final V2.a r() {
        this.f23880n.getClass();
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3962td
    public final V2.a t() {
        Object obj = this.f23880n.f23695k;
        if (obj == null) {
            return null;
        }
        return new V2.b(obj);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3962td
    public final boolean t1() {
        return this.f23880n.f23698n;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3962td
    public final void v() {
        this.f23880n.getClass();
    }
}
