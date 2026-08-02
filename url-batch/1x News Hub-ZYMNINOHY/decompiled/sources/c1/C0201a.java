package c1;

import L0.g;
import L0.h;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: c1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0201a extends com.google.android.gms.common.internal.a implements L0.c {

    /* renamed from: A, reason: collision with root package name */
    public final Bundle f2617A;

    /* renamed from: B, reason: collision with root package name */
    public final Integer f2618B;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f2619y;
    public final F1.c z;

    public C0201a(Context context, Looper looper, F1.c cVar, Bundle bundle, g gVar, h hVar) {
        super(context, looper, 44, cVar, gVar, hVar);
        this.f2619y = true;
        this.z = cVar;
        this.f2617A = bundle;
        this.f2618B = (Integer) cVar.f;
    }

    @Override // L0.c
    public final int g() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.a, L0.c
    public final boolean m() {
        return this.f2619y;
    }

    @Override // com.google.android.gms.common.internal.a
    public final IInterface n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof c ? (c) queryLocalInterface : new c(iBinder, "com.google.android.gms.signin.internal.ISignInService", 0);
    }

    @Override // com.google.android.gms.common.internal.a
    public final Bundle p() {
        F1.c cVar = this.z;
        boolean equals = this.f2684c.getPackageName().equals((String) cVar.f488c);
        Bundle bundle = this.f2617A;
        if (!equals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) cVar.f488c);
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
