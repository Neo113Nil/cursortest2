package com.ironsource;

import com.ironsource.sdk.utils.IronSourceStorageUtils;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class qm {

    /* renamed from: a, reason: collision with root package name */
    private String f18867a;

    public qm(String str) {
        this.f18867a = str;
    }

    private oh a() {
        oh ohVar = new oh(this.f18867a, "metadata.json");
        if (!ohVar.exists()) {
            a(ohVar);
        }
        return ohVar;
    }

    synchronized JSONObject b() {
        return new JSONObject(IronSourceStorageUtils.readFile(a()));
    }

    private void a(oh ohVar) {
        IronSourceStorageUtils.saveFile(new JSONObject().toString().getBytes(), ohVar.getPath());
    }

    synchronized boolean b(String str, JSONObject jSONObject) {
        JSONObject b4;
        try {
            b4 = b();
            JSONObject optJSONObject = b4.optJSONObject(str);
            if (optJSONObject != null) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    optJSONObject.putOpt(next, jSONObject.opt(next));
                }
            } else {
                b4.putOpt(str, jSONObject);
            }
        } catch (Throwable th) {
            throw th;
        }
        return a(b4);
    }

    synchronized boolean a(String str) {
        JSONObject b4 = b();
        if (!b4.has(str)) {
            return true;
        }
        b4.remove(str);
        return a(b4);
    }

    synchronized boolean a(String str, JSONObject jSONObject) {
        JSONObject b4;
        b4 = b();
        b4.put(str, jSONObject);
        return a(b4);
    }

    boolean a(ArrayList<oh> arrayList) {
        int size = arrayList.size();
        boolean z4 = true;
        int i4 = 0;
        while (i4 < size) {
            oh ohVar = arrayList.get(i4);
            i4++;
            if (!a(ohVar.getName())) {
                z4 = false;
            }
        }
        return z4;
    }

    private boolean a(JSONObject jSONObject) {
        return IronSourceStorageUtils.saveFile(jSONObject.toString().getBytes(), a().getPath()) != 0;
    }
}
