package com.bytedance.sdk.openadsdk.activity.single;

import android.R;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.sdk.component.utils.doe;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.common.kw;
import com.bytedance.sdk.openadsdk.core.am;
import com.bytedance.sdk.openadsdk.core.cn;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.widget.fs;
import com.bytedance.sdk.openadsdk.rt.zmn.fs;
import com.bytedance.sdk.openadsdk.rt.zmn.fs.zmn;
import com.bytedance.sdk.openadsdk.rt.zmn.zmn.zn;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.bytedance.sdk.openadsdk.utils.nu;
import com.bytedance.sdk.openadsdk.utils.olo;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes12.dex */
public class TTHistoryActivity extends TTBaseActivity {
    private String btk;
    private boolean cn;
    private com.bytedance.sdk.openadsdk.core.hhw.fb fb;
    private com.bytedance.sdk.openadsdk.core.hhw.zn fs;
    private String hhw;
    private com.bytedance.sdk.openadsdk.rt.zmn.fs.fs iv;
    private FrameLayout klz;
    private com.bytedance.sdk.openadsdk.rt.zmn.fs mw;
    private String nps;
    private com.bytedance.sdk.openadsdk.core.hhw.btk rc;
    private nqi rt;
    private String zg;
    private com.bytedance.sdk.openadsdk.core.hhw.fb zn;
    private ArrayList<com.bytedance.sdk.openadsdk.rt.zmn.zmn> bvs = new ArrayList<>();
    private final String cyb = "is_new_style";
    int zmn = -1;

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, h.u, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    @SuppressLint({"ClickableViewAccessibility"})
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (!cn.btk()) {
            finish();
            return;
        }
        try {
            kgc.fs(this);
        } catch (Throwable unused) {
        }
        try {
            setContentView(zmn());
            Intent intent = getIntent();
            this.cn = intent.getBooleanExtra("is_new_style", false);
            this.rt = am.zmn().zmn(am.zmn(intent));
            if (bundle != null) {
                try {
                    int i = bundle.getInt("meta_index", -1);
                    this.zmn = i;
                    if (i >= 0) {
                        this.rt = am.zmn().zmn(this.zmn);
                    }
                } catch (Throwable unused2) {
                }
            }
            com.bytedance.sdk.openadsdk.rt.btk.zmn(this);
            this.zn = (com.bytedance.sdk.openadsdk.core.hhw.fb) this.fs.findViewById(olo.rje);
            this.fb = (com.bytedance.sdk.openadsdk.core.hhw.fb) this.fs.findViewById(520093720);
            this.iv.findViewById(olo.nkt);
            this.zn.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryActivity.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/single/TTHistoryActivity$1;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked(h.u, view);
                    safedk_TTHistoryActivity$1_onClick_fe0f32a91a93c5ec0aef5311b0a9f5c6(view);
                }

