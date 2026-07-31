package com.startapp.sdk.internal;

import android.content.res.AssetManager;
import com.facebook.react.uimanager.ViewProps;
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

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class ji {
    public static final List f = Arrays.asList("image/jpeg", "image/png", "image/bmp", "image/gif");
    public static final List g = Collections.singletonList("application/x-javascript");

    /* renamed from: a, reason: collision with root package name */
    public final String f292a;
    public final VASTResource$Type b;
    public final VASTResource$CreativeType c;
    public final int d;
    public final int e;

    public ji(String str, VASTResource$Type vASTResource$Type, VASTResource$CreativeType vASTResource$CreativeType, int i, int i2) {
        this.f292a = str;
        this.b = vASTResource$Type;
        this.c = vASTResource$CreativeType;
        this.d = i;
        this.e = i2;
    }

    public static ji a(fi fiVar, VASTResource$Type vASTResource$Type, int i, int i2) {
        VASTResource$CreativeType vASTResource$CreativeType = VASTResource$CreativeType.NONE;
        int ordinal = vASTResource$Type.ordinal();
        if (ordinal != 0) {
            String f2 = ordinal != 1 ? ordinal != 2 ? null : fiVar.f("IFrameResource") : fiVar.f("HTMLResource");
            if (f2 == null) {
                return null;
            }
            return new ji(f2, vASTResource$Type, vASTResource$CreativeType, i, i2);
        }
        String d = fiVar.d();
        String f3 = fiVar.f("StaticResource");
        if (f3 == null) {
            return null;
        }
        List list = f;
        String str = (list.contains(d) || g.contains(d)) ? f3 : null;
        if (str == null) {
            return null;
        }
        return new ji(str, VASTResource$Type.STATIC_RESOURCE, list.contains(d) ? VASTResource$CreativeType.IMAGE : VASTResource$CreativeType.JAVASCRIPT, i, i2);
    }

    public final boolean equals(Object obj) {
        if (obj != null && ji.class == obj.getClass()) {
            ji jiVar = (ji) obj;
            if (this.d == jiVar.d && this.e == jiVar.e && zh.a((Object) this.f292a, (Object) jiVar.f292a) && this.b == jiVar.b && this.c == jiVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = {this.f292a, this.b, this.c, Integer.valueOf(this.d), Integer.valueOf(this.e)};
        WeakHashMap weakHashMap = zh.f528a;
        return Arrays.deepHashCode(objArr);
    }

    public final String a(AssetManager assetManager, String str) {
        String str2;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(ViewProps.WIDTH, this.d);
            jSONObject.put(ViewProps.HEIGHT, this.e);
            jSONObject.put("resource", str);
            str2 = jSONObject.toString();
        } catch (JSONException e) {
            n8.a(e);
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
            n8.a(th);
        }
        return sb.toString();
    }
}
