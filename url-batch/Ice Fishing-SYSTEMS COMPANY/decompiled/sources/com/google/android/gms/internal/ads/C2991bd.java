package com.google.android.gms.internal.ads;

import java.util.List;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.bd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2991bd implements XA {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29520a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f29521b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f29522c;

    public /* synthetic */ C2991bd(int i, Object obj, Object obj2) {
        this.f29520a = i;
        this.f29521b = obj;
        this.f29522c = obj2;
    }

    @Override // com.google.android.gms.internal.ads.XA
    public final /* synthetic */ Object apply(Object obj) {
        switch (this.f29520a) {
            case 0:
                InterfaceC2787Tc interfaceC2787Tc = (InterfaceC2787Tc) obj;
                interfaceC2787Tc.e((String) this.f29521b, (InterfaceC2990bc) this.f29522c);
                return interfaceC2787Tc;
            default:
                List list = (List) obj;
                C2946an c2946an = (C2946an) this.f29521b;
                c2946an.getClass();
                if (list == null || list.isEmpty()) {
                    return null;
                }
                JSONObject jSONObject = (JSONObject) this.f29522c;
                String optString = jSONObject.optString(com.anythink.basead.exoplayer.k.o.f8603c);
                Integer c4 = C2946an.c("bg_color", jSONObject);
                Integer c9 = C2946an.c("text_color", jSONObject);
                int optInt = jSONObject.optInt("text_size", -1);
                jSONObject.optBoolean("allow_pub_rendering");
                return new BinderC2989bb(optString, list, c4, c9, optInt > 0 ? Integer.valueOf(optInt) : null, jSONObject.optInt("animation_ms", 1000) + jSONObject.optInt("presentation_ms", 4000), c2946an.f29307h.f31027x);
        }
    }
}
