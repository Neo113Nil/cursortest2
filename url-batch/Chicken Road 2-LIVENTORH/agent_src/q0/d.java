package q0;

import a.j;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.emoji2.text.q;
import androidx.fragment.app.w0;
import com.oriondriftchasers.arordrft.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class d extends FrameLayout {

    /* renamed from: h, reason: collision with root package name */
    public static final Object f3059h = new Object();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f3060f;

    /* renamed from: g, reason: collision with root package name */
    public c f3061g;

    public d(Context context, List list) {
        super(context);
        this.f3060f = new ArrayList();
        setProtections(list);
    }

    private g getOrInstallSystemBarStateMonitor() {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(R.id.tag_system_bar_state_monitor);
        if (tag instanceof g) {
            return (g) tag;
        }
        g gVar = new g(viewGroup);
        viewGroup.setTag(R.id.tag_system_bar_state_monitor, gVar);
        return gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b0 A[LOOP:0: B:4:0x0023->B:18:0x00b0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b9 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        int i;
        int i4;
        int i5;
        ArrayList arrayList = this.f3060f;
        if (arrayList.isEmpty()) {
            return;
        }
        this.f3061g = new c(getOrInstallSystemBarStateMonitor(), arrayList);
        int childCount = getChildCount();
        int size = this.f3061g.f3054a.size();
        for (int i6 = 0; i6 < size; i6++) {
            a aVar = (a) this.f3061g.f3054a.get(i6);
            Context context = getContext();
            int i7 = i6 + childCount;
            b bVar = aVar.f3041b;
            int i8 = aVar.f3040a;
            int i9 = -1;
            if (i8 != 1) {
                if (i8 == 2) {
                    i5 = bVar.f3048b;
                    i4 = 48;
                } else if (i8 == 4) {
                    i = bVar.f3047a;
                    i4 = 5;
                } else {
                    if (i8 != 8) {
                        throw new IllegalArgumentException(w0.d("Unexpected side: ", i8));
                    }
                    i5 = bVar.f3048b;
                    i4 = 80;
                }
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i9, i5, i4);
                f0.c cVar = bVar.f3049c;
                layoutParams.leftMargin = cVar.f1266a;
                layoutParams.topMargin = cVar.f1267b;
                layoutParams.rightMargin = cVar.f1268c;
                layoutParams.bottomMargin = cVar.d;
                View view = new View(context);
                view.setTag(f3059h);
                view.setTranslationX(bVar.f3051f);
                view.setTranslationY(bVar.f3052g);
                view.setAlpha(bVar.f3053h);
                view.setVisibility(bVar.d ? 0 : 4);
                view.setBackground(bVar.f3050e);
                q qVar = new q(layoutParams, view, 15);
                if (bVar.i == null) {
                    throw new IllegalStateException("Trying to overwrite the existing callback. Did you send one protection to multiple ProtectionLayouts?");
                }
                bVar.i = qVar;
                addView(view, i7, layoutParams);
            } else {
                i = bVar.f3047a;
                i4 = 3;
            }
            i9 = i;
            i5 = -1;
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i9, i5, i4);
            f0.c cVar2 = bVar.f3049c;
            layoutParams2.leftMargin = cVar2.f1266a;
            layoutParams2.topMargin = cVar2.f1267b;
            layoutParams2.rightMargin = cVar2.f1268c;
            layoutParams2.bottomMargin = cVar2.d;
            View view2 = new View(context);
            view2.setTag(f3059h);
            view2.setTranslationX(bVar.f3051f);
            view2.setTranslationY(bVar.f3052g);
            view2.setAlpha(bVar.f3053h);
            view2.setVisibility(bVar.d ? 0 : 4);
            view2.setBackground(bVar.f3050e);
            q qVar2 = new q(layoutParams2, view2, 15);
            if (bVar.i == null) {
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view != null && view.getTag() != f3059h) {
            c cVar = this.f3061g;
            int childCount = getChildCount() - (cVar != null ? cVar.f3054a.size() : 0);
            if (i > childCount || i < 0) {
                i = childCount;
            }
        }
        super.addView(view, i, layoutParams);
    }

    public final void b() {
        if (this.f3061g != null) {
            removeViews(getChildCount() - this.f3061g.f3054a.size(), this.f3061g.f3054a.size());
            int size = this.f3061g.f3054a.size();
            for (int i = 0; i < size; i++) {
                ((a) this.f3061g.f3054a.get(i)).f3041b.i = null;
            }
            c cVar = this.f3061g;
            ArrayList arrayList = cVar.f3054a;
            if (!cVar.f3058f) {
                cVar.f3058f = true;
                cVar.f3055b.f3067b.remove(cVar);
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    ((a) arrayList.get(size2)).f3043e = null;
                }
                arrayList.clear();
            }
            this.f3061g = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f3061g != null) {
            b();
        }
        a();
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(R.id.tag_system_bar_state_monitor);
        if (tag instanceof g) {
            g gVar = (g) tag;
            if (gVar.f3067b.isEmpty()) {
                gVar.f3066a.post(new j(10, gVar));
                viewGroup.setTag(R.id.tag_system_bar_state_monitor, null);
            }
        }
    }

    public void setProtections(List<a> list) {
        ArrayList arrayList = this.f3060f;
        arrayList.clear();
        arrayList.addAll(list);
        if (isAttachedToWindow()) {
            b();
            a();
            requestApplyInsets();
        }
    }
}
