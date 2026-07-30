package M2;

import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public class f extends Exception {

    /* renamed from: n, reason: collision with root package name */
    public final Status f1884n;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f(Status status) {
        super(r4.toString());
        int i = status.f23768n;
        String str = status.f23769u;
        str = str == null ? "" : str;
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 2 + String.valueOf(str).length());
        sb.append(i);
        sb.append(": ");
        sb.append(str);
        this.f1884n = status;
    }
}
