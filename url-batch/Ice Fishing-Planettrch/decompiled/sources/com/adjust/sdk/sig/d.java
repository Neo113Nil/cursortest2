package com.adjust.sdk.sig;

import android.content.Context;
import android.util.Log;
import com.adjust.sdk.AdjustConfig;
import com.adjust.sdk.Constants;
import java.security.InvalidKeyException;
import java.security.UnrecoverableKeyException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class d {
    public static boolean a = false;

    public static void a(Context context, c cVar, a aVar, Map map, String str, String str2) {
        byte[] bArr;
        if (a) {
            Log.e("SignerInstance", "sign: library received error. It has locked down");
            return;
        }
        if (map == null || map.size() == 0 || str == null || str2 == null) {
            Log.e("SignerInstance", "sign: One or more parameters are null");
            return;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        boolean equals = AdjustConfig.ENVIRONMENT_SANDBOX.equals(map.get("environment"));
        if (equals) {
            Log.v("SignerInstance", "Signing all the parameters begin: " + simpleDateFormat.format(new Date(System.currentTimeMillis())));
        }
        map.put("activity_kind", str);
        map.put("client_sdk", str2);
        int i = 2;
        while (true) {
            if (i <= 0) {
                bArr = null;
                break;
            }
            try {
                cVar.b(context);
                bArr = cVar.a(context, map.toString().getBytes(Constants.ENCODING));
                break;
            } catch (b e) {
                Log.e("SignerInstance", "sign: Api is less than JellyBean-4-18");
                a = true;
                map.remove("activity_kind");
                map.remove("client_sdk");
                throw e;
            } catch (InvalidKeyException e2) {
                e = e2;
            } catch (UnrecoverableKeyException e3) {
                e = e3;
            } catch (Exception e4) {
                Log.e("SignerInstance", "sign: Received an Exception: " + e4.getMessage(), e4);
                map.remove("activity_kind");
                map.remove("client_sdk");
                throw e4;
            }
            Log.e("SignerInstance", "sign: Received a retriable exception: " + e.getMessage(), e);
            Log.e("SignerInstance", "sign: Attempting retry #" + i);
            i += -1;
            cVar.a(context);
        }
        if (i == 0) {
            a = true;
            map.remove("activity_kind");
            map.remove("client_sdk");
            return;
        }
        if (equals) {
            Log.v("SignerInstance", "Calling native begin: " + simpleDateFormat.format(new Date(System.currentTimeMillis())));
        }
        byte[] PolarVoyageMotionLayoutTransitionHeroVision4068 = ((NativeLibHelper) aVar).PolarVoyageMotionLayoutTransitionHeroVision4068(context, map, bArr, cVar.a);
        if (equals) {
            Log.v("SignerInstance", "Calling native end  : " + simpleDateFormat.format(new Date(System.currentTimeMillis())));
        }
        if (PolarVoyageMotionLayoutTransitionHeroVision4068 == null) {
            Log.e("SignerInstance", "sign: Returned an null signature. Exiting...");
            map.remove("activity_kind");
            map.remove("client_sdk");
            return;
        }
        int length = PolarVoyageMotionLayoutTransitionHeroVision4068.length;
        char[] cArr = e.a;
        char[] cArr2 = new char[length * 2];
        for (int i2 = 0; i2 < length; i2++) {
            byte b = PolarVoyageMotionLayoutTransitionHeroVision4068[i2];
            int i3 = i2 * 2;
            char[] cArr3 = e.a;
            cArr2[i3] = cArr3[(b & 255) >>> 4];
            cArr2[i3 + 1] = cArr3[b & 15];
        }
        map.put("signature", new String(cArr2));
        map.remove("activity_kind");
        map.remove("client_sdk");
        if (equals) {
            Log.v("SignerInstance", "Signing all the parameters end  : " + simpleDateFormat.format(new Date(System.currentTimeMillis())));
        }
    }

    public static void a(Set set, Map map, Map map2) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (map.containsKey(str)) {
                map2.put(str, (String) map.get(str));
            }
        }
    }
}
