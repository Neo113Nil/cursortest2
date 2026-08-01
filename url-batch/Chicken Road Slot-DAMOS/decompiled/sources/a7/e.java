package a7;

import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class e extends Exception {

    /* renamed from: d, reason: collision with root package name */
    public final Status f316d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e(Status status) {
        super(r4.toString());
        int i3 = status.f2119d;
        String str = status.f2120e;
        str = str == null ? "" : str;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i3).length() + 2 + String.valueOf(str).length());
        sb2.append(i3);
        sb2.append(": ");
        sb2.append(str);
        this.f316d = status;
    }
}
