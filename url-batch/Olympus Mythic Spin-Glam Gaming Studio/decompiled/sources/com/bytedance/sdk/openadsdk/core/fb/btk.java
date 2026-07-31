package com.bytedance.sdk.openadsdk.core.fb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.core.fb.hhw;
import com.bytedance.sdk.openadsdk.core.model.doe;
import com.bytedance.sdk.openadsdk.utils.jy;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public class btk {
    private hhw fs;
    private final hhw.fs hhw;
    private final View.OnAttachStateChangeListener nps;
    private final hhw.zmn zg;
    private doe zmn;
    private List<zmn> zn = new ArrayList();
    private final String fb = "BannerSwiperManager";
    private int btk = -1;

    public btk(doe doeVar, Context context, int i, int i2) {
        hhw.fs fsVar = new hhw.fs() { // from class: com.bytedance.sdk.openadsdk.core.fb.btk.1
            @Override // com.bytedance.sdk.openadsdk.core.fb.hhw.fs
            public void zmn(boolean z) {
                try {
                    if (!z) {
                        btk.this.zn();
                    } else {
                        btk.this.fb();
                    }
                } catch (Throwable unused) {
                }
            }
        };
        this.hhw = fsVar;
        View.OnAttachStateChangeListener onAttachStateChangeListener = new View.OnAttachStateChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.fb.btk.2
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                btk.this.btk();
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                if (btk.this.zn != null && !btk.this.zn.isEmpty()) {
                    for (int i3 = 0; i3 < btk.this.zn.size(); i3++) {
                        ((zmn) btk.this.zn.get(i3)).hhw();
                    }
                }
                btk.this.btk = -1;
                if (btk.this.fs != null) {
                    btk.this.fs.fb();
                }
            }
        };
        this.nps = onAttachStateChangeListener;
        hhw.zmn zmnVar = new hhw.zmn() { // from class: com.bytedance.sdk.openadsdk.core.fb.btk.3
            @Override // com.bytedance.sdk.openadsdk.core.fb.hhw.zmn
            public void zmn(boolean z) {
                if (!z) {
                    btk.this.zn();
                } else {
                    btk.this.fb();
                }
            }
        };
        this.zg = zmnVar;
        this.zmn = doeVar;
        hhw hhwVar = new hhw(context);
        this.fs = hhwVar;
        hhwVar.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.fs.setSwiperWindowFocusChangedListener(fsVar);
        this.fs.setSwiperVisibleChangeListener(zmnVar);
        zmn(context, i, i2);
    }

    protected void zmn(Context context, float f, float f2) {
        int fs = jy.fs(context, f);
        int fs2 = jy.fs(context, f2);
        ViewGroup.LayoutParams layoutParams = this.fs.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(fs, fs2);
        }
        layoutParams.width = fs;
        layoutParams.height = fs2;
        this.fs.setLayoutParams(layoutParams);
    }

    public void zmn(List<zmn> list) {
        this.zn = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zn() {
        hhw hhwVar;
        doe doeVar = this.zmn;
        if (doeVar != null && doeVar.fs() == 1 && (hhwVar = this.fs) != null) {
            hhwVar.hhw();
        }
        if (this.btk >= 0) {
            fs(-1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fb() {
        hhw hhwVar;
        doe doeVar = this.zmn;
        if (doeVar != null && doeVar.fs() == 1 && (hhwVar = this.fs) != null) {
            hhwVar.btk();
        }
        int i = this.btk;
        if (i >= 0) {
            zmn(i);
            fs(this.btk);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void btk() {
        if (this.zmn == null) {
            this.zmn = new doe();
        }
        this.fs.zmn(TextUtils.equals(this.zmn.zmn(), "vertical") ? 1 : 0).zmn("dot").zn(false).fb(this.zmn.fb() == 1).zmn(this.zmn.fs() == 1).zn(this.zmn.bvs()).btk(this.zmn.iv() == 1).fb(this.zmn.zg()).fs(this.zmn.zn() == 1).bvs(this.zmn.btk()).iv(this.zmn.hhw()).zg(this.zmn.nps());
        this.fs.setOnPageChangeListener(new com.bytedance.adsdk.ugeno.hhw.zn() { // from class: com.bytedance.sdk.openadsdk.core.fb.btk.4
            @Override // com.bytedance.adsdk.ugeno.hhw.zn
            public void zmn(boolean z, int i, float f, int i2) {
            }

            @Override // com.bytedance.adsdk.ugeno.hhw.zn
            public void zmn(boolean z, int i, int i2, boolean z2, boolean z3) {
                btk.this.zn(i);
                btk.this.btk = i;
                btk.this.zmn(i);
                btk.this.fs(i);
            }

            @Override // com.bytedance.adsdk.ugeno.hhw.zn
            public void zmn(boolean z, int i) {
                if (i == 1 || i == 2) {
                    btk.this.fs(-1);
                } else if (i == 0) {
                    btk btkVar = btk.this;
                    btkVar.zmn(btkVar.btk);
                }
            }
        });
        fs(this.zn);
        this.fs.zn();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zn(int i) {
        zmn zmnVar;
        try {
            int i2 = this.btk;
            if (i2 != -1 && i2 != i && (zmnVar = this.zn.get(i2)) != null) {
                zmnVar.fb();
                zmnVar.zg();
            }
            zmn zmnVar2 = this.zn.get(i);
            if (zmnVar2 != null) {
                zmnVar2.btk();
            }
        } catch (Throwable unused) {
        }
    }

    public void zmn(final int i) {
        zmn zmnVar;
        try {
            final int size = this.zn.size();
            if (i < size && (zmnVar = this.zn.get(i)) != null) {
                zmnVar.zmn(new com.bytedance.sdk.openadsdk.zmn.zmn.fs() { // from class: com.bytedance.sdk.openadsdk.core.fb.btk.5
                    @Override // com.bytedance.sdk.openadsdk.zmn.zmn.fs
                    public void zmn() {
                        int i2 = i + 1;
                        if (i2 >= size) {
                            return;
                        }
                        btk.this.zmn(i2);
                    }
                });
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void fs(int i) {
        zmn zmnVar;
        for (int i2 = 0; i2 < this.zn.size(); i2++) {
            try {
                if (i2 != i && (zmnVar = this.zn.get(i2)) != null) {
                    zmnVar.bvs();
                }
            } catch (Throwable th) {
                th.getMessage();
                return;
            }
        }
    }

    private void fs(List<zmn> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            this.fs.zmn((hhw) list.get(i).zmn());
        }
    }

    public void zmn() {
        if (this.fs != null) {
            try {
                List<zmn> list = this.zn;
                if (list != null && !list.isEmpty()) {
                    for (int i = 0; i < this.zn.size(); i++) {
                        this.zn.get(i).nps();
                    }
                }
                this.btk = -1;
                this.fs.fb();
                this.fs.setSwiperWindowFocusChangedListener(null);
                this.fs.setSwiperVisibleChangeListener(null);
                this.fs.removeOnAttachStateChangeListener(this.nps);
                this.fs = null;
            } catch (Throwable unused) {
            }
        }
    }

    public View fs() {
        return this.fs;
    }
}
