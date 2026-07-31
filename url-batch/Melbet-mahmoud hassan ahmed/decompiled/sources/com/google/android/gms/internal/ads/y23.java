package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* loaded from: classes.dex */
public final class y23 {

    /* renamed from: a, reason: collision with root package name */
    final b33 f14520a;

    /* renamed from: b, reason: collision with root package name */
    final boolean f14521b;

    private y23(b33 b33Var) {
        this.f14520a = b33Var;
        this.f14521b = b33Var != null;
    }

    public static y23 b(Context context, String str, String str2) {
        b33 z23Var;
        try {
            try {
                try {
                    IBinder d7 = DynamiteModule.e(context, DynamiteModule.f2489b, ModuleDescriptor.MODULE_ID).d("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    if (d7 == null) {
                        z23Var = null;
                    } else {
                        IInterface queryLocalInterface = d7.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        z23Var = queryLocalInterface instanceof b33 ? (b33) queryLocalInterface : new z23(d7);
                    }
                    z23Var.H1(x3.b.B3(context), str, null);
                    Log.i("GASS", "GassClearcutLogger Initialized.");
                    return new y23(z23Var);
                } catch (Exception e7) {
                    throw new z13(e7);
                }
            } catch (Exception e8) {
                throw new z13(e8);
            }
        } catch (RemoteException | z13 | NullPointerException | SecurityException unused) {
            Log.d("GASS", "Cannot dynamite load clearcut");
            return new y23(new c33());
        }
    }

    public static y23 c() {
        c33 c33Var = new c33();
        Log.d("GASS", "Clearcut logging disabled");
        return new y23(c33Var);
    }

    public final x23 a(byte[] bArr) {
        return new x23(this, bArr, null);
    }
}
