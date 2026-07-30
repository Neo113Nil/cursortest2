package com.anythink.basead.ui;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.anythink.basead.b.e;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.y;
import com.anythink.core.common.v.q;
import com.anythink.expressad.foundation.h.k;

/* loaded from: classes.dex */
public class ShakeBorderThumbView extends BaseShakeView {

    /* renamed from: l, reason: collision with root package name */
    TextView f10419l;

    public ShakeBorderThumbView(Context context) {
        super(context);
    }

    @Override // com.anythink.basead.ui.BaseShakeView
    public void a() {
        setOrientation(0);
        setGravity(17);
        setClipToPadding(false);
        setBackgroundResource(q.a(t.b().g(), "myoffer_bg_shake_border_thumb", k.f19790c));
        LayoutInflater.from(getContext()).inflate(d(), (ViewGroup) this, true);
        int a9 = q.a(getContext(), 10.0f);
        int a10 = q.a(getContext(), 10.0f);
        int a11 = q.a(getContext(), 6.0f);
        setPadding(a9, a11, a10, a11);
        this.f10062a = (ImageView) findViewById(q.a(t.b().g(), "myoffer_splash_shake_border_img", "id"));
        this.f10419l = (TextView) findViewById(q.a(t.b().g(), "myoffer_splash_shake_hint_text", "id"));
    }

    public int d() {
        return q.a(getContext(), "myoffer_shake_border_thumb", "layout");
    }

    @Override // com.anythink.basead.ui.BaseShakeView
    public void setShakeSetting(y yVar, int i) {
        super.setShakeSetting(yVar, i);
        if (this.f10419l != null) {
            if (TextUtils.isEmpty(this.f10069h)) {
                this.f10419l.setText(e.a(getContext(), i));
            } else {
                this.f10419l.setText(this.f10069h);
            }
        }
    }

    public ShakeBorderThumbView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ShakeBorderThumbView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ShakeBorderThumbView(Context context, AttributeSet attributeSet, int i, int i4) {
        super(context, attributeSet, i, i4);
    }
}
