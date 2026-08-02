package sqip.internal;

import android.os.Build;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import sqip.internal.HttpModule;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0019\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\u0003H\u0002J\u0014\u0010\u000f\u001a\u00020\u0003*\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lsqip/internal/SquareHeadersInterceptor;", "Lokhttp3/Interceptor;", "squareDeviceId", "", "locale", "Ljava/util/Locale;", "(Ljava/lang/String;Ljava/util/Locale;)V", "buildUserAgent", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "nowDate", "Ljava/util/Date;", "timeZoneDateString", "iso8601DateForTimeZone", "timeZone", "Ljava/util/TimeZone;", "Companion", "sqip_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SquareHeadersInterceptor implements Interceptor {
    private static final String CURRENT_SQUARE_VERSION = "2022-12-14";
    private static final SquareHeadersInterceptor$Companion$ISO_8601_FORMAT$1 ISO_8601_FORMAT = new ThreadLocal<DateFormat>() { // from class: sqip.internal.SquareHeadersInterceptor$Companion$ISO_8601_FORMAT$1
        @Override // java.lang.ThreadLocal
        public DateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US);
        }
    };
    private static final String SQUARE_VERSION_HEADER = "Square-Version";
    private static final String TIME_ZONE = "Time-Zone";
    private static final String USER_AGENT = "User-Agent";
    private final Locale locale;
    private final String squareDeviceId;

    public SquareHeadersInterceptor(@HttpModule.SquareDeviceId String str, Locale locale) {
        str.getClass();
        locale.getClass();
        this.squareDeviceId = str;
        this.locale = locale;
    }

    private final String buildUserAgent() {
        int i = Build.VERSION.SDK_INT;
        String str = Build.MANUFACTURER;
        String str2 = Build.BRAND;
        String str3 = Build.MODEL;
        Locale locale = this.locale;
        StringBuilder m = re$$ExternalSyntheticOutline0.m("com.squareup.in-app-payments-sdk/1.6.8 (Android ", i, " ", str, " ");
        Boxes$$ExternalSyntheticOutline1.m(m, str2, " ", str3, "; ");
        m.append(locale);
        m.append(")");
        return m.toString();
    }

    private final String iso8601DateForTimeZone(Date date, TimeZone timeZone) {
        DateFormat dateFormat = ISO_8601_FORMAT.get();
        dateFormat.getClass();
        DateFormat dateFormat2 = dateFormat;
        Calendar calendar = dateFormat2.getCalendar();
        Calendar calendar2 = Calendar.getInstance(timeZone);
        calendar2.getClass();
        dateFormat2.setCalendar(calendar2);
        String format2 = dateFormat2.format(date);
        dateFormat2.setCalendar(calendar);
        format2.getClass();
        return Recorder$$ExternalSyntheticOutline2.m(Boxes$$ExternalSyntheticOutline1.m1148m(2, 0, format2), ":", format2.substring(format2.length() - 2));
    }

    private final Date nowDate() {
        return new Date(System.currentTimeMillis());
    }

    private final String timeZoneDateString() {
        TimeZone timeZone = TimeZone.getDefault();
        Date nowDate = nowDate();
        timeZone.getClass();
        return Recorder$$ExternalSyntheticOutline2.m(iso8601DateForTimeZone(nowDate, timeZone), ";;", timeZone.getID());
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        chain.getClass();
        Request.Builder newBuilder = chain.request().newBuilder();
        newBuilder.header(HttpModule.UNIQUE_SQUARE_ID, this.squareDeviceId);
        newBuilder.header(SQUARE_VERSION_HEADER, CURRENT_SQUARE_VERSION);
        newBuilder.header(USER_AGENT, buildUserAgent());
        newBuilder.header(TIME_ZONE, timeZoneDateString());
        return chain.proceed(new Request(newBuilder));
    }
}
