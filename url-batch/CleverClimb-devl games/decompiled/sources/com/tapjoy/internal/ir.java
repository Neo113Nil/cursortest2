package com.tapjoy.internal;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.cmplay.policy.gdpr.DimenUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class ir extends RelativeLayout implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private boolean f8410a;

    /* renamed from: b, reason: collision with root package name */
    private float f8411b;

    /* renamed from: c, reason: collision with root package name */
    private View f8412c;

    /* renamed from: d, reason: collision with root package name */
    private View f8413d;
    private FrameLayout e;
    private ImageView f;
    private io g;
    private hv h;
    private a i;

    public interface a {
        void a();

        void a(ht htVar);

        void b();
    }

    public ir(Context context, hv hvVar, a aVar) {
        super(context);
        this.f8411b = 1.0f;
        this.h = hvVar;
        this.i = aVar;
        Context context2 = getContext();
        this.f8412c = new View(context2);
        boolean z = true;
        this.f8412c.setId(1);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(0, 0);
        layoutParams.addRule(13);
        addView(this.f8412c, layoutParams);
        this.f8413d = new View(context2);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(0, 0);
        layoutParams2.addRule(13);
        addView(this.f8413d, layoutParams2);
        this.e = new FrameLayout(context2);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(0, 0);
        layoutParams3.addRule(13);
        addView(this.e, layoutParams3);
        this.f = new ImageView(context2);
        this.f.setOnClickListener(this);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(0, 0);
        layoutParams4.addRule(7, this.f8412c.getId());
        layoutParams4.addRule(6, this.f8412c.getId());
        addView(this.f, layoutParams4);
        if (this.h.m != null) {
            hw hwVar = this.h.m;
            if (hwVar.f8335a == null || (hwVar.f8336b == null && hwVar.f8337c == null)) {
                z = false;
            }
            if (z) {
                this.g = new io(context2);
                this.g.setOnClickListener(this);
                RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(0, 0);
                layoutParams5.addRule(5, this.f8413d.getId());
                layoutParams5.addRule(8, this.f8413d.getId());
                addView(this.g, layoutParams5);
            }
        }
        this.f.setImageBitmap(hvVar.f8332c.f8342b);
        if (this.g == null || hvVar.m == null || hvVar.m.f8335a == null) {
            return;
        }
        this.g.setImageBitmap(hvVar.m.f8335a.f8342b);
    }

    public final void setLandscape(boolean z) {
        Bitmap bitmap;
        Bitmap bitmap2;
        ArrayList arrayList;
        this.f8410a = z;
        if (z) {
            bitmap = this.h.f8331b.f8342b;
            bitmap2 = this.h.f.f8342b;
            arrayList = this.h.j;
        } else {
            bitmap = this.h.f8330a.f8342b;
            bitmap2 = this.h.e.f8342b;
            arrayList = this.h.i;
        }
        ab.a(this.f8412c, new BitmapDrawable((Resources) null, bitmap));
        ab.a(this.f8413d, new BitmapDrawable((Resources) null, bitmap2));
        if (this.e.getChildCount() > 0) {
            this.e.removeAllViews();
        }
        Context context = getContext();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ht htVar = (ht) it.next();
            View view = new View(context);
            view.setTag(htVar);
            view.setOnClickListener(this);
            this.e.addView(view, new FrameLayout.LayoutParams(0, 0, 51));
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3;
        Point point;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (this.f8410a) {
            this.f8411b = Math.min(size / 480.0f, size2 / 320.0f);
        } else {
            this.f8411b = Math.min(size / 320.0f, size2 / 480.0f);
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f8412c.getLayoutParams();
        boolean z = this.f8410a;
        int i4 = DimenUtils.DENSITY_XHIGH;
        layoutParams.width = a(z ? 480 : DimenUtils.DENSITY_XHIGH);
        if (!this.f8410a) {
            i4 = 480;
        }
        layoutParams.height = a(i4);
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f8413d.getLayoutParams();
        layoutParams2.width = a(this.f8410a ? 448 : 290);
        layoutParams2.height = a(this.f8410a ? 290 : 448);
        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.e.getLayoutParams();
        layoutParams3.width = layoutParams2.width;
        layoutParams3.height = layoutParams2.height;
        for (View view : ac.a(this.e)) {
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) view.getLayoutParams();
            Rect rect = ((ht) view.getTag()).f8316a;
            layoutParams4.width = a(rect.width());
            layoutParams4.height = a(rect.height());
            layoutParams4.leftMargin = a(rect.left);
            layoutParams4.topMargin = a(rect.top);
        }
        int i5 = 0;
        int a2 = a(0);
        this.f.setPadding(a2, a2, a2, a2);
        RelativeLayout.LayoutParams layoutParams5 = (RelativeLayout.LayoutParams) this.f.getLayoutParams();
        layoutParams5.width = a(30);
        layoutParams5.height = layoutParams5.width;
        int i6 = -a2;
        layoutParams5.rightMargin = a(this.h.f8333d.x) + i6;
        layoutParams5.topMargin = i6 + a(this.h.f8333d.y);
        if (this.g != null) {
            int a3 = a(this.f8410a ? 16 : 15);
            int a4 = a(this.f8410a ? 15 : 16);
            this.g.setPadding(a2, a2, a2, a2);
            RelativeLayout.LayoutParams layoutParams6 = (RelativeLayout.LayoutParams) this.g.getLayoutParams();
            layoutParams6.width = a(26);
            layoutParams6.height = layoutParams6.width;
            if (this.h.m != null) {
                if (this.f8410a) {
                    hw hwVar = this.h.m;
                    if (hwVar.f8336b == null) {
                        point = hwVar.f8337c;
                    } else {
                        point = hwVar.f8336b;
                    }
                } else {
                    hw hwVar2 = this.h.m;
                    if (hwVar2.f8337c == null) {
                        point = hwVar2.f8336b;
                    } else {
                        point = hwVar2.f8337c;
                    }
                }
                if (point != null) {
                    i5 = point.x;
                    i3 = point.y;
                    layoutParams6.leftMargin = a3 + a(i5);
                    layoutParams6.topMargin = a4 + a(i3);
                }
            }
            i3 = 0;
            layoutParams6.leftMargin = a3 + a(i5);
            layoutParams6.topMargin = a4 + a(i3);
        }
        super.onMeasure(i, i2);
    }

    private int a(int i) {
        return (int) (i * this.f8411b);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.f) {
            this.i.a();
            return;
        }
        if (view != null && view == this.g) {
            io ioVar = this.g;
            ioVar.f8391a = !ioVar.f8391a;
            ioVar.a();
            ioVar.invalidate();
            this.i.b();
            return;
        }
        if (view.getTag() instanceof ht) {
            this.i.a((ht) view.getTag());
        }
    }
}
