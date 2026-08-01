package com.bytedance.adsdk.ugeno.component;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.component.flexbox.FlexboxLayout;
import com.bytedance.adsdk.ugeno.icD.so;
import java.util.ArrayList;
import java.util.List;

/* compiled from: UGLayoutWidget.java */
/* loaded from: classes.dex */
public class pvs<E extends ViewGroup> extends icD {
    protected List<icD<View>> pvs;

    public pvs(Context context) {
        this(context, null);
    }

    public pvs(Context context, pvs pvsVar) {
        super(context, pvsVar);
        this.pvs = new ArrayList();
    }

    @Override // com.bytedance.adsdk.ugeno.component.icD
    public void icD() {
        super.icD();
    }

    public void pvs(icD icd) {
        if (icd == null) {
            return;
        }
        this.pvs.add(icd);
        View Mxy = icd.Mxy();
        if (Mxy != null) {
            ((ViewGroup) this.NB).addView(Mxy);
        }
    }

    public List<icD<View>> pvs() {
        return this.pvs;
    }

    @Override // com.bytedance.adsdk.ugeno.component.icD
    public icD pvs(String str) {
        icD<View> icD;
        if (!TextUtils.isEmpty(str) && TextUtils.equals(str, this.Wyp)) {
            return this;
        }
        for (icD<View> icd : this.pvs) {
            if (icd != null && (icD = icd.icD(str)) != null) {
                return icD;
            }
        }
        return null;
    }

    public C0033pvs so() {
        return new C0033pvs();
    }

    /* compiled from: UGLayoutWidget.java */
    /* renamed from: com.bytedance.adsdk.ugeno.component.pvs$pvs, reason: collision with other inner class name */
    public static class C0033pvs {
        protected float Jd;
        protected float NB;
        protected float icD;
        protected float pvs;
        protected float sUS;
        protected ViewGroup.LayoutParams so;
        protected float vG;
        protected float yiw;

        public void pvs(Context context, String str, String str2) {
            if (TextUtils.isEmpty(str)) {
            }
            str.hashCode();
            switch (str) {
                case "height":
                    if (TextUtils.equals(str2, "match_parent")) {
                        this.icD = -1.0f;
                        break;
                    } else if (TextUtils.equals(str2, "wrap_content")) {
                        this.icD = -2.0f;
                        break;
                    } else {
                        this.icD = so.pvs(context, str2);
                        break;
                    }
                case "margin":
                    this.vG = so.pvs(context, str2);
                    break;
                case "marginTop":
                    this.sUS = so.pvs(context, str2);
                    break;
                case "marginBottom":
                    this.yiw = so.pvs(context, str2);
                    break;
                case "width":
                    if (TextUtils.equals(str2, "match_parent")) {
                        this.pvs = -1.0f;
                        break;
                    } else if (TextUtils.equals(str2, "wrap_content")) {
                        this.pvs = -2.0f;
                        break;
                    } else {
                        this.pvs = so.pvs(context, str2);
                        break;
                    }
                case "marginRight":
                    this.NB = so.pvs(context, str2);
                    break;
                case "marginLeft":
                    this.Jd = so.pvs(context, str2);
                    break;
            }
        }

        public ViewGroup.LayoutParams pvs() {
            FlexboxLayout.pvs pvsVar = new FlexboxLayout.pvs((int) this.pvs, (int) this.icD);
            pvsVar.leftMargin = (int) this.Jd;
            pvsVar.rightMargin = (int) this.NB;
            pvsVar.topMargin = (int) this.sUS;
            pvsVar.bottomMargin = (int) this.yiw;
            return pvsVar;
        }
    }
}
