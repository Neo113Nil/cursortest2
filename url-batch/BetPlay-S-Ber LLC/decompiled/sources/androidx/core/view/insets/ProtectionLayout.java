package androidx.core.view.insets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.awerser.monnit.betplay.R;
import defpackage.ay;
import defpackage.cy;
import defpackage.h5;
import defpackage.h50;
import defpackage.ip;
import defpackage.o30;
import defpackage.o8;
import defpackage.q1;
import defpackage.zx;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public class ProtectionLayout extends FrameLayout {
    public static final Object h = new Object();
    public final ArrayList f;
    public cy g;

    public ProtectionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
        this.f = new ArrayList();
    }

    private h50 getOrInstallSystemBarStateMonitor() {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(R.id.tag_system_bar_state_monitor);
        if (tag instanceof h50) {
            return (h50) tag;
        }
        h50 h50Var = new h50(viewGroup);
        viewGroup.setTag(R.id.tag_system_bar_state_monitor, h50Var);
        return h50Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b3 A[LOOP:0: B:7:0x0028->B:21:0x00b3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00bc A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        int i;
        int i2;
        int i3;
        ArrayList arrayList = this.f;
        if (arrayList.isEmpty()) {
            b();
            return;
        }
        h50 orInstallSystemBarStateMonitor = getOrInstallSystemBarStateMonitor();
        b();
        this.g = new cy(orInstallSystemBarStateMonitor, arrayList);
        int childCount = getChildCount();
        int size = this.g.a.size();
        for (int i4 = 0; i4 < size; i4++) {
            ay ayVar = (ay) this.g.a.get(i4);
            Context context = getContext();
            int i5 = i4 + childCount;
            zx zxVar = ayVar.b;
            int i6 = ayVar.a;
            int i7 = -1;
            if (i6 != 1) {
                if (i6 == 2) {
                    i3 = zxVar.b;
                    i2 = 48;
                } else if (i6 == 4) {
                    i = zxVar.a;
                    i2 = 5;
                } else if (i6 != 8) {
                    o8.j(o30.e("Unexpected side: ", i6));
                    return;
                } else {
                    i3 = zxVar.b;
                    i2 = 80;
                }
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i7, i3, i2);
                ip ipVar = zxVar.c;
                layoutParams.leftMargin = ipVar.a;
                layoutParams.topMargin = ipVar.b;
                layoutParams.rightMargin = ipVar.c;
                layoutParams.bottomMargin = ipVar.d;
                View view = new View(context);
                view.setTag(h);
                view.setTranslationX(zxVar.f);
                view.setTranslationY(zxVar.g);
                view.setAlpha(zxVar.h);
                view.setVisibility(zxVar.d ? 0 : 8);
                view.setBackground(zxVar.e);
                h5 h5Var = new h5(layoutParams, view, 20);
                if (zxVar.i == null) {
                    o8.t("Trying to overwrite the existing callback. Did you send one protection to multiple ProtectionLayouts?");
                    return;
                } else {
                    zxVar.i = h5Var;
                    addView(view, i5, layoutParams);
                }
            } else {
                i = zxVar.a;
                i2 = 3;
            }
            i7 = i;
            i3 = -1;
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i7, i3, i2);
            ip ipVar2 = zxVar.c;
            layoutParams2.leftMargin = ipVar2.a;
            layoutParams2.topMargin = ipVar2.b;
            layoutParams2.rightMargin = ipVar2.c;
            layoutParams2.bottomMargin = ipVar2.d;
            View view2 = new View(context);
            view2.setTag(h);
            view2.setTranslationX(zxVar.f);
            view2.setTranslationY(zxVar.g);
            view2.setAlpha(zxVar.h);
            view2.setVisibility(zxVar.d ? 0 : 8);
            view2.setBackground(zxVar.e);
            h5 h5Var2 = new h5(layoutParams2, view2, 20);
            if (zxVar.i == null) {
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view != null && view.getTag() != h) {
            cy cyVar = this.g;
            int childCount = getChildCount() - (cyVar != null ? cyVar.a.size() : 0);
            if (i > childCount || i < 0) {
                i = childCount;
            }
        }
        super.addView(view, i, layoutParams);
    }

    public final void b() {
        cy cyVar;
        if (this.g != null) {
            removeViews(getChildCount() - this.g.a.size(), this.g.a.size());
            int size = this.g.a.size();
            int i = 0;
            while (true) {
                cyVar = this.g;
                if (i >= size) {
                    break;
                }
                ((ay) cyVar.a.get(i)).b.i = null;
                i++;
            }
            ArrayList arrayList = cyVar.a;
            if (!cyVar.f) {
                cyVar.f = true;
                cyVar.b.b.remove(cyVar);
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    ((ay) arrayList.get(size2)).e = null;
                }
                arrayList.clear();
            }
            this.g = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(R.id.tag_system_bar_state_monitor);
        if (tag instanceof h50) {
            h50 h50Var = (h50) tag;
            if (h50Var.b.isEmpty()) {
                h50Var.a.post(new q1(13, h50Var));
                viewGroup.setTag(R.id.tag_system_bar_state_monitor, null);
            }
        }
    }

    public void setProtections(List<ay> list) {
        ArrayList arrayList = this.f;
        arrayList.clear();
        arrayList.addAll(list);
        if (isAttachedToWindow()) {
            a();
            requestApplyInsets();
        }
    }
}
