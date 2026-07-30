package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.view.View;
import java.util.Objects;
import q2.C4927z0;

/* renamed from: com.google.android.gms.internal.ads.Cq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC2512Cq extends AbstractBinderC3186f8 implements InterfaceC2533Ed {

    /* renamed from: n, reason: collision with root package name */
    public final C3598mq f24251n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C2529Dq f24252u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC2512Cq(C2529Dq c2529Dq, C3598mq c3598mq) {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
        Objects.requireNonNull(c2529Dq);
        this.f24252u = c2529Dq;
        this.f24251n = c3598mq;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3186f8
    public final boolean F3(int i, Parcel parcel, Parcel parcel2) {
        C3747pd c3747pd;
        C2529Dq c2529Dq = this.f24252u;
        C3598mq c3598mq = this.f24251n;
        if (i == 1) {
            V2.a u02 = V2.b.u0(parcel.readStrongBinder());
            AbstractC3241g8.f(parcel);
            c2529Dq.f24574d = (View) V2.b.A0(u02);
            ((BinderC2597Hq) c3598mq.f32762c).h();
        } else if (i == 2) {
            String readString = parcel.readString();
            AbstractC3241g8.f(parcel);
            ((BinderC2597Hq) c3598mq.f32762c).A3(0, readString);
        } else if (i == 3) {
            C4927z0 c4927z0 = (C4927z0) AbstractC3241g8.b(parcel, C4927z0.CREATOR);
            AbstractC3241g8.f(parcel);
            a(c4927z0);
        } else {
            if (i != 4) {
                return false;
            }
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                c3747pd = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
                c3747pd = queryLocalInterface instanceof C3747pd ? (C3747pd) queryLocalInterface : new C3747pd(readStrongBinder);
            }
            AbstractC3241g8.f(parcel);
            c2529Dq.f24575e = c3747pd;
            ((BinderC2597Hq) c3598mq.f32762c).h();
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2533Ed
    public final void a(C4927z0 c4927z0) {
        ((BinderC2597Hq) this.f24251n.f32762c).d3(c4927z0);
    }
}
