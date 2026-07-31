package com.bytedance.sdk.openadsdk.core.mw.fs.btk;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.adsdk.ugeno.fb;
import com.bytedance.adsdk.ugeno.fs.zn;
import com.bytedance.adsdk.ugeno.yoga.fs.zn;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public class zmn extends FrameLayout {
    private fb fb;
    private final List<zn> fs;
    private final RecyclerView zmn;
    private final C0167zmn zn;

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    public zmn(@NonNull Context context) {
        super(context);
        this.fs = new CopyOnWriteArrayList();
        C0167zmn c0167zmn = new C0167zmn();
        this.zn = c0167zmn;
        RecyclerView recyclerView = new RecyclerView(context);
        this.zmn = recyclerView;
        addView(recyclerView);
        recyclerView.setAdapter(c0167zmn);
    }

    public void setOrientation(int i) {
        if (i == 1) {
            this.zmn.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        } else {
            this.zmn.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        fb fbVar = this.fb;
        if (fbVar != null) {
            int[] zmn = fbVar.zmn(i, i2);
            super.onMeasure(zmn[0], zmn[1]);
        } else {
            super.onMeasure(i, i2);
        }
        fb fbVar2 = this.fb;
        if (fbVar2 != null) {
            fbVar2.btk();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        fb fbVar = this.fb;
        if (fbVar != null) {
            fbVar.hhw();
        }
        super.onLayout(z, i, i2, i3, i4);
        fb fbVar2 = this.fb;
        if (fbVar2 != null) {
            fbVar2.zmn(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        fb fbVar = this.fb;
        if (fbVar != null) {
            fbVar.nps();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        fb fbVar = this.fb;
        if (fbVar != null) {
            fbVar.zg();
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        fb fbVar = this.fb;
        if (fbVar != null) {
            fbVar.fs(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    public void zmn(zn<View> znVar) {
        if (znVar == null) {
            return;
        }
        this.fs.add(znVar);
        C0167zmn c0167zmn = this.zn;
        if (c0167zmn != null) {
            c0167zmn.notifyDataSetChanged();
        }
    }

    public void zmn(fb fbVar) {
        this.fb = fbVar;
    }

    public void zmn(com.bytedance.sdk.openadsdk.core.mw.fs.btk.fs fsVar) {
        ViewGroup.LayoutParams layoutParams = this.zmn.getLayoutParams();
        layoutParams.width = fsVar.hgd();
        layoutParams.height = fsVar.nu();
        this.zmn.setLayoutParams(layoutParams);
    }

    private static class fs extends RecyclerView.ViewHolder {
        private final ViewGroup zmn;

        public fs(@NonNull View view) {
            super(view);
            this.zmn = (ViewGroup) view;
        }

        public void zmn(zn znVar) {
            View rc = znVar.rc();
            ViewParent parent = rc.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(rc);
            }
            this.zmn.removeAllViews();
            this.zmn.addView(rc, new zn.zmn(znVar.hgd(), znVar.nu()));
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.mw.fs.btk.zmn$zmn, reason: collision with other inner class name */
    private class C0167zmn extends RecyclerView.Adapter<fs> {
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            return i;
        }

        private C0167zmn() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
        public fs onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            com.bytedance.adsdk.ugeno.yoga.fs.zn znVar = new com.bytedance.adsdk.ugeno.yoga.fs.zn(viewGroup.getContext());
            com.bytedance.adsdk.ugeno.fs.zn znVar2 = (com.bytedance.adsdk.ugeno.fs.zn) zmn.this.fs.get(i);
            znVar.setLayoutParams(new ViewGroup.LayoutParams(znVar2.hgd(), znVar2.nu()));
            return new fs(znVar);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NonNull fs fsVar, int i) {
            fsVar.zmn((com.bytedance.adsdk.ugeno.fs.zn) zmn.this.fs.get(i));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return zmn.this.fs.size();
        }
    }
}
