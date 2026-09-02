package l0;

import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final String f2533b;

    /* renamed from: c, reason: collision with root package name */
    public static final String f2534c;
    public static final b d;

    /* renamed from: e, reason: collision with root package name */
    public static final b f2535e;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2536a;

    static {
        f fVar = g.f2545c;
        f2533b = Character.toString((char) 8206);
        f2534c = Character.toString((char) 8207);
        d = new b(false);
        f2535e = new b(true);
    }

    public b(boolean z3) {
        f fVar = g.f2543a;
        this.f2536a = z3;
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
    
        if (r0.f2532c <= 0) goto L63;
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
        aVar.f2532c = 0;
        int i = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int i6 = aVar.f2532c;
            if (i6 < aVar.f2531b && i == 0) {
                CharSequence charSequence2 = aVar.f2530a;
                char charAt = charSequence2.charAt(i6);
                aVar.d = charAt;
                if (Character.isHighSurrogate(charAt)) {
                    int codePointAt = Character.codePointAt(charSequence2, aVar.f2532c);
                    aVar.f2532c = Character.charCount(codePointAt) + aVar.f2532c;
                    directionality = Character.getDirectionality(codePointAt);
                } else {
                    aVar.f2532c++;
                    char c4 = aVar.d;
                    directionality = c4 < 1792 ? a.f2529e[c4] : Character.getDirectionality(c4);
                }
                if (directionality != 0) {
                    if (directionality == 1 || directionality == 2) {
                        if (i5 == 0) {
                        }
                    } else if (directionality != 9) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                i5++;
                                i4 = -1;
                                continue;
                            case 16:
                            case 17:
                                i5++;
                                i4 = 1;
                                continue;
                            case 18:
                                i5--;
                                i4 = 0;
                                continue;
                        }
                    }
                } else if (i5 == 0) {
                }
                i = i5;
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
        aVar.f2532c = aVar.f2531b;
        int i = 0;
        while (true) {
            int i4 = i;
            while (aVar.f2532c > 0) {
                byte a2 = aVar.a();
                if (a2 != 0) {
                    if (a2 == 1 || a2 == 2) {
                        if (i != 0) {
                            if (i4 == 0) {
                                break;
                            }
                        }
                    } else if (a2 != 9) {
                        switch (a2) {
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
        f fVar = g.f2545c;
        if (charSequence == null) {
            return null;
        }
        boolean b4 = fVar.b(charSequence, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean b5 = (b4 ? g.f2544b : g.f2543a).b(charSequence, charSequence.length());
        String str = "";
        String str2 = f2534c;
        String str3 = f2533b;
        boolean z3 = this.f2536a;
        spannableStringBuilder.append((CharSequence) ((z3 || !(b5 || a(charSequence) == 1)) ? (!z3 || (b5 && a(charSequence) != -1)) ? "" : str2 : str3));
        if (b4 != z3) {
            spannableStringBuilder.append(b4 ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean b6 = (b4 ? g.f2544b : g.f2543a).b(charSequence, charSequence.length());
        if (!z3 && (b6 || b(charSequence) == 1)) {
            str = str3;
        } else if (z3 && (!b6 || b(charSequence) == -1)) {
            str = str2;
        }
        spannableStringBuilder.append((CharSequence) str);
        return spannableStringBuilder;
    }
}
