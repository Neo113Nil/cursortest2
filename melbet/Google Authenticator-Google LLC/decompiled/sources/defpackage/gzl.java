package defpackage;

import java.io.IOException;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class gzl {
    private final String a;

    public gzl(String str) {
        str.getClass();
        this.a = str;
    }

    public static gzl b(char c) {
        return new gzl(String.valueOf(c));
    }

    public CharSequence a(Object obj) {
        obj.getClass();
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public final String c(Iterable iterable) {
        Iterator it = iterable.iterator();
        StringBuilder sb = new StringBuilder();
        d(sb, it);
        return sb.toString();
    }

    public final void d(StringBuilder sb, Iterator it) {
        try {
            if (it.hasNext()) {
                sb.append(a(it.next()));
                while (it.hasNext()) {
                    sb.append((CharSequence) this.a);
                    sb.append(a(it.next()));
                }
            }
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public gzl(gzl gzlVar) {
        this.a = gzlVar.a;
    }
}
