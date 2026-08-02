package u2;

import com.startapp.simple.bloomfilter.codec.IOUtils;

/* loaded from: classes.dex */
public final class b extends AbstractC1446a {

    /* renamed from: a, reason: collision with root package name */
    public final char f15507a;

    public b(char c4) {
        this.f15507a = c4;
    }

    @Override // u2.AbstractC1446a
    public final boolean a(char c4) {
        return c4 == this.f15507a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CharMatcher.is('");
        char[] cArr = new char[6];
        cArr[0] = IOUtils.DIR_SEPARATOR_WINDOWS;
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        char c4 = this.f15507a;
        for (int i4 = 0; i4 < 4; i4++) {
            cArr[5 - i4] = "0123456789ABCDEF".charAt(c4 & 15);
            c4 = (char) (c4 >> 4);
        }
        sb.append(String.copyValueOf(cArr));
        sb.append("')");
        return sb.toString();
    }
}
