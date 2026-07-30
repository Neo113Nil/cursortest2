package pl.droidsonroids.gif;

import com.google.android.gms.internal.ads.CL;
import java.io.IOException;
import java.util.Locale;

/* loaded from: classes2.dex */
public class GifIOException extends IOException {

    /* renamed from: n, reason: collision with root package name */
    public final x8.a f39851n;

    /* renamed from: u, reason: collision with root package name */
    public final String f39852u;

    public GifIOException(int i, String str) {
        x8.a aVar;
        x8.a[] values = x8.a.values();
        int length = values.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                aVar = x8.a.UNKNOWN;
                aVar.f41804u = i;
                break;
            } else {
                aVar = values[i4];
                if (aVar.f41804u == i) {
                    break;
                } else {
                    i4++;
                }
            }
        }
        this.f39851n = aVar;
        this.f39852u = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        x8.a aVar = this.f39851n;
        String str = this.f39852u;
        if (str == null) {
            aVar.getClass();
            Locale locale = Locale.ENGLISH;
            StringBuilder l9 = CL.l(aVar.f41804u, "GifError ", ": ");
            l9.append(aVar.f41803n);
            return l9.toString();
        }
        StringBuilder sb = new StringBuilder();
        aVar.getClass();
        Locale locale2 = Locale.ENGLISH;
        StringBuilder l10 = CL.l(aVar.f41804u, "GifError ", ": ");
        l10.append(aVar.f41803n);
        sb.append(l10.toString());
        sb.append(": ");
        sb.append(str);
        return sb.toString();
    }
}
