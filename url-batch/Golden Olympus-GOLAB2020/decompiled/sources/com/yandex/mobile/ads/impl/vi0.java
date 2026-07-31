package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import com.yandex.mobile.ads.impl.qq1;
import com.yandex.mobile.ads.impl.wc1;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class vi0 {

    /* renamed from: a, reason: collision with root package name */
    private final cq1 f33632a;

    /* renamed from: b, reason: collision with root package name */
    private final b f33633b;

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<String, a> f33634c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private final HashMap<String, a> f33635d = new HashMap<>();

    /* renamed from: e, reason: collision with root package name */
    private final Handler f33636e = new Handler(Looper.getMainLooper());

    /* renamed from: f, reason: collision with root package name */
    private Runnable f33637f;

    /* JADX INFO: Access modifiers changed from: private */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        private final op1<?> f33638a;

        /* renamed from: b, reason: collision with root package name */
        private Bitmap f33639b;

        /* renamed from: c, reason: collision with root package name */
        private hi2 f33640c;

        /* renamed from: d, reason: collision with root package name */
        private final ArrayList f33641d;

        public a(aj0 aj0Var, c cVar) {
            ArrayList arrayList = new ArrayList();
            this.f33641d = arrayList;
            this.f33638a = aj0Var;
            arrayList.add(cVar);
        }
    }

    public interface b {
        Bitmap a(String str);

        void a(String str, Bitmap bitmap);
    }

    public class c {

        /* renamed from: a, reason: collision with root package name */
        private Bitmap f33642a;

        /* renamed from: b, reason: collision with root package name */
        private final d f33643b;

        /* renamed from: c, reason: collision with root package name */
        private final String f33644c;

        public c(Bitmap bitmap, String str, d dVar) {
            this.f33642a = bitmap;
            this.f33644c = str;
            this.f33643b = dVar;
        }

        public final void a() {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                throw new IllegalStateException("Must be invoked from the main thread.");
            }
            if (this.f33643b == null) {
                return;
            }
            a aVar = (a) vi0.this.f33634c.get(this.f33644c);
            if (aVar != null) {
                aVar.f33641d.remove(this);
                if (aVar.f33641d.size() == 0) {
                    aVar.f33638a.a();
                    vi0.this.f33634c.remove(this.f33644c);
                    return;
                }
                return;
            }
            a aVar2 = (a) vi0.this.f33635d.get(this.f33644c);
            if (aVar2 != null) {
                aVar2.f33641d.remove(this);
                if (aVar2.f33641d.size() == 0) {
                    aVar2.f33638a.a();
                }
                if (aVar2.f33641d.size() == 0) {
                    vi0.this.f33635d.remove(this.f33644c);
                }
            }
        }

        public final Bitmap b() {
            return this.f33642a;
        }
    }

    public interface d extends qq1.a {
        void a(c cVar, boolean z4);
    }

    public vi0(cq1 cq1Var, wc1.b bVar) {
        this.f33632a = cq1Var;
        this.f33633b = bVar;
    }

    public String a(String str, int i4, int i5, ImageView.ScaleType scaleType) {
        throw null;
    }

    public final c a(String str, d dVar, int i4, int i5) {
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_INSIDE;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            String a4 = a(str, i4, i5, scaleType);
            Bitmap a5 = this.f33633b.a(a4);
            if (a5 != null) {
                c cVar = new c(a5, null, null);
                dVar.a(cVar, true);
                return cVar;
            }
            c cVar2 = new c(null, a4, dVar);
            dVar.a(cVar2, true);
            a aVar = this.f33634c.get(a4);
            if (aVar == null) {
                aVar = this.f33635d.get(a4);
            }
            if (aVar != null) {
                aVar.f33641d.add(cVar2);
                return cVar2;
            }
            aj0 aj0Var = new aj0(str, new si0(this, a4), i4, i5, scaleType, Bitmap.Config.RGB_565, new ti0(this, a4));
            this.f33632a.a(aj0Var);
            this.f33634c.put(a4, new a(aj0Var, cVar2));
            return cVar2;
        }
        throw new IllegalStateException("Must be invoked from the main thread.");
    }
}
