package com.bytedance.adsdk.ugeno.zmn.fs;

import android.animation.FloatEvaluator;
import android.animation.Keyframe;
import android.animation.TypeEvaluator;
import android.content.Context;
import com.bytedance.adsdk.ugeno.nps.zg;
import com.bytedance.adsdk.ugeno.zmn.btk;
import java.util.TreeMap;

/* loaded from: classes4.dex */
public class fs extends zmn {
    public fs(Context context, com.bytedance.adsdk.ugeno.fs.zn znVar, String str, TreeMap<Float, String> treeMap) {
        super(context, znVar, str, treeMap);
    }

    /* renamed from: com.bytedance.adsdk.ugeno.zmn.fs.fs$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] zmn;

        static {
            int[] iArr = new int[btk.values().length];
            zmn = iArr;
            try {
                iArr[btk.TRANSLATE_X.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                zmn[btk.TRANSLATE_Y.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                zmn[btk.SCALE_X.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                zmn[btk.SCALE_Y.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                zmn[btk.ROTATE_X.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                zmn[btk.ROTATE_Y.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                zmn[btk.ROTATE_Z.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                zmn[btk.ALPHA.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                zmn[btk.BORDER_RADIUS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.zmn.fs.zmn
    public void fs() {
        float cn;
        switch (AnonymousClass1.zmn[this.fb.ordinal()]) {
            case 1:
                cn = this.nps.cn();
                break;
            case 2:
                cn = this.nps.cyb();
                break;
            case 3:
                cn = this.nps.olo();
                break;
            case 4:
                cn = this.nps.kgc();
                break;
            case 5:
                cn = this.nps.kw();
                if (this.nps.rc() != null) {
                    this.nps.rc().setCameraDistance(10000.0f);
                    break;
                }
                break;
            case 6:
                cn = this.nps.iqz();
                if (this.nps.rc() != null) {
                    this.nps.rc().setCameraDistance(10000.0f);
                    break;
                }
                break;
            case 7:
                cn = this.nps.phc();
                break;
            case 8:
                cn = this.nps.doe();
                break;
            case 9:
                cn = this.nps.nqi();
                break;
            default:
                cn = 0.0f;
                break;
        }
        this.btk.add(Keyframe.ofFloat(0.0f, cn));
    }

    @Override // com.bytedance.adsdk.ugeno.zmn.fs.zmn
    public void zmn(float f, String str) {
        float zmn;
        if (this.fs.startsWith(btk.TRANSLATE.zmn()) || this.fb == btk.BORDER_RADIUS) {
            zmn = zg.zmn(this.zmn, com.bytedance.adsdk.ugeno.nps.zn.zmn(str, 0.0f));
        } else {
            zmn = com.bytedance.adsdk.ugeno.nps.zn.zmn(str, 0.0f);
        }
        this.btk.add(Keyframe.ofFloat(f, zmn));
    }

    @Override // com.bytedance.adsdk.ugeno.zmn.fs.zmn
    public TypeEvaluator hhw() {
        return new FloatEvaluator();
    }
}
