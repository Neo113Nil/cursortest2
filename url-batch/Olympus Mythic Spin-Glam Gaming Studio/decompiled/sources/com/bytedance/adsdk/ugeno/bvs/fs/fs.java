package com.bytedance.adsdk.ugeno.bvs.fs;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.bytedance.adsdk.ugeno.fs.zmn;
import com.facebook.appevents.internal.ViewHierarchyConstants;

/* loaded from: classes11.dex */
public class fs extends com.bytedance.adsdk.ugeno.fs.zmn<com.bytedance.adsdk.ugeno.bvs.fs.zmn> {
    private com.bytedance.adsdk.ugeno.bvs.fs.zmn ob;

    public fs(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.fs.zn
    /* renamed from: zn, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.ugeno.bvs.fs.zmn zmn() {
        com.bytedance.adsdk.ugeno.bvs.fs.zmn zmnVar = new com.bytedance.adsdk.ugeno.bvs.fs.zmn(this.fs);
        this.ob = zmnVar;
        zmnVar.zmn(this);
        return this.ob;
    }

    @Override // com.bytedance.adsdk.ugeno.fs.zmn, com.bytedance.adsdk.ugeno.fs.zn
    public void fs() {
        this.ob.setEventMap(this.vtz);
        super.fs();
    }

    @Override // com.bytedance.adsdk.ugeno.fs.zmn
    public zmn.C0110zmn iv() {
        return new zmn(this);
    }

    public static class zmn extends zmn.C0110zmn {
        protected int rp;

        public zmn(com.bytedance.adsdk.ugeno.fs.zmn zmnVar) {
            super(zmnVar);
            this.rp = -1;
        }

        @Override // com.bytedance.adsdk.ugeno.fs.zmn.C0110zmn
        public void zmn(Context context, String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            super.zmn(context, str, str2);
            if (TextUtils.equals(str, "layoutGravity")) {
                this.rp = zmn(str2);
            }
        }

        private int zmn(String str) {
            String[] split;
            if (TextUtils.isEmpty(str) || (split = str.split("\\|")) == null || split.length <= 0) {
                return -1;
            }
            int i = 0;
            for (String str2 : split) {
                i |= fs(str2);
            }
            return i;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        private int fs(String str) {
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
                    if (str.equals(ViewHierarchyConstants.DIMENSION_TOP_KEY)) {
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

        @Override // com.bytedance.adsdk.ugeno.fs.zmn.C0110zmn
        /* renamed from: fs, reason: merged with bridge method [inline-methods] */
        public FrameLayout.LayoutParams zmn() {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) this.zmn, (int) this.fs);
            layoutParams.leftMargin = (int) this.hhw;
            layoutParams.rightMargin = (int) this.nps;
            layoutParams.topMargin = (int) this.zg;
            layoutParams.bottomMargin = (int) this.bvs;
            layoutParams.gravity = this.rp;
            return layoutParams;
        }
    }
}
