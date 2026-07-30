package com.anythink.basead.ui.animplayerview;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import com.anythink.basead.j.e;
import com.anythink.basead.ui.GuideToClickView;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import java.util.List;

/* loaded from: classes.dex */
public class GuideToClickAnimPlayerView extends BaseAnimPlayerView {

    /* renamed from: h, reason: collision with root package name */
    private GuideToClickView f10632h;

    public GuideToClickAnimPlayerView(Context context) {
        super(context);
    }

    @Override // com.anythink.basead.ui.animplayerview.BaseAnimPlayerView
    public final void a() {
    }

    @Override // com.anythink.basead.ui.animplayerview.BaseAnimPlayerView
    public final void b() {
    }

    @Override // com.anythink.basead.ui.animplayerview.BaseAnimPlayerView
    public final void c() {
    }

    @Override // com.anythink.basead.ui.animplayerview.BaseAnimPlayerView
    public final void d() {
    }

    @Override // com.anythink.basead.ui.animplayerview.BaseAnimPlayerView, com.anythink.basead.ui.animplayerview.BasePlayerView
    public void init(w wVar, x xVar, boolean z8, List<Bitmap> list, e eVar) {
        Bitmap bitmap;
        super.init(wVar, xVar, z8, list, eVar);
        Context applicationContext = getContext().getApplicationContext();
        g();
        GuideToClickView guideToClickView = new GuideToClickView(applicationContext);
        this.f10632h = guideToClickView;
        addView(guideToClickView, -1, -1);
        List<Bitmap> list2 = this.f10597d;
        if (list2 == null || list2.size() <= 0 || (bitmap = this.f10597d.get(0)) == null || bitmap.isRecycled()) {
            return;
        }
        this.f10632h.setFingerImageResource(bitmap);
    }

    public GuideToClickAnimPlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void a(Context context) {
        Bitmap bitmap;
        g();
        GuideToClickView guideToClickView = new GuideToClickView(context);
        this.f10632h = guideToClickView;
        addView(guideToClickView, -1, -1);
        List<Bitmap> list = this.f10597d;
        if (list == null || list.size() <= 0 || (bitmap = this.f10597d.get(0)) == null || bitmap.isRecycled()) {
            return;
        }
        this.f10632h.setFingerImageResource(bitmap);
    }

    public GuideToClickAnimPlayerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
