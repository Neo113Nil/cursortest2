package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.vG.sUS;
import com.bytedance.sdk.component.adexpress.dynamic.vG.so;
import com.bytedance.sdk.component.adexpress.icD.IP;
import com.bytedance.sdk.component.adexpress.icD.Ju;
import com.bytedance.sdk.component.adexpress.icD.qh;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class DynamicRootView extends FrameLayout implements com.bytedance.sdk.component.adexpress.dynamic.Jd, com.bytedance.sdk.component.adexpress.theme.pvs {
    private int IP;
    private qh Jd;
    private int Ju;
    private ViewGroup Mxy;
    private DynamicBaseWidget NB;
    private int Wyp;
    private Ju bNS;
    private Map<Integer, String> cR;
    boolean icD;
    private com.bytedance.sdk.component.adexpress.dynamic.NB kj;
    private Context mnm;
    protected final IP pvs;
    private List<com.bytedance.sdk.component.adexpress.dynamic.vG> qh;
    private com.bytedance.sdk.component.adexpress.dynamic.NB.pvs sUS;
    private com.bytedance.sdk.component.adexpress.dynamic.icD so;
    private String vA;
    public View vG;
    private ThemeStatusBroadcastReceiver yiw;

    public DynamicRootView(Context context, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, boolean z, Ju ju, com.bytedance.sdk.component.adexpress.dynamic.NB.pvs pvsVar) {
        super(context);
        this.Mxy = null;
        this.Wyp = 0;
        this.qh = new ArrayList();
        this.Ju = 0;
        this.IP = 0;
        this.mnm = context;
        IP ip = new IP();
        this.pvs = ip;
        ip.pvs(2);
        this.sUS = pvsVar;
        pvsVar.pvs(this);
        this.yiw = themeStatusBroadcastReceiver;
        themeStatusBroadcastReceiver.pvs(this);
        this.icD = z;
        this.bNS = ju;
    }

    public String getBgColor() {
        return this.vA;
    }

    public void setBgColor(String str) {
        this.vA = str;
    }

    public void setRenderListener(qh qhVar) {
        this.Jd = qhVar;
        this.sUS.pvs(qhVar);
    }

    public void pvs(so soVar, int i) {
        this.NB = pvs(soVar, this, i);
        this.pvs.pvs(true);
        this.pvs.pvs(this.NB.NB);
        this.pvs.icD(this.NB.sUS);
        this.pvs.pvs(this.vG);
        this.Jd.pvs(this.pvs);
    }

    public DynamicBaseWidget pvs(so soVar, ViewGroup viewGroup, int i) {
        if (soVar == null) {
            return null;
        }
        List<so> qh = soVar.qh();
        DynamicBaseWidget pvs = com.bytedance.sdk.component.adexpress.dynamic.pvs.icD.pvs(this.mnm, this, soVar);
        if (pvs instanceof DynamicUnKnowView) {
            pvs(i == 3 ? 128 : 118, "unknow widget");
            return null;
        }
        pvs(soVar);
        pvs.vG();
        if (viewGroup != null) {
            viewGroup.addView(pvs);
            pvs(viewGroup, soVar);
        }
        if (qh == null || qh.size() <= 0) {
            return null;
        }
        Iterator<so> it = qh.iterator();
        while (it.hasNext()) {
            pvs(it.next(), pvs, i);
        }
        return pvs;
    }

    private void pvs(so soVar) {
        sUS NB;
        com.bytedance.sdk.component.adexpress.dynamic.vG.NB Wyp = soVar.Wyp();
        if (Wyp == null || (NB = Wyp.NB()) == null) {
            return;
        }
        this.pvs.icD(NB.LEC());
    }

    public Map<Integer, String> getBgMaterialCenterCalcColor() {
        return this.cR;
    }

    public void setBgMaterialCenterCalcColor(Map<Integer, String> map) {
        this.cR = map;
    }

    private void pvs(ViewGroup viewGroup, so soVar) {
        ViewGroup viewGroup2;
        if (viewGroup == null || (viewGroup2 = (ViewGroup) viewGroup.getParent()) == null || !soVar.ZhG()) {
            return;
        }
        viewGroup2.setClipChildren(false);
        viewGroup2.setClipToPadding(false);
        ViewGroup viewGroup3 = (ViewGroup) viewGroup2.getParent();
        if (viewGroup3 != null) {
            viewGroup3.setClipChildren(false);
            viewGroup3.setClipToPadding(false);
        }
    }

    public void pvs(double d, double d2, double d3, double d4, float f) {
        this.pvs.vG(d);
        this.pvs.Jd(d2);
        this.pvs.NB(d3);
        this.pvs.sUS(d4);
        this.pvs.pvs(f);
        this.pvs.icD(f);
        this.pvs.vG(f);
        this.pvs.Jd(f);
    }

    public void pvs(int i, String str) {
        this.pvs.pvs(false);
        this.pvs.icD(i);
        this.pvs.pvs(str);
        this.Jd.pvs(this.pvs);
    }

    public void setMuteListener(com.bytedance.sdk.component.adexpress.dynamic.icD icd) {
        this.so = icd;
    }

    public void setDislikeView(View view) {
        this.sUS.icD(view);
    }

    public qh getRenderListener() {
        return this.Jd;
    }

    public com.bytedance.sdk.component.adexpress.dynamic.NB.pvs getDynamicClickListener() {
        return this.sUS;
    }

    @Override // com.bytedance.sdk.component.adexpress.theme.pvs
    public void pvs(int i) {
        DynamicBaseWidget dynamicBaseWidget = this.NB;
        if (dynamicBaseWidget == null) {
            return;
        }
        dynamicBaseWidget.pvs(i);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.Jd
    public void pvs(CharSequence charSequence, int i, int i2, boolean z) {
        for (int i3 = 0; i3 < this.qh.size(); i3++) {
            if (this.qh.get(i3) != null) {
                this.qh.get(i3).pvs(charSequence, i == 1, i2, z);
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.Jd
    public void setSoundMute(boolean z) {
        com.bytedance.sdk.component.adexpress.dynamic.icD icd = this.so;
        if (icd != null) {
            icd.setSoundMute(z);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.Jd
    public void setTimeUpdate(int i) {
        this.kj.setTimeUpdate(i);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.Jd
    public void d_() {
        try {
            this.kj.pvs();
        } catch (Exception unused) {
        }
    }

    public ViewGroup getTimeOut() {
        return this.Mxy;
    }

    public void setTimeOut(ViewGroup viewGroup) {
        this.Mxy = viewGroup;
    }

    public int getTimedown() {
        return this.Wyp;
    }

    public void setTimedown(int i) {
        this.Wyp = i;
    }

    public List<com.bytedance.sdk.component.adexpress.dynamic.vG> getTimeOutListener() {
        return this.qh;
    }

    public void setTimeOutListener(com.bytedance.sdk.component.adexpress.dynamic.vG vGVar) {
        this.qh.add(vGVar);
    }

    public void setVideoListener(com.bytedance.sdk.component.adexpress.dynamic.NB nb) {
        this.kj = nb;
    }

    public int getScoreCountWithIcon() {
        return this.IP;
    }

    public void setScoreCountWithIcon(int i) {
        this.IP = i;
    }

    public int getLogoUnionHeight() {
        return this.Ju;
    }

    public void setLogoUnionHeight(int i) {
        this.Ju = i;
    }

    public Ju getRenderRequest() {
        return this.bNS;
    }
}
