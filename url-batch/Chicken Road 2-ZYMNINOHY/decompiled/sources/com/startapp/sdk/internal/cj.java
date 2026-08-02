package com.startapp.sdk.internal;

import android.content.res.AssetManager;
import com.startapp.sdk.ads.video.vast.VASTResource$CreativeType;
import com.startapp.sdk.ads.video.vast.VASTResource$Type;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class cj {

    /* renamed from: f, reason: collision with root package name */
    public static final List f6777f = Arrays.asList("image/jpeg", "image/png", "image/bmp", "image/gif");

    /* renamed from: g, reason: collision with root package name */
    public static final List f6778g = Collections.singletonList("application/x-javascript");

    /* renamed from: a, reason: collision with root package name */
    public final String f6779a;

    /* renamed from: b, reason: collision with root package name */
    public final VASTResource$Type f6780b;

    /* renamed from: c, reason: collision with root package name */
    public final VASTResource$CreativeType f6781c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6782d;

    /* renamed from: e, reason: collision with root package name */
    public final int f6783e;

    public cj(String str, VASTResource$Type vASTResource$Type, VASTResource$CreativeType vASTResource$CreativeType, int i4, int i5) {
        this.f6779a = str;
        this.f6780b = vASTResource$Type;
        this.f6781c = vASTResource$CreativeType;
        this.f6782d = i4;
        this.f6783e = i5;
    }

    public static cj a(yi yiVar, VASTResource$Type vASTResource$Type, int i4, int i5) {
        VASTResource$CreativeType vASTResource$CreativeType = VASTResource$CreativeType.NONE;
        int ordinal = vASTResource$Type.ordinal();
        if (ordinal != 0) {
            String f4 = ordinal != 1 ? ordinal != 2 ? null : yiVar.f("IFrameResource") : yiVar.f("HTMLResource");
            if (f4 == null) {
                return null;
            }
            return new cj(f4, vASTResource$Type, vASTResource$CreativeType, i4, i5);
        }
        String c4 = yiVar.c();
        String f5 = yiVar.f("StaticResource");
        if (f5 == null) {
            return null;
        }
        List list = f6777f;
        String str = (list.contains(c4) || f6778g.contains(c4)) ? f5 : null;
        if (str == null) {
            return null;
        }
        return new cj(str, VASTResource$Type.STATIC_RESOURCE, list.contains(c4) ? VASTResource$CreativeType.IMAGE : VASTResource$CreativeType.JAVASCRIPT, i4, i5);
    }

    public final boolean equals(Object obj) {
        if (obj != null && cj.class == obj.getClass()) {
            cj cjVar = (cj) obj;
            if (this.f6782d == cjVar.f6782d && this.f6783e == cjVar.f6783e && si.a((Object) this.f6779a, (Object) cjVar.f6779a) && this.f6780b == cjVar.f6780b && this.f6781c == cjVar.f6781c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = {this.f6779a, this.f6780b, this.f6781c, Integer.valueOf(this.f6782d), Integer.valueOf(this.f6783e)};
        WeakHashMap weakHashMap = si.f7575a;
        return Arrays.deepHashCode(objArr);
    }

    public final String a(AssetManager assetManager, String str) {
        String str2;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("width", this.f6782d);
            jSONObject.put("height", this.f6783e);
            jSONObject.put("resource", str);
            str2 = jSONObject.toString();
        } catch (JSONException e4) {
            d9.a(e4);
            str2 = null;
        }
        HashMap hashMap = new HashMap(1);
        if (str2 != null) {
            hashMap.put("'%%_start_io_vast_data_placeholder_%%'", str2);
        }
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(assetManager.open("io_start_sdk_vast_endcard_smart.html")));
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    if (!hashMap.isEmpty()) {
                        Iterator it = hashMap.entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            String str3 = (String) entry.getKey();
                            String str4 = (String) entry.getValue();
                            int indexOf = readLine.indexOf(str3);
                            if (indexOf >= 0) {
                                sb.append(readLine.substring(0, indexOf));
                                sb.append(str4);
                                sb.append(readLine.substring(indexOf + str3.length()));
                                sb.append(System.lineSeparator());
                                it.remove();
                                break;
                            }
                        }
                    }
                    sb.append(readLine);
                    sb.append(System.lineSeparator());
                } finally {
                }
            }
            bufferedReader.close();
        } catch (Throwable th) {
            d9.a(th);
        }
        return sb.toString();
    }
}
