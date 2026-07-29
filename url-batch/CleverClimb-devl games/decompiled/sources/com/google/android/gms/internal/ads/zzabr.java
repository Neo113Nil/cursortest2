package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.ads.mediation.testsuite.dataobjects.AdUnit;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

@zzadh
/* loaded from: classes2.dex */
public final class zzabr extends zzabh {
    private final zzaqw zzbnd;
    private zzwy zzbtj;

    @VisibleForTesting
    private zzww zzbzq;
    protected zzxe zzbzr;
    private boolean zzbzs;
    private final zznx zzvr;
    private zzxn zzwh;

    zzabr(Context context, zzaji zzajiVar, zzxn zzxnVar, zzabm zzabmVar, zznx zznxVar, zzaqw zzaqwVar) {
        super(context, zzajiVar, zzabmVar);
        this.zzwh = zzxnVar;
        this.zzbtj = zzajiVar.zzcod;
        this.zzvr = zznxVar;
        this.zzbnd = zzaqwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabh, com.google.android.gms.internal.ads.zzajx
    public final void onStop() {
        synchronized (this.zzbzh) {
            super.onStop();
            if (this.zzbzq != null) {
                this.zzbzq.cancel();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    protected final zzajh zzaa(int i) {
        zzwy zzwyVar;
        zzael zzaelVar;
        String str;
        boolean z;
        long j;
        String str2;
        zzwy zzwyVar2;
        Iterator<zzxe> it;
        String str3;
        boolean z2;
        long j2;
        int i2;
        zzaef zzaefVar = this.zzbze.zzcgs;
        zzjj zzjjVar = zzaefVar.zzccv;
        zzaqw zzaqwVar = this.zzbnd;
        List<String> list = this.zzbzf.zzbsn;
        List<String> list2 = this.zzbzf.zzbso;
        List<String> list3 = this.zzbzf.zzces;
        int i3 = this.zzbzf.orientation;
        long j3 = this.zzbzf.zzbsu;
        String str4 = zzaefVar.zzccy;
        boolean z3 = this.zzbzf.zzceq;
        zzwx zzwxVar = this.zzbzr != null ? this.zzbzr.zzbtw : null;
        zzxq zzxqVar = this.zzbzr != null ? this.zzbzr.zzbtx : null;
        String name = this.zzbzr != null ? this.zzbzr.zzbty : AdMobAdapter.class.getName();
        zzwy zzwyVar3 = this.zzbtj;
        zzxa zzxaVar = this.zzbzr != null ? this.zzbzr.zzbtz : null;
        zzwx zzwxVar2 = zzwxVar;
        zzxq zzxqVar2 = zzxqVar;
        long j4 = this.zzbzf.zzcer;
        zzjn zzjnVar = this.zzbze.zzacv;
        long j5 = this.zzbzf.zzcep;
        long j6 = this.zzbze.zzcoh;
        long j7 = this.zzbzf.zzceu;
        String str5 = this.zzbzf.zzcev;
        JSONObject jSONObject = this.zzbze.zzcob;
        zzaig zzaigVar = this.zzbzf.zzcfe;
        List<String> list4 = this.zzbzf.zzcff;
        List<String> list5 = this.zzbzf.zzcfg;
        boolean z4 = this.zzbtj != null ? this.zzbtj.zzbsz : false;
        zzael zzaelVar2 = this.zzbzf.zzcfi;
        if (this.zzbzq != null) {
            List<zzxe> zzme = this.zzbzq.zzme();
            if (zzme == null) {
                zzwyVar = zzwyVar3;
                zzaelVar = zzaelVar2;
                str2 = "".toString();
                str = str4;
                z = z3;
                j = j7;
            } else {
                Iterator<zzxe> it2 = zzme.iterator();
                String str6 = "";
                while (it2.hasNext()) {
                    zzael zzaelVar3 = zzaelVar2;
                    zzxe next = it2.next();
                    if (next != null) {
                        it = it2;
                        if (next.zzbtw == null || TextUtils.isEmpty(next.zzbtw.zzbru)) {
                            zzwyVar2 = zzwyVar3;
                        } else {
                            String valueOf = String.valueOf(str6);
                            j2 = j7;
                            String str7 = next.zzbtw.zzbru;
                            switch (next.zzbtv) {
                                case -1:
                                    i2 = 4;
                                    zzwyVar2 = zzwyVar3;
                                    break;
                                case 0:
                                    zzwyVar2 = zzwyVar3;
                                    i2 = 0;
                                    break;
                                case 1:
                                    zzwyVar2 = zzwyVar3;
                                    i2 = 1;
                                    break;
                                case 2:
                                default:
                                    i2 = 6;
                                    zzwyVar2 = zzwyVar3;
                                    break;
                                case 3:
                                    i2 = 2;
                                    zzwyVar2 = zzwyVar3;
                                    break;
                                case 4:
                                    i2 = 3;
                                    zzwyVar2 = zzwyVar3;
                                    break;
                                case 5:
                                    i2 = 5;
                                    zzwyVar2 = zzwyVar3;
                                    break;
                            }
                            long j8 = next.zzbub;
                            z2 = z3;
                            str3 = str4;
                            StringBuilder sb = new StringBuilder(String.valueOf(str7).length() + 33);
                            sb.append(str7);
                            sb.append(".");
                            sb.append(i2);
                            sb.append(".");
                            sb.append(j8);
                            String sb2 = sb.toString();
                            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(sb2).length());
                            sb3.append(valueOf);
                            sb3.append(sb2);
                            sb3.append("_");
                            str6 = sb3.toString();
                            zzaelVar2 = zzaelVar3;
                            it2 = it;
                            j7 = j2;
                            zzwyVar3 = zzwyVar2;
                            z3 = z2;
                            str4 = str3;
                        }
                    } else {
                        zzwyVar2 = zzwyVar3;
                        it = it2;
                    }
                    str3 = str4;
                    z2 = z3;
                    j2 = j7;
                    zzaelVar2 = zzaelVar3;
                    it2 = it;
                    j7 = j2;
                    zzwyVar3 = zzwyVar2;
                    z3 = z2;
                    str4 = str3;
                }
                zzwyVar = zzwyVar3;
                zzaelVar = zzaelVar2;
                str = str4;
                z = z3;
                j = j7;
                str2 = str6.substring(0, Math.max(0, str6.length() - 1));
            }
        } else {
            zzwyVar = zzwyVar3;
            zzaelVar = zzaelVar2;
            str = str4;
            z = z3;
            j = j7;
            str2 = null;
        }
        return new zzajh(zzjjVar, zzaqwVar, list, i, list2, list3, i3, j3, str, z, zzwxVar2, zzxqVar2, name, zzwyVar, zzxaVar, j4, zzjnVar, j5, j6, j, str5, jSONObject, null, zzaigVar, list4, list5, z4, zzaelVar, str2, this.zzbzf.zzbsr, this.zzbzf.zzcfl, this.zzbze.zzcoq, this.zzbzf.zzzl, this.zzbze.zzcor, this.zzbzf.zzcfp, this.zzbzf.zzbsp, this.zzbzf.zzzm, this.zzbzf.zzcfq);
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    protected final void zze(long j) throws zzabk {
        Bundle bundle;
        synchronized (this.zzbzh) {
            this.zzbzq = this.zzbtj.zzbsx != -1 ? new zzxh(this.mContext, this.zzbze.zzcgs, this.zzwh, this.zzbtj, this.zzbzf.zzare, this.zzbzf.zzarg, this.zzbzf.zzcfj, j, ((Long) zzkb.zzik().zzd(zznk.zzbao)).longValue(), 2, this.zzbze.zzcor) : new zzxk(this.mContext, this.zzbze.zzcgs, this.zzwh, this.zzbtj, this.zzbzf.zzare, this.zzbzf.zzarg, this.zzbzf.zzcfj, j, ((Long) zzkb.zzik().zzd(zznk.zzbao)).longValue(), this.zzvr, this.zzbze.zzcor);
        }
        ArrayList arrayList = new ArrayList(this.zzbtj.zzbsm);
        Bundle bundle2 = this.zzbze.zzcgs.zzccv.zzaqg;
        if ((bundle2 == null || (bundle = bundle2.getBundle(AdUnit.GOOGLE_ADAPTER_CLASS)) == null) ? false : bundle.getBoolean("_skipMediation")) {
            ListIterator listIterator = arrayList.listIterator();
            while (listIterator.hasNext()) {
                if (!((zzwx) listIterator.next()).zzbrt.contains(AdUnit.GOOGLE_ADAPTER_CLASS)) {
                    listIterator.remove();
                }
            }
        }
        this.zzbzr = this.zzbzq.zzh(arrayList);
        switch (this.zzbzr.zzbtv) {
            case 0:
                if (this.zzbzr.zzbtw == null || this.zzbzr.zzbtw.zzbsf == null) {
                    return;
                }
                CountDownLatch countDownLatch = new CountDownLatch(1);
                zzakk.zzcrm.post(new zzabs(this, countDownLatch));
                try {
                    countDownLatch.await(10L, TimeUnit.SECONDS);
                    synchronized (this.zzbzh) {
                        if (!this.zzbzs) {
                            throw new zzabk("View could not be prepared", 0);
                        }
                        if (this.zzbnd.isDestroyed()) {
                            throw new zzabk("Assets not loaded, web view is destroyed", 0);
                        }
                    }
                    return;
                } catch (InterruptedException e) {
                    String valueOf = String.valueOf(e);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 38);
                    sb.append("Interrupted while waiting for latch : ");
                    sb.append(valueOf);
                    throw new zzabk(sb.toString(), 0);
                }
            case 1:
                throw new zzabk("No fill from any mediation ad networks.", 3);
            default:
                int i = this.zzbzr.zzbtv;
                StringBuilder sb2 = new StringBuilder(40);
                sb2.append("Unexpected mediation result: ");
                sb2.append(i);
                throw new zzabk(sb2.toString(), 0);
        }
    }
}
