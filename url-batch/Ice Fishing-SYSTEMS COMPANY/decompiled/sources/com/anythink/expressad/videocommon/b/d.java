package com.anythink.expressad.videocommon.b;

import android.text.TextUtils;
import com.anythink.expressad.videocommon.b.i;
import java.util.Iterator;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class d implements i.c {

    /* renamed from: a, reason: collision with root package name */
    private static String f22429a = "DownLoadH5SourceListener";

    /* renamed from: b, reason: collision with root package name */
    private ConcurrentMap<String, d> f22430b;

    /* renamed from: c, reason: collision with root package name */
    private n f22431c;

    /* renamed from: d, reason: collision with root package name */
    private CopyOnWriteArrayList<i.d> f22432d;

    /* renamed from: e, reason: collision with root package name */
    private String f22433e;

    /* renamed from: f, reason: collision with root package name */
    private String f22434f;

    public d(ConcurrentMap<String, d> concurrentMap, n nVar, i.d dVar, String str, String str2) {
        CopyOnWriteArrayList<i.d> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        this.f22432d = copyOnWriteArrayList;
        this.f22430b = concurrentMap;
        this.f22431c = nVar;
        copyOnWriteArrayList.add(dVar);
        this.f22433e = str;
        this.f22434f = str2;
    }

    @Override // com.anythink.expressad.videocommon.b.i.c
    public final void a() {
    }

    public final void a(i.d dVar) {
        this.f22432d.add(dVar);
    }

    @Override // com.anythink.expressad.videocommon.b.i.c
    public final void a(String str, String str2) {
        String str3;
        ConcurrentMap<String, d> concurrentMap;
        try {
            concurrentMap = this.f22430b;
        } catch (Exception e6) {
            if (com.anythink.expressad.a.f17776a) {
                e6.printStackTrace();
            }
            try {
                str3 = e6.getMessage();
            } catch (Throwable th) {
                th.getMessage();
                str3 = "";
            }
        }
        if (concurrentMap == null) {
            Iterator<i.d> it = this.f22432d.iterator();
            while (it.hasNext()) {
                i.d next = it.next();
                if (next != null) {
                    next.a(str2, "mResDownloadingMap  is null");
                    this.f22432d.remove(next);
                }
            }
            return;
        }
        if (concurrentMap.containsKey(this.f22434f)) {
            this.f22430b.remove(this.f22434f);
        }
        if (!TextUtils.isEmpty(str)) {
            String a9 = this.f22431c.a(str2, str);
            if (TextUtils.isEmpty(a9)) {
                Iterator<i.d> it2 = this.f22432d.iterator();
                while (it2.hasNext()) {
                    i.d next2 = it2.next();
                    if (next2 != null) {
                        next2.a(str2);
                        this.f22432d.remove(next2);
                    }
                }
                return;
            }
            str3 = "data save failed:".concat(String.valueOf(a9));
        } else {
            str3 = "response data is error";
        }
        Iterator<i.d> it3 = this.f22432d.iterator();
        while (it3.hasNext()) {
            i.d next3 = it3.next();
            if (next3 != null) {
                next3.a(str2, str3);
            }
        }
    }

    @Override // com.anythink.expressad.videocommon.b.i.c
    public final void a(String str) {
        ConcurrentMap<String, d> concurrentMap;
        try {
            concurrentMap = this.f22430b;
        } catch (Exception e6) {
            if (com.anythink.expressad.a.f17776a) {
                e6.printStackTrace();
            }
            try {
                str = e6.getMessage();
            } catch (Throwable th) {
                th.getMessage();
            }
        }
        if (concurrentMap == null) {
            Iterator<i.d> it = this.f22432d.iterator();
            while (it.hasNext()) {
                i.d next = it.next();
                if (next != null) {
                    next.a(this.f22433e, "mResDownloadingMap  is null");
                    this.f22432d.remove(next);
                }
            }
            return;
        }
        if (concurrentMap.containsKey(this.f22434f)) {
            this.f22430b.remove(this.f22434f);
        }
        Iterator<i.d> it2 = this.f22432d.iterator();
        while (it2.hasNext()) {
            i.d next2 = it2.next();
            if (next2 != null) {
                next2.a(this.f22433e, str);
                this.f22432d.remove(next2);
            }
        }
    }
}
