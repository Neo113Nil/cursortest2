package M;

import android.text.SpannableStringBuilder;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final String f1817b;

    /* renamed from: c, reason: collision with root package name */
    public static final String f1818c;

    /* renamed from: d, reason: collision with root package name */
    public static final b f1819d;

    /* renamed from: e, reason: collision with root package name */
    public static final b f1820e;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1821a;

    static {
        h hVar = i.f1831c;
        f1817b = Character.toString((char) 8206);
        f1818c = Character.toString((char) 8207);
        f1819d = new b(false);
        f1820e = new b(true);
    }

    public b(boolean z8) {
        h hVar = i.f1829a;
        this.f1821a = z8;
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
    
        if (r0.f1815c <= 0) goto L63;
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
        aVar.f1815c = 0;
        int i = 0;
        int i4 = 0;
        int i9 = 0;
        while (true) {
            int i10 = aVar.f1815c;
            if (i10 < aVar.f1814b && i == 0) {
                CharSequence charSequence2 = aVar.f1813a;
                char charAt = charSequence2.charAt(i10);
                aVar.f1816d = charAt;
                if (Character.isHighSurrogate(charAt)) {
                    int codePointAt = Character.codePointAt(charSequence2, aVar.f1815c);
                    aVar.f1815c = Character.charCount(codePointAt) + aVar.f1815c;
                    directionality = Character.getDirectionality(codePointAt);
                } else {
                    aVar.f1815c++;
                    char c4 = aVar.f1816d;
                    directionality = c4 < 1792 ? a.f1812e[c4] : Character.getDirectionality(c4);
                }
                if (directionality != 0) {
                    if (directionality == 1 || directionality == 2) {
                        if (i9 == 0) {
                        }
                    } else if (directionality != 9) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                i9++;
                                i4 = -1;
                                continue;
                            case 16:
                            case 17:
                                i9++;
                                i4 = 1;
                                continue;
                            case 18:
                                i9--;
                                i4 = 0;
                                continue;
                        }
                    }
                } else if (i9 == 0) {
                }
                i = i9;
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
        aVar.f1815c = aVar.f1814b;
        int i = 0;
        while (true) {
            int i4 = i;
            while (aVar.f1815c > 0) {
                byte a9 = aVar.a();
                if (a9 != 0) {
                    if (a9 == 1 || a9 == 2) {
                        if (i != 0) {
                            if (i4 == 0) {
                                break;
                            }
                        }
                    } else if (a9 != 9) {
                        switch (a9) {
                            case 14:
                            case 15:
                                if (i4 == i) {
                                    return -1;
                                }
                                i--;
                                break;
                            case 16:
                            case 17:
                                if (i4 == i) {
                                    break;
                                }
                                i--;
                                break;
                            case 18:
                                i++;
                                break;
                            default:
                                if (i4 != 0) {
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
                    if (i4 == 0) {
                        break;
                    }
                }
            }
            return 0;
        }
    }

    public final SpannableStringBuilder c(CharSequence charSequence) {
        h hVar = i.f1831c;
        if (charSequence == null) {
            return null;
        }
        boolean c4 = hVar.c(charSequence, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean c9 = (c4 ? i.f1830b : i.f1829a).c(charSequence, charSequence.length());
        String str = "";
        String str2 = f1818c;
        String str3 = f1817b;
        boolean z8 = this.f1821a;
        spannableStringBuilder.append((CharSequence) ((z8 || !(c9 || a(charSequence) == 1)) ? (!z8 || (c9 && a(charSequence) != -1)) ? "" : str2 : str3));
        if (c4 != z8) {
            spannableStringBuilder.append(c4 ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean c10 = (c4 ? i.f1830b : i.f1829a).c(charSequence, charSequence.length());
        if (!z8 && (c10 || b(charSequence) == 1)) {
            str = str3;
        } else if (z8 && (!c10 || b(charSequence) == -1)) {
            str = str2;
        }
        spannableStringBuilder.append((CharSequence) str);
        return spannableStringBuilder;
    }
}
