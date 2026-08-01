package com.bytedance.sdk.openadsdk.component.reward.pvs;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.OT;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.model.zM;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* compiled from: RewardFullDataManager.java */
/* loaded from: classes2.dex */
public class icD {
    private static final SparseArray<WeakReference<cR>> pvs = new SparseArray<>();

    public static void pvs(pvs pvsVar, Intent intent, Bundle bundle) {
        pvs(intent, pvsVar);
        pvs(bundle, pvsVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v9, types: [com.bytedance.sdk.openadsdk.core.model.cR] */
    public static cR pvs(Intent intent, Bundle bundle, com.bytedance.sdk.openadsdk.core.video.vG.icD icd) {
        if (!com.bytedance.sdk.openadsdk.multipro.icD.vG()) {
            com.bytedance.sdk.openadsdk.core.model.pvs yiw = OT.pvs().yiw();
            r3 = yiw != null ? new zM(yiw) : null;
            if (icd != null) {
                icd.pvs(bundle);
            }
            OT.pvs().sUS();
        } else if (intent != null) {
            try {
                String stringExtra = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_AD_INFO);
                if (stringExtra != null) {
                    r3 = new zM(com.bytedance.sdk.openadsdk.core.model.pvs.icD(new JSONObject(stringExtra)));
                }
            } catch (Exception e) {
                com.bytedance.sdk.component.utils.Ju.pvs("TTAD.RFDM", "", e);
            }
        }
        if (bundle != null) {
            try {
                WeakReference<cR> weakReference = pvs.get(bundle.getInt("meta_tmp"));
                if (weakReference != null) {
                    r3 = weakReference.get();
                }
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.Ju.pvs("TTAD.RFDM", "", th);
            }
        }
        if (r3 != null) {
            r3.pvs(r3.vA(), 7);
        }
        return r3;
    }

    public static void pvs(Intent intent, pvs pvsVar) {
        if (intent == null) {
            return;
        }
        pvsVar.ny.vG(intent.getBooleanExtra("video_is_cached", false));
        pvsVar.sq = intent.getStringExtra("multi_process_listener_key");
        pvsVar.qd = intent.getIntExtra("orientation_angle", 0) == 3;
    }

    public static void pvs(Bundle bundle, pvs pvsVar) {
        if (bundle == null) {
            return;
        }
        pvsVar.sq = bundle.getString("multi_process_listener_key");
        pvsVar.ny.vG(bundle.getBoolean("video_is_cached", false));
        pvsVar.ea = bundle.getBoolean("is_mute");
        if (bundle.getLong("video_current") > 0) {
            pvsVar.ny.pvs(bundle.getLong("video_current", 0L));
        }
        pvsVar.pvs(bundle.getBoolean("has_show_skip_btn"));
    }

    public static void pvs(pvs pvsVar, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            cR cRVar = pvsVar.icD;
            pvs.append(cRVar.hashCode(), new WeakReference<>(cRVar));
            bundle.putInt("meta_tmp", cRVar.hashCode());
            bundle.putString("multi_process_listener_key", pvsVar.sq);
            bundle.putBoolean("video_is_cached", pvsVar.ny.ZhG());
            bundle.putLong("video_current", pvsVar.ny.yiw());
            bundle.putBoolean("is_mute", pvsVar.ea);
            bundle.putBoolean("has_show_skip_btn", pvsVar.rW);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.Ju.pvs("TTAD.RFDM", "onSaveInstanceState: ", th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void pvs(Intent intent, Activity activity, boolean z, com.bytedance.sdk.openadsdk.core.model.pvs pvsVar, String str) {
        int rotation;
        if (activity == null) {
            intent.addFlags(268435456);
        } else {
            try {
                rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
            } catch (Exception e) {
                com.bytedance.sdk.component.utils.Ju.pvs("TTAD.RFDM", "", e);
            }
            intent.putExtra("orientation_angle", rotation);
            intent.putExtra("video_is_cached", z);
            if (!com.bytedance.sdk.openadsdk.multipro.icD.vG()) {
                JSONObject kj = pvsVar.kj();
                if (kj == null) {
                    com.bytedance.sdk.component.utils.Ju.icD("toJsonObj return null");
                    return;
                } else {
                    intent.putExtra(TTAdConstant.MULTI_PROCESS_AD_INFO, kj.toString());
                    intent.putExtra("multi_process_listener_key", str);
                    return;
                }
            }
            OT.pvs().sUS();
            OT.pvs().pvs(pvsVar);
            return;
        }
        rotation = 0;
        intent.putExtra("orientation_angle", rotation);
        intent.putExtra("video_is_cached", z);
        if (!com.bytedance.sdk.openadsdk.multipro.icD.vG()) {
        }
    }
}
