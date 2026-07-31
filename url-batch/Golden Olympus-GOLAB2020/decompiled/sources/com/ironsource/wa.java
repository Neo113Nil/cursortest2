package com.ironsource;

import android.text.TextUtils;
import com.ironsource.fh;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class wa {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, va> f20178a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, va> f20179b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, va> f20180c = new LinkedHashMap();

    private Map<String, va> b(fh.e eVar) {
        if (eVar.name().equalsIgnoreCase(fh.e.RewardedVideo.name())) {
            return this.f20178a;
        }
        if (eVar.name().equalsIgnoreCase(fh.e.Interstitial.name())) {
            return this.f20179b;
        }
        if (eVar.name().equalsIgnoreCase(fh.e.Banner.name())) {
            return this.f20180c;
        }
        return null;
    }

    public va a(fh.e eVar, sj sjVar) {
        va vaVar = new va(sjVar);
        a(eVar, sjVar.e(), vaVar);
        return vaVar;
    }

    public va a(fh.e eVar, String str) {
        Map<String, va> b4;
        if (TextUtils.isEmpty(str) || (b4 = b(eVar)) == null) {
            return null;
        }
        return b4.get(str);
    }

    public void b(fh.e eVar, String str) {
        Map<String, va> b4;
        va remove;
        if (TextUtils.isEmpty(str) || (b4 = b(eVar)) == null || (remove = b4.remove(str)) == null) {
            return;
        }
        remove.a();
    }

    public va a(fh.e eVar, String str, Map<String, String> map, jo joVar) {
        va vaVar = new va(str, str, map, joVar);
        a(eVar, str, vaVar);
        return vaVar;
    }

    public Collection<va> a(fh.e eVar) {
        Map<String, va> b4 = b(eVar);
        return b4 != null ? b4.values() : new ArrayList();
    }

    private void a(fh.e eVar, String str, va vaVar) {
        Map<String, va> b4;
        if (TextUtils.isEmpty(str) || vaVar == null || (b4 = b(eVar)) == null) {
            return;
        }
        b4.put(str, vaVar);
    }
}
