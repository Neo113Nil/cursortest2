package com.unity3d.player;

import android.content.Context;
import com.unity3d.player.a.AbstractC0015o;
import com.unity3d.player.a.AbstractC0019t;
import java.util.concurrent.Semaphore;

/* loaded from: classes.dex */
public final class G0 implements Runnable {
    public final /* synthetic */ UnityPlayerForActivityOrService a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ String h;
    public final /* synthetic */ int i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ Semaphore l;
    public final /* synthetic */ UnityPlayerForActivityOrService m;

    public G0(UnityPlayerForActivityOrService unityPlayerForActivityOrService, UnityPlayerForActivityOrService unityPlayerForActivityOrService2, String str, int i, boolean z, boolean z2, boolean z3, boolean z4, String str2, int i2, boolean z5, boolean z6, Semaphore semaphore) {
        this.m = unityPlayerForActivityOrService;
        this.a = unityPlayerForActivityOrService2;
        this.b = str;
        this.c = i;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = str2;
        this.i = i2;
        this.j = z5;
        this.k = z6;
        this.l = semaphore;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC0060s abstractC0060s;
        AbstractC0060s c0065x;
        AbstractC0060s abstractC0060s2;
        AbstractC0060s abstractC0060s3;
        try {
            try {
                UnityPlayerForActivityOrService unityPlayerForActivityOrService = this.m;
                abstractC0060s = unityPlayerForActivityOrService.mSoftInput;
                if (abstractC0060s != null) {
                    unityPlayerForActivityOrService.dismissSoftInput();
                }
                UnityPlayerForActivityOrService unityPlayerForActivityOrService2 = this.m;
                int a = SoftInputProvider.a();
                Context context = this.m.mContext;
                UnityPlayerForActivityOrService unityPlayerForActivityOrService3 = this.a;
                if (AbstractC0015o.a(a) == 2) {
                    c0065x = new C0065x(context, unityPlayerForActivityOrService3);
                } else {
                    c0065x = new C0066y(context, unityPlayerForActivityOrService3);
                }
                unityPlayerForActivityOrService2.mSoftInput = c0065x;
                abstractC0060s2 = this.m.mSoftInput;
                abstractC0060s2.a(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
                abstractC0060s3 = this.m.mSoftInput;
                abstractC0060s3.f = new F0(this);
                abstractC0060s3.d();
                this.m.nativeReportKeyboardConfigChanged();
            } catch (Exception e) {
                AbstractC0019t.Log(6, "Exception when opening Softinput " + e);
            }
        } finally {
            this.l.release();
        }
    }
}
