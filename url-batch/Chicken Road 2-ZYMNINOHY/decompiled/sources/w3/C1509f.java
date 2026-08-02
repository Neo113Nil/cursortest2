package w3;

import java.io.Serializable;
import java.util.regex.Pattern;

/* renamed from: w3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1509f implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Pattern f15950a;

    public C1509f(String str) {
        Pattern compile = Pattern.compile(str);
        kotlin.jvm.internal.i.d(compile, "compile(...)");
        this.f15950a = compile;
    }

    public final String toString() {
        String pattern = this.f15950a.toString();
        kotlin.jvm.internal.i.d(pattern, "toString(...)");
        return pattern;
    }
}
