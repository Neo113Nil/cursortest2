package com.bytedance.adsdk.ugeno.fb;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import com.bytedance.adsdk.ugeno.fb.fb.zn;
import com.bytedance.adsdk.ugeno.fb.fs.zmn;
import com.bytedance.adsdk.ugeno.fb.hhw;
import com.yandex.div.core.DivActionHandler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class bvs implements rc {
    private com.bytedance.adsdk.ugeno.fs.zn btk;
    private com.bytedance.adsdk.ugeno.core.fs.zmn bvs;
    private Map<String, List<com.bytedance.adsdk.ugeno.fb.fb.zn>> fb;
    private zmn fs;
    private com.bytedance.adsdk.ugeno.core.btk hhw;
    private boolean iv;
    private boolean klz;
    private rt nps;
    private boolean rc;
    private mw zg;
    Handler zmn = new Handler(Looper.getMainLooper());
    private Map<String, List<com.bytedance.adsdk.ugeno.fb.fb.zn>> zn;

    public bvs(com.bytedance.adsdk.ugeno.fs.zn znVar, zmn zmnVar) {
        this.btk = znVar;
        this.fs = zmnVar;
        if (zmnVar != null) {
            this.zn = zmnVar.zmn;
            this.fb = zmnVar.fs;
        }
        if (znVar != null && znVar.mhu() && this.bvs == null) {
            this.bvs = new com.bytedance.adsdk.ugeno.core.fs.zmn();
        }
    }

    public void zmn(com.bytedance.adsdk.ugeno.core.btk btkVar) {
        this.hhw = btkVar;
    }

    public void zmn(rt rtVar) {
        this.nps = rtVar;
    }

    public void zmn(mw mwVar) {
        this.zg = mwVar;
    }

    public void zmn() {
        List<com.bytedance.adsdk.ugeno.fb.fb.zn> zmn2 = zmn("shake");
        if (zmn2 == null || zmn2.isEmpty()) {
            return;
        }
        for (com.bytedance.adsdk.ugeno.fb.fb.zn znVar : zmn2) {
            if (znVar != null) {
                znVar.zmn(this);
                znVar.zmn(new Object[0]);
            }
        }
    }

    public void fs() {
        List<com.bytedance.adsdk.ugeno.fb.fb.zn> zmn2 = zmn("twist");
        if (zmn2 == null || zmn2.isEmpty()) {
            return;
        }
        for (com.bytedance.adsdk.ugeno.fb.fb.zn znVar : zmn2) {
            if (znVar != null) {
                znVar.zmn(this);
                znVar.zmn(new Object[0]);
            }
        }
    }

    public void zn() {
        List<com.bytedance.adsdk.ugeno.fb.fb.zn> value;
        zmn zmnVar = this.fs;
        if (zmnVar == null) {
            return;
        }
        for (Map.Entry<String, List<com.bytedance.adsdk.ugeno.fb.fb.zn>> entry : zmnVar.zmn.entrySet()) {
            if (entry != null && (value = entry.getValue()) != null && !value.isEmpty()) {
                for (com.bytedance.adsdk.ugeno.fb.fb.zn znVar : value) {
                    if (znVar instanceof com.bytedance.adsdk.ugeno.fb.fb.fb) {
                        znVar.zmn(this);
                        znVar.zmn(new Object[0]);
                    }
                }
            }
        }
    }

    public void fb() {
        List<com.bytedance.adsdk.ugeno.fb.fb.zn> zmn2 = zmn("animateState");
        if (zmn2 == null || zmn2.isEmpty()) {
            return;
        }
        for (com.bytedance.adsdk.ugeno.fb.fb.zn znVar : zmn2) {
            if (znVar != null) {
                znVar.zmn(this);
                znVar.zmn(new Object[0]);
            }
        }
    }

    public void btk() {
        List<com.bytedance.adsdk.ugeno.fb.fb.zn> zmn2 = zmn(DivActionHandler.DivActionReason.TIMER);
        if (zmn2 == null || zmn2.isEmpty()) {
            return;
        }
        for (com.bytedance.adsdk.ugeno.fb.fb.zn znVar : zmn2) {
            if (znVar != null) {
                znVar.zmn(this);
                znVar.zmn(new Object[0]);
            }
        }
    }

    public boolean zmn(MotionEvent motionEvent) {
        List<com.bytedance.adsdk.ugeno.fb.fb.zn> zmn2 = zmn("touchStart");
        if (zmn2 != null && !zmn2.isEmpty()) {
            for (com.bytedance.adsdk.ugeno.fb.fb.zn znVar : zmn2) {
                if (znVar instanceof com.bytedance.adsdk.ugeno.fb.fb.klz) {
                    znVar.zmn(this);
                    znVar.zmn(motionEvent);
                }
            }
        }
        List<com.bytedance.adsdk.ugeno.fb.fb.zn> zmn3 = zmn("touchEnd");
        List<com.bytedance.adsdk.ugeno.fb.fb.zn> zmn4 = zmn("tap");
        List<com.bytedance.adsdk.ugeno.fb.fb.zn> zmn5 = zmn("slide");
        if (zmn3 != null && !zmn3.isEmpty()) {
            for (com.bytedance.adsdk.ugeno.fb.fb.zn znVar2 : zmn3) {
                if (znVar2 instanceof com.bytedance.adsdk.ugeno.fb.fb.rc) {
                    znVar2.zmn(this);
                    this.klz = znVar2.zmn(motionEvent);
                }
            }
        }
        if ((zmn4 == null || zmn4.isEmpty()) && (zmn5 == null || zmn5.isEmpty())) {
            return this.klz;
        }
        if (this.klz && motionEvent.getAction() == 1) {
            return true;
        }
        com.bytedance.adsdk.ugeno.core.fs.zmn zmnVar = this.bvs;
        if (zmnVar != null) {
            if (zmnVar.zmn(motionEvent)) {
                Log.d("GesThrough_UGEveFacade", "mockEvent，skip");
                return false;
            }
            this.bvs.zmn(this.btk, motionEvent);
        }
        if (zmn4 != null && !zmn4.isEmpty()) {
            for (com.bytedance.adsdk.ugeno.fb.fb.zn znVar3 : zmn4) {
                if (znVar3 instanceof com.bytedance.adsdk.ugeno.fb.fb.bvs) {
                    ((com.bytedance.adsdk.ugeno.fb.fb.bvs) znVar3).zmn(this.nps);
                    znVar3.zmn(this);
                    this.iv = znVar3.zmn(motionEvent);
                }
            }
        }
        int action = motionEvent.getAction();
        if ((action == 1 || action == 3) && this.iv) {
            Log.d("GesThrough_UGEveFacade", "tap event handled");
            com.bytedance.adsdk.ugeno.core.fs.zmn zmnVar2 = this.bvs;
            if (zmnVar2 != null) {
                zmnVar2.zmn();
            }
            return true;
        }
        if (zmn5 != null && !zmn5.isEmpty()) {
            for (com.bytedance.adsdk.ugeno.fb.fb.zn znVar4 : zmn5) {
                if (znVar4 instanceof com.bytedance.adsdk.ugeno.fb.fb.btk) {
                    ((com.bytedance.adsdk.ugeno.fb.fb.btk) znVar4).zmn(this.zg);
                    znVar4.zmn(this);
                    this.rc = znVar4.zmn(motionEvent);
                }
            }
        }
        if (action == 1 || action == 3) {
            if (this.rc) {
                Log.d("GesThrough_UGEveFacade", "slide event handled");
                com.bytedance.adsdk.ugeno.core.fs.zmn zmnVar3 = this.bvs;
                if (zmnVar3 != null) {
                    zmnVar3.zmn();
                }
                return true;
            }
            if (this.bvs != null) {
                Log.d("GesThrough_UGEveFacade", "Non-tap event & not satisfy slide requirements, need gesture through");
                this.bvs.zmn(this.btk);
            }
        }
        return this.iv || this.rc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(String str, List<hhw.zmn> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (hhw.zmn zmnVar : list) {
            if (zmnVar != null) {
                com.bytedance.adsdk.ugeno.fb.fs.zmn zmn2 = zmn.C0109zmn.zmn(this.btk, str, zmnVar);
                Log.d("GesThrough_UGEveFacade", "trigger action.name is " + zmnVar.toString());
                if (zmn2 != null) {
                    zmn2.zmn();
                    zmn2.fs();
                }
            }
        }
    }

    public List<com.bytedance.adsdk.ugeno.fb.fb.zn> zmn(String str) {
        Map<String, List<com.bytedance.adsdk.ugeno.fb.fb.zn>> map;
        Map<String, List<com.bytedance.adsdk.ugeno.fb.fb.zn>> map2 = this.zn;
        if (((map2 == null || map2.isEmpty()) && ((map = this.fb) == null || map.isEmpty())) || TextUtils.isEmpty(str)) {
            return null;
        }
        Map<String, List<com.bytedance.adsdk.ugeno.fb.fb.zn>> map3 = this.zn;
        if (map3 != null && map3.containsKey(str)) {
            return this.zn.get(str);
        }
        Map<String, List<com.bytedance.adsdk.ugeno.fb.fb.zn>> map4 = this.fb;
        if (map4 != null && map4.containsKey(str)) {
            return this.fb.get(str);
        }
        return null;
    }

    public List<com.bytedance.adsdk.ugeno.fb.fb.zn> fs(String str) {
        Map<String, List<com.bytedance.adsdk.ugeno.fb.fb.zn>> map;
        Map<String, List<com.bytedance.adsdk.ugeno.fb.fb.zn>> map2 = this.fb;
        if (map2 == null || map2.isEmpty() || TextUtils.isEmpty(str) || (map = this.fb) == null || !map.containsKey(str)) {
            return null;
        }
        return this.fb.get(str);
    }

    public void zmn(String str, Object... objArr) {
        List<com.bytedance.adsdk.ugeno.fb.fb.zn> fs = fs(str);
        if (fs == null || fs.isEmpty()) {
            return;
        }
        for (com.bytedance.adsdk.ugeno.fb.fb.zn znVar : fs) {
            znVar.zmn(this);
            znVar.zmn(objArr);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.fb.rc
    public void zmn(final com.bytedance.adsdk.ugeno.fs.zn znVar, final String str, final List<hhw.zmn> list, hhw hhwVar) {
        Log.d("GesThrough_UGEveFacade", "trigger on.name is " + str + " handlers disable is " + hhwVar.zn() + " delay is " + hhwVar.fb());
        if (hhwVar.zn()) {
            return;
        }
        final int fb = hhwVar.fb();
        if (fb > 0) {
            this.zmn.postDelayed(new com.bytedance.adsdk.ugeno.nps.iv(new Runnable() { // from class: com.bytedance.adsdk.ugeno.fb.bvs.1
                @Override // java.lang.Runnable
                public void run() {
                    Log.d("GesThrough_UGEveFacade", "trigger on.name is " + str + " and delay time is up " + fb);
                    if (bvs.this.hhw != null) {
                        bvs.this.hhw.zmn(znVar, str, list);
                    }
                    bvs.this.zmn(str, (List<hhw.zmn>) list);
                }
            }), fb);
            return;
        }
        com.bytedance.adsdk.ugeno.core.btk btkVar = this.hhw;
        if (btkVar != null) {
            btkVar.zmn(znVar, str, list);
        }
        zmn(str, list);
    }

    public static bvs zmn(com.bytedance.adsdk.ugeno.fs.zn znVar, String str) {
        com.bytedance.adsdk.ugeno.fb.fb.zn zmn2;
        if (znVar != null && !TextUtils.isEmpty(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                if (jSONArray.length() <= 0) {
                    return null;
                }
                zmn zmnVar = new zmn(new HashMap(), new HashMap(), new HashMap());
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    if (optJSONObject != null && (zmn2 = zn.zmn.zmn(znVar.rc().getContext(), znVar, optJSONObject, znVar.klz())) != null) {
                        if (zmnVar.zmn.containsKey(zmn2.fb())) {
                            List<com.bytedance.adsdk.ugeno.fb.fb.zn> list = zmnVar.zmn.get(zmn2.fb());
                            if (list == null) {
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(zmn2);
                                zmnVar.zmn.put(zmn2.fb(), arrayList);
                                zmnVar.fs.put(zmn2.hhw(), arrayList);
                            } else {
                                list.add(zmn2);
                            }
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(zmn2);
                            zmnVar.zmn.put(zmn2.fb(), arrayList2);
                            zmnVar.fs.put(zmn2.hhw(), arrayList2);
                        }
                        zmnVar.zn.put(zmn2.btk(), zmn2);
                    }
                }
                return new bvs(znVar, zmnVar);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public static class zmn {
        public Map<String, List<com.bytedance.adsdk.ugeno.fb.fb.zn>> fs;
        public Map<String, List<com.bytedance.adsdk.ugeno.fb.fb.zn>> zmn;
        public Map<String, com.bytedance.adsdk.ugeno.fb.fb.zn> zn;

        public zmn(Map<String, List<com.bytedance.adsdk.ugeno.fb.fb.zn>> map, Map<String, com.bytedance.adsdk.ugeno.fb.fb.zn> map2, Map<String, List<com.bytedance.adsdk.ugeno.fb.fb.zn>> map3) {
            this.zmn = map;
            this.zn = map2;
            this.fs = map3;
        }
    }
}
