package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import u2.C5107a;

/* renamed from: com.google.android.gms.internal.ads.Yj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2879Yj implements InterfaceC2944al, InterfaceC2592Hl {

    /* renamed from: n, reason: collision with root package name */
    public A3 f28853n;

    /* renamed from: v, reason: collision with root package name */
    public final Context f28855v;

    /* renamed from: w, reason: collision with root package name */
    public final Zu f28856w;

    /* renamed from: x, reason: collision with root package name */
    public final C5107a f28857x;

    /* renamed from: y, reason: collision with root package name */
    public final SD f28858y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f28859z = false;

    /* renamed from: A, reason: collision with root package name */
    public boolean f28852A = false;

    /* renamed from: u, reason: collision with root package name */
    public final AtomicBoolean f28854u = new AtomicBoolean();

    public C2879Yj(Context context, Zu zu, C5107a c5107a, SD sd) {
        this.f28855v = context;
        this.f28856w = zu;
        this.f28857x = c5107a;
        this.f28858y = sd;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2592Hl
    public final void C(String str) {
        b();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2944al
    public final void D(C2953au c2953au) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2944al
    public final void H(C2687Ne c2687Ne) {
        b();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2592Hl
    public final void a(B2.u uVar) {
        b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0066, code lost:
    
        if (android.text.TextUtils.equals(r0, "service") != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        A3 a32;
        J3.a aVar;
        int i;
        int i4;
        C2855Xc o9;
        boolean andSet = this.f28854u.getAndSet(true);
        SD sd = this.f28858y;
        if (!andSet) {
            if (!((Boolean) AbstractC2632Ka.f25991o.r()).booleanValue()) {
                i = 3;
                if (!((Boolean) AbstractC2632Ka.f25992p.r()).booleanValue()) {
                    if (((Boolean) AbstractC2632Ka.f25990n.r()).booleanValue()) {
                        try {
                            String optString = new JSONObject(p2.j.f39798C.f39808h.g().n().f28423e).optString("local_flag_write");
                            if (TextUtils.equals(optString, "client")) {
                            }
                        } catch (JSONException unused) {
                        }
                    }
                    i = 1;
                }
                i4 = i - 1;
                Zu zu = this.f28856w;
                Context context = this.f28855v;
                if (i4 != 1) {
                    o9 = p2.j.f39798C.f39817r.o(context, C5107a.a(), zu);
                } else if (i4 == 2) {
                    o9 = p2.j.f39798C.f39817r.c(context, C5107a.a(), zu);
                }
                C2837Wb c2837Wb = AbstractC2655Lg.f26168C;
                this.f28853n = new A3(context, o9.a("google.afma.sdkConstants.getSdkConstants", c2837Wb, c2837Wb), this.f28857x, sd);
                this.f28859z = true;
            }
            i = 2;
            i4 = i - 1;
            Zu zu2 = this.f28856w;
            Context context2 = this.f28855v;
            if (i4 != 1) {
            }
            C2837Wb c2837Wb2 = AbstractC2655Lg.f26168C;
            this.f28853n = new A3(context2, o9.a("google.afma.sdkConstants.getSdkConstants", c2837Wb2, c2837Wb2), this.f28857x, sd);
            this.f28859z = true;
        }
        if (this.f28859z && (a32 = this.f28853n) != null) {
            if (!((Boolean) AbstractC2632Ka.f25978a.r()).booleanValue()) {
                aVar = a32.a();
            } else if (((AtomicBoolean) a32.f23812y).compareAndSet(false, true)) {
                J3.a a9 = a32.a();
                a9.c(new RunnableC3068d(16, a32), AbstractC3212fg.f30745h);
                aVar = a9;
            } else {
                aVar = OD.f26665u;
            }
            if (!this.f28852A && ((Boolean) AbstractC2530Ea.i.r()).booleanValue()) {
                aVar.c(new RunnableC3376ij(2, this), sd);
            }
            AbstractC2720Pd.g(aVar, "persistFlagsClient", AbstractC3212fg.f30745h);
        }
    }
}
