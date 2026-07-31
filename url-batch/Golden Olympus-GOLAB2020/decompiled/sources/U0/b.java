package U0;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.security.auth.x500.X500Principal;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final String f9355a;

    /* renamed from: b, reason: collision with root package name */
    private final int f9356b;

    /* renamed from: c, reason: collision with root package name */
    private int f9357c;

    /* renamed from: d, reason: collision with root package name */
    private int f9358d;

    /* renamed from: e, reason: collision with root package name */
    private int f9359e;

    /* renamed from: f, reason: collision with root package name */
    private int f9360f;

    /* renamed from: g, reason: collision with root package name */
    private char[] f9361g;

    public b(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.f9355a = name;
        this.f9356b = name.length();
    }

    private int a(int i4) {
        int i5;
        int i6;
        int i7 = i4 + 1;
        if (i7 >= this.f9356b) {
            throw new IllegalStateException("Malformed DN: " + this.f9355a);
        }
        char[] cArr = this.f9361g;
        char c4 = cArr[i4];
        if (c4 >= '0' && c4 <= '9') {
            i5 = c4 - '0';
        } else if (c4 >= 'a' && c4 <= 'f') {
            i5 = c4 - 'W';
        } else {
            if (c4 < 'A' || c4 > 'F') {
                throw new IllegalStateException("Malformed DN: " + this.f9355a);
            }
            i5 = c4 - '7';
        }
        char c5 = cArr[i7];
        if (c5 >= '0' && c5 <= '9') {
            i6 = c5 - '0';
        } else if (c5 >= 'a' && c5 <= 'f') {
            i6 = c5 - 'W';
        } else {
            if (c5 < 'A' || c5 > 'F') {
                throw new IllegalStateException("Malformed DN: " + this.f9355a);
            }
            i6 = c5 - '7';
        }
        return (i5 << 4) + i6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x009b, code lost:
    
        return new java.lang.String(r1, r2, r8.f9360f - r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String b() {
        char[] cArr;
        int i4;
        int i5;
        char c4;
        int i6 = this.f9357c;
        this.f9358d = i6;
        this.f9359e = i6;
        while (true) {
            int i7 = this.f9357c;
            if (i7 >= this.f9356b) {
                char[] cArr2 = this.f9361g;
                int i8 = this.f9358d;
                return new String(cArr2, i8, this.f9359e - i8);
            }
            cArr = this.f9361g;
            char c5 = cArr[i7];
            if (c5 == ' ') {
                int i9 = this.f9359e;
                this.f9360f = i9;
                this.f9357c = i7 + 1;
                this.f9359e = i9 + 1;
                cArr[i9] = ' ';
                while (true) {
                    i4 = this.f9357c;
                    i5 = this.f9356b;
                    if (i4 >= i5) {
                        break;
                    }
                    char[] cArr3 = this.f9361g;
                    if (cArr3[i4] != ' ') {
                        break;
                    }
                    int i10 = this.f9359e;
                    this.f9359e = i10 + 1;
                    cArr3[i10] = ' ';
                    this.f9357c = i4 + 1;
                }
                if (i4 == i5 || (c4 = this.f9361g[i4]) == ',' || c4 == '+' || c4 == ';') {
                    break;
                }
            } else {
                if (c5 == ';') {
                    break;
                }
                if (c5 == '\\') {
                    int i11 = this.f9359e;
                    this.f9359e = i11 + 1;
                    cArr[i11] = c();
                    this.f9357c++;
                } else {
                    if (c5 == '+' || c5 == ',') {
                        break;
                    }
                    int i12 = this.f9359e;
                    this.f9359e = i12 + 1;
                    cArr[i12] = c5;
                    this.f9357c = i7 + 1;
                }
            }
        }
        int i13 = this.f9358d;
        return new String(cArr, i13, this.f9359e - i13);
    }

    private char c() {
        int i4 = this.f9357c + 1;
        this.f9357c = i4;
        if (i4 == this.f9356b) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f9355a);
        }
        char c4 = this.f9361g[i4];
        if (c4 == ' ' || c4 == '%' || c4 == '\\' || c4 == '_' || c4 == '\"' || c4 == '#') {
            return c4;
        }
        switch (c4) {
            case '*':
            case '+':
            case IronSourceConstants.APP_ENTER_BACKGROUND /* 44 */:
                return c4;
            default:
                switch (c4) {
                    case ';':
                    case '<':
                    case '=':
                    case IronSourceConstants.RETRY_LIMIT /* 62 */:
                        return c4;
                    default:
                        return e();
                }
        }
    }

    private char e() {
        int i4;
        int i5;
        int a4 = a(this.f9357c);
        this.f9357c++;
        if (a4 < 128) {
            return (char) a4;
        }
        if (a4 < 192 || a4 > 247) {
            return '?';
        }
        if (a4 <= 223) {
            i4 = a4 & 31;
            i5 = 1;
        } else if (a4 <= 239) {
            i4 = a4 & 15;
            i5 = 2;
        } else {
            i4 = a4 & 7;
            i5 = 3;
        }
        for (int i6 = 0; i6 < i5; i6++) {
            int i7 = this.f9357c;
            int i8 = i7 + 1;
            this.f9357c = i8;
            if (i8 == this.f9356b || this.f9361g[i8] != '\\') {
                return '?';
            }
            int i9 = i7 + 2;
            this.f9357c = i9;
            int a5 = a(i9);
            this.f9357c++;
            if ((a5 & 192) != 128) {
                return '?';
            }
            i4 = (i4 << 6) + (a5 & 63);
        }
        return (char) i4;
    }

    private String f() {
        int i4;
        char[] cArr;
        char c4;
        int i5 = this.f9357c;
        if (i5 + 4 >= this.f9356b) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f9355a);
        }
        this.f9358d = i5;
        this.f9357c = i5 + 1;
        while (true) {
            i4 = this.f9357c;
            if (i4 == this.f9356b || (c4 = (cArr = this.f9361g)[i4]) == '+' || c4 == ',' || c4 == ';') {
                break;
            }
            if (c4 == ' ') {
                this.f9359e = i4;
                this.f9357c = i4 + 1;
                while (true) {
                    int i6 = this.f9357c;
                    if (i6 >= this.f9356b || this.f9361g[i6] != ' ') {
                        break;
                    }
                    this.f9357c = i6 + 1;
                }
            } else {
                if (c4 >= 'A' && c4 <= 'F') {
                    cArr[i4] = (char) (c4 + ' ');
                }
                this.f9357c = i4 + 1;
            }
        }
        this.f9359e = i4;
        int i7 = this.f9359e;
        int i8 = this.f9358d;
        int i9 = i7 - i8;
        if (i9 < 5 || (i9 & 1) == 0) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f9355a);
        }
        int i10 = i9 / 2;
        byte[] bArr = new byte[i10];
        int i11 = i8 + 1;
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) a(i11);
            i11 += 2;
        }
        return new String(this.f9361g, this.f9358d, i9);
    }

    private String g() {
        int i4;
        int i5;
        int i6;
        int i7;
        char c4;
        char c5;
        char c6;
        int i8;
        int i9;
        char c7;
        char c8;
        while (true) {
            i4 = this.f9357c;
            i5 = this.f9356b;
            if (i4 >= i5 || this.f9361g[i4] != ' ') {
                break;
            }
            this.f9357c = i4 + 1;
        }
        if (i4 == i5) {
            return null;
        }
        this.f9358d = i4;
        this.f9357c = i4 + 1;
        while (true) {
            i6 = this.f9357c;
            i7 = this.f9356b;
            if (i6 >= i7 || (c8 = this.f9361g[i6]) == '=' || c8 == ' ') {
                break;
            }
            this.f9357c = i6 + 1;
        }
        if (i6 >= i7) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f9355a);
        }
        this.f9359e = i6;
        if (this.f9361g[i6] == ' ') {
            while (true) {
                i8 = this.f9357c;
                i9 = this.f9356b;
                if (i8 >= i9 || (c7 = this.f9361g[i8]) == '=' || c7 != ' ') {
                    break;
                }
                this.f9357c = i8 + 1;
            }
            if (this.f9361g[i8] != '=' || i8 == i9) {
                throw new IllegalStateException("Unexpected end of DN: " + this.f9355a);
            }
        }
        this.f9357c++;
        while (true) {
            int i10 = this.f9357c;
            if (i10 >= this.f9356b || this.f9361g[i10] != ' ') {
                break;
            }
            this.f9357c = i10 + 1;
        }
        int i11 = this.f9359e;
        int i12 = this.f9358d;
        if (i11 - i12 > 4) {
            char[] cArr = this.f9361g;
            if (cArr[i12 + 3] == '.' && (((c4 = cArr[i12]) == 'O' || c4 == 'o') && (((c5 = cArr[i12 + 1]) == 'I' || c5 == 'i') && ((c6 = cArr[i12 + 2]) == 'D' || c6 == 'd')))) {
                this.f9358d = i12 + 4;
            }
        }
        char[] cArr2 = this.f9361g;
        int i13 = this.f9358d;
        return new String(cArr2, i13, i11 - i13);
    }

    private String h() {
        int i4 = this.f9357c + 1;
        this.f9357c = i4;
        this.f9358d = i4;
        this.f9359e = i4;
        while (true) {
            int i5 = this.f9357c;
            if (i5 == this.f9356b) {
                throw new IllegalStateException("Unexpected end of DN: " + this.f9355a);
            }
            char[] cArr = this.f9361g;
            char c4 = cArr[i5];
            if (c4 == '\"') {
                this.f9357c = i5 + 1;
                while (true) {
                    int i6 = this.f9357c;
                    if (i6 >= this.f9356b || this.f9361g[i6] != ' ') {
                        break;
                    }
                    this.f9357c = i6 + 1;
                }
                char[] cArr2 = this.f9361g;
                int i7 = this.f9358d;
                return new String(cArr2, i7, this.f9359e - i7);
            }
            if (c4 == '\\') {
                cArr[this.f9359e] = c();
            } else {
                cArr[this.f9359e] = c4;
            }
            this.f9357c++;
            this.f9359e++;
        }
    }

    public List d(String str) {
        this.f9357c = 0;
        this.f9358d = 0;
        this.f9359e = 0;
        this.f9360f = 0;
        this.f9361g = this.f9355a.toCharArray();
        List list = Collections.EMPTY_LIST;
        String g4 = g();
        if (g4 == null) {
            return list;
        }
        do {
            int i4 = this.f9357c;
            if (i4 >= this.f9356b) {
                return list;
            }
            char c4 = this.f9361g[i4];
            String b4 = c4 != '\"' ? c4 != '#' ? (c4 == '+' || c4 == ',' || c4 == ';') ? "" : b() : f() : h();
            if (str.equalsIgnoreCase(g4)) {
                if (list.isEmpty()) {
                    list = new ArrayList();
                }
                list.add(b4);
            }
            int i5 = this.f9357c;
            if (i5 >= this.f9356b) {
                return list;
            }
            char c5 = this.f9361g[i5];
            if (c5 != ',' && c5 != ';' && c5 != '+') {
                throw new IllegalStateException("Malformed DN: " + this.f9355a);
            }
            this.f9357c = i5 + 1;
            g4 = g();
        } while (g4 != null);
        throw new IllegalStateException("Malformed DN: " + this.f9355a);
    }
}
