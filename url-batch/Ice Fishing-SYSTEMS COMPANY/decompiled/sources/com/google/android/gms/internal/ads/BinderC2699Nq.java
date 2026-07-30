package com.google.android.gms.internal.ads;

import android.os.Parcel;
import java.util.Objects;
import q2.C4927z0;

/* renamed from: com.google.android.gms.internal.ads.Nq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC2699Nq extends AbstractBinderC3186f8 implements InterfaceC2567Gd {

    /* renamed from: n, reason: collision with root package name */
    public final C3598mq f26611n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC2699Nq(C4191xq c4191xq, C3598mq c3598mq) {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
        Objects.requireNonNull(c4191xq);
        this.f26611n = c3598mq;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3186f8
    public final boolean F3(int i, Parcel parcel, Parcel parcel2) {
        C3598mq c3598mq = this.f26611n;
        if (i == 2) {
            ((BinderC2597Hq) c3598mq.f32762c).h();
        } else if (i == 3) {
            String readString = parcel.readString();
            AbstractC3241g8.f(parcel);
            ((BinderC2597Hq) c3598mq.f32762c).A3(0, readString);
        } else {
            if (i != 4) {
                return false;
            }
            C4927z0 c4927z0 = (C4927z0) AbstractC3241g8.b(parcel, C4927z0.CREATOR);
            AbstractC3241g8.f(parcel);
            a(c4927z0);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2567Gd
    public final void a(C4927z0 c4927z0) {
        ((BinderC2597Hq) this.f26611n.f32762c).d3(c4927z0);
    }
}
