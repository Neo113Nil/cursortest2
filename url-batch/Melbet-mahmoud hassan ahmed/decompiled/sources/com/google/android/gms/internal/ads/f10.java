package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class f10 {

    /* renamed from: a, reason: collision with root package name */
    private final Collection<e10<?>> f4938a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final Collection<e10<String>> f4939b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final Collection<e10<String>> f4940c = new ArrayList();

    public final List<String> a() {
        ArrayList arrayList = new ArrayList();
        Iterator<e10<String>> it = this.f4939b.iterator();
        while (it.hasNext()) {
            String str = (String) sw.c().b(it.next());
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        arrayList.addAll(n10.a());
        return arrayList;
    }

    public final List<String> b() {
        List<String> a7 = a();
        Iterator<e10<String>> it = this.f4940c.iterator();
        while (it.hasNext()) {
            String str = (String) sw.c().b(it.next());
            if (!TextUtils.isEmpty(str)) {
                a7.add(str);
            }
        }
        a7.addAll(n10.b());
        return a7;
    }

    public final void c(e10<String> e10Var) {
        this.f4939b.add(e10Var);
    }

    public final void d(e10 e10Var) {
        this.f4938a.add(e10Var);
    }

    public final void e(SharedPreferences.Editor editor, int i7, JSONObject jSONObject) {
        for (e10<?> e10Var : this.f4938a) {
            if (e10Var.e() == 1) {
                e10Var.d(editor, e10Var.a(jSONObject));
            }
        }
        if (jSONObject != null) {
            editor.putString("flag_configuration", jSONObject.toString());
        } else {
            io0.d("Flag Json is null.");
        }
    }
}
