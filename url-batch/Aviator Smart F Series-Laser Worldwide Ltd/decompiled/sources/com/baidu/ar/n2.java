package com.baidu.ar;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import com.baidu.ar.arplay.representation.Number3D;
import com.baidu.ar.bd;
import com.baidu.ar.util.SystemInfoUtil;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class n2 {
    public static Bitmap a(BitmapFactory.Options options, boolean z7, String str) {
        float f8;
        int i8;
        int i9;
        int i10 = options.outWidth;
        int i11 = options.outHeight;
        float f9 = ((i10 * 1.0f) / i11) * 1.0f;
        if (z7) {
            i8 = 500;
            f8 = i10 / 500;
            i9 = (int) (500 / f9);
        } else {
            f8 = i11 / TypedValues.Custom.TYPE_INT;
            i8 = (int) (TypedValues.Custom.TYPE_INT * f9);
            i9 = TypedValues.Custom.TYPE_INT;
        }
        options.outWidth = i8;
        options.outHeight = i9;
        options.inSampleSize = (int) f8;
        return BitmapFactory.decodeFile(str, options);
    }

    public static bd b(String str) {
        String a8 = j4.a(str);
        if (TextUtils.isEmpty(a8)) {
            return null;
        }
        try {
            bd bdVar = new bd();
            JSONObject jSONObject = new JSONObject(a8);
            if (jSONObject.has("targets")) {
                JSONArray jSONArray = jSONObject.getJSONArray("targets");
                ArrayList arrayList = new ArrayList();
                for (int i8 = 0; i8 < jSONArray.length(); i8++) {
                    try {
                        arrayList.add(a((JSONObject) jSONArray.get(i8), str));
                    } catch (Exception e8) {
                        e8.printStackTrace();
                    }
                }
                bdVar.a(arrayList);
            }
            if (jSONObject.has("UI")) {
                bdVar.a(b(jSONObject.getJSONObject("UI")));
            }
            if (jSONObject.has(NotificationCompat.CATEGORY_SERVICE)) {
                bdVar.a(a(jSONObject.getJSONObject(NotificationCompat.CATEGORY_SERVICE)));
            }
            return bdVar;
        } catch (Exception e9) {
            e9.printStackTrace();
            return null;
        }
    }

    public static bd c(String str) {
        File file = new File(str, "res/default.json");
        File file2 = new File(str, "targets.json");
        bd a8 = file.exists() ? a(file.getAbsolutePath()) : null;
        return (a8 == null && file2.exists()) ? b(file2.getAbsolutePath()) : a8;
    }

    public static Number3D d(String str) {
        Number3D number3D = new Number3D();
        try {
            String[] split = str.split(SystemInfoUtil.COMMA);
            number3D.setAll(Float.valueOf(split[0]).floatValue(), Float.valueOf(split[1]).floatValue(), Float.valueOf(split[2]).floatValue());
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        return number3D;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005b A[Catch: Exception -> 0x004b, TRY_LEAVE, TryCatch #0 {Exception -> 0x004b, blocks: (B:4:0x0003, B:9:0x000a, B:12:0x0019, B:16:0x0044, B:18:0x005b, B:25:0x0051), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap a(bd bdVar, String str) {
        if (bdVar == null) {
            return null;
        }
        try {
            if (bdVar.c() == null) {
                return null;
            }
            String c8 = bdVar.c().c();
            if (TextUtils.isEmpty(c8)) {
                return null;
            }
            String str2 = str + File.separator + c8;
            BitmapFactory.Options options = new BitmapFactory.Options();
            boolean z7 = true;
            options.inJustDecodeBounds = true;
            Bitmap decodeFile = BitmapFactory.decodeFile(str2, options);
            int i8 = options.outWidth;
            int i9 = options.outHeight;
            if (i9 > i8) {
                if (i9 > 900) {
                    options.inJustDecodeBounds = false;
                    decodeFile = a(options, false, str2);
                    if (!z7) {
                        return decodeFile;
                    }
                    options.inJustDecodeBounds = false;
                    return BitmapFactory.decodeFile(str2, options);
                }
                z7 = false;
                if (!z7) {
                }
            } else {
                if (i8 > 500) {
                    options.inJustDecodeBounds = false;
                    decodeFile = a(options, true, str2);
                    if (!z7) {
                    }
                }
                z7 = false;
                if (!z7) {
                }
            }
        } catch (Exception e8) {
            e8.printStackTrace();
            return null;
        }
    }

    public static tc b(JSONObject jSONObject) {
        int parseInt;
        tc tcVar = new tc();
        try {
            if (jSONObject.has("udt_tip_simple")) {
                tcVar.c(jSONObject.getString("udt_tip_simple"));
            }
            if (jSONObject.has("udt_tip_detail")) {
                tcVar.b(jSONObject.getString("udt_tip_detail"));
            }
            if (jSONObject.has("hint")) {
                tcVar.f(jSONObject.getString("hint"));
            }
            if (jSONObject.has("too_far_hint")) {
                tcVar.i(jSONObject.getString("too_far_hint"));
            }
            if (jSONObject.has("too_near_hint")) {
                tcVar.j(jSONObject.getString("too_near_hint"));
            }
            if (jSONObject.has("not_find_hint")) {
                tcVar.g(jSONObject.getString("not_find_hint"));
            }
            if (jSONObject.has("far_threshold")) {
                tcVar.a(Float.parseFloat(jSONObject.getString("far_threshold")));
            }
            if (jSONObject.has("near_threshold")) {
                tcVar.b(Float.parseFloat(jSONObject.getString("near_threshold")));
            }
            if (jSONObject.has("case_type") && (parseInt = Integer.parseInt(jSONObject.getString("case_type"))) >= 0 && parseInt < bd.a.values().length) {
                tcVar.a(bd.a.values()[parseInt]);
            }
            if (jSONObject.has("udt_mode")) {
                tcVar.d(Integer.parseInt(jSONObject.getString("udt_mode")));
            }
            if (jSONObject.has("help_url")) {
                tcVar.e(jSONObject.getString("help_url"));
            }
            if (jSONObject.has("help_url_show_once")) {
                tcVar.a(Integer.parseInt(jSONObject.getString("help_url_show_once")));
            }
            if (jSONObject.has("help_url_show_once")) {
                tcVar.a(Integer.parseInt(jSONObject.getString("help_url_show_once")));
            }
            if (jSONObject.has("slam_texture_tip")) {
                tcVar.d(jSONObject.getString("slam_texture_tip"));
            }
            if (jSONObject.has("help_url")) {
                tcVar.h(jSONObject.getString("help_url"));
            }
            if (jSONObject.has("slam_device_orientation_tip")) {
                tcVar.a(jSONObject.getString("slam_device_orientation_tip"));
            }
            if (jSONObject.has("image_target_path")) {
                tcVar.k(jSONObject.getString("image_target_path"));
            }
            if (jSONObject.has("hide_shot_immediately")) {
                tcVar.b(jSONObject.getInt("hide_shot_immediately"));
            }
            if (jSONObject.has("show_tips_by_case")) {
                tcVar.c(jSONObject.getInt("show_tips_by_case"));
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        return tcVar;
    }

    public static bd a(String str) {
        String a8 = j4.a(str);
        bd bdVar = null;
        if (TextUtils.isEmpty(a8)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(a8);
            if (!jSONObject.has("ar_configs")) {
                return null;
            }
            JSONArray jSONArray = jSONObject.getJSONArray("ar_configs");
            if (jSONArray.length() == 0) {
                return null;
            }
            JSONObject jSONObject2 = (JSONObject) jSONArray.get(0);
            if (!jSONObject2.has("ar_target")) {
                return null;
            }
            JSONObject jSONObject3 = jSONObject2.getJSONObject("ar_target");
            bd bdVar2 = new bd();
            try {
                if (jSONObject3.has("targets")) {
                    JSONArray jSONArray2 = jSONObject3.getJSONArray("targets");
                    ArrayList arrayList = new ArrayList();
                    for (int i8 = 0; i8 < jSONArray2.length(); i8++) {
                        try {
                            arrayList.add(a((JSONObject) jSONArray2.get(i8), str));
                        } catch (Exception e8) {
                            e8.printStackTrace();
                        }
                    }
                    bdVar2.a(arrayList);
                }
                if (jSONObject3.has("UI")) {
                    bdVar2.a(b(jSONObject3.getJSONObject("UI")));
                }
                if (jSONObject.has(NotificationCompat.CATEGORY_SERVICE)) {
                    bdVar2.a(a(jSONObject.getJSONObject(NotificationCompat.CATEGORY_SERVICE)));
                }
                return bdVar2;
            } catch (Exception e9) {
                e = e9;
                bdVar = bdVar2;
                e.printStackTrace();
                return bdVar;
            }
        } catch (Exception e10) {
            e = e10;
        }
    }

    public static ed a(JSONObject jSONObject) {
        ed edVar = new ed();
        try {
            if (jSONObject.has("open_track_service")) {
                edVar.a(jSONObject.getInt("open_track_service"));
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        return edVar;
    }

    public static oc a(JSONObject jSONObject, String str) {
        oc ocVar = new oc();
        try {
            if (str.length() > 0) {
                ocVar.d(str.substring(0, str.lastIndexOf(47)));
            }
            if (jSONObject.has("id")) {
                ocVar.a(jSONObject.getString("id"));
            }
            if (jSONObject.has("name")) {
                ocVar.c(jSONObject.getString("name"));
            }
            if (jSONObject.has("model_path")) {
                ocVar.b(jSONObject.getString("model_path"));
            }
            if (jSONObject.has("template_width")) {
                ocVar.d(jSONObject.getInt("template_width"));
            }
            if (jSONObject.has("template_height")) {
                ocVar.c(jSONObject.getInt("template_height"));
            }
            if (jSONObject.has("target_width")) {
                ocVar.b(jSONObject.getInt("target_width"));
            }
            if (jSONObject.has("target_height")) {
                ocVar.a(jSONObject.getInt("target_height"));
            }
            if (jSONObject.has("centre_pos")) {
                ocVar.a(d(jSONObject.getString("centre_pos")));
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        return ocVar;
    }
}
