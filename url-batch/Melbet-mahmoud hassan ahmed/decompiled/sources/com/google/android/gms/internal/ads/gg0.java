package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
import f3.c;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class gg0 extends c.a {

    /* renamed from: a, reason: collision with root package name */
    private final List<c.b> f5624a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private String f5625b;

    public gg0(g40 g40Var) {
        try {
            this.f5625b = g40Var.e();
        } catch (RemoteException e7) {
            io0.e("", e7);
            this.f5625b = "";
        }
        try {
            for (n40 n40Var : g40Var.f()) {
                n40 s62 = n40Var instanceof IBinder ? m40.s6((IBinder) n40Var) : null;
                if (s62 != null) {
                    this.f5624a.add(new hg0(s62));
                }
            }
        } catch (RemoteException e8) {
            io0.e("", e8);
        }
    }
}
