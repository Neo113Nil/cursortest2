package com.baidu.platform.comapi.e;

import com.baidu.mapapi.map.MapLanguage;

/* loaded from: classes2.dex */
public class b extends a {

    /* renamed from: c, reason: collision with root package name */
    private static volatile b f9009c;

    private b() {
        super("map_language");
    }

    public static b e() {
        if (f9009c != null) {
            return f9009c;
        }
        synchronized (b.class) {
            try {
                if (f9009c != null) {
                    return f9009c;
                }
                f9009c = new b();
                return f9009c;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(MapLanguage mapLanguage) {
        if (mapLanguage == null) {
            return;
        }
        b(mapLanguage.ordinal());
    }

    public void c() {
        b();
    }

    public MapLanguage d() {
        MapLanguage mapLanguage = MapLanguage.CHINESE;
        int a8 = a(mapLanguage.ordinal());
        if (mapLanguage.ordinal() == a8) {
            return mapLanguage;
        }
        MapLanguage mapLanguage2 = MapLanguage.ENGLISH;
        if (mapLanguage2.ordinal() == a8) {
            return mapLanguage2;
        }
        throw new IllegalArgumentException();
    }
}
