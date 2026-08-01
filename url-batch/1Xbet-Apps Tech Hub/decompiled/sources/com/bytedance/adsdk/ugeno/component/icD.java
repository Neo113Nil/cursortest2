package com.bytedance.adsdk.ugeno.component;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.component.pvs;
import com.bytedance.adsdk.ugeno.core.IAnimation;
import com.bytedance.adsdk.ugeno.core.IP;
import com.bytedance.adsdk.ugeno.core.Ju;
import com.bytedance.adsdk.ugeno.core.Mxy;
import com.bytedance.adsdk.ugeno.core.icD.Jd;
import com.bytedance.adsdk.ugeno.core.icD.NB;
import com.bytedance.adsdk.ugeno.core.kj;
import com.bytedance.adsdk.ugeno.core.mnm;
import com.bytedance.adsdk.ugeno.core.qh;
import com.bytedance.adsdk.ugeno.core.sUS;
import com.bytedance.adsdk.ugeno.core.so;
import com.bytedance.adsdk.ugeno.core.yiw;
import com.bytedance.adsdk.ugeno.icD.pvs;
import com.bytedance.adsdk.ugeno.pvs.vG;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.ktor.http.LinkHeader;
import io.ktor.util.date.GMTDateParser;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.text.Typography;
import org.json.JSONException;
import org.json.JSONObject;
import org.objectweb.asm.signature.SignatureVisitor;

/* compiled from: UGenWidget.java */
/* loaded from: classes.dex */
public abstract class icD<T extends View> implements Ju.icD, Ju.pvs, com.bytedance.adsdk.ugeno.icD {
    private JSONObject Ayu;
    private com.bytedance.adsdk.ugeno.core.pvs BSi;
    private boolean Ca;
    private pvs.C0036pvs CjQ;
    protected boolean CvL;
    private boolean Cwg;
    protected int Gp;
    private boolean HWd;
    protected float IP;
    protected JSONObject Jd;
    protected float Ju;
    protected Mxy Mxy;
    protected T NB;
    protected float OT;
    protected boolean OhP;
    private com.bytedance.adsdk.ugeno.core.icD.icD OyE;
    protected float Pj;
    protected Ju SE;
    private float Wby;
    protected String Wyp;
    private boolean Ye;
    protected boolean ZhG;
    private boolean Zm;
    private boolean ZsW;
    protected String ae;
    protected float bNS;
    private boolean cGU;
    protected float cR;
    protected float cRf;
    private NB cnN;
    protected boolean dX;
    protected float dx;
    protected boolean dyT;
    private String ea;
    private boolean elv;
    protected float gA;
    protected int gSd;
    protected Context icD;
    protected yiw jhZ;
    protected float jlb;
    private com.bytedance.adsdk.ugeno.core.icD.pvs joF;
    protected float kj;
    protected float mnm;
    private mnm neB;
    protected float ny;
    protected float od;
    private GradientDrawable pvs;
    protected int qD;
    private String qd;
    protected String qh;
    protected float rCZ;
    private boolean rW;
    protected float sP;
    protected pvs<ViewGroup> sUS;
    protected sUS.pvs so;
    protected Map<Integer, qh> sq;
    private float tCd;
    private boolean tQ;
    private so thO;
    protected float uc;
    protected float vA;
    protected JSONObject vG;
    protected IP yWX;
    protected pvs<ViewGroup> yiw;
    protected float zM;

    public T vG() {
        return null;
    }

    public icD(Context context) {
        this(context, null);
    }

    public icD(Context context, pvs<ViewGroup> pvsVar) {
        this.kj = -2.0f;
        this.Ju = -2.0f;
        this.qD = 0;
        this.OhP = true;
        this.Ye = true;
        this.tQ = false;
        this.elv = false;
        this.tCd = 1.0f;
        this.Wby = 12.0f;
        this.icD = context;
        this.sUS = pvsVar;
        this.sq = new HashMap();
        this.pvs = new GradientDrawable();
        this.NB = vG();
    }

