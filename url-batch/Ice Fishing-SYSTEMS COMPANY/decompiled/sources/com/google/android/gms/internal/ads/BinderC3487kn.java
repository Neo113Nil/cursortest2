package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import com.anythink.core.c.b.e;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.kn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC3487kn extends AbstractBinderC3186f8 implements InterfaceC4068vb {

    /* renamed from: n, reason: collision with root package name */
    public final String f32459n;

    /* renamed from: u, reason: collision with root package name */
    public final C3648nm f32460u;

    /* renamed from: v, reason: collision with root package name */
    public final C3917sm f32461v;

    public BinderC3487kn(String str, C3648nm c3648nm, C3917sm c3917sm) {
        super("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
        this.f32459n = str;
        this.f32460u = c3648nm;
        this.f32461v = c3917sm;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3186f8
    public final boolean F3(int i, Parcel parcel, Parcel parcel2) {
        List list;
        InterfaceC3637nb interfaceC3637nb;
        double d2;
        String p6;
        String p9;
        V2.a aVar;
        C3648nm c3648nm = this.f32460u;
        C3917sm c3917sm = this.f32461v;
        switch (i) {
            case 2:
                V2.b bVar = new V2.b(c3648nm);
                parcel2.writeNoException();
                AbstractC3241g8.e(parcel2, bVar);
                return true;
            case 3:
                String a9 = c3917sm.a();
                parcel2.writeNoException();
                parcel2.writeString(a9);
                return true;
            case 4:
                synchronized (c3917sm) {
                    list = c3917sm.f34279e;
                }
                parcel2.writeNoException();
                parcel2.writeList(list);
                return true;
            case 5:
                String c4 = c3917sm.c();
                parcel2.writeNoException();
                parcel2.writeString(c4);
                return true;
            case 6:
                synchronized (c3917sm) {
                    interfaceC3637nb = c3917sm.f34292s;
                }
                parcel2.writeNoException();
                AbstractC3241g8.e(parcel2, interfaceC3637nb);
                return true;
            case 7:
                String e6 = c3917sm.e();
                parcel2.writeNoException();
                parcel2.writeString(e6);
                return true;
            case 8:
                synchronized (c3917sm) {
                    d2 = c3917sm.f34291r;
                }
                parcel2.writeNoException();
                parcel2.writeDouble(d2);
                return true;
            case 9:
                synchronized (c3917sm) {
                    p6 = c3917sm.p("store");
                }
                parcel2.writeNoException();
                parcel2.writeString(p6);
                return true;
            case 10:
                synchronized (c3917sm) {
                    p9 = c3917sm.p(e.a.f12225h);
                }
                parcel2.writeNoException();
                parcel2.writeString(p9);
                return true;
            case 11:
                Bundle d3 = c3917sm.d();
                parcel2.writeNoException();
                AbstractC3241g8.d(parcel2, d3);
                return true;
            case 12:
                c3648nm.o();
                parcel2.writeNoException();
                return true;
            case 13:
                q2.A0 r9 = c3917sm.r();
                parcel2.writeNoException();
                AbstractC3241g8.e(parcel2, r9);
                return true;
            case 14:
                Bundle bundle = (Bundle) AbstractC3241g8.b(parcel, Bundle.CREATOR);
                AbstractC3241g8.f(parcel);
                synchronized (c3648nm) {
                    c3648nm.f33007n.f(bundle);
                }
                parcel2.writeNoException();
                return true;
            case 15:
                Bundle bundle2 = (Bundle) AbstractC3241g8.b(parcel, Bundle.CREATOR);
                AbstractC3241g8.f(parcel);
                boolean p10 = c3648nm.p(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(p10 ? 1 : 0);
                return true;
            case 16:
                Bundle bundle3 = (Bundle) AbstractC3241g8.b(parcel, Bundle.CREATOR);
                AbstractC3241g8.f(parcel);
                synchronized (c3648nm) {
                    c3648nm.f33007n.n(bundle3);
                }
                parcel2.writeNoException();
                return true;
            case 17:
                InterfaceC3421jb s3 = c3917sm.s();
                parcel2.writeNoException();
                AbstractC3241g8.e(parcel2, s3);
                return true;
            case 18:
                synchronized (c3917sm) {
                    aVar = c3917sm.f34290q;
                }
                parcel2.writeNoException();
                AbstractC3241g8.e(parcel2, aVar);
                return true;
            case 19:
                parcel2.writeNoException();
                parcel2.writeString(this.f32459n);
                return true;
            default:
                return false;
        }
    }
}
