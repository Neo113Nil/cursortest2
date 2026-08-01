package i0;

import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final String f2084b;
    public static final String c;

    /* renamed from: d, reason: collision with root package name */
    public static final b f2085d;

    /* renamed from: e, reason: collision with root package name */
    public static final b f2086e;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2087a;

    static {
        f fVar = g.c;
        f2084b = Character.toString((char) 8206);
        c = Character.toString((char) 8207);
        f2085d = new b(false);
        f2086e = new b(true);
    }

    public b(boolean z3) {
        f fVar = g.f2094a;
        this.f2087a = z3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0085, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x006e, code lost:
    
        if (r1 != 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0071, code lost:
    
        if (r2 == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0073, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0076, code lost:
    
        if (r0.c <= 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x007c, code lost:
    
        switch(r0.a()) {
            case 14: goto L66;
            case 15: goto L66;
            case 16: goto L65;
            case 17: goto L65;
            case 18: goto L64;
            default: goto L70;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0080, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0083, code lost:
    
        if (r1 != r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0086, code lost:
    
        r3 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0089, code lost:
    
        if (r1 != r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x008c, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(CharSequence charSequence) {
        byte directionality;
        a aVar = new a(charSequence);
        aVar.c = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int i7 = aVar.c;
            if (i7 < aVar.f2082b && i4 == 0) {
                CharSequence charSequence2 = aVar.f2081a;
                char charAt = charSequence2.charAt(i7);
                aVar.f2083d = charAt;
                if (Character.isHighSurrogate(charAt)) {
                    int codePointAt = Character.codePointAt(charSequence2, aVar.c);
                    aVar.c = Character.charCount(codePointAt) + aVar.c;
                    directionality = Character.getDirectionality(codePointAt);
                } else {
                    aVar.c++;
                    char c4 = aVar.f2083d;
                    directionality = c4 < 1792 ? a.f2080e[c4] : Character.getDirectionality(c4);
                }
                if (directionality != 0) {
                    if (directionality == 1 || directionality == 2) {
                        if (i6 == 0) {
                        }
                    } else if (directionality != 9) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                i6++;
                                i5 = -1;
                                continue;
                            case 16:
                            case 17:
                                i6++;
                                i5 = 1;
                                continue;
                            case 18:
                                i6--;
                                i5 = 0;
                                continue;
                        }
                    }
                } else if (i6 == 0) {
                }
                i4 = i6;
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
        a aVar = new a(charSequence);
        aVar.c = aVar.f2082b;
        int i4 = 0;
        while (true) {
            int i5 = i4;
            while (aVar.c > 0) {
                byte a4 = aVar.a();
                if (a4 != 0) {
                    if (a4 == 1 || a4 == 2) {
                        if (i4 != 0) {
                            if (i5 == 0) {
                                break;
                            }
                        }
                    } else if (a4 != 9) {
                        switch (a4) {
                            case 14:
                            case 15:
                                if (i5 == i4) {
                                    return -1;
                                }
                                i4--;
                                break;
                            case 16:
                            case 17:
                                if (i5 == i4) {
                                    break;
                                }
                                i4--;
                                break;
                            case 18:
                                i4++;
                                break;
                            default:
                                if (i5 != 0) {
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
                    if (i4 == 0) {
                        return -1;
                    }
                    if (i5 == 0) {
                        break;
                    }
                }
            }
            return 0;
        }
    }

    public final SpannableStringBuilder c(CharSequence charSequence) {
        f fVar = g.c;
        if (charSequence == null) {
            return null;
        }
        boolean b2 = fVar.b(charSequence, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean b4 = (b2 ? g.f2095b : g.f2094a).b(charSequence, charSequence.length());
        String str = "";
        String str2 = c;
        String str3 = f2084b;
        boolean z3 = this.f2087a;
        spannableStringBuilder.append((CharSequence) ((z3 || !(b4 || a(charSequence) == 1)) ? (!z3 || (b4 && a(charSequence) != -1)) ? "" : str2 : str3));
        if (b2 != z3) {
            spannableStringBuilder.append(b2 ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean b5 = (b2 ? g.f2095b : g.f2094a).b(charSequence, charSequence.length());
        if (!z3 && (b5 || b(charSequence) == 1)) {
            str = str3;
        } else if (z3 && (!b5 || b(charSequence) == -1)) {
            str = str2;
        }
        spannableStringBuilder.append((CharSequence) str);
        return spannableStringBuilder;
    }
}
