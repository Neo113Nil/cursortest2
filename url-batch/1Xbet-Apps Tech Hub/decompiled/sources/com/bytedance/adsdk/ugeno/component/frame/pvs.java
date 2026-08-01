package com.bytedance.adsdk.ugeno.component.frame;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.bytedance.adsdk.ugeno.component.pvs;

/* compiled from: UGFrameWidget.java */
/* loaded from: classes.dex */
public class pvs extends com.bytedance.adsdk.ugeno.component.pvs<UGFrameLayout> {
    private UGFrameLayout ea;

    public pvs(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.component.icD
    /* renamed from: cR, reason: merged with bridge method [inline-methods] */
    public UGFrameLayout vG() {
        UGFrameLayout uGFrameLayout = new UGFrameLayout(this.icD);
        this.ea = uGFrameLayout;
        uGFrameLayout.pvs(this);
        return this.ea;
    }

    @Override // com.bytedance.adsdk.ugeno.component.pvs, com.bytedance.adsdk.ugeno.component.icD
    public void icD() {
        this.ea.setEventMap(this.sq);
        super.icD();
    }

    @Override // com.bytedance.adsdk.ugeno.component.pvs
    public pvs.C0033pvs so() {
        return new C0032pvs();
    }

    /* compiled from: UGFrameWidget.java */
    /* renamed from: com.bytedance.adsdk.ugeno.component.frame.pvs$pvs, reason: collision with other inner class name */
    public static class C0032pvs extends pvs.C0033pvs {
        protected int Mxy = -1;

        @Override // com.bytedance.adsdk.ugeno.component.pvs.C0033pvs
        public void pvs(Context context, String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            super.pvs(context, str, str2);
            if (TextUtils.equals(str, "layoutGravity")) {
                this.Mxy = pvs(str2);
            }
        }

        private int pvs(String str) {
            String[] split;
            if (TextUtils.isEmpty(str) || (split = str.split("\\|")) == null || split.length <= 0) {
                return -1;
            }
            int i = 0;
            for (String str2 : split) {
                i |= icD(str2);
            }
            return i;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        private int icD(String str) {
            char c;
            str.hashCode();
            switch (str.hashCode()) {
                case -1383228885:
                    if (str.equals("bottom")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1364013995:
                    if (str.equals("center")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -348726240:
                    if (str.equals("center_vertical")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 115029:
                    if (str.equals("top")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 3317767:
                    if (str.equals("left")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 108511772:
                    if (str.equals("right")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 1063616078:
                    if (str.equals("center_horizontal")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    return 80;
                case 1:
                    return 17;
                case 2:
                    return 16;
                case 3:
                    return 48;
                case 4:
                    return 3;
                case 5:
                    return 5;
                case 6:
                    return 1;
                default:
                    return -1;
            }
        }

        @Override // com.bytedance.adsdk.ugeno.component.pvs.C0033pvs
        /* renamed from: icD, reason: merged with bridge method [inline-methods] */
        public FrameLayout.LayoutParams pvs() {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) this.pvs, (int) this.icD);
            layoutParams.leftMargin = (int) this.Jd;
            layoutParams.rightMargin = (int) this.NB;
            layoutParams.topMargin = (int) this.sUS;
            layoutParams.bottomMargin = (int) this.yiw;
            layoutParams.gravity = this.Mxy;
            return layoutParams;
        }
    }
}
