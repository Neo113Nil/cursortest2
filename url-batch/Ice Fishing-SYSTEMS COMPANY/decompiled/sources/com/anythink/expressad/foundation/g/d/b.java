package com.anythink.expressad.foundation.g.d;

import android.content.Context;
import android.graphics.Bitmap;
import com.anythink.core.common.d.t;
import com.anythink.expressad.foundation.g.d.d;
import com.anythink.expressad.foundation.h.u;
import com.anythink.expressad.foundation.h.v;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f19343a = "ImageLoader";

    /* renamed from: b, reason: collision with root package name */
    private static final int f19344b = 1;

    /* renamed from: c, reason: collision with root package name */
    private static final int f19345c = 2;

    /* renamed from: d, reason: collision with root package name */
    private static final String f19346d = "message_key";

    /* renamed from: e, reason: collision with root package name */
    private static final String f19347e = "message_bitmap";

    /* renamed from: f, reason: collision with root package name */
    private static final String f19348f = "message_message";

    /* renamed from: g, reason: collision with root package name */
    private static b f19349g;

    /* renamed from: h, reason: collision with root package name */
    private com.anythink.expressad.foundation.g.h.c f19350h;

    /* renamed from: j, reason: collision with root package name */
    private final LinkedHashMap<String, List<c>> f19351j = new LinkedHashMap<>();
    private com.anythink.expressad.foundation.g.a.e<String, Bitmap> i = new com.anythink.expressad.foundation.g.a.c(((int) Runtime.getRuntime().maxMemory()) / 5);

    /* renamed from: com.anythink.expressad.foundation.g.d.b$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f19352a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19353b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f19354c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ c f19355d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f19356e = false;

        public AnonymousClass1(String str, String str2, String str3, c cVar) {
            this.f19352a = str;
            this.f19353b = str2;
            this.f19354c = str3;
            this.f19355d = cVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            File file = new File(this.f19352a);
            Bitmap a9 = b.this.a(this.f19353b);
            if (a9 != null && !a9.isRecycled()) {
                b.a(b.this, this.f19354c, a9, this.f19355d);
                return;
            }
            if (file.length() <= 0) {
                b.a(b.this, this.f19354c, this.f19353b, this.f19352a, false, this.f19355d);
                return;
            }
            Bitmap a10 = a.a(this.f19352a);
            if (a10 == null || a10.isRecycled()) {
                b.a(b.this, this.f19354c, this.f19353b, this.f19352a, true, this.f19355d);
            } else {
                b.this.a(this.f19353b, a10);
                b.a(b.this, this.f19354c, a10, this.f19355d);
            }
        }
    }

    /* renamed from: com.anythink.expressad.foundation.g.d.b$2, reason: invalid class name */
    public class AnonymousClass2 implements d.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f19358a;

        public AnonymousClass2(String str) {
            this.f19358a = str;
        }

        @Override // com.anythink.expressad.foundation.g.d.d.a
        public final void a(final String str, final String str2) {
            com.anythink.core.common.v.b.b.a().a(new com.anythink.core.common.v.b.d() { // from class: com.anythink.expressad.foundation.g.d.b.2.1
                @Override // com.anythink.core.common.v.b.d
                public final void a() {
                    synchronized (b.this.f19351j) {
                        try {
                            Bitmap a9 = a.a(str2);
                            b.this.a(str, a9);
                            LinkedList linkedList = (LinkedList) b.this.f19351j.remove(str);
                            if (linkedList != null) {
                                Iterator it = linkedList.iterator();
                                while (it.hasNext()) {
                                    c cVar = (c) it.next();
                                    AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                    b.a(b.this, anonymousClass2.f19358a, a9, cVar);
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            });
        }

        @Override // com.anythink.expressad.foundation.g.d.d.a
        public final void b(final String str, final String str2) {
            com.anythink.core.common.v.b.b.a().a(new com.anythink.core.common.v.b.d() { // from class: com.anythink.expressad.foundation.g.d.b.2.2
                @Override // com.anythink.core.common.v.b.d
                public final void a() {
                    synchronized (b.this.f19351j) {
                        try {
                            LinkedList linkedList = (LinkedList) b.this.f19351j.remove(str);
                            if (linkedList != null) {
                                Iterator it = linkedList.iterator();
                                while (it.hasNext()) {
                                    c cVar = (c) it.next();
                                    AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                    b bVar = b.this;
                                    String str3 = anonymousClass2.f19358a;
                                    t.b().b(bVar.new AnonymousClass4(cVar, str2, str3));
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            });
        }
    }

    /* renamed from: com.anythink.expressad.foundation.g.d.b$3, reason: invalid class name */
    public class AnonymousClass3 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f19366a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Bitmap f19367b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f19368c;

        public AnonymousClass3(c cVar, Bitmap bitmap, String str) {
            this.f19366a = cVar;
            this.f19367b = bitmap;
            this.f19368c = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f19366a != null) {
                Bitmap bitmap = this.f19367b;
                if (bitmap == null || bitmap.isRecycled()) {
                    this.f19366a.a("bitmap no available", this.f19368c);
                } else {
                    this.f19366a.a(this.f19367b, this.f19368c);
                }
            }
        }
    }

    /* renamed from: com.anythink.expressad.foundation.g.d.b$4, reason: invalid class name */
    public class AnonymousClass4 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f19370a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19371b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f19372c;

        public AnonymousClass4(c cVar, String str, String str2) {
            this.f19370a = cVar;
            this.f19371b = str;
            this.f19372c = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            c cVar = this.f19370a;
            if (cVar != null) {
                cVar.a(this.f19371b, this.f19372c);
            }
        }
    }

    private b(Context context) {
        this.f19350h = new com.anythink.expressad.foundation.g.h.c(context);
    }

    private void b() {
        this.i.b();
        LinkedHashMap<String, List<c>> linkedHashMap = this.f19351j;
        if (linkedHashMap != null) {
            linkedHashMap.clear();
        }
    }

    private Bitmap d(String str) {
        Bitmap a9;
        if (v.a(str)) {
            return null;
        }
        String a10 = u.a(str);
        File file = new File(a10);
        if (a(str) != null) {
            return a(str);
        }
        if (!file.exists() || (a9 = a.a(a10)) == null) {
            return null;
        }
        a(str, a9);
        return a9;
    }

    public final void c(String str) {
        try {
            com.anythink.expressad.foundation.g.a.e<String, Bitmap> eVar = this.i;
            if (eVar == null || !eVar.a().contains(str)) {
                return;
            }
            this.i.a(str);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public final void a(String str, Bitmap bitmap) {
        if (a(str) != null || bitmap == null) {
            return;
        }
        this.i.a(str, bitmap);
    }

    public final Bitmap a(String str) {
        return this.i.b(str);
    }

    public final boolean b(String str) {
        if (v.a(str)) {
            return false;
        }
        return a(str) != null || new File(u.a(str)).exists();
    }

    public static b a(Context context) {
        if (f19349g == null) {
            f19349g = new b(context);
        }
        return f19349g;
    }

    private void c() {
        com.anythink.expressad.foundation.g.a.e<String, Bitmap> eVar = this.i;
        if (eVar != null) {
            eVar.b();
        }
    }

    public static void a() {
        com.anythink.expressad.foundation.g.a.e<String, Bitmap> eVar = f19349g.i;
        if (eVar != null) {
            eVar.b();
        }
    }

    public final void a(String str, c cVar) {
        String a9 = u.a(str);
        if (v.a(str) || v.a(str) || v.a(a9)) {
            return;
        }
        com.anythink.core.common.v.b.b.a().a(new AnonymousClass1(a9, str, str, cVar));
    }

    private void a(String str, String str2, String str3, c cVar) {
        if (v.a(str) || v.a(str2) || v.a(str3)) {
            return;
        }
        com.anythink.core.common.v.b.b.a().a(new AnonymousClass1(str3, str2, str, cVar));
    }

    private void a(String str, String str2, String str3, boolean z8, c cVar) {
        synchronized (this.f19351j) {
            try {
                if (!this.f19351j.containsKey(str2)) {
                    if (cVar != null) {
                        LinkedList linkedList = new LinkedList();
                        linkedList.add(cVar);
                        this.f19351j.put(str2, linkedList);
                    }
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(str);
                    d dVar = new d(str, str2, str3);
                    dVar.a(z8);
                    dVar.a(anonymousClass2);
                    this.f19350h.a(dVar);
                } else {
                    LinkedList linkedList2 = (LinkedList) this.f19351j.get(str2);
                    if (linkedList2 != null && cVar != null && !linkedList2.contains(cVar)) {
                        linkedList2.add(cVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private d a(String str, String str2, String str3, boolean z8) {
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(str);
        d dVar = new d(str, str2, str3);
        dVar.a(z8);
        dVar.a(anonymousClass2);
        return dVar;
    }

    private void a(String str, Bitmap bitmap, c cVar) {
        t.b().b(new AnonymousClass3(cVar, bitmap, str));
    }

    private void a(String str, String str2, c cVar) {
        t.b().b(new AnonymousClass4(cVar, str2, str));
    }

    public static /* synthetic */ void a(b bVar, String str, Bitmap bitmap, c cVar) {
        t.b().b(bVar.new AnonymousClass3(cVar, bitmap, str));
    }

    public static /* synthetic */ void a(b bVar, String str, String str2, String str3, boolean z8, c cVar) {
        synchronized (bVar.f19351j) {
            try {
                if (!bVar.f19351j.containsKey(str2)) {
                    if (cVar != null) {
                        LinkedList linkedList = new LinkedList();
                        linkedList.add(cVar);
                        bVar.f19351j.put(str2, linkedList);
                    }
                    AnonymousClass2 anonymousClass2 = bVar.new AnonymousClass2(str);
                    d dVar = new d(str, str2, str3);
                    dVar.a(z8);
                    dVar.a(anonymousClass2);
                    bVar.f19350h.a(dVar);
                } else {
                    LinkedList linkedList2 = (LinkedList) bVar.f19351j.get(str2);
                    if (linkedList2 != null && cVar != null && !linkedList2.contains(cVar)) {
                        linkedList2.add(cVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
