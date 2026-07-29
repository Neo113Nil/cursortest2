package com.facebook.ads.internal.view.a;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.mopub.common.Constants;

@TargetApi(19)
/* loaded from: classes.dex */
public class e extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private TextView f5511a;

    /* renamed from: b, reason: collision with root package name */
    private TextView f5512b;

    /* renamed from: c, reason: collision with root package name */
    private Drawable f5513c;

    public e(Context context) {
        super(context);
        a();
    }

    private void a() {
        float f = getResources().getDisplayMetrics().density;
        setOrientation(1);
        this.f5511a = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        this.f5511a.setTextColor(-16777216);
        this.f5511a.setTextSize(2, 20.0f);
        this.f5511a.setEllipsize(TextUtils.TruncateAt.END);
        this.f5511a.setSingleLine(true);
        this.f5511a.setVisibility(8);
        addView(this.f5511a, layoutParams);
        this.f5512b = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        this.f5512b.setAlpha(0.5f);
        this.f5512b.setTextColor(-16777216);
        this.f5512b.setTextSize(2, 15.0f);
        this.f5512b.setCompoundDrawablePadding((int) (f * 5.0f));
        this.f5512b.setEllipsize(TextUtils.TruncateAt.END);
        this.f5512b.setSingleLine(true);
        this.f5512b.setVisibility(8);
        addView(this.f5512b, layoutParams2);
    }

    private Drawable getPadlockDrawable() {
        if (this.f5513c == null) {
            this.f5513c = com.facebook.ads.internal.q.b.c.a(getContext(), com.facebook.ads.internal.q.b.b.BROWSER_PADLOCK);
        }
        return this.f5513c;
    }

    public void setSubtitle(String str) {
        TextView textView;
        int i;
        if (TextUtils.isEmpty(str)) {
            this.f5512b.setText((CharSequence) null);
            textView = this.f5512b;
            i = 8;
        } else {
            Uri parse = Uri.parse(str);
            this.f5512b.setText(parse.getHost());
            this.f5512b.setCompoundDrawablesRelativeWithIntrinsicBounds(Constants.HTTPS.equals(parse.getScheme()) ? getPadlockDrawable() : null, (Drawable) null, (Drawable) null, (Drawable) null);
            textView = this.f5512b;
            i = 0;
        }
        textView.setVisibility(i);
    }

    public void setTitle(String str) {
        TextView textView;
        int i;
        if (TextUtils.isEmpty(str)) {
            this.f5511a.setText((CharSequence) null);
            textView = this.f5511a;
            i = 8;
        } else {
            this.f5511a.setText(str);
            textView = this.f5511a;
            i = 0;
        }
        textView.setVisibility(i);
    }
}
