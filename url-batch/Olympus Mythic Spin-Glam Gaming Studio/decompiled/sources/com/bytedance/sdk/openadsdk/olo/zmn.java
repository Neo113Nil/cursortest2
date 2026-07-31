package com.bytedance.sdk.openadsdk.olo;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.iqz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class zmn implements Comparable<zmn> {
    private int btk;
    private final String fs;
    private int nps;
    private long rt;
    private int zn;
    private final ArrayList<Long> zmn = new ArrayList<>();
    private final ArrayList<Long> fb = new ArrayList<>();
    private final ArrayList<Long> hhw = new ArrayList<>();
    private final ArrayList<Long> zg = new ArrayList<>();
    private final HashMap<String, fs> bvs = new HashMap<>();
    private int iv = 0;
    private int rc = 0;
    private final HashMap<String, fs> klz = new HashMap<>();
    private int mw = 0;
    private final ArrayList<String> cn = new ArrayList<>();

    public zmn(String str) {
        this.fs = str;
    }

    public void zmn(@NonNull String str, @Nullable String str2) {
        fs fsVar;
        fs fsVar2;
        fs fsVar3;
        fs fsVar4;
        fs fsVar5;
        fs fsVar6;
        str.hashCode();
        switch (str) {
            case "landingContinue":
                if (!TextUtils.isEmpty(str2) && (fsVar = this.klz.get(str2)) != null) {
                    fsVar.fb(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case "landingPause":
                if (!TextUtils.isEmpty(str2) && (fsVar2 = this.klz.get(str2)) != null) {
                    fsVar2.zn(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case "landingStart":
                if (!TextUtils.isEmpty(str2) && this.klz.get(str2) == null) {
                    fs fsVar7 = new fs();
                    this.klz.put(str2, fsVar7);
                    fsVar7.zmn(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case "feed_over":
            case "feed_break":
            case "videoForceBreak":
            case "play_error":
                if (!TextUtils.isEmpty(str2) && (fsVar3 = this.bvs.get(str2)) != null && fsVar3.zmn() != fs.btk) {
                    fsVar3.fs(SystemClock.elapsedRealtime());
                    if (com.bytedance.sdk.openadsdk.hhw.zmn.zmn().cn()) {
                        this.iv = (int) (this.iv + fsVar3.zmn(this.rt, SystemClock.elapsedRealtime()));
                        break;
                    }
                }
                break;
            case "feed_play":
                this.hhw.add(Long.valueOf(SystemClock.elapsedRealtime()));
                if (com.bytedance.sdk.openadsdk.hhw.zmn.zmn().zg()) {
                    this.nps++;
                }
                if (!TextUtils.isEmpty(str2) && this.bvs.get(str2) == null) {
                    fs fsVar8 = new fs();
                    this.bvs.put(str2, fsVar8);
                    fsVar8.zmn(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case "show":
                this.zmn.add(Long.valueOf(SystemClock.elapsedRealtime()));
                if (com.bytedance.sdk.openadsdk.hhw.zmn.zmn().hhw()) {
                    this.zn++;
                    break;
                }
                break;
            case "click":
                if (!this.cn.contains(str2)) {
                    if (this.cn.size() > 50) {
                        this.cn.subList(0, 25).clear();
                    }
                    this.cn.add(str2);
                    this.fb.add(Long.valueOf(SystemClock.elapsedRealtime()));
                    if (com.bytedance.sdk.openadsdk.hhw.zmn.zmn().nps()) {
                        this.btk++;
                        break;
                    }
                }
                break;
            case "feed_continue":
                if (!TextUtils.isEmpty(str2) && (fsVar4 = this.bvs.get(str2)) != null) {
                    fsVar4.fb(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case "feed_pause":
                if (!TextUtils.isEmpty(str2) && (fsVar5 = this.bvs.get(str2)) != null) {
                    fsVar5.zn(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case "landingFinish":
                if (!TextUtils.isEmpty(str2) && (fsVar6 = this.klz.get(str2)) != null && fsVar6.zmn() != fs.btk) {
                    fsVar6.fs(SystemClock.elapsedRealtime());
                    if (com.bytedance.sdk.openadsdk.hhw.zmn.zmn().rt()) {
                        this.mw = (int) (this.mw + fsVar6.zmn(this.rt, SystemClock.elapsedRealtime()));
                        break;
                    }
                }
                break;
            case "videoPercent30":
                if (com.bytedance.sdk.openadsdk.hhw.zmn.zmn().olo()) {
                    this.rc++;
                    break;
                }
                break;
            case "dislike":
                this.zg.add(Long.valueOf(SystemClock.elapsedRealtime()));
                break;
        }
    }

    public JSONObject zmn(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            zmn(jSONObject2, jSONObject);
            fs(jSONObject2, jSONObject);
        } catch (Throwable th) {
            iqz.zn(th.getMessage(), new Object[0]);
        }
        return jSONObject2;
    }

    private void zmn(String str, JSONObject jSONObject, ArrayList<Long> arrayList, int[] iArr, long j, JSONObject jSONObject2) throws JSONException {
        int size = arrayList.size() - 1;
        int i = 0;
        for (int i2 : iArr) {
            long j2 = j - (i2 * 60000);
            while (size >= 0 && arrayList.get(size).longValue() >= j2) {
                i++;
                size--;
            }
            if (i != 0) {
                jSONObject.put(str + i2, i);
                int optInt = jSONObject2.optInt(str + i2) + i;
                if (optInt != 0) {
                    jSONObject2.put(str + i2, optInt);
                }
            }
        }
        while (size >= 0) {
            arrayList.remove(0);
            size--;
        }
    }

    private void zmn(@NonNull JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        int i;
        int i2;
        int i3;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        zmn("show_c_", jSONObject, this.zmn, com.bytedance.sdk.openadsdk.hhw.zmn.zmn().bvs(), elapsedRealtime, jSONObject2);
        zmn("click_c_", jSONObject, this.fb, com.bytedance.sdk.openadsdk.hhw.zmn.zmn().iv(), elapsedRealtime, jSONObject2);
        zmn("v_play_c_", jSONObject, this.hhw, com.bytedance.sdk.openadsdk.hhw.zmn.zmn().rc(), elapsedRealtime, jSONObject2);
        zmn("dislike_c_", jSONObject, this.zg, com.bytedance.sdk.openadsdk.hhw.zmn.zmn().cyb(), elapsedRealtime, jSONObject2);
        if (com.bytedance.sdk.openadsdk.hhw.zmn.zmn().hhw() && (i3 = this.zn) != 0) {
            jSONObject.put("show_c_s", i3);
            int optInt = jSONObject2.optInt("show_c_s") + this.zn;
            if (optInt != 0) {
                jSONObject2.put("show_c_s", optInt);
            }
        }
        if (com.bytedance.sdk.openadsdk.hhw.zmn.zmn().nps() && (i2 = this.btk) != 0) {
            jSONObject.put("click_c_s", i2);
            int optInt2 = jSONObject2.optInt("click_c_s") + this.btk;
            if (optInt2 != 0) {
                jSONObject2.put("click_c_s", optInt2);
            }
        }
        if (!com.bytedance.sdk.openadsdk.hhw.zmn.zmn().zg() || (i = this.nps) == 0) {
            return;
        }
        jSONObject.put("v_play_c_s", i);
        int optInt3 = jSONObject2.optInt("v_play_c_s") + this.nps;
        if (optInt3 != 0) {
            jSONObject2.put("v_play_c_s", optInt3);
        }
    }

    private void fs(@NonNull JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        int i;
        int i2;
        int i3;
        long j;
        HashSet hashSet;
        HashSet hashSet2;
        HashSet hashSet3;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        int[] klz = com.bytedance.sdk.openadsdk.hhw.zmn.zmn().klz();
        long j2 = 60000;
        if (klz != null) {
            int i4 = 0;
            while (i4 < klz.length) {
                int i5 = klz[i4];
                long j3 = elapsedRealtime - (i5 * j2);
                Iterator<String> it = this.klz.keySet().iterator();
                long j4 = 0;
                while (it.hasNext()) {
                    String next = it.next();
                    Iterator<String> it2 = it;
                    fs fsVar = this.klz.get(next);
                    if (fsVar != null) {
                        long zmn = fsVar.zmn(j3, elapsedRealtime);
                        j4 += zmn;
                        if (zmn <= 0 && i4 == klz.length - 1) {
                            hashSet4.add(next);
                        }
                    }
                    it = it2;
                }
                if (j4 != 0) {
                    jSONObject.put("lp_stay_t_".concat(String.valueOf(i5)), j4);
                    hashSet2 = hashSet4;
                    hashSet3 = hashSet5;
                    long optInt = jSONObject2.optInt("lp_stay_t_".concat(String.valueOf(i5))) + j4;
                    if (optInt != 0) {
                        jSONObject2.put("lp_stay_t_".concat(String.valueOf(i5)), optInt);
                    }
                } else {
                    hashSet2 = hashSet4;
                    hashSet3 = hashSet5;
                }
                i4++;
                hashSet4 = hashSet2;
                hashSet5 = hashSet3;
                j2 = 60000;
            }
        }
        HashSet hashSet6 = hashSet4;
        HashSet hashSet7 = hashSet5;
        int[] mw = com.bytedance.sdk.openadsdk.hhw.zmn.zmn().mw();
        if (mw != null) {
            int i6 = 0;
            while (i6 < mw.length) {
                int i7 = mw[i6];
                long j5 = elapsedRealtime - (i7 * 60000);
                Iterator<String> it3 = this.bvs.keySet().iterator();
                int i8 = 0;
                long j6 = 0;
                while (it3.hasNext()) {
                    String next2 = it3.next();
                    Iterator<String> it4 = it3;
                    fs fsVar2 = this.bvs.get(next2);
                    if (fsVar2 != null) {
                        long zmn2 = fsVar2.zmn(j5, elapsedRealtime);
                        j6 += zmn2;
                        if (zmn2 > 20000) {
                            i8++;
                        }
                        if (zmn2 <= 0 && i6 == mw.length - 1) {
                            hashSet = hashSet7;
                            hashSet.add(next2);
                            hashSet7 = hashSet;
                            it3 = it4;
                        }
                    }
                    hashSet = hashSet7;
                    hashSet7 = hashSet;
                    it3 = it4;
                }
                HashSet hashSet8 = hashSet7;
                if (j6 != 0) {
                    jSONObject.put("v_stay_t_".concat(String.valueOf(i7)), j6);
                    j = elapsedRealtime;
                    long optInt2 = jSONObject2.optInt("v_stay_t_".concat(String.valueOf(i7))) + j6;
                    if (optInt2 != 0) {
                        jSONObject2.put("v_stay_t_".concat(String.valueOf(i7)), optInt2);
                    }
                } else {
                    j = elapsedRealtime;
                }
                if (i8 != 0) {
                    jSONObject.put("v_20s_play_c_".concat(String.valueOf(i7)), i8);
                    int optInt3 = jSONObject2.optInt("v_20s_play_c_".concat(String.valueOf(i7))) + i8;
                    if (optInt3 != 0) {
                        jSONObject2.put("v_20s_play_c_".concat(String.valueOf(i7)), optInt3);
                    }
                }
                i6++;
                hashSet7 = hashSet8;
                elapsedRealtime = j;
            }
        }
        HashSet hashSet9 = hashSet7;
        if (!hashSet6.isEmpty()) {
            Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                this.klz.remove((String) it5.next());
            }
        }
        if (!hashSet9.isEmpty()) {
            Iterator it6 = hashSet9.iterator();
            while (it6.hasNext()) {
                this.bvs.remove((String) it6.next());
            }
        }
        if (com.bytedance.sdk.openadsdk.hhw.zmn.zmn().cn() && (i3 = this.iv) != 0) {
            jSONObject.put("v_stay_t_s", i3);
            int optInt4 = jSONObject2.optInt("v_stay_t_s") + this.iv;
            if (optInt4 != 0) {
                jSONObject2.put("v_stay_t_s", optInt4);
            }
        }
        if (com.bytedance.sdk.openadsdk.hhw.zmn.zmn().rt() && (i2 = this.mw) != 0) {
            jSONObject.put("lp_stay_t_s", i2);
            int optInt5 = jSONObject2.optInt("lp_stay_t_s") + this.mw;
            if (optInt5 != 0) {
                jSONObject2.put("lp_stay_t_s", optInt5);
            }
        }
        if (!com.bytedance.sdk.openadsdk.hhw.zmn.zmn().olo() || (i = this.rc) == 0) {
            return;
        }
        jSONObject.put("v_30p_play_c_s", i);
        int optInt6 = jSONObject2.optInt("v_30p_play_c_s") + this.rc;
        if (optInt6 != 0) {
            jSONObject2.put("v_30p_play_c_s", optInt6);
        }
    }

    public void zmn() {
        this.rt = SystemClock.elapsedRealtime();
        this.rc = 0;
        this.btk = 0;
        this.zn = 0;
        this.mw = 0;
        this.iv = 0;
        this.nps = 0;
    }

    public String fs() {
        return this.fs;
    }

    @Override // java.lang.Comparable
    /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
    public int compareTo(zmn zmnVar) {
        return zmnVar.zn - this.zn;
    }
}
