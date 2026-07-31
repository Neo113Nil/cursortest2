package h2;

import java.io.Serializable;
import java.util.regex.Pattern;

/* renamed from: h2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0446h implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final Pattern f5078d;

    public C0446h(String str) {
        Pattern compile = Pattern.compile(str);
        Z1.i.e(compile, "compile(...)");
        this.f5078d = compile;
    }

    public final String toString() {
        String pattern = this.f5078d.toString();
        Z1.i.e(pattern, "toString(...)");
        return pattern;
    }
}
