package com.crrepa.z;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
class i implements k {

    /* renamed from: c, reason: collision with root package name */
    private static final int f14080c = 2;

    /* renamed from: a, reason: collision with root package name */
    private final ThreadLocal<String> f14081a = new ThreadLocal<>();

    /* renamed from: b, reason: collision with root package name */
    private final List<e> f14082b = new ArrayList();

    i() {
    }

    @NonNull
    private String g(@NonNull String str, @Nullable Object... objArr) {
        return (objArr == null || objArr.length == 0) ? str : String.format(str, objArr);
    }

    @Override // com.crrepa.z.k
    public void a() {
        this.f14082b.clear();
    }

    @Override // com.crrepa.z.k
    public k b(String str) {
        if (str != null) {
            this.f14081a.set(str);
        }
        return this;
    }

    @Override // com.crrepa.z.k
    public void c(@Nullable String str) {
        if (l.a((CharSequence) str)) {
            a("Empty/Null xml content");
            return;
        }
        try {
            StreamSource streamSource = new StreamSource(new StringReader(str));
            StreamResult streamResult = new StreamResult(new StringWriter());
            Transformer newTransformer = TransformerFactory.newInstance().newTransformer();
            newTransformer.setOutputProperty("indent", "yes");
            newTransformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
            newTransformer.transform(streamSource, streamResult);
            a((Object) streamResult.getWriter().toString().replaceFirst(">", ">\n"));
        } catch (TransformerException unused) {
            e("Invalid xml", new Object[0]);
        }
    }

    @Override // com.crrepa.z.k
    public void d(@NonNull String str, @Nullable Object... objArr) {
        a(2, (Throwable) null, str, objArr);
    }

    @Override // com.crrepa.z.k
    public void e(@NonNull String str, @Nullable Object... objArr) {
        a(null, str, objArr);
    }

    @Override // com.crrepa.z.k
    public void f(@NonNull String str, @Nullable Object... objArr) {
        a(5, (Throwable) null, str, objArr);
    }

    @Nullable
    private String b() {
        String str = this.f14081a.get();
        if (str == null) {
            return null;
        }
        this.f14081a.remove();
        return str;
    }

    @Override // com.crrepa.z.k
    public synchronized void a(int i8, @Nullable String str, @Nullable String str2, @Nullable Throwable th) {
        if (th != null && str2 != null) {
            try {
                str2 = str2 + " : " + l.a(th);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (th != null && str2 == null) {
            str2 = l.a(th);
        }
        if (l.a((CharSequence) str2)) {
            str2 = "Empty/NULL log message";
        }
        for (e eVar : this.f14082b) {
            if (eVar.a(i8, str)) {
                eVar.log(i8, str, str2);
            }
        }
    }

    @Override // com.crrepa.z.k
    public void c(@NonNull String str, @Nullable Object... objArr) {
        a(4, (Throwable) null, str, objArr);
    }

    private synchronized void a(int i8, @Nullable Throwable th, @NonNull String str, @Nullable Object... objArr) {
        l.a(str);
        a(i8, b(), g(str, objArr), th);
    }

    @Override // com.crrepa.z.k
    public void b(@NonNull String str, @Nullable Object... objArr) {
        a(3, (Throwable) null, str, objArr);
    }

    @Override // com.crrepa.z.k
    public void a(@NonNull e eVar) {
        this.f14082b.add((e) l.a(eVar));
    }

    @Override // com.crrepa.z.k
    public void a(@Nullable Object obj) {
        a(3, (Throwable) null, l.b(obj), new Object[0]);
    }

    @Override // com.crrepa.z.k
    public void a(@Nullable String str) {
        if (l.a((CharSequence) str)) {
            a("Empty/Null json content");
            return;
        }
        try {
            String trim = str.trim();
            if (trim.startsWith("{")) {
                a((Object) new JSONObject(trim).toString(2));
            } else if (trim.startsWith("[")) {
                a((Object) new JSONArray(trim).toString(2));
            } else {
                e("Invalid Json", new Object[0]);
            }
        } catch (JSONException unused) {
            e("Invalid Json", new Object[0]);
        }
    }

    @Override // com.crrepa.z.k
    public void a(@NonNull String str, @Nullable Object... objArr) {
        a(7, (Throwable) null, str, objArr);
    }

    @Override // com.crrepa.z.k
    public void a(@Nullable Throwable th, @NonNull String str, @Nullable Object... objArr) {
        a(6, th, str, objArr);
    }
}
