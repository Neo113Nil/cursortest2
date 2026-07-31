package o3;

import android.text.SpannableStringBuilder;
import x.v0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final String f5604b;

    /* renamed from: c, reason: collision with root package name */
    public static final String f5605c;

    /* renamed from: d, reason: collision with root package name */
    public static final b f5606d;

    /* renamed from: e, reason: collision with root package name */
    public static final b f5607e;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f5608a;

    static {
        k5.c cVar = f.f5616c;
        f5604b = Character.toString((char) 8206);
        f5605c = Character.toString((char) 8207);
        f5606d = new b(false);
        f5607e = new b(true);
    }

    public b(boolean z3) {
        k5.c cVar = f.f5614a;
        this.f5608a = z3;
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
    
        if (r0.f5602c <= 0) goto L63;
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
        aVar.f5602c = 0;
        int i = 0;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            int i10 = aVar.f5602c;
            if (i10 < aVar.f5601b && i == 0) {
                CharSequence charSequence2 = aVar.f5600a;
                char charAt = charSequence2.charAt(i10);
                aVar.f5603d = charAt;
                if (Character.isHighSurrogate(charAt)) {
                    int codePointAt = Character.codePointAt(charSequence2, aVar.f5602c);
                    aVar.f5602c = Character.charCount(codePointAt) + aVar.f5602c;
                    directionality = Character.getDirectionality(codePointAt);
                } else {
                    aVar.f5602c++;
                    char c8 = aVar.f5603d;
                    directionality = c8 < 1792 ? a.f5599e[c8] : Character.getDirectionality(c8);
                }
                if (directionality != 0) {
                    if (directionality == 1 || directionality == 2) {
                        if (i9 == 0) {
                        }
                    } else if (directionality != 9) {
                        switch (directionality) {
                            case 14:
                            case v0.f8308f /* 15 */:
                                i9++;
                                i8 = -1;
                                continue;
                            case 16:
                            case 17:
                                i9++;
                                i8 = 1;
                                continue;
                            case 18:
                                i9--;
                                i8 = 0;
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
        aVar.f5602c = aVar.f5601b;
        int i = 0;
        while (true) {
            int i8 = i;
            while (aVar.f5602c > 0) {
                byte a8 = aVar.a();
                if (a8 != 0) {
                    if (a8 == 1 || a8 == 2) {
                        if (i != 0) {
                            if (i8 == 0) {
                                break;
                            }
                        }
                    } else if (a8 != 9) {
                        switch (a8) {
                            case 14:
                            case v0.f8308f /* 15 */:
                                if (i8 == i) {
                                    return -1;
                                }
                                i--;
                                break;
                            case 16:
                            case 17:
                                if (i8 == i) {
                                    break;
                                }
                                i--;
                                break;
                            case 18:
                                i++;
                                break;
                            default:
                                if (i8 != 0) {
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
                    if (i8 == 0) {
                        break;
                    }
                }
            }
            return 0;
        }
    }

    public final SpannableStringBuilder c(CharSequence charSequence) {
        k5.c cVar = f.f5616c;
        if (charSequence == null) {
            return null;
        }
        boolean b8 = cVar.b(charSequence.length(), charSequence);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean b9 = (b8 ? f.f5615b : f.f5614a).b(charSequence.length(), charSequence);
        String str = "";
        String str2 = f5605c;
        String str3 = f5604b;
        boolean z3 = this.f5608a;
        spannableStringBuilder.append((CharSequence) ((z3 || !(b9 || a(charSequence) == 1)) ? (!z3 || (b9 && a(charSequence) != -1)) ? "" : str2 : str3));
        if (b8 != z3) {
            spannableStringBuilder.append(b8 ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean b10 = (b8 ? f.f5615b : f.f5614a).b(charSequence.length(), charSequence);
        if (!z3 && (b10 || b(charSequence) == 1)) {
            str = str3;
        } else if (z3 && (!b10 || b(charSequence) == -1)) {
            str = str2;
        }
        spannableStringBuilder.append((CharSequence) str);
        return spannableStringBuilder;
    }
}
