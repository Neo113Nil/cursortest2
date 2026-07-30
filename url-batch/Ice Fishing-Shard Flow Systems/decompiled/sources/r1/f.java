package r1;

import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public class f extends Exception {

    /* renamed from: d, reason: collision with root package name */
    public final Status f7438d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f(Status status) {
        super(r4.toString());
        int i2 = status.f4369d;
        String str = status.f4370e;
        str = str == null ? "" : str;
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 2 + String.valueOf(str).length());
        sb.append(i2);
        sb.append(": ");
        sb.append(str);
        this.f7438d = status;
    }
}
