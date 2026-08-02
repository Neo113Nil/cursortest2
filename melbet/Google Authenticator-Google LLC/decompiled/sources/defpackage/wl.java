package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wl {
    public static final String a;
    public static final String b;
    public static final wl c;
    public static final wl d;
    public static final jxu g;
    public final boolean e;
    public final int f = 2;
    public final jxu h;

    static {
        jxu jxuVar = wn.c;
        g = jxuVar;
        a = Character.toString((char) 8206);
        b = Character.toString((char) 8207);
        c = new wl(false, jxuVar);
        d = new wl(true, jxuVar);
    }

    public wl(boolean z, jxu jxuVar) {
        this.e = z;
        this.h = jxuVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0065, code lost:
    
        if (r1 != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0067, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0068, code lost:
    
        if (r2 != 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x006c, code lost:
    
        if (r0.c <= 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0072, code lost:
    
        switch(r0.a()) {
            case 14: goto L62;
            case 15: goto L62;
            case 16: goto L61;
            case 17: goto L61;
            case 18: goto L60;
            default: goto L67;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0076, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0079, code lost:
    
        if (r1 != r3) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x007f, code lost:
    
        r3 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x007b, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x007c, code lost:
    
        if (r1 != r3) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x007e, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0082, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0083, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(CharSequence charSequence) {
        byte b2;
        wk wkVar = new wk(charSequence);
        wkVar.c = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = wkVar.c;
            if (i4 < wkVar.b && i == 0) {
                CharSequence charSequence2 = wkVar.a;
                char charAt = charSequence2.charAt(i4);
                wkVar.d = charAt;
                if (Character.isHighSurrogate(charAt)) {
                    int codePointAt = Character.codePointAt(charSequence2, wkVar.c);
                    wkVar.c += Character.charCount(codePointAt);
                    b2 = Character.getDirectionality(codePointAt);
                } else {
                    wkVar.c++;
                    b2 = wk.b(wkVar.d);
                }
                if (b2 != 0) {
                    if (b2 == 1 || b2 == 2) {
                        if (i3 == 0) {
                            return 1;
                        }
                    } else if (b2 != 9) {
                        switch (b2) {
                            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                            case 15:
                                i3++;
                                i2 = -1;
                                continue;
                            case 16:
                            case 17:
                                i3++;
                                i2 = 1;
                                continue;
                            case 18:
                                i3--;
                                i2 = 0;
                                continue;
                        }
                    }
                } else if (i3 == 0) {
                    return -1;
                }
                i = i3;
            }
        }
    }

    public static int b(CharSequence charSequence) {
        wk wkVar = new wk(charSequence);
        wkVar.c = wkVar.b;
        int i = 0;
        while (true) {
            int i2 = i;
            while (wkVar.c > 0) {
                byte a2 = wkVar.a();
                if (a2 != 0) {
                    if (a2 == 1 || a2 == 2) {
                        if (i == 0) {
                            return 1;
                        }
                        if (i2 == 0) {
                            break;
                        }
                    } else if (a2 != 9) {
                        switch (a2) {
                            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                            case 15:
                                if (i2 == i) {
                                    return -1;
                                }
                                i--;
                                break;
                            case 16:
                            case 17:
                                if (i2 == i) {
                                    return 1;
                                }
                                i--;
                                break;
                            case 18:
                                i++;
                                break;
                            default:
                                if (i2 != 0) {
                                    break;
                                } else {
                                    break;
                                }
                                break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    if (i == 0) {
                        return -1;
                    }
                    if (i2 == 0) {
                        break;
                    }
                }
            }
            return 0;
        }
    }
}
