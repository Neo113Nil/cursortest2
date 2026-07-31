package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class kh implements df {

    /* renamed from: a, reason: collision with root package name */
    private static Map<String, Object> f16935a = new HashMap();

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        String f16936a;

        /* renamed from: b, reason: collision with root package name */
        String f16937b;

        /* renamed from: c, reason: collision with root package name */
        String f16938c;

        /* renamed from: d, reason: collision with root package name */
        Context f16939d;

        /* renamed from: e, reason: collision with root package name */
        String f16940e;

        b a(Context context) {
            this.f16939d = context;
            return this;
        }

        b b(String str) {
            this.f16938c = str;
            return this;
        }

        b c(String str) {
            this.f16936a = str;
            return this;
        }

        b d(String str) {
            this.f16940e = str;
            return this;
        }

        b a(String str) {
            this.f16937b = str;
            return this;
        }

        public kh a() {
            return new kh(this);
        }
    }

    private kh(b bVar) {
        a(bVar);
        a(bVar.f16939d);
    }

    public static void b(String str) {
        f16935a.put(cc.f15734f, SDKUtils.encodeString(str));
    }

    @Override // com.ironsource.df
    public Map<String, Object> a() {
        return f16935a;
    }

    private void a(Context context) {
        f16935a.put(cc.f15733e, y8.b(context));
        f16935a.put(cc.f15734f, y8.d(context));
    }

    private void a(b bVar) {
        Context context = bVar.f16939d;
        za b4 = za.b(context);
        f16935a.put(cc.f15738j, SDKUtils.encodeString(b4.e()));
        f16935a.put(cc.f15739k, SDKUtils.encodeString(b4.f()));
        f16935a.put(cc.f15740l, Integer.valueOf(b4.a()));
        f16935a.put(cc.f15741m, SDKUtils.encodeString(b4.d()));
        f16935a.put(cc.f15742n, SDKUtils.encodeString(b4.c()));
        f16935a.put(cc.f15732d, SDKUtils.encodeString(context.getPackageName()));
        f16935a.put(cc.f15735g, SDKUtils.encodeString(bVar.f16937b));
        f16935a.put("sessionid", SDKUtils.encodeString(bVar.f16936a));
        f16935a.put(cc.f15730b, SDKUtils.encodeString(SDKUtils.getSDKVersion()));
        f16935a.put(cc.f15743o, cc.f15748t);
        f16935a.put("origin", cc.f15745q);
        if (TextUtils.isEmpty(bVar.f16940e)) {
            return;
        }
        f16935a.put(cc.f15737i, SDKUtils.encodeString(bVar.f16940e));
    }

    public static void a(String str) {
        f16935a.put(cc.f15733e, SDKUtils.encodeString(str));
    }
}
