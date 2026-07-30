package kotlin.text;

import defpackage.pv;
import defpackage.up2;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class Regex implements Serializable {
    public static final a n = new a(null);
    public final Pattern m;

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class b implements Serializable {
        public static final a o = new a(null);
        private static final long serialVersionUID = 0;
        public final String m;
        public final int n;

        /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
        public static final class a {
            public a(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        public b(String str, int i) {
            str.getClass();
            this.m = str;
            this.n = i;
        }

        private final Object readResolve() {
            Pattern compile = Pattern.compile(this.m, this.n);
            compile.getClass();
            return new Regex(compile);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Regex(String str) {
        this(r1);
        str.getClass();
        Pattern compile = Pattern.compile(str);
        compile.getClass();
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        Pattern pattern = this.m;
        String pattern2 = pattern.pattern();
        pattern2.getClass();
        return new b(pattern2, pattern.flags());
    }

    public final boolean a(CharSequence charSequence) {
        charSequence.getClass();
        return this.m.matcher(charSequence).matches();
    }

    public final List b(String str) {
        str.getClass();
        int i = 0;
        up2.D(0);
        Matcher matcher = this.m.matcher(str);
        if (!matcher.find()) {
            return pv.c(str.toString());
        }
        ArrayList arrayList = new ArrayList(10);
        do {
            arrayList.add(str.subSequence(i, matcher.start()).toString());
            i = matcher.end();
        } while (matcher.find());
        arrayList.add(str.subSequence(i, str.length()).toString());
        return arrayList;
    }

    public final String replace(CharSequence charSequence, String str) {
        charSequence.getClass();
        str.getClass();
        String replaceAll = this.m.matcher(charSequence).replaceAll(str);
        replaceAll.getClass();
        return replaceAll;
    }

    public final String toString() {
        String pattern = this.m.toString();
        pattern.getClass();
        return pattern;
    }

    public Regex(Pattern pattern) {
        pattern.getClass();
        this.m = pattern;
    }
}
