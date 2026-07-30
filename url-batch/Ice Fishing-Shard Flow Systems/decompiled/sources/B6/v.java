package B6;

import android.app.Notification;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import u.C0935f;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f258a;

    /* renamed from: b, reason: collision with root package name */
    public int f259b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f260c;

    /* renamed from: d, reason: collision with root package name */
    public Object f261d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f262e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f263f;

    /* JADX WARN: Multi-variable type inference failed */
    public v(y.l lVar) {
        int i2;
        ArrayList arrayList;
        int i5;
        this.f258a = 1;
        this.f263f = new Bundle();
        this.f262e = lVar;
        Context context = lVar.f8475a;
        ArrayList arrayList2 = lVar.f8496w;
        ArrayList arrayList3 = lVar.f8477c;
        ArrayList arrayList4 = lVar.f8478d;
        this.f260c = context;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f261d = C.a.a(context, lVar.f8492s);
        } else {
            this.f261d = new Notification.Builder(lVar.f8475a);
        }
        Notification notification = lVar.f8495v;
        Context context2 = null;
        ((Notification.Builder) this.f261d).setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(lVar.f8479e).setContentText(lVar.f8480f).setContentInfo(null).setContentIntent(lVar.f8481g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(lVar.f8483i).setProgress(0, 0, false);
        Notification.Builder builder = (Notification.Builder) this.f261d;
        IconCompat iconCompat = lVar.f8482h;
        builder.setLargeIcon(iconCompat == null ? null : iconCompat.f(context));
        ((Notification.Builder) this.f261d).setSubText(null).setUsesChronometer(false).setPriority(lVar.j);
        ArrayList arrayList5 = lVar.f8476b;
        int size = arrayList5.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList5.get(i7);
            i7++;
            y.h hVar = (y.h) obj;
            if (hVar.f8464b == null && (i5 = hVar.f8467e) != 0) {
                hVar.f8464b = IconCompat.b(i5);
            }
            IconCompat iconCompat2 = hVar.f8464b;
            boolean z7 = hVar.f8465c;
            Bundle bundle = hVar.f8463a;
            ArrayList arrayList6 = arrayList5;
            Notification.Action.Builder builder2 = new Notification.Action.Builder(iconCompat2 != null ? iconCompat2.f(context2) : context2, hVar.f8468f, hVar.f8469g);
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            bundle2.putBoolean("android.support.allowGeneratedReplies", z7);
            int i8 = Build.VERSION.SDK_INT;
            builder2.setAllowGeneratedReplies(z7);
            bundle2.putInt("android.support.action.semanticAction", 0);
            if (i8 >= 28) {
                C.b.p(builder2);
            }
            if (i8 >= 29) {
                B.b.e(builder2);
            }
            if (i8 >= 31) {
                y.o.a(builder2);
            }
            bundle2.putBoolean("android.support.action.showsUserInterface", hVar.f8466d);
            builder2.addExtras(bundle2);
            ((Notification.Builder) this.f261d).addAction(builder2.build());
            arrayList5 = arrayList6;
            context2 = null;
        }
        Bundle bundle3 = lVar.f8489p;
        if (bundle3 != null) {
            ((Bundle) this.f263f).putAll(bundle3);
        }
        ((Notification.Builder) this.f261d).setShowWhen(lVar.f8484k);
        ((Notification.Builder) this.f261d).setLocalOnly(lVar.f8488o);
        ((Notification.Builder) this.f261d).setGroup(lVar.f8486m);
        ((Notification.Builder) this.f261d).setSortKey(null);
        ((Notification.Builder) this.f261d).setGroupSummary(lVar.f8487n);
        this.f259b = lVar.f8493t;
        ((Notification.Builder) this.f261d).setCategory(null);
        ((Notification.Builder) this.f261d).setColor(lVar.f8490q);
        ((Notification.Builder) this.f261d).setVisibility(lVar.f8491r);
        ((Notification.Builder) this.f261d).setPublicVersion(null);
        ((Notification.Builder) this.f261d).setSound(notification.sound, notification.audioAttributes);
        if (Build.VERSION.SDK_INT < 28) {
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
                    C0935f c0935f = new C0935f(arrayList2.size() + arrayList.size());
                    c0935f.addAll(arrayList);
                    c0935f.addAll(arrayList2);
                    arrayList2 = new ArrayList(c0935f);
                }
            }
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            int size2 = arrayList2.size();
            int i9 = 0;
            while (i9 < size2) {
                Object obj2 = arrayList2.get(i9);
                i9++;
                ((Notification.Builder) this.f261d).addPerson((String) obj2);
            }
        }
        if (arrayList4.size() > 0) {
            if (lVar.f8489p == null) {
                lVar.f8489p = new Bundle();
            }
            Bundle bundle4 = lVar.f8489p.getBundle("android.car.EXTENSIONS");
            bundle4 = bundle4 == null ? new Bundle() : bundle4;
            Bundle bundle5 = new Bundle(bundle4);
            Bundle bundle6 = new Bundle();
            for (int i10 = 0; i10 < arrayList4.size(); i10++) {
                String num = Integer.toString(i10);
                y.h hVar2 = (y.h) arrayList4.get(i10);
                Bundle bundle7 = new Bundle();
                if (hVar2.f8464b == null && (i2 = hVar2.f8467e) != 0) {
                    hVar2.f8464b = IconCompat.b(i2);
                }
                IconCompat iconCompat3 = hVar2.f8464b;
                Bundle bundle8 = hVar2.f8463a;
                bundle7.putInt("icon", iconCompat3 != null ? iconCompat3.c() : 0);
                bundle7.putCharSequence("title", hVar2.f8468f);
                bundle7.putParcelable("actionIntent", hVar2.f8469g);
                Bundle bundle9 = bundle8 != null ? new Bundle(bundle8) : new Bundle();
                bundle9.putBoolean("android.support.allowGeneratedReplies", hVar2.f8465c);
                bundle7.putBundle("extras", bundle9);
                bundle7.putParcelableArray("remoteInputs", null);
                bundle7.putBoolean("showsUserInterface", hVar2.f8466d);
                bundle7.putInt("semanticAction", 0);
                bundle6.putBundle(num, bundle7);
            }
            bundle4.putBundle("invisible_actions", bundle6);
            bundle5.putBundle("invisible_actions", bundle6);
            if (lVar.f8489p == null) {
                lVar.f8489p = new Bundle();
            }
            lVar.f8489p.putBundle("android.car.EXTENSIONS", bundle4);
            ((Bundle) this.f263f).putBundle("android.car.EXTENSIONS", bundle5);
        }
        int i11 = Build.VERSION.SDK_INT;
        ((Notification.Builder) this.f261d).setExtras(lVar.f8489p);
        ((Notification.Builder) this.f261d).setRemoteInputHistory(null);
        if (i11 >= 26) {
            C.a.i((Notification.Builder) this.f261d);
            C.a.o((Notification.Builder) this.f261d);
            C.a.p((Notification.Builder) this.f261d);
            C.a.q((Notification.Builder) this.f261d);
            C.a.k((Notification.Builder) this.f261d, lVar.f8493t);
            if (!TextUtils.isEmpty(lVar.f8492s)) {
                ((Notification.Builder) this.f261d).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i11 >= 28) {
            Iterator it2 = arrayList3.iterator();
            if (it2.hasNext()) {
                it2.next().getClass();
                throw new ClassCastException();
            }
        }
        if (i11 >= 29) {
            B.b.c((Notification.Builder) this.f261d, lVar.f8494u);
            B.b.d((Notification.Builder) this.f261d);
        }
        if (i11 >= 36) {
            J.e.f((Notification.Builder) this.f261d);
        }
    }

    public static /* synthetic */ void m(v vVar, String str, int i2, int i5) {
        if ((i5 & 2) != 0) {
            i2 = vVar.f259b;
        }
        vVar.l(i2, str, (i5 & 4) != 0 ? "" : "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'");
        throw null;
    }

    public int a(CharSequence charSequence, int i2) {
        int i5 = i2 + 4;
        if (i5 < charSequence.length()) {
            ((StringBuilder) this.f263f).append((char) (o(charSequence, i2 + 3) + (o(charSequence, i2) << 12) + (o(charSequence, i2 + 1) << 8) + (o(charSequence, i2 + 2) << 4)));
            return i5;
        }
        this.f259b = i2;
        if (i5 < charSequence.length()) {
            return a(charSequence, this.f259b);
        }
        m(this, "Unexpected EOF during unicode escape", 0, 6);
        throw null;
    }

    public boolean b() {
        String str = (String) this.f262e;
        int i2 = this.f259b;
        if (i2 == -1) {
            return false;
        }
        while (i2 < str.length()) {
            char charAt = str.charAt(i2);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.f259b = i2;
                return !(charAt == '}' || charAt == ']' || charAt == ':' || charAt == ',');
            }
            i2++;
        }
        this.f259b = i2;
        return false;
    }

    public void c(int i2, String str) {
        String str2 = (String) this.f262e;
        if (str2.length() - i2 < str.length()) {
            m(this, "Unexpected end of boolean literal", 0, 6);
            throw null;
        }
        int length = str.length();
        for (int i5 = 0; i5 < length; i5++) {
            if (str.charAt(i5) != (str2.charAt(i2 + i5) | ' ')) {
                m(this, "Expected valid boolean literal prefix, but had '" + j() + '\'', 0, 6);
                throw null;
            }
        }
        this.f259b = str.length() + i2;
    }

    public String d() {
        String source = (String) this.f262e;
        g('\"');
        int i2 = this.f259b;
        int x7 = StringsKt.x(source, '\"', i2, 4);
        if (x7 == -1) {
            j();
            n((byte) 1, false);
            throw null;
        }
        int i5 = i2;
        while (i5 < x7) {
            if (source.charAt(i5) == '\\') {
                int i7 = this.f259b;
                Intrinsics.checkNotNullParameter(source, "source");
                char charAt = source.charAt(i5);
                boolean z7 = false;
                while (charAt != '\"') {
                    if (charAt == '\\') {
                        ((StringBuilder) this.f263f).append((CharSequence) source, i7, i5);
                        int q4 = q(i5 + 1);
                        if (q4 == -1) {
                            m(this, "Expected escape sequence to continue, got EOF", 0, 6);
                            throw null;
                        }
                        int i8 = q4 + 1;
                        char charAt2 = source.charAt(q4);
                        if (charAt2 == 'u') {
                            i8 = a(source, i8);
                        } else {
                            char c7 = charAt2 < 'u' ? d.f217a[charAt2] : (char) 0;
                            if (c7 == 0) {
                                m(this, "Invalid escaped char '" + charAt2 + '\'', 0, 6);
                                throw null;
                            }
                            ((StringBuilder) this.f263f).append(c7);
                        }
                        i7 = q(i8);
                        if (i7 == -1) {
                            m(this, "Unexpected EOF", i7, 4);
                            throw null;
                        }
                    } else {
                        i5++;
                        if (i5 >= source.length()) {
                            ((StringBuilder) this.f263f).append((CharSequence) source, i7, i5);
                            i7 = q(i5);
                            if (i7 == -1) {
                                m(this, "Unexpected EOF", i7, 4);
                                throw null;
                            }
                        } else {
                            continue;
                            charAt = source.charAt(i5);
                        }
                    }
                    i5 = i7;
                    z7 = true;
                    charAt = source.charAt(i5);
                }
                String obj = !z7 ? source.subSequence(i7, i5).toString() : k(i7, i5);
                this.f259b = i5 + 1;
                return obj;
            }
            i5++;
        }
        this.f259b = x7 + 1;
        String substring = source.substring(i2, x7);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public byte e() {
        byte d7;
        String str = (String) this.f262e;
        do {
            int i2 = this.f259b;
            if (i2 == -1 || i2 >= str.length()) {
                return (byte) 10;
            }
            int i5 = this.f259b;
            this.f259b = i5 + 1;
            d7 = m.d(str.charAt(i5));
        } while (d7 == 3);
        return d7;
    }

    public byte f(byte b7) {
        byte e7 = e();
        if (e7 == b7) {
            return e7;
        }
        n(b7, true);
        throw null;
    }

    public void g(char c7) {
        if (this.f259b == -1) {
            t(c7);
            throw null;
        }
        String str = (String) this.f262e;
        while (this.f259b < str.length()) {
            int i2 = this.f259b;
            this.f259b = i2 + 1;
            char charAt = str.charAt(i2);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                if (charAt == c7) {
                    return;
                }
                t(c7);
                throw null;
            }
        }
        this.f259b = -1;
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
    
        throw new R5.k();
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
    
        r22.f259b = r12;
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
        boolean z7;
        int q4 = q(r());
        String str = (String) this.f262e;
        int i2 = 6;
        int i5 = 0;
        if (q4 >= str.length() || q4 == -1) {
            m(this, "EOF", 0, 6);
            throw null;
        }
        if (str.charAt(q4) == '\"') {
            q4++;
            if (q4 == str.length()) {
                m(this, "EOF", 0, 6);
                throw null;
            }
            z7 = true;
        } else {
            z7 = false;
        }
        int i7 = q4;
        int i8 = 0;
        boolean z8 = false;
        boolean z9 = false;
        long j = 0;
        long j7 = 0;
        long j8 = 0;
        while (true) {
            long j9 = j7;
            if (i7 == str.length()) {
                break;
            }
            char charAt = str.charAt(i7);
            if ((charAt == 'e' || charAt == 'E') && !z8) {
                if (i7 == q4) {
                    m(this, "Unexpected symbol " + charAt + " in numeric literal", i5, i2);
                    throw null;
                }
                i7++;
                j7 = j9;
                i8 = 1;
                z8 = true;
            } else if (charAt == '-' && z8) {
                if (i7 == q4) {
                    m(this, "Unexpected symbol '-' in numeric literal", i5, 6);
                    throw null;
                }
                i7++;
                i8 = i5;
                j7 = j9;
                i2 = 6;
            } else if (charAt != '+' || !z8) {
                if (charAt != '-') {
                    if (m.d(charAt) != 0) {
                        break;
                    }
                    i7++;
                    int i9 = charAt - '0';
                    if (i9 < 0 || i9 >= 10) {
                        break;
                    }
                    if (z8) {
                        j = (j * 10) + i9;
                    } else {
                        j8 = (j8 * 10) - i9;
                        if (j8 > j9) {
                            m(this, "Numeric value overflow", 0, 6);
                            throw null;
                        }
                    }
                    j7 = j9;
                    i2 = 6;
                    i5 = 0;
                } else {
                    if (i7 != q4) {
                        m(this, "Unexpected symbol '-' in numeric literal", i5, 6);
                        throw null;
                    }
                    i7++;
                    j7 = j9;
                    i2 = 6;
                    z9 = true;
                }
            } else {
                if (i7 == q4) {
                    m(this, "Unexpected symbol '+' in numeric literal", i5, 6);
                    throw null;
                }
                i7++;
                j7 = j9;
                i2 = 6;
                i8 = 1;
            }
        }
    }

    public String i() {
        String str = (String) this.f261d;
        if (str == null) {
            return d();
        }
        Intrinsics.b(str);
        this.f261d = null;
        return str;
    }

    public String j() {
        String str = (String) this.f262e;
        String str2 = (String) this.f261d;
        if (str2 != null) {
            Intrinsics.b(str2);
            this.f261d = null;
            return str2;
        }
        int r7 = r();
        if (r7 >= str.length() || r7 == -1) {
            m(this, "EOF", r7, 4);
            throw null;
        }
        byte d7 = m.d(str.charAt(r7));
        if (d7 == 1) {
            return i();
        }
        if (d7 != 0) {
            m(this, "Expected beginning of the string, but got " + str.charAt(r7), 0, 6);
            throw null;
        }
        boolean z7 = false;
        while (m.d(str.charAt(r7)) == 0) {
            r7++;
            if (r7 >= str.length()) {
                ((StringBuilder) this.f263f).append((CharSequence) str, this.f259b, r7);
                int q4 = q(r7);
                if (q4 == -1) {
                    this.f259b = r7;
                    return k(0, 0);
                }
                r7 = q4;
                z7 = true;
            }
        }
        String obj = !z7 ? str.subSequence(this.f259b, r7).toString() : k(this.f259b, r7);
        this.f259b = r7;
        return obj;
    }

    public String k(int i2, int i5) {
        ((StringBuilder) this.f263f).append((CharSequence) this.f262e, i2, i5);
        StringBuilder sb = (StringBuilder) this.f263f;
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        sb.setLength(0);
        return sb2;
    }

    public void l(int i2, String message, String hint) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(hint, "hint");
        String concat = hint.length() == 0 ? "" : "\n".concat(hint);
        StringBuilder l7 = C4.p.l(message, " at path: ");
        l7.append(((o) this.f260c).d());
        l7.append(concat);
        throw m.b(i2, l7.toString(), (String) this.f262e);
    }

    public void n(byte b7, boolean z7) {
        String str = (String) this.f262e;
        String k7 = m.k(b7);
        int i2 = z7 ? this.f259b - 1 : this.f259b;
        m(this, "Expected " + k7 + ", but had '" + ((this.f259b == str.length() || i2 < 0) ? "EOF" : String.valueOf(str.charAt(i2))) + "' instead", i2, 4);
        throw null;
    }

    public int o(CharSequence charSequence, int i2) {
        char charAt = charSequence.charAt(i2);
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
        String str = (String) this.f262e;
        int i2 = this.f259b;
        while (true) {
            int q4 = q(i2);
            if (q4 == -1) {
                this.f259b = q4;
                return (byte) 10;
            }
            char charAt = str.charAt(q4);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.f259b = q4;
                return m.d(charAt);
            }
            i2 = q4 + 1;
        }
    }

    public int q(int i2) {
        if (i2 < ((String) this.f262e).length()) {
            return i2;
        }
        return -1;
    }

    public int r() {
        char charAt;
        String str = (String) this.f262e;
        int i2 = this.f259b;
        if (i2 == -1) {
            return i2;
        }
        while (i2 < str.length() && ((charAt = str.charAt(i2)) == ' ' || charAt == '\n' || charAt == '\r' || charAt == '\t')) {
            i2++;
        }
        this.f259b = i2;
        return i2;
    }

    public boolean s() {
        int r7 = r();
        String str = (String) this.f262e;
        if (r7 == str.length() || r7 == -1 || str.charAt(r7) != ',') {
            return false;
        }
        this.f259b++;
        return true;
    }

    public void t(char c7) {
        int i2 = this.f259b;
        if (i2 > 0 && c7 == '\"') {
            try {
                this.f259b = i2 - 1;
                String j = j();
                this.f259b = i2;
                if (Intrinsics.a(j, "null")) {
                    l(this.f259b - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th) {
                this.f259b = i2;
                throw th;
            }
        }
        n(m.d(c7), true);
        throw null;
    }

    public String toString() {
        switch (this.f258a) {
            case 0:
                StringBuilder sb = new StringBuilder("JsonReader(source='");
                sb.append(this.f262e);
                sb.append("', currentPosition=");
                sb.append(this.f259b);
                sb.append(')');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public v(String source) {
        this.f258a = 0;
        Intrinsics.checkNotNullParameter(source, "source");
        o oVar = new o(0, (byte) 0);
        oVar.f230c = new Object[8];
        int[] iArr = new int[8];
        for (int i2 = 0; i2 < 8; i2++) {
            iArr[i2] = -1;
        }
        oVar.f231d = iArr;
        oVar.f229b = -1;
        this.f260c = oVar;
        this.f263f = new StringBuilder();
        this.f262e = source;
    }
}