    public T Mxy() {
        return this.NB;
    }

    public void pvs(JSONObject jSONObject) {
        JSONObject jSONObject2;
        this.Jd = jSONObject;
        JSONObject jSONObject3 = this.vG;
        if (jSONObject3 == null) {
            return;
        }
        Iterator<String> keys = jSONObject3.keys();
        pvs<ViewGroup> pvsVar = this.sUS;
        pvs.C0033pvs so = pvsVar instanceof pvs ? pvsVar.so() : null;
        while (keys.hasNext()) {
            String next = keys.next();
            String pvs = vG.pvs(this.vG.optString(next), jSONObject);
            pvs(next, pvs);
            if (so != null) {
                so.pvs(this.icD, next, pvs);
            }
        }
        if (so != null) {
            pvs(so.pvs());
        }
        JSONObject jSONObject4 = this.Ayu;
        if (jSONObject4 == null || (jSONObject2 = this.Jd) == null) {
            return;
        }
        try {
            jSONObject2.put("i18n", jSONObject4);
            Log.d("nxb", "id: " + this.Wyp + "; " + this.Ayu);
        } catch (JSONException unused) {
        }
    }

    public JSONObject Wyp() {
        return this.Jd;
    }

    public void icD() {
        final Jd jd;
        so();
        this.NB.setAlpha(this.tCd);
        this.NB.setPadding((int) (this.ZhG ? this.uc : this.zM), (int) (this.dX ? this.OT : this.zM), (int) (this.dyT ? this.rCZ : this.zM), (int) (this.CvL ? this.ny : this.zM));
        this.NB.setVisibility(this.qD);
        sUS.pvs pvsVar = this.so;
        if (pvsVar != null && TextUtils.isEmpty(pvsVar.icD())) {
            this.NB.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.adsdk.ugeno.component.icD.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (icD.this.jhZ != null) {
                        boolean unused = icD.this.Ye;
                    }
                }
            });
        } else if (pvs(1) && !this.rW) {
            this.NB.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.adsdk.ugeno.component.icD.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (icD.this.SE == null || !icD.this.Ye) {
                        return;
                    }
                    Ju ju = icD.this.SE;
                    qh qhVar = icD.this.sq.get(1);
                    icD icd = icD.this;
                    ju.pvs(qhVar, icd, icd);
                }
            });
        }
        final com.bytedance.adsdk.ugeno.core.icD.vG vGVar = null;
        if (this.SE == null || !pvs(4)) {
            jd = null;
        } else if (pvs(1)) {
            this.Cwg = true;
            jd = new Jd(this.icD, this.sq.get(4), this.sq.get(1), this.Cwg);
        } else {
            jd = new Jd(this.icD, this.sq.get(4), this.Cwg);
        }
        if (this.SE != null && pvs(1) && this.rW) {
            vGVar = new com.bytedance.adsdk.ugeno.core.icD.vG(this.icD, this.sq.get(1));
        }
        if (this.SE != null && pvs(3)) {
            this.joF = new com.bytedance.adsdk.ugeno.core.icD.pvs(this.icD);
            new Object() { // from class: com.bytedance.adsdk.ugeno.component.icD.3
            };
        }
        if (this.SE != null && pvs(9)) {
            NB nb = new NB(this.icD, this.sq.get(9), this);
            this.cnN = nb;
            nb.pvs(this.SE);
        }
        if (pvs(10)) {
            com.bytedance.adsdk.ugeno.core.icD.icD icd = new com.bytedance.adsdk.ugeno.core.icD.icD(this.icD, this.sq.get(10), this);
            this.OyE = icd;
            icd.pvs(this.SE);
        }
        this.NB.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.adsdk.ugeno.component.icD.4
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Jd jd2;
                com.bytedance.adsdk.ugeno.core.icD.vG vGVar2;
                if (icD.this.yWX != null) {
                    icD.this.yWX.pvs(icD.this, motionEvent);
                }
                if (icD.this.pvs(17) && motionEvent.getAction() == 0) {
                    Ju ju = icD.this.SE;
                    qh qhVar = icD.this.sq.get(17);
                    icD icd2 = icD.this;
                    ju.pvs(qhVar, icd2, icd2);
                }
                if (icD.this.pvs(1) && icD.this.rW && icD.this.SE != null && (vGVar2 = vGVar) != null) {
                    return vGVar2.pvs(icD.this.SE, icD.this, motionEvent);
                }
                if (icD.this.SE == null || (jd2 = jd) == null) {
                    return false;
                }
                return jd2.pvs(icD.this.SE, icD.this, motionEvent);
            }
        });
        pvs();
    }

    private void pvs() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.Wyp).append(":").append(this.qh).append(":");
        if (pvs(1)) {
            sb.append("1:");
            qh qhVar = this.sq.get(1);
            if (qhVar != null && qhVar.vG() != null) {
                sb.append(qhVar.vG().optString(LinkHeader.Parameters.Type));
            }
        } else {
            sb.append("0");
        }
        this.NB.setContentDescription(sb);
    }

    public void pvs(mnm mnmVar) {
        this.neB = mnmVar;
    }

    @Override // com.bytedance.adsdk.ugeno.icD
    public void sUS() {
        if (this.BSi != null) {
            so soVar = new so(this.NB, this.BSi);
            this.thO = soVar;
            soVar.pvs();
        }
        if (this.OyE != null && pvs(10)) {
            this.OyE.pvs();
        }
        if (this.cnN == null || !pvs(9)) {
            return;
        }
        this.cnN.pvs();
    }

    @Override // com.bytedance.adsdk.ugeno.icD
    public void yiw() {
        so soVar = this.thO;
        if (soVar != null) {
            soVar.icD();
        }
    }

    public boolean pvs(int i) {
        Map<Integer, qh> map = this.sq;
        return map != null && map.containsKey(Integer.valueOf(i));
    }

    public void icD(int i) {
        this.NB.setVisibility(i);
    }

    public void pvs(IP ip) {
        this.yWX = ip;
    }

    public void pvs(Ju ju) {
        this.SE = ju;
    }

    public void icD(JSONObject jSONObject) {
        this.vG = jSONObject;
    }

    public JSONObject qh() {
        return this.vG;
    }

    private void so() {
        if (TextUtils.isEmpty(this.ae)) {
            this.pvs.setShape(0);
            if (this.ZsW) {
                pvs.C0036pvs c0036pvs = this.CjQ;
                if (c0036pvs != null) {
                    this.pvs.setOrientation(c0036pvs.pvs);
                    if (Build.VERSION.SDK_INT >= 29) {
                        this.pvs.setColors(this.CjQ.icD, this.CjQ.vG);
                    } else {
                        this.pvs.setColors(this.CjQ.icD);
                    }
                }
            } else {
                this.pvs.setColor(this.Gp);
            }
            this.pvs.setCornerRadius(this.gA);
            this.pvs.setStroke((int) this.sP, this.gSd);
            this.NB.setBackground(this.pvs);
            return;
        }
        if (this.ae.startsWith("local://")) {
            String replace = this.ae.replace("local://", "");
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inPreferredConfig = Bitmap.Config.RGB_565;
                options.inPurgeable = true;
                options.inInputShareable = true;
                this.NB.setBackground(new BitmapDrawable(this.icD.getResources(), BitmapFactory.decodeStream(this.icD.getResources().openRawResource(com.bytedance.adsdk.ugeno.icD.Jd.icD(this.icD, replace)), null, options)));
            } catch (Throwable unused) {
            }
        }
    }

    public void pvs(ViewGroup.LayoutParams layoutParams) {
        T t = this.NB;
        if (t != null) {
            t.setLayoutParams(layoutParams);
        }
    }

    public void pvs(sUS.pvs pvsVar) {
        this.so = pvsVar;
    }

    public icD<T> icD(String str) {
        return pvs(str);
    }

    protected icD<T> pvs(String str) {
        if (TextUtils.isEmpty(this.Wyp) || !TextUtils.equals(this.Wyp, str)) {
            return null;
        }
        return this;
    }

    public pvs kj() {
        return this.sUS;
    }

    public void pvs(pvs pvsVar) {
        this.sUS = pvsVar;
    }

    public void vG(String str) {
        this.Wyp = str;
    }

    public String Ju() {
        return this.Wyp;
    }

    public void Jd(String str) {
        this.qh = str;
    }

    public String IP() {
        return this.qh;
    }

    public int bNS() {
        return (int) this.kj;
    }

    public int mnm() {
        return (int) this.Ju;
    }

    public void pvs(Mxy mxy) {
        this.Mxy = mxy;
    }

    public boolean vA() {
        return this.OhP;
    }

    public void pvs(yiw yiwVar) {
        this.jhZ = yiwVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void pvs(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1964681502:
                if (str.equals("clickable")) {
                    c = 0;
                    break;
                }
                break;
            case -1501175880:
                if (str.equals("paddingLeft")) {
                    c = 1;
                    break;
                }
                break;
            case -1351184668:
                if (str.equals("onDelay")) {
                    c = 2;
                    break;
                }
                break;
            case -1337252761:
                if (str.equals("onShake")) {
                    c = 3;
                    break;
                }
                break;
            case -1337126126:
                if (str.equals("onSlide")) {
                    c = 4;
                    break;
                }
                break;
            case -1336288090:
                if (str.equals("onTimer")) {
                    c = 5;
                    break;
                }
                break;
            case -1332194002:
                if (str.equals("background")) {
                    c = 6;
                    break;
                }
                break;
            case -1267206133:
                if (str.equals("opacity")) {
                    c = 7;
                    break;
                }
                break;
            case -1221029593:
                if (str.equals("height")) {
                    c = '\b';
                    break;
                }
                break;
            case -1081309778:
                if (str.equals("margin")) {
                    c = '\t';
                    break;
                }
                break;
            case -1055029545:
                if (str.equals("borderRightTopRadius")) {
                    c = '\n';
                    break;
                }
                break;
            case -1044792121:
                if (str.equals("marginTop")) {
                    c = 11;
                    break;
                }
                break;
            case -1013407967:
                if (str.equals("onDown")) {
                    c = '\f';
                    break;
                }
                break;
            case -933876756:
                if (str.equals("backgroundDrawable")) {
                    c = '\r';
                    break;
                }
                break;
            case -806339567:
                if (str.equals("padding")) {
                    c = 14;
                    break;
                }
                break;
            case -681357156:
                if (str.equals("triggerFunc")) {
                    c = 15;
                    break;
                }
                break;
            case -289173127:
                if (str.equals("marginBottom")) {
                    c = 16;
                    break;
                }
                break;
            case -179345264:
                if (str.equals("borderLeftBottomRadius")) {
                    c = 17;
                    break;
                }
                break;
            case 3355:
                if (str.equals(FacebookMediationAdapter.KEY_ID)) {
                    c = 18;
                    break;
                }
                break;
            case 3176990:
                if (str.equals("i18n")) {
                    c = 19;
                    break;
                }
                break;
            case 3373707:
                if (str.equals("name")) {
                    c = 20;
                    break;
                }
                break;
            case 90130308:
                if (str.equals("paddingTop")) {
                    c = 21;
                    break;
                }
                break;
            case 94750088:
                if (str.equals("click")) {
                    c = 22;
                    break;
                }
                break;
            case 105871684:
                if (str.equals("onTap")) {
                    c = 23;
                    break;
                }
                break;
            case 108285963:
                if (str.equals("ratio")) {
                    c = 24;
                    break;
                }
                break;
            case 113126854:
                if (str.equals("width")) {
                    c = 25;
                    break;
                }
                break;
            case 202355100:
                if (str.equals("paddingBottom")) {
                    c = 26;
                    break;
                }
                break;
            case 320386138:
                if (str.equals("onLoadMore")) {
                    c = 27;
                    break;
                }
                break;
            case 713848971:
                if (str.equals("paddingRight")) {
                    c = 28;
                    break;
                }
                break;
            case 722830999:
                if (str.equals("borderColor")) {
                    c = 29;
                    break;
                }
                break;
            case 741115130:
                if (str.equals("borderWidth")) {
                    c = 30;
                    break;
                }
                break;
            case 843948038:
                if (str.equals("onExposure")) {
                    c = 31;
                    break;
                }
                break;
            case 975087886:
                if (str.equals("marginRight")) {
                    c = ' ';
                    break;
                }
                break;
            case 1087723621:
                if (str.equals("onAnimation")) {
                    c = '!';
                    break;
                }
                break;
            case 1151851515:
                if (str.equals("animatorSet")) {
                    c = '\"';
                    break;
                }
                break;
            case 1158381436:
                if (str.equals("onPullToRefresh")) {
                    c = '#';
                    break;
                }
                break;
            case 1259700532:
                if (str.equals("borderLeftTopRadius")) {
                    c = Typography.dollar;
                    break;
                }
                break;
            case 1349188574:
                if (str.equals("borderRadius")) {
                    c = '%';
                    break;
                }
                break;
            case 1490730380:
                if (str.equals("onScroll")) {
                    c = Typography.amp;
                    break;
                }
                break;
            case 1685004456:
                if (str.equals("onLongTap")) {
                    c = '\'';
                    break;
                }
                break;
            case 1691835405:
                if (str.equals("borderRightBottomRadius")) {
                    c = '(';
                    break;
                }
                break;
            case 1941332754:
                if (str.equals("visibility")) {
                    c = ')';
                    break;
                }
                break;
            case 1970934485:
                if (str.equals("marginLeft")) {
                    c = GMTDateParser.ANY;
                    break;
                }
                break;
            case 1997542747:
                if (str.equals("availability")) {
                    c = SignatureVisitor.EXTENDS;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.Ye = com.bytedance.adsdk.ugeno.icD.vG.pvs(str2, true);
                break;
            case 1:
                this.uc = com.bytedance.adsdk.ugeno.icD.so.pvs(this.icD, str2);
                this.ZhG = true;
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case '\f':
            case 23:
            case 27:
            case 31:
            case '!':
            case '#':
            case '&':
            case '\'':
                icD(str, str2);
                break;
            case 6:
                if (com.bytedance.adsdk.ugeno.icD.pvs.vG(str2)) {
                    this.ZsW = true;
                    this.CjQ = com.bytedance.adsdk.ugeno.icD.pvs.icD(str2);
                    break;
                } else {
                    this.Gp = com.bytedance.adsdk.ugeno.icD.pvs.pvs(str2);
                    this.ZsW = false;
                    break;
                }
            case 7:
                this.tCd = com.bytedance.adsdk.ugeno.icD.vG.pvs(str2, 1.0f);
                break;
            case '\b':
                if (TextUtils.equals(str2, "match_parent")) {
                    this.Ju = -1.0f;
                } else if (TextUtils.equals(str2, "wrap_content")) {
                    this.Ju = -2.0f;
                } else {
                    this.Ju = com.bytedance.adsdk.ugeno.icD.so.pvs(this.icD, str2);
                }
                this.elv = true;
                break;
            case '\t':
                this.IP = com.bytedance.adsdk.ugeno.icD.so.pvs(this.icD, str2);
                break;
            case '\n':
                this.Pj = com.bytedance.adsdk.ugeno.icD.so.pvs(this.icD, str2);
                break;
            case 11:
                this.vA = com.bytedance.adsdk.ugeno.icD.so.pvs(this.icD, str2);
                break;
            case '\r':
                this.ae = str2;
                break;
            case 14:
                this.zM = com.bytedance.adsdk.ugeno.icD.so.pvs(this.icD, str2);
                break;
            case 15:
                this.qd = str2;
                break;
            case 16:
                this.cR = com.bytedance.adsdk.ugeno.icD.so.pvs(this.icD, str2);
                break;
            case 17:
                this.dx = com.bytedance.adsdk.ugeno.icD.so.pvs(this.icD, str2);
                break;
            case 18:
                this.Wyp = str2;
                break;
            case 19:
                this.Ayu = com.bytedance.adsdk.ugeno.icD.icD.pvs(str2, (JSONObject) null);
                break;
            case 20:
                this.qh = str2;
                break;
            case 21:
                this.OT = com.bytedance.adsdk.ugeno.icD.so.pvs(this.icD, str2);
                this.dX = true;
                break;
            case 22:
                this.ea = str2;
                break;
            case 24:
                this.od = com.bytedance.adsdk.ugeno.icD.vG.pvs(str2, 0.0f);
                break;
            case 25:
                if (TextUtils.equals(str2, "match_parent")) {
                    this.kj = -1.0f;
                } else if (TextUtils.equals(str2, "wrap_content")) {
                    this.kj = -2.0f;
                } else {
                    this.kj = com.bytedance.adsdk.ugeno.icD.so.pvs(this.icD, str2);
                }
                this.tQ = true;
                break;
            case 26:
                this.ny = com.bytedance.adsdk.ugeno.icD.so.pvs(this.icD, str2);
                this.CvL = true;
                break;
            case 28:
                this.rCZ = com.bytedance.adsdk.ugeno.icD.so.pvs(this.icD, str2);
                this.dyT = true;
                break;
            case 29:
                this.gSd = com.bytedance.adsdk.ugeno.icD.pvs.pvs(str2);
                break;
            case 30:
                this.sP = com.bytedance.adsdk.ugeno.icD.so.pvs(this.icD, str2);
                break;
            case ' ':
                this.mnm = com.bytedance.adsdk.ugeno.icD.so.pvs(this.icD, str2);
                break;
            case '\"':
                this.BSi = com.bytedance.adsdk.ugeno.core.pvs.pvs(str2, this);
                break;
            case '$':
                this.jlb = com.bytedance.adsdk.ugeno.icD.so.pvs(this.icD, str2);
                break;
            case '%':
                this.gA = com.bytedance.adsdk.ugeno.icD.so.pvs(this.icD, str2);
                break;
            case '(':
                this.cRf = com.bytedance.adsdk.ugeno.icD.so.pvs(this.icD, str2);
                break;
            case ')':
                if (TextUtils.equals("visible", str2)) {
                    this.qD = 0;
                    break;
                } else if (TextUtils.equals("invisible", str2)) {
                    this.qD = 4;
                    break;
                } else if (TextUtils.equals("gone", str2)) {
                    this.qD = 8;
                    break;
                }
                break;
            case '*':
                this.bNS = com.bytedance.adsdk.ugeno.icD.so.pvs(this.icD, str2);
                break;
            case '+':
                this.OhP = !TextUtils.equals(str2, "unavailable");
                break;
        }
    }

    protected void icD(String str, String str2) {
        if (TextUtils.isEmpty(str2) || this.sq == null) {
            return;
        }
        try {
            int pvs = kj.pvs(str).pvs();
            qh qhVar = new qh();
            qhVar.pvs(pvs);
            qhVar.pvs(this);
            JSONObject jSONObject = new JSONObject(str2);
            if (pvs == 3) {
                try {
                    this.Wby = Float.parseFloat(vG.pvs(jSONObject.optString("shakeAmplitude"), this.Jd));
                } catch (NumberFormatException unused) {
                    this.Wby = 12.0f;
                }
            }
            Ju ju = this.SE;
            if (!(ju instanceof com.bytedance.adsdk.ugeno.core.pvs.pvs)) {
                pvs(pvs, jSONObject, qhVar);
            } else if (!((com.bytedance.adsdk.ugeno.core.pvs.pvs) ju).pvs()) {
                pvs(pvs, jSONObject, qhVar);
            } else {
                qhVar.pvs(jSONObject);
                this.sq.put(Integer.valueOf(pvs), qhVar);
            }
        } catch (JSONException unused2) {
        }
    }

    @Deprecated
    protected void pvs(int i, JSONObject jSONObject, qh qhVar) {
        JSONObject optJSONObject = jSONObject.optJSONObject(FirebaseAnalytics.Param.SUCCESS);
        if (optJSONObject != null) {
            qh qhVar2 = new qh();
            qhVar2.pvs(optJSONObject);
            qhVar2.pvs(this);
            qhVar.pvs(qhVar2);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("fail");
        if (optJSONObject2 != null) {
            qh qhVar3 = new qh();
            qhVar3.pvs(optJSONObject2);
            qhVar3.pvs(this);
            qhVar.icD(qhVar3);
        }
        qhVar.pvs(jSONObject);
        this.sq.put(Integer.valueOf(i), qhVar);
    }

    @Override // com.bytedance.adsdk.ugeno.icD
    public void Jd() {
        if (this.neB == null || this.cGU) {
            return;
        }
        this.cGU = true;
    }

    @Override // com.bytedance.adsdk.ugeno.icD
    public void NB() {
        if (this.neB == null || this.Zm) {
            return;
        }
        this.Zm = true;
    }

    @Override // com.bytedance.adsdk.ugeno.icD
    public int[] pvs(int i, int i2) {
        if (this.od > 0.0f) {
            if (this.tQ) {
                int size = View.MeasureSpec.getSize(i);
                float f = this.od;
                if (f != 0.0f) {
                    i2 = View.MeasureSpec.makeMeasureSpec((int) (size / f), 1073741824);
                }
            } else if (this.elv) {
                int size2 = View.MeasureSpec.getSize(i2);
                float f2 = this.od;
                if (f2 != 0.0f) {
                    i = View.MeasureSpec.makeMeasureSpec((int) (size2 * f2), 1073741824);
                }
            }
        }
        if (this.neB != null && !this.Ca) {
            this.Ca = true;
        }
        return new int[]{i, i2};
    }

    @Override // com.bytedance.adsdk.ugeno.icD
    public void pvs(int i, int i2, int i3, int i4) {
        if (this.neB == null || this.HWd) {
            return;
        }
        this.HWd = true;
    }

    @Override // com.bytedance.adsdk.ugeno.icD
    public void pvs(Canvas canvas, IAnimation iAnimation) {
        so soVar = this.thO;
        if (soVar != null) {
            soVar.pvs(canvas, iAnimation);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.icD
    public void icD(int i, int i2, int i3, int i4) {
        so soVar = this.thO;
        if (soVar != null) {
            soVar.pvs(i, i2);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.core.Ju.icD
    public void pvs(qh qhVar) {
        pvs<ViewGroup> pvsVar;
        icD<T> icD;
        if (qhVar == null || qhVar.vG() == null || !TextUtils.equals(qhVar.vG().optString(LinkHeader.Parameters.Type), "onDismiss")) {
            return;
        }
        String optString = qhVar.vG().optString("nodeId");
        icD(8);
        this.yiw = (pvs) icD(this);
        if (TextUtils.isEmpty(optString) || (pvsVar = this.yiw) == null || (icD = pvsVar.icD(optString)) == null) {
            return;
        }
        icD.icD(8);
    }

    public icD icD(icD icd) {
        return (icd.kj() == null && (icd instanceof pvs)) ? icd : icD(icd.kj());
    }
}
