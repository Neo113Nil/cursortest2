package com.bytedance.sdk.openadsdk.activity.single;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.sdk.component.utils.doe;
import com.bytedance.sdk.component.utils.iqz;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.activity.single.fs;
import com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2;
import com.bytedance.sdk.openadsdk.component.reward.zmn.klz;
import com.bytedance.sdk.openadsdk.core.cn;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.core.model.am;
import com.bytedance.sdk.openadsdk.core.model.bjh;
import com.bytedance.sdk.openadsdk.core.model.ev;
import com.bytedance.sdk.openadsdk.core.model.kjb;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.bytedance.sdk.openadsdk.utils.nu;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class fb extends com.bytedance.sdk.openadsdk.activity.single.zn implements Handler.Callback {
    private boolean am;
    private int bjh;
    private final TopLayoutDislike2 bvs;
    private boolean bxw;
    private boolean cd;
    private final boolean cn;
    private JSONObject cud;
    private final boolean cyb;
    private boolean dgt;
    private int doe;
    private fs.btk ev;
    private int fkt;
    private JSONObject gn;
    private com.bytedance.sdk.openadsdk.activity.single.btk hgd;
    private final RecyclerView hhw;

    /* renamed from: io, reason: collision with root package name */
    private boolean f3738io;
    private final boolean iqz;
    private final Handler iv;
    private JSONObject jy;
    private final PAGLogoView kgc;
    private int kjb;
    private final boolean klz;
    private long kra;
    private final ArrayList<Message> kw;
    private long lt;
    private boolean mhu;
    private final AtomicBoolean mw;
    private boolean na;
    private final zmn nps;
    private int nqi;
    private boolean nu;
    private final HashSet<Integer> olo;
    private int oub;
    private boolean phc;
    private final FrameLayout rc;
    private boolean rp;
    private final HashSet<String> rt;
    private zg so;
    private Message tet;
    private int tf;
    private long uqd;
    private boolean uqh;
    private View ve;
    private boolean vlj;
    private bjh.zmn ww;
    private boolean xrr;
    private int yj;
    private hhw yo;
    private FrameLayout yof;
    private boolean zak;
    private final LinearLayoutManager zg;

    @Override // com.bytedance.sdk.openadsdk.activity.single.zn
    public void kgc() {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zn
    public com.bytedance.sdk.openadsdk.component.reward.top.zn klz() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zn
    public void kw() {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zn
    public void zmn(int i) {
    }

    public fb(final Activity activity, final nqi nqiVar, final com.bytedance.sdk.openadsdk.activity.single.fs fsVar) {
        super(activity, nqiVar, fsVar);
        bjh rc;
        this.iv = new Handler(Looper.getMainLooper(), this);
        this.mw = new AtomicBoolean(false);
        this.rt = new HashSet<>();
        this.olo = new HashSet<>();
        this.kw = new ArrayList<>();
        this.doe = 5;
        this.nqi = 3;
        this.yj = -1;
        int i = 1;
        this.ev = new fs.btk(1, null);
        boolean z = nqiVar.cd() == 44;
        this.cn = z;
        boolean bv = nqiVar.bv();
        this.klz = bv;
        this.cyb = klz.zmn(activity, nqiVar) == 1;
        com.bytedance.sdk.openadsdk.core.hhw.zn znVar = new com.bytedance.sdk.openadsdk.core.hhw.zn(activity) { // from class: com.bytedance.sdk.openadsdk.activity.single.fb.1
            @Override // com.bytedance.sdk.openadsdk.core.hhw.zn, android.view.ViewGroup, android.view.View
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/single/fb$1;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z");
                DetectTouchUtils.viewOnTouch(h.u, this, motionEvent);
                return safedk_fb$1_dispatchTouchEvent_9d8cdbd03398f80f2f8e6cae6e39981b(motionEvent);
            }

            @Override // com.bytedance.sdk.openadsdk.core.hhw.zn, android.widget.FrameLayout, android.view.View
            protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
                if (1 == 0) {
                    setMeasuredDimension(0, 0);
                } else {
                    super.onMeasure(widthMeasureSpec, heightMeasureSpec);
                    CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
                }
            }

            public boolean safedk_fb$1_dispatchTouchEvent_9d8cdbd03398f80f2f8e6cae6e39981b(MotionEvent p0) {
                fb.this.cud = null;
                try {
                    return super.dispatchTouchEvent(p0);
                } catch (Exception unused) {
                    return false;
                }
            }
        };
        this.rc = znVar;
        if (Build.VERSION.SDK_INT >= 35) {
            znVar.setFitsSystemWindows(true);
        }
        activity.setContentView(znVar);
        this.btk = String.valueOf(activity.hashCode());
        com.bytedance.sdk.openadsdk.core.model.zmn fb = nqiVar.fb();
        if (fb != null && (rc = fb.rc()) != null) {
            this.nu = rc.cn();
            this.ww = rc.hhw();
            int max = Math.max(0, rc.bvs());
            this.tf = max;
            this.fkt = max;
            this.zak = rc.rt();
            this.rp = rc.rc();
            this.bjh = rc.zg();
            this.jy = rc.klz();
            this.uqh = rc.iv();
            this.phc = rc.zmn();
            this.vlj = this.bjh > 0;
            this.doe = rc.fb();
            this.nqi = rc.btk();
            this.cud = rc.fs();
            this.gn = rc.zn();
            if (!this.rp) {
                this.nu = false;
            }
        }
        if (bv) {
            this.kjb = (int) ((1.0f - (Math.max(0, Math.min(100, nqiVar.oep() < 0 ? kgc.fb().kjb(String.valueOf(nqiVar.qvo())).hhw : r3)) / 100.0f)) * this.tf);
        }
        RecyclerView recyclerView = new RecyclerView(activity);
        this.hhw = recyclerView;
        bjh.zmn zmnVar = this.ww;
        if (zmnVar != null) {
            int zn2 = zmnVar.zn();
            int fb2 = this.ww.fb();
            if (zn2 > 0 || fb2 > 0) {
                recyclerView.setPadding(jy.fs(activity, zn2), 0, jy.fs(activity, fb2), 0);
            }
            int fs2 = this.ww.fs();
            int zmn2 = this.ww.zmn();
            int btk2 = this.ww.btk();
            if (fs2 > 0 || btk2 > 0 || zmn2 > 0) {
                final int fs3 = jy.fs(activity, fs2);
                final int fs4 = jy.fs(activity, zmn2);
                final int fs5 = jy.fs(activity, btk2);
                recyclerView.addItemDecoration(new RecyclerView.ItemDecoration() { // from class: com.bytedance.sdk.openadsdk.activity.single.fb.11
                    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
                    public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView2, @NonNull RecyclerView.State state) {
                        int childAdapterPosition = recyclerView2.getChildAdapterPosition(view);
                        int itemCount = recyclerView2.getAdapter().getItemCount();
                        if (childAdapterPosition == 0) {
                            rect.top = fs3;
                        } else {
                            rect.top = fs5 / 2;
                        }
                        if (childAdapterPosition == itemCount - 1) {
                            rect.bottom = fs4;
                        } else {
                            rect.bottom = fs5 / 2;
                        }
                    }
                });
            }
        }
        znVar.addView(recyclerView, new FrameLayout.LayoutParams(-1, -1));
        TopLayoutDislike2 topLayoutDislike2 = new TopLayoutDislike2(activity);
        this.bvs = topLayoutDislike2;
        znVar.addView(topLayoutDislike2, new FrameLayout.LayoutParams(-1, -2));
        topLayoutDislike2.load(nqiVar);
        topLayoutDislike2.setShowDislike(true);
        topLayoutDislike2.setShowSound(true);
        boolean kgc = kgc.fb().kgc(String.valueOf(nqiVar.qvo()));
        this.am = kgc;
        topLayoutDislike2.setSoundMute(kgc);
        topLayoutDislike2.setListener(new com.bytedance.sdk.openadsdk.component.reward.top.fs() { // from class: com.bytedance.sdk.openadsdk.activity.single.fb.12
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.fs
            public void fb(View view) {
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.fs
            public void zmn(View view) {
                com.bytedance.sdk.openadsdk.core.rt.fb zmn3;
                nqi nqiVar2 = nqiVar;
                com.bytedance.sdk.openadsdk.fb.zn.zmn("skip", nqiVar2, nqiVar2.btk(), (Map<String, Object>) null);
                com.bytedance.sdk.openadsdk.core.model.fb exj = nqiVar.exj();
                if (exj != null && (zmn3 = exj.zmn()) != null) {
                    zmn3.hhw(0L);
                    zmn3.btk(0L);
                }
                fb.this.bjh();
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.fs
            public void zmn(View view, String str) {
                if (fb.this.so != null) {
                    fb.this.so.zmn(str);
                    fb.this.am = !r1.am;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.fs
            public void fs(View view) {
                if (fb.this.so != null) {
                    fb.this.so.e_();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.fs
            public void zn(View view) {
                fsVar.nps();
            }
        });
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(activity, i, r1) { // from class: com.bytedance.sdk.openadsdk.activity.single.fb.13
            @Override // androidx.recyclerview.widget.LinearLayoutManager
            protected void calculateExtraLayoutSpace(@NonNull RecyclerView.State state, @NonNull int[] iArr) {
                super.calculateExtraLayoutSpace(state, iArr);
                int height = fb.this.hhw.getHeight();
                iArr[0] = height;
                iArr[1] = height;
            }
        };
        this.zg = linearLayoutManager;
        recyclerView.setLayoutManager(linearLayoutManager);
        zmn zmnVar2 = new zmn(this, nqiVar.tl());
        this.nps = zmnVar2;
        recyclerView.setAdapter(zmnVar2);
        if (!this.vlj && !this.uqh) {
            zmnVar2.zmn(doe.zmn(activity, "tt_list_end_tip"));
        }
        if (z) {
            new PagerSnapHelper().attachToRecyclerView(recyclerView);
        } else if (this.rp) {
            new com.bytedance.sdk.openadsdk.component.reward.view.zmn().attachToRecyclerView(recyclerView);
        }
        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.fb.14
            private int btk;
            private final Rect zn = new Rect();
            private int fb = -1;

            private void zmn() {
                int fb3;
                View findViewByPosition;
                if (fb.this.phc && (fb3 = fb.this.nps.fb()) != 0) {
                    int findFirstVisibleItemPosition = fb.this.zg.findFirstVisibleItemPosition();
                    int findLastVisibleItemPosition = fb.this.zg.findLastVisibleItemPosition();
                    if (findLastVisibleItemPosition % fb3 > this.fb) {
                        for (int i2 = findFirstVisibleItemPosition; i2 <= findLastVisibleItemPosition; i2++) {
                            int i3 = i2 % fb3;
                            if (i3 > this.fb) {
                                if ((i2 == findFirstVisibleItemPosition || i2 == findLastVisibleItemPosition) && (findViewByPosition = fb.this.zg.findViewByPosition(i2)) != null) {
                                    this.zn.setEmpty();
                                    findViewByPosition.getGlobalVisibleRect(this.zn);
                                    int height = findViewByPosition.getHeight();
                                    if (height > 0) {
                                        if ((this.zn.height() * 1.0f) / height < 0.5f) {
                                        }
                                    }
                                }
                                RecyclerView.ViewHolder findViewHolderForAdapterPosition = fb.this.hhw.findViewHolderForAdapterPosition(i2);
                                if (findViewHolderForAdapterPosition instanceof fs) {
                                    fs fsVar2 = (fs) findViewHolderForAdapterPosition;
                                    if (fsVar2.zn != null) {
                                        fsVar2.zn.lt();
                                    }
                                }
                                if (i3 > this.fb) {
                                    this.fb = i3;
                                }
                            }
                        }
                    }
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(@NonNull RecyclerView recyclerView2, int i2, int i3) {
                super.onScrolled(recyclerView2, i2, i3);
                if (i3 == 0 || com.bytedance.sdk.component.utils.fs.zmn(activity)) {
                    return;
                }
                zmn();
                int findLastVisibleItemPosition = fb.this.zg.findLastVisibleItemPosition();
                if (i3 > 0 && fb.this.vlj && fb.this.bjh > 0 && findLastVisibleItemPosition >= fb.this.nps.zmn() - fb.this.bjh) {
                    fb.this.doe();
                }
                if (this.btk != findLastVisibleItemPosition) {
                    this.btk = findLastVisibleItemPosition;
                    if (fb.this.olo.isEmpty() || !fb.this.olo.contains(Integer.valueOf(findLastVisibleItemPosition))) {
                        if (fb.this.mhu) {
                            fb.this.mhu = false;
                            RecyclerView.ViewHolder findViewHolderForAdapterPosition = recyclerView2.findViewHolderForAdapterPosition(findLastVisibleItemPosition);
                            if (findViewHolderForAdapterPosition instanceof fs) {
                                fs fsVar2 = (fs) findViewHolderForAdapterPosition;
                                if (fsVar2.zn != null) {
                                    fsVar2.zn.btk(true);
                                    fsVar2.zn.rp();
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    fb.this.olo.remove(Integer.valueOf(findLastVisibleItemPosition));
                    RecyclerView.ViewHolder findViewHolderForAdapterPosition2 = recyclerView2.findViewHolderForAdapterPosition(findLastVisibleItemPosition);
                    if (findViewHolderForAdapterPosition2 instanceof fs) {
                        fs fsVar3 = (fs) findViewHolderForAdapterPosition2;
                        fsVar3.zn.btk(true);
                        fsVar3.zn.kjb();
                    }
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(@NonNull RecyclerView recyclerView2, int i2) {
                super.onScrollStateChanged(recyclerView2, i2);
                if (com.bytedance.sdk.component.utils.fs.zmn(activity)) {
                    return;
                }
                int findFirstCompletelyVisibleItemPosition = fb.this.zg.findFirstCompletelyVisibleItemPosition();
                fb.this.zg.findFirstVisibleItemPosition();
                int findLastVisibleItemPosition = fb.this.zg.findLastVisibleItemPosition();
                if (findFirstCompletelyVisibleItemPosition < 0) {
                    return;
                }
                if (i2 == 0 && findFirstCompletelyVisibleItemPosition != fb.this.yj) {
                    boolean z2 = findFirstCompletelyVisibleItemPosition == fb.this.oub;
                    fb fbVar = fb.this;
                    fbVar.zmn(findFirstCompletelyVisibleItemPosition, fbVar.nu && z2);
                    if (fb.this.nu && !z2 && fb.this.zak) {
                        fb.this.nu = false;
                    }
                    if (fb.this.yo != null) {
                        fb.this.yo.fb();
                        fb.this.yo = null;
                    }
                }
                if (i2 == 0) {
                    fb.this.oub = -1;
                }
                if (!fb.this.vlj || fb.this.bjh <= 0 || findLastVisibleItemPosition < fb.this.nps.zmn() - fb.this.bjh) {
                    return;
                }
                fb.this.doe();
            }
        });
        so();
        final int phc = phc();
        recyclerView.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.fb.15
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.component.utils.fs.zmn(activity)) {
                    return;
                }
                fb.this.zmn(phc, true);
            }
        });
        PAGLogoView createPAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(activity, nqiVar);
        this.kgc = createPAGLogoViewByMaterial;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 83;
        layoutParams.leftMargin = jy.fs(activity, 16.0f);
        znVar.addView(createPAGLogoViewByMaterial, layoutParams);
        createPAGLogoViewByMaterial.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.fb.16
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/single/fb$16;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(h.u, view);
                safedk_fb$16_onClick_f7701fb483be380bcfe7ad5f00676dac(view);
            }

            public void safedk_fb$16_onClick_f7701fb483be380bcfe7ad5f00676dac(View p0) {
                if (com.bytedance.sdk.openadsdk.utils.fs.btk() && kgc.fb().am()) {
                    Context context = p0.getContext();
                    nqi nqiVar2 = nqiVar;
                    IABLandingPageActivity.zmn(context, nqiVar2, nqiVar2.btk());
                } else {
                    Context context2 = p0.getContext();
                    nqi nqiVar3 = nqiVar;
                    TTWebsiteActivity.zmn(context2, nqiVar3, nqiVar3.btk());
                }
            }
        });
        this.iqz = com.bytedance.sdk.openadsdk.uqh.btk.zmn("draw_feed_item_reuse", 0) == 1;
    }

    private static int zmn(int i, int i2, int i3) {
        if (i < 0) {
            i = 0;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = i3 + i4;
            if (i5 % i2 != i) {
                i5 = i3 - i4;
                if (i5 % i2 != i) {
                }
            }
            return i5;
        }
        return i3;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zn
    public void zmn(Bundle bundle) {
        super.zmn(bundle);
        am();
        com.bytedance.sdk.openadsdk.nqi.zmn.zmn.zmn(this.zmn, this.rc, com.bytedance.sdk.openadsdk.nqi.zmn.zmn.zmn(this.fs.wbj()));
    }

    private int phc() {
        if (!this.uqh || this.nps.zn() || this.mw.get() || this.vlj) {
            return 0;
        }
        int zmn2 = zmn(this.yj, this.nps.fb(), 1073741823);
        this.nps.zmn(this.yj, zmn2);
        if (this.yj < 0) {
            this.hhw.scrollToPosition(zmn2);
        } else {
            this.yj = zmn2;
        }
        return zmn2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doe() {
        if (this.mw.compareAndSet(false, true)) {
            AdSlot utx = this.fs.utx();
            kjb kjbVar = new kjb();
            kjbVar.hhw = true;
            if (this.fs.ouf() != null || this.fs.rsi() != null) {
                kjbVar.bvs = 2;
            }
            kjbVar.nps = this.jy;
            this.nps.zmn(doe.zmn(this.zmn, "tt_loading_more"));
            kgc.zn().zmn(utx, kjbVar, this.fs.sft(), new com.bytedance.sdk.openadsdk.core.doe() { // from class: com.bytedance.sdk.openadsdk.activity.single.fb.17
                @Override // com.bytedance.sdk.openadsdk.core.doe, com.bytedance.sdk.openadsdk.core.nqi.zmn
                public void zmn(int i, String str) {
                    fb.this.zmn(i, str);
                }

                @Override // com.bytedance.sdk.openadsdk.core.doe, com.bytedance.sdk.openadsdk.core.nqi.zmn
                public void zmn(com.bytedance.sdk.openadsdk.core.model.zmn zmnVar, com.bytedance.sdk.openadsdk.core.model.zn znVar) {
                    fb.this.zmn(zmnVar, znVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(int i, String str) {
        this.vlj = false;
        uqh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(com.bytedance.sdk.openadsdk.core.model.zmn zmnVar, com.bytedance.sdk.openadsdk.core.model.zn znVar) {
        this.vlj = false;
        if (zmnVar.btk() != null && !zmnVar.btk().isEmpty()) {
            zmn(zmnVar);
            return;
        }
        znVar.zmn(-3);
        znVar.zn(1);
        com.bytedance.sdk.openadsdk.core.model.zn.zmn(znVar);
        uqh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void nqi() {
        if (this.vlj) {
            return;
        }
        if (this.uqh) {
            phc();
        } else {
            nu.zmn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.fb.18
                @Override // java.lang.Runnable
                public void run() {
                    if (com.bytedance.sdk.component.utils.fs.zmn(fb.this.zmn)) {
                        return;
                    }
                    fb.this.nps.zmn(doe.zmn(kgc.zmn(), "tt_list_end_tip"));
                }
            });
        }
    }

    private void zmn(final com.bytedance.sdk.openadsdk.core.model.zmn zmnVar) {
        bjh rc = zmnVar.rc();
        if (rc != null) {
            this.jy = rc.klz();
            this.vlj = rc.mw();
        }
        if (!this.cn) {
            for (nqi nqiVar : zmnVar.btk()) {
                if (nqiVar.mrt() != null && nqi.btk(nqiVar)) {
                    com.bytedance.sdk.openadsdk.core.cn.zmn.fs zmn2 = nqi.zmn(CacheDirFactory.getICacheDir(nqiVar.hqs()).zmn(), nqiVar);
                    zmn2.zmn("material_meta", nqiVar);
                    zmn2.zmn("ad_slot", nqiVar.utx());
                    com.bytedance.sdk.openadsdk.core.cn.btk.zmn.zmn(zmn2, new com.bykv.vk.openvk.zmn.zmn.zmn.btk.fs() { // from class: com.bytedance.sdk.openadsdk.activity.single.fb.2
                        @Override // com.bykv.vk.openvk.zmn.zmn.zmn.btk.zmn.InterfaceC0101zmn
                        public void zmn(com.bykv.vk.openvk.zmn.zmn.zmn.zn.zn znVar, int i) {
                        }

                        @Override // com.bykv.vk.openvk.zmn.zmn.zmn.btk.zmn.InterfaceC0101zmn
                        public void zmn(com.bykv.vk.openvk.zmn.zmn.zmn.zn.zn znVar, int i, String str) {
                        }
                    });
                }
            }
        }
        nu.zmn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.fb.3
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.component.utils.fs.zmn(fb.this.zmn)) {
                    return;
                }
                fb.this.mw.set(false);
                fb.this.nps.zmn("");
                fb.this.nps.zmn(zmnVar.btk());
                fb.this.nqi();
            }
        });
    }

    private void uqh() {
        nu.zmn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.fb.4
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.component.utils.fs.zmn(fb.this.zmn)) {
                    return;
                }
                fb.this.mw.set(false);
                if (fb.this.uqh) {
                    fb.this.nps.zmn("");
                    fb.this.nqi();
                } else {
                    fb.this.nps.zmn(doe.zmn(kgc.zmn(), "tt_list_end_tip"));
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zn
    /* renamed from: iqz, reason: merged with bridge method [inline-methods] */
    public com.bytedance.sdk.openadsdk.activity.single.zmn mw() {
        RecyclerView.ViewHolder findViewHolderForAdapterPosition = this.hhw.findViewHolderForAdapterPosition(this.yj + 1);
        if (!(findViewHolderForAdapterPosition instanceof fs)) {
            return null;
        }
        zg zmn2 = ((fs) findViewHolderForAdapterPosition).zmn();
        if (zmn2 instanceof com.bytedance.sdk.openadsdk.activity.single.zmn) {
            return (com.bytedance.sdk.openadsdk.activity.single.zmn) zmn2;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bjh() {
        com.bytedance.sdk.openadsdk.activity.single.btk btkVar = this.hgd;
        if (btkVar != null && btkVar.nqi()) {
            fs(this.hgd);
            this.rc.removeView(this.hhw);
            this.bvs.setVisibility(8);
            this.kgc.setVisibility(8);
            return;
        }
        this.fb.nps();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(int i, boolean z) {
        int i2;
        RecyclerView.ViewHolder findViewHolderForAdapterPosition = this.hhw.findViewHolderForAdapterPosition(i);
        if (findViewHolderForAdapterPosition == null || !(findViewHolderForAdapterPosition instanceof fs) || (i2 = this.yj) == i) {
            return;
        }
        zmn(i2, i, z);
        this.yj = i;
        this.uqd = SystemClock.elapsedRealtime();
        zg zmn2 = ((fs) findViewHolderForAdapterPosition).zmn();
        if (zmn2 == null) {
            return;
        }
        fs(zmn2);
        this.rt.add(zmn2.hhw.gn());
        if (this.vlj && this.bjh > 0 && this.yj >= this.nps.zmn() - this.bjh) {
            doe();
        }
        com.bytedance.sdk.openadsdk.activity.single.zmn mw = mw();
        if (mw != null) {
            if (!this.cn && this.zg.findLastVisibleItemPosition() >= this.yj + 1) {
                mw.btk(true);
            }
            this.olo.add(Integer.valueOf(this.yj + 1));
            mw.rp();
            this.mhu = false;
            return;
        }
        this.mhu = true;
    }

    private void zmn(int i, int i2, boolean z) {
        String str;
        if (i < 0 || i2 < 0 || i == i2) {
            return;
        }
        if (z) {
            str = "auto_down";
        } else {
            str = i2 > i ? "down" : "up";
        }
        final String str2 = str;
        final long elapsedRealtime = (SystemClock.elapsedRealtime() - this.uqd) / 1000;
        List<nqi> btk2 = this.nps.btk();
        final int size = i % btk2.size();
        final int size2 = i2 % btk2.size();
        nqi nqiVar = btk2.get(size);
        com.bytedance.sdk.openadsdk.fb.zn.zmn(System.currentTimeMillis(), nqiVar, nqiVar.btk(), "slide", new com.bytedance.sdk.openadsdk.cyb.fs.zmn() { // from class: com.bytedance.sdk.openadsdk.activity.single.fb.5
            @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
            public JSONObject zmn() {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("from", size + 1);
                    jSONObject.put("to", size2 + 1);
                    jSONObject.put("direction", str2);
                    jSONObject.put("click_user_remaining", elapsedRealtime);
                    return jSONObject;
                } catch (Exception unused) {
                    return null;
                }
            }
        });
    }

    private void fs(zg zgVar) {
        Iterator<zg> it = this.nps.fs().iterator();
        while (it.hasNext()) {
            zg next = it.next();
            if (next != zgVar) {
                next.zmn(this.so, zgVar, this.ev);
            }
        }
        com.bytedance.sdk.openadsdk.activity.single.btk btkVar = this.hgd;
        if (btkVar != null && btkVar != zgVar) {
            btkVar.zmn(this.so, zgVar, this.ev);
        }
        zg zgVar2 = this.so;
        this.so = zgVar;
        if (zgVar2 != null) {
            zgVar2.klz = false;
            zgVar2.rt();
            zgVar2.fb();
        }
        zgVar.klz = true;
        zgVar.fs(this.zmn, new fs.btk(1, null));
        com.bytedance.sdk.openadsdk.component.reward.view.zg zmn2 = zgVar.zmn();
        if (zmn2.getVisibility() != 0) {
            zmn2.setVisibility(0);
        }
        if (zmn2.getParent() == null) {
            this.rc.addView(zmn2, new FrameLayout.LayoutParams(-1, -1));
        }
        this.fb.fs(zgVar);
        if (zgVar.f_() != this.am) {
            zgVar.zmn("card_sync");
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zn
    public void fs(Activity activity) {
        super.fs(activity);
        jy.zmn(activity);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zn
    public void zmn(final zg zgVar, zg zgVar2, fs.btk btkVar) {
        long j;
        if (zgVar != this.so) {
            return;
        }
        if (zgVar.bjh() || am.fs(zgVar.hhw)) {
            j = 500;
        } else {
            j = zgVar.hhw.xcf() != null ? r6.fb() * 1000 : 0L;
        }
        hhw hhwVar = this.yo;
        if (hhwVar != null) {
            hhwVar.fb();
        }
        hhw hhwVar2 = new hhw(Math.max(500L, j)) { // from class: com.bytedance.sdk.openadsdk.activity.single.fb.6
            @Override // com.bytedance.sdk.openadsdk.activity.single.fb.hhw
            public void zmn() {
                if (com.bytedance.sdk.component.utils.fs.zmn(fb.this.zmn)) {
                    return;
                }
                fb.this.zn(zgVar);
            }
        };
        this.yo = hhwVar2;
        hhwVar2.btk();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zn(zg zgVar) {
        zg zgVar2 = this.so;
        if (zgVar != zgVar2) {
            return;
        }
        if (this.nu) {
            if (this.yj < this.nps.zmn() - 1) {
                int i = this.yj + 1;
                this.oub = i;
                if (this.cn) {
                    this.hhw.smoothScrollToPosition(i);
                } else {
                    fs(i);
                }
            } else {
                this.oub = 0;
                this.hhw.scrollToPosition(0);
                this.hhw.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.fb.7
                    @Override // java.lang.Runnable
                    public void run() {
                        if (com.bytedance.sdk.component.utils.fs.zmn(fb.this.zmn)) {
                            return;
                        }
                        fb fbVar = fb.this;
                        fbVar.zmn(fbVar.oub, true);
                    }
                });
            }
        } else if (this.xrr) {
            zgVar2.zn();
        } else {
            zgVar2.hgd();
        }
        this.yo = null;
        this.xrr = false;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(@NonNull Message message) {
        if (this.bxw) {
            this.kw.add(this.iv.obtainMessage(message.what, message.arg1, message.arg2, message.obj));
            return false;
        }
        int i = message.what;
        if (i == 1) {
            int i2 = this.tf;
            if (i2 > 0) {
                if (i2 <= this.kjb) {
                    kjb();
                }
                int i3 = (int) (((r0 - this.tf) * 100.0d) / this.fkt);
                TopLayoutDislike2 topLayoutDislike2 = this.bvs;
                StringBuilder sb = new StringBuilder();
                int i4 = this.tf;
                this.tf = i4 - 1;
                sb.append(i4);
                sb.append("s");
                topLayoutDislike2.setCountDownFor1InN(sb.toString(), i3);
                if (this.tf >= 0) {
                    this.iv.removeMessages(message.what);
                    this.iv.sendEmptyMessageDelayed(message.what, 1000L);
                }
            } else {
                kjb();
                if (fb()) {
                    this.bvs.showSkipButton();
                } else {
                    this.bvs.showCloseButton();
                }
            }
        } else if (i == 3) {
            yj();
        } else if (i == 4) {
            rp();
        }
        return false;
    }

    private void fs(int i) {
        RecyclerView.ViewHolder findViewHolderForAdapterPosition;
        int findFirstVisibleItemPosition = this.zg.findFirstVisibleItemPosition();
        int findLastVisibleItemPosition = this.zg.findLastVisibleItemPosition();
        if (i < findFirstVisibleItemPosition) {
            this.hhw.smoothScrollToPosition(i);
            return;
        }
        if (i <= findLastVisibleItemPosition) {
            int i2 = i - findFirstVisibleItemPosition;
            int childCount = this.hhw.getChildCount();
            if (i2 <= 0 || i2 >= childCount || (findViewHolderForAdapterPosition = this.hhw.findViewHolderForAdapterPosition(i - 1)) == null) {
                return;
            }
            this.hhw.smoothScrollBy(0, findViewHolderForAdapterPosition.itemView.getBottom());
            return;
        }
        this.hhw.smoothScrollToPosition(this.oub);
    }

    private void rp() {
        FrameLayout frameLayout = this.yof;
        if (frameLayout == null) {
            return;
        }
        ViewParent parent = frameLayout.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.yof);
        }
        this.yof = null;
        zg zgVar = this.so;
        if (zgVar instanceof com.bytedance.sdk.openadsdk.activity.single.zmn) {
            ((com.bytedance.sdk.openadsdk.activity.single.zmn) zgVar).am();
        }
        tf();
        Message message = this.tet;
        if (message != null) {
            handleMessage(message);
            this.tet = null;
        }
    }

    private void kjb() {
        zg zgVar;
        if (!this.klz || this.fb.olo() || (zgVar = this.so) == null) {
            return;
        }
        zgVar.kra();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zn
    public void zn() {
        super.zn();
        this.bxw = true;
        zg zgVar = this.so;
        if (zgVar != null) {
            zgVar.rt();
        }
        fkt();
        this.xrr = this.yo != null;
        this.iv.removeMessages(3);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zn
    public void zmn(boolean z) {
        super.zmn(z);
        zg zgVar = this.so;
        if (zgVar != null) {
            zgVar.zn(z);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zn
    public void fs() {
        super.fs();
        this.bxw = false;
        this.f3738io = false;
        zg zgVar = this.so;
        if (zgVar != null && !this.xrr) {
            zgVar.zn();
        }
        if (this.kra == 0) {
            this.kra = SystemClock.elapsedRealtime();
        }
        tf();
        zak();
        Iterator<Message> it = this.kw.iterator();
        while (it.hasNext()) {
            handleMessage(it.next());
        }
        this.kw.clear();
    }

    private void zak() {
        if (this.dgt || this.cud == null) {
            return;
        }
        this.iv.removeMessages(3);
        this.iv.sendEmptyMessageDelayed(3, this.doe * 1000);
    }

    private void am() {
        if (this.cud == null) {
            return;
        }
        new com.bytedance.sdk.openadsdk.core.mw.bvs.zmn(this.zmn).zmn(this.cud, com.bytedance.sdk.openadsdk.core.iv.fs.zn.fs(), this.gn, new com.bytedance.sdk.openadsdk.core.mw.nps.fb() { // from class: com.bytedance.sdk.openadsdk.activity.single.fb.8
            @Override // com.bytedance.sdk.openadsdk.core.mw.nps.fb
            public void zmn(int i, String str) {
                fb.this.cd = true;
            }

            @Override // com.bytedance.sdk.openadsdk.core.mw.nps.fb
            public void zmn(com.bytedance.adsdk.ugeno.fs.zn<View> znVar) {
                View rc = znVar.rc();
                ViewGroup viewGroup = (ViewGroup) rc.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(rc);
                }
                fb.this.ve = rc;
                if (fb.this.yof != null) {
                    fb.this.yof.addView(rc, new FrameLayout.LayoutParams(-1, -1));
                }
            }
        });
    }

    private void yj() {
        if (this.yof != null || this.cud == null || this.cd) {
            return;
        }
        this.dgt = true;
        this.yof = new com.bytedance.sdk.openadsdk.core.hhw.zn(this.zmn) { // from class: com.bytedance.sdk.openadsdk.activity.single.fb.9
            @Override // com.bytedance.sdk.openadsdk.core.hhw.zn, android.view.ViewGroup, android.view.View
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/single/fb$9;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z");
                DetectTouchUtils.viewOnTouch(h.u, this, motionEvent);
                return safedk_fb$9_dispatchTouchEvent_9f02a6196c744fb570318dcb647a59cb(motionEvent);
            }

            @Override // com.bytedance.sdk.openadsdk.core.hhw.zn, android.widget.FrameLayout, android.view.View
            protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
                if (1 == 0) {
                    setMeasuredDimension(0, 0);
                } else {
                    super.onMeasure(widthMeasureSpec, heightMeasureSpec);
                    CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
                }
            }

            public boolean safedk_fb$9_dispatchTouchEvent_9f02a6196c744fb570318dcb647a59cb(MotionEvent p0) {
                fb.this.iv.removeMessages(4);
                fb.this.iv.sendEmptyMessage(4);
                try {
                    return super.dispatchTouchEvent(p0);
                } catch (Exception unused) {
                    return false;
                }
            }
        };
        View view = this.ve;
        if (view != null && view.getParent() == null) {
            this.yof.addView(this.ve, new FrameLayout.LayoutParams(-1, -1));
        }
        this.rc.addView(this.yof, new FrameLayout.LayoutParams(-1, -1));
        this.iv.sendEmptyMessageDelayed(4, this.nqi * 1000);
        zg zgVar = this.so;
        if (zgVar instanceof com.bytedance.sdk.openadsdk.activity.single.zmn) {
            ((com.bytedance.sdk.openadsdk.activity.single.zmn) zgVar).zak();
        }
        fkt();
    }

    private void so() {
        bjh rc;
        com.bytedance.sdk.openadsdk.core.model.zmn fb = this.fs.fb();
        if (fb == null || (rc = fb.rc()) == null || TextUtils.isEmpty(rc.nps())) {
            return;
        }
        this.hgd = new com.bytedance.sdk.openadsdk.activity.single.btk(this.fb, this.fs, -1, 1, false, false, true);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zn
    public boolean zmn(zg zgVar, int i) {
        com.bytedance.sdk.openadsdk.activity.single.btk btkVar = this.hgd;
        return btkVar != null && btkVar == zgVar;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zn
    public void zmn(View view) {
        super.zmn(view);
        if (view.getParent() != null) {
            return;
        }
        view.setVisibility(4);
        this.rc.addView(view, 0);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zn
    public boolean btk() {
        return this.am;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zn
    public zg rc() {
        return this.so;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zn
    public boolean fb() {
        return this.hgd != null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zn
    public void zmn(Activity activity) {
        super.zmn(activity);
        zg zgVar = this.so;
        if (zgVar != null) {
            zgVar.fs(activity);
        }
        com.bytedance.sdk.openadsdk.activity.single.btk btkVar = this.hgd;
        if (btkVar != null) {
            btkVar.kw();
        }
        Iterator<zg> it = this.nps.fs().iterator();
        while (it.hasNext()) {
            it.next().kw();
        }
        this.iv.removeCallbacksAndMessages(null);
        hhw hhwVar = this.yo;
        if (hhwVar != null) {
            hhwVar.fb();
            this.yo = null;
        }
        zg zgVar2 = this.so;
        if (zgVar2 == null || zgVar2.doe() || this.fs.dbc()) {
            return;
        }
        cn.fs().post(new fs.zn(this.fs));
    }

    private boolean ev() {
        FrameLayout frameLayout = this.yof;
        return (frameLayout == null || frameLayout.getParent() == null) ? false : true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zn
    public void fs(zg zgVar, int i) {
        zg zgVar2 = this.so;
        if (zgVar != zgVar2) {
            return;
        }
        if (i == 2) {
            fkt();
            return;
        }
        if (i == 1) {
            if (ev()) {
                zg zgVar3 = this.so;
                if (zgVar3 instanceof com.bytedance.sdk.openadsdk.activity.single.zmn) {
                    ((com.bytedance.sdk.openadsdk.activity.single.zmn) zgVar3).zak();
                    return;
                }
                return;
            }
            tf();
            return;
        }
        if (i == 3 || i == 4) {
            try {
                zgVar2.uqh().phc.ev();
            } catch (Throwable th) {
                iqz.zn("CardsLayoutManager", th);
            }
        }
    }

    private void tf() {
        if (this.lt != 0) {
            zg zgVar = this.so;
            if (zgVar != null && am.fs(zgVar.hhw)) {
                int currentTimeMillis = this.tf - ((int) ((System.currentTimeMillis() - this.lt) / 1000));
                this.tf = currentTimeMillis;
                if (currentTimeMillis < 0) {
                    this.tf = 0;
                }
            }
            this.lt = 0L;
        }
        if (this.tf >= 0) {
            this.iv.removeMessages(1);
            this.iv.sendEmptyMessage(1);
        }
        hhw hhwVar = this.yo;
        if (hhwVar != null) {
            hhwVar.zn();
        }
    }

    private void fkt() {
        if (this.f3738io) {
            this.lt = System.currentTimeMillis();
        }
        this.iv.removeMessages(1);
        hhw hhwVar = this.yo;
        if (hhwVar != null) {
            hhwVar.fs();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zn
    public int iv() {
        return this.rt.size();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zn
    public List<nqi> cn() {
        return this.nps.btk();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zn
    public void cyb() {
        if (this.na) {
            return;
        }
        this.na = true;
        final long elapsedRealtime = SystemClock.elapsedRealtime() - this.kra;
        long currentTimeMillis = System.currentTimeMillis();
        nqi nqiVar = this.fs;
        com.bytedance.sdk.openadsdk.fb.zn.zmn(currentTimeMillis, nqiVar, nqiVar.btk(), "first_ad_loaded", new com.bytedance.sdk.openadsdk.cyb.fs.zmn() { // from class: com.bytedance.sdk.openadsdk.activity.single.fb.10
            @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
            public JSONObject fs() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(IronSourceConstants.EVENTS_DURATION, elapsedRealtime);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zn
    public void zmn(Map<String, Object> map, zg zgVar, float f, float f2) {
        Object obj = map.get("pag_json_data");
        if (obj == null) {
            obj = new JSONObject();
        }
        if (obj instanceof JSONObject) {
            try {
                com.bytedance.sdk.openadsdk.component.reward.view.zg zmn2 = zgVar.zmn();
                ((JSONObject) obj).put("width", zmn2.getWidth());
                ((JSONObject) obj).put("height", zmn2.getHeight());
                int i = zgVar.iv;
                ((JSONObject) obj).put("click_feed_top", i == this.zg.findFirstVisibleItemPosition() ? 1 : 0);
                ((JSONObject) obj).put("click_on_final", i == this.nps.fb() ? 1 : 0);
                ((JSONObject) obj).put("click_countdown_remaining", this.tf);
                ((JSONObject) obj).put("click_user_remaining", i == this.yj ? (SystemClock.elapsedRealtime() - this.uqd) / 1000 : 0L);
                map.put("pag_json_data", obj.toString());
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.activity.single.fb$fb, reason: collision with other inner class name */
    private static class C0142fb {
        public nqi fs;
        public int zmn = 0;
        public String zn;

        public C0142fb(nqi nqiVar) {
            this.fs = nqiVar;
        }

        public C0142fb(String str) {
            this.zn = str;
        }
    }

    private static class zn extends btk {
        private final TextView zmn;

        public zn(@NonNull View view) {
            super(view);
            com.bytedance.sdk.openadsdk.core.hhw.zg zgVar = new com.bytedance.sdk.openadsdk.core.hhw.zg(view.getContext());
            this.zmn = zgVar;
            zgVar.setTextColor(Color.parseColor("#99FFFFFF"));
            zgVar.setTextSize(14.0f);
            zgVar.setGravity(17);
            zgVar.setPadding(0, 24, 0, 24);
            ((FrameLayout) view).addView(zgVar, new FrameLayout.LayoutParams(-1, -2));
        }

        @Override // com.bytedance.sdk.openadsdk.activity.single.fb.btk
        public void zmn(fb fbVar, C0142fb c0142fb, int i) {
            this.zmn.setText(c0142fb.zn);
        }
    }

    private static class fs extends btk {
        private final com.bytedance.sdk.openadsdk.component.reward.view.fs fs;
        private final zmn zmn;
        private com.bytedance.sdk.openadsdk.activity.single.zmn zn;

        public fs(zmn zmnVar, @NonNull View view) {
            super(view);
            this.zmn = zmnVar;
            this.fs = (com.bytedance.sdk.openadsdk.component.reward.view.fs) view;
        }

        public zg zmn() {
            return this.zn;
        }

        @Override // com.bytedance.sdk.openadsdk.activity.single.fb.btk
        public void zmn(fb fbVar, C0142fb c0142fb, int i) {
            int bindingAdapterPosition = getBindingAdapterPosition();
            Activity activity = fbVar.zmn;
            if (com.bytedance.sdk.component.utils.fs.zmn(activity)) {
                return;
            }
            nqi nqiVar = c0142fb.fs;
            com.bytedance.sdk.openadsdk.activity.single.zmn zmnVar = this.zn;
            if (zmnVar != null) {
                if (zmn(zmnVar, nqiVar)) {
                    this.zn.zmn(nqiVar, bindingAdapterPosition, i);
                } else {
                    this.zmn.zmn(this, false);
                }
            }
            com.bytedance.sdk.openadsdk.activity.single.fs fsVar = fbVar.fb;
            if (this.zn == null) {
                this.zn = nqiVar.bv() ? new nps(fsVar, nqiVar, bindingAdapterPosition, i, false) : new com.bytedance.sdk.openadsdk.activity.single.hhw(fsVar, nqiVar, bindingAdapterPosition, i, false);
            }
            fs.btk btkVar = new fs.btk(1, null);
            btkVar.fb = fbVar.am;
            this.zn.fs(activity, btkVar);
            this.zmn.zmn(this.zn);
            com.bytedance.sdk.openadsdk.component.reward.view.zg zmn = this.zn.zmn();
            if (zmn == null) {
                return;
            }
            ViewParent parent = zmn.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(zmn);
            }
            if (!fbVar.cn) {
                float cii = nqiVar.cii();
                if (cii > 0.0f) {
                    this.fs.setWidthAndHeightRatio(cii);
                } else {
                    this.fs.setWidthOrHeightInParentRatio(0.8f);
                }
            }
            this.fs.zmn(zmn, new FrameLayout.LayoutParams(-1, -1));
            this.fs.setScene(this.zn);
        }

        private boolean zmn(zg zgVar, nqi nqiVar) {
            ev rsi;
            if (zgVar.so() && (rsi = zgVar.hhw.rsi()) != null) {
                ev rsi2 = nqiVar.rsi();
                if (TextUtils.equals(rsi.zmn(), rsi2.zmn()) && TextUtils.equals(rsi.fs(), rsi2.fs()) && zgVar.ev()) {
                    return true;
                }
            }
            return false;
        }

        public void zmn(boolean z) {
            com.bytedance.sdk.openadsdk.activity.single.zmn zmnVar = this.zn;
            if (zmnVar == null) {
                return;
            }
            zmnVar.hhw(z);
            this.zn.kw();
            if (!z) {
                this.zn = null;
            }
            this.fs.zmn();
        }
    }

    private static abstract class btk extends RecyclerView.ViewHolder {
        public abstract void zmn(fb fbVar, C0142fb c0142fb, int i);

        public btk(@NonNull View view) {
            super(view);
        }
    }

    private static class zmn extends RecyclerView.Adapter<btk> {
        private boolean btk;
        private boolean fb;
        private final fb zn;
        private final ArrayList<C0142fb> zmn = new ArrayList<>();
        private final ArrayList<zg> fs = new ArrayList<>();

        public zmn(fb fbVar, List<nqi> list) {
            this.zn = fbVar;
            for (int i = 0; i < list.size(); i++) {
                nqi nqiVar = list.get(i);
                if (nqiVar != null && fbVar != null) {
                    nqiVar.nu(fbVar.btk);
                }
                this.zmn.add(new C0142fb(nqiVar));
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
        public btk onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            if (i == -1) {
                com.bytedance.sdk.openadsdk.core.hhw.zn znVar = new com.bytedance.sdk.openadsdk.core.hhw.zn(viewGroup.getContext());
                znVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                return new zn(znVar);
            }
            com.bytedance.sdk.openadsdk.component.reward.view.fs fsVar = new com.bytedance.sdk.openadsdk.component.reward.view.fs(viewGroup.getContext(), this.zn.cyb, this.zn.cn, jy.fs(viewGroup.getContext(), 10.0f));
            fsVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            return new fs(this, fsVar);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NonNull btk btkVar, int i) {
            if (i >= this.zmn.size()) {
                i %= this.zmn.size();
            }
            btkVar.zmn(this.zn, this.zmn.get(i), i);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
        public void onViewAttachedToWindow(@NonNull btk btkVar) {
            super.onViewAttachedToWindow(btkVar);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: fs, reason: merged with bridge method [inline-methods] */
        public void onViewDetachedFromWindow(@NonNull btk btkVar) {
            com.bytedance.sdk.openadsdk.activity.single.zmn zmnVar;
            super.onViewDetachedFromWindow(btkVar);
            if (!(btkVar instanceof fs) || (zmnVar = ((fs) btkVar).zn) == null) {
                return;
            }
            zmnVar.uqh().phc.cud();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: zn, reason: merged with bridge method [inline-methods] */
        public void onViewRecycled(@NonNull btk btkVar) {
            super.onViewRecycled(btkVar);
            if (btkVar instanceof fs) {
                fs fsVar = (fs) btkVar;
                com.bytedance.sdk.openadsdk.activity.single.zmn zmnVar = fsVar.zn;
                if (this.zn.iqz) {
                    boolean fs = fs(zmnVar);
                    if (zmnVar != null) {
                        zmn(fsVar, fs);
                        return;
                    }
                    return;
                }
                zmn(fsVar, false);
            }
        }

        private boolean fs(zg zgVar) {
            return zgVar != null && zgVar.so();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            C0142fb c0142fb = this.zmn.get(i % this.zmn.size());
            if (c0142fb.zmn != 0) {
                return -1;
            }
            ev rsi = c0142fb.fs.rsi();
            if (rsi == null) {
                return 1;
            }
            return (rsi.zmn() + rsi.fs()).hashCode();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            if (this.btk) {
                return Integer.MAX_VALUE;
            }
            return this.zmn.size();
        }

        public int zmn() {
            int itemCount = getItemCount();
            return this.fb ? itemCount - 1 : itemCount;
        }

        public void zmn(String str) {
            int size = this.zmn.size();
            C0142fb c0142fb = size > 0 ? this.zmn.get(size - 1) : null;
            boolean isEmpty = TextUtils.isEmpty(str);
            if (c0142fb == null || c0142fb.zmn != 1) {
                if (isEmpty) {
                    return;
                }
                this.zmn.add(new C0142fb(str));
                notifyItemInserted(size);
                this.fb = true;
                return;
            }
            if (!isEmpty) {
                c0142fb.zn = str;
                notifyItemChanged(size - 1);
            } else {
                this.zmn.remove(c0142fb);
                notifyItemRemoved(size - 1);
                this.fb = false;
            }
        }

        public void zmn(zg zgVar) {
            this.fs.add(zgVar);
        }

        public ArrayList<zg> fs() {
            return this.fs;
        }

        public void zmn(List<nqi> list) {
            fb fbVar;
            int size = this.zmn.size();
            if (this.fb) {
                size--;
            }
            for (int i = 0; i < list.size(); i++) {
                nqi nqiVar = list.get(i);
                if (nqiVar != null && (fbVar = this.zn) != null) {
                    nqiVar.nu(fbVar.btk);
                }
                this.zmn.add(size + i, new C0142fb(nqiVar));
                nqiVar.xl();
            }
            notifyItemRangeInserted(size, list.size());
        }

        public void zmn(int i, int i2) {
            if (this.btk) {
                return;
            }
            this.btk = true;
            if (i < 0) {
                i = 0;
            }
            int size = this.zmn.size();
            notifyItemRangeInserted(size, (Integer.MAX_VALUE - i2) - (size - i));
            notifyItemRangeInserted(0, i2 - i);
        }

        public boolean zn() {
            return this.btk;
        }

        public int fb() {
            return this.fb ? this.zmn.size() - 1 : this.zmn.size();
        }

        public List<nqi> btk() {
            ArrayList arrayList = new ArrayList();
            Iterator<C0142fb> it = this.zmn.iterator();
            while (it.hasNext()) {
                C0142fb next = it.next();
                if (next.zmn == 0) {
                    arrayList.add(next.fs);
                }
            }
            return arrayList;
        }

        public void zmn(fs fsVar, boolean z) {
            if (fsVar.zn == null) {
                return;
            }
            this.fs.remove(fsVar.zn);
            fsVar.zmn(z);
        }
    }

    public static abstract class hhw implements Runnable {
        private long btk;
        private long fb;
        private final long fs;
        private final Handler zmn = new Handler(Looper.getMainLooper());
        private long zn;

        public abstract void zmn();

        public hhw(long j) {
            this.fs = j;
        }

        public void fs() {
            this.zmn.removeCallbacks(this);
            if (this.btk > this.zn) {
                return;
            }
            this.fb += SystemClock.elapsedRealtime() - this.zn;
            this.btk = SystemClock.elapsedRealtime();
        }

        public void zn() {
            long j = this.fs - this.fb;
            if (j < 0) {
                return;
            }
            this.zmn.removeCallbacks(this);
            this.zmn.postDelayed(this, j);
            this.zn = SystemClock.elapsedRealtime();
        }

        public void fb() {
            this.zmn.removeCallbacks(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            zmn();
        }

        public void btk() {
            this.zmn.postDelayed(this, this.fs);
            this.zn = SystemClock.elapsedRealtime();
        }

        public long hhw() {
            long j;
            long j2;
            if (this.zn > this.btk) {
                j = this.fs - (SystemClock.elapsedRealtime() - this.zn);
                j2 = this.fb;
            } else {
                j = this.fs;
                j2 = this.fb;
            }
            long j3 = j - j2;
            if (j3 < 0) {
                return 0L;
            }
            return j3;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zn
    public int zg() {
        return this.tf;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zn
    public void olo() {
        super.olo();
        this.f3738io = true;
    }
}
