package com.bytedance.sdk.openadsdk.component.reward.zmn;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.sdk.component.utils.iqz;
import com.bytedance.sdk.openadsdk.core.am;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import java.util.Objects;

/* loaded from: classes14.dex */
public class zn {
    public static void zmn(fs fsVar, Intent intent, Bundle bundle) {
        zmn(intent, fsVar);
        zmn(bundle, fsVar);
    }

    public static void zmn(com.bytedance.sdk.openadsdk.component.reward.zn.fs fsVar, Intent intent, Bundle bundle) {
        zmn(intent, fsVar);
        zmn(bundle, fsVar);
    }

    public static nqi zmn(Intent intent, Bundle bundle, com.bytedance.sdk.openadsdk.component.reward.zn.btk btkVar) {
        com.bytedance.sdk.openadsdk.core.model.zmn fs = am.zmn().fs(am.zmn(intent));
        nqi iv = fs != null ? fs.iv() : null;
        if (btkVar != null) {
            btkVar.zmn(bundle);
        }
        if (bundle != null) {
            try {
                iv = am.zmn().zmn(bundle.getInt("meta_index", -1));
                Objects.toString(iv);
            } catch (Throwable th) {
                iqz.zmn("TTAD.RFDM", "", th);
            }
        }
        if (iv != null) {
            iv.zmn(iv.lt(), 7);
        }
        return iv;
    }

    public static nqi zmn(Intent intent, Bundle bundle, com.bytedance.sdk.openadsdk.core.cn.fb.fs fsVar) {
        com.bytedance.sdk.openadsdk.core.model.zmn fs = am.zmn().fs(am.zmn(intent));
        nqi iv = fs != null ? fs.iv() : null;
        if (fsVar != null) {
            fsVar.zmn(bundle);
        }
        am.zmn().btk();
        if (bundle != null) {
            try {
                iv = am.zmn().zmn(bundle.getInt("meta_index", -1));
                Objects.toString(iv);
            } catch (Throwable th) {
                iqz.zmn("TTAD.RFDM", "", th);
            }
        }
        if (iv != null) {
            iv.zmn(iv.lt(), 7);
        }
        return iv;
    }

    public static void zmn(Intent intent, fs fsVar) {
        if (intent == null) {
            return;
        }
        fsVar.phc.zn(intent.getBooleanExtra("video_is_cached", false));
        fsVar.yof = intent.getStringExtra("multi_process_listener_key");
        fsVar.tet = intent.getIntExtra("orientation_angle", 0) == 3;
    }

    public static void zmn(Intent intent, com.bytedance.sdk.openadsdk.component.reward.zn.fs fsVar) {
        if (intent == null) {
            return;
        }
        fsVar.fs(intent.getBooleanExtra("video_is_cached", false));
        fsVar.fs = intent.getIntExtra("orientation_angle", 0) == 3;
    }

    public static void zmn(Bundle bundle, fs fsVar) {
        if (bundle == null) {
            return;
        }
        fsVar.yof = bundle.getString("multi_process_listener_key");
        fsVar.phc.zn(bundle.getBoolean("video_is_cached", false));
        fsVar.dgt = bundle.getBoolean("is_mute");
        if (bundle.getLong("video_current") > 0) {
            fsVar.phc.fs(bundle.getLong("video_current", 0L));
        }
        fsVar.zmn(bundle.getBoolean("has_show_skip_btn"));
    }

    public static void zmn(Bundle bundle, com.bytedance.sdk.openadsdk.component.reward.zn.fs fsVar) {
        if (bundle == null) {
            return;
        }
        fsVar.fs(bundle.getBoolean("video_is_cached", false));
    }

    public static void zmn(fs fsVar, Bundle bundle, int i) {
        if (bundle == null) {
            return;
        }
        try {
            bundle.putInt("meta_index", i);
            bundle.putString("multi_process_listener_key", fsVar.yof);
            bundle.putBoolean("video_is_cached", fsVar.phc.tf());
            bundle.putLong("video_current", fsVar.phc.mw());
            bundle.putBoolean("is_mute", fsVar.dgt);
            bundle.putBoolean("has_show_skip_btn", fsVar.yo);
        } catch (Throwable th) {
            iqz.zmn("TTAD.RFDM", "onSaveInstanceState: ", th);
        }
    }

    public static void zmn(com.bytedance.sdk.openadsdk.component.reward.zn.fs fsVar, Bundle bundle, int i) {
        if (bundle == null) {
            return;
        }
        try {
            bundle.putInt("meta_index", i);
            if (fsVar != null) {
                bundle.putBoolean("video_is_cached", fsVar.cn());
            }
        } catch (Throwable th) {
            iqz.zmn("TTAD.RFDM", "onSaveInstanceState: ", th);
        }
    }

    public static void zmn(nqi nqiVar, Intent intent, Bundle bundle, int i) {
        if (bundle == null || nqiVar == null) {
            return;
        }
        try {
            bundle.putInt("meta_index", i);
            if (intent != null) {
                bundle.putString("multi_process_listener_key", intent.getStringExtra("multi_process_listener_key"));
                bundle.putBoolean("video_is_cached", intent.getBooleanExtra("video_is_cached", false));
            }
        } catch (Throwable th) {
            iqz.zmn("TTAD.RFDM", "onSaveInstanceState: ", th);
        }
    }

    public static void zmn(Intent intent, Activity activity, boolean z, com.bytedance.sdk.openadsdk.core.model.zmn zmnVar, String str) {
        int rotation;
        if (activity == null) {
            intent.addFlags(268435456);
        } else {
            try {
                rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
            } catch (Exception e) {
                iqz.zmn("TTAD.RFDM", "", e);
            }
            intent.putExtra("orientation_angle", rotation);
            intent.putExtra("video_is_cached", z);
            am.zmn().btk();
            intent.putExtra("meta_index", am.zmn().zmn(zmnVar));
            intent.putExtra("single_process_listener_key", str);
        }
        rotation = 0;
        intent.putExtra("orientation_angle", rotation);
        intent.putExtra("video_is_cached", z);
        am.zmn().btk();
        intent.putExtra("meta_index", am.zmn().zmn(zmnVar));
        intent.putExtra("single_process_listener_key", str);
    }
}
