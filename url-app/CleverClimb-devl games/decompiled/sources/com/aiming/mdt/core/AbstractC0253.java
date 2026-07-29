package com.aiming.mdt.core;

import android.app.Activity;
import android.os.Looper;
import com.aiming.mdt.a.C0049;
import com.aiming.mdt.a.C0076;
import com.aiming.mdt.a.C0088;
import com.aiming.mdt.a.C0144;
import com.aiming.mdt.a.C0177;
import com.aiming.mdt.a.C0193;
import com.aiming.mdt.adt.C0226;
import com.aiming.mdt.mediation.CallbackManager;
import com.aiming.mdt.utils.C0279;
import com.aiming.mdt.utils.C0282;
import com.aiming.mdt.utils.C0285;
import com.aiming.mdt.utils.C0290;
import java.lang.ref.WeakReference;

/* renamed from: com.aiming.mdt.core.ʻʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC0253 extends AbstractC0256 {

    /* renamed from: ʻʼʽʾ, reason: contains not printable characters */
    private C0285.HandlerC0287 f774;

    /* renamed from: ʻʽʾ, reason: contains not printable characters */
    private int f775;

    /* renamed from: ʼʾ, reason: contains not printable characters */
    protected C0088 f776;

    /* renamed from: com.aiming.mdt.core.ʻʾ$ʻ, reason: contains not printable characters */
    class RunnableC0254 implements Runnable {

        /* renamed from: ʻʽ, reason: contains not printable characters */
        private int f778;

        RunnableC0254(int i) {
            this.f778 = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            StringBuilder sb = new StringBuilder("timeout startNextInstance : ");
            sb.append(this.f778);
            C0282.m971(sb.toString());
            AbstractC0253.this.m873(this.f778);
        }
    }

    public AbstractC0253(Activity activity, String str) {
        super(activity, str);
        this.f774 = new C0285.HandlerC0287(null, Looper.getMainLooper());
        CallbackManager.getInstance().addCallback(str, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ʻʽ, reason: contains not printable characters */
    public void m873(int i) {
        if (this.f784 == null) {
            return;
        }
        this.f775 = i;
        if (m876(true)) {
            StringBuilder sb = new StringBuilder("Ad is prepared for : ");
            sb.append(this.f782);
            sb.append(" callbackIndex is : ");
            sb.append(this.f775);
            C0282.m971(sb.toString());
            return;
        }
        try {
            if (this.f789 > 0 && this.f784.length > i) {
                int i2 = this.f789;
                while (!m897() && this.f784.length > i && i2 > 0) {
                    C0088 c0088 = this.f784[i];
                    i++;
                    i2--;
                    if (c0088 != null) {
                        m874(c0088);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(this.f782);
                        sb2.append(c0088.m304());
                        if (C0279.m948(sb2.toString(), c0088)) {
                            m882(c0088, "No Fill");
                        } else {
                            try {
                                mo69(c0088);
                            } catch (Throwable th) {
                                m882(c0088, th.getMessage());
                                StringBuilder sb3 = new StringBuilder("load ins : ");
                                sb3.append(c0088.toString());
                                sb3.append(" error ");
                                C0282.m972(sb3.toString(), th);
                                C0076.m232().m236(th);
                            }
                        }
                    }
                }
                if (m897()) {
                    return;
                }
                this.f774.postDelayed(new RunnableC0254(i), this.f781 * 1000);
                return;
            }
            m893("No Fill");
        } catch (Exception e) {
            C0282.m972("startNextInstance error", e);
        }
    }

    /* renamed from: ʻʽʾ, reason: contains not printable characters */
    private synchronized void m874(C0088 c0088) {
        C0049.m149().m151(this.f782, c0088);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private synchronized boolean m876(boolean z) {
        try {
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("checkReadyInstancesOnUiThread error : ");
            sb.append(th.getMessage());
            C0282.m971(sb.toString());
            C0076.m232().m236(th);
        }
        if (this.f784 == null) {
            return false;
        }
        for (C0088 c0088 : this.f784) {
            if (c0088 != null) {
                StringBuilder sb2 = new StringBuilder("checkReadyInstance index : ");
                sb2.append(c0088.m309());
                sb2.append(" callbackIndex : ");
                sb2.append(this.f775);
                C0282.m973("Ad", sb2.toString());
                if (c0088.m309() > this.f775) {
                    break;
                }
                if (mo76(c0088)) {
                    if (z) {
                        m899(c0088);
                    }
                    m877(c0088);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: ʼʾ, reason: contains not printable characters */
    private synchronized void m877(C0088 c0088) {
        if (this.f784 == null) {
            return;
        }
        if (this.f785 == null) {
            this.f785 = c0088;
            mo140(this.f785);
            m900();
            m901();
            if (this.f774 != null) {
                this.f774.removeCallbacksAndMessages(null);
            }
            return;
        }
        if (this.f785.m309() > c0088.m309()) {
            if (mo67() != 1 && mo67() != 0) {
                this.f785 = c0088;
                mo140(this.f785);
            }
        }
    }

    /* renamed from: ʽʾ, reason: contains not printable characters */
    private synchronized void m878(C0088 c0088) {
        C0049.m149().m156(this.f782, c0088);
    }

    @Override // com.aiming.mdt.mediation.Callback
    protected void onInsClose(String str, String str2, boolean z) {
        super.onInsClose(str, str2, z);
        StringBuilder sb = new StringBuilder("onInsClose : ");
        sb.append(str);
        C0282.m971(sb.toString());
        if (mo67() == 2 || mo67() == 4) {
            C0193.m726().m728();
        }
        m904();
        m890(z);
    }

    @Override // com.aiming.mdt.mediation.Callback
    protected synchronized void onInsError(String str, String str2, String str3) {
        super.onInsError(str, str2, str3);
        C0088 c0088 = m891(str, str2);
        if (c0088 == null) {
            return;
        }
        m882(c0088, str3);
    }

    @Override // com.aiming.mdt.mediation.Callback
    protected synchronized void onInsReady(String str, String str2, Object obj) {
        super.onInsReady(str, str2, obj);
        C0088 c0088 = m891(str, str2);
        if (c0088 == null) {
            return;
        }
        m879(true, c0088, obj);
    }

    @Override // com.aiming.mdt.mediation.Callback
    protected void onInstanceClick(String str, String str2) {
        StringBuilder sb = new StringBuilder("onInstanceClick : ");
        sb.append(str);
        C0282.m971(sb.toString());
        C0088 c0088 = m891(str, str2);
        if (c0088 == null) {
            return;
        }
        m902(c0088);
        m903();
    }

    /* renamed from: ʻʼʽ */
    protected abstract void mo69(C0088 c0088);

    /* renamed from: ʻʽ, reason: contains not printable characters */
    protected final synchronized void m879(boolean z, C0088 c0088, Object obj) {
        try {
            if (z) {
                C0282.m971("do ins ready report");
                m892(c0088);
                if (c0088 != null && c0088.m308() != 0) {
                    C0144.m546(this.f782, c0088.m311(), 1, "", (int) (System.currentTimeMillis() - c0088.m308()), this.f781, this.f789, c0088.m309(), c0088.m313());
                }
            } else {
                C0282.m971("do ins useless report");
            }
            c0088.m297(obj);
            C0049.m149().m152(this.f782, c0088);
            if (!this.f786 && c0088.m309() > this.f775) {
                m876(false);
                if (mo67() != 2 || mo67() == 4) {
                    C0226.m829();
                    C0177.m676(c0088.m313(), this.f782, c0088.m311(), obj, new C0245(this, c0088));
                }
            }
            m877(c0088);
            if (mo67() != 2) {
            }
            C0226.m829();
            C0177.m676(c0088.m313(), this.f782, c0088.m311(), obj, new C0245(this, c0088));
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: ʻʾ */
    protected void mo72(C0088 c0088) {
    }

    /* renamed from: ʻʿ, reason: contains not printable characters */
    protected final C0088 m880() {
        if (this.f784 == null) {
            return null;
        }
        boolean z = true;
        for (C0088 c0088 : this.f784) {
            if (c0088 != null) {
                if (mo76(c0088)) {
                    return c0088;
                }
                z = false;
            }
        }
        if (z) {
        }
        return null;
    }

    @Override // com.aiming.mdt.core.AbstractC0256
    /* renamed from: ʼ, reason: contains not printable characters */
    protected final void mo881() {
        this.f775 = 0;
        m873(0);
    }

    /* renamed from: ʼ */
    protected void mo139(Activity activity) {
        if (this.f788 == null || this.f788.get() == null || !C0290.m984(this.f788.get())) {
            this.f788 = new WeakReference<>(activity);
        }
    }

    @Override // com.aiming.mdt.core.AbstractC0256
    /* renamed from: ʼʽ */
    public void mo73() {
        CallbackManager.getInstance().removeCallback(this.f782);
        super.mo73();
    }

    /* renamed from: ʼʽ */
    protected void mo140(C0088 c0088) {
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    protected final synchronized void m882(C0088 c0088, String str) {
        if (this.f776 != null) {
            return;
        }
        if (c0088 == null) {
            return;
        }
        m878(c0088);
        if (c0088 != null && c0088.m308() != 0) {
            C0144.m546(this.f782, c0088.m311(), 2, str, (int) (System.currentTimeMillis() - c0088.m308()), this.f781, this.f789, c0088.m309(), c0088.m313());
        }
        if (mo67() == 0) {
            mo72(c0088);
        }
        StringBuilder sb = new StringBuilder("load ins : ");
        sb.append(c0088.toString());
        sb.append(" error : ");
        sb.append(str);
        C0282.m971(sb.toString());
        int length = this.f784.length;
        int m307 = c0088.m307();
        boolean z = true;
        boolean z2 = true;
        for (int i = 0; i < length; i++) {
            C0088 c00882 = this.f784[i];
            if (c00882 == c0088) {
                this.f784[i] = null;
            }
            if (this.f784[i] != null) {
                if (c00882.m307() == m307) {
                    z = false;
                    z2 = false;
                } else {
                    z = false;
                }
            }
        }
        if (z && !m897()) {
            m893("No Fill");
            if (this.f774 != null) {
                this.f774.removeCallbacksAndMessages(null);
            }
        } else {
            if (z2) {
                if (this.f774 != null) {
                    this.f774.removeCallbacksAndMessages(null);
                }
                m873((m307 + 1) * this.f789);
                return;
            }
            if (c0088.m300()) {
                StringBuilder sb2 = new StringBuilder("first instance failed, add callbackIndex : ");
                sb2.append(c0088.toString());
                sb2.append(" error : ");
                sb2.append(str);
                C0282.m971(sb2.toString());
                this.f775 = (c0088.m309() + this.f789) - 1;
                m876(false);
            }
        }
    }

    /* renamed from: ʽʿ, reason: contains not printable characters */
    protected final void m883() {
        if (this.f784 == null) {
            return;
        }
        for (C0088 c0088 : this.f784) {
            if (c0088 != null && c0088 != this.f785) {
                mo72(c0088);
            }
        }
    }

    /* renamed from: ʾ */
    protected abstract boolean mo76(C0088 c0088);
}
