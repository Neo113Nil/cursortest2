package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;
import u2.C5107a;

/* renamed from: com.google.android.gms.internal.ads.lk, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class CallableC3538lk implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32582a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f32583b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f32584c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f32585d;

    public /* synthetic */ CallableC3538lk(Ku ku, C2687Ne c2687Ne, Ku ku2) {
        this.f32582a = 1;
        this.f32583b = ku;
        this.f32584c = c2687Ne;
        this.f32585d = ku2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle bundle;
        Object obj = this.f32583b;
        Object obj2 = this.f32585d;
        Object obj3 = this.f32584c;
        switch (this.f32582a) {
            case 0:
                C3.j jVar = (C3.j) obj3;
                jVar.getClass();
                Bundle bundle2 = (Bundle) ((Ku) obj).f26063v.get();
                String str = (String) ((J3.a) ((InterfaceC3901sN) jVar.f427g).d()).get();
                boolean z8 = false;
                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.U7)).booleanValue() && ((t2.E) jVar.f429j).t()) {
                    z8 = true;
                }
                boolean a9 = ((C3226fu) jVar.f430k).a();
                return new C2687Ne(bundle2, (C5107a) jVar.f422b, (ApplicationInfo) jVar.f423c, (String) jVar.f424d, (ArrayList) jVar.f425e, (PackageInfo) jVar.f426f, str, (String) jVar.f428h, null, null, z8, a9, (Bundle) obj2);
            case 1:
                C2704Oe c2704Oe = (C2704Oe) ((Ku) obj).f26063v.get();
                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31467J2)).booleanValue() && (bundle = ((C2687Ne) obj3).f26578F) != null) {
                    bundle.putLong("get-ad-dictionary-sdkcore-start", c2704Oe.f26714j);
                    bundle.putLong("get-ad-dictionary-sdkcore-end", c2704Oe.f26715k);
                }
                return new C2681Mp((JSONObject) ((Ku) obj2).f26063v.get(), c2704Oe);
            case 2:
                C4301zs c4301zs = Ls.f26236j;
                JSONArray jSONArray = new JSONArray();
                Iterator it = ((ArrayList) obj3).iterator();
                while (it.hasNext()) {
                    J3.a aVar = (J3.a) it.next();
                    if (((JSONObject) aVar.get()) != null) {
                        jSONArray.put(aVar.get());
                    }
                }
                String str2 = (String) obj;
                Bundle bundle3 = (Bundle) obj2;
                if (jSONArray.length() != 0) {
                    return new C4301zs(jSONArray.toString(), bundle3, str2);
                }
                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31638c5)).booleanValue()) {
                    return new C4301zs(new JSONArray().toString(), bundle3, str2);
                }
                return null;
            default:
                ((C3297hA) obj3).f31206a.a((My) obj, null, (byte[]) obj2);
                return null;
        }
    }

    public /* synthetic */ CallableC3538lk(Object obj, Object obj2, Cloneable cloneable, int i) {
        this.f32582a = i;
        this.f32584c = obj;
        this.f32583b = obj2;
        this.f32585d = cloneable;
    }

    public /* synthetic */ CallableC3538lk(ArrayList arrayList, Bundle bundle, String str) {
        this.f32582a = 2;
        this.f32584c = arrayList;
        this.f32585d = bundle;
        this.f32583b = str;
    }
}
