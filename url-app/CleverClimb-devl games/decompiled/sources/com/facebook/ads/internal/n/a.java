package com.facebook.ads.internal.n;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.q.a.v;
import com.facebook.ads.internal.view.t;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final float f5212a = v.f5438b;

    /* renamed from: b, reason: collision with root package name */
    private final h f5213b;

    /* renamed from: c, reason: collision with root package name */
    private final e f5214c;

    /* renamed from: d, reason: collision with root package name */
    private final RelativeLayout f5215d;
    private ArrayList<View> e;

    public a(Context context, e eVar, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, i iVar, h hVar) {
        this.f5215d = relativeLayout;
        this.f5215d.setBackgroundColor(hVar.b());
        this.f5213b = hVar;
        this.f5214c = eVar;
        this.f5215d.setLayoutParams(new RelativeLayout.LayoutParams(-1, Math.round(iVar.b() * f5212a)));
        t tVar = new t(context);
        tVar.setMinWidth(Math.round(f5212a * 280.0f));
        tVar.setMaxWidth(Math.round(f5212a * 375.0f));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13, -1);
        tVar.setLayoutParams(layoutParams);
        this.f5215d.addView(tVar);
        LinearLayout linearLayout = new LinearLayout(context);
        this.e = new ArrayList<>();
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        tVar.addView(linearLayout);
        switch (iVar) {
            case HEIGHT_400:
                a(linearLayout);
            case HEIGHT_300:
                a(linearLayout, relativeLayout3);
                break;
        }
        a(linearLayout, iVar);
        eVar.a(this.f5215d, this.e);
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) relativeLayout2.getLayoutParams();
        layoutParams2.addRule(11);
        layoutParams2.setMargins(Math.round(f5212a * 4.0f), Math.round(f5212a * 4.0f), Math.round(f5212a * 4.0f), Math.round(f5212a * 4.0f));
        tVar.addView(relativeLayout2);
    }

    private void a(ViewGroup viewGroup) {
        com.facebook.ads.internal.view.component.h hVar = new com.facebook.ads.internal.view.component.h(this.f5215d.getContext(), this.f5214c, this.f5213b);
        hVar.setLayoutParams(new LinearLayout.LayoutParams(-1, Math.round(f5212a * 110.0f)));
        viewGroup.addView(hVar);
    }

    private void a(ViewGroup viewGroup, RelativeLayout relativeLayout) {
        RelativeLayout relativeLayout2 = new RelativeLayout(this.f5215d.getContext());
        relativeLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, Math.round(f5212a * 180.0f)));
        relativeLayout2.setBackgroundColor(this.f5213b.b());
        relativeLayout2.addView(relativeLayout);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, (int) (f5212a * 180.0f));
        layoutParams.addRule(13, -1);
        relativeLayout.setLayoutParams(layoutParams);
        viewGroup.addView(relativeLayout2);
        this.e.add(relativeLayout);
    }

    private void a(ViewGroup viewGroup, i iVar) {
        com.facebook.ads.internal.view.component.c cVar = new com.facebook.ads.internal.view.component.c(this.f5215d.getContext(), this.f5214c, this.f5213b, a(iVar), b(iVar));
        cVar.setLayoutParams(new LinearLayout.LayoutParams(-1, Math.round(b(iVar) * f5212a)));
        viewGroup.addView(cVar);
        this.e.add(cVar.getIconView());
        this.e.add(cVar.getCallToActionView());
    }

    private boolean a(i iVar) {
        return iVar == i.HEIGHT_300 || iVar == i.HEIGHT_120;
    }

    private int b(i iVar) {
        switch (iVar) {
            case HEIGHT_400:
                return (iVar.b() - 180) / 2;
            case HEIGHT_300:
                return iVar.b() - 180;
            case HEIGHT_100:
            case HEIGHT_120:
                return iVar.b();
            default:
                return 0;
        }
    }

    public void a() {
        this.f5214c.D();
    }
}
