package com.aiming.mdt.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.aiming.mdt.a.C0172;
import com.aiming.mdt.adt.C0239;
import com.aiming.mdt.adt.InterfaceC0231;
import com.aiming.mdt.adt.bean.AdBean;
import com.aiming.mdt.utils.C0282;
import com.aiming.mdt.utils.C0285;
import com.google.android.gms.games.GamesStatusCodes;
import java.io.BufferedInputStream;
import java.io.File;

/* renamed from: com.aiming.mdt.a.ʻʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
final class ViewOnAttachStateChangeListenerC0021 extends C0239 implements View.OnAttachStateChangeListener, View.OnClickListener, C0172.InterfaceC0174 {

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private InterfaceC0105 f2;

    /* renamed from: ʼʾ, reason: contains not printable characters */
    private RelativeLayout f3;

    /* renamed from: ʽ, reason: contains not printable characters */
    private AdBean f4;

    ViewOnAttachStateChangeListenerC0021(Context context, String str, RelativeLayout relativeLayout) {
        super(context, str, 0);
        this.f3 = relativeLayout;
        this.f3.addOnAttachStateChangeListener(this);
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    static /* synthetic */ void m6(ViewOnAttachStateChangeListenerC0021 viewOnAttachStateChangeListenerC0021) {
        if (((C0131) C0162.m619().m622("Config", C0131.class)).m492().get(viewOnAttachStateChangeListenerC0021.f753).m111() == 1) {
            C0086 c0086 = new C0086(viewOnAttachStateChangeListenerC0021.f755);
            viewOnAttachStateChangeListenerC0021.f3.addView(c0086);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) c0086.getLayoutParams();
            layoutParams.addRule(11);
            layoutParams.addRule(10);
            ((ViewGroup.LayoutParams) layoutParams).width = -2;
            ((ViewGroup.LayoutParams) layoutParams).height = -2;
            c0086.bringToFront();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0128.m478(this.f755, this.f4);
        C0042.m99(this.f755, this.f753, this.f4);
        m857();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        C0128.m477(this.f755, this.f753, this.f4, false);
        this.f752.m845();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    @Override // com.aiming.mdt.adt.C0239
    /* renamed from: ʻʽ, reason: contains not printable characters */
    protected final void mo11() {
        super.mo11();
        this.f4 = null;
        this.f3.removeAllViews();
    }

    @Override // com.aiming.mdt.a.C0172.InterfaceC0174
    /* renamed from: ʻʽ, reason: contains not printable characters */
    public final void mo12(C0052 c0052) {
        try {
            try {
                if (c0052.m164() == 200) {
                    BufferedInputStream mo517 = c0052.m163().mo517();
                    C0285.m979(new RunnableC0020(this, mo517 == null ? null : BitmapFactory.decodeStream(mo517)));
                } else {
                    m855("Ad resource is empty");
                }
                if (c0052 != null) {
                    try {
                        c0052.close();
                    } catch (Exception e) {
                        C0282.m972("IOUtil", e);
                        C0076.m232().m236(e);
                    }
                }
            } catch (Exception e2) {
                C0076.m232().m236(e2);
                C0282.m972("Adt-Banner", e2);
                m855(e2.getMessage());
                if (c0052 != null) {
                    try {
                        c0052.close();
                    } catch (Exception e3) {
                        C0282.m972("IOUtil", e3);
                        C0076.m232().m236(e3);
                    }
                }
            }
        } catch (Throwable th) {
            if (c0052 != null) {
                try {
                    c0052.close();
                } catch (Exception e4) {
                    C0282.m972("IOUtil", e4);
                    C0076.m232().m236(e4);
                }
            }
            throw th;
        }
    }

    @Override // com.aiming.mdt.adt.C0239
    /* renamed from: ʻʾ, reason: contains not printable characters */
    protected final void mo13() {
        super.mo13();
        if (this.f2 == null) {
            return;
        }
        this.f2.onAdReady(this.f3);
    }

    @Override // com.aiming.mdt.a.C0172.InterfaceC0174
    /* renamed from: ʼ, reason: contains not printable characters */
    public final void mo14(String str) {
        m855(str);
    }

    @Override // com.aiming.mdt.adt.C0239, com.aiming.mdt.adt.C0226.InterfaceC0227
    /* renamed from: ʽ, reason: contains not printable characters */
    public final void mo15(AdBean adBean) {
        super.mo15(adBean);
        if (adBean == null) {
            m855("No Fill");
            return;
        }
        this.f4 = adBean;
        try {
            String mainimgUrl = adBean.getMainimgUrl();
            if (TextUtils.isEmpty(mainimgUrl)) {
                m855("Ad resource is empty");
                return;
            }
            if (!C0139.m527(this.f755, mainimgUrl)) {
                C0026.m22().m672(mainimgUrl).m671(GamesStatusCodes.STATUS_ACHIEVEMENT_UNLOCK_FAILURE).m667(GamesStatusCodes.STATUS_MULTIPLAYER_ERROR_CREATION_NOT_ALLOWED).m664(this).m670(this.f755);
                return;
            }
            Bitmap bitmap = null;
            File m530 = C0139.m530(this.f755, mainimgUrl, null);
            if (m530 != null) {
                bitmap = BitmapFactory.decodeFile(m530.getAbsolutePath());
            }
            C0285.m979(new RunnableC0020(this, bitmap));
        } catch (Exception e) {
            m855(e.getMessage());
            C0076.m232().m236(e);
            C0282.m972("Adt-Banner", e);
        }
    }

    @Override // com.aiming.mdt.adt.C0239
    /* renamed from: ʽ, reason: contains not printable characters */
    protected final void mo16(InterfaceC0231 interfaceC0231) {
        super.mo16(interfaceC0231);
        this.f2 = (InterfaceC0105) interfaceC0231;
    }
}
