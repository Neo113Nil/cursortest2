package com.bytedance.sdk.openadsdk.nqi.zmn;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.sdk.component.utils.iqz;
import com.bytedance.sdk.component.zg.fs.zn;
import com.bytedance.sdk.openadsdk.nqi.cyb;
import com.bytedance.sdk.openadsdk.nqi.hhw;
import com.bytedance.sdk.openadsdk.nqi.zg;
import com.bytedance.sdk.openadsdk.uqh.btk;
import com.bytedance.sdk.openadsdk.uqh.fs;
import com.bytedance.sdk.openadsdk.utils.nu;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.ironsource.mediationsdk.demandOnly.e;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.metadata.a;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Hashtable;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class zmn {
    private static Boolean zmn;

    public static void zmn(final Context context, final View view, final String str) {
        if (!zmn() || view == null || TextUtils.isEmpty(str)) {
            return;
        }
        nu.zn((Runnable) new zn("add_qr_code") { // from class: com.bytedance.sdk.openadsdk.nqi.zmn.zmn.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    final Bitmap zn = zmn.zn(str);
                    if (zn == null) {
                        return;
                    }
                    JSONObject jSONObject = (JSONObject) btk.zmn("water_mark_config", (Object) null, fs.zmn);
                    final float optDouble = jSONObject == null ? 0.5f : (float) jSONObject.optDouble("alpha", 0.5d);
                    view.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.nqi.zmn.zmn.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            ImageView imageView = new ImageView(context);
                            imageView.setImageBitmap(zn);
                            imageView.setAlpha(optDouble);
                            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                            layoutParams.gravity = 85;
                            layoutParams.setMargins(0, 0, 2, 2);
                            View view2 = view;
                            if (view2 instanceof ViewGroup) {
                                ((ViewGroup) view2).addView(imageView, layoutParams);
                            }
                        }
                    });
                } catch (Throwable th) {
                    iqz.zn("QRCodeGenerateUtils", "addQRCode error: " + th.getMessage());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Bitmap zn(String str) {
        int i;
        int i2;
        try {
            Hashtable hashtable = new Hashtable();
            hashtable.put(hhw.CHARACTER_SET, "UTF-8");
            hashtable.put(hhw.ERROR_CORRECTION, zg.L);
            hashtable.put(hhw.MARGIN, 1);
            int zmn2 = ((zmn(str.getBytes("UTF-8").length) - 1) * 4) + 22;
            int i3 = zmn2 > 60 ? 60 : zmn2;
            com.bytedance.sdk.openadsdk.nqi.fs zmn3 = new cyb().zmn(str, i3, i3, hashtable);
            int[] iArr = new int[i3 * i3];
            JSONObject jSONObject = (JSONObject) btk.zmn("water_mark_config", (Object) null, fs.zmn);
            if (jSONObject != null) {
                i = Color.parseColor(jSONObject.optString("fg_color", "#FF000000"));
                i2 = Color.parseColor(jSONObject.optString("bg_color", "#FFFFFFFF"));
            } else {
                i = -16777216;
                i2 = -1;
            }
            for (int i4 = 0; i4 < i3; i4++) {
                for (int i5 = 0; i5 < i3; i5++) {
                    iArr[(i4 * i3) + i5] = zmn3.zmn(i5, i4) ? i : i2;
                }
            }
            Bitmap createBitmap = Bitmap.createBitmap(i3, i3, Bitmap.Config.ARGB_8888);
            createBitmap.setPixels(iArr, 0, i3, 0, 0, i3, i3);
            return createBitmap;
        } catch (Throwable th) {
            iqz.zn("QRCodeGenerateUtils", "generateQRCode error: " + th.getMessage());
            return null;
        }
    }

    private static int zmn(int i) {
        int[] iArr = {17, 32, 53, 78, 106, 134, 154, 192, 230, 271, Sdk.SDKError.Reason.BLACK_SCREEN_DETECTION_ERROR_VALUE, 367, 425, FacebookRequestErrorClassification.ESC_APP_NOT_INSTALLED, IronSourceError.ERROR_NO_INTERNET_CONNECTION, 586, 644, IronSourceError.ERROR_NT_INSTANCE_LOAD_EMPTY_SERVER_DATA, 792, 858, 929, 1003, 1091, 1171, 1273, 1367, 1465, 1528, 1628, 1732, 1840, 1952, 2068, 2188, e.a.k, 2431, 2563, 2699, 2809, 2953};
        for (int i2 = 0; i2 < 40; i2++) {
            if (iArr[i2] >= i) {
                return i2 + 1;
            }
        }
        return 40;
    }

    public static String zmn(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return com.bytedance.sdk.openadsdk.rt.zmn.zmn.zmn.zmn(str, "");
        } catch (Throwable th) {
            iqz.zn("QRCodeGenerateUtils", "getEncryptRequestId error: " + th.getMessage());
            return null;
        }
    }

    public static boolean zmn() {
        if (zmn == null) {
            JSONObject jSONObject = (JSONObject) btk.zmn("water_mark_config", (Object) null, fs.zmn);
            if (jSONObject == null) {
                return false;
            }
            zmn = Boolean.valueOf(jSONObject.optInt(a.k, 0) == 1);
        }
        return zmn.booleanValue();
    }

    public static int fs() {
        JSONObject jSONObject = (JSONObject) btk.zmn("water_mark_config", (Object) null, fs.zmn);
        if (jSONObject == null) {
            return 10;
        }
        return jSONObject.optInt("upload_count", 10);
    }
}
