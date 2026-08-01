package com.apm.insight.runtime;

import android.content.Context;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class t {
    private String a = null;
    private int b = -1;

    public t(Context context) {
    }

    public String a() {
        if (!TextUtils.isEmpty(this.a) && !"0".equals(this.a)) {
            return this.a;
        }
        String d = com.apm.insight.i.a().d();
        this.a = d;
        if (!TextUtils.isEmpty(d) && !"0".equals(this.a)) {
            return this.a;
        }
        String b = s.a().b();
        this.a = b;
        return b;
    }

    public void a(String str) {
        this.a = str;
        s.a().b(str);
    }

    public boolean b() {
        return this.a != null;
    }
}
