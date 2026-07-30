package com.instagram.common.viewpoint.core;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Messenger;

/* renamed from: com.facebook.ads.redexgen.X.Ng, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ServiceConnectionC0630Ng implements ServiceConnection {
    public static String[] A01 = {"5NfIE0YcA1j7k4kI09Qd", "GOyJyQVDSAttzLj2dwW1R", "UEE9UjADaku6tgIVG7TE", "AlbuaripePsmIRlIONJuvTINhX", "hDpBwlS77lkTDgpWlwn57aFtHcNJW0B1", "G5FnfniCDoZltv23hjG8RcIHEgm214hW", "K1Tu", "8SU16w9FmjIzUCDhhEyMBCCw6KqJKOI3"};
    public final /* synthetic */ HandlerC0631Nh A00;

    public ServiceConnectionC0630Ng(HandlerC0631Nh handlerC0631Nh) {
        this.A00 = handlerC0631Nh;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C1159dL c1159dL;
        Handler handler;
        AbstractRunnableC0846Vt abstractRunnableC0846Vt;
        AbstractC1393hD abstractC1393hD;
        C1159dL c1159dL2;
        c1159dL = this.A00.A07;
        c1159dL.A0F().AHN();
        handler = this.A00.A04;
        abstractRunnableC0846Vt = this.A00.A09;
        handler.removeCallbacks(abstractRunnableC0846Vt);
        if (iBinder != null) {
            this.A00.A00 = new Messenger(iBinder);
            if (this.A00.A02) {
                this.A00.A02 = false;
                abstractC1393hD = this.A00.A06;
                abstractC1393hD.A06();
                return;
            }
            return;
        }
        c1159dL2 = this.A00.A07;
        c1159dL2.A0F().AHP();
        HandlerC0631Nh handlerC0631Nh = this.A00;
        if (A01[3].length() != 26) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[0] = "klTZBPtNd5GFvPmgAP3f";
        strArr[2] = "mBOUVEJ7kKkpCLxr10ij";
        handlerC0631Nh.A06();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C1159dL c1159dL;
        c1159dL = this.A00.A07;
        c1159dL.A0F().AHO();
        if (!this.A00.A01) {
            return;
        }
        this.A00.A06();
    }
}
