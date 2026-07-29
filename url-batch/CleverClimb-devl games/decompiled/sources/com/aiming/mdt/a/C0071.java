package com.aiming.mdt.a;

import android.app.Activity;
import android.graphics.Color;
import android.text.TextUtils;
import com.aiming.mdt.a.C0091;
import com.aiming.mdt.a.C0172;
import com.aiming.mdt.utils.C0282;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.aiming.mdt.a.ʻʽʾˈˉ, reason: contains not printable characters */
/* loaded from: classes.dex */
final class C0071 implements C0172.InterfaceC0174 {

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private /* synthetic */ C0155 f163;

    /* renamed from: ʼ, reason: contains not printable characters */
    private /* synthetic */ Activity f164;

    C0071(C0155 c0155, Activity activity) {
        this.f163 = c0155;
        this.f164 = activity;
    }

    @Override // com.aiming.mdt.a.C0172.InterfaceC0174
    /* renamed from: ʻʽ */
    public final void mo12(C0052 c0052) {
        C0091 c0091;
        try {
            try {
                if (c0052.m164() != 200) {
                    if (c0052 != null) {
                        try {
                            c0052.close();
                            return;
                        } catch (Exception e) {
                            C0282.m972("IOUtil", e);
                            C0076.m232().m236(e);
                            return;
                        }
                    }
                    return;
                }
                String str = new String(C0144.m549(c0052));
                if (TextUtils.isEmpty(str)) {
                    if (c0052 != null) {
                        try {
                            c0052.close();
                            return;
                        } catch (Exception e2) {
                            C0282.m972("IOUtil", e2);
                            C0076.m232().m236(e2);
                            return;
                        }
                    }
                    return;
                }
                JSONObject jSONObject = new JSONObject(str);
                LinkedList<String> linkedList = new LinkedList<>();
                JSONArray jSONArray = jSONObject.getJSONArray("danmakus");
                for (int i = 0; i < jSONArray.length(); i++) {
                    linkedList.add(jSONArray.optString(i));
                }
                JSONArray jSONArray2 = jSONObject.getJSONArray("colors");
                int[] iArr = new int[jSONArray2.length()];
                for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                    iArr[i2] = Color.parseColor(jSONArray2.optString(i2));
                }
                C0183 c0183 = new C0183();
                c0183.m685(jSONObject.getInt("type"));
                c0183.m687(iArr);
                c0183.m690(linkedList);
                c0091 = C0091.C0092.f265;
                c0091.m348(this.f164, c0183, this.f163);
                if (c0052 != null) {
                    try {
                        c0052.close();
                    } catch (Exception e3) {
                        C0282.m972("IOUtil", e3);
                        C0076.m232().m236(e3);
                    }
                }
            } catch (Throwable th) {
                if (c0052 != null) {
                    try {
                        c0052.close();
                    } catch (Exception e4) {
                        C0282.m972("IOUtil", e4);
                        C0076.m232().m236(e4);
                    }
                }
                throw th;
            }
        } catch (Exception e5) {
            StringBuilder sb = new StringBuilder("Error:");
            sb.append(e5.getMessage());
            C0282.m973("Danmaku", sb.toString());
            C0076.m232().m236(e5);
            if (c0052 != null) {
                try {
                    c0052.close();
                } catch (Exception e6) {
                    C0282.m972("IOUtil", e6);
                    C0076.m232().m236(e6);
                }
            }
        }
    }

    @Override // com.aiming.mdt.a.C0172.InterfaceC0174
    /* renamed from: ʼ */
    public final void mo14(String str) {
        StringBuilder sb = new StringBuilder("Error:");
        sb.append(str);
        C0282.m973("Danmaku", sb.toString());
    }
}
