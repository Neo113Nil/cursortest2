package w0;

import j1.a;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o2.m0;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f22981c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a, reason: collision with root package name */
    public int f22982a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f22983b = -1;

    private boolean b(String str) {
        Matcher matcher = f22981c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            int parseInt = Integer.parseInt((String) m0.j(matcher.group(1)), 16);
            int parseInt2 = Integer.parseInt((String) m0.j(matcher.group(2)), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.f22982a = parseInt;
            this.f22983b = parseInt2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public boolean a() {
        return (this.f22982a == -1 || this.f22983b == -1) ? false : true;
    }

    public boolean c(j1.a aVar) {
        for (int i7 = 0; i7 < aVar.h(); i7++) {
            a.b g7 = aVar.g(i7);
            if (g7 instanceof o1.e) {
                o1.e eVar = (o1.e) g7;
                if ("iTunSMPB".equals(eVar.f19661h) && b(eVar.f19662i)) {
                    return true;
                }
            } else if (g7 instanceof o1.j) {
                o1.j jVar = (o1.j) g7;
                if ("com.apple.iTunes".equals(jVar.f19674g) && "iTunSMPB".equals(jVar.f19675h) && b(jVar.f19676i)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public boolean d(int i7) {
        int i8 = i7 >> 12;
        int i9 = i7 & 4095;
        if (i8 <= 0 && i9 <= 0) {
            return false;
        }
        this.f22982a = i8;
        this.f22983b = i9;
        return true;
    }
}
