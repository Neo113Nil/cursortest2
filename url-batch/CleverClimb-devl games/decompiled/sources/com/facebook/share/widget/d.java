package com.facebook.share.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.g;
import com.facebook.internal.i;
import com.facebook.l;
import com.facebook.share.a;
import com.facebook.share.model.ShareContent;

/* compiled from: ShareButtonBase.java */
/* loaded from: classes.dex */
public abstract class d extends g {

    /* renamed from: a, reason: collision with root package name */
    private ShareContent f6438a;

    /* renamed from: b, reason: collision with root package name */
    private int f6439b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f6440c;

    protected abstract i<ShareContent, a.C0363a> getDialog();

    protected d(Context context, AttributeSet attributeSet, int i, String str, String str2) {
        super(context, attributeSet, i, 0, str, str2);
        this.f6439b = 0;
        this.f6440c = false;
        this.f6439b = isInEditMode() ? 0 : getDefaultRequestCode();
        a(false);
    }

    public ShareContent getShareContent() {
        return this.f6438a;
    }

    public void setShareContent(ShareContent shareContent) {
        this.f6438a = shareContent;
        if (this.f6440c) {
            return;
        }
        a(a());
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f6440c = true;
    }

    @Override // com.facebook.g
    public int getRequestCode() {
        return this.f6439b;
    }

    protected void setRequestCode(int i) {
        if (l.b(i)) {
            throw new IllegalArgumentException("Request code " + i + " cannot be within the range reserved by the Facebook SDK.");
        }
        this.f6439b = i;
    }

    @Override // com.facebook.g
    protected void a(Context context, AttributeSet attributeSet, int i, int i2) {
        super.a(context, attributeSet, i, i2);
        setInternalOnClickListener(getShareOnClickListener());
    }

    protected boolean a() {
        return getDialog().a(getShareContent());
    }

    protected View.OnClickListener getShareOnClickListener() {
        return new View.OnClickListener() { // from class: com.facebook.share.widget.d.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                d.this.a(view);
                d.this.getDialog().b(d.this.getShareContent());
            }
        };
    }

    private void a(boolean z) {
        setEnabled(z);
        this.f6440c = false;
    }
}
