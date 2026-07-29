package com.facebook.login.widget;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import com.facebook.login.b;
import com.facebook.login.d;
import com.facebook.login.f;
import com.facebook.login.widget.LoginButton;

/* loaded from: classes.dex */
public class DeviceLoginButton extends LoginButton {

    /* renamed from: a, reason: collision with root package name */
    private Uri f6278a;

    public DeviceLoginButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public DeviceLoginButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setDeviceRedirectUri(Uri uri) {
        this.f6278a = uri;
    }

    public Uri getDeviceRedirectUri() {
        return this.f6278a;
    }

    @Override // com.facebook.login.widget.LoginButton
    protected LoginButton.b getNewLoginClickListener() {
        return new a();
    }

    private class a extends LoginButton.b {
        private a() {
            super();
        }

        @Override // com.facebook.login.widget.LoginButton.b
        protected f a() {
            b a2 = b.a();
            a2.a(DeviceLoginButton.this.getDefaultAudience());
            a2.a(d.DEVICE_AUTH);
            a2.a(DeviceLoginButton.this.getDeviceRedirectUri());
            return a2;
        }
    }
}
