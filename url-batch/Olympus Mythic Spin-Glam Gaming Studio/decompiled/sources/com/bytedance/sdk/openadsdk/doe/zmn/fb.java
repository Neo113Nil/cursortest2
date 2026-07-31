package com.bytedance.sdk.openadsdk.doe.zmn;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.widget.FrameLayout;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.core.model.am;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.doe.zmn.zmn;
import com.bytedance.sdk.openadsdk.mw.nps;
import com.bytedance.sdk.openadsdk.uqh.btk;
import com.bytedance.sdk.openadsdk.utils.nu;
import com.bytedance.sdk.openadsdk.utils.oub;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public class fb {
    private static volatile fb fs;
    private final Handler zmn;
    private int zn = 0;
    private int fb = 2;
    private int btk = 3600000;
    private final ArrayList<fs> hhw = new ArrayList<>();

    public static fb zmn() {
        if (fs == null) {
            synchronized (fb.class) {
                try {
                    if (fs == null) {
                        fs = new fb();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return fs;
    }

    private fb() {
        nu.zn((Runnable) new com.bytedance.sdk.component.zg.fs.zn("pag_pre_render_init") { // from class: com.bytedance.sdk.openadsdk.doe.zmn.fb.1
            @Override // java.lang.Runnable
            public void run() {
                fb.this.zn = btk.zmn("plb_pre_render_enable", 0);
                fb.this.fb = btk.zmn("plb_pre_render_max_count", 2);
                if (fb.this.fb <= 0 || fb.this.fb > 4) {
                    fb.this.fb = 2;
                }
                fb.this.btk = btk.zmn("plb_pre_render_alive_time", 3600000);
                if (fb.this.btk <= 0 || fb.this.btk > 3600000) {
                    fb.this.btk = 3600000;
                }
            }
        });
        this.zmn = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.bytedance.sdk.openadsdk.doe.zmn.fb.2
            @Override // android.os.Handler.Callback
            public boolean handleMessage(@NonNull Message message) {
                if (!(message.obj instanceof fs)) {
                    return false;
                }
                fb.this.hhw.remove(message.obj);
                ((fs) message.obj).fb();
                return true;
            }
        });
    }

    @MainThread
    public void zmn(@Nullable final nqi nqiVar) {
        if (fs() && nqiVar != null && am.hhw(nqiVar)) {
            final String wbj = nqiVar.wbj();
            if (TextUtils.isEmpty(wbj)) {
                return;
            }
            nu.zmn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.doe.zmn.fb.3
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (fb.this.hhw.size() >= fb.this.fb) {
                            fb.this.hhw.size();
                            fs fsVar = (fs) fb.this.hhw.remove(0);
                            if (fsVar != null) {
                                fb.this.zmn.removeMessages(fsVar.bvs().hashCode());
                                fsVar.fb();
                            }
                        }
                        nqiVar.cyb(true);
                        Context zmn = kgc.zmn();
                        nqi nqiVar2 = nqiVar;
                        final fs fsVar2 = new fs(zmn, nqiVar2, nqiVar2.ol(), true, new FrameLayout(kgc.zmn()), wbj);
                        fb.this.hhw.add(fsVar2);
                        fsVar2.zg();
                        Message obtain = Message.obtain();
                        obtain.what = wbj.hashCode();
                        obtain.obj = fsVar2;
                        fb.this.zmn.sendMessageDelayed(obtain, fb.this.btk);
                        fsVar2.zmn(new zmn.fs() { // from class: com.bytedance.sdk.openadsdk.doe.zmn.fb.3.1
                            @Override // com.bytedance.sdk.openadsdk.doe.zmn.zmn.fs
                            public void zmn() {
                                fb.this.zmn.removeMessages(wbj.hashCode());
                                fb.this.hhw.remove(fsVar2);
                                fsVar2.fb();
                            }
                        });
                        nqi nqiVar3 = nqiVar;
                        com.bytedance.sdk.openadsdk.fb.zn.zmn(nqiVar3, oub.zn(nqiVar3.utx().getDurationSlotType()), "PL_start_pre_render", 1);
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                }
            });
        }
    }

    @MainThread
    public fs zmn(@NonNull nqi nqiVar, FrameLayout frameLayout, nps npsVar) {
        fs fsVar;
        if (fs() && nqiVar.utx() != null && !TextUtils.isEmpty(nqiVar.utx().getBidAdm()) && am.hhw(nqiVar) && frameLayout != null) {
            String wbj = nqiVar.wbj();
            if (TextUtils.isEmpty(wbj)) {
                return null;
            }
            int i = 0;
            while (true) {
                if (i >= this.hhw.size()) {
                    i = -1;
                    fsVar = null;
                    break;
                }
                fsVar = this.hhw.get(i);
                if (wbj.equals(fsVar.bvs())) {
                    break;
                }
                i++;
            }
            if (fsVar != null) {
                this.zmn.removeMessages(wbj.hashCode());
                this.hhw.remove(i);
                this.hhw.size();
                nqiVar.cyb(true);
                fsVar.zmn(frameLayout, npsVar);
                com.bytedance.sdk.openadsdk.fb.zn.zmn(nqiVar, oub.zn(nqiVar.utx().getDurationSlotType()), "PL_use_pre_render", 1);
                return fsVar;
            }
        }
        return null;
    }

    public boolean fs() {
        return this.zn == 1;
    }
}
