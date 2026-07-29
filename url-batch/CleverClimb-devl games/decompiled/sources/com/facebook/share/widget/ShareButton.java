package com.facebook.share.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.facebook.R;
import com.facebook.internal.e;
import com.facebook.internal.i;
import com.facebook.share.a;
import com.facebook.share.model.ShareContent;

/* loaded from: classes.dex */
public final class ShareButton extends d {
    public ShareButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, "fb_share_button_create", "fb_share_button_did_tap");
    }

    public ShareButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, "fb_share_button_create", "fb_share_button_did_tap");
    }

    @Override // com.facebook.g
    protected int getDefaultStyleResource() {
        return R.style.com_facebook_button_share;
    }

    @Override // com.facebook.g
    protected int getDefaultRequestCode() {
        return e.b.Share.a();
    }

    @Override // com.facebook.share.widget.d
    protected i<ShareContent, a.C0363a> getDialog() {
        if (getFragment() != null) {
            return new e(getFragment(), getRequestCode());
        }
        if (getNativeFragment() != null) {
            return new e(getNativeFragment(), getRequestCode());
        }
        return new e(getActivity(), getRequestCode());
    }
}
