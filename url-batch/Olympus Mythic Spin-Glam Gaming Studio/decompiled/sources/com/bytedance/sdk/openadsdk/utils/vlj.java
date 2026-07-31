package com.bytedance.sdk.openadsdk.utils;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.bytedance.sdk.openadsdk.ApmHelper;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes13.dex */
public class vlj {

    public interface fs {
        void fs();

        void zmn();

        void zmn(View view, boolean z);

        void zmn(boolean z);
    }

    public static void zmn(final ViewGroup viewGroup, boolean z, int i, final boolean z2, fs fsVar, List<ViewGroup> list) {
        viewGroup.setTag(520093765, fsVar);
        viewGroup.setTag(520093766, Integer.valueOf(i));
        if (viewGroup.getTag(520093764) == Boolean.TRUE) {
            return;
        }
        final zmn zmnVar = new zmn(viewGroup, z2);
        if (list != null && list.size() > 0) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                list.get(i2).setOnHierarchyChangeListener(new ViewGroup.OnHierarchyChangeListener() { // from class: com.bytedance.sdk.openadsdk.utils.vlj.1
                    @Override // android.view.ViewGroup.OnHierarchyChangeListener
                    public void onChildViewAdded(View view, View view2) {
                        zmn.this.zmn = view2;
                    }

                    @Override // android.view.ViewGroup.OnHierarchyChangeListener
                    public void onChildViewRemoved(View view, View view2) {
                        zmn.this.zmn = null;
                    }
                });
            }
        }
        viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(zmnVar);
        if (z) {
            viewGroup.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.utils.vlj.2
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public void onScrollChanged() {
                    try {
                        fs fsVar2 = (fs) viewGroup.getTag(520093765);
                        ViewGroup viewGroup2 = viewGroup;
                        vlj.fs(viewGroup2, fsVar2, (Integer) viewGroup2.getTag(520093766), z2);
                    } catch (Exception e) {
                        ApmHelper.reportCustomError("onScrollChanged exception " + viewGroup.getTag(520093765), "ViewUtils", e);
                    }
                }
            });
        }
        viewGroup.getViewTreeObserver().addOnWindowFocusChangeListener(new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: com.bytedance.sdk.openadsdk.utils.vlj.3
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public void onWindowFocusChanged(boolean z3) {
                try {
                    fs fsVar2 = (fs) viewGroup.getTag(520093765);
                    if (fsVar2 != null) {
                        fsVar2.zmn(z3);
                        ViewGroup viewGroup2 = viewGroup;
                        vlj.fs(viewGroup2, fsVar2, (Integer) viewGroup2.getTag(520093766), z2);
                    }
                } catch (Exception e) {
                    ApmHelper.reportCustomError("onWindowFocusChanged exception " + viewGroup.getTag(520093765), "ViewUtils", e);
                }
            }
        });
        viewGroup.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.bytedance.sdk.openadsdk.utils.vlj.4
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                fs fsVar2 = (fs) viewGroup.getTag(520093765);
                if (fsVar2 != null) {
                    fsVar2.zmn();
                }
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                fs fsVar2 = (fs) viewGroup.getTag(520093765);
                if (fsVar2 != null) {
                    fsVar2.fs();
                }
            }
        });
        viewGroup.setTag(520093764, Boolean.TRUE);
    }

    class zmn implements ViewTreeObserver.OnGlobalLayoutListener {
        final /* synthetic */ ViewGroup fs;
        View zmn = null;
        final /* synthetic */ boolean zn;

        zmn(ViewGroup viewGroup, boolean z) {
            this.fs = viewGroup;
            this.zn = z;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            try {
                fs fsVar = (fs) this.fs.getTag(520093765);
                if (this.zmn != null) {
                    Rect rect = new Rect();
                    this.zmn.getGlobalVisibleRect(rect);
                    Rect rect2 = new Rect();
                    this.fs.getGlobalVisibleRect(rect2);
                    if (rect.contains(rect2)) {
                        if (fsVar != null) {
                            fsVar.zmn(this.fs, false);
                        }
                        this.fs.setTag(520093763, Boolean.FALSE);
                        return;
                    } else {
                        if (fsVar != null) {
                            fsVar.zmn(this.fs, true);
                        }
                        this.fs.setTag(520093763, Boolean.TRUE);
                        return;
                    }
                }
                ViewGroup viewGroup = this.fs;
                vlj.fs(viewGroup, fsVar, (Integer) viewGroup.getTag(520093766), this.zn);
            } catch (Exception e) {
                ApmHelper.reportCustomError("onGlobalLayout exception " + this.fs.getTag(520093765), "ViewUtils", e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void fs(View view, fs fsVar, Integer num, boolean z) {
        if (fsVar == null) {
            return;
        }
        if (num == null) {
            num = 0;
        }
        fsVar.zmn(view, zmn(view, num.intValue(), z));
    }

    private static boolean zmn(View view, int i, boolean z) {
        return com.bytedance.sdk.openadsdk.core.hgd.zmn(view, 20, i, z);
    }

    public static ArrayList<View> zmn(View view, int i) {
        ArrayList<View> arrayList = new ArrayList<>();
        if (view != null && i > 0) {
            Object parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) parent;
                for (int indexOfChild = viewGroup.indexOfChild(view) + 1; indexOfChild < viewGroup.getChildCount(); indexOfChild++) {
                    arrayList.add(viewGroup.getChildAt(indexOfChild));
                }
            }
            if (i > 1 && parent != null) {
                arrayList.addAll(zmn((View) parent, i - 1));
            }
        }
        return arrayList;
    }

    public static View zmn(View view, Class<? extends View> cls) {
        Object parent;
        if (view == null || cls == null || (parent = view.getParent()) == null) {
            return null;
        }
        if (cls.isInstance(parent)) {
            return (View) parent;
        }
        return zmn((View) parent, cls);
    }
}
