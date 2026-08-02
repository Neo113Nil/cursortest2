package d0;

import T.G;
import android.net.Uri;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class f implements u0.p {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f8128a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

    @Override // u0.p
    public final Object u(Uri uri, Y.j jVar) {
        String readLine = new BufferedReader(new InputStreamReader(jVar, StandardCharsets.UTF_8)).readLine();
        try {
            Matcher matcher = f8128a.matcher(readLine);
            if (!matcher.matches()) {
                throw G.b("Couldn't parse timestamp: " + readLine, null);
            }
            String group = matcher.group(1);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            long time = simpleDateFormat.parse(group).getTime();
            if (!"Z".equals(matcher.group(2))) {
                long j4 = "+".equals(matcher.group(4)) ? 1L : -1L;
                long parseLong = Long.parseLong(matcher.group(5));
                String group2 = matcher.group(7);
                time -= (((parseLong * 60) + (TextUtils.isEmpty(group2) ? 0L : Long.parseLong(group2))) * 60000) * j4;
            }
            return Long.valueOf(time);
        } catch (ParseException e4) {
            throw G.b(null, e4);
        }
    }
}
