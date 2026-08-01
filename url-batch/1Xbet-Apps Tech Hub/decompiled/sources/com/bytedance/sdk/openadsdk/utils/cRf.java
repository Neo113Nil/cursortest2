package com.bytedance.sdk.openadsdk.utils;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.bytedance.sdk.openadsdk.ApmHelper;
import java.util.List;

/* compiled from: ViewUtils.java */
/* loaded from: classes2.dex */
public class cRf {

    /* compiled from: ViewUtils.java */
    public interface icD {
        void icD();

        void pvs();

        void pvs(View view, boolean z);

        void pvs(boolean z);
    }

    public static void pvs(final ViewGroup viewGroup, boolean z, int i, icD icd, List<ViewGroup> list) {
        viewGroup.setTag(520093765, icd);
        viewGroup.setTag(520093766, Integer.valueOf(i));
        if (viewGroup.getTag(520093764) == Boolean.TRUE) {
            return;
        }
        final pvs pvsVar = new pvs(viewGroup);
        if (list != null && list.size() > 0) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                list.get(i2).setOnHierarchyChangeListener(new ViewGroup.OnHierarchyChangeListener() { // from class: com.bytedance.sdk.openadsdk.utils.cRf.1
                    @Override // android.view.ViewGroup.OnHierarchyChangeListener
                    public void onChildViewAdded(View view, View view2) {
                        pvs.this.pvs = view2;
                    }

                    @Override // android.view.ViewGroup.OnHierarchyChangeListener
                    public void onChildViewRemoved(View view, View view2) {
                        pvs.this.pvs = null;
                    }
                });
            }
        }
        viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(pvsVar);
        if (z) {
            viewGroup.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.utils.cRf.2
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public void onScrollChanged() {
                    try {
                        icD icd2 = (icD) viewGroup.getTag(520093765);
                        ViewGroup viewGroup2 = viewGroup;
                        cRf.icD(viewGroup2, icd2, (Integer) viewGroup2.getTag(520093766));
                    } catch (Exception e) {
                        ApmHelper.reportCustomError("onScrollChanged exception " + viewGroup.getTag(520093765), "ViewUtils", e);
                    }
                }
            });
        }
        viewGroup.getViewTreeObserver().addOnWindowFocusChangeListener(new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: com.bytedance.sdk.openadsdk.utils.cRf.3
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public void onWindowFocusChanged(boolean z2) {
                try {
                    icD icd2 = (icD) viewGroup.getTag(520093765);
                    if (icd2 != null) {
                        icd2.pvs(z2);
                        ViewGroup viewGroup2 = viewGroup;
                        cRf.icD(viewGroup2, icd2, (Integer) viewGroup2.getTag(520093766));
                    }
                } catch (Exception e) {
                    ApmHelper.reportCustomError("onWindowFocusChanged exception " + viewGroup.getTag(520093765), "ViewUtils", e);
                }
            }
        });
        viewGroup.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.bytedance.sdk.openadsdk.utils.cRf.4
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                icD icd2 = (icD) viewGroup.getTag(520093765);
                if (icd2 != null) {
                    icd2.pvs();
                }
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                icD icd2 = (icD) viewGroup.getTag(520093765);
                if (icd2 != null) {
                    icd2.icD();
                }
            }
        });
        viewGroup.setTag(520093764, Boolean.TRUE);
    }

    /* compiled from: ViewUtils.java */
    class pvs implements ViewTreeObserver.OnGlobalLayoutListener {
        final /* synthetic */ ViewGroup icD;
        View pvs = null;

        pvs(ViewGroup viewGroup) {
            this.icD = viewGroup;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            try {
                icD icd = (icD) this.icD.getTag(520093765);
                if (this.pvs != null) {
                    Rect rect = new Rect();
                    this.pvs.getGlobalVisibleRect(rect);
                    Rect rect2 = new Rect();
                    this.icD.getGlobalVisibleRect(rect2);
                    if (rect.contains(rect2)) {
                        if (icd != null) {
                            icd.pvs(this.icD, false);
                        }
                        this.icD.setTag(520093763, Boolean.FALSE);
                        return;
                    } else {
                        if (icd != null) {
                            icd.pvs(this.icD, true);
                        }
                        this.icD.setTag(520093763, Boolean.TRUE);
                        return;
                    }
                }
                ViewGroup viewGroup = this.icD;
                cRf.icD(viewGroup, icd, (Integer) viewGroup.getTag(520093766));
            } catch (Exception e) {
                ApmHelper.reportCustomError("onGlobalLayout exception " + this.icD.getTag(520093765), "ViewUtils", e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void icD(View view, icD icd, Integer num) {
        if (icd == null) {
            return;
        }
        if (num == null) {
            num = 0;
        }
        if (pvs(view, num.intValue())) {
            icd.pvs(view, true);
        }
    }

    private static boolean pvs(View view, int i) {
        return com.bytedance.sdk.openadsdk.core.Gp.pvs(view, 20, i);
    }
}
