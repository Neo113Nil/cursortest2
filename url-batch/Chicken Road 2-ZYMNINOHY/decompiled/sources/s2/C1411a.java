package s2;

import L1.h;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import b2.g;

/* renamed from: s2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1411a extends com.google.android.gms.common.internal.a implements b2.c {

    /* renamed from: A, reason: collision with root package name */
    public final Bundle f15228A;

    /* renamed from: B, reason: collision with root package name */
    public final Integer f15229B;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f15230y;
    public final h z;

    public C1411a(Context context, Looper looper, h hVar, Bundle bundle, g gVar, b2.h hVar2) {
        super(context, looper, 44, hVar, gVar, hVar2, 0);
        this.f15230y = true;
        this.z = hVar;
        this.f15228A = bundle;
        this.f15229B = (Integer) hVar.f1634b;
    }

    @Override // b2.c
    public final int i() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.a, b2.c
    public final boolean m() {
        return this.f15230y;
    }

    @Override // com.google.android.gms.common.internal.a
    public final IInterface n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof d ? (d) queryLocalInterface : new d(iBinder, "com.google.android.gms.signin.internal.ISignInService", 1);
    }

    @Override // com.google.android.gms.common.internal.a
    public final Bundle p() {
        h hVar = this.z;
        boolean equals = this.f5780c.getPackageName().equals((String) hVar.f1633a);
        Bundle bundle = this.f15228A;
        if (!equals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) hVar.f1633a);
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.a
    public final String r() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String s() {
        return "com.google.android.gms.signin.service.START";
    }
}
