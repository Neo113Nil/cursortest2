package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.mn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC3595mn extends AbstractBinderC3186f8 implements InterfaceC4122wb {

    /* renamed from: n, reason: collision with root package name */
    public final String f32754n;

    /* renamed from: u, reason: collision with root package name */
    public final C3648nm f32755u;

    /* renamed from: v, reason: collision with root package name */
    public final C3917sm f32756v;

    public BinderC3595mn(String str, C3648nm c3648nm, C3917sm c3917sm) {
        super("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
        this.f32754n = str;
        this.f32755u = c3648nm;
        this.f32756v = c3917sm;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3186f8
    public final boolean F3(int i, Parcel parcel, Parcel parcel2) {
        List list;
        InterfaceC3637nb interfaceC3637nb;
        V2.a aVar;
        switch (i) {
            case 2:
                V2.b bVar = new V2.b(this.f32755u);
                parcel2.writeNoException();
                AbstractC3241g8.e(parcel2, bVar);
                return true;
            case 3:
                String a9 = this.f32756v.a();
                parcel2.writeNoException();
                parcel2.writeString(a9);
                return true;
            case 4:
                C3917sm c3917sm = this.f32756v;
                synchronized (c3917sm) {
                    list = c3917sm.f34279e;
                }
                parcel2.writeNoException();
                parcel2.writeList(list);
                return true;
            case 5:
                String c4 = this.f32756v.c();
                parcel2.writeNoException();
                parcel2.writeString(c4);
                return true;
            case 6:
                C3917sm c3917sm2 = this.f32756v;
                synchronized (c3917sm2) {
                    interfaceC3637nb = c3917sm2.f34293t;
                }
                parcel2.writeNoException();
                AbstractC3241g8.e(parcel2, interfaceC3637nb);
                return true;
            case 7:
                String e6 = this.f32756v.e();
                parcel2.writeNoException();
                parcel2.writeString(e6);
                return true;
            case 8:
                String f6 = this.f32756v.f();
                parcel2.writeNoException();
                parcel2.writeString(f6);
                return true;
            case 9:
                Bundle d2 = this.f32756v.d();
                parcel2.writeNoException();
                AbstractC3241g8.d(parcel2, d2);
                return true;
            case 10:
                this.f32755u.o();
                parcel2.writeNoException();
                return true;
            case 11:
                q2.A0 r9 = this.f32756v.r();
                parcel2.writeNoException();
                AbstractC3241g8.e(parcel2, r9);
                return true;
            case 12:
                Bundle bundle = (Bundle) AbstractC3241g8.b(parcel, Bundle.CREATOR);
                AbstractC3241g8.f(parcel);
                C3648nm c3648nm = this.f32755u;
                synchronized (c3648nm) {
                    c3648nm.f33007n.f(bundle);
                }
                parcel2.writeNoException();
                return true;
            case 13:
                Bundle bundle2 = (Bundle) AbstractC3241g8.b(parcel, Bundle.CREATOR);
                AbstractC3241g8.f(parcel);
                boolean p6 = this.f32755u.p(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(p6 ? 1 : 0);
                return true;
            case 14:
                Bundle bundle3 = (Bundle) AbstractC3241g8.b(parcel, Bundle.CREATOR);
                AbstractC3241g8.f(parcel);
                C3648nm c3648nm2 = this.f32755u;
                synchronized (c3648nm2) {
                    c3648nm2.f33007n.n(bundle3);
                }
                parcel2.writeNoException();
                return true;
            case 15:
                InterfaceC3421jb s3 = this.f32756v.s();
                parcel2.writeNoException();
                AbstractC3241g8.e(parcel2, s3);
                return true;
            case 16:
                C3917sm c3917sm3 = this.f32756v;
                synchronized (c3917sm3) {
                    aVar = c3917sm3.f34290q;
                }
                parcel2.writeNoException();
                AbstractC3241g8.e(parcel2, aVar);
                return true;
            case 17:
                String str = this.f32754n;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            default:
                return false;
        }
    }
}
