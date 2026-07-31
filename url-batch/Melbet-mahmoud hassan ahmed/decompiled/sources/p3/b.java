package p3;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public class b extends Exception {

    /* renamed from: f, reason: collision with root package name */
    @RecentlyNonNull
    @Deprecated
    protected final Status f20114f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(@RecentlyNonNull Status status) {
        super(r3.toString());
        int g7 = status.g();
        String h7 = status.h() != null ? status.h() : "";
        StringBuilder sb = new StringBuilder(String.valueOf(h7).length() + 13);
        sb.append(g7);
        sb.append(": ");
        sb.append(h7);
        this.f20114f = status;
    }

    public Status a() {
        return this.f20114f;
    }

    public int b() {
        return this.f20114f.g();
    }
}
