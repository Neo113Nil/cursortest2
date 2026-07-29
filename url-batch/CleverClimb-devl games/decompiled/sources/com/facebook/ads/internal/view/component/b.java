package com.facebook.ads.internal.view.component;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.ads.internal.view.p;
import com.facebook.ads.internal.view.r;

/* loaded from: classes.dex */
public class b extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private r f5590a;

    /* renamed from: b, reason: collision with root package name */
    private int f5591b;

    public b(Context context, com.facebook.ads.internal.n.e eVar, com.facebook.ads.internal.n.h hVar) {
        super(context);
        setOrientation(1);
        setVerticalGravity(16);
        this.f5590a = new r(getContext(), 2);
        this.f5590a.setMinTextSize(hVar.h() - 2);
        this.f5590a.setText(eVar.l());
        p.a(this.f5590a, hVar);
        this.f5590a.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        addView(this.f5590a);
        this.f5591b = eVar.l() != null ? Math.min(eVar.l().length(), 21) : 21;
        addView(p.a(context, eVar, hVar));
    }

    public int getMinVisibleTitleCharacters() {
        return this.f5591b;
    }

    public TextView getTitleTextView() {
        return this.f5590a;
    }
}
