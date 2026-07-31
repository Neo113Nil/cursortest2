package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.rp;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.cn.zn.zmn;
import com.bytedance.sdk.openadsdk.core.doe;
import com.bytedance.sdk.openadsdk.core.model.am;
import com.bytedance.sdk.openadsdk.core.model.bjh;
import com.bytedance.sdk.openadsdk.core.model.kjb;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public abstract class zmn<L, A> {
    protected com.bytedance.sdk.component.zg.fs.zn fb;
    protected final Context zmn;
    protected final AtomicBoolean fs = new AtomicBoolean(false);
    protected final List<zmn<L, A>.fb> zn = Collections.synchronizedList(new ArrayList());
    private final rp.zmn btk = new rp.zmn() { // from class: com.bytedance.sdk.openadsdk.component.reward.zmn.6
        @Override // com.bytedance.sdk.component.utils.rp.zmn
        public void zmn(Context context, Intent intent, boolean z, int i) {
            if (z) {
                zmn zmnVar = zmn.this;
                if (zmnVar.fb == null) {
                    zmnVar.fb = new fs("net connect task", zmnVar.zn);
                    com.bytedance.sdk.component.utils.bvs.zmn().post(zmn.this.fb);
                }
            }
        }
    };

    protected abstract int fs();

    protected abstract void fs(A a);

    protected abstract int hhw();

    protected abstract cn zmn();

    protected abstract A zmn(Context context, com.bytedance.sdk.openadsdk.core.model.zmn zmnVar, AdSlot adSlot);

    protected abstract Object zmn(A a);

    protected abstract void zmn(L l, int i, String str);

    protected abstract void zmn(L l, Object obj);

    protected zmn(Context context) {
        this.zmn = context == null ? com.bytedance.sdk.openadsdk.core.kgc.zmn() : context.getApplicationContext();
        zn();
    }

    public void zmn(AdSlot adSlot) {
        if (adSlot == null || TextUtils.isEmpty(adSlot.getCodeId()) || !TextUtils.isEmpty(adSlot.getBidAdm())) {
            return;
        }
        fs(adSlot);
    }

    private void fs(final AdSlot adSlot) {
        com.bytedance.sdk.openadsdk.core.kgc.zn().zmn(adSlot, zmn(adSlot, true), fs(), new doe() { // from class: com.bytedance.sdk.openadsdk.component.reward.zmn.1
            boolean zmn = false;

            @Override // com.bytedance.sdk.openadsdk.core.doe, com.bytedance.sdk.openadsdk.core.nqi.zmn
            public void zmn(int i, String str) {
            }

            @Override // com.bytedance.sdk.openadsdk.core.doe, com.bytedance.sdk.openadsdk.core.phc
            public String zmn() {
                return zmn.this.zmn().zmn(adSlot.getCodeId(), false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.doe, com.bytedance.sdk.openadsdk.core.phc
            public boolean zmn(com.bytedance.sdk.openadsdk.core.model.zmn zmnVar) {
                boolean zmn = zmn.this.zmn().zmn(zmnVar);
                this.zmn = zmn;
                return zmn;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bytedance.sdk.openadsdk.core.doe, com.bytedance.sdk.openadsdk.core.nqi.zmn
            public void zmn(com.bytedance.sdk.openadsdk.core.model.zmn zmnVar, com.bytedance.sdk.openadsdk.core.model.zn znVar) {
                if (this.zmn || zmnVar.btk() == null || zmnVar.btk().isEmpty()) {
                    return;
                }
                zmn zmnVar2 = zmn.this;
                zmn.this.zmn(zmnVar, (com.bytedance.sdk.openadsdk.core.model.zmn) zmnVar2.zmn(zmnVar2.zmn, zmnVar, adSlot), adSlot, true, (boolean) null);
            }
        });
    }

    public void zmn(AdSlot adSlot, L l) {
        Objects.toString(adSlot);
        Objects.toString(l);
        fs(adSlot, l);
    }

    private void fs(final AdSlot adSlot, final L l) {
        final long currentTimeMillis = System.currentTimeMillis();
        com.bytedance.sdk.openadsdk.core.kgc.zn().zmn(adSlot, zmn(adSlot, false), fs(), new doe() { // from class: com.bytedance.sdk.openadsdk.component.reward.zmn.2
            boolean zmn = false;

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bytedance.sdk.openadsdk.core.doe, com.bytedance.sdk.openadsdk.core.nqi.zmn
            public void zmn(int i, String str) {
                Object obj = l;
                if (obj != null) {
                    zmn.this.zmn((zmn) obj, i, str);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bytedance.sdk.openadsdk.core.doe, com.bytedance.sdk.openadsdk.core.nqi.zmn
            public void zmn(com.bytedance.sdk.openadsdk.core.model.zmn zmnVar, com.bytedance.sdk.openadsdk.core.model.zn znVar) {
                if (zmnVar.btk() != null && !zmnVar.btk().isEmpty()) {
                    zmn zmnVar2 = zmn.this;
                    Object zmn = zmnVar2.zmn(zmnVar2.zmn, zmnVar, adSlot);
                    if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                        com.bytedance.sdk.openadsdk.doe.zmn.fb.zmn().zmn(zmnVar.btk().isEmpty() ? null : zmnVar.btk().get(0));
                        com.bytedance.sdk.openadsdk.cyb.fb.zmn(zmnVar.nps(), System.currentTimeMillis() - currentTimeMillis);
                    }
                    if (l != null && com.bytedance.sdk.openadsdk.core.kgc.fb().kjb() == 0) {
                        zmn.this.zmn(adSlot, zmnVar, (com.bytedance.sdk.openadsdk.core.model.zmn) l, zmn, this.zmn);
                    }
                    zmn.this.zmn(zmnVar, (com.bytedance.sdk.openadsdk.core.model.zmn) zmn, adSlot, false, (boolean) l);
                    return;
                }
                Object obj = l;
                if (obj != null) {
                    zmn.this.zmn((zmn) obj, -3, com.bytedance.sdk.openadsdk.core.bvs.zmn(-3));
                    znVar.zmn(-3);
                    znVar.zn(zmn.this.hhw());
                    com.bytedance.sdk.openadsdk.core.model.zn.zmn(znVar);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.doe, com.bytedance.sdk.openadsdk.core.phc
            public String zmn() {
                if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                    return null;
                }
                String zmn = zmn.this.zmn().zmn(adSlot.getCodeId(), true);
                TextUtils.isEmpty(zmn);
                if (TextUtils.isEmpty(zmn)) {
                    return null;
                }
                return zmn;
            }

            @Override // com.bytedance.sdk.openadsdk.core.doe, com.bytedance.sdk.openadsdk.core.phc
            public boolean zmn(com.bytedance.sdk.openadsdk.core.model.zmn zmnVar) {
                this.zmn = zmn.this.zmn().zmn(zmnVar);
                return this.zmn;
            }
        });
    }

    protected void zmn(com.bytedance.sdk.openadsdk.core.model.zmn zmnVar, A a, AdSlot adSlot, boolean z, L l) {
        if (!z) {
            com.bytedance.sdk.openadsdk.rt.zn.zmn().zmn(zmnVar.nps());
        }
        zmn<L, A>.zn znVar = new zn(new C0147zmn(adSlot, zmnVar, l, false), zmnVar);
        zmn(zmnVar);
        for (int i = 0; i < zmnVar.btk().size(); i++) {
            nqi nqiVar = zmnVar.btk().get(i);
            int cd = nqiVar.cd();
            if (i == 0 && cd == 43) {
                nqiVar.mrt().hhw(0);
            }
            if (com.bytedance.sdk.openadsdk.component.reward.zn.zg.zmn(nqiVar)) {
                if (com.bytedance.sdk.openadsdk.component.reward.zn.zg.btk()) {
                    nqiVar.mrt().hhw(0);
                }
                if (!zmnVar.bvs() && cd != 43) {
                    return;
                }
            }
            zmn(zmnVar, nqiVar, (nqi) a, adSlot, z, (zmn<L, nqi>.zn) znVar);
            if (!zmnVar.bvs()) {
            }
        }
    }

    protected void zmn(com.bytedance.sdk.openadsdk.core.model.zmn zmnVar) {
        bjh rc = zmnVar.rc();
        int i = zmnVar.bvs() ? 10 : 1;
        if (rc != null) {
            i = rc.cyb();
        }
        for (final int i2 = 0; i2 < zmnVar.btk().size() && i2 < i; i2++) {
            com.bytedance.sdk.openadsdk.core.cn.zn.zmn.zmn().zmn(zmnVar.btk().get(i2), new zmn.InterfaceC0157zmn() { // from class: com.bytedance.sdk.openadsdk.component.reward.zmn.3
                @Override // com.bytedance.sdk.openadsdk.core.cn.zn.zmn.InterfaceC0157zmn
                public void zmn(boolean z) {
                    com.bytedance.sdk.component.utils.iqz.zmn("BVL", "onCachedResponse: i=" + i2 + ", isSuccess=" + z);
                }
            });
        }
    }

    private boolean zmn(boolean z, nqi nqiVar, AdSlot adSlot) {
        if (z) {
            return !am.zn(nqiVar) && nqi.btk(nqiVar) && com.bytedance.sdk.openadsdk.core.kgc.fb().kjb(adSlot.getCodeId()).fb == 1 && !com.bytedance.sdk.component.utils.kgc.fb(this.zmn);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean zmn(zmn<L, A>.zn znVar) {
        return znVar != null && com.bytedance.sdk.openadsdk.core.kgc.fb().kjb() == 1;
    }

    private void zmn(nqi nqiVar, final AdSlot adSlot, final com.bytedance.sdk.openadsdk.core.model.zmn zmnVar, final A a, final boolean z, final zmn<L, A>.zn znVar) {
        com.bytedance.sdk.openadsdk.core.cn.zmn.fs zmn = nqi.zmn(CacheDirFactory.getICacheDir(nqiVar.hqs()).zmn(), nqiVar);
        zmn.zmn("material_meta", nqiVar);
        zmn.zmn("ad_slot", adSlot);
        com.bytedance.sdk.openadsdk.core.cn.btk.zmn.zmn(zmn, new com.bykv.vk.openvk.zmn.zmn.zmn.btk.fs() { // from class: com.bytedance.sdk.openadsdk.component.reward.zmn.4
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bykv.vk.openvk.zmn.zmn.zmn.btk.zmn.InterfaceC0101zmn
            public void zmn(com.bykv.vk.openvk.zmn.zmn.zmn.zn.zn znVar2, int i) {
                zmn.this.fs((zmn) a);
                if (!z) {
                    if (zmn.this.zmn(znVar)) {
                        znVar.zmn(a);
                        return;
                    }
                    return;
                }
                zmn.this.zmn().zmn(adSlot, zmnVar);
            }

            @Override // com.bykv.vk.openvk.zmn.zmn.zmn.btk.zmn.InterfaceC0101zmn
            public void zmn(com.bykv.vk.openvk.zmn.zmn.zmn.zn.zn znVar2, int i, String str) {
                if (zmn.this.zmn(znVar)) {
                    znVar.zmn(i, str);
                }
            }
        });
    }

    protected void zmn(com.bytedance.sdk.openadsdk.core.model.zmn zmnVar, nqi nqiVar, A a, AdSlot adSlot, boolean z, zmn<L, A>.zn znVar) {
        if (zmn(z, nqiVar, adSlot)) {
            zmn((fb) new fb(nqiVar, adSlot, zmnVar));
            return;
        }
        boolean zmn = zmn((zn) znVar);
        if (am.zn(nqiVar)) {
            if (z) {
                zmn().zmn(adSlot, zmnVar);
            }
        } else if (nqi.btk(nqiVar)) {
            if (nqiVar.mrt() == null) {
                return;
            }
            zmn(nqiVar, adSlot, zmnVar, (com.bytedance.sdk.openadsdk.core.model.zmn) a, z, (zmn<L, com.bytedance.sdk.openadsdk.core.model.zmn>.zn) znVar);
            zmn = false;
        } else if (z) {
            zmn().zmn(adSlot, zmnVar);
        }
        if (zmn) {
            znVar.zmn(a);
        }
    }

    protected void zmn(final AdSlot adSlot, final com.bytedance.sdk.openadsdk.core.model.zmn zmnVar, L l, A a, final boolean z) {
        com.bytedance.sdk.openadsdk.core.cn.fs().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.zmn.5
            @Override // java.lang.Runnable
            public void run() {
                if (z) {
                    zmn.this.zn(adSlot);
                } else {
                    zmn.this.zmn().zmn(adSlot, zmnVar);
                    zmn.this.zn(adSlot);
                }
            }
        });
        if (l != null) {
            zmn((zmn<L, A>) l, zmn((zmn<L, A>) a));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zn(AdSlot adSlot) {
        zmn().zmn(adSlot.getCodeId());
    }

    protected void zmn(zmn<L, A>.fb fbVar) {
        if (fbVar == null) {
            return;
        }
        if (this.zn.size() > 0) {
            this.zn.remove(0);
        }
        this.zn.add(fbVar);
    }

    protected kjb zmn(AdSlot adSlot, boolean z) {
        kjb kjbVar = new kjb();
        if (adSlot != null && (com.bytedance.sdk.openadsdk.core.kgc.fb().mw(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > 0.0f || adSlot.isExpressAd())) {
            kjbVar.bvs = 2;
        }
        if (fs() == 7) {
            kjbVar.fs = z ? 2 : 1;
        } else {
            kjbVar.zn = z ? 2 : 1;
        }
        return kjbVar;
    }

    protected void zn() {
        if (this.fs.get()) {
            return;
        }
        this.fs.set(true);
        rp.zmn(this.btk, this.zmn);
    }

    protected void finalize() throws Throwable {
        super.finalize();
        if (this.fb != null) {
            try {
                com.bytedance.sdk.component.utils.bvs.zmn().removeCallbacks(this.fb);
            } catch (Throwable unused) {
            }
            this.fb = null;
        }
        fb();
    }

    protected void fb() {
        if (this.fs.get()) {
            this.fs.set(false);
            try {
                rp.zmn(this.btk);
            } catch (Exception unused) {
            }
        }
    }

    public void zmn(String str, nqi nqiVar) {
        zmn().zmn(str, nqiVar);
    }

    public void btk() {
        try {
            zmn().zmn();
        } catch (Throwable unused) {
        }
    }

    protected class fb extends com.bytedance.sdk.component.zg.fs.zn {
        final AdSlot fs;
        final nqi zmn;
        final com.bytedance.sdk.openadsdk.core.model.zmn zn;

        public fb(nqi nqiVar, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.zmn zmnVar) {
            super("VideoPreloadTask");
            this.zmn = nqiVar;
            this.fs = adSlot;
            this.zn = zmnVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            nqi nqiVar = this.zmn;
            if (nqiVar == null || nqiVar.mrt() == null) {
                return;
            }
            com.bytedance.sdk.openadsdk.core.cn.zmn.fs zmn = nqi.zmn(CacheDirFactory.getICacheDir(this.zmn.hqs()).zmn(), this.zmn);
            zmn.zmn("material_meta", this.zmn);
            zmn.zmn("ad_slot", this.fs);
            com.bytedance.sdk.openadsdk.core.cn.btk.zmn.zmn(zmn, new com.bykv.vk.openvk.zmn.zmn.zmn.btk.fs() { // from class: com.bytedance.sdk.openadsdk.component.reward.zmn.fb.1
                @Override // com.bykv.vk.openvk.zmn.zmn.zmn.btk.zmn.InterfaceC0101zmn
                public void zmn(com.bykv.vk.openvk.zmn.zmn.zmn.zn.zn znVar, int i, String str) {
                }

                @Override // com.bykv.vk.openvk.zmn.zmn.zmn.btk.zmn.InterfaceC0101zmn
                public void zmn(com.bykv.vk.openvk.zmn.zmn.zmn.zn.zn znVar, int i) {
                    cn zmn2 = zmn.this.zmn();
                    fb fbVar = fb.this;
                    zmn2.zmn(fbVar.fs, fbVar.zn);
                }
            });
        }
    }

    protected class fs extends com.bytedance.sdk.component.zg.fs.zn {
        private final List<zmn<L, A>.fb> fs;

        public fs(String str, List<zmn<L, A>.fb> list) {
            super(str);
            this.fs = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            List<zmn<L, A>.fb> list = this.fs;
            if (list == null || list.isEmpty()) {
                zmn.this.fb = null;
                return;
            }
            ArrayList arrayList = new ArrayList(this.fs);
            this.fs.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                try {
                    ((fb) it.next()).run();
                } catch (Exception e) {
                    com.bytedance.sdk.component.utils.iqz.zmn("BVL", "continue download task error", e);
                }
            }
            zmn.this.fb = null;
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.component.reward.zmn$zmn, reason: collision with other inner class name */
    protected class C0147zmn {
        protected final boolean fb;
        protected final com.bytedance.sdk.openadsdk.core.model.zmn fs;
        protected final AdSlot zmn;
        protected final L zn;

        public C0147zmn(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.zmn zmnVar, L l, boolean z) {
            this.zmn = adSlot;
            this.fs = zmnVar;
            this.zn = l;
            this.fb = z;
        }

        public void zmn(int i, String str) {
            L l = this.zn;
            if (l != null) {
                zmn.this.zmn((zmn) l, i, str);
            }
        }

        public void zmn(A a) {
            zmn.this.zmn(this.zmn, this.fs, (com.bytedance.sdk.openadsdk.core.model.zmn) this.zn, (L) a, this.fb);
        }
    }

    protected class zn {
        protected final com.bytedance.sdk.openadsdk.core.model.zmn fb;
        protected final AtomicBoolean fs;
        protected final zmn<L, A>.C0147zmn zmn;
        protected final AtomicInteger zn;

        private zn(zmn<L, A>.C0147zmn c0147zmn, com.bytedance.sdk.openadsdk.core.model.zmn zmnVar) {
            this.fs = new AtomicBoolean(false);
            this.zmn = c0147zmn;
            this.fb = zmnVar;
            this.zn = new AtomicInteger(zmn());
        }

        private int zmn() {
            if (!this.fb.hhw()) {
                return 0;
            }
            int i = 0;
            for (int i2 = 0; i2 < this.fb.btk().size(); i2++) {
                nqi nqiVar = this.fb.btk().get(i2);
                if (nqiVar != null && !am.zn(nqiVar) && nqiVar.mrt() != null) {
                    i++;
                }
            }
            return i;
        }

        public void zmn(int i, String str) {
            if (this.zn.decrementAndGet() > 0 || !this.fs.compareAndSet(false, true)) {
                return;
            }
            this.zmn.zmn(i, str);
            com.bytedance.sdk.openadsdk.cyb.fb.zmn("choose_ad_load_error", false, new com.bytedance.sdk.openadsdk.cyb.fs() { // from class: com.bytedance.sdk.openadsdk.component.reward.zmn.zn.1
                @Override // com.bytedance.sdk.openadsdk.cyb.fs
                @Nullable
                public com.bytedance.sdk.openadsdk.cyb.zmn.zn zmn() throws Exception {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("req_id", zn.this.fb.zn());
                    return com.bytedance.sdk.openadsdk.cyb.zmn.fb.fs().zmn("choose_ad_load_error").fs(jSONObject.toString());
                }
            });
        }

        public void zmn(A a) {
            this.zn.decrementAndGet();
            if (this.zmn == null || !this.fs.compareAndSet(false, true)) {
                return;
            }
            this.zmn.zmn(a);
        }
    }
}
