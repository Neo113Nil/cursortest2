package f2;

import android.util.Log;
import b2.AbstractC0279e;
import java.util.Arrays;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f5649d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a, reason: collision with root package name */
    public final String f5650a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5651b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5652c;

    public x(String str, String str2) {
        String str3;
        if (str2 == null || !str2.startsWith("/topics/")) {
            str3 = str2;
        } else {
            Log.w("FirebaseMessaging", "Format /topics/topic-name is deprecated. Only 'topic-name' should be used in " + str + ".");
            str3 = str2.substring(8);
        }
        if (str3 == null || !f5649d.matcher(str3).matches()) {
            throw new IllegalArgumentException(AbstractC0279e.f("Invalid topic name: ", str3, " does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}."));
        }
        this.f5650a = str3;
        this.f5651b = str;
        this.f5652c = str + "!" + str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f5650a.equals(xVar.f5650a) && this.f5651b.equals(xVar.f5651b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5651b, this.f5650a});
    }
}
