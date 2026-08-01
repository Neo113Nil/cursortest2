package com.bytedance.sdk.openadsdk.dislike;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.bytedance.sdk.component.utils.Ju;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.core.bannerexpress.pvs;
import com.bytedance.sdk.openadsdk.core.so;
import com.bytedance.sdk.openadsdk.utils.ae;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class TTDislikeListView extends ListView {
    private String Jd;
    private String NB;
    private AdapterView.OnItemClickListener icD;
    protected IListenerManager pvs;
    private final AdapterView.OnItemClickListener sUS;
    private String vG;

    public TTDislikeListView(Context context) {
        super(context);
        this.sUS = new AdapterView.OnItemClickListener() { // from class: com.bytedance.sdk.openadsdk.dislike.TTDislikeListView.1
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                if (TTDislikeListView.this.getAdapter() != null && TTDislikeListView.this.getAdapter().getItem(i) != null && (TTDislikeListView.this.getAdapter().getItem(i) instanceof FilterWord)) {
                    FilterWord filterWord = (FilterWord) TTDislikeListView.this.getAdapter().getItem(i);
                    if (!filterWord.hasSecondOptions()) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(filterWord);
                        if (!TextUtils.isEmpty(TTDislikeListView.this.vG)) {
                            pvs.pvs().pvs(TTDislikeListView.this.vG, arrayList, TTDislikeListView.this.Jd);
                        }
                        if (!TextUtils.isEmpty(TTDislikeListView.this.NB)) {
                            if (com.bytedance.sdk.openadsdk.multipro.icD.vG()) {
                                TTDislikeListView.this.pvs("onItemClickClosed");
                            } else {
                                pvs.InterfaceC0073pvs vG = so.icD().vG(TTDislikeListView.this.NB);
                                if (vG != null) {
                                    vG.pvs();
                                    so.icD().Jd(TTDislikeListView.this.NB);
                                }
                            }
                        }
                    }
                    try {
                        if (TTDislikeListView.this.icD != null) {
                            TTDislikeListView.this.icD.onItemClick(adapterView, view, i, j);
                            return;
                        }
                        return;
                    } catch (Throwable unused) {
                        return;
                    }
                }
                throw new IllegalArgumentException("Adapter data is abnormal, it must be FilterWord");
            }
        };
        pvs();
    }

    public void setMaterialMeta(String str) {
        this.vG = str;
    }

    public void setDislikeSource(String str) {
        this.Jd = str;
    }

    private void pvs() {
        super.setOnItemClickListener(this.sUS);
    }

    @Override // android.widget.AdapterView
    public void setOnItemClickListener(AdapterView.OnItemClickListener onItemClickListener) {
        this.icD = onItemClickListener;
    }

    public void setClosedListenerKey(String str) {
        this.NB = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pvs(final String str) {
        ae.vG(new com.bytedance.sdk.component.so.so("Reward_executeMultiProcessCallback") { // from class: com.bytedance.sdk.openadsdk.dislike.TTDislikeListView.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (TextUtils.isEmpty(TTDislikeListView.this.NB)) {
                        return;
                    }
                    TTDislikeListView.this.pvs(6).executeDisLikeClosedCallback(TTDislikeListView.this.NB, str);
                } catch (Throwable th) {
                    Ju.pvs("TTDislikeListView", "executeRewardVideoCallback execute throw Exception : ", th);
                }
            }
        }, 5);
    }

    protected IListenerManager pvs(int i) {
        if (this.pvs == null) {
            this.pvs = com.bytedance.sdk.openadsdk.multipro.aidl.pvs.pvs.asInterface(com.bytedance.sdk.openadsdk.multipro.aidl.pvs.pvs().pvs(i));
        }
        return this.pvs;
    }

    public static void pvs(final int i, final String str, final pvs.InterfaceC0073pvs interfaceC0073pvs) {
        if (com.bytedance.sdk.openadsdk.multipro.icD.vG()) {
            ae.vG(new com.bytedance.sdk.component.so.so("DislikeClosed_registerMultiProcessListener") { // from class: com.bytedance.sdk.openadsdk.dislike.TTDislikeListView.3
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.multipro.aidl.pvs pvs = com.bytedance.sdk.openadsdk.multipro.aidl.pvs.pvs();
                    if (i != 6 || interfaceC0073pvs == null) {
                        return;
                    }
                    try {
                        com.bytedance.sdk.openadsdk.multipro.aidl.icD.icD icd = new com.bytedance.sdk.openadsdk.multipro.aidl.icD.icD(str, interfaceC0073pvs);
                        IListenerManager asInterface = com.bytedance.sdk.openadsdk.multipro.aidl.pvs.Jd.asInterface(pvs.pvs(6));
                        if (asInterface != null) {
                            asInterface.registerDisLikeClosedListener(str, icd);
                        }
                    } catch (RemoteException e) {
                        Ju.pvs("TTDislikeListView", e.getMessage());
                    }
                }
            }, 5);
        }
    }

    public static void pvs(final int i, final String str) {
        if (com.bytedance.sdk.openadsdk.multipro.icD.vG()) {
            ae.vG(new com.bytedance.sdk.component.so.so("DislikeClosed_unregisterMultiProcessListener") { // from class: com.bytedance.sdk.openadsdk.dislike.TTDislikeListView.4
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.multipro.aidl.pvs pvs = com.bytedance.sdk.openadsdk.multipro.aidl.pvs.pvs();
                    if (i == 6) {
                        try {
                            IListenerManager asInterface = com.bytedance.sdk.openadsdk.multipro.aidl.pvs.Jd.asInterface(pvs.pvs(6));
                            if (asInterface != null) {
                                asInterface.unregisterDisLikeClosedListener(str);
                            }
                        } catch (RemoteException unused) {
                        }
                    }
                }
            }, 5);
        }
    }
}
