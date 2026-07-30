package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.nn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC3649nn extends AbstractBinderC3186f8 implements InterfaceC4284zb {

    /* renamed from: n, reason: collision with root package name */
    public final Context f33020n;

    /* renamed from: u, reason: collision with root package name */
    public final C3917sm f33021u;

    /* renamed from: v, reason: collision with root package name */
    public C2474Am f33022v;

    /* renamed from: w, reason: collision with root package name */
    public C3648nm f33023w;

    public BinderC3649nn(Context context, C3917sm c3917sm, C2474Am c2474Am, C3648nm c3648nm) {
        super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        this.f33020n = context;
        this.f33021u = c3917sm;
        this.f33022v = c2474Am;
        this.f33023w = c3648nm;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4284zb
    public final boolean F(V2.a aVar) {
        C2474Am c2474Am;
        Object A02 = V2.b.A0(aVar);
        if (!(A02 instanceof ViewGroup) || (c2474Am = this.f33022v) == null || !c2474Am.c((ViewGroup) A02, true)) {
            return false;
        }
        this.f33021u.h().j1(new Vx(this));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3186f8
    public final boolean F3(int i, Parcel parcel, Parcel parcel2) {
        InterfaceC3529lb interfaceC3529lb;
        String str;
        List<String> arrayList;
        s.k kVar;
        s.k kVar2;
        s.k kVar3;
        s.k kVar4;
        C3648nm c3648nm;
        C2474Am c2474Am;
        InterfaceC3529lb interfaceC3529lb2 = null;
        int i4 = 0;
        switch (i) {
            case 1:
                String readString = parcel.readString();
                AbstractC3241g8.f(parcel);
                C3917sm c3917sm = this.f33021u;
                synchronized (c3917sm) {
                    kVar3 = c3917sm.f34296w;
                }
                String str2 = (String) kVar3.getOrDefault(readString, null);
                parcel2.writeNoException();
                parcel2.writeString(str2);
                return true;
            case 2:
                String readString2 = parcel.readString();
                AbstractC3241g8.f(parcel);
                C3917sm c3917sm2 = this.f33021u;
                synchronized (c3917sm2) {
                    kVar4 = c3917sm2.f34295v;
                }
                InterfaceC3637nb interfaceC3637nb = (InterfaceC3637nb) kVar4.getOrDefault(readString2, null);
                parcel2.writeNoException();
                AbstractC3241g8.e(parcel2, interfaceC3637nb);
                return true;
            case 3:
                try {
                    C3917sm c3917sm3 = this.f33021u;
                    synchronized (c3917sm3) {
                        kVar = c3917sm3.f34295v;
                    }
                    synchronized (c3917sm3) {
                        kVar2 = c3917sm3.f34296w;
                    }
                    String[] strArr = new String[kVar.f40409v + kVar2.f40409v];
                    int i9 = 0;
                    for (int i10 = 0; i10 < kVar.f40409v; i10++) {
                        strArr[i9] = (String) kVar.h(i10);
                        i9++;
                    }
                    while (i4 < kVar2.f40409v) {
                        strArr[i9] = (String) kVar2.h(i4);
                        i9++;
                        i4++;
                    }
                    arrayList = Arrays.asList(strArr);
                } catch (NullPointerException e6) {
                    p2.j.f39798C.f39808h.d("InternalNativeCustomTemplateAdShim.getAvailableAssetNames", e6);
                    arrayList = new ArrayList<>();
                }
                parcel2.writeNoException();
                parcel2.writeStringList(arrayList);
                return true;
            case 4:
                String g9 = this.f33021u.g();
                parcel2.writeNoException();
                parcel2.writeString(g9);
                return true;
            case 5:
                String readString3 = parcel.readString();
                AbstractC3241g8.f(parcel);
                C3648nm c3648nm2 = this.f33023w;
                if (c3648nm2 != null) {
                    synchronized (c3648nm2) {
                        c3648nm2.f33007n.E(readString3);
                    }
                }
                parcel2.writeNoException();
                return true;
            case 6:
                C3648nm c3648nm3 = this.f33023w;
                if (c3648nm3 != null) {
                    synchronized (c3648nm3) {
                        if (!c3648nm3.f33018y) {
                            c3648nm3.f33007n.Y();
                        }
                    }
                }
                parcel2.writeNoException();
                return true;
            case 7:
                q2.A0 r9 = this.f33021u.r();
                parcel2.writeNoException();
                AbstractC3241g8.e(parcel2, r9);
                return true;
            case 8:
                C3648nm c3648nm4 = this.f33023w;
                if (c3648nm4 != null) {
                    c3648nm4.o();
                }
                this.f33023w = null;
                this.f33022v = null;
                parcel2.writeNoException();
                return true;
            case 9:
                V2.a o22 = o2();
                parcel2.writeNoException();
                AbstractC3241g8.e(parcel2, o22);
                return true;
            case 10:
                V2.a u02 = V2.b.u0(parcel.readStrongBinder());
                AbstractC3241g8.f(parcel);
                boolean F8 = F(u02);
                parcel2.writeNoException();
                parcel2.writeInt(F8 ? 1 : 0);
                return true;
            case 11:
                parcel2.writeNoException();
                ClassLoader classLoader = AbstractC3241g8.f30958a;
                parcel2.writeStrongBinder(null);
                return true;
            case 12:
                C3648nm c3648nm5 = this.f33023w;
                if (c3648nm5 == null || c3648nm5.f33009p.c()) {
                    C3917sm c3917sm4 = this.f33021u;
                    if (c3917sm4.j() != null && c3917sm4.h() == null) {
                        i4 = 1;
                    }
                }
                parcel2.writeNoException();
                ClassLoader classLoader2 = AbstractC3241g8.f30958a;
                parcel2.writeInt(i4);
                return true;
            case 13:
                C3917sm c3917sm5 = this.f33021u;
                C3330hq k6 = c3917sm5.k();
                if (k6 != null) {
                    C3431jl c3431jl = p2.j.f39798C.f39823x;
                    Wv wv = k6.f31272a;
                    c3431jl.getClass();
                    C3431jl.i(wv);
                    if (c3917sm5.j() != null) {
                        c3917sm5.j().a("onSdkLoaded", new s.b());
                    }
                    i4 = 1;
                } else {
                    int i11 = t2.C.f40822b;
                    u2.i.f("Trying to start OMID session before creation.");
                }
                parcel2.writeNoException();
                ClassLoader classLoader3 = AbstractC3241g8.f30958a;
                parcel2.writeInt(i4);
                return true;
            case 14:
                V2.a u03 = V2.b.u0(parcel.readStrongBinder());
                AbstractC3241g8.f(parcel);
                Object A02 = V2.b.A0(u03);
                if ((A02 instanceof View) && this.f33021u.k() != null && (c3648nm = this.f33023w) != null) {
                    c3648nm.f((View) A02);
                }
                parcel2.writeNoException();
                return true;
            case 15:
                try {
                    C3917sm c3917sm6 = this.f33021u;
                    synchronized (c3917sm6) {
                        str = c3917sm6.f34298y;
                    }
                    if (Objects.equals(str, "Google")) {
                        int i12 = t2.C.f40822b;
                        u2.i.f("Illegal argument specified for omid partner name.");
                    } else if (TextUtils.isEmpty(str)) {
                        int i13 = t2.C.f40822b;
                        u2.i.f("Not starting OMID session. OM partner name has not been configured.");
                    } else {
                        C3648nm c3648nm6 = this.f33023w;
                        if (c3648nm6 != null) {
                            c3648nm6.e(str, false);
                        }
                    }
                } catch (NullPointerException e9) {
                    p2.j.f39798C.f39808h.d("InternalNativeCustomTemplateAdShim.initializeDisplayOpenMeasurement", e9);
                }
                parcel2.writeNoException();
                return true;
            case 16:
                try {
                    C3756pm c3756pm = this.f33023w.f33001F;
                    synchronized (c3756pm) {
                        interfaceC3529lb = c3756pm.f33505a;
                    }
                    interfaceC3529lb2 = interfaceC3529lb;
                } catch (NullPointerException e10) {
                    p2.j.f39798C.f39808h.d("InternalNativeCustomTemplateAdShim.getMediaContent", e10);
                }
                parcel2.writeNoException();
                AbstractC3241g8.e(parcel2, interfaceC3529lb2);
                return true;
            case 17:
                V2.a u04 = V2.b.u0(parcel.readStrongBinder());
                AbstractC3241g8.f(parcel);
                Object A03 = V2.b.A0(u04);
                if ((A03 instanceof ViewGroup) && (c2474Am = this.f33022v) != null && c2474Am.c((ViewGroup) A03, false)) {
                    this.f33021u.i().j1(new Vx(this));
                    i4 = 1;
                }
                parcel2.writeNoException();
                parcel2.writeInt(i4);
                return true;
            default:
                return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4284zb
    public final String g() {
        return this.f33021u.g();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4284zb
    public final V2.a o2() {
        return new V2.b(this.f33020n);
    }
}
