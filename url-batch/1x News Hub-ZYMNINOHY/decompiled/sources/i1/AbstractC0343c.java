package i1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: i1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0343c {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f5088a = Pattern.compile("<(head)( [^>]*)?>", 2);

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f5089b = Pattern.compile("<(head)( [^>]*)?/>", 2);

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f5090c = Pattern.compile("<(body)( [^>]*?)?>", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f5091d = Pattern.compile("<(body)( [^>]*?)?/>", 2);

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern f5092e = Pattern.compile("<(html)( [^>]*?)?>", 2);
    public static final Pattern f = Pattern.compile("<(html)( [^>]*?)?/>", 2);

    /* renamed from: g, reason: collision with root package name */
    public static final Pattern f5093g = Pattern.compile("<!DOCTYPE [^>]*>", 2);

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        r1 = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(String str, StringBuilder sb, Pattern pattern, String str2, int[][] iArr) {
        int i3;
        Matcher matcher = pattern.matcher(str);
        int i4 = 0;
        while (matcher.find(i4)) {
            int start = matcher.start();
            int end = matcher.end();
            if (iArr != null) {
                for (int[] iArr2 : iArr) {
                    i3 = (start < iArr2[0] || start > iArr2[1]) ? i3 + 1 : 0;
                }
            }
            sb.append(str.substring(0, matcher.end()));
            sb.append(str2);
            sb.append(str.substring(matcher.end()));
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        r1 = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean b(String str, StringBuilder sb, Pattern pattern, String str2, int[][] iArr) {
        int i3;
        Matcher matcher = pattern.matcher(str);
        int i4 = 0;
        while (matcher.find(i4)) {
            int start = matcher.start();
            int end = matcher.end();
            if (iArr != null) {
                for (int[] iArr2 : iArr) {
                    i3 = (start < iArr2[0] || start > iArr2[1]) ? i3 + 1 : 0;
                }
            }
            sb.append(str.substring(0, matcher.end() - 2));
            sb.append(">");
            sb.append(str2);
            sb.append("</");
            sb.append(matcher.group(1));
            sb.append(">");
            sb.append(str.substring(matcher.end()));
            return true;
        }
        return false;
    }
}
