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
    public static final List f = Arrays.asList("image/jpeg", "image/png", "image/bmp", "image/gif");

    /* renamed from: g, reason: collision with root package name */
    public static final List f3666g = Collections.singletonList("application/x-javascript");

    /* renamed from: a, reason: collision with root package name */
    public final String f3667a;

    /* renamed from: b, reason: collision with root package name */
    public final VASTResource$Type f3668b;

    /* renamed from: c, reason: collision with root package name */
    public final VASTResource$CreativeType f3669c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3670d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3671e;

    public cj(String str, VASTResource$Type vASTResource$Type, VASTResource$CreativeType vASTResource$CreativeType, int i3, int i4) {
        this.f3667a = str;
        this.f3668b = vASTResource$Type;
        this.f3669c = vASTResource$CreativeType;
        this.f3670d = i3;
        this.f3671e = i4;
    }

    public static cj a(yi yiVar, VASTResource$Type vASTResource$Type, int i3, int i4) {
        VASTResource$CreativeType vASTResource$CreativeType = VASTResource$CreativeType.NONE;
        int ordinal = vASTResource$Type.ordinal();
        if (ordinal != 0) {
            String f3 = ordinal != 1 ? ordinal != 2 ? null : yiVar.f("IFrameResource") : yiVar.f("HTMLResource");
            if (f3 == null) {
                return null;
            }
            return new cj(f3, vASTResource$Type, vASTResource$CreativeType, i3, i4);
        }
        String c3 = yiVar.c();
        String f4 = yiVar.f("StaticResource");
        if (f4 == null) {
            return null;
        }
        List list = f;
        String str = (list.contains(c3) || f3666g.contains(c3)) ? f4 : null;
        if (str == null) {
            return null;
        }
        return new cj(str, VASTResource$Type.STATIC_RESOURCE, list.contains(c3) ? VASTResource$CreativeType.IMAGE : VASTResource$CreativeType.JAVASCRIPT, i3, i4);
    }

    public final boolean equals(Object obj) {
        if (obj != null && cj.class == obj.getClass()) {
            cj cjVar = (cj) obj;
            if (this.f3670d == cjVar.f3670d && this.f3671e == cjVar.f3671e && si.a((Object) this.f3667a, (Object) cjVar.f3667a) && this.f3668b == cjVar.f3668b && this.f3669c == cjVar.f3669c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = {this.f3667a, this.f3668b, this.f3669c, Integer.valueOf(this.f3670d), Integer.valueOf(this.f3671e)};
        WeakHashMap weakHashMap = si.f4438a;
        return Arrays.deepHashCode(objArr);
    }

    public final String a(AssetManager assetManager, String str) {
        String str2;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("width", this.f3670d);
            jSONObject.put("height", this.f3671e);
            jSONObject.put("resource", str);
            str2 = jSONObject.toString();
        } catch (JSONException e3) {
            d9.a(e3);
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
