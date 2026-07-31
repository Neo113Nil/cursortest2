package com.unity3d.player;

import android.content.Context;
import java.util.concurrent.Semaphore;

/* loaded from: classes2.dex */
public final class N0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UnityPlayerForActivityOrService f22046a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f22047b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f22048c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f22049d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f22050e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f22051f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f22052g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f22053h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f22054i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f22055j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f22056k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Semaphore f22057l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ UnityPlayerForActivityOrService f22058m;

    public N0(UnityPlayerForActivityOrService unityPlayerForActivityOrService, UnityPlayerForActivityOrService unityPlayerForActivityOrService2, String str, int i4, boolean z4, boolean z5, boolean z6, boolean z7, String str2, int i5, boolean z8, boolean z9, Semaphore semaphore) {
        this.f22058m = unityPlayerForActivityOrService;
        this.f22046a = unityPlayerForActivityOrService2;
        this.f22047b = str;
        this.f22048c = i4;
        this.f22049d = z4;
        this.f22050e = z5;
        this.f22051f = z6;
        this.f22052g = z7;
        this.f22053h = str2;
        this.f22054i = i5;
        this.f22055j = z8;
        this.f22056k = z9;
        this.f22057l = semaphore;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h1.Q q4;
        h1.Q b4;
        h1.Q q5;
        h1.Q q6;
        h1.Q q7;
        try {
            try {
                UnityPlayerForActivityOrService unityPlayerForActivityOrService = this.f22058m;
                q4 = unityPlayerForActivityOrService.mSoftInput;
                if (q4 != null) {
                    unityPlayerForActivityOrService.dismissSoftInput();
                }
                UnityPlayerForActivityOrService unityPlayerForActivityOrService2 = this.f22058m;
                int a4 = SoftInputProvider.a();
                Context context = this.f22058m.mContext;
                UnityPlayerForActivityOrService unityPlayerForActivityOrService3 = this.f22046a;
                int a5 = h1.E.a(a4);
                if (a5 == 2) {
                    b4 = new B(context, unityPlayerForActivityOrService3);
                } else if (a5 != 3) {
                    b4 = new D(context, unityPlayerForActivityOrService3);
                } else {
                    h1.T.a(6, "When using URS, all soft input events are forwarded to the client. This code path should not be used.");
                    b4 = null;
                }
                unityPlayerForActivityOrService2.mSoftInput = b4;
                q5 = this.f22058m.mSoftInput;
                q5.a(this.f22047b, this.f22048c, this.f22049d, this.f22050e, this.f22051f, this.f22052g, this.f22053h, this.f22054i, this.f22055j, this.f22056k);
                q6 = this.f22058m.mSoftInput;
                q6.a(new M0(this));
                q7 = this.f22058m.mSoftInput;
                q7.a();
                this.f22058m.nativeReportKeyboardConfigChanged();
            } catch (Exception e4) {
                h1.T.a(6, "Exception when opening Softinput " + e4);
            }
            this.f22057l.release();
        } catch (Throwable th) {
            this.f22057l.release();
            throw th;
        }
    }
}
