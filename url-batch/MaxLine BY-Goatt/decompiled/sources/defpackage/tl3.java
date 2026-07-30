package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.google.firebase.encoders.json.BuildConfig;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class tl3 {
    public static final Object g = new Object();
    public static volatile zk3 h;
    public static final AtomicInteger i;
    public final pf2 a;
    public final String b;
    public final Object c;
    public volatile int d = -1;
    public volatile Object e;
    public final /* synthetic */ int f;

    static {
        new AtomicReference();
        i = new AtomicInteger();
    }

    public /* synthetic */ tl3(pf2 pf2Var, String str, Object obj, int i2) {
        this.f = i2;
        if (((Uri) pf2Var.n) == null) {
            lh.e("Must pass a valid SharedPreferences file name or ContentProvider URI");
            throw null;
        }
        this.a = pf2Var;
        this.b = str;
        this.c = obj;
    }

    public final Object a(Object obj) {
        int i2 = this.f;
        String str = this.b;
        switch (i2) {
            case 0:
                if (obj instanceof Long) {
                    return (Long) obj;
                }
                if (obj instanceof String) {
                    try {
                        return Long.valueOf(Long.parseLong((String) obj));
                    } catch (NumberFormatException unused) {
                    }
                }
                String obj2 = obj.toString();
                StringBuilder sb = new StringBuilder(str.length() + 25 + obj2.length());
                sb.append("Invalid long value for ");
                sb.append(str);
                sb.append(": ");
                sb.append(obj2);
                Log.e("PhenotypeFlag", sb.toString());
                return null;
            case 1:
                if (obj instanceof Boolean) {
                    return (Boolean) obj;
                }
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (rk3.b.matcher(str2).matches()) {
                        return Boolean.TRUE;
                    }
                    if (rk3.c.matcher(str2).matches()) {
                        return Boolean.FALSE;
                    }
                }
                String obj3 = obj.toString();
                StringBuilder sb2 = new StringBuilder(str.length() + 28 + obj3.length());
                sb2.append("Invalid boolean value for ");
                sb2.append(str);
                sb2.append(": ");
                sb2.append(obj3);
                Log.e("PhenotypeFlag", sb2.toString());
                return null;
            case 2:
                if (obj instanceof Double) {
                    return (Double) obj;
                }
                if (obj instanceof Float) {
                    return Double.valueOf(((Float) obj).doubleValue());
                }
                if (obj instanceof String) {
                    try {
                        return Double.valueOf(Double.parseDouble((String) obj));
                    } catch (NumberFormatException unused2) {
                    }
                }
                String obj4 = obj.toString();
                StringBuilder sb3 = new StringBuilder(str.length() + 27 + obj4.length());
                sb3.append("Invalid double value for ");
                sb3.append(str);
                sb3.append(": ");
                sb3.append(obj4);
                Log.e("PhenotypeFlag", sb3.toString());
                return null;
            default:
                if (obj instanceof String) {
                    return (String) obj;
                }
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062 A[Catch: all -> 0x0055, TryCatch #0 {all -> 0x0055, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0016, B:11:0x0024, B:13:0x0034, B:16:0x0048, B:21:0x0062, B:23:0x006a, B:25:0x0072, B:27:0x0082, B:29:0x0090, B:32:0x00b5, B:35:0x00bd, B:36:0x00c0, B:37:0x00c4, B:38:0x0099, B:40:0x009d, B:42:0x00ab, B:44:0x00b1, B:48:0x00c9, B:49:0x00cb, B:51:0x00cc, B:52:0x00d1, B:54:0x0041, B:56:0x00d2), top: B:4:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0099 A[Catch: all -> 0x0055, TryCatch #0 {all -> 0x0055, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0016, B:11:0x0024, B:13:0x0034, B:16:0x0048, B:21:0x0062, B:23:0x006a, B:25:0x0072, B:27:0x0082, B:29:0x0090, B:32:0x00b5, B:35:0x00bd, B:36:0x00c0, B:37:0x00c4, B:38:0x0099, B:40:0x009d, B:42:0x00ab, B:44:0x00b1, B:48:0x00c9, B:49:0x00cb, B:51:0x00cc, B:52:0x00d1, B:54:0x0041, B:56:0x00d2), top: B:4:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cc A[Catch: all -> 0x0055, TryCatch #0 {all -> 0x0055, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0016, B:11:0x0024, B:13:0x0034, B:16:0x0048, B:21:0x0062, B:23:0x006a, B:25:0x0072, B:27:0x0082, B:29:0x0090, B:32:0x00b5, B:35:0x00bd, B:36:0x00c0, B:37:0x00c4, B:38:0x0099, B:40:0x009d, B:42:0x00ab, B:44:0x00b1, B:48:0x00c9, B:49:0x00cb, B:51:0x00cc, B:52:0x00d1, B:54:0x0041, B:56:0x00d2), top: B:4:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b() {
        String str;
        Object obj;
        String f;
        fl2 fl2Var;
        int i2 = i.get();
        if (this.d < i2) {
            synchronized (this) {
                try {
                    if (this.d < i2) {
                        zk3 zk3Var = h;
                        sw1 sw1Var = t.m;
                        Object obj2 = null;
                        if (zk3Var != null) {
                            sw1Var = (sw1) zk3Var.b.get();
                            if (sw1Var.b()) {
                                gl3 gl3Var = (gl3) sw1Var.a();
                                Uri uri = (Uri) this.a.n;
                                String str2 = this.b;
                                if (uri != null) {
                                    fl2Var = (fl2) gl3Var.a.get(uri.toString());
                                } else {
                                    gl3Var.getClass();
                                    fl2Var = null;
                                }
                                if (fl2Var != null) {
                                    str = (String) fl2Var.get(BuildConfig.FLAVOR.concat(str2));
                                    if (zk3Var == null) {
                                        throw new IllegalStateException("Must call PhenotypeFlagInitializer.maybeInit() first");
                                    }
                                    pf2 pf2Var = this.a;
                                    Uri uri2 = (Uri) pf2Var.n;
                                    if (uri2 == null) {
                                        Context context = zk3Var.a;
                                        throw null;
                                    }
                                    dl3 a = ql3.a(zk3Var.a, uri2) ? dl3.a(zk3Var.a.getContentResolver(), uri2, dg0.o) : null;
                                    if (a != null) {
                                        String str3 = (String) a.b().get(this.b);
                                        if (str3 != null) {
                                            obj = a(str3);
                                            if (obj == null) {
                                                if (!pf2Var.m && (f = kl3.d(zk3Var.a).f(this.b)) != null) {
                                                    obj2 = a(f);
                                                }
                                                obj = obj2 == null ? this.c : obj2;
                                            }
                                            if (sw1Var.b()) {
                                                obj = str == null ? this.c : a(str);
                                            }
                                            this.e = obj;
                                            this.d = i2;
                                        }
                                    }
                                    obj = null;
                                    if (obj == null) {
                                    }
                                    if (sw1Var.b()) {
                                    }
                                    this.e = obj;
                                    this.d = i2;
                                }
                            }
                        }
                        str = null;
                        if (zk3Var == null) {
                        }
                    }
                } finally {
                }
            }
        }
        return this.e;
    }
}
