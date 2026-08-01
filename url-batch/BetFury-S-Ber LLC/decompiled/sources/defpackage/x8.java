package defpackage;

import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class x8 {
    public static final String b;
    public static final String c;
    public static final x8 d;
    public static final x8 e;
    public final boolean a;

    static {
        e9 e9Var = ph0.c;
        b = Character.toString((char) 8206);
        c = Character.toString((char) 8207);
        d = new x8(false);
        e = new x8(true);
    }

    public x8(boolean z) {
        e9 e9Var = ph0.a;
        this.a = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0084, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x006d, code lost:
    
        if (r1 != 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0070, code lost:
    
        if (r2 == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0072, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0075, code lost:
    
        if (r0.c <= 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x007b, code lost:
    
        switch(r0.a()) {
            case 14: goto L66;
            case 15: goto L66;
            case 16: goto L65;
            case 17: goto L65;
            case 18: goto L64;
            default: goto L70;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x007f, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0082, code lost:
    
        if (r1 != r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0085, code lost:
    
        r3 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0088, code lost:
    
        if (r1 != r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x008b, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(CharSequence charSequence) {
        byte directionality;
        w8 w8Var = new w8(charSequence);
        w8Var.c = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = w8Var.c;
            if (i4 < w8Var.b && i == 0) {
                CharSequence charSequence2 = w8Var.a;
                char charAt = charSequence2.charAt(i4);
                w8Var.d = charAt;
                boolean isHighSurrogate = Character.isHighSurrogate(charAt);
                int i5 = w8Var.c;
                if (isHighSurrogate) {
                    int codePointAt = Character.codePointAt(charSequence2, i5);
                    w8Var.c = Character.charCount(codePointAt) + w8Var.c;
                    directionality = Character.getDirectionality(codePointAt);
                } else {
                    w8Var.c = i5 + 1;
                    char c2 = w8Var.d;
                    directionality = c2 < 1792 ? w8.e[c2] : Character.getDirectionality(c2);
                }
                if (directionality != 0) {
                    if (directionality == 1 || directionality == 2) {
                        if (i3 == 0) {
                        }
                    } else if (directionality != 9) {
                        switch (directionality) {
                            case 14:
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
                }
                i = i3;
            }
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0034, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int b(CharSequence charSequence) {
        w8 w8Var = new w8(charSequence);
        w8Var.c = w8Var.b;
        int i = 0;
        while (true) {
            int i2 = i;
            while (w8Var.c > 0) {
                byte a = w8Var.a();
                if (a != 0) {
                    if (a == 1 || a == 2) {
                        if (i != 0) {
                            if (i2 == 0) {
                                break;
                            }
                        }
                    } else if (a != 9) {
                        switch (a) {
                            case 14:
                            case 15:
                                if (i2 == i) {
                                    return -1;
                                }
                                i--;
                                break;
                            case 16:
                            case 17:
                                if (i2 == i) {
                                    break;
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

    public final SpannableStringBuilder c(CharSequence charSequence) {
        e9 e9Var = ph0.c;
        if (charSequence == null) {
            return null;
        }
        boolean c2 = e9Var.c(charSequence, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean c3 = (c2 ? ph0.b : ph0.a).c(charSequence, charSequence.length());
        String str = "";
        String str2 = c;
        String str3 = b;
        boolean z = this.a;
        spannableStringBuilder.append((CharSequence) ((z || !(c3 || a(charSequence) == 1)) ? (!z || (c3 && a(charSequence) != -1)) ? "" : str2 : str3));
        if (c2 != z) {
            spannableStringBuilder.append(c2 ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean c4 = (c2 ? ph0.b : ph0.a).c(charSequence, charSequence.length());
        if (!z && (c4 || b(charSequence) == 1)) {
            str = str3;
        } else if (z && (!c4 || b(charSequence) == -1)) {
            str = str2;
        }
        spannableStringBuilder.append((CharSequence) str);
        return spannableStringBuilder;
    }
}
