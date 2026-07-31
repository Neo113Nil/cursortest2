package n2;

import java.io.Serializable;
import java.util.regex.Pattern;

/* renamed from: n2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0728h implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final Pattern f7369d;

    public C0728h(String str) {
        Pattern compile = Pattern.compile(str);
        f2.j.e(compile, "compile(...)");
        this.f7369d = compile;
    }

    public final String toString() {
        String pattern = this.f7369d.toString();
        f2.j.e(pattern, "toString(...)");
        return pattern;
    }
}
