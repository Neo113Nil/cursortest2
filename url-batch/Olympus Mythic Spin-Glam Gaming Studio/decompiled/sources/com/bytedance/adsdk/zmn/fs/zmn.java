package com.bytedance.adsdk.zmn.fs;

import com.bytedance.adsdk.zmn.fs.zn.zmn.btk;
import com.bytedance.adsdk.zmn.fs.zn.zmn.bvs;
import com.bytedance.adsdk.zmn.fs.zn.zmn.fb;
import com.bytedance.adsdk.zmn.fs.zn.zmn.fs;
import com.bytedance.adsdk.zmn.fs.zn.zmn.hhw;
import com.bytedance.adsdk.zmn.fs.zn.zmn.iv;
import com.bytedance.adsdk.zmn.fs.zn.zmn.nps;
import com.bytedance.adsdk.zmn.fs.zn.zmn.zg;
import com.bytedance.adsdk.zmn.fs.zn.zmn.zn;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class zmn {
    private static final com.bytedance.adsdk.zmn.fs.zn.zmn zmn;
    private String btk;
    private Deque<com.bytedance.adsdk.zmn.fs.fs.zmn> fb = new LinkedList();
    private final com.bytedance.adsdk.zmn.fs.zn.zmn fs;
    private com.bytedance.adsdk.zmn.fs.fs.zmn zn;

    static {
        int i = 8;
        hhw[] hhwVarArr = {new iv(), new fb(), new bvs(), new fs(), new btk(), new com.bytedance.adsdk.zmn.fs.zn.zmn.zmn(), new nps(), new zn(), new zg()};
        final com.bytedance.adsdk.zmn.fs.zn.zmn zmnVar = new com.bytedance.adsdk.zmn.fs.zn.zmn() { // from class: com.bytedance.adsdk.zmn.fs.zmn.1
            @Override // com.bytedance.adsdk.zmn.fs.zn.zmn
            public int zmn(String str, int i2, Deque<com.bytedance.adsdk.zmn.fs.fs.zmn> deque) {
                return i2;
            }
        };
        while (i >= 0) {
            final hhw hhwVar = hhwVarArr[i];
            i--;
            zmnVar = new com.bytedance.adsdk.zmn.fs.zn.zmn() { // from class: com.bytedance.adsdk.zmn.fs.zmn.2
                @Override // com.bytedance.adsdk.zmn.fs.zn.zmn
                public int zmn(String str, int i2, Deque<com.bytedance.adsdk.zmn.fs.fs.zmn> deque) {
                    return hhw.this.zmn(str, i2, deque, zmnVar);
                }
            };
        }
        zmn = zmnVar;
    }

    private zmn(String str, com.bytedance.adsdk.zmn.fs.zn.zmn zmnVar) {
        this.fs = zmnVar;
        this.btk = str;
        try {
            zmn();
        } catch (Exception e) {
            throw new com.bytedance.adsdk.zmn.zmn.fs(str, e);
        }
    }

    public static zmn zmn(String str) {
        return new zmn(str, zmn);
    }

    private void zmn() {
        int length = this.btk.length();
        int i = 0;
        while (i < length) {
            int zmn2 = this.fs.zmn(this.btk, i, this.fb);
            if (zmn2 == i) {
                throw new IllegalArgumentException("Unrecognized expression, unrecognized characters encountered during parsing:" + this.btk.substring(0, i));
            }
            i = zmn2;
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            com.bytedance.adsdk.zmn.fs.fs.zmn pollFirst = this.fb.pollFirst();
            if (pollFirst != null) {
                arrayList.add(0, pollFirst);
            } else {
                this.zn = com.bytedance.adsdk.zmn.fs.btk.fs.zmn(arrayList, this.btk, i);
                this.fb = null;
                return;
            }
        }
    }

    public <T> T zmn(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        hashMap.put("default_key", jSONObject);
        return (T) zmn(hashMap);
    }

    public <T> T zmn(Map<String, JSONObject> map) {
        return (T) this.zn.zmn(map);
    }
}
