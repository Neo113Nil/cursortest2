package com.facebook.ads.redexgen.core;

import android.os.ConditionVariable;

/* renamed from: com.facebook.ads.redexgen.X.Mp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2466Mp extends Thread {
    public final /* synthetic */ ConditionVariable A00;
    public final /* synthetic */ C3427kM A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2466Mp(C3427kM c3427kM, String str, ConditionVariable conditionVariable) {
        super(str);
        this.A01 = c3427kM;
        this.A00 = conditionVariable;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (WU.A02(this)) {
            return;
        }
        try {
            synchronized (this.A01) {
                try {
                    this.A00.open();
                    this.A01.A05();
                } finally {
                    th = th;
                    while (true) {
                        try {
                        } catch (Throwable th) {
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            WU.A00(th2, this);
        }
    }
}
