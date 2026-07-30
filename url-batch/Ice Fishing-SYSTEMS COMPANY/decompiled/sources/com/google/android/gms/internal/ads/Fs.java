package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.Base64;
import com.anythink.core.common.e.a;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q2.C4907p;

/* loaded from: classes2.dex */
public final class Fs implements Qs {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25044a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f25045b;

    public /* synthetic */ Fs(HashMap hashMap, int i) {
        this.f25044a = i;
        this.f25045b = hashMap;
    }

    @Override // com.google.android.gms.internal.ads.Qs
    public final void b(Object obj) {
        switch (this.f25044a) {
            case 0:
                Bundle bundle = (Bundle) obj;
                HashMap hashMap = this.f25045b;
                if (!hashMap.isEmpty()) {
                    if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.K8)).booleanValue()) {
                        C3355iE B8 = C3515lE.B();
                        for (Map.Entry entry : hashMap.entrySet()) {
                            ArrayDeque arrayDeque = (ArrayDeque) entry.getValue();
                            if (!arrayDeque.isEmpty()) {
                                C3704oo c3704oo = (C3704oo) entry.getKey();
                                int i = c3704oo.f33212b;
                                int i4 = 1;
                                if (i != 0) {
                                    if (i != 1) {
                                        i4 = 3;
                                        if (i != 2) {
                                            i4 = i != 3 ? 0 : 4;
                                        }
                                    } else {
                                        i4 = 2;
                                    }
                                }
                                if (i4 != 0) {
                                    C3247gE A8 = C3301hE.A();
                                    A8.h();
                                    ((C3301hE) A8.f30000u).B(c3704oo.f33211a);
                                    A8.h();
                                    ((C3301hE) A8.f30000u).C(i4);
                                    C3301hE c3301hE = (C3301hE) A8.j();
                                    C3407jE A9 = C3461kE.A();
                                    A9.h();
                                    ((C3461kE) A9.f30000u).B(c3301hE);
                                    A9.h();
                                    ((C3461kE) A9.f30000u).C(arrayDeque);
                                    B8.h();
                                    ((C3515lE) B8.f30000u).C((C3461kE) A9.j());
                                }
                            }
                        }
                        C3515lE c3515lE = (C3515lE) B8.j();
                        if (c3515lE.A() > 0) {
                            bundle.putString("ods", Base64.encodeToString(c3515lE.b(), 11));
                            break;
                        }
                    } else {
                        JSONArray jSONArray = new JSONArray();
                        for (Map.Entry entry2 : hashMap.entrySet()) {
                            ArrayDeque arrayDeque2 = (ArrayDeque) entry2.getValue();
                            if (!arrayDeque2.isEmpty()) {
                                C3704oo c3704oo2 = (C3704oo) entry2.getKey();
                                JSONObject jSONObject = new JSONObject();
                                try {
                                    jSONObject.put("id", c3704oo2.f33211a);
                                    jSONObject.put(a.C0076a.f13061b, c3704oo2.f33212b);
                                    JSONArray jSONArray2 = new JSONArray();
                                    Iterator it = arrayDeque2.iterator();
                                    while (it.hasNext()) {
                                        jSONArray2.put((Long) it.next());
                                    }
                                    jSONObject.put("timestamps", jSONArray2);
                                    jSONArray.put(jSONObject);
                                } catch (JSONException e6) {
                                    t2.C.l("Failed putting the on-device storage record.", e6);
                                }
                            }
                        }
                        if (jSONArray.length() > 0) {
                            bundle.putString("on_device_storage_records", jSONArray.toString());
                            break;
                        }
                    }
                }
                break;
            default:
                try {
                    ((JSONObject) obj).put("video_decoders", C4907p.f40108g.f40109a.l(this.f25045b));
                    break;
                } catch (JSONException e9) {
                    t2.C.k("Could not encode video decoder properties: ".concat(String.valueOf(e9.getMessage())));
                }
        }
    }
}
