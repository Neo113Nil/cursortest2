package com.bytedance.sdk.openadsdk.core.rt.zn;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.utils.oub;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.slf4j.Marker;

/* loaded from: classes5.dex */
public class zn {
    private static boolean fb;
    private static SimpleDateFormat zmn;

    @NonNull
    private final List<String> fs;

    @NonNull
    private final Map<fs, String> zn;

    public zn(@NonNull List<String> list, nqi nqiVar) {
        int ldx;
        this.fs = list;
        HashMap hashMap = new HashMap();
        this.zn = hashMap;
        hashMap.put(fs.CACHEBUSTING, zn());
        hashMap.put(fs.TIMESTAMP, fs());
        hashMap.put(fs.APPBUNDLE, kgc.zmn().getPackageName());
        fs fsVar = fs.PLAYERSTATE;
        hashMap.put(fsVar, "");
        if (nqiVar != null && ((ldx = nqiVar.ldx()) == 3 || ldx == 7 || ldx == 8)) {
            hashMap.put(fsVar, "fullscreen");
        }
        hashMap.put(fs.SERVERSIDE, "0");
    }

    private String fs() {
        if (zmn == null) {
            zmn = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSX", Locale.getDefault());
        }
        String format = zmn.format(new Date());
        if (!fb) {
            return format;
        }
        int rp = oub.rp();
        if (rp < 0) {
            if (rp <= -10) {
                return format + rp;
            }
            return format + "-0" + (-rp);
        }
        if (rp < 10) {
            return format + "+0" + rp;
        }
        return format + Marker.ANY_NON_NULL_MARKER + rp;
    }

    @NonNull
    public List<String> zmn() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.fs) {
            if (!TextUtils.isEmpty(str)) {
                for (fs fsVar : fs.values()) {
                    String str2 = this.zn.get(fsVar);
                    if (str2 == null) {
                        str2 = "";
                    }
                    str = fsVar == fs.__MRC_IMPRESSION_ID__ ? str.replaceAll(fsVar.name(), str2) : str.replaceAll("\\[" + fsVar.name() + "\\]", str2);
                }
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    @NonNull
    public zn zmn(@Nullable com.bytedance.sdk.openadsdk.core.rt.zmn.zmn zmnVar) {
        if (zmnVar != null) {
            this.zn.put(fs.ERRORCODE, zmnVar.zmn());
        }
        return this;
    }

    @NonNull
    public zn zmn(@Nullable long j) {
        if (j >= 0) {
            String fs = fs(j);
            if (!TextUtils.isEmpty(fs)) {
                this.zn.put(fs.CONTENTPLAYHEAD, fs);
            }
        }
        return this;
    }

    public zn zmn(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.zn.put(fs.__MRC_IMPRESSION_ID__, str);
        }
        return this;
    }

    @NonNull
    public zn fs(@Nullable String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                str = URLEncoder.encode(str, "UTF-8");
            } catch (Throwable unused) {
            }
            this.zn.put(fs.ASSETURI, str);
        }
        return this;
    }

    @NonNull
    private String zn() {
        return String.format(Locale.US, "%08d", Long.valueOf(Math.round(Math.random() * 1.0E8d)));
    }

    @NonNull
    private String fs(long j) {
        Locale locale = Locale.getDefault();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return String.format(locale, "%02d:%02d:%02d.%03d", Long.valueOf(timeUnit.toHours(j)), Long.valueOf(timeUnit.toMinutes(j) % TimeUnit.HOURS.toMinutes(1L)), Long.valueOf(timeUnit.toSeconds(j) % TimeUnit.MINUTES.toSeconds(1L)), Long.valueOf(j % 1000));
    }
}