                public void safedk_TTHistoryActivity$1_onClick_fe0f32a91a93c5ec0aef5311b0a9f5c6(View p0) {
                    TTHistoryActivity.this.zmn(p0);
                }
            });
            this.fb.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryActivity.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/single/TTHistoryActivity$2;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked(h.u, view);
                    safedk_TTHistoryActivity$2_onClick_de0116047aac7c57515f65cc64e4df78(view);
                }

                public void safedk_TTHistoryActivity$2_onClick_de0116047aac7c57515f65cc64e4df78(View p0) {
                    TTHistoryActivity.this.finish();
                }
            });
            com.bytedance.sdk.openadsdk.rt.zmn.fs fsVar = this.mw;
            if (fsVar != null) {
                fsVar.zmn(new fs.InterfaceC0204fs() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryActivity.3
                    @Override // com.bytedance.sdk.openadsdk.rt.zmn.fs.InterfaceC0204fs
                    public void zmn(com.bytedance.sdk.openadsdk.rt.zmn.zmn zmnVar) {
                        if (TTHistoryActivity.this.cn) {
                            TTHistoryActivity.this.zmn(zmnVar.nps(), zmnVar.btk(), zmnVar.fs());
                        } else {
                            TTHistoryLandingPageActivity.zmn(TTHistoryActivity.this, zmnVar.nps(), zmnVar.btk(), zmnVar.fs());
                        }
                        TTHistoryActivity.this.finish();
                    }
                });
            }
            fs();
            zn();
        } catch (Throwable unused3) {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(String str, final String str2, final int i) {
        if (TextUtils.isEmpty(str) || i < 0) {
            finish();
        } else {
            com.bytedance.sdk.openadsdk.rt.zmn.zmn.zn.zmn().zmn(str, new zn.InterfaceC0206zn() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryActivity.4
                @Override // com.bytedance.sdk.openadsdk.rt.zmn.zmn.zn.InterfaceC0206zn
                public void zmn(final String str3) {
                    nu.zmn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryActivity.4.1
                        @Override // java.lang.Runnable
                        public void run() {
                            int i2;
                            List<nqi> fs = com.bytedance.sdk.openadsdk.rt.zmn.zmn.zn.fs(str3);
                            nqi nqiVar = (fs == null || (i2 = i) < 0 || i2 >= fs.size()) ? null : fs.get(i);
                            if (nqiVar == null) {
                                TTHistoryActivity.this.finish();
                            } else {
                                AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                                IABLandingPageActivity.fs(TTHistoryActivity.this, nqiVar, str2);
                            }
                        }
                    });
                }

                @Override // com.bytedance.sdk.openadsdk.rt.zmn.zmn.zn.InterfaceC0206zn
                public void fs(String str3) {
                    nu.zmn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryActivity.4.2
                        @Override // java.lang.Runnable
                        public void run() {
                            TTHistoryActivity.this.finish();
                        }
                    });
                }
            });
        }
    }

    private View zmn() {
        com.bytedance.sdk.openadsdk.core.hhw.zn znVar = new com.bytedance.sdk.openadsdk.core.hhw.zn(this);
        if (Build.VERSION.SDK_INT >= 35) {
            znVar.setFitsSystemWindows(true);
        }
        com.bytedance.sdk.openadsdk.core.hhw.btk btkVar = new com.bytedance.sdk.openadsdk.core.hhw.btk(this);
        this.rc = btkVar;
        btkVar.setOrientation(1);
        znVar.addView(this.rc, new FrameLayout.LayoutParams(-1, -1));
        this.rc.setId(olo.f3745io);
        this.rc.setPadding(0, jy.fs(this, 12.0f), 0, 0);
        this.fs = new kw(this);
        this.rc.addView(this.fs, new LinearLayout.LayoutParams(-1, jy.fs(this, 44.0f)));
        FrameLayout frameLayout = new FrameLayout(this);
        this.klz = frameLayout;
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        RecyclerView recyclerView = new RecyclerView(this);
        recyclerView.setId(olo.lbc);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        com.bytedance.sdk.openadsdk.rt.zmn.fs fsVar = new com.bytedance.sdk.openadsdk.rt.zmn.fs(this);
        this.mw = fsVar;
        recyclerView.setAdapter(fsVar);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, 1));
        this.klz.addView(recyclerView, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.rt.zmn.fs.fs fsVar2 = new com.bytedance.sdk.openadsdk.rt.zmn.fs.fs(this);
        this.iv = fsVar2;
        fsVar2.setId(olo.nkt);
        this.klz.addView(this.iv, new FrameLayout.LayoutParams(-1, -1));
        this.rc.addView(this.klz);
        return znVar;
    }

    private void fs() {
        com.bytedance.sdk.openadsdk.rt.zmn.zmn.zn.zmn().zmn(new zn.fs() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryActivity.5
            @Override // com.bytedance.sdk.openadsdk.rt.zmn.zmn.zn.fs
            public void zmn(List<com.bytedance.sdk.openadsdk.rt.zmn.zmn> list) {
                if (list != null) {
                    TTHistoryActivity.this.bvs.addAll(list);
                    TTHistoryActivity.this.runOnUiThread(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryActivity.5.1
                        @Override // java.lang.Runnable
                        public void run() {
                            TTHistoryActivity.this.zn();
                        }
                    });
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zn() {
        if (!this.bvs.isEmpty()) {
            this.zn.setVisibility(0);
            this.klz.setVisibility(0);
            com.bytedance.sdk.openadsdk.rt.zmn.fs.fs fsVar = this.iv;
            if (fsVar != null) {
                fsVar.setVisibility(8);
            }
        } else {
            com.bytedance.sdk.openadsdk.rt.zmn.fs.fs fsVar2 = this.iv;
            if (fsVar2 != null) {
                fsVar2.zmn();
                this.iv.setVisibility(0);
            }
            this.zn.setVisibility(8);
        }
        com.bytedance.sdk.openadsdk.rt.zmn.fs fsVar3 = this.mw;
        if (fsVar3 != null) {
            fsVar3.zmn(this.bvs);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(View view) {
        final com.bytedance.sdk.openadsdk.rt.zmn.fs.zmn zmnVar = new com.bytedance.sdk.openadsdk.rt.zmn.fs.zmn(this);
        zmnVar.setOnMenuItemClickListener(new zmn.InterfaceC0205zmn() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryActivity.6
            @Override // com.bytedance.sdk.openadsdk.rt.zmn.fs.zmn.InterfaceC0205zmn
            public void zmn() {
                TTHistoryActivity.this.btk();
                zmnVar.zmn();
            }

            @Override // com.bytedance.sdk.openadsdk.rt.zmn.fs.zmn.InterfaceC0205zmn
            public void fs() {
                zmnVar.zmn();
            }
        });
        zmnVar.zmn(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void btk() {
        com.bytedance.sdk.openadsdk.core.widget.fs fsVar = new com.bytedance.sdk.openadsdk.core.widget.fs(this);
        try {
            this.btk = getString(doe.fs(this, "tt_history_confirm_maintitle"));
            this.hhw = getString(doe.fs(this, "tt_history_confirm_subtitle"));
            this.nps = getString(doe.fs(this, "tt_history_cancel"));
            this.zg = getString(doe.fs(this, "tt_history_delete"));
            fsVar.fs(this.btk).zmn(this.hhw).zn(this.zg).fb(this.nps);
            fsVar.zmn(new AnonymousClass7(fsVar)).show();
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.activity.single.TTHistoryActivity$7, reason: invalid class name */
    class AnonymousClass7 implements fs.InterfaceC0184fs {
        final /* synthetic */ com.bytedance.sdk.openadsdk.core.widget.fs zmn;

        AnonymousClass7(com.bytedance.sdk.openadsdk.core.widget.fs fsVar) {
            this.zmn = fsVar;
        }

        @Override // com.bytedance.sdk.openadsdk.core.widget.fs.InterfaceC0184fs
        public void zmn() {
            try {
                com.bytedance.sdk.openadsdk.rt.zmn.zmn.zn.zmn().zmn(new zn.zmn() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryActivity.7.1
                    @Override // com.bytedance.sdk.openadsdk.rt.zmn.zmn.zn.zmn
                    public void zmn() {
                        TTHistoryActivity.this.runOnUiThread(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryActivity.7.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                TTHistoryActivity.this.bvs.clear();
                                if (!com.bytedance.sdk.openadsdk.uqh.btk.zmn("lp_iab_cookie", true)) {
                                    TTHistoryActivity tTHistoryActivity = TTHistoryActivity.this;
                                    Toast.makeText(tTHistoryActivity, tTHistoryActivity.getString(doe.fs(tTHistoryActivity, "tt_history_delete_successful")), 0).show();
                                } else {
                                    TTAdDislikeToast tTAdDislikeToast = new TTAdDislikeToast(TTHistoryActivity.this);
                                    ((FrameLayout) TTHistoryActivity.this.findViewById(R.id.content)).addView(tTAdDislikeToast);
                                    TTHistoryActivity tTHistoryActivity2 = TTHistoryActivity.this;
                                    tTAdDislikeToast.show(tTHistoryActivity2.getString(doe.fs(tTHistoryActivity2, "tt_history_delete_successful")));
                                }
                                TTHistoryActivity.this.zn();
                            }
                        });
                        TTHistoryActivity.this.rt = com.bytedance.sdk.openadsdk.rt.zmn.zmn.zn.zmn().zn();
                        if (TTHistoryActivity.this.rt != null) {
                            com.bytedance.sdk.openadsdk.fb.zn.zmn(System.currentTimeMillis(), TTHistoryActivity.this.rt, "landingpage", "iab_clear_history_all");
                        }
                    }

                    @Override // com.bytedance.sdk.openadsdk.rt.zmn.zmn.zn.zmn
                    public void zmn(Exception exc) {
                        exc.getMessage();
                    }
                });
            } catch (Exception e) {
                e.getMessage();
            }
            this.zmn.dismiss();
        }

        @Override // com.bytedance.sdk.openadsdk.core.widget.fs.InterfaceC0184fs
        public void fs() {
            this.zmn.dismiss();
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        try {
            int zmn = this.rt != null ? am.zmn().zmn(this.rt) : -1;
            this.zmn = zmn;
            bundle.putInt("meta_index", zmn);
        } catch (Throwable unused) {
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        if (this.zmn >= 0) {
            am.zmn().zn(this.zmn);
            this.zmn = -1;
        }
    }
}
