package com.google.android.gms.internal.ads;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.Ko, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC2646Ko extends AbstractBinderC3186f8 implements InterfaceC4231yc {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f26035n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f26036u;

    public BinderC2646Ko() {
        super("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3186f8
    public final boolean F3(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(C4015uc.CREATOR);
        AbstractC3241g8.f(parcel);
        R2(createTypedArrayList);
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4231yc
    public final void R2(List list) {
        int i;
        ArrayList arrayList;
        switch (this.f26035n) {
            case 0:
                ((C2680Mo) this.f26036u).b(list);
                return;
            default:
                q2.J0 j02 = (q2.J0) this.f26036u;
                synchronized (j02.f39964d) {
                    j02.f39966f = false;
                    j02.f39967g = true;
                    arrayList = new ArrayList(j02.f39965e);
                    j02.f39965e.clear();
                }
                q2.J0.a(list);
                int size = arrayList.size();
                for (i = 0; i < size; i++) {
                    ((com.icefishing.icefishingliveapp.y) arrayList.get(i)).getClass();
                }
                return;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BinderC2646Ko(C2680Mo c2680Mo) {
        this();
        this.f26035n = 0;
        Objects.requireNonNull(c2680Mo);
        this.f26036u = c2680Mo;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BinderC2646Ko(q2.J0 j02) {
        this();
        this.f26035n = 1;
        Objects.requireNonNull(j02);
        this.f26036u = j02;
    }
}
