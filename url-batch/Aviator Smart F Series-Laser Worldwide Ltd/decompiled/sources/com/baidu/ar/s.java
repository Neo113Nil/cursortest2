package com.baidu.ar;

import com.baidu.ar.auth.ARAuth;
import com.baidu.ar.auth.FeatureCodes;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    public static volatile Map<String, Integer> f3187a = a();

    /* renamed from: b, reason: collision with root package name */
    public static volatile Map<String, Integer> f3188b = b();

    public static Map<String, Integer> a() {
        HashMap hashMap = new HashMap();
        hashMap.put("com.baidu.ar.vo.VOAR", Integer.valueOf(FeatureCodes.VO));
        Integer valueOf = Integer.valueOf(FeatureCodes.POSE);
        hashMap.put("com.baidu.ar.pose.PoseAR", valueOf);
        hashMap.put("com.baidu.ar.stretch.StretchAR", valueOf);
        hashMap.put("com.baidu.ar.gesture.GestureAR", 1500);
        return hashMap;
    }

    public static Map<String, Integer> b() {
        HashMap hashMap = new HashMap();
        hashMap.put("ability_face_model", Integer.valueOf(FeatureCodes.FACE));
        hashMap.put("ability_face_filter", 1000);
        hashMap.put("ability_makeup_filter", Integer.valueOf(FeatureCodes.BEAUTY_MAKEUP));
        hashMap.put("ability_vo", Integer.valueOf(FeatureCodes.VO));
        Integer valueOf = Integer.valueOf(FeatureCodes.POSE);
        hashMap.put("ability_pose", valueOf);
        hashMap.put("ability_body_detect", valueOf);
        hashMap.put("ability_gesture", 1500);
        hashMap.put("ability_image_segmentation", Integer.valueOf(FeatureCodes.BODY_SEG));
        hashMap.put("ability_sky_segmentation", Integer.valueOf(FeatureCodes.SKY_SEG));
        hashMap.put("ability_hair_segmentation", Integer.valueOf(FeatureCodes.HAIR_SEG));
        hashMap.put("ability_object_detect", 2000);
        hashMap.put("ability_3d_track", Integer.valueOf(FeatureCodes.TRACK_3D));
        return hashMap;
    }

    public static boolean c(String str) {
        if (f3188b.containsKey(str)) {
            return ARAuth.enableFeature(f3188b.get(str).intValue());
        }
        return true;
    }

    public static boolean a(String str) {
        if (f3187a.containsKey(str)) {
            return ARAuth.checkFeatureAuth(f3187a.get(str).intValue());
        }
        return true;
    }

    public static boolean b(String str) {
        if (f3188b.containsKey(str)) {
            return ARAuth.checkFeatureAuth(f3188b.get(str).intValue());
        }
        return true;
    }
}
