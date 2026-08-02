package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kud implements Serializable {
    private final Pattern a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public kud(String str) {
        this(r1);
        Pattern compile = Pattern.compile(str);
        compile.getClass();
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        Pattern pattern = this.a;
        String pattern2 = pattern.pattern();
        pattern2.getClass();
        return new kuc(pattern2, pattern.flags());
    }

    public final String a(CharSequence charSequence, String str) {
        String replaceAll = this.a.matcher(charSequence).replaceAll(str);
        replaceAll.getClass();
        return replaceAll;
    }

    public final String toString() {
        String pattern = this.a.toString();
        pattern.getClass();
        return pattern;
    }

    public kud(Pattern pattern) {
        this.a = pattern;
    }
}
