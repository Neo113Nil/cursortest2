package com.anythink.expressad.foundation.a.a;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f18653a = "a";

    /* renamed from: c, reason: collision with root package name */
    private static volatile a f18654c;

    /* renamed from: b, reason: collision with root package name */
    SharedPreferences f18655b;

    private a() {
    }

    public static a a() {
        if (f18654c == null) {
            synchronized (a.class) {
                try {
                    if (f18654c == null) {
                        f18654c = new a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f18654c;
    }

    private int b(String str, int i) {
        try {
            Context e6 = com.anythink.expressad.foundation.b.a.c().e();
            if (e6 == null) {
                return i;
            }
            if (this.f18655b == null) {
                this.f18655b = e6.getSharedPreferences(com.anythink.expressad.foundation.g.a.f19253s, 0);
            }
            return this.f18655b.getInt(str, i);
        } catch (Exception e9) {
            e9.printStackTrace();
            return i;
        }
    }

    private int c(String str) {
        try {
            Context e6 = com.anythink.expressad.foundation.b.a.c().e();
            if (e6 == null) {
                return 0;
            }
            if (this.f18655b == null) {
                this.f18655b = e6.getSharedPreferences(com.anythink.expressad.foundation.g.a.f19253s, 0);
            }
            return this.f18655b.getInt(str, 0);
        } catch (Exception e9) {
            e9.printStackTrace();
            return 0;
        }
    }

    private Long d(String str) {
        try {
            Context e6 = com.anythink.expressad.foundation.b.a.c().e();
            if (e6 == null) {
                return 0L;
            }
            if (this.f18655b == null) {
                this.f18655b = e6.getSharedPreferences(com.anythink.expressad.foundation.g.a.f19253s, 0);
            }
            return Long.valueOf(this.f18655b.getLong(str, 0L));
        } catch (Exception e9) {
            e9.printStackTrace();
            return 0L;
        }
    }

    private List<String> b() {
        ArrayList arrayList = new ArrayList();
        Context e6 = com.anythink.expressad.foundation.b.a.c().e();
        if (e6 == null) {
            return null;
        }
        if (this.f18655b == null) {
            this.f18655b = e6.getSharedPreferences(com.anythink.expressad.foundation.g.a.f19253s, 0);
        }
        Iterator<Map.Entry<String, ?>> it = this.f18655b.getAll().entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getKey());
        }
        return arrayList;
    }

    public final void a(String str, String str2) {
        try {
            Context e6 = com.anythink.expressad.foundation.b.a.c().e();
            if (e6 == null) {
                return;
            }
            if (this.f18655b == null) {
                this.f18655b = e6.getSharedPreferences(com.anythink.expressad.foundation.g.a.f19253s, 0);
            }
            SharedPreferences.Editor edit = this.f18655b.edit();
            edit.putString(str, str2);
            edit.apply();
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    public final void b(String str) {
        Context e6 = com.anythink.expressad.foundation.b.a.c().e();
        if (e6 == null) {
            return;
        }
        if (this.f18655b == null) {
            this.f18655b = e6.getSharedPreferences(com.anythink.expressad.foundation.g.a.f19253s, 0);
        }
        this.f18655b.edit().remove(str).apply();
    }

    private void a(String str, int i) {
        try {
            Context e6 = com.anythink.expressad.foundation.b.a.c().e();
            if (e6 == null) {
                return;
            }
            if (this.f18655b == null) {
                this.f18655b = e6.getSharedPreferences(com.anythink.expressad.foundation.g.a.f19253s, 0);
            }
            SharedPreferences.Editor edit = this.f18655b.edit();
            edit.putInt(str, i);
            edit.apply();
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    private void a(String str, long j9) {
        try {
            Context e6 = com.anythink.expressad.foundation.b.a.c().e();
            if (e6 == null) {
                return;
            }
            if (this.f18655b == null) {
                this.f18655b = e6.getSharedPreferences(com.anythink.expressad.foundation.g.a.f19253s, 0);
            }
            SharedPreferences.Editor edit = this.f18655b.edit();
            edit.putLong(str, j9);
            edit.apply();
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    public final String a(String str) {
        try {
            Context e6 = com.anythink.expressad.foundation.b.a.c().e();
            if (e6 == null) {
                return null;
            }
            if (this.f18655b == null) {
                this.f18655b = e6.getSharedPreferences(com.anythink.expressad.foundation.g.a.f19253s, 0);
            }
            return this.f18655b.getString(str, "");
        } catch (Exception e9) {
            e9.printStackTrace();
            return null;
        }
    }
}
