package com.facebook.login.widget;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.AccessToken;
import com.facebook.Profile;
import com.facebook.R;
import com.facebook.d;
import com.facebook.g;
import com.facebook.internal.ab;
import com.facebook.internal.e;
import com.facebook.internal.u;
import com.facebook.l;
import com.facebook.login.f;
import com.facebook.login.widget.a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class LoginButton extends g {

    /* renamed from: a, reason: collision with root package name */
    private static final String f6280a = "com.facebook.login.widget.LoginButton";

    /* renamed from: b, reason: collision with root package name */
    private boolean f6281b;

    /* renamed from: c, reason: collision with root package name */
    private String f6282c;

    /* renamed from: d, reason: collision with root package name */
    private String f6283d;
    private a e;
    private String f;
    private boolean g;
    private a.b h;
    private c i;
    private long j;
    private com.facebook.login.widget.a k;
    private d l;
    private f m;

    public enum c {
        AUTOMATIC("automatic", 0),
        DISPLAY_ALWAYS("display_always", 1),
        NEVER_DISPLAY("never_display", 2);

        private String e;
        private int f;

        /* renamed from: d, reason: collision with root package name */
        public static c f6300d = AUTOMATIC;

        public static c a(int i) {
            for (c cVar : values()) {
                if (cVar.a() == i) {
                    return cVar;
                }
            }
            return null;
        }

        c(String str, int i) {
            this.e = str;
            this.f = i;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.e;
        }

        public int a() {
            return this.f;
        }
    }

    static class a {

        /* renamed from: a, reason: collision with root package name */
        private com.facebook.login.a f6290a = com.facebook.login.a.FRIENDS;

        /* renamed from: b, reason: collision with root package name */
        private List<String> f6291b = Collections.emptyList();

        /* renamed from: c, reason: collision with root package name */
        private u f6292c = null;

        /* renamed from: d, reason: collision with root package name */
        private com.facebook.login.d f6293d = com.facebook.login.d.NATIVE_WITH_FALLBACK;

        a() {
        }

        public void a(com.facebook.login.a aVar) {
            this.f6290a = aVar;
        }

        public com.facebook.login.a a() {
            return this.f6290a;
        }

        public void a(List<String> list) {
            if (u.PUBLISH.equals(this.f6292c)) {
                throw new UnsupportedOperationException("Cannot call setReadPermissions after setPublishPermissions has been called.");
            }
            this.f6291b = list;
            this.f6292c = u.READ;
        }

        public void b(List<String> list) {
            if (u.READ.equals(this.f6292c)) {
                throw new UnsupportedOperationException("Cannot call setPublishPermissions after setReadPermissions has been called.");
            }
            if (ab.a(list)) {
                throw new IllegalArgumentException("Permissions for publish actions cannot be null or empty.");
            }
            this.f6291b = list;
            this.f6292c = u.PUBLISH;
        }

        List<String> b() {
            return this.f6291b;
        }

        public void a(com.facebook.login.d dVar) {
            this.f6293d = dVar;
        }

        public com.facebook.login.d c() {
            return this.f6293d;
        }
    }

    public LoginButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0, "fb_login_button_create", "fb_login_button_did_tap");
        this.e = new a();
        this.f = "fb_login_view_usage";
        this.h = a.b.BLUE;
        this.j = 6000L;
    }

    public LoginButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0, "fb_login_button_create", "fb_login_button_did_tap");
        this.e = new a();
        this.f = "fb_login_view_usage";
        this.h = a.b.BLUE;
        this.j = 6000L;
    }

    public void setDefaultAudience(com.facebook.login.a aVar) {
        this.e.a(aVar);
    }

    public com.facebook.login.a getDefaultAudience() {
        return this.e.a();
    }

    public void setReadPermissions(List<String> list) {
        this.e.a(list);
    }

    public void setReadPermissions(String... strArr) {
        this.e.a(Arrays.asList(strArr));
    }

    public void setPublishPermissions(List<String> list) {
        this.e.b(list);
    }

    public void setPublishPermissions(String... strArr) {
        this.e.b(Arrays.asList(strArr));
    }

    public void setLoginBehavior(com.facebook.login.d dVar) {
        this.e.a(dVar);
    }

    public com.facebook.login.d getLoginBehavior() {
        return this.e.c();
    }

    public void setToolTipStyle(a.b bVar) {
        this.h = bVar;
    }

    public void setToolTipMode(c cVar) {
        this.i = cVar;
    }

    public c getToolTipMode() {
        return this.i;
    }

    public void setToolTipDisplayTime(long j) {
        this.j = j;
    }

    public long getToolTipDisplayTime() {
        return this.j;
    }

    public void a() {
        if (this.k != null) {
            this.k.b();
            this.k = null;
        }
    }

    @Override // com.facebook.g, android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.l == null || this.l.c()) {
            return;
        }
        this.l.a();
        c();
    }

    @Override // com.facebook.g, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.g || isInEditMode()) {
            return;
        }
        this.g = true;
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ab.b bVar) {
        if (bVar != null && bVar.c() && getVisibility() == 0) {
            b(bVar.b());
        }
    }

    private void b(String str) {
        this.k = new com.facebook.login.widget.a(str, this);
        this.k.a(this.h);
        this.k.a(this.j);
        this.k.a();
    }

    private void b() {
        switch (this.i) {
            case AUTOMATIC:
                final String a2 = ab.a(getContext());
                l.d().execute(new Runnable() { // from class: com.facebook.login.widget.LoginButton.1
                    @Override // java.lang.Runnable
                    public void run() {
                        final ab.b a3 = ab.a(a2, false);
                        LoginButton.this.getActivity().runOnUiThread(new Runnable() { // from class: com.facebook.login.widget.LoginButton.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                LoginButton.this.a(a3);
                            }
                        });
                    }
                });
                break;
            case DISPLAY_ALWAYS:
                b(getResources().getString(R.string.com_facebook_tooltip_default));
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        c();
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.l != null) {
            this.l.b();
        }
        a();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i != 0) {
            a();
        }
    }

    List<String> getPermissions() {
        return this.e.b();
    }

    void setProperties(a aVar) {
        this.e = aVar;
    }

    @Override // com.facebook.g
    protected void a(Context context, AttributeSet attributeSet, int i, int i2) {
        super.a(context, attributeSet, i, i2);
        setInternalOnClickListener(getNewLoginClickListener());
        b(context, attributeSet, i, i2);
        if (isInEditMode()) {
            setBackgroundColor(getResources().getColor(R.color.com_facebook_blue));
            this.f6282c = "Log in with Facebook";
        } else {
            this.l = new d() { // from class: com.facebook.login.widget.LoginButton.2
                @Override // com.facebook.d
                protected void a(AccessToken accessToken, AccessToken accessToken2) {
                    LoginButton.this.c();
                }
            };
        }
        c();
    }

    protected b getNewLoginClickListener() {
        return new b();
    }

    @Override // com.facebook.g
    protected int getDefaultStyleResource() {
        return R.style.com_facebook_loginview_default_style;
    }

    private void b(Context context, AttributeSet attributeSet, int i, int i2) {
        this.i = c.f6300d;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.com_facebook_login_view, i, i2);
        try {
            this.f6281b = obtainStyledAttributes.getBoolean(R.styleable.com_facebook_login_view_com_facebook_confirm_logout, true);
            this.f6282c = obtainStyledAttributes.getString(R.styleable.com_facebook_login_view_com_facebook_login_text);
            this.f6283d = obtainStyledAttributes.getString(R.styleable.com_facebook_login_view_com_facebook_logout_text);
            this.i = c.a(obtainStyledAttributes.getInt(R.styleable.com_facebook_login_view_com_facebook_tooltip_mode, c.f6300d.a()));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        Paint.FontMetrics fontMetrics = getPaint().getFontMetrics();
        int compoundPaddingTop = getCompoundPaddingTop() + ((int) Math.ceil(Math.abs(fontMetrics.top) + Math.abs(fontMetrics.bottom))) + getCompoundPaddingBottom();
        Resources resources = getResources();
        String str = this.f6282c;
        if (str == null) {
            str = resources.getString(R.string.com_facebook_loginview_log_in_button_long);
            int c2 = c(str);
            if (resolveSize(c2, i) < c2) {
                str = resources.getString(R.string.com_facebook_loginview_log_in_button);
            }
        }
        int c3 = c(str);
        String str2 = this.f6283d;
        if (str2 == null) {
            str2 = resources.getString(R.string.com_facebook_loginview_log_out_button);
        }
        setMeasuredDimension(resolveSize(Math.max(c3, c(str2)), i), compoundPaddingTop);
    }

    private int c(String str) {
        return getCompoundPaddingLeft() + getCompoundDrawablePadding() + a(str) + getCompoundPaddingRight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        Resources resources = getResources();
        if (!isInEditMode() && AccessToken.getCurrentAccessToken() != null) {
            setText(this.f6283d != null ? this.f6283d : resources.getString(R.string.com_facebook_loginview_log_out_button));
            return;
        }
        if (this.f6282c != null) {
            setText(this.f6282c);
            return;
        }
        String string = resources.getString(R.string.com_facebook_loginview_log_in_button_long);
        int width = getWidth();
        if (width != 0 && c(string) > width) {
            string = resources.getString(R.string.com_facebook_loginview_log_in_button);
        }
        setText(string);
    }

    @Override // com.facebook.g
    protected int getDefaultRequestCode() {
        return e.b.Login.a();
    }

    f getLoginManager() {
        if (this.m == null) {
            this.m = f.c();
        }
        return this.m;
    }

    void setLoginManager(f fVar) {
        this.m = fVar;
    }

    protected class b implements View.OnClickListener {
        protected b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LoginButton.this.a(view);
            AccessToken currentAccessToken = AccessToken.getCurrentAccessToken();
            if (currentAccessToken != null) {
                a(LoginButton.this.getContext());
            } else {
                b();
            }
            com.facebook.appevents.f c2 = com.facebook.appevents.f.c(LoginButton.this.getContext());
            Bundle bundle = new Bundle();
            bundle.putInt("logging_in", currentAccessToken != null ? 0 : 1);
            c2.a(LoginButton.this.f, (Double) null, bundle);
        }

        protected void b() {
            f a2 = a();
            if (u.PUBLISH.equals(LoginButton.this.e.f6292c)) {
                if (LoginButton.this.getFragment() != null) {
                    a2.b(LoginButton.this.getFragment(), LoginButton.this.e.f6291b);
                    return;
                } else if (LoginButton.this.getNativeFragment() != null) {
                    a2.b(LoginButton.this.getNativeFragment(), LoginButton.this.e.f6291b);
                    return;
                } else {
                    a2.b(LoginButton.this.getActivity(), LoginButton.this.e.f6291b);
                    return;
                }
            }
            if (LoginButton.this.getFragment() != null) {
                a2.a(LoginButton.this.getFragment(), LoginButton.this.e.f6291b);
            } else if (LoginButton.this.getNativeFragment() != null) {
                a2.a(LoginButton.this.getNativeFragment(), LoginButton.this.e.f6291b);
            } else {
                a2.a(LoginButton.this.getActivity(), LoginButton.this.e.f6291b);
            }
        }

        protected void a(Context context) {
            String string;
            final f a2 = a();
            if (LoginButton.this.f6281b) {
                String string2 = LoginButton.this.getResources().getString(R.string.com_facebook_loginview_log_out_action);
                String string3 = LoginButton.this.getResources().getString(R.string.com_facebook_loginview_cancel_action);
                Profile currentProfile = Profile.getCurrentProfile();
                if (currentProfile != null && currentProfile.getName() != null) {
                    string = String.format(LoginButton.this.getResources().getString(R.string.com_facebook_loginview_logged_in_as), currentProfile.getName());
                } else {
                    string = LoginButton.this.getResources().getString(R.string.com_facebook_loginview_logged_in_using_facebook);
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setMessage(string).setCancelable(true).setPositiveButton(string2, new DialogInterface.OnClickListener() { // from class: com.facebook.login.widget.LoginButton.b.1
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        a2.d();
                    }
                }).setNegativeButton(string3, (DialogInterface.OnClickListener) null);
                builder.create().show();
                return;
            }
            a2.d();
        }

        protected f a() {
            f c2 = f.c();
            c2.a(LoginButton.this.getDefaultAudience());
            c2.a(LoginButton.this.getLoginBehavior());
            return c2;
        }
    }
}
