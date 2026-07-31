package V5;

import android.app.Notification;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import q.C0583c;
import t.x;
import t.y;
import t.z;
import x.AbstractC0724b;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2767a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f2768b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2769c;

    /* renamed from: d, reason: collision with root package name */
    public Object f2770d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2771e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f2772f;

    /* JADX WARN: Multi-variable type inference failed */
    public u(t.p pVar) {
        int i7;
        ArrayList arrayList;
        int i8;
        new ArrayList();
        this.f2772f = new Bundle();
        this.f2771e = pVar;
        Context context = pVar.f5917a;
        ArrayList arrayList2 = pVar.f5939w;
        ArrayList arrayList3 = pVar.f5919c;
        ArrayList arrayList4 = pVar.f5920d;
        this.f2769c = context;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f2770d = t.w.a(context, pVar.f5935s);
        } else {
            this.f2770d = new Notification.Builder(pVar.f5917a);
        }
        Notification notification = pVar.f5938v;
        Context context2 = null;
        ((Notification.Builder) this.f2770d).setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(pVar.f5921e).setContentText(pVar.f5922f).setContentInfo(null).setContentIntent(pVar.f5923g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(pVar.f5925i).setProgress(0, 0, false);
        Notification.Builder builder = (Notification.Builder) this.f2770d;
        IconCompat iconCompat = pVar.f5924h;
        t.u.b(builder, iconCompat == null ? null : AbstractC0724b.c(iconCompat, context));
        ((Notification.Builder) this.f2770d).setSubText(null).setUsesChronometer(false).setPriority(pVar.f5926j);
        ArrayList arrayList5 = pVar.f5918b;
        int size = arrayList5.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList5.get(i9);
            i9++;
            t.j jVar = (t.j) obj;
            if (jVar.f5906b == null && (i8 = jVar.f5909e) != 0) {
                jVar.f5906b = IconCompat.b(i8);
            }
            IconCompat iconCompat2 = jVar.f5906b;
            boolean z5 = jVar.f5907c;
            Bundle bundle = jVar.f5905a;
            Notification.Action.Builder a7 = t.u.a(iconCompat2 != null ? AbstractC0724b.c(iconCompat2, context2) : context2, jVar.f5910f, jVar.f5911g);
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            bundle2.putBoolean("android.support.allowGeneratedReplies", z5);
            int i10 = Build.VERSION.SDK_INT;
            t.v.a(a7, z5);
            bundle2.putInt("android.support.action.semanticAction", 0);
            if (i10 >= 28) {
                x.b(a7, 0);
            }
            if (i10 >= 29) {
                y.c(a7, false);
            }
            if (i10 >= 31) {
                z.a(a7, false);
            }
            bundle2.putBoolean("android.support.action.showsUserInterface", jVar.f5908d);
            t.s.b(a7, bundle2);
            t.s.a((Notification.Builder) this.f2770d, t.s.d(a7));
            context2 = null;
        }
        Bundle bundle3 = pVar.f5932p;
        if (bundle3 != null) {
            ((Bundle) this.f2772f).putAll(bundle3);
        }
        int i11 = Build.VERSION.SDK_INT;
        ((Notification.Builder) this.f2770d).setShowWhen(pVar.f5927k);
        t.s.i((Notification.Builder) this.f2770d, pVar.f5931o);
        t.s.g((Notification.Builder) this.f2770d, pVar.f5929m);
        t.s.j((Notification.Builder) this.f2770d, null);
        t.s.h((Notification.Builder) this.f2770d, pVar.f5930n);
        this.f2768b = pVar.f5936t;
        t.t.b((Notification.Builder) this.f2770d, null);
        t.t.c((Notification.Builder) this.f2770d, pVar.f5933q);
        t.t.f((Notification.Builder) this.f2770d, pVar.f5934r);
        t.t.d((Notification.Builder) this.f2770d, null);
        t.t.e((Notification.Builder) this.f2770d, notification.sound, notification.audioAttributes);
        if (i11 < 28) {
            if (arrayList3 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(arrayList3.size());
                Iterator it = arrayList3.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
            }
            if (arrayList != null) {
                if (arrayList2 == null) {
                    arrayList2 = arrayList;
                } else {
                    C0583c c0583c = new C0583c(arrayList2.size() + arrayList.size());
                    c0583c.addAll(arrayList);
                    c0583c.addAll(arrayList2);
                    arrayList2 = new ArrayList(c0583c);
                }
            }
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            int size2 = arrayList2.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj2 = arrayList2.get(i12);
                i12++;
                t.t.a((Notification.Builder) this.f2770d, (String) obj2);
            }
        }
        if (arrayList4.size() > 0) {
            if (pVar.f5932p == null) {
                pVar.f5932p = new Bundle();
            }
            Bundle bundle4 = pVar.f5932p.getBundle("android.car.EXTENSIONS");
            bundle4 = bundle4 == null ? new Bundle() : bundle4;
            Bundle bundle5 = new Bundle(bundle4);
            Bundle bundle6 = new Bundle();
            for (int i13 = 0; i13 < arrayList4.size(); i13++) {
                String num = Integer.toString(i13);
                t.j jVar2 = (t.j) arrayList4.get(i13);
                Bundle bundle7 = new Bundle();
                if (jVar2.f5906b == null && (i7 = jVar2.f5909e) != 0) {
                    jVar2.f5906b = IconCompat.b(i7);
                }
                IconCompat iconCompat3 = jVar2.f5906b;
                Bundle bundle8 = jVar2.f5905a;
                bundle7.putInt("icon", iconCompat3 != null ? iconCompat3.c() : 0);
                bundle7.putCharSequence("title", jVar2.f5910f);
                bundle7.putParcelable("actionIntent", jVar2.f5911g);
                Bundle bundle9 = bundle8 != null ? new Bundle(bundle8) : new Bundle();
                bundle9.putBoolean("android.support.allowGeneratedReplies", jVar2.f5907c);
                bundle7.putBundle("extras", bundle9);
                bundle7.putParcelableArray("remoteInputs", null);
                bundle7.putBoolean("showsUserInterface", jVar2.f5908d);
                bundle7.putInt("semanticAction", 0);
                bundle6.putBundle(num, bundle7);
            }
            bundle4.putBundle("invisible_actions", bundle6);
            bundle5.putBundle("invisible_actions", bundle6);
            if (pVar.f5932p == null) {
                pVar.f5932p = new Bundle();
            }
            pVar.f5932p.putBundle("android.car.EXTENSIONS", bundle4);
            ((Bundle) this.f2772f).putBundle("android.car.EXTENSIONS", bundle5);
        }
        int i14 = Build.VERSION.SDK_INT;
        ((Notification.Builder) this.f2770d).setExtras(pVar.f5932p);
        t.v.e((Notification.Builder) this.f2770d, null);
        if (i14 >= 26) {
            t.w.b((Notification.Builder) this.f2770d, 0);
            t.w.e((Notification.Builder) this.f2770d, null);
            t.w.f((Notification.Builder) this.f2770d, null);
            t.w.g((Notification.Builder) this.f2770d, 0L);
            t.w.d((Notification.Builder) this.f2770d, pVar.f5936t);
            if (!TextUtils.isEmpty(pVar.f5935s)) {
                ((Notification.Builder) this.f2770d).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i14 >= 28) {
            Iterator it2 = arrayList3.iterator();
            if (it2.hasNext()) {
                it2.next().getClass();
                throw new ClassCastException();
            }
        }
        if (i14 >= 29) {
            y.a((Notification.Builder) this.f2770d, pVar.f5937u);
            y.b((Notification.Builder) this.f2770d, null);
        }
    }

    public static /* synthetic */ void m(u uVar, String str, int i7, int i8) {
        if ((i8 & 2) != 0) {
            i7 = uVar.f2768b;
        }
        uVar.l(str, i7, (i8 & 4) != 0 ? "" : "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'");
        throw null;
    }

    public int a(CharSequence charSequence, int i7) {
        int i8 = i7 + 4;
        if (i8 < charSequence.length()) {
            ((StringBuilder) this.f2772f).append((char) (o(charSequence, i7 + 3) + (o(charSequence, i7) << 12) + (o(charSequence, i7 + 1) << 8) + (o(charSequence, i7 + 2) << 4)));
            return i8;
        }
        this.f2768b = i7;
        if (i8 < charSequence.length()) {
            return a(charSequence, this.f2768b);
        }
        m(this, "Unexpected EOF during unicode escape", 0, 6);
        throw null;
    }

    public boolean b() {
        String str = (String) this.f2771e;
        int i7 = this.f2768b;
        if (i7 == -1) {
            return false;
        }
        while (i7 < str.length()) {
            char charAt = str.charAt(i7);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.f2768b = i7;
                return !(charAt == '}' || charAt == ']' || charAt == ':' || charAt == ',');
            }
            i7++;
        }
        this.f2768b = i7;
        return false;
    }

    public void c(String str, int i7) {
        String str2 = (String) this.f2771e;
        if (str2.length() - i7 < str.length()) {
            m(this, "Unexpected end of boolean literal", 0, 6);
            throw null;
        }
        int length = str.length();
        for (int i8 = 0; i8 < length; i8++) {
            if (str.charAt(i8) != (str2.charAt(i7 + i8) | ' ')) {
                m(this, "Expected valid boolean literal prefix, but had '" + j() + '\'', 0, 6);
                throw null;
            }
        }
        this.f2768b = str.length() + i7;
    }

    public String d() {
        String str = (String) this.f2771e;
        g('\"');
        int i7 = this.f2768b;
        int Q6 = F5.j.Q(str, '\"', i7, 4);
        if (Q6 == -1) {
            j();
            n((byte) 1, false);
            throw null;
        }
        int i8 = i7;
        while (i8 < Q6) {
            if (str.charAt(i8) == '\\') {
                int i9 = this.f2768b;
                char charAt = str.charAt(i8);
                boolean z5 = false;
                while (charAt != '\"') {
                    if (charAt == '\\') {
                        ((StringBuilder) this.f2772f).append((CharSequence) str, i9, i8);
                        int q6 = q(i8 + 1);
                        if (q6 == -1) {
                            m(this, "Expected escape sequence to continue, got EOF", 0, 6);
                            throw null;
                        }
                        int i10 = q6 + 1;
                        char charAt2 = str.charAt(q6);
                        if (charAt2 == 'u') {
                            i10 = a(str, i10);
                        } else {
                            char c7 = charAt2 < 'u' ? d.f2729a[charAt2] : (char) 0;
                            if (c7 == 0) {
                                m(this, "Invalid escaped char '" + charAt2 + '\'', 0, 6);
                                throw null;
                            }
                            ((StringBuilder) this.f2772f).append(c7);
                        }
                        i9 = q(i10);
                        if (i9 == -1) {
                            m(this, "Unexpected EOF", i9, 4);
                            throw null;
                        }
                    } else {
                        i8++;
                        if (i8 >= str.length()) {
                            ((StringBuilder) this.f2772f).append((CharSequence) str, i9, i8);
                            i9 = q(i8);
                            if (i9 == -1) {
                                m(this, "Unexpected EOF", i9, 4);
                                throw null;
                            }
                        } else {
                            continue;
                            charAt = str.charAt(i8);
                        }
                    }
                    i8 = i9;
                    z5 = true;
                    charAt = str.charAt(i8);
                }
                String obj = !z5 ? str.subSequence(i9, i8).toString() : k(i9, i8);
                this.f2768b = i8 + 1;
                return obj;
            }
            i8++;
        }
        this.f2768b = Q6 + 1;
        String substring = str.substring(i7, Q6);
        kotlin.jvm.internal.i.d(substring, "substring(...)");
        return substring;
    }

    public byte e() {
        byte d7;
        String str = (String) this.f2771e;
        do {
            int i7 = this.f2768b;
            if (i7 == -1 || i7 >= str.length()) {
                return (byte) 10;
            }
            int i8 = this.f2768b;
            this.f2768b = i8 + 1;
            d7 = n.d(str.charAt(i8));
        } while (d7 == 3);
        return d7;
    }

    public byte f(byte b7) {
        byte e4 = e();
        if (e4 == b7) {
            return e4;
        }
        n(b7, true);
        throw null;
    }

    public void g(char c7) {
        if (this.f2768b == -1) {
            t(c7);
            throw null;
        }
        String str = (String) this.f2771e;
        while (this.f2768b < str.length()) {
            int i7 = this.f2768b;
            this.f2768b = i7 + 1;
            char charAt = str.charAt(i7);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                if (charAt == c7) {
                    return;
                }
                t(c7);
                throw null;
            }
        }
        this.f2768b = -1;
        t(c7);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x018e, code lost:
    
        if (r10 == Long.MIN_VALUE) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0191, code lost:
    
        return -r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0192, code lost:
    
        m(r22, "Numeric value overflow", 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0197, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0161, code lost:
    
        m(r22, "Can't convert " + r1 + " to Long", 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0179, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x017a, code lost:
    
        m(r22, "Numeric value overflow", 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x017f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0143, code lost:
    
        if (r11 != 1) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0145, code lost:
    
        r3 = java.lang.Math.pow(10.0d, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0185, code lost:
    
        throw new H5.r();
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0186, code lost:
    
        r10 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0198, code lost:
    
        m(r22, "Expected numeric literal", 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x019d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0105, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00e9, code lost:
    
        m(r22, "Unexpected symbol '" + r5 + "' in numeric literal", r7, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0100, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0101, code lost:
    
        if (r12 == r1) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0103, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0106, code lost:
    
        if (r1 == r12) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0108, code lost:
    
        if (r14 == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x010c, code lost:
    
        if (r1 == (r12 - 1)) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0113, code lost:
    
        if (r3 == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0115, code lost:
    
        if (r5 == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x011d, code lost:
    
        if (r2.charAt(r12) != '\"') goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x011f, code lost:
    
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0122, code lost:
    
        m(r22, "Expected closing quotation mark", 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0129, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x012a, code lost:
    
        m(r22, "EOF", 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x012f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0130, code lost:
    
        r22.f2768b = r12;
        r1 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0134, code lost:
    
        if (r13 == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0136, code lost:
    
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0139, code lost:
    
        if (r11 != 0) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x013b, code lost:
    
        r3 = java.lang.Math.pow(10.0d, -r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x014a, code lost:
    
        r1 = r1 * r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x014f, code lost:
    
        if (r1 > 9.223372036854776E18d) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0155, code lost:
    
        if (r1 < (-9.223372036854776E18d)) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x015d, code lost:
    
        if (java.lang.Math.floor(r1) != r1) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x015f, code lost:
    
        r10 = (long) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0187, code lost:
    
        if (r14 == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0189, code lost:
    
        return r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long h() {
        boolean z5;
        int q6 = q(r());
        String str = (String) this.f2771e;
        int i7 = 6;
        int i8 = 0;
        if (q6 >= str.length() || q6 == -1) {
            m(this, "EOF", 0, 6);
            throw null;
        }
        if (str.charAt(q6) == '\"') {
            q6++;
            if (q6 == str.length()) {
                m(this, "EOF", 0, 6);
                throw null;
            }
            z5 = true;
        } else {
            z5 = false;
        }
        int i9 = q6;
        int i10 = 0;
        boolean z6 = false;
        boolean z7 = false;
        long j4 = 0;
        long j7 = 0;
        long j8 = 0;
        while (true) {
            long j9 = j7;
            if (i9 == str.length()) {
                break;
            }
            char charAt = str.charAt(i9);
            if ((charAt == 'e' || charAt == 'E') && !z6) {
                if (i9 == q6) {
                    m(this, "Unexpected symbol " + charAt + " in numeric literal", i8, i7);
                    throw null;
                }
                i9++;
                j7 = j9;
                i10 = 1;
                z6 = true;
            } else if (charAt == '-' && z6) {
                if (i9 == q6) {
                    m(this, "Unexpected symbol '-' in numeric literal", i8, 6);
                    throw null;
                }
                i9++;
                i10 = i8;
                j7 = j9;
                i7 = 6;
            } else if (charAt != '+' || !z6) {
                if (charAt != '-') {
                    if (n.d(charAt) != 0) {
                        break;
                    }
                    i9++;
                    int i11 = charAt - '0';
                    if (i11 < 0 || i11 >= 10) {
                        break;
                    }
                    if (z6) {
                        j4 = (j4 * 10) + i11;
                    } else {
                        j8 = (j8 * 10) - i11;
                        if (j8 > j9) {
                            m(this, "Numeric value overflow", 0, 6);
                            throw null;
                        }
                    }
                    j7 = j9;
                    i7 = 6;
                    i8 = 0;
                } else {
                    if (i9 != q6) {
                        m(this, "Unexpected symbol '-' in numeric literal", i8, 6);
                        throw null;
                    }
                    i9++;
                    j7 = j9;
                    i7 = 6;
                    z7 = true;
                }
            } else {
                if (i9 == q6) {
                    m(this, "Unexpected symbol '+' in numeric literal", i8, 6);
                    throw null;
                }
                i9++;
                j7 = j9;
                i7 = 6;
                i10 = 1;
            }
        }
    }

    public String i() {
        String str = (String) this.f2770d;
        if (str == null) {
            return d();
        }
        kotlin.jvm.internal.i.b(str);
        this.f2770d = null;
        return str;
    }

    public String j() {
        String str = (String) this.f2771e;
        String str2 = (String) this.f2770d;
        if (str2 != null) {
            kotlin.jvm.internal.i.b(str2);
            this.f2770d = null;
            return str2;
        }
        int r6 = r();
        if (r6 >= str.length() || r6 == -1) {
            m(this, "EOF", r6, 4);
            throw null;
        }
        byte d7 = n.d(str.charAt(r6));
        if (d7 == 1) {
            return i();
        }
        if (d7 != 0) {
            m(this, "Expected beginning of the string, but got " + str.charAt(r6), 0, 6);
            throw null;
        }
        boolean z5 = false;
        while (n.d(str.charAt(r6)) == 0) {
            r6++;
            if (r6 >= str.length()) {
                ((StringBuilder) this.f2772f).append((CharSequence) str, this.f2768b, r6);
                int q6 = q(r6);
                if (q6 == -1) {
                    this.f2768b = r6;
                    return k(0, 0);
                }
                r6 = q6;
                z5 = true;
            }
        }
        String obj = !z5 ? str.subSequence(this.f2768b, r6).toString() : k(this.f2768b, r6);
        this.f2768b = r6;
        return obj;
    }

    public String k(int i7, int i8) {
        ((StringBuilder) this.f2772f).append((CharSequence) this.f2771e, i7, i8);
        StringBuilder sb = (StringBuilder) this.f2772f;
        String sb2 = sb.toString();
        kotlin.jvm.internal.i.d(sb2, "toString(...)");
        sb.setLength(0);
        return sb2;
    }

    public void l(String message, int i7, String hint) {
        kotlin.jvm.internal.i.e(message, "message");
        kotlin.jvm.internal.i.e(hint, "hint");
        throw n.b(i7, (String) this.f2771e, message + " at path: " + ((D1.b) this.f2769c).d() + (hint.length() == 0 ? "" : "\n".concat(hint)));
    }

    public void n(byte b7, boolean z5) {
        String str = (String) this.f2771e;
        String j4 = n.j(b7);
        int i7 = z5 ? this.f2768b - 1 : this.f2768b;
        m(this, "Expected " + j4 + ", but had '" + ((this.f2768b == str.length() || i7 < 0) ? "EOF" : String.valueOf(str.charAt(i7))) + "' instead", i7, 4);
        throw null;
    }

    public int o(CharSequence charSequence, int i7) {
        char charAt = charSequence.charAt(i7);
        if ('0' <= charAt && charAt < ':') {
            return charAt - '0';
        }
        if ('a' <= charAt && charAt < 'g') {
            return charAt - 'W';
        }
        if ('A' <= charAt && charAt < 'G') {
            return charAt - '7';
        }
        m(this, "Invalid toHexChar char '" + charAt + "' in unicode escape", 0, 6);
        throw null;
    }

    public byte p() {
        String str = (String) this.f2771e;
        int i7 = this.f2768b;
        while (true) {
            int q6 = q(i7);
            if (q6 == -1) {
                this.f2768b = q6;
                return (byte) 10;
            }
            char charAt = str.charAt(q6);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.f2768b = q6;
                return n.d(charAt);
            }
            i7 = q6 + 1;
        }
    }

    public int q(int i7) {
        if (i7 < ((String) this.f2771e).length()) {
            return i7;
        }
        return -1;
    }

    public int r() {
        char charAt;
        String str = (String) this.f2771e;
        int i7 = this.f2768b;
        if (i7 == -1) {
            return i7;
        }
        while (i7 < str.length() && ((charAt = str.charAt(i7)) == ' ' || charAt == '\n' || charAt == '\r' || charAt == '\t')) {
            i7++;
        }
        this.f2768b = i7;
        return i7;
    }

    public boolean s() {
        int r6 = r();
        String str = (String) this.f2771e;
        if (r6 == str.length() || r6 == -1 || str.charAt(r6) != ',') {
            return false;
        }
        this.f2768b++;
        return true;
    }

    public void t(char c7) {
        int i7 = this.f2768b;
        if (i7 > 0 && c7 == '\"') {
            try {
                this.f2768b = i7 - 1;
                String j4 = j();
                this.f2768b = i7;
                if (kotlin.jvm.internal.i.a(j4, "null")) {
                    l("Expected string literal but 'null' literal was found", this.f2768b - 1, "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th) {
                this.f2768b = i7;
                throw th;
            }
        }
        n(n.d(c7), true);
        throw null;
    }

    public String toString() {
        switch (this.f2767a) {
            case 0:
                StringBuilder sb = new StringBuilder("JsonReader(source='");
                sb.append(this.f2771e);
                sb.append("', currentPosition=");
                sb.append(this.f2768b);
                sb.append(')');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public u(String source) {
        kotlin.jvm.internal.i.e(source, "source");
        D1.b bVar = new D1.b(4, (byte) 0);
        bVar.f369c = new Object[8];
        int[] iArr = new int[8];
        for (int i7 = 0; i7 < 8; i7++) {
            iArr[i7] = -1;
        }
        bVar.f370d = iArr;
        bVar.f368b = -1;
        this.f2769c = bVar;
        this.f2772f = new StringBuilder();
        this.f2771e = source;
    }
}
