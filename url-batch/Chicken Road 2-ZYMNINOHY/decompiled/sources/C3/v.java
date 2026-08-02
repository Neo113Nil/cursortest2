package C3;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f320a;

    /* renamed from: b, reason: collision with root package name */
    public String f321b;

    public static v d(W.u uVar) {
        String str;
        uVar.N(2);
        int z = uVar.z();
        int i4 = z >> 1;
        int z4 = ((uVar.z() >> 3) & 31) | ((z & 1) << 5);
        if (i4 == 4 || i4 == 5 || i4 == 7 || i4 == 8) {
            str = "dvhe";
        } else if (i4 == 9) {
            str = "dvav";
        } else {
            if (i4 != 10) {
                return null;
            }
            str = "dav1";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i4 < 10 ? ".0" : ".");
        sb.append(i4);
        sb.append(z4 < 10 ? ".0" : ".");
        sb.append(z4);
        return new v(sb.toString(), 5);
    }

    public static CharSequence e(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public void a(StringBuilder sb, Iterator it) {
        try {
            if (it.hasNext()) {
                sb.append(e(it.next()));
                while (it.hasNext()) {
                    sb.append((CharSequence) this.f321b);
                    sb.append(e(it.next()));
                }
            }
        } catch (IOException e4) {
            throw new AssertionError(e4);
        }
    }

    public v b() {
        if (this.f321b != null) {
            return new v(this);
        }
        throw new IllegalArgumentException("Product type must be set");
    }

    public String c(List list) {
        Iterator it = list.iterator();
        StringBuilder sb = new StringBuilder();
        a(sb, it);
        return sb.toString();
    }

    public String toString() {
        switch (this.f320a) {
            case 0:
                return "<" + this.f321b + '>';
            default:
                return super.toString();
        }
    }

    public /* synthetic */ v(v vVar) {
        this.f320a = 4;
        this.f321b = vVar.f321b;
    }

    public /* synthetic */ v(String str, int i4) {
        this.f320a = i4;
        this.f321b = str;
    }

    public v(String str) {
        this.f320a = 6;
        str.getClass();
        this.f321b = str;
    }
}
