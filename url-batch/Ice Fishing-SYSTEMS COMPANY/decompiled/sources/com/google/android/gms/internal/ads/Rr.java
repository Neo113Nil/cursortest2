package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import o2.C4828a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Rr implements Qs {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27429a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f27430b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f27431c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f27432d;

    public /* synthetic */ Rr(Object obj, Object obj2, Object obj3, int i) {
        this.f27429a = i;
        this.f27430b = obj;
        this.f27431c = obj2;
        this.f27432d = obj3;
    }

    @Override // com.google.android.gms.internal.ads.Qs
    public final void b(Object obj) {
        List<ActivityManager.RunningTaskInfo> runningTasks;
        ActivityManager.RunningTaskInfo runningTaskInfo;
        ComponentName componentName;
        ComponentName componentName2;
        int i;
        JSONObject jSONObject;
        String str;
        JSONArray optJSONArray;
        switch (this.f27429a) {
            case 0:
                Bundle bundle = (Bundle) obj;
                if (((Boolean) AbstractC2700Oa.f26701a.r()).booleanValue()) {
                    Bundle bundle2 = new Bundle();
                    t2.G g9 = p2.j.f39798C.f39803c;
                    String str2 = null;
                    try {
                        ActivityManager activityManager = (ActivityManager) ((Context) this.f27430b).getSystemService("activity");
                        if (activityManager != null && (runningTasks = activityManager.getRunningTasks(1)) != null && !runningTasks.isEmpty() && (runningTaskInfo = runningTasks.get(0)) != null) {
                            componentName = runningTaskInfo.topActivity;
                            if (componentName != null) {
                                componentName2 = runningTaskInfo.topActivity;
                                str2 = componentName2.getClassName();
                            }
                        }
                    } catch (Exception unused) {
                    }
                    bundle2.putString("activity", str2);
                    Bundle bundle3 = new Bundle();
                    q2.g1 g1Var = (q2.g1) this.f27431c;
                    bundle3.putInt("width", g1Var.f40060x);
                    bundle3.putInt("height", g1Var.f40057u);
                    bundle2.putBundle("size", bundle3);
                    ArrayList arrayList = (ArrayList) this.f27432d;
                    if (!arrayList.isEmpty()) {
                        bundle2.putParcelableArray("parents", (Parcelable[]) arrayList.toArray(new Parcelable[arrayList.size()]));
                    }
                    bundle.putBundle("view_hierarchy", bundle2);
                    return;
                }
                return;
            case 1:
                C3226fu c3226fu = (C3226fu) this.f27430b;
                ArrayList<String> arrayList2 = c3226fu.f30905h;
                Bundle bundle4 = (Bundle) obj;
                if (arrayList2 == null) {
                    return;
                }
                if (arrayList2.isEmpty()) {
                    bundle4.putInt("native_version", 0);
                    return;
                }
                bundle4.putInt("native_version", 3);
                bundle4.putStringArrayList("native_templates", arrayList2);
                bundle4.putStringArrayList("native_custom_templates", c3226fu.i);
                C3261gb c3261gb = c3226fu.f30906j;
                if (c3261gb != null) {
                    if (c3261gb.f31023n > 3) {
                        bundle4.putBoolean("enable_native_media_orientation", true);
                        int i4 = c3261gb.f31019A;
                        String str3 = i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? com.anythink.core.common.v.m.f16967e : "square" : "portrait" : "landscape" : "any";
                        if (!com.anythink.core.common.v.m.f16967e.equals(str3)) {
                            bundle4.putString("native_media_orientation", str3);
                        }
                    }
                    int i9 = c3261gb.f31025v;
                    String str4 = i9 != 0 ? i9 != 1 ? i9 != 2 ? com.anythink.core.common.v.m.f16967e : "landscape" : "portrait" : "any";
                    if (!com.anythink.core.common.v.m.f16967e.equals(str4)) {
                        bundle4.putString("native_image_orientation", str4);
                    }
                    bundle4.putBoolean("native_multiple_images", c3261gb.f31026w);
                    bundle4.putBoolean("use_custom_mute", c3261gb.f31029z);
                    int i10 = c3261gb.f31020B;
                    if (i10 != 0) {
                        bundle4.putBoolean("sccg_tap", c3261gb.f31021C);
                        bundle4.putInt("sccg_dir", i10);
                    }
                }
                PackageInfo packageInfo = (PackageInfo) this.f27431c;
                int i11 = packageInfo != null ? packageInfo.versionCode : 0;
                t2.E e6 = (t2.E) this.f27432d;
                e6.i();
                synchronized (e6.f40830a) {
                    i = e6.f40846r;
                }
                if (i11 > i) {
                    e6.i();
                    synchronized (e6.f40830a) {
                        try {
                            e6.f40848t = new JSONObject();
                            SharedPreferences.Editor editor = e6.f40836g;
                            if (editor != null) {
                                editor.remove("native_advanced_settings");
                                e6.f40836g.apply();
                            }
                            e6.j();
                        } finally {
                        }
                    }
                    e6.i();
                    synchronized (e6.f40830a) {
                        try {
                            if (e6.f40846r != i11) {
                                e6.f40846r = i11;
                                SharedPreferences.Editor editor2 = e6.f40836g;
                                if (editor2 != null) {
                                    editor2.putInt("version_code", i11);
                                    e6.f40836g.apply();
                                }
                                e6.j();
                            }
                        } finally {
                        }
                    }
                }
                e6.i();
                synchronized (e6.f40830a) {
                    jSONObject = e6.f40848t;
                }
                String str5 = null;
                if (jSONObject != null && (optJSONArray = jSONObject.optJSONArray(c3226fu.f30904g)) != null) {
                    str5 = optJSONArray.toString();
                }
                if (!TextUtils.isEmpty(str5)) {
                    bundle4.putString("native_advanced_settings", str5);
                }
                int i12 = c3226fu.f30908l;
                if (i12 > 1) {
                    bundle4.putInt("max_num_ads", i12);
                }
                C2464Ac c2464Ac = c3226fu.f30899b;
                if (c2464Ac != null) {
                    String str6 = c2464Ac.f23878v;
                    if (TextUtils.isEmpty(str6)) {
                        if (c2464Ac.f23876n >= 2) {
                            int i13 = c2464Ac.f23879w;
                            str = i13 != 2 ? i13 != 3 ? "l" : "p" : "l";
                        } else {
                            int i14 = c2464Ac.f23877u;
                            if (i14 != 1) {
                                if (i14 != 2) {
                                    StringBuilder sb = new StringBuilder(String.valueOf(i14).length() + 41);
                                    sb.append("Instream ad video aspect ratio ");
                                    sb.append(i14);
                                    sb.append(" is wrong.");
                                    u2.i.c(sb.toString());
                                } else {
                                    str = "p";
                                }
                            }
                            str = "l";
                        }
                        bundle4.putString("ia_var", str);
                    } else {
                        bundle4.putString("ad_tag", str6);
                    }
                    bundle4.putBoolean("instr", true);
                }
                if (!((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.od)).booleanValue() || c3261gb == null) {
                    return;
                }
                q2.a1 a1Var = c3261gb.f31028y;
                if (a1Var != null) {
                    Bundle bundle5 = new Bundle();
                    bundle5.putBoolean("startMuted", a1Var.f39995n);
                    bundle5.putBoolean("clickToExpandRequested", a1Var.f39997v);
                    bundle5.putBoolean("customControlsRequested", a1Var.f39996u);
                    bundle4.putBundle(com.anythink.basead.exoplayer.k.o.f8601a, bundle5);
                }
                bundle4.putBoolean("disable_image_loading", c3261gb.f31024u);
                bundle4.putInt("preferred_ad_choices_position", c3261gb.f31027x);
                return;
            default:
                try {
                    JSONObject v6 = p8.g.v("pii", (JSONObject) obj);
                    C4828a c4828a = (C4828a) this.f27430b;
                    if (c4828a != null) {
                        String str7 = c4828a.f39687a;
                        if (!TextUtils.isEmpty(str7)) {
                            v6.put("rdid", str7);
                            v6.put("is_lat", c4828a.f39688b);
                            v6.put("idtype", "adid");
                            C3288h1 c3288h1 = (C3288h1) this.f27432d;
                            String str8 = (String) c3288h1.f31134v;
                            long j9 = c3288h1.f31133u;
                            if (str8 != null && j9 > 0) {
                                v6.put("paidv1_id_android_3p", str8);
                                v6.put("paidv1_creation_time_android_3p", j9);
                            }
                            return;
                        }
                    }
                    String str9 = (String) this.f27431c;
                    if (str9 != null) {
                        v6.put("pdid", str9);
                        v6.put("pdidtype", "ssaid");
                    }
                    return;
                } catch (JSONException e9) {
                    t2.C.l("Failed putting Ad ID.", e9);
                    return;
                }
        }
    }
}
