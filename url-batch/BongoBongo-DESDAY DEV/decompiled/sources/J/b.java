package J;

import android.text.SpannableStringBuilder;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final String f351b;

    /* renamed from: c, reason: collision with root package name */
    public static final String f352c;
    public static final b d;

    /* renamed from: e, reason: collision with root package name */
    public static final b f353e;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f354a;

    static {
        g gVar = h.f363c;
        f351b = Character.toString((char) 8206);
        f352c = Character.toString((char) 8207);
        d = new b(false);
        f353e = new b(true);
    }

    public b(boolean z2) {
        g gVar = h.f361a;
        this.f354a = z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x008f, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0070, code lost:
    
        if (r1 != 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0073, code lost:
    
        if (r2 == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0079, code lost:
    
        if (r0.f350c <= 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x007f, code lost:
    
        switch(r0.a()) {
            case 14: goto L66;
            case 15: goto L66;
            case 16: goto L65;
            case 17: goto L65;
            case 18: goto L64;
            default: goto L70;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0083, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0086, code lost:
    
        if (r1 != r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0089, code lost:
    
        r3 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x008c, code lost:
    
        if (r1 != r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:?, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(CharSequence charSequence) {
        byte directionality;
        a aVar = new a(charSequence);
        aVar.f350c = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = aVar.f350c;
            if (i4 < aVar.f349b && i == 0) {
                CharSequence charSequence2 = aVar.f348a;
                char charAt = charSequence2.charAt(i4);
                aVar.d = charAt;
                if (Character.isHighSurrogate(charAt)) {
                    int codePointAt = Character.codePointAt(charSequence2, aVar.f350c);
                    aVar.f350c = Character.charCount(codePointAt) + aVar.f350c;
                    directionality = Character.getDirectionality(codePointAt);
                } else {
                    aVar.f350c++;
                    char c2 = aVar.d;
                    directionality = c2 < 1792 ? a.f347e[c2] : Character.getDirectionality(c2);
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

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0041, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int b(CharSequence charSequence) {
        a aVar = new a(charSequence);
        aVar.f350c = aVar.f349b;
        int i = 0;
        while (true) {
            int i2 = i;
            while (aVar.f350c > 0) {
                byte a2 = aVar.a();
                if (a2 != 0) {
                    if (a2 == 1 || a2 == 2) {
                        if (i != 0) {
                            if (i2 == 0) {
                                break;
                            }
                        }
                    } else if (a2 != 9) {
                        switch (a2) {
                            case 14:
                            case 15:
                                if (i2 == i) {
                                    break;
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
                } else if (i != 0) {
                    if (i2 == 0) {
                        break;
                    }
                }
            }
            return 0;
        }
        return -1;
    }

    public final SpannableStringBuilder c(CharSequence charSequence) {
        g gVar = h.f363c;
        if (charSequence == null) {
            return null;
        }
        boolean b2 = gVar.b(charSequence, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean b3 = (b2 ? h.f362b : h.f361a).b(charSequence, charSequence.length());
        String str = "";
        String str2 = f352c;
        String str3 = f351b;
        boolean z2 = this.f354a;
        spannableStringBuilder.append((CharSequence) ((z2 || !(b3 || a(charSequence) == 1)) ? (!z2 || (b3 && a(charSequence) != -1)) ? "" : str2 : str3));
        if (b2 != z2) {
            spannableStringBuilder.append(b2 ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean b4 = (b2 ? h.f362b : h.f361a).b(charSequence, charSequence.length());
        if (!z2 && (b4 || b(charSequence) == 1)) {
            str = str3;
        } else if (z2 && (!b4 || b(charSequence) == -1)) {
            str = str2;
        }
        spannableStringBuilder.append((CharSequence) str);
        return spannableStringBuilder;
    }
}
