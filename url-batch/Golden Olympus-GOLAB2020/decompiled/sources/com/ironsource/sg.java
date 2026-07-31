package com.ironsource;

import android.net.Uri;
import android.util.Pair;
import java.io.DataOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class sg {

    /* renamed from: a, reason: collision with root package name */
    private static final String f19568a = "POST";

    /* renamed from: b, reason: collision with root package name */
    private static final String f19569b = "GET";

    /* renamed from: c, reason: collision with root package name */
    private static final String f19570c = "ISHttpService";

    public static class a {

        /* renamed from: h, reason: collision with root package name */
        private static final int f19571h = 15000;

        /* renamed from: i, reason: collision with root package name */
        private static final int f19572i = 15000;

        /* renamed from: j, reason: collision with root package name */
        private static final String f19573j = "UTF-8";

        /* renamed from: a, reason: collision with root package name */
        final String f19574a;

        /* renamed from: b, reason: collision with root package name */
        final String f19575b;

        /* renamed from: c, reason: collision with root package name */
        final String f19576c;

        /* renamed from: d, reason: collision with root package name */
        final int f19577d;

        /* renamed from: e, reason: collision with root package name */
        final int f19578e;

        /* renamed from: f, reason: collision with root package name */
        final String f19579f;

        /* renamed from: g, reason: collision with root package name */
        ArrayList<Pair<String, String>> f19580g;

        /* renamed from: com.ironsource.sg$a$a, reason: collision with other inner class name */
        static class C0164a {

            /* renamed from: b, reason: collision with root package name */
            String f19582b;

            /* renamed from: d, reason: collision with root package name */
            String f19584d;

            /* renamed from: a, reason: collision with root package name */
            List<Pair<String, String>> f19581a = new ArrayList();

            /* renamed from: c, reason: collision with root package name */
            String f19583c = "POST";

            /* renamed from: e, reason: collision with root package name */
            int f19585e = 15000;

            /* renamed from: f, reason: collision with root package name */
            int f19586f = 15000;

            /* renamed from: g, reason: collision with root package name */
            String f19587g = a.f19573j;

            C0164a() {
            }

            C0164a a(int i4) {
                this.f19585e = i4;
                return this;
            }

            C0164a b(int i4) {
                this.f19586f = i4;
                return this;
            }

            C0164a c(String str) {
                this.f19582b = str;
                return this;
            }

            C0164a d(String str) {
                this.f19583c = str;
                return this;
            }

            C0164a a(Pair<String, String> pair) {
                this.f19581a.add(pair);
                return this;
            }

            C0164a b(String str) {
                this.f19587g = str;
                return this;
            }

            C0164a a(String str) {
                this.f19584d = str;
                return this;
            }

            C0164a a(List<Pair<String, String>> list) {
                this.f19581a.addAll(list);
                return this;
            }

            a a() {
                return new a(this);
            }
        }

        public a(C0164a c0164a) {
            this.f19574a = c0164a.f19582b;
            this.f19575b = c0164a.f19583c;
            this.f19576c = c0164a.f19584d;
            this.f19580g = new ArrayList<>(c0164a.f19581a);
            this.f19577d = c0164a.f19585e;
            this.f19578e = c0164a.f19586f;
            this.f19579f = c0164a.f19587g;
        }

        boolean a() {
            return "POST".equals(this.f19575b);
        }
    }

    public static gq a(String str, String str2, List<Pair<String, String>> list) {
        Uri build = Uri.parse(str).buildUpon().encodedQuery(str2).build();
        a.C0164a c0164a = new a.C0164a();
        c0164a.c(build.toString()).a(str2).d("GET").a(list);
        return b(c0164a.a());
    }

    /*  JADX ERROR: Types fix failed
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:183)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:242)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
        */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0067: MOVE (r8 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:46:0x0067 */
    public static com.ironsource.gq b(com.ironsource.sg.a r9) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sg.b(com.ironsource.sg$a):com.ironsource.gq");
    }

    private static HttpURLConnection a(a aVar) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(aVar.f19574a).openConnection();
        httpURLConnection.setConnectTimeout(aVar.f19577d);
        httpURLConnection.setReadTimeout(aVar.f19578e);
        httpURLConnection.setRequestMethod(aVar.f19575b);
        return httpURLConnection;
    }

    public static gq b(String str, String str2, List<Pair<String, String>> list) {
        a.C0164a c0164a = new a.C0164a();
        c0164a.c(str).a(str2).d("POST").a(list);
        return b(c0164a.a());
    }

    private static void a(HttpURLConnection httpURLConnection, a aVar) {
        if (aVar.a()) {
            byte[] bytes = aVar.f19576c.getBytes(aVar.f19579f);
            httpURLConnection.setRequestProperty("Content-Length", Integer.toString(bytes.length));
            a(httpURLConnection, bytes);
        }
    }

    private static void a(HttpURLConnection httpURLConnection, List<Pair<String, String>> list) {
        for (Pair<String, String> pair : list) {
            httpURLConnection.setRequestProperty((String) pair.first, (String) pair.second);
        }
    }

    private static void a(HttpURLConnection httpURLConnection, byte[] bArr) {
        httpURLConnection.setDoOutput(true);
        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        try {
            dataOutputStream.write(bArr);
            dataOutputStream.flush();
        } finally {
            dataOutputStream.close();
        }
    }

    private static boolean a(String str, String str2) {
        return (str == null || str.isEmpty() || str2 == null || str2.isEmpty()) ? false : true;
    }
}
