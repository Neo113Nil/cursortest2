package d6;

import j6.m;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.jvm.internal.s;
import kotlin.random.Random;
import kotlin.text.g;

/* loaded from: classes4.dex */
public class c extends c6.a {

    private static final class a {
        public static final a INSTANCE = new a();
        public static final Integer sdkVersion;

        static {
            Integer num;
            Object obj;
            Integer num2 = null;
            try {
                obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Throwable unused) {
            }
            if (obj instanceof Integer) {
                num = (Integer) obj;
                if (num != null && num.intValue() > 0) {
                    num2 = num;
                }
                sdkVersion = num2;
            }
            num = null;
            if (num != null) {
                num2 = num;
            }
            sdkVersion = num2;
        }

        private a() {
        }
    }

    private final boolean sdkIsNullOrAtLeast(int i8) {
        Integer num = a.sdkVersion;
        return num == null || num.intValue() >= i8;
    }

    @Override // b6.a
    public Random defaultPlatformRandom() {
        return sdkIsNullOrAtLeast(34) ? new i6.a() : super.defaultPlatformRandom();
    }

    @Override // b6.a
    public g getMatchResultNamedGroup(MatchResult matchResult, String name) {
        int start;
        int end;
        String group;
        s.checkNotNullParameter(matchResult, "matchResult");
        s.checkNotNullParameter(name, "name");
        Matcher matcher = matchResult instanceof Matcher ? (Matcher) matchResult : null;
        if (matcher == null) {
            throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
        }
        start = matcher.start(name);
        end = matcher.end(name);
        m mVar = new m(start, end - 1);
        if (mVar.getStart().intValue() < 0) {
            return null;
        }
        group = matcher.group(name);
        s.checkNotNullExpressionValue(group, "matcher.group(name)");
        return new g(group, mVar);
    }
}
