package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;
import defpackage.c21;
import defpackage.d21;
import defpackage.kk0;
import defpackage.qy0;
import defpackage.vc;
import defpackage.yy;
import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0007\u0018\u0000 \f2\u00060\u0001j\u0002`\u0002:\u0001\rB\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lkotlin/text/Regex;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "pattern", "<init>", "(Ljava/lang/String;)V", "", "input", "replacement", "replace", "(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;", "e", "c21", "kotlin-stdlib"}, k = 1, mv = {2, 2, InstallReferrerClient.InstallReferrerResponse.OK}, xi = 48)
/* loaded from: classes.dex */
public final class Regex implements Serializable {
    public static final c21 e = new c21(null);
    public final Pattern d;

    public Regex(String str) {
        str.getClass();
        Pattern compile = Pattern.compile(str);
        compile.getClass();
        compile.getClass();
        this.d = compile;
    }

    public static yy a(Regex regex, String str) {
        if (str.length() >= 0) {
            return new yy(new vc(regex, 8, str), d21.m, 1);
        }
        StringBuilder n = qy0.n("Start index out of bounds: ", 0, ", input length: ");
        n.append(str.length());
        throw new IndexOutOfBoundsException(n.toString());
    }

    public final kk0 b(String str) {
        str.getClass();
        Matcher matcher = this.d.matcher(str);
        matcher.getClass();
        if (matcher.matches()) {
            return new kk0(matcher, str);
        }
        return null;
    }

    public final boolean c(String str) {
        str.getClass();
        return this.d.matcher(str).matches();
    }

    public final String replace(CharSequence input, String replacement) {
        input.getClass();
        replacement.getClass();
        String replaceAll = this.d.matcher(input).replaceAll(replacement);
        replaceAll.getClass();
        return replaceAll;
    }

    public final String toString() {
        String pattern = this.d.toString();
        pattern.getClass();
        return pattern;
    }
}
