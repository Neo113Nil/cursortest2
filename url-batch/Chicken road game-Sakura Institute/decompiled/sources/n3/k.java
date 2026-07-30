package n3;

import android.util.Log;
import b.j0;
import com.android.installreferrer.api.InstallReferrerClient;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6535a;

    /* renamed from: b, reason: collision with root package name */
    public int f6536b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f6537c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f6538d;

    /* renamed from: e, reason: collision with root package name */
    public Serializable f6539e;

    /* renamed from: f, reason: collision with root package name */
    public Object f6540f;

    /* renamed from: g, reason: collision with root package name */
    public Object f6541g;

    /* renamed from: h, reason: collision with root package name */
    public Serializable f6542h;

    /* renamed from: i, reason: collision with root package name */
    public Object f6543i;

    public k(int i7) {
        this.f6535a = i7;
        switch (i7) {
            case 1:
                this.f6540f = "";
                this.f6541g = "";
                this.f6536b = -1;
                ArrayList arrayList = new ArrayList();
                this.f6537c = arrayList;
                arrayList.add("");
                break;
            default:
                this.f6537c = new ArrayList();
                this.f6540f = new androidx.room.c(27);
                new ArrayList();
                this.f6541g = null;
                new j0(2, this, false);
                this.f6542h = new AtomicInteger();
                Collections.synchronizedMap(new HashMap());
                Collections.synchronizedMap(new HashMap());
                Collections.synchronizedMap(new HashMap());
                this.f6539e = new ArrayList();
                new CopyOnWriteArrayList();
                new CopyOnWriteArrayList();
                new h(this, 0);
                new h(this, 1);
                new h(this, 2);
                new h(this, 3);
                this.f6536b = -1;
                this.f6543i = new j4.i(20);
                new ArrayDeque();
                new androidx.room.o(6, this);
                break;
        }
    }

    public static boolean m(int i7) {
        return Log.isLoggable("FragmentManager", i7);
    }

    public static boolean n(g gVar) {
        return gVar == null || gVar.f6521i;
    }

    public void a(String str, String str2) {
        r6.k.f(str, "name");
        if (this.f6538d == null) {
            this.f6538d = new ArrayList();
        }
        ArrayList arrayList = this.f6538d;
        r6.k.c(arrayList);
        arrayList.add(s7.b.b(str, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", 219));
        ArrayList arrayList2 = this.f6538d;
        r6.k.c(arrayList2);
        arrayList2.add(str2 != null ? s7.b.b(str2, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", 219) : null);
    }

    public s7.l b() {
        ArrayList arrayList;
        String str = (String) this.f6539e;
        if (str == null) {
            throw new IllegalStateException("scheme == null");
        }
        String e9 = s7.b.e((String) this.f6540f, 0, 0, 7);
        String e10 = s7.b.e((String) this.f6541g, 0, 0, 7);
        String str2 = (String) this.f6542h;
        if (str2 == null) {
            throw new IllegalStateException("host == null");
        }
        int k8 = k();
        ArrayList arrayList2 = this.f6537c;
        ArrayList arrayList3 = new ArrayList(e6.n.a0(arrayList2, 10));
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList2.get(i7);
            i7++;
            arrayList3.add(s7.b.e((String) obj, 0, 0, 7));
        }
        ArrayList arrayList4 = this.f6538d;
        if (arrayList4 != null) {
            ArrayList arrayList5 = new ArrayList(e6.n.a0(arrayList4, 10));
            int size2 = arrayList4.size();
            int i8 = 0;
            while (i8 < size2) {
                Object obj2 = arrayList4.get(i8);
                i8++;
                String str3 = (String) obj2;
                arrayList5.add(str3 != null ? s7.b.e(str3, 0, 0, 3) : null);
            }
            arrayList = arrayList5;
        } else {
            arrayList = null;
        }
        String str4 = (String) this.f6543i;
        return new s7.l(str, e9, e10, str2, k8, arrayList3, arrayList, str4 != null ? s7.b.e(str4, 0, 0, 7) : null, toString());
    }

    public void c(boolean z8) {
        for (g gVar : ((androidx.room.c) this.f6540f).t()) {
            if (gVar != null && z8) {
                gVar.f6520h.c(true);
            }
        }
    }

    public boolean d() {
        if (this.f6536b < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z8 = false;
        for (g gVar : ((androidx.room.c) this.f6540f).t()) {
            if (gVar != null && n(gVar) && gVar.f6520h.d()) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(gVar);
                z8 = true;
            }
        }
        if (this.f6538d != null) {
            for (int i7 = 0; i7 < this.f6538d.size(); i7++) {
                g gVar2 = (g) this.f6538d.get(i7);
                if (arrayList == null || !arrayList.contains(gVar2)) {
                    gVar2.getClass();
                }
            }
        }
        this.f6538d = arrayList;
        return z8;
    }

    public void e(boolean z8) {
        for (g gVar : ((androidx.room.c) this.f6540f).t()) {
            if (gVar != null && z8) {
                gVar.f6520h.e(true);
            }
        }
    }

    public void f(boolean z8) {
        for (g gVar : ((androidx.room.c) this.f6540f).t()) {
            if (gVar != null && z8) {
                gVar.f6520h.f(true);
            }
        }
    }

    public boolean g() {
        if (this.f6536b < 1) {
            return false;
        }
        for (g gVar : ((androidx.room.c) this.f6540f).t()) {
            if (gVar != null && gVar.f6520h.g()) {
                return true;
            }
        }
        return false;
    }

    public void h() {
        if (this.f6536b < 1) {
            return;
        }
        for (g gVar : ((androidx.room.c) this.f6540f).t()) {
            if (gVar != null) {
                gVar.f6520h.h();
            }
        }
    }

    public void i(boolean z8) {
        for (g gVar : ((androidx.room.c) this.f6540f).t()) {
            if (gVar != null && z8) {
                gVar.f6520h.i(true);
            }
        }
    }

    public boolean j() {
        boolean z8 = false;
        if (this.f6536b < 1) {
            return false;
        }
        for (g gVar : ((androidx.room.c) this.f6540f).t()) {
            if (gVar != null && n(gVar) && gVar.f6520h.j()) {
                z8 = true;
            }
        }
        return z8;
    }

    public int k() {
        int i7 = this.f6536b;
        if (i7 != -1) {
            return i7;
        }
        String str = (String) this.f6539e;
        r6.k.c(str);
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    public void l() {
        throw new IllegalStateException("FragmentManager has not been attached to a host.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:174:0x020e, code lost:
    
        if (r9 < 65536) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0075, code lost:
    
        if (r12 == ':') goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void o(s7.l lVar, String str) {
        int i7;
        int e9;
        int i8;
        char charAt;
        byte[] bArr = t7.b.f8932a;
        int l8 = t7.b.l(0, str.length(), str);
        int m8 = t7.b.m(l8, str.length(), str);
        if (m8 - l8 >= 2) {
            char charAt2 = str.charAt(l8);
            if ((r6.k.g(charAt2, 97) >= 0 && r6.k.g(charAt2, 122) <= 0) || (r6.k.g(charAt2, 65) >= 0 && r6.k.g(charAt2, 90) <= 0)) {
                i7 = l8 + 1;
                while (true) {
                    if (i7 >= m8) {
                        break;
                    }
                    char charAt3 = str.charAt(i7);
                    if (('a' <= charAt3 && charAt3 < '{') || (('A' <= charAt3 && charAt3 < '[') || (('0' <= charAt3 && charAt3 < ':') || charAt3 == '+' || charAt3 == '-' || charAt3 == '.'))) {
                        i7++;
                    }
                }
            }
        }
        i7 = -1;
        if (i7 == -1) {
            if (lVar == null) {
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no scheme was found for " + (str.length() > 6 ? z6.h.V(str, 6).concat("...") : str));
            }
            this.f6539e = lVar.f8608a;
        } else if (z6.o.u(str, "https:", l8, true)) {
            this.f6539e = "https";
            l8 += 6;
        } else {
            if (!z6.o.u(str, "http:", l8, true)) {
                StringBuilder sb = new StringBuilder("Expected URL scheme 'http' or 'https' but was '");
                String substring = str.substring(0, i7);
                r6.k.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                sb.append(substring);
                sb.append('\'');
                throw new IllegalArgumentException(sb.toString());
            }
            this.f6539e = "http";
            l8 += 5;
        }
        int i9 = 0;
        for (int i10 = l8; i10 < m8 && ((charAt = str.charAt(i10)) == '\\' || charAt == '/'); i10++) {
            i9++;
        }
        ArrayList arrayList = this.f6537c;
        char c4 = '#';
        if (i9 >= 2 || lVar == null || !r6.k.a(lVar.f8608a, (String) this.f6539e)) {
            int i11 = l8 + i9;
            boolean z8 = false;
            boolean z9 = false;
            while (true) {
                e9 = t7.b.e(i11, m8, str, "@/\\?#");
                char charAt4 = e9 != m8 ? str.charAt(e9) : (char) 65535;
                if (charAt4 == 65535 || charAt4 == c4 || charAt4 == '/' || charAt4 == '\\' || charAt4 == '?') {
                    break;
                }
                if (charAt4 == '@') {
                    if (z8) {
                        this.f6541g = ((String) this.f6541g) + "%40" + s7.b.b(str, i11, e9, " \"':;<=>@[]^`{}|/\\?#", 240);
                        z8 = z8;
                    } else {
                        boolean z10 = z8;
                        int f9 = t7.b.f(str, ':', i11, e9);
                        String b9 = s7.b.b(str, i11, f9, " \"':;<=>@[]^`{}|/\\?#", 240);
                        if (z9) {
                            b9 = ((String) this.f6540f) + "%40" + b9;
                        }
                        this.f6540f = b9;
                        if (f9 != e9) {
                            this.f6541g = s7.b.b(str, f9 + 1, e9, " \"':;<=>@[]^`{}|/\\?#", 240);
                            z8 = true;
                        } else {
                            z8 = z10;
                        }
                        z9 = true;
                    }
                    i11 = e9 + 1;
                    c4 = '#';
                }
            }
            int i12 = i11;
            while (true) {
                if (i12 >= e9) {
                    i12 = e9;
                    break;
                }
                char charAt5 = str.charAt(i12);
                if (charAt5 != '[') {
                    if (charAt5 == ':') {
                        break;
                    }
                } else {
                    do {
                        i12++;
                        if (i12 >= e9) {
                            break;
                        }
                    } while (str.charAt(i12) != ']');
                }
                i12++;
            }
            int i13 = i12 + 1;
            if (i13 < e9) {
                this.f6542h = r4.a.S(s7.b.e(str, i11, i12, 4));
                try {
                    i8 = Integer.parseInt(s7.b.b(str, i13, e9, "", 248));
                    if (1 <= i8) {
                    }
                } catch (NumberFormatException unused) {
                }
                i8 = -1;
                this.f6536b = i8;
                if (i8 == -1) {
                    StringBuilder sb2 = new StringBuilder("Invalid URL port: \"");
                    String substring2 = str.substring(i13, e9);
                    r6.k.e(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    sb2.append(substring2);
                    sb2.append('\"');
                    throw new IllegalArgumentException(sb2.toString().toString());
                }
            } else {
                this.f6542h = r4.a.S(s7.b.e(str, i11, i12, 4));
                String str2 = (String) this.f6539e;
                r6.k.c(str2);
                this.f6536b = str2.equals("http") ? 80 : str2.equals("https") ? 443 : -1;
            }
            if (((String) this.f6542h) == null) {
                StringBuilder sb3 = new StringBuilder("Invalid URL host: \"");
                String substring3 = str.substring(i11, i12);
                r6.k.e(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                sb3.append(substring3);
                sb3.append('\"');
                throw new IllegalArgumentException(sb3.toString().toString());
            }
            l8 = e9;
        } else {
            this.f6540f = lVar.e();
            this.f6541g = lVar.a();
            this.f6542h = lVar.f8611d;
            this.f6536b = lVar.f8612e;
            arrayList.clear();
            arrayList.addAll(lVar.c());
            if (l8 == m8 || str.charAt(l8) == '#') {
                String d8 = lVar.d();
                this.f6538d = d8 != null ? s7.b.f(s7.b.b(d8, 0, 0, " \"'<>#", 211)) : null;
            }
        }
        int e10 = t7.b.e(l8, m8, str, "?#");
        if (l8 != e10) {
            char charAt6 = str.charAt(l8);
            if (charAt6 == '/' || charAt6 == '\\') {
                arrayList.clear();
                arrayList.add("");
                l8++;
            } else {
                arrayList.set(arrayList.size() - 1, "");
            }
            while (l8 < e10) {
                int e11 = t7.b.e(l8, e10, str, "/\\");
                boolean z11 = e11 < e10;
                String b10 = s7.b.b(str, l8, e11, " \"<>^`{}|/\\?#", 240);
                if (!b10.equals(".") && !b10.equalsIgnoreCase("%2e")) {
                    if (!b10.equals("..") && !b10.equalsIgnoreCase("%2e.") && !b10.equalsIgnoreCase(".%2e") && !b10.equalsIgnoreCase("%2e%2e")) {
                        if (((CharSequence) arrayList.get(arrayList.size() - 1)).length() == 0) {
                            arrayList.set(arrayList.size() - 1, b10);
                        } else {
                            arrayList.add(b10);
                        }
                        if (z11) {
                            arrayList.add("");
                        }
                    } else if (((String) arrayList.remove(arrayList.size() - 1)).length() != 0 || arrayList.isEmpty()) {
                        arrayList.add("");
                    } else {
                        arrayList.set(arrayList.size() - 1, "");
                    }
                }
                l8 = z11 ? e11 + 1 : e11;
            }
        }
        if (e10 < m8 && str.charAt(e10) == '?') {
            int f10 = t7.b.f(str, '#', e10, m8);
            this.f6538d = s7.b.f(s7.b.b(str, e10 + 1, f10, " \"'<>#", 208));
            e10 = f10;
        }
        if (e10 >= m8 || str.charAt(e10) != '#') {
            return;
        }
        this.f6543i = s7.b.b(str, e10 + 1, m8, "", 176);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a4, code lost:
    
        if (r1 != r3) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        switch (this.f6535a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                StringBuilder sb = new StringBuilder(128);
                sb.append("FragmentManager{");
                sb.append(Integer.toHexString(System.identityHashCode(this)));
                sb.append(" in ");
                sb.append("null");
                sb.append("}}");
                return sb.toString();
            default:
                StringBuilder sb2 = new StringBuilder();
                String str = (String) this.f6539e;
                if (str != null) {
                    sb2.append(str);
                    sb2.append("://");
                } else {
                    sb2.append("//");
                }
                if (((String) this.f6540f).length() > 0 || ((String) this.f6541g).length() > 0) {
                    sb2.append((String) this.f6540f);
                    if (((String) this.f6541g).length() > 0) {
                        sb2.append(':');
                        sb2.append((String) this.f6541g);
                    }
                    sb2.append('@');
                }
                String str2 = (String) this.f6542h;
                if (str2 != null) {
                    if (z6.h.x(str2, ':')) {
                        sb2.append('[');
                        sb2.append((String) this.f6542h);
                        sb2.append(']');
                    } else {
                        sb2.append((String) this.f6542h);
                    }
                }
                int i7 = -1;
                if (this.f6536b != -1 || ((String) this.f6539e) != null) {
                    int k8 = k();
                    String str3 = (String) this.f6539e;
                    if (str3 != null) {
                        if (str3.equals("http")) {
                            i7 = 80;
                            break;
                        } else if (str3.equals("https")) {
                            i7 = 443;
                            break;
                        }
                    }
                    sb2.append(':');
                    sb2.append(k8);
                }
                ArrayList arrayList = this.f6537c;
                r6.k.f(arrayList, "<this>");
                int size = arrayList.size();
                for (int i8 = 0; i8 < size; i8++) {
                    sb2.append('/');
                    sb2.append((String) arrayList.get(i8));
                }
                if (this.f6538d != null) {
                    sb2.append('?');
                    ArrayList arrayList2 = this.f6538d;
                    r6.k.c(arrayList2);
                    w6.b n8 = v1.g.n(v1.g.o(0, arrayList2.size()), 2);
                    int i9 = n8.f9521f;
                    int i10 = n8.f9522g;
                    int i11 = n8.f9523h;
                    if ((i11 > 0 && i9 <= i10) || (i11 < 0 && i10 <= i9)) {
                        while (true) {
                            String str4 = (String) arrayList2.get(i9);
                            String str5 = (String) arrayList2.get(i9 + 1);
                            if (i9 > 0) {
                                sb2.append('&');
                            }
                            sb2.append(str4);
                            if (str5 != null) {
                                sb2.append('=');
                                sb2.append(str5);
                            }
                            if (i9 != i10) {
                                i9 += i11;
                            }
                        }
                    }
                }
                if (((String) this.f6543i) != null) {
                    sb2.append('#');
                    sb2.append((String) this.f6543i);
                }
                String sb3 = sb2.toString();
                r6.k.e(sb3, "StringBuilder().apply(builderAction).toString()");
                return sb3;
        }
    }
}
