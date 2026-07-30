package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.as, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2951as implements Qs {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29345a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f29346b;

    public /* synthetic */ C2951as(int i, ArrayList arrayList) {
        this.f29345a = i;
        this.f29346b = arrayList;
    }

    @Override // com.google.android.gms.internal.ads.Qs
    public final void b(Object obj) {
        switch (this.f29345a) {
            case 0:
                ((Bundle) obj).putStringArrayList("ad_types", this.f29346b);
                break;
            case 1:
                Bundle bundle = (Bundle) obj;
                ArrayList arrayList = this.f29346b;
                if (arrayList != null) {
                    bundle.putStringArrayList("android_permissions", new ArrayList<>(arrayList));
                    break;
                }
                break;
            default:
                try {
                    ((JSONObject) obj).put("eid", TextUtils.join(",", this.f29346b));
                    break;
                } catch (JSONException unused) {
                    t2.C.k("Failed putting experiment ids.");
                }
        }
    }
}
