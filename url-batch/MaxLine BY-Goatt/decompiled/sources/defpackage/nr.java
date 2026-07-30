package defpackage;

import android.graphics.Bitmap;
import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class nr {
    public final fy a;
    public final mr b;
    public final Date c;
    public final String d;
    public final Date e;
    public final String f;
    public final Date g;
    public final long h;
    public final long i;
    public final String j;
    public final int k;

    public nr(fy fyVar, mr mrVar) {
        int i;
        int i2;
        Date date;
        Date date2;
        Date date3;
        DateFormat dateFormat;
        this.a = fyVar;
        this.b = mrVar;
        this.k = -1;
        if (mrVar != null) {
            this.h = mrVar.c;
            this.i = mrVar.d;
            mx0 mx0Var = mrVar.f;
            int size = mx0Var.size();
            int i3 = 0;
            int i4 = 0;
            while (i4 < size) {
                String b = mx0Var.b(i4);
                if (tp2.i(b, "Date", true)) {
                    String a = mx0Var.a("Date");
                    if (a != null) {
                        vb vbVar = l70.a;
                        if (a.length() != 0) {
                            ParsePosition parsePosition = new ParsePosition(i3);
                            Date parse = ((DateFormat) l70.a.get()).parse(a, parsePosition);
                            if (parsePosition.getIndex() == a.length()) {
                                date3 = parse;
                            } else {
                                String[] strArr = l70.b;
                                synchronized (strArr) {
                                    try {
                                        int length = strArr.length;
                                        int i5 = i3;
                                        while (i5 < length) {
                                            DateFormat[] dateFormatArr = l70.c;
                                            DateFormat dateFormat2 = dateFormatArr[i5];
                                            if (dateFormat2 == null) {
                                                dateFormat = new SimpleDateFormat(l70.b[i5], Locale.US);
                                                dateFormat.setTimeZone(n33.d);
                                                dateFormatArr[i5] = dateFormat;
                                                i3 = 0;
                                            } else {
                                                dateFormat = dateFormat2;
                                            }
                                            parsePosition.setIndex(i3);
                                            Date parse2 = dateFormat.parse(a, parsePosition);
                                            if (parsePosition.getIndex() != 0) {
                                                date3 = parse2;
                                                break;
                                            } else {
                                                i5++;
                                                i3 = 0;
                                            }
                                        }
                                        Unit unit = Unit.a;
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                            }
                            this.c = date3;
                            this.d = mx0Var.d(i4);
                        }
                    }
                    date3 = null;
                    this.c = date3;
                    this.d = mx0Var.d(i4);
                } else if (tp2.i(b, "Expires", true)) {
                    String a2 = mx0Var.a("Expires");
                    if (a2 != null) {
                        vb vbVar2 = l70.a;
                        if (a2.length() != 0) {
                            ParsePosition parsePosition2 = new ParsePosition(0);
                            Date parse3 = ((DateFormat) l70.a.get()).parse(a2, parsePosition2);
                            if (parsePosition2.getIndex() == a2.length()) {
                                date2 = parse3;
                            } else {
                                String[] strArr2 = l70.b;
                                synchronized (strArr2) {
                                    try {
                                        int length2 = strArr2.length;
                                        for (int i6 = 0; i6 < length2; i6++) {
                                            DateFormat[] dateFormatArr2 = l70.c;
                                            DateFormat dateFormat3 = dateFormatArr2[i6];
                                            if (dateFormat3 == null) {
                                                dateFormat3 = new SimpleDateFormat(l70.b[i6], Locale.US);
                                                dateFormat3.setTimeZone(n33.d);
                                                dateFormatArr2[i6] = dateFormat3;
                                            }
                                            parsePosition2.setIndex(0);
                                            date2 = dateFormat3.parse(a2, parsePosition2);
                                            if (parsePosition2.getIndex() != 0) {
                                                break;
                                            }
                                        }
                                        Unit unit2 = Unit.a;
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                            }
                            this.g = date2;
                        }
                    }
                    date2 = null;
                    this.g = date2;
                } else {
                    if (tp2.i(b, "Last-Modified", true)) {
                        String a3 = mx0Var.a("Last-Modified");
                        if (a3 != null) {
                            vb vbVar3 = l70.a;
                            if (a3.length() != 0) {
                                ParsePosition parsePosition3 = new ParsePosition(0);
                                Date parse4 = ((DateFormat) l70.a.get()).parse(a3, parsePosition3);
                                if (parsePosition3.getIndex() == a3.length()) {
                                    date = parse4;
                                    i = 0;
                                } else {
                                    String[] strArr3 = l70.b;
                                    synchronized (strArr3) {
                                        try {
                                            int length3 = strArr3.length;
                                            for (int i7 = 0; i7 < length3; i7++) {
                                                DateFormat[] dateFormatArr3 = l70.c;
                                                DateFormat dateFormat4 = dateFormatArr3[i7];
                                                if (dateFormat4 == null) {
                                                    dateFormat4 = new SimpleDateFormat(l70.b[i7], Locale.US);
                                                    dateFormat4.setTimeZone(n33.d);
                                                    dateFormatArr3[i7] = dateFormat4;
                                                }
                                                i = 0;
                                                parsePosition3.setIndex(0);
                                                date = dateFormat4.parse(a3, parsePosition3);
                                                if (parsePosition3.getIndex() != 0) {
                                                    break;
                                                }
                                            }
                                            i = 0;
                                            Unit unit3 = Unit.a;
                                            date = null;
                                        } catch (Throwable th3) {
                                            throw th3;
                                        }
                                    }
                                }
                                this.e = date;
                                this.f = mx0Var.d(i4);
                            }
                        }
                        i = 0;
                        date = null;
                        this.e = date;
                        this.f = mx0Var.d(i4);
                    } else {
                        i = 0;
                        if (tp2.i(b, "ETag", true)) {
                            this.j = mx0Var.d(i4);
                        } else if (tp2.i(b, "Age", true)) {
                            String d = mx0Var.d(i4);
                            Bitmap.Config[] configArr = l.a;
                            Long g = b.g(d);
                            if (g != null) {
                                long longValue = g.longValue();
                                i2 = longValue > 2147483647L ? Integer.MAX_VALUE : longValue < 0 ? 0 : (int) longValue;
                            } else {
                                i2 = -1;
                            }
                            this.k = i2;
                        }
                    }
                    i4++;
                    i3 = i;
                }
                i = 0;
                i4++;
                i3 = i;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00cf, code lost:
    
        if (r4 > 0) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final or a() {
        mr mrVar;
        long j;
        String sb;
        long j2;
        Date date;
        long j3;
        int i;
        fy fyVar = this.a;
        kz0 kz0Var = (kz0) fyVar.n;
        mr mrVar2 = this.b;
        if (mrVar2 == null) {
            return new or(fyVar, null);
        }
        y91 y91Var = mrVar2.a;
        if (kz0Var.i && !mrVar2.e) {
            return new or(fyVar, null);
        }
        gr grVar = (gr) y91Var.getValue();
        if (fyVar.g().b || ((gr) y91Var.getValue()).b || Intrinsics.b(mrVar2.f.a("Vary"), "*")) {
            return new or(fyVar, null);
        }
        gr g = fyVar.g();
        if (!g.a) {
            mx0 mx0Var = (mx0) fyVar.p;
            String str = "If-Modified-Since";
            if (mx0Var.a("If-Modified-Since") == null && mx0Var.a("If-None-Match") == null) {
                long j4 = this.i;
                Date date2 = this.c;
                if (date2 != null) {
                    mrVar = mrVar2;
                    j = Math.max(0L, j4 - date2.getTime());
                } else {
                    mrVar = mrVar2;
                    j = 0;
                }
                TimeUnit timeUnit = TimeUnit.SECONDS;
                int i2 = this.k;
                if (i2 != -1) {
                    j = Math.max(j, timeUnit.toMillis(i2));
                }
                long j5 = this.h;
                long longValue = j + (j4 - j5) + (((Number) ox2.a.invoke()).longValue() - j4);
                int i3 = ((gr) y91Var.getValue()).c;
                Date date3 = this.e;
                if (i3 != -1) {
                    j2 = timeUnit.toMillis(i3);
                } else {
                    Date date4 = this.g;
                    if (date4 != null) {
                        if (date2 != null) {
                            j4 = date2.getTime();
                        }
                        j2 = date4.getTime() - j4;
                    } else {
                        if (date3 != null) {
                            List list = kz0Var.f;
                            if (list == null) {
                                sb = null;
                            } else {
                                StringBuilder sb2 = new StringBuilder();
                                u30.t(list, sb2);
                                sb = sb2.toString();
                            }
                            if (sb == null) {
                                if (date2 != null) {
                                    j5 = date2.getTime();
                                }
                                long time = j5 - date3.getTime();
                                if (time > 0) {
                                    j2 = time / 10;
                                }
                            }
                        }
                        j2 = 0;
                    }
                }
                int i4 = g.c;
                if (i4 != -1) {
                    j2 = Math.min(j2, timeUnit.toMillis(i4));
                }
                int i5 = g.i;
                long millis = i5 != -1 ? timeUnit.toMillis(i5) : 0L;
                if (grVar.g || (i = g.h) == -1) {
                    date = date3;
                    j3 = 0;
                } else {
                    date = date3;
                    j3 = timeUnit.toMillis(i);
                }
                if (!grVar.a && longValue + millis < j2 + j3) {
                    return new or(null, mrVar);
                }
                mr mrVar3 = mrVar;
                String str2 = this.j;
                if (str2 != null) {
                    str = "If-None-Match";
                } else if (date != null) {
                    str2 = this.f;
                    str2.getClass();
                } else {
                    if (date2 == null) {
                        return new or(fyVar, null);
                    }
                    str2 = this.d;
                    str2.getClass();
                }
                js0 m = fyVar.m();
                lx0 lx0Var = (lx0) m.o;
                lx0Var.getClass();
                z71.h(str);
                z71.i(str2, str);
                lx0Var.a(str, str2);
                return new or(m.c(), mrVar3);
            }
        }
        return new or(fyVar, null);
    }
}
