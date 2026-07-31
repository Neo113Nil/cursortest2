package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class h40 extends u2.c {

    /* renamed from: a, reason: collision with root package name */
    private final g40 f6067a;

    /* renamed from: b, reason: collision with root package name */
    private final List<u2.d> f6068b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private String f6069c;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
    
        r4.f6068b.add(new com.google.android.gms.internal.ads.o40(r3));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h40(g40 g40Var) {
        IBinder iBinder;
        this.f6067a = g40Var;
        try {
            this.f6069c = g40Var.e();
        } catch (RemoteException e7) {
            io0.e("", e7);
            this.f6069c = "";
        }
        try {
            for (n40 n40Var : g40Var.f()) {
                n40 n40Var2 = null;
                if ((n40Var instanceof IBinder) && (iBinder = (IBinder) n40Var) != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                    n40Var2 = queryLocalInterface instanceof n40 ? (n40) queryLocalInterface : new l40(iBinder);
                }
            }
        } catch (RemoteException e8) {
            io0.e("", e8);
        }
    }
}
