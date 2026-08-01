package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.bytedance.sdk.component.utils.dyT;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class EmptyView extends View implements dyT.pvs {
    private View Jd;
    private final Runnable Ju;
    private final Handler Mxy;
    private List<View> NB;
    private final AtomicBoolean Wyp;
    private boolean icD;
    private boolean kj;
    private boolean pvs;
    private ViewTreeObserver.OnGlobalLayoutListener qh;
    private List<View> sUS;
    private int so;
    private pvs vG;
    private boolean yiw;

    public interface pvs {
        void icD();

        void pvs();

        void pvs(View view);

        void pvs(boolean z);
    }

    public EmptyView(Context context, View view) {
        super(mnm.pvs());
        this.Mxy = new com.bytedance.sdk.component.utils.dyT(Ju.icD().getLooper(), this);
        this.Wyp = new AtomicBoolean(true);
        this.kj = false;
        this.Ju = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.EmptyView.3
            @Override // java.lang.Runnable
            public void run() {
                if (EmptyView.this.vG != null) {
                    EmptyView.this.vG.pvs(EmptyView.this.Jd);
                }
            }
        };
        this.Jd = view;
        setLayoutParams(new ViewGroup.LayoutParams(0, 0));
        this.qh = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.core.EmptyView.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                if (EmptyView.this.kj) {
                    return;
                }
                EmptyView.this.NB();
                EmptyView.this.Jd();
            }
        };
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        pvs pvsVar = this.vG;
        if (pvsVar != null) {
            pvsVar.pvs(z);
        }
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.yiw = false;
        icD();
        if (this.qh != null) {
            getViewTreeObserver().addOnGlobalLayoutListener(this.qh);
        }
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        icD();
    }

    private void icD() {
        pvs pvsVar;
        if (!this.Wyp.getAndSet(false) || (pvsVar = this.vG) == null) {
            return;
        }
        pvsVar.pvs();
    }

    private void vG() {
        pvs pvsVar;
        if (this.Wyp.getAndSet(true) || (pvsVar = this.vG) == null) {
            return;
        }
        pvsVar.icD();
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NB();
        this.yiw = true;
        vG();
        pvs(false);
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        vG();
    }

    public void setRefClickViews(List<View> list) {
        this.NB = list;
    }

    public void setRefCreativeViews(List<View> list) {
        this.sUS = list;
    }

    public void pvs() {
        pvs(this.NB, (com.bytedance.sdk.openadsdk.core.icD.vG) null);
        pvs(this.sUS, (com.bytedance.sdk.openadsdk.core.icD.vG) null);
    }

    public void pvs(List<View> list, com.bytedance.sdk.openadsdk.core.icD.vG vGVar) {
        if (com.bytedance.sdk.component.utils.qh.icD(list)) {
            for (View view : list) {
                if (view != null) {
                    view.setOnClickListener(vGVar);
                    view.setOnTouchListener(vGVar);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Jd() {
        if (!this.icD || this.pvs) {
            return;
        }
        this.pvs = true;
        this.Mxy.sendEmptyMessage(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void NB() {
        if (this.pvs) {
            this.Mxy.removeCallbacksAndMessages(null);
            this.pvs = false;
        }
    }

    public void setNeedCheckingShow(boolean z) {
        this.icD = z;
        if (!z && this.pvs) {
            NB();
        } else {
            if (!z || this.pvs) {
                return;
            }
            Jd();
        }
    }

    public void setCallback(pvs pvsVar) {
        this.vG = pvsVar;
    }

    public void setAdType(int i) {
        this.so = i;
    }

    @Override // com.bytedance.sdk.component.utils.dyT.pvs
    public void pvs(Message message) {
        if (message.what == 1 && this.pvs) {
            if (sUS() && Gp.pvs(this.Jd, 20, this.so)) {
                NB();
                this.kj = true;
                Ju.vG().post(this.Ju);
                pvs(true);
                return;
            }
            this.Mxy.sendEmptyMessageDelayed(1, 1000L);
        }
    }

    private boolean sUS() {
        View view = this.Jd;
        if (view instanceof NativeExpressView) {
            return ((NativeExpressView) view).bNS();
        }
        return true;
    }

    private void pvs(final boolean z) {
        final ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        com.bytedance.sdk.component.utils.so.icD().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.EmptyView.2
            @Override // java.lang.Runnable
            public void run() {
                ViewTreeObserver viewTreeObserver2;
                if (EmptyView.this.qh != null && (viewTreeObserver2 = viewTreeObserver) != null) {
                    try {
                        viewTreeObserver2.removeOnGlobalLayoutListener(EmptyView.this.qh);
                    } catch (Exception unused) {
                    }
                }
                if (z) {
                    EmptyView.this.qh = null;
                }
            }
        });
    }
}
