package com.anythink.core.common.m;

import android.text.TextUtils;
import com.anythink.core.api.AdError;
import com.anythink.core.api.ErrorCode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class n extends b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f14837a = "n";

    /* renamed from: c, reason: collision with root package name */
    private final q f14839c;

    /* renamed from: g, reason: collision with root package name */
    private volatile boolean f14843g;

    /* renamed from: h, reason: collision with root package name */
    private volatile boolean f14844h;

    /* renamed from: b, reason: collision with root package name */
    private final Object f14838b = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final AtomicInteger f14840d = new AtomicInteger(0);

    /* renamed from: e, reason: collision with root package name */
    private final List<a> f14841e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private final int f14842f = 2;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        int f14845a;

        /* renamed from: b, reason: collision with root package name */
        String f14846b;

        /* renamed from: c, reason: collision with root package name */
        AdError f14847c;

        public a(int i, String str, AdError adError) {
            this.f14845a = i;
            this.f14846b = str;
            this.f14847c = adError;
        }
    }

    public n(q qVar) {
        this.f14839c = qVar;
    }

    private void a(int i, Object obj) {
        this.f14844h = true;
        if (this.f14839c == null || this.f14843g) {
            return;
        }
        this.f14843g = true;
        this.f14839c.onLoadFinish(i, obj);
    }

    private void b() {
        if (this.f14839c == null || this.f14843g) {
            return;
        }
        this.f14843g = true;
        StringBuilder sb = new StringBuilder();
        Iterator it = new ArrayList(this.f14841e).iterator();
        AdError adError = null;
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar != null) {
                if (TextUtils.isEmpty(sb.toString())) {
                    sb.append(aVar.f14846b);
                } else {
                    sb.append(",");
                    sb.append(aVar.f14846b);
                }
                adError = aVar.f14847c;
            }
        }
        this.f14841e.clear();
        if (adError == null) {
            adError = ErrorCode.getErrorCode(ErrorCode.exception, "", "");
        }
        this.f14839c.onLoadError(0, sb.toString(), adError);
    }

    @Override // com.anythink.core.common.m.q
    public void onLoadError(int i, String str, AdError adError) {
        synchronized (this.f14838b) {
            try {
                this.f14841e.add(new a(i, str, adError));
                if (this.f14840d.incrementAndGet() == this.f14842f && this.f14839c != null && !this.f14843g) {
                    this.f14843g = true;
                    StringBuilder sb = new StringBuilder();
                    Iterator it = new ArrayList(this.f14841e).iterator();
                    AdError adError2 = null;
                    while (it.hasNext()) {
                        a aVar = (a) it.next();
                        if (aVar != null) {
                            if (TextUtils.isEmpty(sb.toString())) {
                                sb.append(aVar.f14846b);
                            } else {
                                sb.append(",");
                                sb.append(aVar.f14846b);
                            }
                            adError2 = aVar.f14847c;
                        }
                    }
                    this.f14841e.clear();
                    if (adError2 == null) {
                        adError2 = ErrorCode.getErrorCode(ErrorCode.exception, "", "");
                    }
                    this.f14839c.onLoadError(0, sb.toString(), adError2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.anythink.core.common.m.q
    public void onLoadFinish(int i, Object obj) {
        synchronized (this.f14838b) {
            try {
                this.f14844h = true;
                if (this.f14839c != null && !this.f14843g) {
                    this.f14843g = true;
                    this.f14839c.onLoadFinish(i, obj);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean a() {
        boolean z8;
        synchronized (this.f14838b) {
            z8 = this.f14844h;
        }
        return z8;
    }
}
