package com.aiming.mdt.core;

import android.app.Activity;
import android.text.TextUtils;
import com.aiming.mdt.a.C0045;
import com.aiming.mdt.a.C0052;
import com.aiming.mdt.a.C0060;
import com.aiming.mdt.a.C0076;
import com.aiming.mdt.a.C0079;
import com.aiming.mdt.a.C0088;
import com.aiming.mdt.a.C0114;
import com.aiming.mdt.a.C0131;
import com.aiming.mdt.a.C0137;
import com.aiming.mdt.a.C0144;
import com.aiming.mdt.a.C0162;
import com.aiming.mdt.a.C0172;
import com.aiming.mdt.core.C0261;
import com.aiming.mdt.mediation.Callback;
import com.aiming.mdt.utils.C0279;
import com.aiming.mdt.utils.C0282;
import com.aiming.mdt.utils.C0285;
import com.aiming.mdt.utils.C0290;
import com.aiming.mdt.utils.Constants;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.aiming.mdt.core.ʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC0256 extends Callback implements com.aiming.mdt.Callback, C0172.InterfaceC0174 {

    /* renamed from: ʻ, reason: contains not printable characters */
    protected boolean f779 = false;

    /* renamed from: ʻʼ, reason: contains not printable characters */
    protected C0045 f780;

    /* renamed from: ʻʼʽ, reason: contains not printable characters */
    int f781;

    /* renamed from: ʻʽ, reason: contains not printable characters */
    protected String f782;

    /* renamed from: ʻʽʾ, reason: contains not printable characters */
    private long f783;

    /* renamed from: ʻʾ, reason: contains not printable characters */
    C0088[] f784;

    /* renamed from: ʼ, reason: contains not printable characters */
    protected volatile C0088 f785;

    /* renamed from: ʼʽ, reason: contains not printable characters */
    boolean f786;

    /* renamed from: ʼʾ, reason: contains not printable characters */
    private long f787;

    /* renamed from: ʽ, reason: contains not printable characters */
    protected WeakReference<Activity> f788;

    /* renamed from: ʾ, reason: contains not printable characters */
    int f789;

    AbstractC0256(Activity activity, String str) {
        this.f788 = new WeakReference<>(activity);
        this.f782 = str;
    }

    /* renamed from: ʻʿ, reason: contains not printable characters */
    private void m885() {
        if (this.f785 == null) {
            return;
        }
        StringBuilder sb = new StringBuilder("aUselessReport placementId is : ");
        sb.append(this.f782);
        sb.append(" instances : ");
        sb.append(this.f785.toString());
        C0282.m971(sb.toString());
        C0144.m545(this.f782, this.f785.m311(), this.f785.m313(), Constants.ALL_USELESS_REQUEST);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    static /* synthetic */ void m886(AbstractC0256 abstractC0256) {
        if (abstractC0256.f785 != null) {
            abstractC0256.f785 = null;
        }
        abstractC0256.f779 = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ʼʿ, reason: contains not printable characters */
    public void m887() {
        try {
            if (m888()) {
                this.f787 = System.currentTimeMillis();
                if (!mo71()) {
                    C0144.m547(mo66(), this);
                    return;
                }
                if (this.f784 == null) {
                    this.f784 = C0261.C0262.f799.m912(this.f782);
                }
                this.f785 = C0261.C0262.f799.m907(this.f782);
                if (this.f784 == null || this.f784.length <= 0 || this.f785 == null) {
                    C0144.m547(mo66(), this);
                    return;
                }
                if (!this.f779) {
                    this.f783 = System.currentTimeMillis();
                    C0285.m979(new RunnableC0248(this));
                }
                m885();
            }
        } catch (Exception e) {
            C0282.m972("load ad error", e);
            C0076.m232().m236(e);
        }
    }

    /* renamed from: ʽʿ, reason: contains not printable characters */
    private boolean m888() {
        if (TextUtils.isEmpty(this.f782)) {
            C0282.m971("placement id is empty");
            if (!this.f779) {
                this.f783 = System.currentTimeMillis();
                m904();
                C0285.m979(new RunnableC0244(this, "Placement id is empty"));
            }
            return false;
        }
        if (!m894()) {
            C0282.m971("load ad but activity is not available");
            if (!this.f779) {
                this.f783 = System.currentTimeMillis();
                m904();
                C0285.m979(new RunnableC0244(this, "Activity is null or destroyed"));
            }
            return false;
        }
        if (!C0079.m244(this.f788.get())) {
            C0282.m971("load ad network not available");
            if (!this.f779) {
                this.f783 = System.currentTimeMillis();
                m904();
                C0285.m979(new RunnableC0244(this, "Network is not available,please check network"));
            }
            return false;
        }
        if (this.f779) {
            C0282.m971("destroy method has been called , please re-init this ad format before loadAd");
            if (!this.f779) {
                this.f783 = System.currentTimeMillis();
                m904();
                C0285.m979(new RunnableC0244(this, "This ad object has been destroyed , please re-init it before load ad"));
            }
            return false;
        }
        if (this.f787 > this.f783) {
            if (!this.f779) {
                StringBuilder sb = new StringBuilder("invalidReport placementId is : ");
                sb.append(this.f782);
                sb.append(" instancesId : 0");
                sb.append(" mediation is : 0");
                C0282.m971(sb.toString());
                C0144.m545(this.f782, 0, 0, "8");
            }
            return false;
        }
        if (this.f780 == null) {
            C0131 c0131 = (C0131) C0162.m619().m622("Config", C0131.class);
            if (c0131 == null || c0131.m492().isEmpty()) {
                C0282.m971("config is empty");
                if (!this.f779) {
                    this.f783 = System.currentTimeMillis();
                    m904();
                    C0285.m979(new RunnableC0244(this, "Config is empty,please check the config on server"));
                }
                return false;
            }
            this.f780 = c0131.m492().get(this.f782);
            if (this.f780 == null) {
                StringBuilder sb2 = new StringBuilder("config has not have placement by : ");
                sb2.append(this.f782);
                C0282.m971(sb2.toString());
                if (!this.f779) {
                    this.f783 = System.currentTimeMillis();
                    m904();
                    C0285.m979(new RunnableC0244(this, "Config is not contain this placement"));
                }
                return false;
            }
            if (this.f780.m116() != mo67()) {
                C0282.m971("the placement type is not match the type which user requested");
                if (!this.f779) {
                    this.f783 = System.currentTimeMillis();
                    m904();
                    C0285.m979(new RunnableC0244(this, "Placement type match error"));
                }
                return false;
            }
        }
        if (!C0279.m951(this.f782, this.f780)) {
            return true;
        }
        StringBuilder sb3 = new StringBuilder("Placement :");
        sb3.append(this.f782);
        sb3.append(" is blocked");
        C0282.m971(sb3.toString());
        if (!this.f779) {
            this.f783 = System.currentTimeMillis();
            m904();
            C0285.m979(new RunnableC0244(this, "No Fill"));
        }
        return false;
    }

    protected void onAdRewarded() {
    }

    @Override // com.aiming.mdt.Callback
    public void onError(String str) {
        if (this.f779) {
            return;
        }
        this.f783 = System.currentTimeMillis();
        m904();
        C0285.m979(new RunnableC0244(this, str));
    }

    @Override // com.aiming.mdt.Callback
    public void onSuccess() {
        m887();
    }

    /* renamed from: ʻ */
    protected abstract C0137 mo66();

    /* renamed from: ʻ, reason: contains not printable characters */
    protected final void m889(C0088 c0088) {
        if (this.f779 || c0088 == null || c0088.m313() == 0) {
            return;
        }
        StringBuilder sb = new StringBuilder("insImpReport placementId is : ");
        sb.append(this.f782);
        sb.append(" instances : ");
        sb.append(c0088.toString());
        C0282.m971(sb.toString());
        C0144.m545(this.f782, c0088.m311(), c0088.m313(), Constants.IIMPR);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    final void m890(boolean z) {
        if (this.f779) {
            return;
        }
        C0285.m979(new RunnableC0243(this, z));
    }

    /* renamed from: ʻʼ */
    protected abstract int mo67();

    /* renamed from: ʻʼ, reason: contains not printable characters */
    protected final C0088 m891(String str, String str2) {
        if (this.f784 != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            for (C0088 c0088 : this.f784) {
                if (c0088 != null && TextUtils.equals(str, c0088.m304()) && TextUtils.equals(str2, String.valueOf(c0088.m311()))) {
                    return c0088;
                }
            }
        }
        return null;
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    final void m892(C0088 c0088) {
        if (this.f779 || c0088 == null || c0088.m313() == 0) {
            return;
        }
        StringBuilder sb = new StringBuilder("IReadyReport placementId is : ");
        sb.append(this.f782);
        sb.append(" instances : ");
        sb.append(c0088.toString());
        C0282.m971(sb.toString());
        C0144.m545(this.f782, c0088.m311(), c0088.m313(), "2");
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    protected final void m893(String str) {
        if (this.f779) {
            return;
        }
        this.f783 = System.currentTimeMillis();
        m904();
        C0285.m979(new RunnableC0244(this, str));
    }

    /* renamed from: ʻʼʽ */
    protected abstract void mo68();

    /* renamed from: ʻʼʽʾ, reason: contains not printable characters */
    protected final boolean m894() {
        if (this.f788 != null && this.f788.get() != null && C0290.m984(this.f788.get())) {
            return true;
        }
        Activity m429 = C0114.m427().m429();
        if (m429 == null) {
            return false;
        }
        this.f788 = new WeakReference<>(m429);
        return true;
    }

    /* renamed from: ʻʼʾ, reason: contains not printable characters */
    protected final void m895() {
        if (this.f779) {
            return;
        }
        C0285.m979(new RunnableC0259(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00b0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    @Override // com.aiming.mdt.a.C0172.InterfaceC0174
    /* renamed from: ʻʽ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo12(C0052 c0052) {
        try {
            if (c0052 != null) {
                try {
                    if (c0052.m164() == 200) {
                        JSONObject jSONObject = new JSONObject(c0052.m163().mo518());
                        this.f786 = jSONObject.optInt("fo", 0) == 1;
                        this.f781 = jSONObject.optInt("pt", 15);
                        this.f789 = jSONObject.optInt("bs");
                        if (this.f789 == 0) {
                            C0282.m973("Ad", "mBs==0 ,set default value 3 ");
                            this.f789 = 3;
                        }
                        C0088[] m192 = C0060.m192(jSONObject, this.f780, this.f789);
                        if (m192 != null && m192.length != 0) {
                            this.f784 = m192;
                            C0261.C0262.f799.m909(this.f782, (C0088[]) Arrays.copyOf(this.f784, this.f784.length));
                            StringBuilder sb = new StringBuilder("TotalIns is : ");
                            sb.append(Arrays.toString(this.f784));
                            C0282.m973("Ad", sb.toString());
                            if (!this.f779) {
                                C0285.m979(new RunnableC0257(this));
                            }
                            if (c0052 == null) {
                                try {
                                    c0052.close();
                                    return;
                                } catch (Exception e) {
                                    C0282.m972("IOUtil", e);
                                    C0076.m232().m236(e);
                                    return;
                                }
                            }
                            return;
                        }
                        C0282.m973("Ad", "request cl success, but ins[] is empty");
                        if (!this.f779) {
                            this.f783 = System.currentTimeMillis();
                            m904();
                            C0285.m979(new RunnableC0244(this, "No Fill"));
                        }
                        if (c0052 == null) {
                        }
                    }
                } catch (IOException | JSONException e2) {
                    StringBuilder sb2 = new StringBuilder("request cl success, but failed when parse response");
                    sb2.append(e2.getMessage());
                    C0282.m973("Ad", sb2.toString());
                    C0076.m232().m236(e2);
                    if (!this.f779) {
                        this.f783 = System.currentTimeMillis();
                        m904();
                        C0285.m979(new RunnableC0244(this, "No Fill"));
                    }
                    if (c0052 != null) {
                        try {
                            c0052.close();
                            return;
                        } catch (Exception e3) {
                            C0282.m972("IOUtil", e3);
                            C0076.m232().m236(e3);
                            return;
                        }
                    }
                    return;
                }
            }
            C0282.m973("Ad", "request cl success, but response is unavailable ");
            if (!this.f779) {
                this.f783 = System.currentTimeMillis();
                m904();
                C0285.m979(new RunnableC0244(this, "No Fill"));
            }
            if (c0052 != null) {
                try {
                    c0052.close();
                } catch (Exception e4) {
                    C0282.m972("IOUtil", e4);
                    C0076.m232().m236(e4);
                }
            }
        } catch (Throwable th) {
            if (c0052 != null) {
                try {
                    c0052.close();
                } catch (Exception e5) {
                    C0282.m972("IOUtil", e5);
                    C0076.m232().m236(e5);
                }
            }
            throw th;
        }
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    protected final void m896(C0088 c0088) {
        if (this.f779 || c0088 == null || c0088.m313() == 0) {
            return;
        }
        StringBuilder sb = new StringBuilder("ILoadReport placementId is : ");
        sb.append(this.f782);
        sb.append(" instances : ");
        sb.append(c0088.toString());
        C0282.m971(sb.toString());
        C0144.m545(this.f782, c0088.m311(), c0088.m313(), "1");
    }

    /* renamed from: ʻʽ */
    protected abstract void mo70(String str);

    /* renamed from: ʻʽ */
    public abstract boolean mo71();

    /* renamed from: ʻʽʾ, reason: contains not printable characters */
    final boolean m897() {
        return this.f787 <= this.f783;
    }

    /* renamed from: ʻʾ, reason: contains not printable characters */
    public final void m898() {
        if (C0249.m866()) {
            C0249.m872(this);
            return;
        }
        if (C0249.m861()) {
            m887();
            return;
        }
        C0282.m971("call sdk init before load ad");
        if (!m894()) {
            if (this.f779) {
                return;
            }
            this.f783 = System.currentTimeMillis();
            m904();
            C0285.m979(new RunnableC0244(this, "Activity is null or destroyed"));
            return;
        }
        if (!C0162.m619().m623("AppKey")) {
            if (this.f779) {
                return;
            }
            this.f783 = System.currentTimeMillis();
            m904();
            C0285.m979(new RunnableC0244(this, "Empty AppKey"));
            return;
        }
        String str = (String) C0162.m619().m622("AppKey", String.class);
        if (!TextUtils.isEmpty(str)) {
            C0249.m865(this.f788.get(), str, new C0263(this));
        } else {
            if (this.f779) {
                return;
            }
            this.f783 = System.currentTimeMillis();
            m904();
            C0285.m979(new RunnableC0244(this, "not init"));
        }
    }

    /* renamed from: ʼ */
    protected abstract void mo881();

    /* renamed from: ʼ, reason: contains not printable characters */
    protected final void m899(C0088 c0088) {
        if (this.f779 || c0088 == null || c0088.m313() == 0) {
            return;
        }
        StringBuilder sb = new StringBuilder("IUselessReport placementId is : ");
        sb.append(this.f782);
        sb.append(" instances : ");
        sb.append(c0088.toString());
        C0282.m971(sb.toString());
        C0144.m545(this.f782, c0088.m311(), c0088.m313(), Constants.INSTANCE_USELESS_REQUEST);
    }

    @Override // com.aiming.mdt.a.C0172.InterfaceC0174
    /* renamed from: ʼ */
    public final void mo14(String str) {
        StringBuilder sb = new StringBuilder("request cl failed : ");
        sb.append(str);
        C0282.m973("Ad", sb.toString());
        if (this.f779) {
            return;
        }
        this.f783 = System.currentTimeMillis();
        m904();
        C0285.m979(new RunnableC0244(this, "No Fill"));
    }

    /* renamed from: ʼʽ */
    public void mo73() {
        this.f780 = null;
        if (this.f788 != null) {
            this.f788.clear();
            this.f788 = null;
        }
        this.f779 = true;
    }

    /* renamed from: ʼʽʾ, reason: contains not printable characters */
    final void m900() {
        if (this.f779) {
            return;
        }
        if (mo67() == 3) {
            C0282.m971("interactive no need to AReadyReport");
            return;
        }
        StringBuilder sb = new StringBuilder("aReadyReport placementId is : ");
        sb.append(this.f782);
        sb.append(" instancesId : 0");
        sb.append(" mediation is : 0");
        C0282.m971(sb.toString());
        C0144.m545(this.f782, 0, 0, Constants.ALL_READY);
    }

    /* renamed from: ʼʾ, reason: contains not printable characters */
    final void m901() {
        if (this.f779) {
            return;
        }
        this.f783 = System.currentTimeMillis();
        C0285.m979(new RunnableC0248(this));
    }

    /* renamed from: ʽ */
    protected abstract void mo74();

    /* renamed from: ʽ, reason: contains not printable characters */
    final void m902(C0088 c0088) {
        if (this.f779 || c0088 == null || c0088.m313() == 0) {
            return;
        }
        StringBuilder sb = new StringBuilder("insClickReport placementId is : ");
        sb.append(this.f782);
        sb.append(" instances : ");
        sb.append(c0088.toString());
        C0282.m971(sb.toString());
        C0144.m545(this.f782, c0088.m311(), c0088.m313(), Constants.ICLICK);
    }

    /* renamed from: ʽ */
    protected abstract void mo75(boolean z);

    /* renamed from: ʽʾ, reason: contains not printable characters */
    final void m903() {
        if (this.f779) {
            return;
        }
        C0285.m979(new RunnableC0260(this));
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    protected final void m904() {
        C0261.C0262.f799.m908(this.f782);
        this.f784 = null;
        this.f789 = 0;
        this.f781 = 0;
        this.f786 = false;
        if (this.f785 != null) {
            this.f785.m297((Object) null);
            this.f785.m306(0L);
            this.f785 = null;
        }
    }
}
