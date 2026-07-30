package com.baidu.mapsdkplatform.comapi.util;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private static volatile f f8273a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f8274b = false;

    /* renamed from: c, reason: collision with root package name */
    private boolean f8275c = true;

    /* renamed from: d, reason: collision with root package name */
    private final List<e> f8276d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private e f8277e = null;

    private f() {
    }

    public static f b() {
        if (f8273a == null) {
            synchronized (f.class) {
                try {
                    if (f8273a == null) {
                        f8273a = new f();
                    }
                } finally {
                }
            }
        }
        return f8273a;
    }

    public e a() {
        return this.f8277e;
    }

    public e a(Context context) {
        String string = context.getSharedPreferences("map_pref", 0).getString("PREFFERED_SD_CARD", "");
        if (string == null || string.length() <= 0) {
            return null;
        }
        for (e eVar : this.f8276d) {
            if (eVar.c().equals(string)) {
                return eVar;
            }
        }
        return null;
    }

    public void b(Context context) {
        if (this.f8274b || context == null) {
            return;
        }
        this.f8274b = true;
        try {
            this.f8275c = false;
            this.f8277e = new e(context);
            this.f8276d.clear();
            this.f8276d.add(this.f8277e);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        try {
            if (this.f8276d.size() > 0) {
                e eVar = null;
                int i8 = 0;
                for (e eVar2 : this.f8276d) {
                    if (new File(eVar2.a()).exists()) {
                        i8++;
                        eVar = eVar2;
                    }
                }
                if (i8 == 0) {
                    e a8 = a(context);
                    this.f8277e = a8;
                    if (a8 == null) {
                        Iterator<e> it = this.f8276d.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            e next = it.next();
                            if (a(context, next)) {
                                this.f8277e = next;
                                break;
                            }
                        }
                    }
                } else if (i8 == 1) {
                    if (a(context, eVar)) {
                        this.f8277e = eVar;
                    }
                } else {
                    this.f8277e = a(context);
                }
                if (this.f8277e == null) {
                    this.f8277e = this.f8276d.get(0);
                }
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
        try {
            if (this.f8277e == null) {
                this.f8275c = false;
                this.f8277e = new e(context);
                this.f8276d.clear();
                this.f8276d.add(this.f8277e);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public boolean a(Context context, e eVar) {
        String c8 = eVar.c();
        SharedPreferences.Editor edit = context.getSharedPreferences("map_pref", 0).edit();
        edit.putString("PREFFERED_SD_CARD", c8);
        return edit.commit();
    }
}
