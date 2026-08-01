package com.bytedance.sdk.openadsdk.core.ugen.vG;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.adsdk.ugeno.core.IP;
import com.bytedance.adsdk.ugeno.core.Ju;
import com.bytedance.adsdk.ugeno.core.Wyp;
import com.bytedance.adsdk.ugeno.core.qh;
import com.bytedance.sdk.component.adexpress.Jd.sUS;
import com.bytedance.sdk.component.adexpress.dynamic.Jd;
import com.bytedance.sdk.component.adexpress.icD.so;
import com.bytedance.sdk.component.adexpress.icD.yiw;
import com.bytedance.sdk.component.utils.uc;
import com.bytedance.sdk.openadsdk.core.icD.vG;
import com.bytedance.sdk.openadsdk.core.mnm;
import com.bytedance.sdk.openadsdk.core.model.IP;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView;
import com.bytedance.sdk.openadsdk.utils.Pj;
import com.bytedance.sdk.openadsdk.utils.ae;
import io.ktor.http.LinkHeader;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import org.objectweb.asm.Opcodes;

/* compiled from: UGenRender.java */
/* loaded from: classes2.dex */
public class vG implements IP, Ju, Jd, com.bytedance.sdk.component.adexpress.icD.Jd<View> {
    private static float CvL = 0.0f;
    private static float Gp = 0.0f;
    private static long ZhG = 0;
    private static float dX = 0.0f;
    private static float dyT = 0.0f;
    protected static int qh = 24;
    private JSONObject IP;
    protected cR Jd;
    protected com.bytedance.adsdk.ugeno.component.icD Mxy;
    protected pvs NB;
    private long OT;
    private NativeExpressView ae;
    private so bNS;
    private float cR;
    protected Context icD;
    protected WeakReference<View> kj;
    private yiw mnm;
    private long ny;
    protected Wyp pvs;
    private float rCZ;
    protected FrameLayout sUS;
    private float uc;
    private final boolean vA;
    protected com.bytedance.adsdk.ugeno.component.icD<View> vG;
    protected com.bytedance.sdk.component.adexpress.icD.IP yiw;
    private float zM;
    protected boolean Wyp = true;
    public SparseArray<vG.pvs> Ju = new SparseArray<>();
    private String gA = "";
    private final com.bytedance.sdk.component.so.so jlb = new com.bytedance.sdk.component.so.so("ugen_render_template") { // from class: com.bytedance.sdk.openadsdk.core.ugen.vG.vG.1
        @Override // java.lang.Runnable
        public void run() {
            vG vGVar = vG.this;
            vGVar.IP = vGVar.NB.vG();
            if (vG.this.ae == null) {
                vG.this.gA = "expressview is null";
            } else {
                vG vGVar2 = vG.this;
                vGVar2.gA = vGVar2.ae.getUgenTemplateErrorReason();
            }
            com.bytedance.sdk.openadsdk.core.Ju.vG().post(vG.this.dx);
        }
    };
    private final Runnable dx = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ugen.vG.vG.2
        @Override // java.lang.Runnable
        public void run() {
            if (vG.this.mnm != null) {
                vG vGVar = vG.this;
                vGVar.icD(vGVar.mnm);
            }
        }
    };
    private boolean Pj = false;
    protected AtomicBoolean so = new AtomicBoolean(false);

    @Override // com.bytedance.sdk.component.adexpress.dynamic.Jd
    public void d_() {
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.Jd
    public void setTimeUpdate(int i) {
    }

    @Override // com.bytedance.sdk.component.adexpress.icD.Jd
    public int vG() {
        return 7;
    }

    static {
        if (mnm.pvs() != null) {
            qh = mnm.icD();
        }
    }

    public vG(Context context, cR cRVar, boolean z, pvs pvsVar, ViewGroup viewGroup) {
        this.icD = context;
        this.vA = z;
        this.pvs = new Wyp(context);
        this.Jd = cRVar;
        this.NB = pvsVar;
        this.sUS = new FrameLayout(context);
        if (viewGroup instanceof NativeExpressView) {
            this.ae = (NativeExpressView) viewGroup;
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.icD.Jd
    public void pvs(yiw yiwVar) {
        this.mnm = yiwVar;
        ae.icD(this.jlb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void icD(yiw yiwVar) {
        this.NB.ae().pvs();
        JSONObject Gp2 = this.NB.Gp();
        if (this.IP == null) {
            yiwVar.pvs(Opcodes.I2L, "ugen template is null real reason is " + this.gA);
            return;
        }
        if (Gp2 == null) {
            yiwVar.pvs(Opcodes.I2L, "ugen data is null");
            return;
        }
        this.pvs.pvs((Ju) this);
        this.pvs.pvs((IP) this);
        this.vG = this.pvs.pvs(this.IP);
        this.NB.ae().icD();
        this.NB.ae().vG();
        this.pvs.icD(Gp2);
        if (this.vG != null) {
            icD icd = new icD();
            this.yiw = icd;
            icd.pvs(true);
            this.yiw.pvs(vG());
            setSoundMute(this.vA);
            com.bytedance.adsdk.ugeno.component.icD<View> icD = this.vG.icD("video");
            this.Mxy = icD;
            if (icD != null && (icD instanceof com.bytedance.sdk.openadsdk.core.ugen.component.video.pvs)) {
                ((icD) this.yiw).pvs((FrameLayout) ((com.bytedance.sdk.openadsdk.core.ugen.component.video.pvs) icD).zM());
            }
            com.bytedance.adsdk.ugeno.component.icD<View> icD2 = this.vG.icD("feedback");
            if (icD2 != null && icD2.Mxy() != null) {
                this.kj = new WeakReference<>(icD2.Mxy());
            }
            this.sUS.addView(this.vG.Mxy(), new FrameLayout.LayoutParams(this.vG.bNS(), this.vG.mnm()));
            float dX2 = this.NB.dX();
            float CvL2 = this.NB.CvL();
            float icD3 = Pj.icD(this.icD, dX2);
            float icD4 = Pj.icD(this.icD, CvL2);
            if (CvL2 <= 0.0f) {
                this.sUS.setLayoutParams(new FrameLayout.LayoutParams((int) icD3, -2));
            } else {
                this.sUS.setLayoutParams(new FrameLayout.LayoutParams((int) icD3, (int) icD4));
            }
            if (CvL2 <= 0.0f || dX2 <= 0.0f) {
                this.sUS.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                int vG = Pj.vG(this.icD, this.sUS.getMeasuredWidth());
                int vG2 = Pj.vG(this.icD, this.sUS.getMeasuredHeight());
                this.yiw.pvs(vG);
                this.yiw.icD(vG2);
            } else {
                this.yiw.pvs(dX2);
                this.yiw.icD(CvL2);
            }
            if (this.so.get()) {
                yiwVar.pvs(Opcodes.L2F, "ugen render timeout");
                return;
            } else {
                yiwVar.pvs(this.sUS, this.yiw);
                return;
            }
        }
        yiwVar.pvs(Opcodes.L2D, "ugen render error");
    }

    public void pvs(boolean z) {
        this.so.set(z);
    }

    public void pvs(so soVar) {
        this.bNS = soVar;
    }

    @Override // com.bytedance.adsdk.ugeno.core.Ju
    public void pvs(qh qhVar, Ju.icD icd, Ju.pvs pvsVar) {
        if (qhVar == null) {
            return;
        }
        if (qhVar.icD() == 1 || qhVar.icD() == 4) {
            pvs(qhVar);
        }
        if (qhVar.icD() == 10) {
            pvs(qhVar.vG());
        }
        if (icd == null || qhVar.Jd() == null) {
            return;
        }
        icd.pvs(qhVar.Jd());
    }

    private void pvs(JSONObject jSONObject) {
        com.bytedance.adsdk.ugeno.component.icD<View> icD;
        if (jSONObject == null) {
            return;
        }
        String optString = jSONObject.optString(LinkHeader.Parameters.Type);
        String optString2 = jSONObject.optString("nodeId");
        if (TextUtils.isEmpty(optString2) || (icD = this.vG.icD(optString2)) == null) {
            return;
        }
        if (TextUtils.equals(optString, "onShow")) {
            icD.icD(0);
        } else if (TextUtils.equals(optString, "onDismiss")) {
            icD.icD(8);
        }
    }

    private void pvs(qh qhVar) {
        int i;
        if (this.bNS == null) {
            return;
        }
        String optString = qhVar.vG().optString(LinkHeader.Parameters.Type);
        optString.hashCode();
        i = 5;
        switch (optString) {
            case "privacy":
                i = 7;
                break;
            case "feedback":
                i = 3;
                break;
            case "mute":
                break;
            case "skip":
                i = 6;
                break;
            case "video":
                i = 4;
                break;
            case "creative":
                i = 2;
                break;
            default:
                i = 0;
                break;
        }
        com.bytedance.adsdk.ugeno.component.icD pvs = qhVar.pvs();
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        WeakReference<View> weakReference = this.kj;
        if (weakReference != null) {
            int[] pvs2 = Pj.pvs(weakReference.get());
            if (pvs2 != null) {
                iArr = pvs2;
            }
            int[] vG = Pj.vG(this.kj.get());
            if (vG != null) {
                iArr2 = vG;
            }
        }
        this.bNS.pvs(qhVar.pvs().Mxy(), i, new IP.pvs().Jd(this.cR).vG(this.zM).icD(this.uc).pvs(this.rCZ).icD(this.OT).pvs(this.ny).vG(iArr[0]).Jd(iArr[1]).NB(iArr2[0]).sUS(iArr2[1]).pvs(this.Ju).pvs(this.Wyp).pvs(pvs == null ? "" : pvs.IP() + "_" + pvs.Ju()).pvs());
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0058, code lost:
    
        if (com.bytedance.sdk.openadsdk.core.ugen.vG.vG.Gp <= r2) goto L16;
     */
    @Override // com.bytedance.adsdk.ugeno.core.IP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void pvs(com.bytedance.adsdk.ugeno.component.icD icd, MotionEvent motionEvent) {
        int i;
        int action = motionEvent.getAction();
        int i2 = 1;
        if (action == 0) {
            this.OT = System.currentTimeMillis();
            this.cR = motionEvent.getRawX();
            this.zM = motionEvent.getRawY();
            this.Wyp = true;
            ZhG = System.currentTimeMillis();
            com.bytedance.sdk.openadsdk.core.NB.vG.pvs(motionEvent);
            i = 0;
        } else {
            int i3 = -1;
            if (action != 1) {
                if (action == 2) {
                    CvL += Math.abs(motionEvent.getX() - dyT);
                    Gp += Math.abs(motionEvent.getY() - dX);
                    dyT = motionEvent.getX();
                    dX = motionEvent.getY();
                    if (System.currentTimeMillis() - ZhG > 200) {
                        float f = CvL;
                        int i4 = qh;
                        if (f <= i4) {
                        }
                        if (Math.abs(motionEvent.getRawX() - this.cR) < qh || Math.abs(motionEvent.getRawY() - this.zM) >= qh) {
                            this.Wyp = false;
                        }
                        i3 = i2;
                    }
                    i2 = 2;
                    if (Math.abs(motionEvent.getRawX() - this.cR) < qh) {
                    }
                    this.Wyp = false;
                    i3 = i2;
                }
                i = i3;
            }
            this.uc = motionEvent.getRawX();
            this.rCZ = motionEvent.getRawY();
            if (Math.abs(this.uc - this.cR) >= qh || Math.abs(this.rCZ - this.zM) >= qh) {
                this.Wyp = false;
            }
            this.ny = System.currentTimeMillis();
            i = i3;
        }
        this.Ju.put(motionEvent.getActionMasked(), new vG.pvs(i, motionEvent.getSize(), motionEvent.getPressure(), System.currentTimeMillis()));
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.Jd
    public void pvs(CharSequence charSequence, int i, int i2, boolean z) {
        if (this.vG == null) {
            return;
        }
        boolean z2 = i == 1;
        pvs(charSequence, z2, i2, z);
        icD(charSequence, z2, i2, z);
    }

    private void pvs(CharSequence charSequence, boolean z, int i, boolean z2) {
        int i2;
        com.bytedance.adsdk.ugeno.component.icD<View> icD = this.vG.icD("countdown");
        if (icD == null) {
            return;
        }
        View Mxy = icD.Mxy();
        if (Mxy instanceof TextView) {
            try {
                i2 = Integer.parseInt((String) charSequence);
            } catch (Exception unused) {
                com.bytedance.sdk.component.utils.Ju.pvs("UGenRender", "parse duration exception", charSequence);
                i2 = 0;
            }
            if (z2 || i2 <= 0 || this.Pj) {
                Mxy.setVisibility(8);
                return;
            }
            Mxy.setVisibility(0);
            if (!z && this.NB.pvs() && sUS.icD(this.NB.Jd())) {
                ((TextView) Mxy).setText(String.format(uc.pvs(com.bytedance.sdk.component.adexpress.Jd.pvs(), "tt_reward_full_skip"), Integer.valueOf(i)));
            } else if (!"open_ad".equals(this.NB.Jd()) && this.NB.pvs()) {
                this.Pj = true;
                Mxy.setVisibility(8);
            } else {
                ((TextView) Mxy).setText(((Object) charSequence) + "s");
            }
        }
    }

    private void icD(CharSequence charSequence, boolean z, int i, boolean z2) {
        View Mxy;
        com.bytedance.adsdk.ugeno.component.icD<View> icD = this.vG.icD("skip");
        if (icD == null || (Mxy = icD.Mxy()) == null) {
            return;
        }
        int i2 = 0;
        if (!z && !z2) {
            i2 = 8;
        }
        Mxy.setVisibility(i2);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.Jd
    public void setSoundMute(boolean z) {
        com.bytedance.adsdk.ugeno.component.icD<View> icD;
        com.bytedance.adsdk.ugeno.component.icD<View> icd = this.vG;
        if (icd == null || (icD = icd.icD("mute")) == null) {
            return;
        }
        if (z) {
            ((com.bytedance.adsdk.ugeno.component.image.icD) icD).NB("local://tt_reward_full_mute");
        } else {
            ((com.bytedance.adsdk.ugeno.component.image.icD) icD).NB("local://tt_reward_full_unmute");
        }
        icD.icD();
    }

    @Override // com.bytedance.sdk.component.adexpress.icD.Jd
    public View NB() {
        return this.sUS;
    }
}
