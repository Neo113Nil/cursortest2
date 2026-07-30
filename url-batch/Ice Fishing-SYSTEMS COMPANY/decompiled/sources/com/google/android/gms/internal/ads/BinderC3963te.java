package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.te, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC3963te extends AbstractBinderC3186f8 implements InterfaceC2671Mf {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ E2.b f34423n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC3963te(C4017ue c4017ue, E2.b bVar) {
        super("com.google.android.gms.ads.internal.signals.ISignalCallback");
        this.f34423n = bVar;
        Objects.requireNonNull(c4017ue);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2671Mf
    public final void B3(String str, Bundle bundle, String str2) {
        this.f34423n.onSuccess(new E2.a(new B2.o(str)));
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3186f8
    public final boolean F3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            parcel.readString();
            parcel.readString();
            AbstractC3241g8.f(parcel);
        } else if (i == 2) {
            String readString = parcel.readString();
            AbstractC3241g8.f(parcel);
            b(readString);
        } else {
            if (i != 3) {
                return false;
            }
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            Bundle bundle = (Bundle) AbstractC3241g8.b(parcel, Bundle.CREATOR);
            AbstractC3241g8.f(parcel);
            B3(readString2, bundle, readString3);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2671Mf
    public final void b(String str) {
        this.f34423n.onFailure(str);
    }
}
