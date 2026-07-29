package com.aiming.mdt.adt;

import android.content.Context;
import com.aiming.mdt.a.C0076;
import com.aiming.mdt.a.C0107;
import com.aiming.mdt.adt.C0226;
import com.aiming.mdt.adt.bean.AdBean;
import com.aiming.mdt.utils.C0282;
import java.util.List;

/* renamed from: com.aiming.mdt.adt.ʻʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
final class RunnableC0228 implements Runnable {

    /* renamed from: ʻ, reason: contains not printable characters */
    private /* synthetic */ C0226 f739;

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private /* synthetic */ List f740;

    /* renamed from: ʼ, reason: contains not printable characters */
    private /* synthetic */ int f741;

    RunnableC0228(C0226 c0226, List list, int i) {
        this.f739 = c0226;
        this.f740 = list;
        this.f741 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        C0226.InterfaceC0227 interfaceC0227;
        AdBean adBean;
        try {
            context = this.f739.f733;
            if (!C0107.m390(context, (List<String>) this.f740)) {
                if (this.f741 == 3) {
                    C0282.m971("Adt Interactive has given a ready callback, no need error callback");
                    return;
                } else {
                    this.f739.m831("response is not available");
                    return;
                }
            }
            if (this.f741 == 3) {
                C0282.m971("Adt Interactive has given a ready callback");
                return;
            }
            interfaceC0227 = this.f739.f735;
            adBean = this.f739.f736;
            interfaceC0227.mo15(adBean);
            this.f739.m832();
        } catch (Exception e) {
            C0282.m972("AdManager load res exception : ", e);
            C0076.m232().m236(e);
            if (this.f741 == 3) {
                C0282.m971("Adt Interactive has given a ready callback, no need error callback");
            } else {
                this.f739.m831("response is not available");
            }
        }
    }
}
